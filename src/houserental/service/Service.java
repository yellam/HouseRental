package houserental.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import houserental.dto.RentalHouse;
import houserental.dto.User;

public class Service {
	
	public User registrationService(User user) {
		EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		EntityTransaction transcation=entityManager.getTransaction();
		try {
			transcation.begin();
			entityManager.persist(user);
			transcation.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}finally {
			entityManager.close();
			entityManagerFactor.close();
		}
		return user;	
	}

	public User logInService(String email, String password) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<User> query = entityManager.createQuery("from User where email=:email and password=:password",
					User.class);
			query.setParameter("email", email);
			query.setParameter("password", password);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}
	public RentalHouse addHouseRentalService(RentalHouse addHouseRental) {
		EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		EntityTransaction transcation=entityManager.getTransaction();
		try {
			transcation.begin();
			entityManager.persist(addHouseRental);
			transcation.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}finally {
			entityManager.close();
			entityManagerFactor.close();
		}
		return addHouseRental;
	}
	/*public RentalHouse userDetailsService(RentalHouse rental) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<RentalHouse> query = entityManager.createQuery("from AddHouseRental where userId=:userId",
					RentalHouse.class);
			query.setParameter("userId",rental.getUserId());
			query.setParameter("house",rental.getHouse());
			query.setParameter("squareFeet",rental.getSquareFeet());
			query.setParameter("rentalCost",rental.getRentalCost());
			query.setParameter("parkingAvaliable",rental.getParkingAvaliable());
			query.setParameter("garden",rental.getGarden());
			query.setParameter("address",rental.getAddress());
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}*/
	
	
	public List<RentalHouse> getHouses(Integer userId){
		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<RentalHouse> query = entityManager.createQuery("from RentalHouse where user_Id=:user_Id",
					RentalHouse.class);
			
			query.setParameter("user_Id", userId);
			
			return query.getResultList();
			
		} catch (Exception e) {
			return null;
		}
		
	}
	

}
