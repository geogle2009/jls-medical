package com.medical.service;

import java.util.List;

import com.medical.common.Pager;
import com.medical.dto.CheckDTO;
import com.medical.dto.HealthDTO;

public interface BaseinfoService {
	// 低保户信息列表查询
	public List<HealthDTO> findForperson(HealthDTO healthDTO, String orgno);

	// 根据人员Id查询出人员信息
	public HealthDTO findByMemberId(String memberId,String ds);

	public String getToolsmenu();
	
	// 信息核对信息列表查询
	public List<CheckDTO> findAllMemberInfo(String url, Integer curpage,
			String sql);
	
	public Pager getPager();
	
	public CheckDTO findMemberInfo(CheckDTO checkDTO);
	
	public int updateTestSsn(CheckDTO checkDTO);
}
