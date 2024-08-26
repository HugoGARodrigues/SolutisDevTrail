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

class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario() {
        super();
        this.valorProducao = 0.0;
        this.comissao = 0.0;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao; // em porcentagem
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComComissao = super.salarioBase + (valorProducao * (comissao / 100));
        return salarioComComissao - (salarioComComissao * (super.imposto / 100));
    }
}

class Vendedor extends Empregado{

    private double valorVendas;
    private double comissao;


    public Vendedor(){
        super();
        this.valorVendas = 0.0;
        this.comissao = 0.0;

    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao; // em porcentagem
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioComComissao = super.salarioBase + (valorVendas * (comissao / 100));
        return salarioComComissao - (salarioComComissao * (super.imposto / 100));
    }
    

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

}

public class Exercicio6{
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

        System.out.println("---------------------------------Operador------------------------------------------");

        Operario operario = new Operario("Pedro", "Rua C", "8888-8999", 20, 8000, 10, 10000, 15);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do setor: " + operario.getCodigoSetor());
        System.out.println("Salário base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor de produçao: " + operario.getValorProducao());
        System.out.println("Comissao: " + operario.getComissao() + "%");
        System.out.println("Salário líquido: " + operario.calcularSalarioLiquido());

        System.out.println("--------------------------------Vendedor------------------------------------------");
        
        Vendedor vendedor = new Vendedor("Maria", "Rua D", "8888-9999", 40, 10000, 5, 20000, 20);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor de vendas: " + vendedor.getValorVendas());
        System.out.println("Comissao: " + vendedor.getComissao() + "%");
        System.out.println("Salário líquido: " + vendedor.calcularSalarioLiquido());

        

        System.out.println("--------------------------------Final----------------------------------");

        pessoa = null;
        fornecedor = null;
        empregado = null;
        administrador = null;

        System.gc(); // limpa memória

    }

}




