package com.gfttraining.WineDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfttraining.WineDB.Model.Winery;

@Repository
public interface WineryRepository extends JpaRepository<Winery, Integer>{
    
}
