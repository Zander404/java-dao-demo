package models.dao;

import db.DB;
import models.dao.impl.SellerDaoJBDC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJBDC(DB.getConnection());
    }
}
