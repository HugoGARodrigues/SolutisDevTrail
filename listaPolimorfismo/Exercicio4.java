import java.util.ArrayList;
import java.util.List;

class AnimalAB {
    protected String nome;
    protected int idade;
    
    public AnimalAB(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Emitindo som...");
    }

    public void correr() {
        System.out.println("Este animal nao corre.");
    };

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}

class Veterinario extends AnimalAB {
    
    public Veterinario(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("O Veterinario está examinando... ");
    }

    public void examinar(AnimalAB animal){
        this.emitirSom();
        animal.emitirSom();
    }
}

class Cachorro extends AnimalAB {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void correr(){
        System.out.println("Cachorro está correndo...");
    }

    @Override
    public void emitirSom(){
        System.out.println("O Cachorro está latindo");
    }
}

class Cavalo extends AnimalAB{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void correr(){
        System.out.println("Cavalo está correndo...");
    }

    @Override
    public void emitirSom(){
        System.out.println("O Cavalo está relinchando!");
    }
}

class Preguica extends AnimalAB{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirArvore(){
        System.out.println("Preguiça está subindo árvore...");
    }

    @Override
    public void emitirSom(){
        System.out.println("A Preguiça está chorando...");
    }

    @Override
    public void correr() {
        System.out.println("A Preguiça nao corre, mas sobe em árvores.");
    }
}

class Zoologico {
    private AnimalAB[] jaulasList;

    public Zoologico() {
        jaulasList = new AnimalAB[10];
    }

    public void adicionarAnimal(int index, AnimalAB animal){
        if (index >= 0 && index < jaulasList.length){
            jaulasList[index] = animal;
        } else {
            System.out.println("Essa jaula não existe, limite de jaula = 10.");
        }
    }

    public void percorrerJaulas(){
        for(AnimalAB animal : jaulasList){
            if(animal != null){
                animal.emitirSom();
                animal.correr();
            }
        }
    }
}

public class Exercicio4 {

    public static void main(String[] args){
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0,new Cachorro("Toto", 5));
        zoologico.adicionarAnimal(1,new Cavalo("Trovao", 9));
        zoologico.adicionarAnimal(2,new Preguica("Sid", 10));
        zoologico.adicionarAnimal(3,new Cachorro("Billy", 1));
        zoologico.adicionarAnimal(4,new Cavalo("Zap", 8));
        zoologico.adicionarAnimal(5,new Preguica("Sonin", 6));
        zoologico.adicionarAnimal(6,new Cachorro("Cheetara", 7));
        zoologico.adicionarAnimal(7,new Cavalo("Trovoada", 4));
        zoologico.adicionarAnimal(8,new Preguica("Sesta", 2));
        zoologico.adicionarAnimal(9,new Cachorro("Totozin", 3));

        zoologico.percorrerJaulas();
    }
}
