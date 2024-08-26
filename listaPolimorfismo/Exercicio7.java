
class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBasica;

    public Funcionario(String nome, int codigoFuncional){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.0;
    }

    public double rendaTotal(){
        return this.rendaBasica;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigoFuncional(){
        return codigoFuncional;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigoFuncional(int codigoFuncional){
        this.codigoFuncional = codigoFuncional;
    }

    public void setRendaBasica(double rendaBasica){
        this.rendaBasica = rendaBasica;
    }

    public double getRendaBasica(){
        return rendaBasica;
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
}



public class Exercicio7 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsinoBasico("Funcionario 1", 1, "Santa lucia");
        funcionarios[1] = new FuncionarioEnsinoBasico("Funcionario 2", 2,"Santa lucia");
        funcionarios[2] = new FuncionarioEnsinoBasico("Funcionario 3",  3,"Santa lucia");
        funcionarios[3] = new FuncionarioEnsinoBasico("Funcionario 4",  4,"Santa lucia");

        funcionarios[4] = new FuncionarioEnsinoMedio("Funcionario 5", 5,"Santa lucia", "EMEF Agustin");
        funcionarios[5] = new FuncionarioEnsinoMedio("Funcionario 6", 6,"Santa lucia","EMEF Agustin");
        funcionarios[6] = new FuncionarioEnsinoMedio("Funcionario 7", 7,"Santa lucia","EMEF Agustin");
        funcionarios[7] = new FuncionarioEnsinoMedio("Funcionario 8", 8,"Santa lucia","EMEF Agustin");

        funcionarios[8] = new FuncionarioSuperior("Funcionario 9", 9,"Santa lucia","EMEF Agustin", "Federal");
        funcionarios[9] = new FuncionarioSuperior("Funcionario 10", 10, "Santa lucia","EMEF Agustin","Federal");

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.rendaTotal();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioSuperior) {
                custoSuperior += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += renda;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += renda;
            }
        }

        System.out.println("Custo total dos salários: " + custoTotal);
        System.out.println("Custo dos funcionários de ensino básico: " + custoBasico);
        System.out.println("Custo dos funcionários de ensino médio: " + custoMedio);
        System.out.println("Custo dos funcionários de nível superior: " + custoSuperior);
    }
}



