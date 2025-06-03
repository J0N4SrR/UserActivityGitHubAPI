package rosa.ribeiro.jonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    private static ObjectMapper objectMapper = getObjectMapper();

    private static ObjectMapper getObjectMapper(){
        ObjectMapper objMap = new ObjectMapper();
        return objMap;
    }

    



}
