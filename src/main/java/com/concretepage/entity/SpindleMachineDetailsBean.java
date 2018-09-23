package com.concretepage.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="spindle_machine_details")
public class SpindleMachineDetailsBean{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmachine_details")
    private long machineId;
    @Column(name="client_UUID")
    private String clientUUID;
    @Column(name="machine_UUID")
    private String machineUUID;
    @Column(name="machine_Address")
    private String machineAddress;
    @Column(name="device_UUID")
    private String deviceUUID;
    @Column(name="spindle_Master_Timestamp")
    private String spindleMasterTimestamp;
    @Column(name="spindle_master")
    private String spindleMaster;

    @OneToMany(mappedBy = "machineDetailsBean",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<SpindleMasterDetailsBean> spindleMasterDetailsSet = new HashSet<SpindleMasterDetailsBean>();


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getMachineId() {
        return machineId;
    }

    public void setMachineId(long machineId) {
        this.machineId = machineId;
    }

    public String getClientUUID() {
        return clientUUID;
    }

    public void setClientUUID(String clientUUID) {
        this.clientUUID = clientUUID;
    }

    public String getMachineUUID() {
        return machineUUID;
    }

    public void setMachineUUID(String machineUUID) {
        this.machineUUID = machineUUID;
    }

    public String getMachineAddress() {
        return machineAddress;
    }

    public void setMachineAddress(String machineAddress) {
        this.machineAddress = machineAddress;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }

    public String getSpindleMasterTimestamp() {
        return spindleMasterTimestamp;
    }

    public void setSpindleMasterTimestamp(String spindleMasterTimestamp) {
        this.spindleMasterTimestamp = spindleMasterTimestamp;
    }

    public String getSpindleMaster() {
        return spindleMaster;
    }

    public void setSpindleMaster(String spindleMaster) {
        this.spindleMaster = spindleMaster;
    }

    public Set<SpindleMasterDetailsBean> getSpindleMasterDetailsSet() {
        return spindleMasterDetailsSet;
    }

    public void setSpindleMasterDetailsSet(Set<SpindleMasterDetailsBean> spindleMasterDetailsSet) {
        this.spindleMasterDetailsSet = spindleMasterDetailsSet;
    }
}