import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherService {
    private static final String API_KEY = "bff19f1da2f73a1fd7bfa43361f70afe";
    private static final String BASE_URL = "http://api.weatherapi.com/v1/current.json";