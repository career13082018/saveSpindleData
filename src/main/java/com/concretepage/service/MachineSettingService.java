package com.concretepage.service;

import com.concretepage.entity.MachineSettingDetailsBean;
import com.concretepage.repository.MachineSettingServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MachineSettingService{

    @Autowired
    private MachineSettingServiceRepository repository;

    public int saveMachineSettings(MachineSettingDetailsBean machineSettingDetailsBean){
        System.out.println("service class method -- Front R Dia:"+machineSettingDetailsBean.getFrontRDia());
        System.out.println("service class method -- BatchProcss:"+machineSettingDetailsBean.getBatchProcess());
        System.out.println("service class method -- getSplMaster:"+machineSettingDetailsBean.getSplMaster());

        int statusCode = repository.saveMachineSettings(machineSettingDetailsBean.getSplMaster(),machineSettingDetailsBean.getFrontRDia(),machineSettingDetailsBean.getBatchProcess());
        System.out.println("status : "+statusCode);
        return statusCode;
    }
}
