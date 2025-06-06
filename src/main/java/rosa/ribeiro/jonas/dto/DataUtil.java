package rosa.ribeiro.jonas.dto;

import rosa.ribeiro.jonas.service.GitHubService;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static void contarEventos(GitData[] gitData){
        String mensagemPushevent = "",mensagemCreatevent ="",mensagemWatchevent="", mensagemDefault = "";

        for(GitData dado : gitData){
            String opc = dado.type().toLowerCase();
            switch (opc){
                case "pushevent":

                    mensagemPushevent = "\n" + String.format("- Pushed %d commits to %s", dado.payload().commits().size(), dado.repo().name());
                    System.out.printf(mensagemPushevent);
                    break;

                case "createevent":
                    mensagemCreatevent = "\n" + String.format("- Opened a new issue in %s", dado.repo().name());
                    System.out.printf(mensagemCreatevent);
                    break;

                case "watchevent":
                    mensagemWatchevent = "\n" + String.format("- Starred %s", dado.repo().name());
                    System.out.printf(mensagemWatchevent);
                    break;

                default:
                    mensagemDefault = "\n" + String.format("- %s - %s", dado.type(), dado.repo().name());
                    System.out.printf(mensagemDefault);
                    break;
            }
        }


    }

}
