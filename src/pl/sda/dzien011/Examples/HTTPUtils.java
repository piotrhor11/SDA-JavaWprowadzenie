package pl.sda.dzien011.Examples;

/**
 * Created by sp0rk on 11/07/17.
 */
public class HTTPUtils {
    private static final String BASE_URL = "http.cat/";

    public static byte[] getData(String url) {
        byte[] data = new byte[100];

        String requestUrl = BASE_URL + url;

        //Get data, do some stuff

        return data;
    }
}
