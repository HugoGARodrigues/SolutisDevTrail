package listaHerancas;

class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(){

        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }

    public Pessoa(String nome, String endereco){

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = "Pessoa sem numero de telefone";
    }
    
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
}
    


    class Fornecedor extends Pessoa{

        private double valorCredito;
        private double valorDivida ;

        public Fornecedor(){
            super();
            this.valorCredito = 0.0;
            this.valorDivida = 0.0;

        }
        
        public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
            super(nome, endereco, telefone);
            this.valorCredito = valorCredito;
            this.valorDivida = valorDivida;
        }

        
        
        public double obterSaldo(){
            return valorCredito - valorDivida;
        }
       
       
        public double getValorCredito() {
            return valorCredito ;
        }
        
        public double getValorDivida() {
            return valorDivida ;
        }
        
        
        
        public void setValorDivida(double divida) {
            this.valorDivida = divida; ;
        }

        public void setValorCredito(double credito) {
            this.valorCredito = credito;
        }


}


public class Exercicio2{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Hugo", "Rua A", "9999-9999");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        System.out.println("-----------------Fornecedor---------------------");

        Fornecedor fornecedor = new Fornecedor("Joao", "Rua B", "8888-8888", 5000, 2000);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }

}


