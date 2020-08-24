
package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Message;

public class FirstLevelCacheDemo {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");

		//First-level Caching
		/*
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Message message1 = em.find(Message.class, 1L);
		System.out.println("test");
		Message message2 = em.find(Message.class, 1L);

		em.getTransaction().commit();
		em.close();
		
		 */

		// Is First-level Caching still going work? nope
		
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();

		Message message1 = em1.find(Message.class, 1L);

		em1.getTransaction().commit();
		em1.close();

		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();

		Message message2 = em2.find(Message.class, 1L);

		em2.getTransaction().commit();
		em2.close();
		

	}
}
















