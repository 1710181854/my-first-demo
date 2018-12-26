package com.example.importexcel.Entity;


import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seckill")
public class DemoExcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id" ,orderNum = "0")
    private Long seckill_Id;

    @Column(name = "stringname")
    @Excel(name = "姓名" ,orderNum = "1")
    private String stringname;

    @Column(name = "stringnumber")
    @Excel(name = "数量" ,orderNum = "2")
    private int stringnumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "start_time")
    @Excel(name = "开始日期" ,orderNum = "3",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "end_time")
    @Excel(name = "结束日期" ,orderNum = "4",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    @Excel(name = "创建日期" ,orderNum = "5",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Long getSeckill_Id() {
        return seckill_Id;
    }

    public void setSeckill_Id(Long seckill_Id) {
        this.seckill_Id = seckill_Id;
    }

    public String getStringname() {
        return stringname;
    }

    public void setStringname(String stringname) {
        this.stringname = stringname;
    }

    public int getStringnumber() {
        return stringnumber;
    }

    public void setStringnumber(int stringnumber) {
        this.stringnumber = stringnumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "DemoExcel{" +
                "seckill_Id=" + seckill_Id +
                ", stringname='" + stringname + '\'' +
                ", stringnumber=" + stringnumber +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}