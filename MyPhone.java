import java.util.Scanner;

public class MyPhone {
    static boolean isClosed = false;
    static String answer;
    static Phone phoneOfChoice;
    
    public static void main(String[] args) {
        Phone Samsung = new Samsung();
        Phone Xiaomi = new Xiaomi();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------- Pilih HP ---------");
        System.out.println("1. Xiaomi" );
        System.out.println("2. Samsung");
        System.out.println("-----------------------------");
        
        System.out.print("Pilih menu : ");
        answer = input.next();
        
        switch(answer) {
            case "1":
                phoneOfChoice = Xiaomi;
                break;
            case "2":
                phoneOfChoice = Samsung;
                break;
            default:
                System.out.println("Wrong input number");
        }
        
        PhoneUser sam = new PhoneUser(phoneOfChoice);
        while(!isClosed) {
            System.out.println("--------- Main Menu ---------");
            System.out.println("1. Nyalakan Handphone");
            System.out.println("2. Matikan Handphone");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Perkecil Volume");
            System.out.println("5. Keluar Program");
            System.out.println("-----------------------------");
            
            System.out.print("Pilih menu : ");
            answer = input.next();
            
            switch(answer) {
                case "1":
                    sam.turnOn();
                    break;
                case "2":
                    sam.turnOff();
                    break;
                case "3":
                    sam.makeFullVolume();
                    break;
                case "4":
                    sam.makeSilentVolume();
                    break;
                case "5":
                    isClosed = true;
                    break;
                default:
                    System.out.println("Wrong input number");
            }
        }
    }
}
