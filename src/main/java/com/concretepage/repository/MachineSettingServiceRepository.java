package com.concretepage.repository;


import com.concretepage.entity.MachineSettingDetailsBean;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public interface MachineSettingServiceRepository extends CrudRepository<MachineSettingDetailsBean, Integer> {

    @Modifying
    @Query(value = "insert into machine_setting_details1(machine_uuid,front_R_Dia, batch_process) values(:uuid,:insertLink,:id)  ", nativeQuery = true)
    @Transactional
    public int saveMachineSettings(@Param("uuid") int uuid,@Param("insertLink") String insertLink, @Param("id") String id);
}
