interface Passo3 {
    void dormir(int horas);
    void comer(int qtd);
    void moverse(int distancia);
}

abstract class AnimalAB implements Passo3 {
    protected int quantoComeu;
    protected int horasDormidas;
    protected int quantoSeMoveu;

    public AnimalAB() {
        this.quantoComeu = 0;
        this.horasDormidas = 0;
        this.quantoSeMoveu = 0;
    }

    @Override
    public abstract void comer(int qtd);

    @Override
    public abstract void moverse(int distancia);

    @Override
    public abstract void dormir(int horas);

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

class Cachorro extends AnimalAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Cachorro moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int qtd) {
        horasDormidas += qtd;
        System.out.printf("Cachorro dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Cachorro comeu %d kg\n", quantoComeu);
    }
}

class Gato extends AnimalAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Gato moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int qtd) {
        horasDormidas += qtd;
        System.out.printf("Gato dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Gato comeu %d kg\n", quantoComeu);
    }
}

class Elefante extends AnimalAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Elefante moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int qtd) {
        horasDormidas += qtd;
        System.out.printf("Elefante dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Elefante comeu %d kg\n", quantoComeu);
    }
}

class Leao extends AnimalAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Leao moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int qtd) {
        horasDormidas += qtd;
        System.out.printf("Leao dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Leao comeu %d kg\n", quantoComeu);
    }
}

public class Passo3{
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Elefante elefante = new Elefante();
        Leao leao = new Leao();

        cachorro.comer(5);
        cachorro.moverse(100);
        cachorro.dormir(8);

        System.out.println("-----------------------------------------------------------------");    


        gato.comer(3);
        gato.moverse(50);
        gato.dormir(12);

        System.out.println("-----------------------------------------------------------------");    


        elefante.comer(7);
        elefante.moverse(200);
        elefante.dormir(16);

        System.out.println("-----------------------------------------------------------------");    


        leao.comer(10);
        leao.moverse(300);
        leao.dormir(24);
    }
}
