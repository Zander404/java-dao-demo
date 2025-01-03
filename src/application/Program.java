package application;

import models.entities.Department;
import models.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args){
        Department d = new Department(1, "Books");
        Seller s = new Seller(1, "Bob", "bob@bob.com", new Date(), 1400.00, d);
        System.out.println(s);
    }
}
