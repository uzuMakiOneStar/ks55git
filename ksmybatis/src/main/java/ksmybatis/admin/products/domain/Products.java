package ksmybatis.admin.products.domain;

import lombok.Data;

@Data
public class Products {
	private String prodCode;
	private String vendCode;
	private String prodName; 
	private int prodUntprc;
	private String prodRegDate;
}
