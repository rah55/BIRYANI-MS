package com.yumbiryani.repository;

import java.util.List;

import com.yumbiryani.model.biryani;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface biryaniRepository extends JpaRepository<biryani, Integer> {
List <biryani> findByBiryaniType(String bType);

@Query(value="select * from biryani where biryani_Price< ?1",nativeQuery=true)
List<biryani> findByBiryaniPrice(int bPrice);
}
