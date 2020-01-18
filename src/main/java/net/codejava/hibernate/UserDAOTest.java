package net.codejava.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDAOTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
		EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
		

		
		/*
		 * User newUser = new User(); newUser.setEmail("souravkumardas6225@gmail.com");
		 * newUser.setFullname("Sourav Kumar Das"); newUser.setPassword("dd");
		 * entityManager.persist(newUser);
		 */
		 
		
		
		/*
		 * User existingUser = new User(); existingUser.setId(7);
		 * existingUser.setEmail("souravlinsyssoft@gmail.com");
		 * existingUser.setFullname("Sourav Kumar");
		 * existingUser.setPassword("sourav123"); entityManager.merge(existingUser);
		 */
		 
		 
		
		
		
		/*
		 * Integer primaryKey = 6; User reference
		 * =entityManager.getReference(User.class, primaryKey);
		 * entityManager.remove(reference);
		 */
		  
		 
		
		/*
		 * Integer primaryKey = 7; User user =
		 * entityManager.find(User.class,primaryKey);
		 * System.out.println(user.getEmail()); System.out.println(user.getFullname());
		 * System.out.println(user.getPassword());
		 */
		 
		
		  String sql = "SELECT u from User u where u.email = 'souravlinsyssoft@gmail.com'";
		  Query query = entityManager.createQuery(sql);
		  User user = (User)query.getSingleResult();
		  System.out.println(user.getEmail()); 
		  System.out.println(user.getFullname());
		  System.out.println(user.getPassword());
		 
		
		  entityManager.getTransaction().commit();
          entityManager.close();
		  factory.close();

	}

}
