/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in 
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 * 
 * Software distributed under the License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * 
 * The Original Code is available at http://www.abiquo.com/.....
 * 
 * The Initial Developer of the Original Code is Soluciones Grid, S.L. (www.abiquo.com),
 * Consell de Cent 296, Principal 2�, 08007 Barcelona, Spain.
 * 
 * No portions of the Code have been created by third parties. 
 * All Rights Reserved.
 * 
 * Contributor(s): ______________________________________.
 * 
 * Graphical User Interface of this software may be used under the terms
 * of the Common Public Attribution License Version 1.0 (the  "CPAL License", 
 * available at http://cpal.abiquo.com/), in which case the 
 * provisions of CPAL License are applicable instead of those above. In relation 
 * of this portions of the Code, a Legal Notice according to Exhibits A and B of 
 * CPAL Licence should be provided in any distribution of the corresponding Code 
 * to Graphical User Interface.
 */
package com.abiquo.abiserver.business.hibernate.pojohb.virtualimage;

// Generated 16-oct-2008 16:52:14 by Hibernate Tools 3.2.1.GA

import java.util.Date;

import com.abiquo.abiserver.business.hibernate.pojohb.IPojoHB;
import com.abiquo.abiserver.business.hibernate.pojohb.infrastructure.SoHB;
import com.abiquo.abiserver.business.hibernate.pojohb.user.UserHB;
import com.abiquo.abiserver.pojo.IPojo;
import com.abiquo.abiserver.pojo.infrastructure.SO;
import com.abiquo.abiserver.pojo.virtualimage.Category;
import com.abiquo.abiserver.pojo.virtualimage.Icon;
import com.abiquo.abiserver.pojo.virtualimage.Repository;
import com.abiquo.abiserver.pojo.virtualimage.VirtualImage;
import com.abiquo.abiserver.pojo.virtualimage.VirtualImageType;

/**
 * Virtualimage generated by hbm2java
 */
public class VirtualimageHB implements java.io.Serializable, IPojoHB {

	private static final long serialVersionUID = 5382640224567158959L;
	
	private Integer idImage;
	private UserHB userHBByIdUserLastModification;
	private RepositoryHB repository;
	private UserHB userHBByIdUserCreation;
	private SoHB so;
	private IconHB icon;
	private CategoryHB category;
	private String name;
	private String description;
	private String pathName;
	private Long hdRequired;
	private Integer ramRequired;
	private Integer cpuRequired;
	private int treaty;
	private int deleted;
	private Date creationDate;
	private Date lastModificationDate;
	private VirtualimageTypeHB virtualimageTypeHB;

	public VirtualimageHB() {
	}

	public VirtualimageHB(RepositoryHB repository, UserHB userHBByIdUserCreation,
			CategoryHB category, String name, String pathName, int treaty,
			int deleted, Date creationDate) {
		this.repository = repository;
		this.userHBByIdUserCreation = userHBByIdUserCreation;
		this.category = category;
		this.name = name;
		this.pathName = pathName;
		this.treaty = treaty;
		this.deleted = deleted;
		this.creationDate = creationDate;
	}

	public VirtualimageHB(UserHB userHBByIdUserLastModification,
			RepositoryHB repository, UserHB userHBByIdUserCreation, SoHB so, IconHB icon,
			CategoryHB category, String name, String description,
			String pathName, Long hdRequired, Integer ramRequired,
			Integer cpuRequired, int treaty, int deleted, Date creationDate,
			Date lastModificationDate) {
		this.userHBByIdUserLastModification = userHBByIdUserLastModification;
		this.repository = repository;
		this.userHBByIdUserCreation = userHBByIdUserCreation;
		this.so = so;
		this.icon = icon;
		this.category = category;
		this.name = name;
		this.description = description;
		this.pathName = pathName;
		this.hdRequired = hdRequired;
		this.ramRequired = ramRequired;
		this.cpuRequired = cpuRequired;
		this.treaty = treaty;
		this.deleted = deleted;
		this.creationDate = creationDate;
		this.lastModificationDate = lastModificationDate;
	}

	public Integer getIdImage() {
		return this.idImage;
	}

	public void setIdImage(Integer idImage) {
		this.idImage = idImage;
	}

	public UserHB getUserHBByIdUserLastModification() {
		return this.userHBByIdUserLastModification;
	}

	public void setUserHBByIdUserLastModification(
			UserHB userHBByIdUserLastModification) {
		this.userHBByIdUserLastModification = userHBByIdUserLastModification;
	}

	public RepositoryHB getRepository() {
		return this.repository;
	}

	public void setRepository(RepositoryHB repository) {
		this.repository = repository;
	}

	public UserHB getUserHBByIdUserCreation() {
		return this.userHBByIdUserCreation;
	}

	public void setUserHBByIdUserCreation(UserHB userHBByIdUserCreation) {
		this.userHBByIdUserCreation = userHBByIdUserCreation;
	}

	public SoHB getSo() {
		return this.so;
	}

	public void setSo(SoHB so) {
		this.so = so;
	}

	public IconHB getIcon() {
		return this.icon;
	}

	public void setIcon(IconHB icon) {
		this.icon = icon;
	}

	public CategoryHB getCategory() {
		return this.category;
	}
	
	public void setCategory(CategoryHB category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public Long getHdRequired() {
		return this.hdRequired;
	}

	public void setHdRequired(Long hdRequired) {
		this.hdRequired = hdRequired;
	}

	public Integer getRamRequired() {
		return this.ramRequired;
	}

	public void setRamRequired(Integer ramRequired) {
		this.ramRequired = ramRequired;
	}

	public Integer getCpuRequired() {
		return this.cpuRequired;
	}

	public void setCpuRequired(Integer cpuRequired) {
		this.cpuRequired = cpuRequired;
	}

	public int getTreaty() {
		return this.treaty;
	}

	public void setTreaty(int treaty) {
		this.treaty = treaty;
	}

	public int getDeleted() {
		return this.deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModificationDate() {
		return this.lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public VirtualimageTypeHB getVirtualimageTypeHB() {
		return virtualimageTypeHB;
	}

	public void setVirtualimageTypeHB(VirtualimageTypeHB virtualImageTypeHB) {
		this.virtualimageTypeHB = virtualImageTypeHB;
	}

	public IPojo toPojo()
	{
		VirtualImage virtualImage = new VirtualImage();
		virtualImage.setCategory((Category)this.category.toPojo());
		virtualImage.setCpuRequired(this.cpuRequired);
		virtualImage.setDeleted(this.deleted != 0);
		virtualImage.setDescription(this.description);
		virtualImage.setHdRequired(this.hdRequired);
		if(this.icon != null)
			virtualImage.setIcon((Icon)this.icon.toPojo());
		else
			virtualImage.setIcon(null);
		virtualImage.setId(this.idImage);
		virtualImage.setName(this.name);
		virtualImage.setPath(this.pathName);
		virtualImage.setRamRequired(this.ramRequired);
		virtualImage.setRepository((Repository)this.repository.toPojo());
		virtualImage.setSo((SO)this.so.toPojo());
		virtualImage.setVirtualImageType((VirtualImageType) this.virtualimageTypeHB.toPojo());
		return virtualImage;
	}
}