package com.coachingApp.Backend.service;

import com.coachingApp.Backend.model.Fees;

public interface FeeService {
    Fees saveFee(Fees fee);

    Fees getFeeById(String feeId);

    Boolean existFee(String feeId);

    Fees updateFee(Fees fees);
}
