package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CompServiceImpl implements CompensationService {
    private static final Logger LOG = LoggerFactory.getLogger(CompServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepository;





    @Override
    public Compensation read(String id) {
        LOG.debug("Compensation requested");
        return compensationRepository.findCompByEmployeeEmployeeId(id).getSalary();
    }

    @Override
    public com.mindex.challenge.service.impl.Compensation create(com.mindex.challenge.service.impl.Compensation comp) {
        LOG.debug("Compensation Created!");
        return compensationRepository.insert(comp);
    }

    @Override
    public com.mindex.challenge.service.impl.Compensation update(com.mindex.challenge.service.impl.Compensation comp) {
        LOG.debug("Somehow update was called - this method is implemented");
        return null;
    }
}
