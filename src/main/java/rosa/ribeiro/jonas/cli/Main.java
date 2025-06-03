package rosa.ribeiro.jonas.cli;

import rosa.ribeiro.jonas.service.HttpServer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpServer teste = new HttpServer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o usuário:");
        String usuario = scanner.nextLine();

        System.out.println(teste.getBody(usuario));

    }
}