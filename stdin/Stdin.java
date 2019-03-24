package stdin;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Stdin {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in);) {
        String str = scanner.nextLine();
        System.out.println("str = " + str);
        } catch (IllegalStateException | NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}