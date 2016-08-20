package br.com.turbiani.smartmarvelapppersistence.marvelapi;

import java.util.List;

import br.com.turbiani.smartmarvelapppersistence.entity.Character;
import br.com.turbiani.smartmarvelapppersistence.entity.Comic;
import br.com.turbiani.smartmarvelapppersistence.entity.Creator;
import br.com.turbiani.smartmarvelapppersistence.entity.Event;
import br.com.turbiani.smartmarvelapppersistence.entity.Series;
import br.com.turbiani.smartmarvelapppersistence.entity.Stories;
import retrofit2.http.GET;
import retrofit2.http.Url;
import retrofit2.Call;

/**
 * Created by lcunha on 30/07/16.
 */
public interface MarvelRestApiInterface {
    @GET
    Call<Character> getCharacters();
    @GET
    Call<Comic> getComics(@Url String url);
    @GET
    Call<Creator> getCreators();
    @GET
    Call<Event> getEvents();
    @GET
    Call<Series> getSeriesList();
    @GET
    Call<Stories> getStoriesList();
}
