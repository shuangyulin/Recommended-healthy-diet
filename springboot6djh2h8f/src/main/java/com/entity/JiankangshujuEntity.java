package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-04-11 15:10:46
 */
@TableName("jiankangshuju")
public class JiankangshujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangshujuEntity() {
		
	}
	
	public JiankangshujuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
