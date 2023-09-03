package de.startat.springdatajdbc;

import de.startat.springdatajdbc.book.SimpleBook;
import de.startat.springdatajdbc.book.SimpleBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class SpringDataJdbcApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataJdbcApplication.class, args);
  }


  private final SimpleBookRepository simpleBookRepository;

  SpringDataJdbcApplication(SimpleBookRepository simpleBookRepository) {
    this.simpleBookRepository = simpleBookRepository;
  }

  @Override
  public void run(String... args) {
    System.out.println(simpleBookRepository.findAll());
    SimpleBook sb = new SimpleBook("abcdef-123", "My great first book", "Aron DiCelduin",42);
    System.out.println(simpleBookRepository.save(sb));
    System.out.println(simpleBookRepository.findAll());
  }
}
