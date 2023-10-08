import java.util.Scanner;

class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scanner.nextLine();
        System.out.println("How old are you ?");
        String age = scanner.nextLine();

        System.out.println("Hello " + name + " You are " + age + " years old!");
    }
}