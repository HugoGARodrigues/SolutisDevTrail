

class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBasica;
    protected double comissao = 0.0;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.0;
    }
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Comissao: R$" + this.comissao + ", Salário Total: R$" + this.rendaTotal();
    }

    public double rendaTotal() {
        return this.rendaBasica + this.comissao;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

class FuncionarioSemEstudo extends Funcionario {
    public FuncionarioSemEstudo(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }
}

class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
        this.rendaBasica += this.rendaBasica * 0.1;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }
}

class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
        this.rendaBasica += this.rendaBasica * 0.5;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }
}

class FuncionarioSuperior extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioSuperior(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
        this.rendaBasica += this.rendaBasica;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = 1500.0;
    }
}

class Supervisor extends Funcionario {
    public Supervisor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = 600.0;
    }
}

class Vendedor extends Funcionario {
    public Vendedor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = 250.0;
    }
}

public class Exercicio11 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Gerente("Gerente", 1);

        funcionarios[1] = new Supervisor("Supervisor 1", 2);
        funcionarios[2] = new Supervisor("Supervisor 2", 3);


        funcionarios[3] = new Vendedor("Vendedor 1", 4);
        funcionarios[4] = new Vendedor("Vendedor 2", 5);
        funcionarios[5] = new Vendedor("Vendedor 3", 6);
        funcionarios[6] = new Vendedor("Vendedor 4", 7);
        funcionarios[7] = new Vendedor("Vendedor 5", 8);
        funcionarios[8] = new Vendedor("Vendedor 6", 9);
        funcionarios[9] = new Vendedor("Vendedor 7", 0);

        double custoTotal = 0;
        double custoGerente = 0;
        double custoSupervisor = 0;
        double custoVendedor = 0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.rendaTotal();
            custoTotal += renda;
            System.out.println(funcionario.toString()); 

            if (funcionario instanceof Gerente) {
                custoGerente += renda;
            } else if (funcionario instanceof Supervisor) {
                custoSupervisor += renda;
            } else if (funcionario instanceof Vendedor) {
                custoVendedor += renda;
            }
        }

        System.out.println("Custo total dos salários: " + custoTotal);
        System.out.println("Custo dos funcionários de Gerente: " + custoGerente);
        System.out.println("Custo dos funcionários de Supervisor: " + custoSupervisor); //
        System.out.println("Custo dos funcionários de Vendedor: " + custoVendedor);
    }
}





