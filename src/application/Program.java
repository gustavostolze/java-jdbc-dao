package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("==== TESTE 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TESTE 2: seller findByDepartment ====");
		List<Seller> sellerList = sellerDao.findByDepartmentId(2);
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
	}
}
