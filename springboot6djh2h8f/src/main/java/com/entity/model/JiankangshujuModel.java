package com.entity.model;

import com.entity.JiankangshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-04-11 15:10:46
 */
public class JiankangshujuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 身高(cm)
	 */
	
	private Double shengao;
		
	/**
	 * 体重(kg)
	 */
	
	private Double tizhong;
		
	/**
	 * 心率(次/分钟)
	 */
	
	private Double xinlv;
		
	/**
	 * 血压(mmHg)
	 */
	
	private Double xueya;
		
	/**
	 * 体脂率
	 */
	
	private Double tizhilv;
		
	/**
	 * 血糖(mmHg)
	 */
	
	private Double xuetang;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
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
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：身高(cm)
	 */
	 
	public void setShengao(Double shengao) {
		this.shengao = shengao;
	}
	
	/**
	 * 获取：身高(cm)
	 */
	public Double getShengao() {
		return shengao;
	}
				
	
	/**
	 * 设置：体重(kg)
	 */
	 
	public void setTizhong(Double tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：体重(kg)
	 */
	public Double getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：心率(次/分钟)
	 */
	 
	public void setXinlv(Double xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率(次/分钟)
	 */
	public Double getXinlv() {
		return xinlv;
	}
				
	
	/**
	 * 设置：血压(mmHg)
	 */
	 
	public void setXueya(Double xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压(mmHg)
	 */
	public Double getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：体脂率
	 */
	 
	public void setTizhilv(Double tizhilv) {
		this.tizhilv = tizhilv;
	}
	
	/**
	 * 获取：体脂率
	 */
	public Double getTizhilv() {
		return tizhilv;
	}
				
	
	/**
	 * 设置：血糖(mmHg)
	 */
	 
	public void setXuetang(Double xuetang) {
		this.xuetang = xuetang;
	}
	
	/**
	 * 获取：血糖(mmHg)
	 */
	public Double getXuetang() {
		return xuetang;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
