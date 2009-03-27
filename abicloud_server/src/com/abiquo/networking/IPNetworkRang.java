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
package com.abiquo.networking;

/**
 * This class provides a Rang of IP's available for a given DataCenter.
 * 
 * @author abiquo
 */
public class IPNetworkRang
{
    private IPAddress firstAddress;

    private IPAddress lastAddress;

    private Integer numberOfNodes;

    /**
     * Default constructor
     */
    IPNetworkRang()
    {

    }

    /**
     * Sets all the class variables in the constructor.
     * 
     * @param firstAddress
     * @param lastAddress
     * @param numberOfNodes
     */
    IPNetworkRang(IPAddress firstAddress, IPAddress lastAddress, Integer numberOfNodes)
    {
        this.firstAddress = firstAddress;
        this.lastAddress = lastAddress;
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * @return the firstAddress
     */
    public IPAddress getFirstAddress()
    {
        return firstAddress;
    }

    /**
     * @param firstAddress the firstAddress to set
     */
    public void setFirstAddress(IPAddress firstAddress)
    {
        this.firstAddress = firstAddress;
    }

    /**
     * @return the lastAddress
     */
    public IPAddress getLastAddress()
    {
        return lastAddress;
    }

    /**
     * @param lastAddress the lastAddress to set
     */
    public void setLastAddress(IPAddress lastAddress)
    {
        this.lastAddress = lastAddress;
    }

    /**
     * @return the numberOfNodes
     */
    public Integer getNumberOfNodes()
    {
        return numberOfNodes;
    }

    /**
     * @param numberOfNodes the numberOfNodes to set
     */
    public void setNumberOfNodes(Integer numberOfNodes)
    {
        this.numberOfNodes = numberOfNodes;
    }

};
