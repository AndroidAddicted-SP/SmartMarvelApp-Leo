package br.com.turbiani.smartmarvelapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import br.com.turbiani.smartmarvelapp.R;
import br.com.turbiani.smartmarvelapppersistence.entity.Comic;
import br.com.turbiani.smartmarvelapppersistence.repository.ComicRepository;
import br.com.turbiani.smartmarvelapppersistence.repository.RepositoryInterface;

public class MainActivity extends AppCompatActivity {

    private RepositoryInterface<Comic> comicRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        comicRepository = ComicRepository.getInstance(this.getApplicationContext());
        List<Comic> comics = comicRepository.findAll();
    }
}
