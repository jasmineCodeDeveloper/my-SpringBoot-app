package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Repository  //bu sınıf bir dataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {
	//daha global tanım
	ArrayList<Brand> brands;
	
	
	public InMemoryBrandRepository() {
		//boş bir array var gibi düşünebiliriz
		brands=new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Audio"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault"));
		
	}


	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
