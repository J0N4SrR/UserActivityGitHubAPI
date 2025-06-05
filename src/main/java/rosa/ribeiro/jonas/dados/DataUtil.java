package rosa.ribeiro.jonas.dados;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    private int contaPush = 0;

    public int contarEventos(GitData[] gitData, int i){

        switch (i){
            case 1:
            for(GitData dado : gitData){
                if(dado.type().equalsIgnoreCase("PushEvent")){
                    contaPush++;
                }
            }


            case 2:
            for(GitData dado : gitData){
                if(dado.type().equalsIgnoreCase("CreateEvent")){
                    contaPush++;
                }
            }


            default:
            for(GitData dado : gitData){
                if(dado.type().equalsIgnoreCase("CreateEvent") || dado.type().equalsIgnoreCase("PushEvent")){
                    contaPush++;
                }
            }

        }
        return contaPush;
    }

    public List<String> eventosNome(GitData[] gitData){
        List<String> nome = new ArrayList<String>();

        for(GitData dado : gitData){
            if(!nome.contains(dado.actor().login())){
            nome.add(dado.actor().login());
            }
        }

        return nome;
    }
}
