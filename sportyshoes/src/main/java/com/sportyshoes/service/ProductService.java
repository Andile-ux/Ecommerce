package main.java.com.sportyshoes.service;

import com.sportyshoes.dao.ProductDAO;
import com.sportyshoes.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public Product getProductById(Long productId) {
        return productDAO.getProductById(productId);
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    public void updateProduct(Long productId, Product updatedProduct) {
        productDAO.updateProduct(productId, updatedProduct);
    }

    public void deleteProduct(Long productId) {
        productDAO.deleteProduct(productId);
    }
}
