package hoofdstuk2.opdracht1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("beerDao")
public class BeerDaoImpl implements BeerDao {
    private final static String QUERY_ID = "SELECT Name, Alcohol, Price, Stock FROM Beers WHERE Id=?";
    private final static String UPDATE_STOCK = "UPDATE Beers SET Stock = ? WHERE Id =?";
    private JdbcTemplate template;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public String getBeerById(int id) {
        Map<String, Object> result = template.queryForMap(QUERY_ID, id);
        System.out.println("test");
        return String.format("%s %s %s %s",
                result.get("name"),
                result.get("alcohol"),
                result.get("price"),
                result.get("stock"));
    }

    public void setStock(int id, int stock) {
        template.update(UPDATE_STOCK, stock, id);
    }
}
