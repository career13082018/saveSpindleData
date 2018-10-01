package com.concretepage.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="machine_setting_details1")
public class MachineSettingDetailsBean {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="machine_uuid")
    private int id;

    @Column(name="client_name")
    private String clientName;

    @Column(name="shift_list")
    private String shiftList;

    @Column(name="shift_start_time")
    private String shiftStartTime;

    @Column(name="shift_end_time")
    private String shiftEndTime;

    @Column(name="front_R_Dia")
    private String frontRDia;

    @Column(name="slip_percent")
    private String slipPercent;

    @Column(name="slip_duration")
    private String slipDuration;

    @Column(name="slip_occurance")
    private String slipOccurance;

    @Column(name="batch_process")
    private String batchProcess;

    @Column(name="idle_time")
    private String idleTime;

    @Column(name="num_of_machine")
    private int numOfMachine;

    @Column(name="device_UUID")
    private String deviceUUID;

    @Column(name="tot_no_of_spindles")
    private int totalNoOfSpindles;

    @Column(name="master_address")
    private String masterAddress;

    @Column(name="spindles_per")
    private String spindlesPer;

    @Column(name="spl_master")
    private int splMaster;

    @Column(name="num_of_spd_masters")
    private int numOfSpdMasters;

    public MachineSettingDetailsBean(int machineUUID, String clientName, String shiftList, String shiftStartTime, String shiftEndTime, String frontRDia, String slipPercent, String slipDuration, String slipOccurance, String batchProcess, String idleTime, int numOfMachine, String deviceUUID, int totalNoOfSpindles, String masterAddress, String spindlesPer, int splMaster, int numOfSpdMasters) {
        this.id = machineUUID;
        this.clientName = clientName;
        this.shiftList = shiftList;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.frontRDia = frontRDia;
        this.slipPercent = slipPercent;
        this.slipDuration = slipDuration;
        this.slipOccurance = slipOccurance;
        this.batchProcess = batchProcess;
        this.idleTime = idleTime;
        this.numOfMachine = numOfMachine;
        this.deviceUUID = deviceUUID;
        this.totalNoOfSpindles = totalNoOfSpindles;
        this.masterAddress = masterAddress;
        this.spindlesPer = spindlesPer;
        this.splMaster = splMaster;
        this.numOfSpdMasters = numOfSpdMasters;
    }

    public MachineSettingDetailsBean() {
    }

    public int getMachineUUID() {
        return id;
    }

    public void setMachineUUID(int machineUUID) {
        this.id = machineUUID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getShiftList() {
        return shiftList;
    }

    public void setShiftList(String shiftList) {
        this.shiftList = shiftList;
    }

    public String getShiftStartTime() {
        return shiftStartTime;
    }

    public void setShiftStartTime(String shiftStartTime) {
        this.shiftStartTime = shiftStartTime;
    }

    public String getShiftEndTime() {
        return shiftEndTime;
    }

    public void setShiftEndTime(String shiftEndTime) {
        this.shiftEndTime = shiftEndTime;
    }

    public String getFrontRDia() {
        return frontRDia;
    }

    public void setFrontRDia(String frontRDia) {
        this.frontRDia = frontRDia;
    }

    public String getSlipPercent() {
        return slipPercent;
    }

    public void setSlipPercent(String slipPercent) {
        this.slipPercent = slipPercent;
    }

    public String getSlipDuration() {
        return slipDuration;
    }

    public void setSlipDuration(String slipDuration) {
        this.slipDuration = slipDuration;
    }

    public String getSlipOccurance() {
        return slipOccurance;
    }

    public void setSlipOccurance(String slipOccurance) {
        this.slipOccurance = slipOccurance;
    }

    public String getBatchProcess() {
        return batchProcess;
    }

    public void setBatchProcess(String batchProcess) {
        this.batchProcess = batchProcess;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }

    public int getNumOfMachine() {
        return numOfMachine;
    }

    public void setNumOfMachine(int numOfMachine) {
        this.numOfMachine = numOfMachine;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }

    public int getTotalNoOfSpindles() {
        return totalNoOfSpindles;
    }

    public void setTotalNoOfSpindles(int totalNoOfSpindles) {
        this.totalNoOfSpindles = totalNoOfSpindles;
    }

    public String getMasterAddress() {
        return masterAddress;
    }

    public void setMasterAddress(String masterAddress) {
        this.masterAddress = masterAddress;
    }

    public String getSpindlesPer() {
        return spindlesPer;
    }

    public void setSpindlesPer(String spindlesPer) {
        this.spindlesPer = spindlesPer;
    }

    public int getSplMaster() {
        return splMaster;
    }

    public void setSplMaster(int splMaster) {
        this.splMaster = splMaster;
    }

    public int getNumOfSpdMasters() {
        return numOfSpdMasters;
    }

    public void setNumOfSpdMasters(int numOfSpdMasters) {
        this.numOfSpdMasters = numOfSpdMasters;
    }
}
