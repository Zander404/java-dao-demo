package models.dao;

import models.dao.impl.SellerDaoJBDC;

public class DaoFactory {

    public static SellerDao createSellDao(){
        return new SellerDaoJBDC();
    }
}
