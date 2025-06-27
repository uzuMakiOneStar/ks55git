package ksmybatis.admin.vendors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.vendors.domain.Vendors;

@Mapper
public interface VendorsMapper {
	// 판매자 거래처 삭제
	int removeVendorsBySellerId(String sellerId);

	List<Vendors> getVendorsList();
}
