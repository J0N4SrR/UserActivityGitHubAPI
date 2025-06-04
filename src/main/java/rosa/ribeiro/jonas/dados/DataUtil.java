package rosa.ribeiro.jonas.dados;

public class DataUtil {
    private static int contaPush = 0;

    public static int contarPush(GitData[] gitData){
        for(GitData dado : gitData){
            if(dado.getType().equalsIgnoreCase("PushEvent")){
                contaPush++;
            }
        }
        return contaPush;
    }

    

}
