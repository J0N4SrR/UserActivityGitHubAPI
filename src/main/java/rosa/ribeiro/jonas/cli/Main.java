    package rosa.ribeiro.jonas.cli;

    import rosa.ribeiro.jonas.dados.GitData;
    import rosa.ribeiro.jonas.service.GitHubService;
    import java.io.IOException;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException, InterruptedException {
            GitHubService gitHubService = new GitHubService();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o usuário:");
            String usuario = scanner.nextLine();

            for(GitData dado : gitHubService.PegarAtividadesRecentes(usuario)){
                System.out.println(dado);
            }
        }
    }
