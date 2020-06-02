package restAssured.PostRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.*;
import java.util.Map;

public class PostRequest {

    public void createUserUsingApi(Map<String, String> createUserMap, String url) throws IOException {

        HttpResponse response = null;
        HttpPost httpPost=null;

        //Convert Map to JSON
        ObjectMapper objectMapper=new ObjectMapper();
        String jsonResp = objectMapper.writeValueAsString(createUserMap);
        StringEntity stringEntity=new StringEntity(jsonResp);

        DefaultHttpClient httpClient = new DefaultHttpClient();
        httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.setEntity(stringEntity);

        response = httpClient.execute(httpPost);
        System.out.println("---------------------------------------------------------------"+response.getStatusLine());
        System.out.println("Status Code      -->"+response.getStatusLine().getStatusCode());
        System.out.println("Reason Phrase    -->"+response.getStatusLine().getReasonPhrase());
        System.out.println("Protocol Version -->"+response.getStatusLine().getProtocolVersion());
        System.out.println("Response         -->\n"+response.getEntity().getContent().toString());
        int line ;
        InputStream entity=response.getEntity().getContent();
        StringBuffer buffer = new StringBuffer();
        while((line = entity.read())!=-1){
            buffer.append((char)line);
        }
        System.out.println("Raw Response \n"+buffer);
    }
}