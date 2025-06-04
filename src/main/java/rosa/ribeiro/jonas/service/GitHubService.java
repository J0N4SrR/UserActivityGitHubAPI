package rosa.ribeiro.jonas.service;

import rosa.ribeiro.jonas.dados.GitData;

import java.io.IOException;

public class GitHubService {
     private final ConversorJson conversorJson;
     private final HttpClientGitHub httpClientGitHub;

    public GitHubService() {
        this.conversorJson = new ConversorJson();
        this.httpClientGitHub = new HttpClientGitHub();
    }

    public GitData[] PegarAtividadesRecentes(String name) throws IOException, InterruptedException {
        String json = httpClientGitHub.getBody(name);
        if(json == null){
            return new GitData[0];
        }
        return conversorJson.GitDataParaJson(json);

    }


}
