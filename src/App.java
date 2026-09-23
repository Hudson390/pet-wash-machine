import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        
        
        var option = -1;    

        do{
            System.out.println("=== Escolha uma das opções: ===");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Abaster a máquina com água");
            System.out.println("3 - Abaster a máquina com shampoo");
            System.out.println("4 - Verificar água na máquina");
            System.out.println("5 - Verificar shampoo ná máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt(); 
            
            switch (option) {
                case 6 -> checkIfHasPetInMachine(); 
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
            
            }

        } while (option != 0);
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do seu pet: ");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);

        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");

    }

}
