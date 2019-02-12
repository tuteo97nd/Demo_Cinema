package com.dts.demo_cinema.Domain.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Setter
@Getter
@ToString
public class FindByNameMovieTheater {
    private String address;
    private String image_movietheater;
    private String name_movietheater;

    public FindByNameMovieTheater() {
    }

    public FindByNameMovieTheater(String address, String image_movietheater, String name_movietheater) {
        this.address = address;
        this.image_movietheater = image_movietheater;
        this.name_movietheater = name_movietheater;
    }

}
