package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abtracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

//restfull yapılar için contorller olduğunu anlatmamız gerekiyor
@RestController // annotation tanımı
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;
	@Autowired
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandService.getAll();
}
}