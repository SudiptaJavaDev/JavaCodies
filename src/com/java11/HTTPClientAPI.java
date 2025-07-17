package com.java11;

/*
Java 11 introduced a new HTTP Client API that simplifies the process of creating and sending HTTP requests.
This API is part of the java.net.http package and provides a more modern and
flexible way to handle HTTP communication compared to the older HttpURLConnection.
The new HTTP Client API supports both synchronous and asynchronous operations,
making it versatile for various use cases. It also supports HTTP/1.1 and HTTP/2,
providing better performance and resource utilization.
*/

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HTTPClientAPI {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }
}
