package org.bzu.exp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ExpModel extends BaseModel{
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr1;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr2;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr3;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr4;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr5;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr6;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr7;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr8;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr9;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr10;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr11;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr12;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr13;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr14;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr15;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr16;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr17;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr18;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr19;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr20;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr21;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr22;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr23;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr24;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr25;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr26;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr27;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr28;

	@Basic(optional = true)
	@Column(nullable = true)
	private String attr29;
	
	@Basic(optional = true)
	@Column(nullable = true)
	private String attr30;
	
}
