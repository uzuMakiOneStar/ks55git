package ksmybatis.admin.vendors.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmybatis.admin.vendors.domain.Vendors;
import ksmybatis.admin.vendors.service.VendorsService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/admin/vendors")
@RequiredArgsConstructor
public class VendorsController {
	
	private final VendorsService vendorsService;
	
	@GetMapping("/vendorsList")
	public String vendorsListView(Model model) {
		
		List<Vendors> vendorsList = vendorsService.getVendorsList();
		
		model.addAttribute("title", "판매처목록조회");
		model.addAttribute("vendorsList", vendorsList);
		
		return "/admin/vendors/vendorsListView";
	}
}
