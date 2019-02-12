package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.CreateMovietheater;
import com.dts.demo_cinema.Domain.Request.DeleteMovieTheater;
import com.dts.demo_cinema.Domain.Request.FindByNameMovieTheater;
import com.dts.demo_cinema.Domain.Request.UpdateMovieTheater;
import com.dts.demo_cinema.Services.MTheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movietheater")
public class MovieTheaterController {
    @Autowired
    private MTheaterService mTheaterService;
    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse CreateMovieTheater(@RequestBody CreateMovietheater request){
        return  mTheaterService.CreateMovieTheater(request);
    }
    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse UpdateMovieTheater(@RequestBody UpdateMovieTheater request){
        return mTheaterService.UpdataMovieTheater(request);
    }
    @DeleteMapping(value = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse DeleteMovieTheater(@RequestBody DeleteMovieTheater request){
        return mTheaterService.DeleteMovieTheater(request);
    }
    @GetMapping(value = "/findAll", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MovietheaterEntity> findAll(){
        return mTheaterService.findAll();
    }

    @GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MovietheaterEntity findById(@PathVariable("id") int id) {
        return mTheaterService.findById(id);
    }

    @GetMapping("/namemovietheater/{name_movietheater}")
    public List<FindByNameMovieTheater> findmovitheater(@PathVariable("name_movietheater") String name_movietheater){
        return mTheaterService.findMovieTheaterByName(name_movietheater);
    }

}
