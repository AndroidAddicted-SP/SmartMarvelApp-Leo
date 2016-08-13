package br.com.turbiani.smartmarvelapppersistence.marvelapi;

import java.util.List;

import br.com.turbiani.smartmarvelapppersistence.entity.Character;
import br.com.turbiani.smartmarvelapppersistence.entity.Comic;
import br.com.turbiani.smartmarvelapppersistence.entity.Creator;
import br.com.turbiani.smartmarvelapppersistence.entity.Event;
import br.com.turbiani.smartmarvelapppersistence.entity.Series;
import br.com.turbiani.smartmarvelapppersistence.entity.Stories;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by lcunha on 06/08/16.
 */
public class MarvelRestApiImpl implements MarvelRestApiInterface {
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();

    private static MarvelRestApiInterface instance = new MarvelRestApiImpl();

    private MarvelRestApiImpl(){}

    public static MarvelRestApiInterface getInstance(){
        if (retrofit==null)
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .build();

        return instance;
    }
    @Override
    public List<Character> getCharacters() {
        return null;
    }

    @Override
    @GET("users/{user}/repos")
    public List<Comic> getComics() {
        return null;
    }

    @Override
    public List<Creator> getCreators() {
        return null;
    }

    @Override
    public List<Event> getEvents() {
        return null;
    }

    @Override
    public List<Series> getSeriesList() {
        return null;
    }

    @Override
    public List<Stories> getStoriesList() {
        return null;
    }
}
