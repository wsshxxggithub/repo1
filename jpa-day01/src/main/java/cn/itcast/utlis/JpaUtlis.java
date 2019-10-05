package cn.itcast.utlis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtlis {
    private static EntityManagerFactory factory;
    static {
        factory = Persistence.createEntityManagerFactory("myJpa");
    }
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}