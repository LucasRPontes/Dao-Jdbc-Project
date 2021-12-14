package application;

import java.util.Date;

import model_entities.Department;
import model_entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(3, "dev");
		Seller seller = new Seller(21, "lucas", "a@a.com", new Date(), 3500.0, obj);
		System.out.print(seller);
	}

}
