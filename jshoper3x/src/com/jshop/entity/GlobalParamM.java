package com.jshop.entity;

// Generated 2013-9-1 10:07:10 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GlobalParamM generated by hbm2java
 */
@Entity
@Table(name = "global_param_m", catalog = "jshoper3")
public class GlobalParamM implements java.io.Serializable {

	private String gkey;
	private String gvalue;

	public GlobalParamM() {
	}

	public GlobalParamM(String gkey, String gvalue) {
		this.gkey = gkey;
		this.gvalue = gvalue;
	}

	@Id
	@Column(name = "GKEY", unique = true, nullable = false, length = 45)
	public String getGkey() {
		return this.gkey;
	}

	public void setGkey(String gkey) {
		this.gkey = gkey;
	}

	@Column(name = "GVALUE", nullable = false, length = 500)
	public String getGvalue() {
		return this.gvalue;
	}

	public void setGvalue(String gvalue) {
		this.gvalue = gvalue;
	}

}
