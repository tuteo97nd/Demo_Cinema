package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import org.springframework.data.repository.CrudRepository;

public interface MovieTheaterRepo extends CrudRepository<MovietheaterEntity, Integer> {
}
