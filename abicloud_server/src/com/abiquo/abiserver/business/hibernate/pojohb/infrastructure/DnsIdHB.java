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
package com.abiquo.abiserver.business.hibernate.pojohb.infrastructure;

// Generated 16-oct-2008 16:52:14 by Hibernate Tools 3.2.1.GA

/**
 * DnsId generated by hbm2java
 */
public class DnsIdHB implements java.io.Serializable {

	private static final long serialVersionUID = 9017235271519515433L;
	
	private int idDns;
	private int idNetworkModule;
	private int idPhysicalMachine;

	public DnsIdHB() {
	}

	public DnsIdHB(int idDns, int idNetworkModule, int idPhysicalMachine) {
		this.idDns = idDns;
		this.idNetworkModule = idNetworkModule;
		this.idPhysicalMachine = idPhysicalMachine;
	}

	public int getIdDns() {
		return this.idDns;
	}

	public void setIdDns(int idDns) {
		this.idDns = idDns;
	}

	public int getIdNetworkModule() {
		return this.idNetworkModule;
	}

	public void setIdNetworkModule(int idNetworkModule) {
		this.idNetworkModule = idNetworkModule;
	}

	public int getIdPhysicalMachine() {
		return this.idPhysicalMachine;
	}

	public void setIdPhysicalMachine(int idPhysicalMachine) {
		this.idPhysicalMachine = idPhysicalMachine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DnsIdHB))
			return false;
		DnsIdHB castOther = (DnsIdHB) other;

		return (this.getIdDns() == castOther.getIdDns())
				&& (this.getIdNetworkModule() == castOther.getIdNetworkModule())
				&& (this.getIdPhysicalMachine() == castOther
						.getIdPhysicalMachine());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDns();
		result = 37 * result + this.getIdNetworkModule();
		result = 37 * result + this.getIdPhysicalMachine();
		return result;
	}

}
