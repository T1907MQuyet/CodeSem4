package example.model;

import example.da.ProductDataAccess;
import example.entity.Product;
import example.da.ProductDataAccess;
import example.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductFinderBean {
    public List<Product> getAllProduct()throws SQLException, ClassNotFoundException
    {
        return new ProductDataAccess().getAllProduct();
    }
}
