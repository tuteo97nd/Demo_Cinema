package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Request.MovieRequest;
import com.dts.demo_cinema.Services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MoviesService moviesService;

    @PostMapping("/create")
    public String createMovie(@RequestBody MovieRequest request){
        moviesService.createMovie(request);
        return "OK";
    }

    @PutMapping("/update")
    public String updateMovie(@RequestBody MovieRequest request){
        moviesService.updateById(request);
        return "OK";
    }
}
