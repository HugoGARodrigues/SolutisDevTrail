interface AnimalIF {
    void dormir(int horas);
    void comer(int qtd);
    void moverse(int distancia);
    void tipoAnimal();
    void habitat();
    void altura(double altura);
    void peso(double peso);
    void setNome(String nome);
    String getNome();
}

abstract class AnimalAB implements AnimalIF {
    protected int quantoComeu;
    protected int horasDormidas;
    protected int quantoSeMoveu;
    protected String nome;
    protected int idade;

    public AnimalAB() {
        this.quantoComeu = 0;
        this.horasDormidas = 0;
        this.quantoSeMoveu = 0;
        this.nome = "";
    }

    @Override
    public abstract void peso(double peso);
    @Override
    public abstract void altura(double altura);
    @Override
    public abstract void habitat();
    @Override
    public abstract void tipoAnimal();

    @Override
    public abstract void comer(int qtd);

    @Override
    public abstract void moverse(int distancia);

    @Override
    public abstract void dormir(int horas);

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getQuantoComeu() {
        return quantoComeu;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public int getQuantoSeMoveu() {
        return quantoSeMoveu;
    }
}

abstract class AnimalMarinhoAB extends AnimalAB {
    public abstract void nadar(int distancia);
}

abstract class AnimalVoadorAB extends AnimalAB {
    public abstract void voar(int distancia);
    public abstract void quantidadeDePatas();
    public abstract void quantidadeDeAsas(int asas);
    public abstract void envergaduraAsas(double asas);
}

abstract class AnimalTerrestreAB extends AnimalAB {
    public abstract void quantidadeDePatas();
}

class Cachorro extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s moveu-se %d metros\n", getNome(), quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("%s dormiu %d horas\n", getNome(), horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("%s comeu %d kg\n", getNome(), quantoComeu);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal tipo Terrestre");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Doméstico");
    }

    @Override
    public void quantidadeDePatas() {
        System.out.println("Quantidade de patas: 4");
    }

    @Override
    public void altura(double altura) {
        System.out.println("A altura do cachorro é de: " + altura + " metros");
    }

    @Override
    public void peso(double peso) {
        System.out.println("O peso do cachorro é de: " + peso + " kilos");
    }
}

class Gato extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s moveu-se %d metros\n", getNome(), quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("%s dormiu %d horas\n", getNome(), horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("%s comeu %d kg\n", getNome(), quantoComeu);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal tipo Terrestre");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Doméstico");
    }

    @Override
    public void quantidadeDePatas() {
        System.out.println("Quantidade de patas: 4");
    }

    @Override
    public void altura(double altura) {
        System.out.println("A altura do gato é de: " + altura + " metros");
    }

    @Override
    public void peso(double peso) {
        System.out.println("O peso do gato é de: " + peso + " kilos");
    }
}

class Elefante extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s moveu-se %d metros\n", getNome(), quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("%s dormiu %d horas\n", getNome(), horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("%s comeu %d kg\n", getNome(), quantoComeu);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal tipo Terrestre");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Savana");
    }

    @Override
    public void quantidadeDePatas() {
        System.out.println("Quantidade de patas: 4");
    }

    @Override
    public void altura(double altura) {
        System.out.println("A altura do elefante é de: " + altura + " metros");
    }

    @Override
    public void peso(double peso) {
        System.out.println("O peso do elefante é de: " + peso + " kilos");
    }
}

class Leao extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s moveu-se %d metros\n", getNome(), quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("%s dormiu %d horas\n", getNome(), horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("%s comeu %d kg\n", getNome(), quantoComeu);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal tipo Terrestre");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Savana");
    }

    @Override
    public void quantidadeDePatas() {
        System.out.println("Quantidade de patas: 4");
    }

    @Override
    public void altura(double altura) {
        System.out.println("A altura do leão é de: " + altura + " metros");
    }

    @Override
    public void peso(double peso) {
        System.out.println("O peso do leão é de: " + peso + " kilos");
    }
}

class Peixe extends AnimalMarinhoAB {
    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("%s comeu %d kg\n", getNome(), quantoComeu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("%s dormiu %d horas\n", getNome(), horasDormidas);
    }

    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s moveu-se %d metros\n", getNome(), quantoSeMoveu);
    }

    @Override
    public void nadar(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s nadou %d metros\n", getNome(), distancia);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal tipo Marinho");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Mar");
    }

    @Override
    public void altura(double altura) {
        System.out.println("A altura do peixe é de: " + altura + " metros");
    }

    @Override
    public void peso(double peso) {
        System.out.println("O peso do peixe é de: " + peso + " kilos");
    }
}

class Pombo extends AnimalVoadorAB {
    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("%s comeu %d kg\n", getNome(), quantoComeu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("%s dormiu %d horas\n", getNome(), horasDormidas);
    }

    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s moveu-se %d metros\n", getNome(), quantoSeMoveu);
    }

    @Override
    public void voar(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("%s voou %d metros\n", getNome(), distancia);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal tipo Voador");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Urbano");
    }

    @Override
    public void quantidadeDePatas(){
        System.out.println("Quantidade de patas: 2");
    }

    @Override
    public void altura(double altura) {
        System.out.println("A altura do pombo é de: " + altura + " metros");
    }
    
    @Override
    public void peso(double peso) {
        System.out.println("O peso do pombo é de: " + peso + " kilos");
    }

    @Override
    public void quantidadeDeAsas(int asas){
        System.out.println("Quantidade de asas: " + asas);
    }

    @Override
    public void envergaduraAsas(double envergadura){
        System.out.println("Envergadura das asas: " + envergadura + " metros");
    }
}


public class Passo5 {
        public static void main(String[] args) {
            Cachorro cachorro = new Cachorro();
            Gato gato = new Gato();
            Elefante elefante = new Elefante();
            Leao leao = new Leao();
            Peixe peixe = new Peixe();
            Pombo pombo = new Pombo();
    
            cachorro.setNome("Toby");
            cachorro.comer(5);
            cachorro.moverse(100);
            cachorro.dormir(8);
            cachorro.tipoAnimal();
            cachorro.habitat();
            cachorro.quantidadeDePatas();
            cachorro.altura(0.6);
            cachorro.peso(30);
    
            System.out.println("-----------------------------------------------------------------");

            gato.setNome("Rodolfo");
            gato.comer(3);
            gato.moverse(50);
            gato.dormir(12);
            gato.tipoAnimal();
            gato.habitat();
            gato.quantidadeDePatas();
            gato.altura(0.4);
            gato.peso(5);
    
            System.out.println("-----------------------------------------------------------------");

            elefante.setNome("Efalante");
            elefante.comer(7);
            elefante.moverse(200);
            elefante.dormir(16);
            elefante.tipoAnimal();
            elefante.habitat();
            elefante.quantidadeDePatas();
            elefante.altura(3.0);
            elefante.peso(5000);
    
            System.out.println("-----------------------------------------------------------------");

            leao.setNome("Aslan");
            leao.comer(10);
            leao.moverse(300);
            leao.dormir(24);
            leao.tipoAnimal();
            leao.habitat();
            leao.quantidadeDePatas();
            leao.altura(1.2);
            leao.peso(190);
    
            System.out.println("-----------------------------------------------------------------");    

            peixe.setNome("Continue a nadar");
            peixe.comer(2);
            peixe.nadar(50);
            peixe.dormir(5);
            peixe.tipoAnimal();
            peixe.habitat();
            peixe.altura(0.2);
            peixe.peso(0.5);
    
            System.out.println("-----------------------------------------------------------------");
    
            pombo.setNome("Pomboide");
            pombo.comer(1);
            pombo.voar(100);
            pombo.dormir(8);
            pombo.tipoAnimal();
            pombo.habitat();
            pombo.quantidadeDePatas();
            pombo.altura(0.3);
            pombo.peso(0.4);
            pombo.quantidadeDeAsas(2);
            pombo.envergaduraAsas(0.8);
        }
}

