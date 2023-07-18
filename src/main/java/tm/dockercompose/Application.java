package tm.dockercompose;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tm.dockercompose.model.Post;
import tm.dockercompose.repository.PostRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository repository) {
        return args -> repository.save(new Post("Hello world", "My first blog post"));
    }

}
