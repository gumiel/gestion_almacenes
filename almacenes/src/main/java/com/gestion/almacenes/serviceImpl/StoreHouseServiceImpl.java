package com.gestion.almacenes.serviceImpl;

import com.gestion.almacenes.entities.StoreHouse;
import com.gestion.almacenes.repositories.StoreHouseRepository;
import com.gestion.almacenes.services.StoreHouseService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class StoreHouseServiceImpl implements
    StoreHouseService {

  private final StoreHouseRepository storeHouseRepository;
//    private final StoreHouseMapper storeHouseMapper;

  //    private static final String 'NAME_ENTITY' = SpanishEntityNameProvider.getSpanishName(StoreHouse.class.getName());
//
  @Override
  public List<StoreHouse> getAll() {
    return storeHouseRepository.findAll();
  }
//
//    @Override
//    public StoreHouse create(StoreHouseDto storeHousedto) {
//
//        if (storeHouseRepository.existsByCodeAndActiveIsTrue(storeHousedto.getCode())) {
//            throw new DuplicateException("StoreHouse", "code");
//        }
//
//        StoreHouse storeHouse = storeHouseMapper.fromDto(storeHousedto, null);
//        return storeHouseRepository.save(storeHouse);
//    }
//
//    @Override
//    public StoreHouse update(Integer id, StoreHouseDto storeHousedto) {
//        StoreHouse storeHouseFound = this.findStoreHouseById(id);
//        if (storeHouseRepository.existsByCodeAndIdNotAndActiveIsTrue(storeHousedto.getCode(), storeHouseFound.getId())) {
//            throw new DuplicateException("StoreHouse", "code");
//        }
//        StoreHouse storeHouse = storeHouseMapper.fromDto(storeHousedto, storeHouseFound);
//        //storeHouse.setId(id);
//        return storeHouseRepository.save(storeHouse);
//    }
//
//    @Override
//    public StoreHouse getById(Integer id) {
//        return this.findStoreHouseById(id);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        StoreHouse storeHouse = this.findStoreHouseById(id);
//        if(storeHouse.getActive()){
//            storeHouse.setActive(false);
//            storeHouseRepository.save(storeHouse);
//        }else{
//            throw new AlreadyDeletedException("StoreHouse", storeHouse.getId());
//        }
//    }
//
//    @Override
//    public List<StoreHouse> getFiltered(String code, String name) {
//
//        Specification<StoreHouse> spec = this.createSpecificationFilterFields(code, name);
//        return storeHouseRepository.findAll(spec);
//    }
//    @Override
//    public PagePojo<StoreHouse> getByPageAndFilters(Integer pageNumber, Integer pageSize, String sortField, String sortOrder, String code, String name) {
//
//        Sort sort = Sort.by(Sort.Direction.fromString(sortOrder), sortField);
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
//
//        Specification<StoreHouse> spec = this.createSpecificationFilterFields(code, name);
//
//        Page<StoreHouse> storeHousePage = storeHouseRepository.findAll(spec, pageable);
//
//        return storeHouseMapper.fromEntity(storeHousePage);
//    }
//
//    private Specification<StoreHouse> createSpecificationFilterFields(String code, String name){
//      FieldsFilterUtil fields = new FieldsFilterUtil();
//
//      fields.addLikeField("code", code);
//      fields.addLikeField("name", name);
//
//      fields.addEqualsField("active", true);
//
//      return SpecificationUtils.createSpecification(fields.getFilterFields());
//    }
//
//    private StoreHouse findStoreHouseById(Integer id){
//        return storeHouseRepository.findByIdAndActiveIsTrue(id).orElseThrow(
//                () -> new EntityNotFoundException("StoreHouse", id)
//        );
//    }
//
//    @Override
//    protected GenericRepository<StoreHouse, Integer> getRepository() {
//
//        return storeHouseRepository;
//    }
}
