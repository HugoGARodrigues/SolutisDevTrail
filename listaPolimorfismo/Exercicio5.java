class Funcionario{
    protected String nome;
    protected int codigoFuncional;

    public Funcionario(String nome, int codigoFuncional){
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
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


}

class FuncionarioSemEstudo extends Funcionario{

    public FuncionarioSemEstudo(String nome, int codigoFuncional){
        super(nome, codigoFuncional);
    }

}

class FuncionarioEnsinoBasico extends Funcionario{
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico){
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }
}

class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio){
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }
    

}

class FuncionarioSuperior extends FuncionarioEnsinoMedio{
    private String universidade;

    public FuncionarioSuperior(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, String universidade){
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }
}

public class Exercicio5 {
    
}
