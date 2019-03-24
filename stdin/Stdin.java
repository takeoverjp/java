package stdin;

import java.util.Scanner;

class Stdin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("str = " + str);
        scanner.close();
    }
}