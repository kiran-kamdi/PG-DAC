package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repository.MovieRepository;

@Service // Marks this class as a Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepositoryRef;

	public Collection<Movie> getAllMovies() {
		Collection<Movie> allmovies = movieRepositoryRef.findAll();
		return allmovies;
	}

	public Movie getOneMovie(Integer id) {
		
		Movie foundmovie=null;
		Optional<Movie> opt = movieRepositoryRef.findById(id);
		if(!opt.isEmpty())
			foundmovie=opt.get();
		return foundmovie;
	}

	public void addNewMovie(Movie movieRef) {
		movieRepositoryRef.save(movieRef);
	}

	public void deleteOneMovie(Integer id) {

		movieRepositoryRef.deleteById(id);
	}

}
