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



public class Exercicio6 {
    public static void main(String[] args) {
        
        FuncionarioSemEstudo funcionarioSemEstudo = new FuncionarioSemEstudo("Funcionario 0", 0);
        FuncionarioEnsinoBasico funcionarioBasico = new FuncionarioEnsinoBasico("Funcionario 1", 1, "Santa lucia");
        FuncionarioEnsinoMedio funcionarioMedio = new FuncionarioEnsinoMedio("Funcionario 7", 7,"Santa lucia","EMEF Agustin");
        FuncionarioSuperior funcionarioSuperior = new FuncionarioSuperior("Funcionario 9", 9,"Santa lucia","EMEF Agustin", "Federal");

        System.out.println("Salário do Funcionario sem estuda "+ funcionarioSemEstudo.rendaTotal());
        System.out.println("Salário do Funcionario Ensino Básico "+ funcionarioBasico.rendaTotal());
        System.out.println("Salário do Funcionario Ensino Médio "+ funcionarioMedio.rendaTotal());
        System.out.println("Salário do Funcionario Superior "+ funcionarioSuperior.rendaTotal());
    }
}