package com.gestion.almacenes.repositories;

import com.gestion.almacenes.entities.StoreHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreHouseRepository extends JpaRepository<StoreHouse, Integer> {

}