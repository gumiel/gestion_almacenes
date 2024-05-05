package com.gestion.almacenes.controllers;

import com.gestion.almacenes.entities.StoreHouse;
import com.gestion.almacenes.services.StoreHouseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/storeHouse")
@Tag(name = "StoreHouseController")
public class StoreHouseController {

  private final StoreHouseService storeHouseService;
  //private final ReportManager reportManager;

  @GetMapping
  public ResponseEntity<List<StoreHouse>> getAll() {
    List<StoreHouse> storeHouses = storeHouseService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(storeHouses);
  }
//
//    @PostMapping
//    public ResponseEntity<StoreHouse> create(@Valid @RequestBody StoreHouseDto dto) {
//        StoreHouse storeHouseSaved = storeHouseService.create(dto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(storeHouseSaved);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<StoreHouse> update(@PathVariable Integer id, @Valid @RequestBody StoreHouseDto dto) {
//        StoreHouse storeHouseUpdated = storeHouseService.update(id, dto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(storeHouseUpdated);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<StoreHouse> getById(@PathVariable Integer id) {
//        StoreHouse storeHouse = storeHouseService.getById(id);
//        return ResponseEntity.status(HttpStatus.OK).body(storeHouse);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Integer id) {
//        storeHouseService.delete(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//    @GetMapping("/search")
//    public ResponseEntity<List<StoreHouse>> getFiltered(
//            @RequestParam(required = false) String code,
//            @RequestParam(required = false) String name) {
//        List<StoreHouse> storeHouseListFiltered = storeHouseService.getFiltered(code, name);
//
//        return ResponseEntity.status(HttpStatus.OK).body(storeHouseListFiltered);
//    }
//    @GetMapping("/pageable")
//    public ResponseEntity<PagePojo<StoreHouse>> getAllPagination(
//        @RequestParam(defaultValue = "0") int page,
//        @RequestParam(defaultValue = "5") int size,
//        @RequestParam(defaultValue = "id") String sortField,
//        @RequestParam(defaultValue = "asc") String sortOrder,
//        @RequestParam(required = false) String code,
//        @RequestParam(required = false) String name
//        ................
//        Revisar si tiene mas valores para agregar en estos seters
//        ................
//    ) {
//        PagePojo<StoreHouse> storeHousePagePojoFiltered = storeHouseService.getByPageAndFilters(page, size, sortField, sortOrder, code, name);
//
//        return ResponseEntity.status(HttpStatus.OK).body(storeHousePagePojoFiltered);
//    }


}
