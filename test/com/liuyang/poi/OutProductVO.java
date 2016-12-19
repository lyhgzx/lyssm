package com.liuyang.poi;

import java.util.Date;

public class OutProductVO
{
	//客户
     private String customName;
   //订单号
     private int contractNo;
     //货号
     private int cnumber;
   //工厂
     private String factoryName;
     private String exts;
     //工厂交期
     private Date deliveryPeriod;
     //船期
     private Date spipTime;
     //贸易条款
     private String tradeTerms;
	public String getCustomName()
	{
		return customName;
	}
	public void setCustomName(String customName)
	{
		this.customName = customName;
	}
	public int getContractNo()
	{
		return contractNo;
	}
	public void setContractNo(int contractNo)
	{
		this.contractNo = contractNo;
	}
	public int getCnumber()
	{
		return cnumber;
	}
	public void setCnumber(int cnumber)
	{
		this.cnumber = cnumber;
	}
	public String getFactoryName()
	{
		return factoryName;
	}
	public void setFactoryName(String factoryName)
	{
		this.factoryName = factoryName;
	}
	public String getExts()
	{
		return exts;
	}
	public void setExts(String exts)
	{
		this.exts = exts;
	}
	public Date getDeliveryPeriod()
	{
		return deliveryPeriod;
	}
	public void setDeliveryPeriod(Date deliveryPeriod)
	{
		this.deliveryPeriod = deliveryPeriod;
	}
	public Date getSpipTime()
	{
		return spipTime;
	}
	public void setSpipTime(Date spipTime)
	{
		this.spipTime = spipTime;
	}
	public String getTradeTerms()
	{
		return tradeTerms;
	}
	public void setTradeTerms(String tradeTerms)
	{
		this.tradeTerms = tradeTerms;
	}
	public OutProductVO(String customName, int contractNo, int cnumber, String factoryName, String exts,
			Date deliveryPeriod, Date spipTime, String tradeTerms)
	{
		super();
		this.customName = customName;
		this.contractNo = contractNo;
		this.cnumber = cnumber;
		this.factoryName = factoryName;
		this.exts = exts;
		this.deliveryPeriod = deliveryPeriod;
		this.spipTime = spipTime;
		this.tradeTerms = tradeTerms;
	}
	public OutProductVO()
	{
		
	}
	@Override
	public String toString()
	{
		return "OutProductVO [customName=" + customName + ", contractNo=" + contractNo + ", cnumber=" + cnumber
				+ ", factoryName=" + factoryName + ", exts=" + exts + ", deliveryPeriod=" + deliveryPeriod
				+ ", spipTime=" + spipTime + ", tradeTerms=" + tradeTerms + "]";
	}
     
     
}
