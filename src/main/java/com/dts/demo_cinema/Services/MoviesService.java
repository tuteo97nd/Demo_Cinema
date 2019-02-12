package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Entity.MoviesEntity;

import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.MovieRequest;
import com.dts.demo_cinema.Repositories.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService implements BaseService<MoviesEntity>{
//    @Autowired
//    private MoviesReponsitory moviesReponsitory;
//
    @Autowired
    private MovieRepositoryInterface movieRepositoryInterface;
//
//    public List<MoviesMappingScreening> findScreen(String id_movie,String id_movietheater){
//        return moviesReponsitory.findScreen(id_movie,id_movietheater);
//    }
//    public List<MovieMappMovieTheater> findmovitheater(String name_movie){
//        return moviesReponsitory.findMovietheater(name_movie);
//    }
//    public List<MoviesMappingSeat> findSeat(String id_movie, String id_movietheater){
//        return moviesReponsitory.findSeat(id_movie,id_movietheater);
//    }
    public void createMovie(MovieRequest request){
        Reponse baseReponse = new Reponse();
        try {
            MoviesEntity moviesEntity = new MoviesEntity();
            moviesEntity.setIdMovie(request.getIdMovie());
            moviesEntity.setNameMovie(request.getNameMovie());
            moviesEntity.setDescriptionMovie(request.getDescriptionMovie());
            moviesEntity.setTrailer(request.getTrailer());
            moviesEntity.setIdActor(request.getIdActor());
            moviesEntity.setIdDirector(request.getIdDirector());
            moviesEntity.setIdCategory(request.getIdCategory());
            moviesEntity.setAgeWatch(request.getAgeWatch());
            moviesEntity.setDateStart(request.getDateStart());
            moviesEntity.setDuration(request.getDuration());
            moviesEntity.setLanguage(request.getLanguage());
            save(moviesEntity);
        }catch (Exception e){
            baseReponse.server_err();
        }
    }


    @Override
    public void save(MoviesEntity moviesEntity) {
        movieRepositoryInterface.save(moviesEntity);
    }

    @Override
    public List<MoviesEntity> findAll() {
        return movieRepositoryInterface.findAll();
    }

    @Override
    public MoviesEntity findById(Integer id) {
            Optional<MoviesEntity> optionalMoviesEntity = movieRepositoryInterface.findById(id);
            if (optionalMoviesEntity.isPresent()){
                optionalMoviesEntity.get();
            }
            return null;
    }

    public Reponse updateById(MovieRequest request){
        Reponse baseReponse = new Reponse();
        try {
            MoviesEntity moviesEntity = findById(request.getIdMovie());
            if (moviesEntity != null){
                moviesEntity.getIdMovie();
                moviesEntity.setNameMovie(request.getNameMovie());
                moviesEntity.setDescriptionMovie(request.getDescriptionMovie());
                moviesEntity.setTrailer(request.getTrailer());
                moviesEntity.setIdActor(request.getIdActor());
                moviesEntity.setIdDirector(request.getIdDirector());
                moviesEntity.setIdCategory(request.getIdCategory());
                moviesEntity.setAgeWatch(request.getAgeWatch());
                moviesEntity.setDateStart(request.getDateStart());
                moviesEntity.setDuration(request.getDuration());
                moviesEntity.setLanguage(request.getLanguage());
                save(moviesEntity);
            }
        }catch (Exception e){
            baseReponse.server_err();
        }
        return baseReponse;
    }
}