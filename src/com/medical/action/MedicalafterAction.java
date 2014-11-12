package com.medical.action;

import java.util.List;
import java.util.Map;

import com.medical.dto.BaseInfoDTO;
import com.medical.dto.MedicalafterDTO;
import com.medical.dto.UserInfoDTO;
import com.medical.service.BaseinfoService;
import com.medical.service.SearchService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MedicalafterAction extends ActionSupport {
	private static final long serialVersionUID = -5126976226423666862L;
	private MedicalafterDTO medicalafterDTO ;
	private List<MedicalafterDTO> medicalafters;
	private BaseinfoService baseinfoService;
	private SearchService searchService;
	private BaseInfoDTO baseInfoDTO;
	private List<BaseInfoDTO> baseinfos;
	private String result;
	
	@SuppressWarnings("rawtypes")
	public String afterquerymemberinit(){
		Map session = ActionContext.getContext().getSession();
		UserInfoDTO user = (UserInfoDTO) session.get("user");
		if(user.getOrganizationId().length()==4){
			
		}else{
			result = "û��Ȩ�ޣ�";
			return "result";
		}
		return SUCCESS;
	}
	
	public String afterquerymember(){
		//��ѯ��Ա������Ϣ
		baseinfos = this.baseinfoService.findMemberByPaperId(baseInfoDTO);
		if(baseinfos.size()==0){
			result = "û�д�����Ϣ�����ʵ��";
			return "result";
		}
		//��ѯ��Աҽ������Ϣ

		return SUCCESS;
	}
	public String afterapplyinit(){
		//��ѯ��Ա������Ϣ
		medicalafterDTO = this.baseinfoService.findMemberByID(baseInfoDTO);
		return SUCCESS;
	}
	public String afterapply(){
		System.out.println(medicalafterDTO.toString());
		medicalafterDTO = this.baseinfoService.saveAfterApply(medicalafterDTO);
		return SUCCESS;
	}

	public BaseinfoService getBaseinfoService() {
		return baseinfoService;
	}

	public void setBaseinfoService(BaseinfoService baseinfoService) {
		this.baseinfoService = baseinfoService;
	}

	public SearchService getSearchService() {
		return searchService;
	}

	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

	public List<MedicalafterDTO> getMedicalafters() {
		return medicalafters;
	}

	public void setMedicalafters(List<MedicalafterDTO> medicalafters) {
		this.medicalafters = medicalafters;
	}
	public MedicalafterDTO getMedicalafterDTO() {
		return medicalafterDTO;
	}
	public void setMedicalafterDTO(MedicalafterDTO medicalafterDTO) {
		this.medicalafterDTO = medicalafterDTO;
	}
	public BaseInfoDTO getBaseInfoDTO() {
		return baseInfoDTO;
	}
	public void setBaseInfoDTO(BaseInfoDTO baseInfoDTO) {
		this.baseInfoDTO = baseInfoDTO;
	}
	public List<BaseInfoDTO> getBaseinfos() {
		return baseinfos;
	}
	public void setBaseinfos(List<BaseInfoDTO> baseinfos) {
		this.baseinfos = baseinfos;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
