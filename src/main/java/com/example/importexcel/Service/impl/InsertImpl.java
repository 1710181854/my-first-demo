package com.example.importexcel.Service.impl;

import com.example.importexcel.Entity.DemoExcel;
import com.example.importexcel.Entity.Iacs_Host_Nvr;
import com.example.importexcel.Entity.Iacs_host_ipc;
import com.example.importexcel.Service.Insert;
import com.example.importexcel.dao.SeckillDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class InsertImpl implements Insert {
    @Autowired
    private SeckillDao seckillDao;
    private DemoExcel demoExcel;
    private Iacs_Host_Nvr iac;
    private Iacs_host_ipc ihi;
    //开启事务管理，插入数据到数据库的时候，发生异常就什么也不保存
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false,
            rollbackFor = Exception.class)
    @Override
    public String insertSeckill(List<Object> demoExcels) {
        //用来记录当前是第几行
         int flag = 1;
         //用来保存返回值
         String str = "";
         //用来暂时保存code
        String code="";
        for (Object ob : demoExcels) {
            flag++;
            //遍历保存数据
            if(ob instanceof  DemoExcel){
                seckillDao.insertSeckill((DemoExcel) ob);
            }else if(ob instanceof  Iacs_Host_Nvr){
                iac = (Iacs_Host_Nvr) ob;
                str = seckillDao.seleNVR(iac.getType());
               if(StringUtils.isBlank(str)){
                   //数据库中没查到，可能用户填错了
                   if(flag == 2){
                       return "表头字段‘NVR类型’写错了，请检查一下，或者是第2行的‘NVR类型’数据填写有误，查询不到";
                   }else{
                       return "第"+flag+"行的NVR类型"+ "数据填写有误，查询不到此数据请重新填写";
                   }
               }
                iac.setType(str);
                iac.setId(UUID.randomUUID().toString());
               seckillDao.insertNVR(iac);
            }else if(ob instanceof Iacs_host_ipc){
                ihi = (Iacs_host_ipc) ob;
                //将ip去点号，转换成code
                code = ihi.getIP().replace(".","");
                str = seckillDao.inserIsNoCode(code);
                if(StringUtils.isBlank(str)){
                    //说明数据库之前不存在此code
                    ihi.setCODE(code);
                }else{
                    //说明已经存在了此code，需要查询出现了几次
                    int count = seckillDao.inserCount(code);
                    ihi.setCODE(code+"-"+(count+1));
                }
                System.out.println(ihi.getCODE());
                //用uuid生成主键id
                ihi.setID(UUID.randomUUID().toString());
                //将ecxel传入的NVRip设置进
                ihi.setNVR(ihi.getNVR_ID());
                str = seckillDao.seleHouse_host_id(ihi.getHOUSE_HOST_ID());
                if(StringUtils.isBlank(str)){
                    //数据库中没查到，可能用户 填错了
                    if(flag == 2){
                        return "表头字段‘主机串号’写错了，请检查一下，或者是第2行的‘主机串号’数据填写有误，查询不到";
                    }else{
                        return "第"+flag+"行的主机串号"+"数据填写有误，查询不到此数据请重新填写";
                    }
                }
                //楼宇主机id查询出来设置进去
                ihi.setHOUSE_HOST_ID(str);
                str = seckillDao.seleNvr_id(ihi.getNVR_ID());
                if(StringUtils.isBlank(str)){
                    //数据库中没查到，可能用户填错了
                    if(flag == 2){
                        return "表头字段‘NVRip地址’写错了，请检查一下，或者是第2行的‘NVRip地址’数据填写有误，查询不到";
                    }else{
                        return "第"+flag+"行的NVRip地址"+"数据填写有误，查询不到此数据请重新填写";
                    }
                }
                //NVR的id查询出来设置进去
                ihi.setNVR_ID(str);
                //将位置类型转换成2，3，4
                str = seckillDao.seleNvrByIPC_POSITION(ihi.getPOSITION());
                if(StringUtils.isBlank(str)){
                    //数据库中没查到，可能用户填错了
                    if(flag == 2){
                        return "表头字段‘IPC厂家’写错了，请检查一下，或者是第2行的‘IPC厂家’数据填写有误，查询不到";
                    }else{
                        return "第"+flag+"行的IPC厂家"+"数据填写有误，查询不到此数据请重新填写";
                    }
                }
                ihi.setPOSITION(str);
                //将厂家名转换成1，2，3存在type中
                str = seckillDao.seleNVR(ihi.getFACTORY());
                if(StringUtils.isBlank(str)){
                    //数据库中没查到，可能用户填错了
                    if(flag == 2){
                        return "表头字段‘位置类型’写错了，请检查一下，或者是第2行的‘位置类型’数据填写有误，查询不到";
                    }else{
                        return "第"+flag+"行的位置类型"+"数据填写有误，查询不到此数据请重新填写";
                    }
                }
                ihi.setTYPE(str);
                seckillDao.insertIPC(ihi);
            }

        }
        return "导入数据成功，共导入"+demoExcels.size()+"条数据.....";
    }
}
