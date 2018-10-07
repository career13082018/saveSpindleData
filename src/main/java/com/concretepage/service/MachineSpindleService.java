package com.concretepage.service;


import com.concretepage.entity.MachineSettingDetailsBean;
import com.concretepage.entity.SpindleMachineDetailsBean;
import com.concretepage.entity.SpindleMasterDetailsBean;
import com.concretepage.repository.MachineSpindleRepository;
import com.concretepage.repository.SpindleMasterRepository;
import com.concretepage.repository.MachineSettingServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
@Service
public class MachineSpindleService implements IMachineSpindleService {

    @Autowired
    private MachineSpindleRepository machineSpindleRepository;
    @Autowired
    private SpindleMasterRepository spindleMasterRepository;
    @Autowired
    private MachineSettingServiceRepository repository;

    @Autowired
    private MachineSettingServiceRepository machineSettingServiceRepository;

    public static final String FIND_PROJECTS = "SELECT projectId, projectName FROM projects";

    @Override
    public boolean addSpindleData(SpindleMachineDetailsBean spindleMachineDetailsBean) {


        // List<Article> list = articleRepository.findByTitleAndCategory(article.getTitle(), article.getCategory());
        //  if (list.size() > 0) {
        //      return false;
        //  } else {
        machineSpindleRepository.save(spindleMachineDetailsBean);
        return true;
        //   }
        //return true;
        //  }-
    }

    @Override
    public List<SpindleMasterDetailsBean> getAllArticles(){
        List<SpindleMasterDetailsBean> list = new ArrayList<>();
        spindleMasterRepository.findAll().forEach(e -> list.add(e));
        ArrayList<SpindleMasterDetailsBean> spindleMastList = new ArrayList<SpindleMasterDetailsBean>();
        return list;
    }

    public Set<SpindleMasterDetailsBean> getSpecificSpindleMasters(String spindleMasterName) {
        Set<SpindleMasterDetailsBean> obj = spindleMasterRepository.getMasterDetails(spindleMasterName);
        return obj;
    }

    @Override
    public List<SpindleMachineDetailsBean> getAllMachineDetails(){
        List<SpindleMachineDetailsBean> list = new ArrayList<>();
       // machineSpindleRepository.findAll().forEach(e -> list.add(e));
        int noOfSpindles = 24;
        ArrayList<String> SpindleMasterList = new ArrayList<String>();

        for(int i=1; i<=noOfSpindles; i++) {
            SpindleMasterList.add("Spindle Master "+i);
        }

        System.out.println(SpindleMasterList);

        List<SpindleMasterDetailsBean> masterDetailsList =  getAllArticles();
        for (String masterDetails: SpindleMasterList)
        {
            SpindleMachineDetailsBean spindleMachineDetls = new SpindleMachineDetailsBean();
            spindleMachineDetls.setSpindleMaster(masterDetails);


            spindleMachineDetls.setSpindleMasterDetailsSet(getSpecificSpindleMasters(masterDetails));
            list.add(spindleMachineDetls);
        }

        return list;
    }

    public int saveMachineSettings(MachineSettingDetailsBean machineSettingDetailsBean){
        System.out.println("service class method -- Front R Dia:"+machineSettingDetailsBean.getFrontRDia());
        System.out.println("service class method -- shift1:"+machineSettingDetailsBean.getShiftonestime());
        System.out.println("service class method -- shift2:"+machineSettingDetailsBean.getShifttwostime());
        System.out.println("service class method -- shift3:"+machineSettingDetailsBean.getShiftthreestime());
        System.out.println("service class method -- generalshift:"+machineSettingDetailsBean.getGeneralshiftstime());
        System.out.println("service class method -- shift1e:"+machineSettingDetailsBean.getShiftoneetime());
        System.out.println("service class method -- shift2e:"+machineSettingDetailsBean.getShifttwoetime());
        System.out.println("service class method -- shift3e:"+machineSettingDetailsBean.getShiftthreeetime());
        System.out.println("service class method -- generalshifte:"+machineSettingDetailsBean.getGeneralshiftetime());
        System.out.println("service class method -- getIdleTime:"+machineSettingDetailsBean.getIdleTime());
        MachineSettingDetailsBean machineSettingDetailsBean1=machineSettingDetailsBean;
        System.out.println("machineSettingDetailsBean1 :"+machineSettingDetailsBean1.toString());
        Date idleTime=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
            String dt=simpleDateFormat.format(machineSettingDetailsBean.getIdleTime());
            idleTime=simpleDateFormat.parse(dt);
            log.info("idleTime :"+idleTime);
        }catch (Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }


        int statusCode = repository.saveMachineSettings(machineSettingDetailsBean.getSplMaster(),machineSettingDetailsBean.getFrontRDia(), machineSettingDetailsBean.getShiftonestime());
        System.out.println("status : "+statusCode);
        return statusCode;
    }
}