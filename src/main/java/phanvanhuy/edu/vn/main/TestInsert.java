package phanvanhuy.edu.vn.main;

import phanvanhuy.edu.vn.dao.ProductDAOImpl;
import phanvanhuy.edu.vn.entity.Product;

public class TestInsert {
	public static void main(String[] args) {
		Product p = new Product();
		p.setMaSP("P0005");
		p.setTenSanPham("Kệ để giày");
		p.setAnhSanPham("P0005.jpg");
		p.setSoLuong(150);
		p.setDonGia(1990000d);
		
		boolean flag = new ProductDAOImpl().insertProduct(p);
		if(flag == true) {
			System.out.printf("Thêm mới thành công !!!");
		}else {
			System.out.printf("Xảy ra lỗi khi thêm mới sản phẩm :))");
		}
	}
}
