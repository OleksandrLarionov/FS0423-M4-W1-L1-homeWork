import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inzerisci il tre strighe da tastiera ");
        String uno = scanner.nextLine();
        String due = scanner.nextLine();
        String tre = scanner.nextLine();
        System.out.println("Le parole inserite nel loro ordine sono: " + uno + " " + " " + due + " " + tre);
        System.out.println("Le parole inserite nel loro ordine inverso sono: " + tre + " " + " " + due + " " + uno);
        String result = uno + " " + due + " " + tre;
        String[] newArr = result.split(" ");
        for (int i = newArr.length - 1; i >= 0; i--) {
            System.out.println(newArr[i]);
        }
        scanner.close();
    }
}
