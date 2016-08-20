package br.com.turbiani.smartmarvelapppersistence.utils;

import android.util.Log;

import java.security.MessageDigest;
import java.util.Calendar;

import br.com.turbiani.smartmarvelapppersistence.R;

/**
 * Created by lcunha on 02/08/16.
 */
public class MarvelApiUrlUtil {
    private static final String PUBLIC_KEY  = "fccbea326115e103585607c74cd115a7";
    private static final String PRIVATE_KEY = "189adee0f8cd02686a0bb5bff230cf0258fab3b1";

    public static final String BASE_URL = "http://gateway.marvel.com:80/v1/public";
    public static final String AUTH_URL = makeAuthUrl();
    public static final String GET_COMICS = BASE_URL + "/comics" + AUTH_URL;
    public static final String GET_CHARACTERS = BASE_URL + "/characters" + AUTH_URL;
    public static final String GET_EVENTS = BASE_URL + "/events" + AUTH_URL;
    public static final String GET_CREATORS = BASE_URL + "/creators" + AUTH_URL;
    public static final String GET_ALL_SERIES = BASE_URL + "/series" + AUTH_URL;
    public static final String GET_ALL_STORIES = BASE_URL + "/stories" + AUTH_URL;


    private static String makeAuthUrl(){
        long ts = Calendar.getInstance().getTimeInMillis();
        String apikey = PUBLIC_KEY;
        String hash = md5Generator(ts, PRIVATE_KEY, PUBLIC_KEY);
        StringBuffer url = new StringBuffer();
        url.append("?ts=" + ts);
        url.append("&apikey=" + apikey);
        url.append("&hash=" + hash);

        return url.toString();
    }

    private static String md5Generator(long arg1, String arg2, String arg3){
        String md5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String hash = String.valueOf(arg1) + arg2 + arg3;

            md.update(hash.getBytes());
            byte md5Hash[] = md.digest();
            StringBuilder hexString = new StringBuilder();
            for (byte b : md5Hash) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            md5 = hexString.toString();
        }catch (Exception e){
            Log.e("MD5-ERROR", e.getMessage());
        }

        return md5;
    }
}
