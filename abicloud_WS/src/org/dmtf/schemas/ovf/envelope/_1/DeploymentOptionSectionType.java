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
 * Consell de Cent 296 principal 2�, 08007 Barcelona, Spain.
 * No portions of the Code have been created by third parties. 
 * All Rights Reserved.
 * 
 * Contributor(s): ______________________________________.
 * 
 * Graphical User Interface of this software may be used under the terms
 * of the Common Public Attribution License Version 1.0 (the  "CPAL License",
 * available at http://cpal.abiquo.com), in which case the provisions of CPAL
 * License are applicable instead of those above. In relation of this portions 
 * of the Code, a Legal Notice according to Exhibits A and B of CPAL Licence 
 * should be provided in any distribution of the corresponding Code to Graphical
 * User Interface.
 */
package org.dmtf.schemas.ovf.envelope._1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Enumeration of discrete deployment options
 * <p>
 * Java class for DeploymentOptionSection_Type complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;DeploymentOptionSection_Type&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Section_Type&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;Configuration&quot; maxOccurs=&quot;unbounded&quot;&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name=&quot;Label&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot;/&gt;
 *                   &lt;element name=&quot;Description&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot;/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name=&quot;id&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                 &lt;attribute name=&quot;default&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;false&quot; /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeploymentOptionSection_Type", propOrder = {"configuration"})
public class DeploymentOptionSectionType extends SectionType
{

    @XmlElement(name = "Configuration", required = true)
    protected List<DeploymentOptionSectionType.Configuration> configuration;

    /**
     * Gets the value of the configuration property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the configuration property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getConfiguration().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeploymentOptionSectionType.Configuration }
     */
    public List<DeploymentOptionSectionType.Configuration> getConfiguration()
    {
        if (configuration == null)
        {
            configuration = new ArrayList<DeploymentOptionSectionType.Configuration>();
        }
        return this.configuration;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
     *       &lt;sequence&gt;
     *         &lt;element name=&quot;Label&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot;/&gt;
     *         &lt;element name=&quot;Description&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot;/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name=&quot;id&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
     *       &lt;attribute name=&quot;default&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;false&quot; /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"label", "description"})
    public static class Configuration
    {

        @XmlElement(name = "Label", required = true)
        protected MsgType label;

        @XmlElement(name = "Description", required = true)
        protected MsgType description;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1", required = true)
        protected String id;

        @XmlAttribute(name = "default", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected Boolean _default;

        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the label property.
         * 
         * @return possible object is {@link MsgType }
         */
        public MsgType getLabel()
        {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value allowed object is {@link MsgType }
         */
        public void setLabel(MsgType value)
        {
            this.label = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return possible object is {@link MsgType }
         */
        public MsgType getDescription()
        {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value allowed object is {@link MsgType }
         */
        public void setDescription(MsgType value)
        {
            this.description = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }

        /**
         * Gets the value of the default property.
         * 
         * @return possible object is {@link Boolean }
         */
        public boolean isDefault()
        {
            if (_default == null)
            {
                return false;
            }
            else
            {
                return _default;
            }
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value allowed object is {@link Boolean }
         */
        public void setDefault(Boolean value)
        {
            this._default = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this
         * class.
         * <p>
         * the map is keyed by the name of the attribute and the value is the string value of the
         * attribute. the map returned by this method is live, and you can add new attribute by
         * updating the map directly. Because of this design, there's no setter.
         * 
         * @return always non-null
         */
        public Map<QName, String> getOtherAttributes()
        {
            return otherAttributes;
        }

    }

}
