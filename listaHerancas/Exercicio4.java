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

class Empregado extends Pessoa{
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado(){
        super();
        this.codigoSetor = 0;
        this.salarioBase = 0.0;
        this.imposto = 0.0;
    }
    
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalarioLiquido(){
        return salarioBase - (salarioBase * (imposto/100));
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}

class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(){
        super();
        this.ajudaDeCusto = 0.0;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        
    }
    
    @Override
    public double calcularSalarioLiquido(){
        return super.calcularSalarioLiquido() + ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }



}


public class Exercicio4{
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

        System.out.println("-----------------Empregado---------------------");

        Empregado empregado = new Empregado("Joaquim", "Rua B", "8888-8889", 32, 5000, 10);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário líquido: " + empregado.calcularSalarioLiquido());

        System.out.println("-----------------Administrador---------------------");

        Administrador administrador = new Administrador("Manoel", "Rua j", "8888-8899", 10, 10000, 10, 2000);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do setor: " + administrador.getCodigoSetor());
        System.out.println("Salário base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário líquido: " + administrador.calcularSalarioLiquido());
        

        System.out.println("--------------------------------Final----------------------------------");

        pessoa = null;
        fornecedor = null;
        empregado = null;
        administrador = null;

        System.gc(); // limpa memória

    }

}




