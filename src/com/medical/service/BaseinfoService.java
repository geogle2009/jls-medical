package com.medical.service;

import java.util.List;

import com.medical.common.Pager;
import com.medical.dto.CheckDTO;
import com.medical.dto.HealthDTO;

public interface BaseinfoService {
	// �ͱ�����Ϣ�б��ѯ
	public List<HealthDTO> findForperson(HealthDTO healthDTO, String orgno);

	// ������ԱId��ѯ����Ա��Ϣ
	public HealthDTO findByMemberId(String memberId,String ds);

	public String getToolsmenu();
	
	// ��Ϣ�˶���Ϣ�б��ѯ
	public List<CheckDTO> findAllMemberInfo(String url, Integer curpage,
			String sql);
	
	public Pager getPager();
	
	public CheckDTO findMemberInfo(CheckDTO checkDTO);
	
	public int updateTestSsn(CheckDTO checkDTO);
}
