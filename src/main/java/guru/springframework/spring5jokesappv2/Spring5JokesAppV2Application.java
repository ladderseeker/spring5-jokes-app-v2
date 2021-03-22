package guru.springframework.spring5jokesappv2;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5JokesAppV2Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5JokesAppV2Application.class, args);
        JokeService jokeService = (JokeService) ctx.getBean("jokeServiceImpl");
        System.out.println(jokeService.getJoke());
    }

}
