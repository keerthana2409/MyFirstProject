package com.niit.Dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.Category;


@Repository
@Transactional

public class ProductDAOImpl implements ProductDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public ProductDAOImpl()
	{
		System.out.println("Product Dao Impl bean is created");
	}

	public void addProduct(ProductDAO product)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	public ProductDAO getProduct(int id)
	{
		Session session = sessionFactory.getCurrentSession();
		ProductDAO product = (ProductDAO)session.get(ProductDAO.class, id);
		return product;
	}

	public void deleteProduct(int id) 
	{
		Session session = sessionFactory.getCurrentSession();
		ProductDAO product = (ProductDAO)session.get(ProductDAO.class, id);
		session.delete(product);
	}
	public void update(ProductDAO product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.update(product);
		
	}

	public List<ProductDAO> getAllProducts() 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Product");
		List<ProductDAO> products =query.list();
		return products;
	}

	public void saveOrUpdate(ProductDAO product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
	}

	public List<ProductDAO> getCategoryProducts(String category)
	{
		Session session=sessionFactory.getCurrentSession();
		String s1="'"+category+"'";
		Query query=session.createQuery("from Product where category.CategoryName = "+s1);
		List<ProductDAO> products =query.list();
		return products;
	}

	public List<Category> getAllCategories() 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> categories =query.list();
		return categories;
	}

	public void deleteProduct(ProductDAO id) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(ProductDAO id) {
		// TODO Auto-generated method stub
		
	}

	public List<ProductDAO> getAllProducts(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveorUpdate(ProductDAO product) {
		// TODO Auto-generated method stub
		
	}
}
