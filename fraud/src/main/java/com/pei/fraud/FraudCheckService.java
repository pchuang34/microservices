package com.pei.fraud;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    /**lombok*/
//    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
//        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
//    }

    public boolean isFraudulentCustomer(Integer customerId){
        //maybe third party system to check if the customer is fraudster
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }

}
