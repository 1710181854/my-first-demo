package com.example.importexcel.controller;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.example.importexcel.Entity.Iacs_Host_Nvr;
import com.example.importexcel.Entity.Iacs_host_ipc;
import com.example.importexcel.Entity.JsonResult;
import com.example.importexcel.Entity.Person;
import com.example.importexcel.Service.Insert;
import com.example.importexcel.util.ExcelUtiles;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*import com.zzf.finals.repository.DemoExcelRepository;
import com.zzf.finals.service.DemoService;*/

@Controller
@RequestMapping("/Excel")
public class ExcelController {
@Autowired
private Insert is;

    @RequestMapping(value = "/export",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult export( HttpServletResponse response){
        //模拟从数据库获取需要导出的数据
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("姓名","年龄","性别");
        Person p2 = new Person("1","2","3");
        personList.add(p1);
        personList.add(p2);
        System.out.println("冲突31");
        System.out.println("冲突41");
        ExcelUtiles.exportExcel(personList,"","1111",Person.class,"海贼王.xls",false,response);
        return  new JsonResult();
    }


/*
    @Autowired
    private DemoExcelRepository demoExcelRepository;

    @Autowired
    private DemoService demoService;

    @GetMapping("/export")
    public void export(HttpServletResponse response) {
        System.out.println(1);
//        模拟从数据库获取需要导出的数据
        List<DemoExcel> personList = demoExcelRepository.findAll();
//         导出操作
        ExcelUtiles.exportExcel(personList, "测试名", "什么名字", DemoExcel.class, "测试.xls", response);

    }*/
//方法

    @PostMapping("/importExcel2")
    @ResponseBody
    public JsonResult importExcel2(@RequestParam("file") MultipartFile file, String filename) {
     Iacs_Host_Nvr ihn;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook(new POIFSFileSystem(file.getInputStream()));
            HSSFSheet sheet=workbook.getSheetAt(0);
            int phyrows=sheet.getPhysicalNumberOfRows();
            for (int i=1;i<phyrows;i++){
                HSSFRow row =sheet.getRow(i);
                int phycells=row.getPhysicalNumberOfCells();
                ihn=new Iacs_Host_Nvr();
                for(int j=0;j<phycells;j++){
                    HSSFCell cell=row.getCell(j);
                    if(j==0){
                        ihn.setCode(cell.getStringCellValue());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //
        String ReturnResult = "导入失败，请检查您的导入的表格格式是否正确";
       JsonResult jsonResult = new JsonResult();
        jsonResult.setStatus("1");
        jsonResult.setResult("0");
        jsonResult.setCode("000000");
        jsonResult.setMessage(ReturnResult);
        ExcelImportResult<Object> result = null;
        ImportParams importParams = new ImportParams();
        // 数据处理
      importParams.setHeadRows(1);
        importParams.setTitleRows(0);

        // 需要验证
        importParams.setNeedVerfiy(true);
        List<Object> successList = null;
        try {
            if("NVR".equals(filename)){
                Object ob=new Iacs_Host_Nvr();
                result = ExcelImportUtil.importExcelMore(file.getInputStream(), Iacs_Host_Nvr.class,
                        importParams);
                successList = result.getList();
            }else if("IPC".equals(filename)){
                //ipc
                Object ob = new Iacs_Host_Nvr();
                result = ExcelImportUtil.importExcelMore(file.getInputStream(), Iacs_host_ipc.class,
                        importParams);
                successList = result.getList();
            }
            ReturnResult = is.insertSeckill(successList);
            jsonResult.setMessage(ReturnResult);
            jsonResult.setResult(JsonResult.SUCCESS);

        } catch (IOException e) {

        } catch (Exception e) {

        }

        return jsonResult;
    }
}


