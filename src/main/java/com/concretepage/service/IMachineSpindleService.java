package com.concretepage.service;

import com.concretepage.entity.SpindleMachineDetailsBean;

import java.util.List;

public interface IMachineSpindleService {
    List<SpindleMachineDetailsBean> getAllArticles();
    boolean addSpindleData(SpindleMachineDetailsBean spindleMachineDetailsBean);
}
