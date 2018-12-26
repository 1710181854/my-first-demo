package com.example.importexcel.Entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//nvr配置信息表
@Entity
@Table(name = "iacs_host_nvr")
//name对应数据库中的表名字
public class Iacs_Host_Nvr {
    private String id;//主键编号uuid生成
    @Column(name = "CODE")
    @Excel(name = "NVR编号" ,orderNum = "0")
    private String code;//编号
    @Column(name = "IP")
    @Excel(name = "ip地址" ,orderNum = "1")
    private String ip;//ip地址
    @Column(name = "MAC")
    @Excel(name = "mac地址" ,orderNum = "2")
    private String mac;//mac地址
    @Column(name = "ACCOUNT")
    @Excel(name = "NVR账户" ,orderNum = "3")
    private String account;//账户
    @Column(name = "PASSWORD")
    @Excel(name = "NVR密码" ,orderNum = "4")
    private String password;//密码
    @Column(name = "PORT")
    @Excel(name = "NVR端口" ,orderNum = "5")
    private String port;//端口
    @Column(name = "CHANNELS")
    @Excel(name = "NVR通道数量" ,orderNum = "6")
    private Integer channels;//nvr通道数
    @Column(name = "FACTORY")
    @Excel(name = "NVR厂家" ,orderNum = "7")
    private String factory;//nvr厂家
    @Column(name = "TYPE")
    @Excel(name = "NVR类型" ,orderNum = "8")
    private String type;//nvr类型
    @Column(name = "VERSION")
    @Excel(name = "版本" ,orderNum = "9")
    private String version;//版本
    @Column(name = "ADDRESS")
    @Excel(name = "安装位置" ,orderNum = "10")
    private String address;//安装位置
    private String image;//安装位置图片
    private Integer sortno = 0;//排序号
    private Integer status = 1;//数据状态
    private Integer flag = 1;//操作状态\
    private  String  record_person = "10000001";//记录人
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date record_time ;//记录时间
    private String record_depart = "1000002";//记录部门
    @Column(name = "REMARK")
    @Excel(name = "备注" ,orderNum = "11")
    private String remark;//备注
    private String record_people_id;//记录人员id
    private String modify_people_id;//修改操作人员id
    private String modify_people_name;//修改操作人员姓名
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modify_time;//修改时间
    private String record_people_name;//新增操作人员姓名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getRecord_person() {
        return record_person;
    }

    public void setRecord_person(String record_person) {
        this.record_person = record_person;
    }

    public Date getRecord_time() {
        return record_time;
    }

    public void setRecord_time(Date record_time) {
        this.record_time = record_time;
    }

    public String getRecord_depart() {
        return record_depart;
    }

    public void setRecord_depart(String record_depart) {
        this.record_depart = record_depart;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRecord_people_id() {
        return record_people_id;
    }

    public void setRecord_people_id(String record_people_id) {
        this.record_people_id = record_people_id;
    }

    public String getModify_people_id() {
        return modify_people_id;
    }

    public void setModify_people_id(String modify_people_id) {
        this.modify_people_id = modify_people_id;
    }

    public String getModify_people_name() {
        return modify_people_name;
    }

    public void setModify_people_name(String modify_people_name) {
        this.modify_people_name = modify_people_name;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getRecord_people_name() {
        return record_people_name;
    }

    public void setRecord_people_name(String record_people_name) {
        this.record_people_name = record_people_name;
    }

    @Override
    public String toString() {
        return "Iacs_Host_Nvr{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", port='" + port + '\'' +
                ", channels=" + channels +
                ", factory='" + factory + '\'' +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                ", sortno=" + sortno +
                ", status=" + status +
                ", flag=" + flag +
                ", record_person='" + record_person + '\'' +
                ", record_time=" + record_time +
                ", record_depart='" + record_depart + '\'' +
                ", remark='" + remark + '\'' +
                ", record_people_id='" + record_people_id + '\'' +
                ", modify_people_id='" + modify_people_id + '\'' +
                ", modify_people_name='" + modify_people_name + '\'' +
                ", modify_time=" + modify_time +
                ", record_people_name='" + record_people_name + '\'' +
                '}';
    }
}
