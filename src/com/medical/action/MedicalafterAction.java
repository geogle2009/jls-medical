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
			result = "没有权限！";
			return "result";
		}
		return SUCCESS;
	}
	
	public String afterquerymember(){
		//查询人员基本信息
		baseinfos = this.baseinfoService.findMemberByPaperId(baseInfoDTO);
		if(baseinfos.size()==0){
			result = "没有此人信息，请核实！";
			return "result";
		}
		//查询人员医后报销信息

		return SUCCESS;
	}
	public String afterapplyinit(){
		//查询人员基本信息
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
