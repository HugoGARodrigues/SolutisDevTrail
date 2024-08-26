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
    


    public class Exercicio1{
        public static void main(String[] args) {

            Pessoa pessoa = new Pessoa("Hugo", "Rua das Flores, 123");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Endereço: " + pessoa.getEndereco());
            System.out.println("Telefone: " + pessoa.getTelefone());

    }
}


