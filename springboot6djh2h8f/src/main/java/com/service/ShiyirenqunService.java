package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyirenqunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyirenqunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyirenqunView;


/**
 * 适宜人群
 *
 * @author 
 * @email 
 * @date 2025-04-11 15:10:46
 */
public interface ShiyirenqunService extends IService<ShiyirenqunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyirenqunVO> selectListVO(Wrapper<ShiyirenqunEntity> wrapper);
   	
   	ShiyirenqunVO selectVO(@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);
   	
   	List<ShiyirenqunView> selectListView(Wrapper<ShiyirenqunEntity> wrapper);
   	
   	ShiyirenqunView selectView(@Param("ew") Wrapper<ShiyirenqunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyirenqunEntity> wrapper);

   	

}

