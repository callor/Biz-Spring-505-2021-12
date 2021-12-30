package com.callor.db.dao;

import java.util.List;

public interface GenericDao<VO, PK> {
	
	public List<VO> selectAll();
	public VO findById(PK pk);
	public Integer insert(VO vo);
	public Integer update(VO vo);
	public Integer delete(PK pk);
		
	public void create_table();

}
