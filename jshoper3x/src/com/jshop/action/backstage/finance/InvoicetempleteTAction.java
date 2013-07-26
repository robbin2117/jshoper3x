package com.jshop.action.backstage.finance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Controller;

import com.jshop.action.backstage.tools.Serial;
import com.jshop.action.backstage.tools.Validate;
import com.jshop.entity.InvoicetempleteT;
import com.jshop.service.InvoicetempleteTService;
import com.opensymphony.xwork2.ActionSupport;
@Namespace("")
@ParentPackage("jshop")
public class InvoicetempleteTAction extends ActionSupport {
	private Serial serial;
	private InvoicetempleteTService invoicetempleteTService;
	private String invoicetempleteid;
	private String logisticsid;
	private String state;
	private String kindeditorCode;
	private String invoiceCode;
	private InvoicetempleteT beanlist = new InvoicetempleteT();
	private List rows = new ArrayList();
	private int rp;
	private int page = 1;
	private int total = 0;
	private boolean slogin;
	private String usession;
	@JSON(serialize = false)
	public Serial getSerial() {
		return serial;
	}

	public void setSerial(Serial serial) {
		this.serial = serial;
	}
	@JSON(serialize = false)
	public InvoicetempleteTService getInvoicetempleteTService() {
		return invoicetempleteTService;
	}

	public void setInvoicetempleteTService(InvoicetempleteTService invoicetempleteTService) {
		this.invoicetempleteTService = invoicetempleteTService;
	}

	public String getInvoicetempleteid() {
		return invoicetempleteid;
	}

	public void setInvoicetempleteid(String invoicetempleteid) {
		this.invoicetempleteid = invoicetempleteid;
	}

	public String getLogisticsid() {
		return logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getKindeditorCode() {
		return kindeditorCode;
	}

	public void setKindeditorCode(String kindeditorCode) {
		this.kindeditorCode = kindeditorCode;
	}

	public InvoicetempleteT getBeanlist() {
		return beanlist;
	}

	public void setBeanlist(InvoicetempleteT beanlist) {
		this.beanlist = beanlist;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public int getRp() {
		return rp;
	}

	public void setRp(int rp) {
		this.rp = rp;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isSlogin() {
		return slogin;
	}

	public void setSlogin(boolean slogin) {
		this.slogin = slogin;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getUsession() {
		return usession;
	}

	public void setUsession(String usession) {
		this.usession = usession;
	}

	/**
	 *清理错误
	 */
	@Override
	public void validate() {
		this.clearErrorsAndMessages();

	}

	/**
	 * 增加发货单模板
	 * 
	 * @return
	 */
	@Action(value = "addInvoiceTemplete", results = { 
			@Result(name = "success", type="redirect",location = "/jshop/admin/setting/invoicetempleteset.jsp?session=${usession}"),
			@Result(name = "input", type="redirect",location = "/jshop/admin/setting/invoicetempleteset.jsp?session=${usession}")
	})
	public String addInvoiceTemplete() {
		
			InvoicetempleteT it = new InvoicetempleteT();
			it.setInvoicetempleteid(this.getSerial().Serialid(Serial.INVOICETEMPLATE));
			it.setLogisticsid(null);//暂无
			it.setState("1");//启用
			it.setKindeditorCode(this.getInvoiceCode());
			if (this.getInvoicetempleteTService().addInvoiceTemplete(it) > 0) {
				return SUCCESS;
			} else {
				return INPUT;
			}
		
		
	}

	/**
	 * 查询所有发货单模板
	 * 
	 * @return
	 */
	@Action(value="findAllInvoicetempleteT",results={
			@Result(name="json",type="json")
	})
	public String findAllInvoicetempleteT() {
		int currentPage = page;
		int lineSize = rp;
		List<InvoicetempleteT> list = this.getInvoicetempleteTService().findAllInvoicetempleteT(currentPage, lineSize);
		if (list != null) {
			total = this.getInvoicetempleteTService().countfindAllInvoicetempleteT();
			rows.clear();
			for (Iterator it = list.iterator(); it.hasNext();) {
				InvoicetempleteT itt = (InvoicetempleteT) it.next();
				if (itt.getState().equals("1")) {
					itt.setState("使用");
				}
				if (itt.getState().equals("0")) {
					itt.setState("禁用");
				}
				Map<String, Object> cellMap = new HashMap<String, Object>();
				cellMap.put("id", itt.getInvoicetempleteid());
				cellMap.put("cell", new Object[] {itt.getInvoicetempleteid(), itt.getState() });
				rows.add(cellMap);
			}
			return "json";

		}
		this.setTotal(0);
		rows.clear();
		return "json";
	}

	/**
	 * 更新发货单模板
	 * 
	 * @return
	 */
	@Action(value = "UpdateInvoicetempleteT", results = { 
			@Result(name = "success", type="redirect",location = "/jshop/admin/setting/invoicetempletemanagement.jsp?session=${usession}"),
			@Result(name = "input", type="redirect",location = "/jshop/admin/setting/invoicetempletemanagement.jsp?session=${usession}")
	})
	public String UpdateInvoicetempleteT() {
		
			InvoicetempleteT it = new InvoicetempleteT();
			it.setInvoicetempleteid(this.getInvoicetempleteid().trim());
			it.setState(this.getState());
			it.setLogisticsid(null);
			it.setKindeditorCode(this.getInvoiceCode());
			int i = this.getInvoicetempleteTService().updateInvoicetempleteT(it);
			return SUCCESS;
	
		
	}

	/**
	 *删除发货单模板
	 * 
	 * @return
	 */
	@Action(value="DelInvoiceTemplete",results={
			@Result(name="json",type="json")
	})
	public String DelInvoiceTemplete() {
		if (Validate.StrNotNull(this.getInvoicetempleteid())) {
			String[] array = this.getInvoicetempleteid().trim().split(",");
			if (this.getInvoicetempleteTService().delInvoiceTemplete(array) > 0) {
				return "json";
			}
			return "json";
		}
		return "json";
	}

	/**
	 * 根据id获取发货单模板
	 * 
	 * @return
	 */
	@Action(value="findInvoicetempleteById",results={
			@Result(name="json",type="json")
	})
	public String findInvoicetempleteById() {
		if (Validate.StrNotNull(this.getInvoicetempleteid())) {
			beanlist = this.getInvoicetempleteTService().findInvoicetempleteById(this.getInvoicetempleteid().trim());
			if (beanlist != null) {
				return "json";
			}
		}
		return "json";
	}
}
