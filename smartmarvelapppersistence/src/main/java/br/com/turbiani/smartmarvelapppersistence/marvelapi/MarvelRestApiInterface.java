package br.com.turbiani.smartmarvelapppersistence.marvelapi;

import java.util.List;

import br.com.turbiani.smartmarvelapppersistence.entity.Character;
import br.com.turbiani.smartmarvelapppersistence.entity.Comic;
import br.com.turbiani.smartmarvelapppersistence.entity.Creator;
import br.com.turbiani.smartmarvelapppersistence.entity.Event;
import br.com.turbiani.smartmarvelapppersistence.entity.Series;
import br.com.turbiani.smartmarvelapppersistence.entity.Stories;

/**
 * Created by lcunha on 30/07/16.
 */
public interface MarvelRestApiInterface {
    List<Character> getCharacters();
    List<Comic> getComics();
    List<Creator> getCreators();
    List<Event> getEvents();
    List<Series> getSeriesList();
    List<Stories> getStoriesList();
}
