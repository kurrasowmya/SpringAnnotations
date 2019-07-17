package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MovieConfiguration.class);
        Movie movie = annotationConfigApplicationContext.getBean("movie1", Movie.class);
        movie.display();
        Movie movie1= annotationConfigApplicationContext.getBean("movie2", Movie.class);
        movie1.display();


    }
}