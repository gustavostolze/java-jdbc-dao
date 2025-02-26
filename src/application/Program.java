package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== TESTE 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TESTE 2: seller findByDepartment ====");
		List<Seller> sellerList = sellerDao.findByDepartmentId(2);
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TESTE 3: seller findAll ====");
		sellerList = sellerDao.findAll();
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TESTE 3: seller findAll ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(3, null));
	
		// sellerDao.insert(newSeller);
		
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n==== TESTE 4: seller update ====");
		seller = sellerDao.findById(2);
		seller.setName("BIG JORGE");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		System.out.println("\n==== TESTE 5: seller delete ====");
		System.out.print("Type a seller id to be deleted: ");
		sellerDao.deleteById(sc.nextInt());
		System.out.println("Deleted!!");
		sc.close();
	}
}
