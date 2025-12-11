package com.dao;

import com.entity.ShiyirenqunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyirenqunVO;
import com.entity.view.ShiyirenqunView;


/**
 * 适宜人群
 * 
 * @author 
 * @email 
 * @date 2025-04-11 15:10:46
 */
public interface ShiyirenqunDao extends BaseMapper<ShiyirenqunEntity> {
	
	List<ShiyirenqunVO> selectListVO(@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);
	
	ShiyirenqunVO selectVO(@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);
	
	List<ShiyirenqunView> selectListView(@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);

	List<ShiyirenqunView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);

	
	ShiyirenqunView selectView(@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);
	

}
