import java.util.Scanner;
class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Number of characters = " + str.length());
    }
}
OUTPUT:
Enter a string: JAVA PROGRAM
Number of characters = 12
