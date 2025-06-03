package rosa.ribeiro.jonas.cli;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o usuário:");
        String usuario = scanner.nextLine();
        System.out.println(usuario);

    }
}