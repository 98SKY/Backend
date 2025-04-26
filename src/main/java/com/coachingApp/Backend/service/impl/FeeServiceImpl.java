package com.coachingApp.Backend.service.impl;

import com.coachingApp.Backend.model.Fees;
import com.coachingApp.Backend.repository.FeeRepository;
import com.coachingApp.Backend.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FeeServiceImpl implements FeeService {

    @Autowired
    private FeeRepository feeRepository;

    @Override
    public Fees saveFee(Fees fee){
        return feeRepository.save(fee);
    }

    @Override
    public Fees getFeeById(String feeId){
        Optional<Fees> optionalFees = feeRepository.findById(feeId);
        return optionalFees.orElse(null);
    }

    @Override
    public Boolean existFee(String feeId){
        return feeRepository.existsById(feeId);
    }

    @Override
    public Fees updateFee(Fees fees){
        return feeRepository.save(fees);
    }

}
