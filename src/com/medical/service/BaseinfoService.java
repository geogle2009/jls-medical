package com.medical.service;

import java.util.List;

import com.medical.dto.HealthDTO;

public interface BaseinfoService {
	// �ͱ�����Ϣ�б��ѯ
	public List<HealthDTO> findForperson(HealthDTO healthDTO, String orgno);

	// ������ԱId��ѯ����Ա��Ϣ
	public HealthDTO findByMemberId(String memberId,String ds);

	public String getToolsmenu();
}
