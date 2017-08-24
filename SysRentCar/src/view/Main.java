package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Cliente;
import entities.Endereco;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SysRentCar");
		EntityManager manager = emf.createEntityManager();
		
		Endereco endereco = new Endereco("Rua Ali", "Bairro Qualquer", "01", "Ap101", "12345-000", "Aquidauana", "MS");
		Cliente cliente = new Cliente("Teste", 12345, "8520", "7410", 123654789, "aew@aew.com", endereco);
		
		manager.getTransaction().begin();
		manager.persist(endereco);
		manager.persist(cliente);
		manager.getTransaction().commit();
		manager.close();
		
	}

}
