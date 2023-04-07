package dev.kharkhalisvaleria.spacebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    //DB access methods
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
