package hoofdstuk2.opdracht1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BeerDaoTest {
    @Autowired
    private BeerDao beerDao;

    @Test
    public void testGetBeerById() {
        String beer = beerDao.getBeerById(1);
        Assertions.assertEquals("TestBeer 7.0 2.75 100", beer);
    }
}
