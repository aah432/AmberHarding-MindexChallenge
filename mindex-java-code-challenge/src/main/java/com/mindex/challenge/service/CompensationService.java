package com.mindex.challenge.service;

import com.mindex.challenge.service.impl.Compensation;

public interface CompensationService {
    Compensation create(Compensation comp);
    Compensation read(String id);
    Compensation update(Compensation comp);//unused
}
