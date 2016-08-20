package br.com.turbiani.smartmarvelapppersistence.repository;

import android.content.Context;
import android.util.Log;
import android.view.View;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.turbiani.smartmarvelapppersistence.entity.Comic;
import br.com.turbiani.smartmarvelapppersistence.marvelapi.MarvelRestApiInterface;
import br.com.turbiani.smartmarvelapppersistence.utils.MarvelApiUrlUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lcunha on 02/08/16.
 */
public class ComicRepository implements RepositoryInterface<Comic> {

    private static final RepositoryInterface INSTANCE = new ComicRepository();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(MarvelApiUrlUtil.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static Context context;
    private Comic comic;
    private List<Comic> comicsList = new ArrayList<>();
    public static final String TAG = "ComicRepository";

    private ComicRepository(){}

    @Override
    public List<Comic> findAll() {
        //TO-DO - Aqui terei o controle de quando buscar na internet ou quando buscar no banco de dados local
        //Por hora irei sempre buscar na internet

        MarvelRestApiInterface marvelApi = getRetrofit().create(MarvelRestApiInterface.class);
        Call<Comic> call = marvelApi.getComics(MarvelApiUrlUtil.GET_COMICS);
        call.enqueue(new Callback<Comic>() {
            @Override
            public void onResponse(Call<Comic> call, Response<Comic> response) {
                Log.e(TAG, " Lcunha response raw = " + response.raw());
                if (response.isSuccessful()) {
                    Log.e(TAG, "model response.body() " + response.body());
                    //TO-DO Agora que tenho uma instância de Comic, passar isso para tela
                    response.toString();
                }else{
                    Log.e(TAG, "model response.errorBody() " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<Comic> call, Throwable t) {
                Log.e(TAG, "Lcunha retrofit response error");
            }
        });

        return null;
    }

    @Override
    public Comic findByEntity(Comic entity) {
        return null;
    }

    public static Retrofit getRetrofit() {
        return retrofit==null ? retrofit = new Retrofit.Builder()
                .baseUrl(MarvelApiUrlUtil.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build() : retrofit;
    }

    public static RepositoryInterface getInstance(Context context){
        context = context;
        return INSTANCE==null ? new ComicRepository() : INSTANCE;
    }
}
