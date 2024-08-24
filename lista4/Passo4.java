interface AnimalIF {
    void dormir(int horas);
    void comer(int qtd);
    void moverse(int distancia);
}

abstract class AnimalAB implements AnimalIF {
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

abstract class AnimalMarinhoAB extends AnimalAB {
    public abstract void nadar(int distancia);
}

abstract class AnimalVoadorAB extends AnimalAB {
    public abstract void voar(int distancia);
}

abstract class AnimalTerrestreAB extends AnimalAB {
}

class Cachorro extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Cachorro moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("Cachorro dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Cachorro comeu %d kg\n", quantoComeu);
    }
}

class Gato extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Gato moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("Gato dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Gato comeu %d kg\n", quantoComeu);
    }
}

class Elefante extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Elefante moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("Elefante dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Elefante comeu %d kg\n", quantoComeu);
    }
}

class Leao extends AnimalTerrestreAB {
    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Leao moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("Leao dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Leao comeu %d kg\n", quantoComeu);
    }
}

class Peixe extends AnimalMarinhoAB {
    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Peixe comeu %d kg\n", quantoComeu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("Peixe dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Peixe moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void nadar(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Peixe nadou %d metros\n", distancia);
    }
}

class Pombo extends AnimalVoadorAB {
    @Override
    public void comer(int qtd) {
        quantoComeu += qtd;
        System.out.printf("Pombo comeu %d kg\n", quantoComeu);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.printf("Pombo dormiu %d horas\n", horasDormidas);
    }

    @Override
    public void moverse(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Pombo moveu-se %d metros\n", quantoSeMoveu);
    }

    @Override
    public void voar(int distancia) {
        quantoSeMoveu += distancia;
        System.out.printf("Pombo voou %d metros\n", distancia);
    }
}

public class Passo4 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Elefante elefante = new Elefante();
        Leao leao = new Leao();
        Peixe peixe = new Peixe();
        Pombo pombo = new Pombo();

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

        System.out.println("-----------------------------------------------------------------");    


        peixe.comer(2);
        peixe.nadar(50);
        peixe.dormir(5);

        System.out.println("-----------------------------------------------------------------");    


        pombo.comer(1);
        pombo.voar(100);
        pombo.dormir(8);
    }
}
