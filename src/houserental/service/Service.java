package houserental.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import houserental.dto.User;

public class Service {
	
	public User registrationService() {
		
		
		
		
		return null;
		
	}
	
	
	

	public User logInService(User user) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<User> query = entityManager.createQuery("from User where email=:email and password=:password",
					User.class);
			query.setParameter("email", user.getEmail());
			query.setParameter("password", user.getPassword());
			return query.getSingleResult();
		} catch (Exception ex) {
			return null;
		}

	}

}
