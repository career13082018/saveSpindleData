package com.concretepage.service;


import com.concretepage.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.concretepage.entity.SpindleMachineDetailsBean;
import com.concretepage.repository.MachineSpindleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MachineSpindleService implements IMachineSpindleService {

    @Autowired
    private MachineSpindleRepository machineSpindleRepository;

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
    public List<SpindleMachineDetailsBean> getAllArticles(){
        List<SpindleMachineDetailsBean> list = new ArrayList<>();
        machineSpindleRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
}