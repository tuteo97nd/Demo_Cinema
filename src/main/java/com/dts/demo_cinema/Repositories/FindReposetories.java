package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Request.FindByNameMovieTheater;
import com.dts.demo_cinema.Domain.Request.MoviesMappingSeat;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;
@Repository
public class FindReposetories extends BaseRepository {
    public List<FindByNameMovieTheater> findMovieTheaterByName(String name_movietheater) {
        List<FindByNameMovieTheater> MovieTheater = null;
        String sql = "select team2_movietheater.address,team2_movietheater.image_movietheater,team2_movietheater.name_movietheater from team2_movietheater where team2_movietheater.name_movietheater like %:name_movietheater%";
        Query query = entityManager.createNativeQuery(sql, "FindByNameMovieTheater");
        query.setParameter("name_movietheater", name_movietheater);
        MovieTheater = query.getResultList();
        return MovieTheater;
    }

}
