public class PetMachine {
    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower(){
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho.");
            return;
        }

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " esta limpo!");

    }

    public void addWater(){
        if (water == 30) {
            System.out.println("A capacidade da água esta no máximo.");
            return;
        }

        water += 2; 
    }

        public void addShampoo(){
        if (shampoo == 10) {
            System.out.println("A capacidade da shampoo esta no máximo.");
            return;
        }

        shampoo += 2; 
    }


}
