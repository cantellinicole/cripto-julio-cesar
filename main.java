import org.apache.codec;
import org.json; 

public class desafioCriptografia {

    public void main(String Args[]) {
        criaRequisicao();
    }

    public void criaRequisicao() {
        String url = https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=223c63df5d63d59ab8db6731dd5dc9b61d8eb2f5

        HttpClient client = new HttpClient();
        HttpMethod method = new GetMethod(url);
        client.executeMethod(method)
        String stringAnswer = new String(method.getResponseBody());
        geraSha1ParaResposta(stringAnswer);
    }

    public void geraSha1ParaResposta(String answer) {
        String cripto = DigestUtils.sha1Hex(answer);
        converteParaJson(cripto);
    }

    public void converteParaJson(String cripto) {
        JsonObject json = new JsonObject();
        json = cripto.
    }
}