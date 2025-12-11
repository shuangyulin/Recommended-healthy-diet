package com.entity.vo;

import com.entity.YinshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食记录
 * @author 
 * @email 
 * @date 2025-04-11 15:10:46
 */
public class YinshijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 记录类型
	 */
	
	private String jiluleixing;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
		
	/**
	 * 分量
	 */
	
	private String fenliang;
		
	/**
	 * 饮食热量
	 */
	
	private Double yinshireliang;
		
	/**
	 * 饮食内容
	 */
	
	private String yinshineirong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：记录类型
	 */
	 
	public void setJiluleixing(String jiluleixing) {
		this.jiluleixing = jiluleixing;
	}
	
	/**
	 * 获取：记录类型
	 */
	public String getJiluleixing() {
		return jiluleixing;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
	}
				
	
	/**
	 * 设置：分量
	 */
	 
	public void setFenliang(String fenliang) {
		this.fenliang = fenliang;
	}
	
	/**
	 * 获取：分量
	 */
	public String getFenliang() {
		return fenliang;
	}
				
	
	/**
	 * 设置：饮食热量
	 */
	 
	public void setYinshireliang(Double yinshireliang) {
		this.yinshireliang = yinshireliang;
	}
	
	/**
	 * 获取：饮食热量
	 */
	public Double getYinshireliang() {
		return yinshireliang;
	}
				
	
	/**
	 * 设置：饮食内容
	 */
	 
	public void setYinshineirong(String yinshineirong) {
		this.yinshineirong = yinshineirong;
	}
	
	/**
	 * 获取：饮食内容
	 */
	public String getYinshineirong() {
		return yinshineirong;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
