//Kullanmadın

package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.repository.priceInfoRepo.PriceInfoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PriceInfoService {
    private final PriceInfoRepository priceInfoRepository;

    public PriceInfoService(PriceInfoRepository priceInfoRepository) {
        this.priceInfoRepository = priceInfoRepository;
    }
}