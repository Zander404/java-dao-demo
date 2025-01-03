package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(5);

        System.out.println(seller);

    }
}
