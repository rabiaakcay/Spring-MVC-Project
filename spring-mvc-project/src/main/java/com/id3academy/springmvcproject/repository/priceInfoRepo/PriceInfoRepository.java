package com.id3academy.springmvcproject.repository.priceInfoRepo;

import com.id3academy.springmvcproject.model.priceInfo.PriceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceInfoRepository extends JpaRepository<PriceInfo, Integer> {
}
