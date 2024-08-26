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

public class Exercicio9 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jose", 1);
        Supervisor supervisor = new Supervisor("Joao", 2);
        Vendedor vendedor = new Vendedor("Maria", 3);

        System.out.println("Gerente salário: " + gerente.rendaTotal());
        System.out.println("Supervisor salário: " + supervisor.rendaTotal());
        System.out.println("Vendedor salário: " + vendedor.rendaTotal());
    }
}
