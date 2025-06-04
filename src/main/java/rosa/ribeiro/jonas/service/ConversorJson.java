package rosa.ribeiro.jonas.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import rosa.ribeiro.jonas.dados.GitData;


public class ConversorJson {
    private final ObjectMapper objectMapper = getObjectMapper();

    private ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }

    public ConversorJson() {
    }

    public GitData[] GitDataParaJson(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, GitData[].class);
    }



}
