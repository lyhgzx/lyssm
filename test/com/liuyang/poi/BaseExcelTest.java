package com.liuyang.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;

import com.liuyang.poi.utils.ExcelPoiUtil;

public class BaseExcelTest
{
   @Test
   public void createExcel()throws Exception {


   }
   @Test
   public void createHSSFExcel1() throws Exception{
	   List<OutProductVO> dataList=new ArrayList<OutProductVO>();
	   SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   //创建一个工作簿
	   Workbook workbook=new HSSFWorkbook();
	   //创建一个sheet
	   Sheet sheet=workbook.createSheet();
	   Row nRow=null;
       Cell nCell=null;

       //行号
       int  rowNo=0;
       //列号
       int colNo=1;
       
       //声明样式对象和字体对象
       CellStyle nStyle=workbook.createCellStyle();
       Font font = workbook.createFont();
	   

       //列宽
       sheet.setColumnWidth(0,2*300);
       sheet.setColumnWidth(1,26*300);
       sheet.setColumnWidth(2,12*300);
       sheet.setColumnWidth(3,29*300);
       sheet.setColumnWidth(4,10*300);
       sheet.setColumnWidth(5,12*300);
       sheet.setColumnWidth(6,8*300);
       sheet.setColumnWidth(7,10*300);
       sheet.setColumnWidth(8,10*300);
       sheet.setColumnWidth(9,9*300);



       //大标题，合并单元格
       sheet.addMergedRegion(new CellRangeAddress(0,0,1,9));  //开始行，结束行，开始列，结束列
       //合并单元格的内容写在合并前第一个单元格中
       nRow=sheet.createRow(rowNo++);

       nRow.setHeightInPoints(36);
       
       nCell=nRow.createCell(1);
       nCell.setCellValue("2016-05-01".replace("-0", "年").replaceFirst("-", "年")+"月份出货表");
       nCell.setCellStyle(ExcelPoiUtil.bigTitle(workbook, nStyle, font));


       String[] title=new  String[]{"客户","订单号","货号","数量","工厂","附件","工厂交期","船期","贸易条款"  };

       nRow=sheet.createRow(rowNo++);
       nRow.setHeightInPoints(26.25f);

       //初始化
       nStyle=workbook.createCellStyle();
       font=workbook.createFont();

       for(int  i=0;i<title.length;i++){
           nCell=nRow.createCell(i+1);
           nCell.setCellValue(title[i]);
           nCell.setCellStyle(ExcelPoiUtil.Title(workbook, nStyle, font));

       }
       //初始化
       nStyle=workbook.createCellStyle();
       font=workbook.createFont();
     //换行
       for(int j=0;j<dataList.size();j++){
           OutProductVO op=dataList.get(j);
           colNo=1;

           nRow=sheet.createRow(rowNo++);

           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getCustomName());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getContractNo());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getContractNo());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getCnumber());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));



           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getFactoryName());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));



           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getExts());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(sdf.format(op.getDeliveryPeriod()));
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(sdf.format(op.getSpipTime()));
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getTradeTerms());
           nCell.setCellStyle(ExcelPoiUtil.Text(workbook, nStyle, font));


       }
       OutputStream  os=new FileOutputStream(new File("excel/aa.xls"));
       workbook.write(os);
       os.flush();
       os.close();

   }
   
   
   @Test
   public void createXSSFExcel2() throws Exception{
	   List<OutProductVO> dataList=new ArrayList<OutProductVO>();
	   SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   dataList.add(new OutProductVO("工程1", 1111, 1111, "工厂", "111", sdf.parse("2016/12/12 12:12:12") , sdf.parse("2016/12/12 12:12:12"), ""));
	   InputStream iStream=new FileInputStream(new File("excel/aa.xls"));
	   Workbook wb=new HSSFWorkbook(iStream);
	   Sheet sheet = wb.getSheetAt(0);
	   Row nRow=null;
       Cell nCell=null;

       //行号
       int  rowNo=0;
       //列号
       int colNo=1;
       //获取模板上的单元格样式

       nRow=sheet.getRow(2);
       //客户的样式
       nCell=nRow.getCell(1);
       CellStyle customStyle=nCell.getCellStyle();
       //订单的样式
       nCell=nRow.getCell(2);
       CellStyle contractNoStyle=nCell.getCellStyle();
       //货号的样式
       nCell=nRow.getCell(3);
       CellStyle productNoStyle=nCell.getCellStyle();
       //数量的样式
       nCell=nRow.getCell(4);
       CellStyle numStyle=nCell.getCellStyle();
       //生产厂家的样式
       nCell=nRow.getCell(5);
       CellStyle factoryStyle=nCell.getCellStyle();
       //日期的样式
       nCell=nRow.getCell(6);
       CellStyle dateStyle=nCell.getCellStyle();
       //贸易条款
       nCell=nRow.getCell(8);
       CellStyle tradeStyle=nCell.getCellStyle();
       
       nRow=sheet.getRow(rowNo++);//获取一个单元格对象
       nCell=nRow.getCell(colNo);//获取一个单元格对象
       nCell.setCellValue("2016-06-01".replace("-0", "年").replaceFirst("-", "年")+"月份出货表");
       //跳过静态表格头
       rowNo++;
     //换行
       for(int j=0;j<dataList.size();j++){
           OutProductVO op=dataList.get(j);
           colNo=1;

           nRow=sheet.createRow(rowNo++);

           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getCustomName());
           nCell.setCellStyle(customStyle);


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getContractNo());
           nCell.setCellStyle(contractNoStyle);


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getFactoryName());
           nCell.setCellStyle(productNoStyle);


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getCnumber());
           nCell.setCellStyle(numStyle);



           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getFactoryName());
           nCell.setCellStyle(factoryStyle);



           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getDeliveryPeriod());
           nCell.setCellStyle(dateStyle);


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getSpipTime());
           nCell.setCellStyle(dateStyle);


           nCell=nRow.createCell(colNo++);
           nCell.setCellValue(op.getTradeTerms());
           nCell.setCellStyle(tradeStyle);
       }

       OutputStream  os=new FileOutputStream(new File("excel/bb.xls"));
       wb.write(os);
       os.flush();
       os.close();
   }
}
