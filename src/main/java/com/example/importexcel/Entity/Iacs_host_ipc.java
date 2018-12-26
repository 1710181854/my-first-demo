package com.example.importexcel.Entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
//ipc配置信息表
@Entity
@Table(name = "iacs_host_ipc")
public class Iacs_host_ipc {
    private String ID;//id
    @Column(name = "HOUSE_HOST_ID")
    @Excel(name = "主机串号" ,orderNum = "0")
    private String HOUSE_HOST_ID;//楼宇主机id
    @Column(name = "NVR_ID")
    @Excel(name = "NVRip地址" ,orderNum = "1")
    private String NVR_ID;//关联nvr主键
    @Column(name = "CODE")
    @Excel(name = "IPC编号" ,orderNum = "2")
    private String CODE;//编号
    @Column(name = "IP")
    @Excel(name = "IP地址" ,orderNum = "3")
    private String IP;//mac地址
    @Column(name = "MAC")
    @Excel(name = "MAC地址" ,orderNum = "4")
    private String MAC;//物理mac地址
    @Column(name = "CHANNEL")
    @Excel(name = "NVR通道" ,orderNum = "5")
    private Integer CHANNEL;//nvr通道
    private String TYPE;//ipc类型
    @Column(name = "FACTORY")
    @Excel(name = "IPC厂家" ,orderNum = "6")
    private String FACTORY;//ipc厂家
    @Column(name = "VERSION")
    @Excel(name = "版本" ,orderNum = "7")
    private String VERSION;//版本
    @Column(name = "POSITION")
    @Excel(name = "位置类型" ,orderNum = "8")
    private String POSITION;//位置类型
    @Column(name = "ADDRESS")
    @Excel(name = "安装位置" ,orderNum = "9")
    private String ADDRESS;//安装位置
    private String IMAGE;//安装位置图片
    private Integer SORTNO = 0;//排序号
    private Integer STATUS = 1;//数据状态
    private Integer FLAG = 1;//操作状态
    private String RECORD_PERSON = "10000001";//记录人
    private Date RECORD_TIME;//记录时间
    private String RECORD_DEPART = "1000002";//记录入部门
    @Column(name = "REMARK")
    @Excel(name = "备注" ,orderNum = "10")
    private String REMARK;//备注
    private String RECORD_PEOPLE_ID;//记录人员Id
    private String MODIFY_PEOPLE_ID;//修改人员Id
    private String MODIFY_PEOPLE_NAME;//修改人员姓名
    private Date MODIFY_TIME;//修改时间
    private String RECORD_PEOPLE_NAME;//记录人员姓名
    private String ACCOUNT;//帐户名
    private String PASSWORD;//密码
    private String PORT;//端口号码
    private String NVR;//NVR的IP地址

    @Override
    public String toString() {
        return "Iacs_host_ipc{" +
                "ID='" + ID + '\'' +
                ", HOUSE_HOST_ID='" + HOUSE_HOST_ID + '\'' +
                ", NVR_ID='" + NVR_ID + '\'' +
                ", CODE='" + CODE + '\'' +
                ", IP='" + IP + '\'' +
                ", MAC='" + MAC + '\'' +
                ", CHANNEL=" + CHANNEL +
                ", TYPE='" + TYPE + '\'' +
                ", FACTORY='" + FACTORY + '\'' +
                ", VERSION='" + VERSION + '\'' +
                ", POSITION='" + POSITION + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", IMAGE='" + IMAGE + '\'' +
                ", SORTNO=" + SORTNO +
                ", STATUS=" + STATUS +
                ", FLAG=" + FLAG +
                ", RECORD_PERSON='" + RECORD_PERSON + '\'' +
                ", RECORD_TIME=" + RECORD_TIME +
                ", RECORD_DEPART='" + RECORD_DEPART + '\'' +
                ", REMARK='" + REMARK + '\'' +
                ", RECORD_PEOPLE_ID='" + RECORD_PEOPLE_ID + '\'' +
                ", MODIFY_PEOPLE_ID='" + MODIFY_PEOPLE_ID + '\'' +
                ", MODIFY_PEOPLE_NAME='" + MODIFY_PEOPLE_NAME + '\'' +
                ", MODIFY_TIME=" + MODIFY_TIME +
                ", RECORD_PEOPLE_NAME='" + RECORD_PEOPLE_NAME + '\'' +
                ", ACCOUNT='" + ACCOUNT + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", PORT='" + PORT + '\'' +
                ", NVR='" + NVR + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getHOUSE_HOST_ID() {
        return HOUSE_HOST_ID;
    }

    public void setHOUSE_HOST_ID(String HOUSE_HOST_ID) {
        this.HOUSE_HOST_ID = HOUSE_HOST_ID;
    }

    public String getNVR_ID() {
        return NVR_ID;
    }

    public void setNVR_ID(String NVR_ID) {
        this.NVR_ID = NVR_ID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public Integer getCHANNEL() {
        return CHANNEL;
    }

    public void setCHANNEL(Integer CHANNEL) {
        this.CHANNEL = CHANNEL;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getFACTORY() {
        return FACTORY;
    }

    public void setFACTORY(String FACTORY) {
        this.FACTORY = FACTORY;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public Integer getSORTNO() {
        return SORTNO;
    }

    public void setSORTNO(Integer SORTNO) {
        this.SORTNO = SORTNO;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Integer getFLAG() {
        return FLAG;
    }

    public void setFLAG(Integer FLAG) {
        this.FLAG = FLAG;
    }

    public String getRECORD_PERSON() {
        return RECORD_PERSON;
    }

    public void setRECORD_PERSON(String RECORD_PERSON) {
        this.RECORD_PERSON = RECORD_PERSON;
    }

    public Date getRECORD_TIME() {
        return RECORD_TIME;
    }

    public void setRECORD_TIME(Date RECORD_TIME) {
        this.RECORD_TIME = RECORD_TIME;
    }

    public String getRECORD_DEPART() {
        return RECORD_DEPART;
    }

    public void setRECORD_DEPART(String RECORD_DEPART) {
        this.RECORD_DEPART = RECORD_DEPART;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getRECORD_PEOPLE_ID() {
        return RECORD_PEOPLE_ID;
    }

    public void setRECORD_PEOPLE_ID(String RECORD_PEOPLE_ID) {
        this.RECORD_PEOPLE_ID = RECORD_PEOPLE_ID;
    }

    public String getMODIFY_PEOPLE_ID() {
        return MODIFY_PEOPLE_ID;
    }

    public void setMODIFY_PEOPLE_ID(String MODIFY_PEOPLE_ID) {
        this.MODIFY_PEOPLE_ID = MODIFY_PEOPLE_ID;
    }

    public String getMODIFY_PEOPLE_NAME() {
        return MODIFY_PEOPLE_NAME;
    }

    public void setMODIFY_PEOPLE_NAME(String MODIFY_PEOPLE_NAME) {
        this.MODIFY_PEOPLE_NAME = MODIFY_PEOPLE_NAME;
    }

    public Date getMODIFY_TIME() {
        return MODIFY_TIME;
    }

    public void setMODIFY_TIME(Date MODIFY_TIME) {
        this.MODIFY_TIME = MODIFY_TIME;
    }

    public String getRECORD_PEOPLE_NAME() {
        return RECORD_PEOPLE_NAME;
    }

    public void setRECORD_PEOPLE_NAME(String RECORD_PEOPLE_NAME) {
        this.RECORD_PEOPLE_NAME = RECORD_PEOPLE_NAME;
    }

    public String getACCOUNT() {
        return ACCOUNT;
    }

    public void setACCOUNT(String ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT;
    }

    public String getNVR() {
        return NVR;
    }

    public void setNVR(String NVR) {
        this.NVR = NVR;
    }
}
