package lista4;

public class Passo2 {

    public interface AnimalIF{
       
        boolean dormir();
        boolean comer();
        boolean moverse();
        


    }

    public abstract class AnimalAB implements AnimalIF {

        @Override
        public boolean comer() {
            return true;
        }

        @Override
        public boolean moverse() {
            return true;
        }
        @Override
        public boolean dormir() {
            return true;
        }
    }

    
    
}
