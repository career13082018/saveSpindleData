package com.concretepage.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

        import java.io.Serializable;

        import javax.persistence.*;

@Entity
@Table(name="spindle_master_details")
public class SpindleMasterDetailsBean{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmaster_details")
    private long masterId;
    @Column(name="slave_address")
    private String slaveAddress;
    @Column(name="spindle_number")
    private String spindleNumber;
    @Column(name="spindle_RPM")
    private String spindleRPM;
    @Column(name="FR_RPM")
    private String frRPM;
    @Column(name="slip_count")
    private String slipCount;
    @Column(name="slip_RPM")
    private String slipRPM;
    @Column(name="slip_dev")
    private String slipDev;
    @Column(name="slips_time")
    private String slipsTime;
    @Column(name="rogue_Count")
    private String rogueCount;
    @Column(name="idle_count")
    private String idleCount;
    @Column(name="idle_duration")
    private String idleDuration;
    @Column(name="spindle_master")
    private String spindleMaster;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmachine_details")
    @JsonBackReference
    private SpindleMachineDetailsBean machineDetailsBean;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getMasterId() {
        return masterId;
    }

    public void setMasterId(long masterId) {
        this.masterId = masterId;
    }

    public String getSlaveAddress() {
        return slaveAddress;
    }

    public void setSlaveAddress(String slaveAddress) {
        this.slaveAddress = slaveAddress;
    }

    public String getSpindleNumber() {
        return spindleNumber;
    }

    public void setSpindleNumber(String spindleNumber) {
        this.spindleNumber = spindleNumber;
    }

    public String getSpindleRPM() {
        return spindleRPM;
    }

    public void setSpindleRPM(String spindleRPM) {
        this.spindleRPM = spindleRPM;
    }

    public String getFrRPM() {
        return frRPM;
    }

    public void setFrRPM(String frRPM) {
        this.frRPM = frRPM;
    }

    public String getSlipCount() {
        return slipCount;
    }

    public void setSlipCount(String slipCount) {
        this.slipCount = slipCount;
    }

    public String getSlipRPM() {
        return slipRPM;
    }

    public void setSlipRPM(String slipRPM) {
        this.slipRPM = slipRPM;
    }

    public String getSlipDev() {
        return slipDev;
    }

    public void setSlipDev(String slipDev) {
        this.slipDev = slipDev;
    }

    public String getSlipsTime() {
        return slipsTime;
    }

    public void setSlipsTime(String slipsTime) {
        this.slipsTime = slipsTime;
    }

    public String getRogueCount() {
        return rogueCount;
    }

    public void setRogueCount(String rogueCount) {
        this.rogueCount = rogueCount;
    }

    public String getIdleCount() {
        return idleCount;
    }

    public void setIdleCount(String idleCount) {
        this.idleCount = idleCount;
    }

    public String getIdleDuration() {
        return idleDuration;
    }

    public void setIdleDuration(String idleDuration) {
        this.idleDuration = idleDuration;
    }

    public String getSpindleMaster() {
        return spindleMaster;
    }

    public void setSpindleMaster(String spindleMaster) {
        this.spindleMaster = spindleMaster;
    }

    public SpindleMachineDetailsBean getMachineDetailsBean() {
        return machineDetailsBean;
    }

    public void setMachineDetailsBean(SpindleMachineDetailsBean machineDetailsBean) {
        this.machineDetailsBean = machineDetailsBean;
    }
}