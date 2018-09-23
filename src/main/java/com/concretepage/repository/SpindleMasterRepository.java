package com.concretepage.repository;

import com.concretepage.entity.SpindleMachineDetailsBean;
import com.concretepage.entity.SpindleMasterDetailsBean;
import org.springframework.data.repository.CrudRepository;

public interface SpindleMasterRepository extends CrudRepository<SpindleMasterDetailsBean, Long>  {
   /* List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);*/
}
