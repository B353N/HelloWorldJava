import java.util.Scanner;

class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}