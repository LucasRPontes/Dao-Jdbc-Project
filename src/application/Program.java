package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(3, "dev");
		Seller seller = new Seller(21, "lucas", "a@a.com", new Date(), 3500.0, obj);
		System.out.print(seller);
	}

}
