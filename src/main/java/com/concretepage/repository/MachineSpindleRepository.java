package com.concretepage.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.concretepage.entity.SpindleMachineDetailsBean;

public interface MachineSpindleRepository extends CrudRepository<SpindleMachineDetailsBean, Long>  {
   /* List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);*/
}
