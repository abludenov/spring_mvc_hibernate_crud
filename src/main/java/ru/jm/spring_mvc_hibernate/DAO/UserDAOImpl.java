package ru.jm.spring_mvc_hibernate.DAO;

import org.springframework.stereotype.Repository;
import ru.jm.spring_mvc_hibernate.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(final User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(final int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(final int id) {
        Query query = entityManager.createQuery("delete from User " +
                "where id=:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }
}
