package hoofdstuk2.opdracht1;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository("beerRepository")
public class BeerRepositoryImpl implements BeerRepository {
    private EntityManagerFactory entityManagerFactory;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public Beer getBeerById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Beer beer = entityManager.find(Beer.class, id);
            entityTransaction.commit();
            return beer;
        } catch (Exception e) {
            entityTransaction.rollback();
            throw e;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    public List<Beer> getBeerByAlcohol(float alcohol) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            List<Beer> list;
            for (list: int i) {

            }
            return list;
        } catch (Exception e) {
            entityTransaction.rollback();
            throw e;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
}
