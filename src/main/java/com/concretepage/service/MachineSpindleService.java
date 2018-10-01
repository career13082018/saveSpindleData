package com.concretepage.service;


import com.concretepage.entity.SpindleMachineDetailsBean;
import com.concretepage.entity.SpindleMasterDetailsBean;
import com.concretepage.repository.MachineSpindleRepository;
import com.concretepage.repository.SpindleMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class MachineSpindleService implements IMachineSpindleService {

    @Autowired
    private MachineSpindleRepository machineSpindleRepository;
    @Autowired
    private SpindleMasterRepository spindleMasterRepository;

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
}