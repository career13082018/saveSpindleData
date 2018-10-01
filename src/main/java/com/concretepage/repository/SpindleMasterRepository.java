package com.concretepage.repository;

import com.concretepage.entity.SpindleMasterDetailsBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface SpindleMasterRepository extends CrudRepository<SpindleMasterDetailsBean, Long>  {
   /* List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);*/
    @Query(value="Select smdb.idmaster_details,smdb.slave_address,smdb.spindle_number,smdb.spindle_RPM,smdb.FR_RPM,smdb.slip_count,smdb.spindle_master,smdb.slips_time,smdb.slip_RPM,smdb.rogue_Count from spindle_master_details smdb where smdb.spindle_master = (:SpindleMasterName) order by smdb.spindle_number asc", nativeQuery = true)
    Set<SpindleMasterDetailsBean> getMasterDetails(@Param("SpindleMasterName")  String SpindleMasterName);

}
