package hoofdstuk2.opdracht1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeerApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BeerApp.class, args);
        BeerDao beerDAO = ctx.getBean("beerDao", BeerDao.class);
        System.out.println(beerDAO.getBeerById(20));
        beerDAO.setStock(10, 200);
    }
}
