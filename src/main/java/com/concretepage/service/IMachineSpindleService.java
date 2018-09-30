package com.concretepage.service;

import com.concretepage.entity.SpindleMachineDetailsBean;
import com.concretepage.entity.SpindleMasterDetailsBean;

import java.util.List;
import java.util.Set;

public interface IMachineSpindleService {
    List<SpindleMasterDetailsBean> getAllArticles();
    List<SpindleMachineDetailsBean> getAllMachineDetails();
    boolean addSpindleData(SpindleMachineDetailsBean spindleMachineDetailsBean);
    Set<SpindleMasterDetailsBean> getSpecificSpindleMasters(String spindleMasterName);
}
