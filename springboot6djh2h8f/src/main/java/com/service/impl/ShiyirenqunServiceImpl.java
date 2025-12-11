package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiyirenqunDao;
import com.entity.ShiyirenqunEntity;
import com.service.ShiyirenqunService;
import com.entity.vo.ShiyirenqunVO;
import com.entity.view.ShiyirenqunView;

@Service("shiyirenqunService")
public class ShiyirenqunServiceImpl extends ServiceImpl<ShiyirenqunDao, ShiyirenqunEntity> implements ShiyirenqunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyirenqunEntity> page = this.selectPage(
                new Query<ShiyirenqunEntity>(params).getPage(),
                new EntityWrapper<ShiyirenqunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyirenqunEntity> wrapper) {
		  Page<ShiyirenqunView> page =new Query<ShiyirenqunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShiyirenqunVO> selectListVO(Wrapper<ShiyirenqunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyirenqunVO selectVO(Wrapper<ShiyirenqunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyirenqunView> selectListView(Wrapper<ShiyirenqunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyirenqunView selectView(Wrapper<ShiyirenqunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
