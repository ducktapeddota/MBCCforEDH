package mbcc;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ScryfallQuery {
    private static ScryfallQuery queryInstance = null;
    private String data;

    public ScryfallQuery() throws Exception {
        data = sendGet();
    }

    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    private String sendGet() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.scryfall.com/cards/search?as=text&order=name&q=type%3Aland+commander%3AWR+legal%3Acommander"))
                .setHeader("User-Agent", "Java 16 MBCC Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // print status code
        System.out.println(response.statusCode());

        // print response body
        //System.out.println(response.body());
        return response.body();
    }

    public static ScryfallQuery getInstance() throws Exception {
        if (queryInstance == null) {
            queryInstance = new ScryfallQuery();
        }

        return queryInstance;
    }

    public String getData() {
        return data;
    }
}
