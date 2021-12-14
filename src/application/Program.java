package application;

import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDaoJDBC teste = new SellerDaoJDBC(DB.getConnection());
		
		Seller seller = teste.findById(3);
		
		System.out.print(seller);
	}

}
