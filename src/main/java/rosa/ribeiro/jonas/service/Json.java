package rosa.ribeiro.jonas.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import static rosa.ribeiro.jonas.service.HttpServer.getBody;


public class Json {
    private static final ObjectMapper objectMapper = getObjectMapper();

    private static ObjectMapper getObjectMapper(){
        ObjectMapper objMap = new ObjectMapper();
        return objMap;
    }

    public static GitData StringToJson(String uri) throws IOException, InterruptedException {
        return objectMapper.readValue(getBody(uri), GitData.class);
    }









}
