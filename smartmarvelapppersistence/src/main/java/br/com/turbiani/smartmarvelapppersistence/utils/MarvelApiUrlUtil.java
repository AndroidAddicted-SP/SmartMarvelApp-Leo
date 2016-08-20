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

    public static final String BASE_URL = "http://gateway.marvel.com:80/";
    public static final String AUTH_URL = makeAuthUrl();
    public static final String GET_COMICS = "v1/public/comics" + AUTH_URL;
    public static final String GET_CHARACTERS = "v1/public/characters" + AUTH_URL;
    public static final String GET_EVENTS = "v1/public/events" + AUTH_URL;
    public static final String GET_CREATORS = "v1/public/creators" + AUTH_URL;
    public static final String GET_ALL_SERIES = "v1/public/series" + AUTH_URL;
    public static final String GET_ALL_STORIES = "v1/public/stories" + AUTH_URL;


    private static String makeAuthUrl(){
        int ts = 1;
        String apikey = PUBLIC_KEY;
        String hash = md5Generator(ts, PRIVATE_KEY, PUBLIC_KEY);
        StringBuffer url = new StringBuffer();
        url.append("?ts=1");
        url.append("&apikey=fccbea326115e103585607c74cd115a7");
        url.append("&hash=3dd2bee5ae6631201ad17514a112814f");
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
