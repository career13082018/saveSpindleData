package com.concretepage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
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

    @Column(name="client_uuid")
    private String clientName;

    @Column(name="shift_list")
    private String shiftList;

////    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="Shift1STime")
//    private String Shift1STime;


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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="idle_time")
    private Date idleTime;

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

    @Column(name="shiftonestime")
    private String shiftonestime;

    @Column(name="shifttwostime")
    private String shifttwostime;

    @Column(name="shiftthreestime")
    private String shiftthreestime;

    @Column(name="generalshiftstime")
    private String generalshiftstime;

    @Column(name="shiftoneetime")
    private String shiftoneetime;

    @Column(name="shifttwoetime")
    private String shifttwoetime;

    @Column(name="shiftthreeetime")
    private String shiftthreeetime;

    @Column(name="generalshiftetime")
    private String generalshiftetime;

    public MachineSettingDetailsBean(int id, String clientName, String shiftList, String frontRDia, String slipPercent, String slipDuration, String slipOccurance, String batchProcess, Date idleTime, int numOfMachine, String deviceUUID, int totalNoOfSpindles, String masterAddress, String spindlesPer, int splMaster, int numOfSpdMasters, String shiftonestime, String shifttwostime, String shiftthreestime, String generalshiftstime, String shiftoneetime, String shifttwoetime, String shiftthreeetime, String generalshiftetime) {
        this.id = id;
        this.clientName = clientName;
        this.shiftList = shiftList;
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
        this.shiftonestime = shiftonestime;
        this.shifttwostime = shifttwostime;
        this.shiftthreestime = shiftthreestime;
        this.generalshiftstime = generalshiftstime;
        this.shiftoneetime = shiftoneetime;
        this.shifttwoetime = shifttwoetime;
        this.shiftthreeetime = shiftthreeetime;
        this.generalshiftetime = generalshiftetime;
    }

    public String getShiftoneetime() {
        return shiftoneetime;
    }

    public void setShiftoneetime(String shiftoneetime) {
        this.shiftoneetime = shiftoneetime;
    }

    public String getShifttwoetime() {
        return shifttwoetime;
    }

    public void setShifttwoetime(String shifttwoetime) {
        this.shifttwoetime = shifttwoetime;
    }

    public String getShiftthreeetime() {
        return shiftthreeetime;
    }

    public void setShiftthreeetime(String shiftthreeetime) {
        this.shiftthreeetime = shiftthreeetime;
    }

    public String getGeneralshiftetime() {
        return generalshiftetime;
    }

    public void setGeneralshiftetime(String generalshiftetime) {
        this.generalshiftetime = generalshiftetime;
    }

    public MachineSettingDetailsBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(Date idleTime) {
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

    public String getShiftonestime() {
        return shiftonestime;
    }

    public void setShiftonestime(String shiftonestime) {
        this.shiftonestime = shiftonestime;
    }

    public String getShifttwostime() {
        return shifttwostime;
    }

    public void setShifttwostime(String shifttwostime) {
        this.shifttwostime = shifttwostime;
    }

    public String getShiftthreestime() {
        return shiftthreestime;
    }

    public void setShiftthreestime(String shiftthreestime) {
        this.shiftthreestime = shiftthreestime;
    }

    public String getGeneralshiftstime() {
        return generalshiftstime;
    }

    public void setGeneralshiftstime(String generalshiftstime) {
        this.generalshiftstime = generalshiftstime;
    }
}
