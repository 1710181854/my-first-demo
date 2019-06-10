package com.example.importexcel.dao;

import com.example.importexcel.Entity.DemoExcel;
import com.example.importexcel.Entity.Iacs_Host_Nvr;
import com.example.importexcel.Entity.Iacs_host_ipc;
import org.apache.ibatis.annotations.Mapper;
//徐鑫测试eclipse连接git 时间2019/6/10  17:18,22222,4444
@Mapper
public interface SeckillDao {
    //将数据插入到数据库中去
    public void  insertSeckill(DemoExcel demoExcel);
    //将数据插入到NVR中
    public void insertNVR(Iacs_Host_Nvr iac);
    //根据TYPE的值到数据字典表中去查找相对应的值
    public String seleNVR(String type);
    //根据从excel表格读出的主机编号查出主机的house_host_id
    public String seleHouse_host_id(String HOUSE_HOST_ID);
    //根据NVR的ip地址确定NVR主键
    public String seleNvr_id(String Nvr);
    //根据ipc的位置类型查找对应的code
    public String seleNvrByIPC_POSITION(String IPC_POSITION);
    //将Iacs_host_ipc插入到Iacs_host_ipc表中
    public void insertIPC(Iacs_host_ipc ihi);
    //根据code去模糊查询得到出现的次数
    public int inserCount(String code);
    //查询数据库中是否已经有了此code
    public String inserIsNoCode(String code);

}
