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
package com.abiquo.abiserver.business.hibernate.pojohb.authorization;

import com.abiquo.abiserver.business.hibernate.pojohb.IPojoHB;
import com.abiquo.abiserver.business.hibernate.pojohb.user.RoleHB;
import com.abiquo.abiserver.pojo.IPojo;
import com.abiquo.abiserver.pojo.authorization.Group;
import com.abiquo.abiserver.pojo.authorization.Resource;
import com.abiquo.abiserver.pojo.user.Role;


// Generated 17-oct-2008 18:40:48 by Hibernate Tools 3.2.1.GA

/**
 * AuthServerresource generated by hbm2java
 */
public class AuthResourceHB implements java.io.Serializable, IPojoHB {

	private static final long serialVersionUID = -7686797625448816736L;
	
	private Integer id;
	private String name;
	private String description;
	private AuthGroupHB authGroupHB;
	private RoleHB roleHB;

	public AuthResourceHB() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public AuthGroupHB getAuthGroupHB() {
		return authGroupHB;
	}

	public void setAuthGroupHB(AuthGroupHB authGroupHB) {
		this.authGroupHB = authGroupHB;
	}

	public RoleHB getRoleHB() {
		return roleHB;
	}

	public void setRoleHB(RoleHB roleHB) {
		this.roleHB = roleHB;
	}

	public IPojo toPojo() {
		
		Resource resource = new Resource();
		
		resource.setId(this.id);
		resource.setName(this.name);
		resource.setDescription(this.description);
		resource.setGroup((Group) this.authGroupHB.toPojo());
		resource.setRole((Role) this.roleHB.toPojo());
		
		return resource;
	}

}