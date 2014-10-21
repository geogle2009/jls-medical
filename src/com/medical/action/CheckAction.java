package com.medical.action;

import java.util.List;
import java.util.Map;

import com.medical.dto.CheckDTO;
import com.medical.dto.OrganDTO;
import com.medical.dto.UserInfoDTO;
import com.medical.service.BaseinfoService;
import com.medical.service.SearchService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<CheckDTO> cds;
	private Integer cur_page;
	private String toolsmenu;
	private CheckDTO checkDTO;
	private BaseinfoService baseinfoService;
	private List<OrganDTO> orgs;
	private SearchService searchService;
	private String term;
	private String operational;
	private String value;
	private String oid;
	
	
	@SuppressWarnings("rawtypes")
	public String checkQueryInit(){
		Map session = ActionContext.getContext().getSession();
		UserInfoDTO user = (UserInfoDTO) session.get("user");
		this.setOrgs(this.searchService.getOrganList(user.getOrganizationId()));
		return SUCCESS;
	}
 	// 医保卡查询
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String checkQuery() { 
		Map session = ActionContext.getContext().getSession();
		UserInfoDTO user = (UserInfoDTO) session.get("user");
		String sql = "";
		String jwhere = "";
		String var = value;
		if (null == cur_page || "".equals(cur_page)) {
			cur_page = 1;
			if (!"".equals(var)) {
				if ("=".equals(operational)) {
					var = " = '" + var + "'";
				} else if ("like".equals(operational)) {
					var = "like  '%" + var + "%'";
				} else {
					var = "";
				}
	
				if ("PAPERID".equals(term)) {
					jwhere = jwhere + " and mem.PAPERID  " + var;
				} else if ("FAMILYNO".equals(term)) {
					jwhere = jwhere + " and mem.FAMILYNO  " + var;
				} else if ("MEMBERNAME".equals(term)) {
					jwhere = jwhere + " and mem.MEMBERNAME  " + var;
				} else {
				}
			}
			sql = " select mem.member_id,mem.ds,mem.membername,mem.paperid,mem.familyno, " 
					+ " mem.ssn,ts.ssn1,ts.ssn2,ts.ssn3,mem.personstate,mem.assist_type,mem.asort "
					+ " from member_baseinfo mem left join test_ssn ts "
					+ " on mem.member_id = ts.member_id and mem.ds = ts.ds "
					+ " where mem.on_no like '" + oid + "%' "
					+ jwhere 
					+ " and mem.o_ps = '正常' and mem.ds = '1' ";
			session.put("sql", sql);
		} else {
			sql = (String) session.get("sql");
		}
		cds = baseinfoService
				.findAllMemberInfo(
						"checkQuery.action",
						cur_page, sql);
		setToolsmenu(baseinfoService.getPager().getToolsmenu());
		this.setOrgs(this.searchService.getOrganList(user.getOrganizationId()));
		return SUCCESS;
	}
	
 	// 医保卡核对查询
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String checkSsn() { 
		Map session = ActionContext.getContext().getSession();
		UserInfoDTO user = (UserInfoDTO) session.get("user");
		String sql = "";
		String jwhere = "";
		String var = value;
		if (null == cur_page || "".equals(cur_page)) {
			cur_page = 1;
			if (!"".equals(var)) {
				if ("=".equals(operational)) {
					var = " = '" + var + "'";
				} else if ("like".equals(operational)) {
					var = "like  '%" + var + "%'";
				} else {
					var = "";
				}
	
				if ("PAPERID".equals(term)) {
					jwhere = jwhere + " and mem.PAPERID  " + var;
				} else if ("FAMILYNO".equals(term)) {
					jwhere = jwhere + " and mem.FAMILYNO  " + var;
				} else if ("MEMBERNAME".equals(term)) {
					jwhere = jwhere + " and mem.MEMBERNAME  " + var;
				} else {
				}
			}
			sql = " select mem.member_id,mem.ds,mem.membername,mem.paperid,mem.familyno, " 
					+ " mem.ssn,ts.ssn1,ts.ssn2,ts.ssn3,mem.personstate,mem.assist_type,mem.asort "
					+ " from member_baseinfo mem left join test_ssn ts "
					+ " on mem.member_id = ts.member_id and mem.ds = ts.ds "
					+ " where mem.on_no like '" + oid + "%' "
					+ jwhere 
					+ " and mem.o_ps = '正常' and mem.ds = '1' "
					+ " and mem.ssn is null ";
			session.put("sql", sql);
		} else {
			sql = (String) session.get("sql");
		}
		cds = baseinfoService
				.findAllMemberInfo(
						"checkSsn.action",
						cur_page, sql);
		setToolsmenu(baseinfoService.getPager().getToolsmenu());
		this.setOrgs(this.searchService.getOrganList(user.getOrganizationId()));
		return SUCCESS;
	}
	
	@SuppressWarnings("rawtypes")
	public String checkSsnInit(){
		Map session = ActionContext.getContext().getSession();
		UserInfoDTO user = (UserInfoDTO) session.get("user");
		this.setOrgs(this.searchService.getOrganList(user.getOrganizationId()));
		return SUCCESS;
	}

	public Integer getCur_page() {
		return cur_page;
	}

	public void setCur_page(Integer cur_page) {
		this.cur_page = cur_page;
	}

	public String getToolsmenu() {
		return toolsmenu;
	}

	public void setToolsmenu(String toolsmenu) {
		this.toolsmenu = toolsmenu;
	}

	public List<CheckDTO> getCds() {
		return cds;
	}

	public void setCds(List<CheckDTO> cds) {
		this.cds = cds;
	}

	public BaseinfoService getBaseinfoService() {
		return baseinfoService;
	}

	public void setBaseinfoService(BaseinfoService baseinfoService) {
		this.baseinfoService = baseinfoService;
	}

	public CheckDTO getCheckDTO() {
		return checkDTO;
	}

	public void setCheckDTO(CheckDTO checkDTO) {
		this.checkDTO = checkDTO;
	}
	public List<OrganDTO> getOrgs() {
		return orgs;
	}
	public void setOrgs(List<OrganDTO> orgs) {
		this.orgs = orgs;
	}
	public SearchService getSearchService() {
		return searchService;
	}
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getOperational() {
		return operational;
	}
	public void setOperational(String operational) {
		this.operational = operational;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
}
