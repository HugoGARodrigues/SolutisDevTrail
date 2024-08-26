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
        System.out.println("Este animal não corre.");
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
        System.out.println("Preguiça não corre, mas sobe em árvores.");
    }
}




public class Exercicio3 {

    public static void main(String[] args){
        AnimalAB cachorro = new Cachorro("Toto", 7);
        AnimalAB cavalo = new Cavalo("Trovao", 5);
        AnimalAB preguica = new Preguica("Preguica", 3);
        Veterinario veterinario = new Veterinario("Dr. Vet", 40);

        List<AnimalAB> animals = new ArrayList<>();
        animals.add(cachorro);
        animals.add(cavalo);
        animals.add(preguica);

        for (AnimalAB animal : animals){
            veterinario.examinar(animal);
                }
    }

}
