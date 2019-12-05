package hoofdstuk2.opdracht1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeerApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BeerApp.class, args);
        BeerRepository beerRepository = ctx.getBean("beerRepository", BeerRepository.class);
        Beer beer = beerRepository.getBeerById(20);
        System.out.println(beer);
    }
}
