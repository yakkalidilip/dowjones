package com.example.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bootcamp.entity.DowJonesEntity;

@Repository
public interface DowJonesRepository extends JpaRepository<DowJonesEntity, String> {

	@Query(value="select * from DOWJONES where stock=?1",nativeQuery=true)
	DowJonesEntity selectStock(String stock);
}
