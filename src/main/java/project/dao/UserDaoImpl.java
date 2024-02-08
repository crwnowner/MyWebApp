package project.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import project.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Component
@Transactional
public class UserDaoImpl implements UserDao {
    @PersistenceContext

    private EntityManager entityManager;


    public void add(User user) {
        entityManager.persist(user);
    }

    public List<User> index() {
        return entityManager.createQuery(
                "SELECT user FROM User user", User.class).getResultList();
    }

    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    public void delete(int id) {
        User userToDelete = entityManager.find(User.class, id);
        if (userToDelete != null) {
            entityManager.remove(userToDelete);
        }
    }

    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);
        if (userToBeUpdated != null) {
            userToBeUpdated.setName(updatedUser.getName());
            userToBeUpdated.setSurname(updatedUser.getSurname());
            userToBeUpdated.setAge(updatedUser.getAge());
        }
    }

}
