package ksmybatis.admin.products.service;

import java.util.List;

import ksmybatis.admin.products.domain.Products;

public interface ProductsService {
	
//	int addProduct()

	// 상품목록 조회
	List<Products> getProductList();

}
