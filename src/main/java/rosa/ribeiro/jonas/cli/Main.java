    package rosa.ribeiro.jonas.cli;

    import rosa.ribeiro.jonas.dto.DataUtil;
    import rosa.ribeiro.jonas.dto.GitData;
    import rosa.ribeiro.jonas.service.GitHubService;
    import java.io.IOException;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException, InterruptedException {
            GitHubService gitHubService = new GitHubService();

            Scanner scanner = new Scanner(System.in);
            String usuario;

            if(args.length > 0) {
                usuario = args[0];
            } else {
                System.out.println("Você não passou o username como argumento!");
                System.out.print("Digite o usuário:");
                usuario = scanner.nextLine();
            }
            DataUtil.contarEventos(gitHubService.PegarAtividadesRecentes(usuario));

        }
    }


