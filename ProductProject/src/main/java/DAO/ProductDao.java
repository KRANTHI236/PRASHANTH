package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.ProductDto;

public class ProductDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public ProductDto insertProduct(ProductDto productDto) {

		et.begin();
		em.persist(productDto);
		et.commit();
		return productDto;
	}

	public List<ProductDto> getAllProducts() {

		Query q = em.createQuery("SELECT p from ProductDto p");
		List<ProductDto> productDto = q.getResultList();
		return productDto;

	}

	public ProductDto getProductById(int id) {
		return em.find(ProductDto.class, id);

	}

	public boolean deleteProduct(int id) {

		ProductDto productDto = em.find(ProductDto.class, id);

		if (productDto != null) {
			et.begin();
			em.remove(productDto);
			et.commit();
			return true;

		}
		return false;

	}

}
