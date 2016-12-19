package com.liuyang.poi.utils;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelPoiUtil
{
	//大标题的样式
    public static CellStyle bigTitle(Workbook wb,CellStyle nStyle,Font font){
        font.setFontName("宋体");
        font.setFontHeightInPoints((short) 16); 
        //字体加粗
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        //横向居中
        nStyle.setAlignment(CellStyle.ALIGN_CENTER);
        //纵向居中
        nStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);     //单元格垂直居中

        nStyle.setFont(font);
        return nStyle;
    }

    //标题样式
    public static CellStyle Title(Workbook wb,CellStyle nStyle,Font font){
        font.setFontName("黑体");
        font.setFontHeightInPoints((short) 12); 

        //横向居中
        nStyle.setAlignment(CellStyle.ALIGN_CENTER);
        //纵向居中
        nStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);     //单元格垂直居中

        //表格线
        nStyle.setBorderTop(CellStyle.BORDER_THICK);            //粗实线
        nStyle.setBorderBottom(CellStyle.BORDER_THIN);          //实线
        nStyle.setBorderLeft(CellStyle.BORDER_THIN);            //比较粗实线
        nStyle.setBorderRight(CellStyle.BORDER_THIN);           //实线

        nStyle.setFont(font);
        return nStyle;
    }

    //文字样式
    public static CellStyle Text(Workbook wb,CellStyle nStyle,Font font){
        font.setFontName("Times New Roman");
        font.setFontHeightInPoints((short) 10); 

        //横向居中
        nStyle.setAlignment(CellStyle.ALIGN_CENTER);
        //纵向居中
        nStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);     //单元格垂直居中

        //表格线

        nStyle.setBorderBottom(CellStyle.BORDER_THIN);          //实线
        nStyle.setBorderLeft(CellStyle.BORDER_THIN);            //比较粗实线
        nStyle.setBorderRight(CellStyle.BORDER_THIN);           //实线

        nStyle.setFont(font);
        return nStyle;
    }
}
