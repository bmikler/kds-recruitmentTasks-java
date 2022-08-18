package task3;

import org.springframework.web.client.RestTemplate;

public class Main {

    private final static String URL = "https://jsonplaceholder.typicode.com/posts";

    public static String getPosts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, String.class);
    }

    public static void main(String[] args) {
        System.out.println(getPosts());
    }
}
