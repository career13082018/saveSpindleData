package com.concretepage.repository;

import com.concretepage.entity.SpindleMachineDetailsBean;
import org.springframework.data.repository.CrudRepository;

public interface MachineSpindleRepository extends CrudRepository<SpindleMachineDetailsBean, Long>  {
   /* List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);*/
}
