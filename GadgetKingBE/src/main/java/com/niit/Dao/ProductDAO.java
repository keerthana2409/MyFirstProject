package com.niit.Dao;
import java.util.List;



public interface ProductDAO {
	void addProduct(ProductDAO product);
	ProductDAO getProduct(int id);
	void deleteProduct(ProductDAO id);
	void updateProduct(ProductDAO id);
	List<ProductDAO>getAllProducts();
	List<ProductDAO>getAllProducts(String category);
	void saveorUpdate(ProductDAO product);
//	List<Category>getAllCategories();

}
