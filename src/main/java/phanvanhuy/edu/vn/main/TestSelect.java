package phanvanhuy.edu.vn.main;

import java.util.List;

import phanvanhuy.edu.vn.dao.ProductDAOImpl;
import phanvanhuy.edu.vn.entity.Product;

public class TestSelect {
	public static void main(String[] args) {
		List<Product> list = new ProductDAOImpl().getAllProduct();
		if(list == null) 
			return;
		for(Product item:list) {
			System.out.printf("\n%-10s", item.getMaSP());
			System.out.printf("%-15s", item.getTenSanPham());
			System.out.printf("% 15d", item.getSoLuong());
			System.out.printf("% 15.0f", item.getDonGia());
		}
	}
}
