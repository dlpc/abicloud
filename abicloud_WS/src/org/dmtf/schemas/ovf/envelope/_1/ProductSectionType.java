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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Product information for a virtual appliance
 * <p>
 * Java class for ProductSection_Type complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;ProductSection_Type&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Section_Type&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;Product&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;Vendor&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;Version&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;FullVersion&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;ProductUrl&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;VendorUrl&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;AppUrl&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;Icon&quot; maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                 &lt;attribute name=&quot;height&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}integer&quot; /&gt;
 *                 &lt;attribute name=&quot;width&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}integer&quot; /&gt;
 *                 &lt;attribute name=&quot;mimeType&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                 &lt;attribute name=&quot;fileRef&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice maxOccurs=&quot;unbounded&quot; minOccurs=&quot;0&quot;&gt;
 *           &lt;element name=&quot;Category&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot;/&gt;
 *           &lt;element name=&quot;Property&quot;&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name=&quot;Label&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot; minOccurs=&quot;0&quot;/&gt;
 *                     &lt;element name=&quot;Description&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot; minOccurs=&quot;0&quot;/&gt;
 *                     &lt;element name=&quot;Value&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}PropertyConfigurationValue_Type&quot; minOccurs=&quot;0&quot;/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name=&quot;key&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                   &lt;attribute name=&quot;type&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                   &lt;attribute name=&quot;qualifiers&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
 *                   &lt;attribute name=&quot;userConfigurable&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;false&quot; /&gt;
 *                   &lt;attribute name=&quot;runtimeConfigurable&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;false&quot; /&gt;
 *                   &lt;attribute name=&quot;defaultValue&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; default=&quot;&quot; /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name=&quot;class&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; default=&quot;&quot; /&gt;
 *       &lt;attribute name=&quot;instance&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; default=&quot;&quot; /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSection_Type", propOrder = {"product", "vendor", "version", "fullVersion",
"productUrl", "vendorUrl", "appUrl", "icon", "categoryOrProperty"})
public class ProductSectionType extends SectionType
{

    @XmlElement(name = "Product")
    protected MsgType product;

    @XmlElement(name = "Vendor")
    protected MsgType vendor;

    @XmlElement(name = "Version")
    protected String version;

    @XmlElement(name = "FullVersion")
    protected String fullVersion;

    @XmlElement(name = "ProductUrl")
    protected String productUrl;

    @XmlElement(name = "VendorUrl")
    protected String vendorUrl;

    @XmlElement(name = "AppUrl")
    protected String appUrl;

    @XmlElement(name = "Icon")
    protected List<ProductSectionType.Icon> icon;

    @XmlElements( {@XmlElement(name = "Category", type = MsgType.class),
    @XmlElement(name = "Property", type = ProductSectionType.Property.class)})
    protected List<Object> categoryOrProperty;

    @XmlAttribute(name = "class", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    protected String clazz;

    @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    protected String instance;

    /**
     * Gets the value of the product property.
     * 
     * @return possible object is {@link MsgType }
     */
    public MsgType getProduct()
    {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value allowed object is {@link MsgType }
     */
    public void setProduct(MsgType value)
    {
        this.product = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return possible object is {@link MsgType }
     */
    public MsgType getVendor()
    {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value allowed object is {@link MsgType }
     */
    public void setVendor(MsgType value)
    {
        this.vendor = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value)
    {
        this.version = value;
    }

    /**
     * Gets the value of the fullVersion property.
     * 
     * @return possible object is {@link String }
     */
    public String getFullVersion()
    {
        return fullVersion;
    }

    /**
     * Sets the value of the fullVersion property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setFullVersion(String value)
    {
        this.fullVersion = value;
    }

    /**
     * Gets the value of the productUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getProductUrl()
    {
        return productUrl;
    }

    /**
     * Sets the value of the productUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProductUrl(String value)
    {
        this.productUrl = value;
    }

    /**
     * Gets the value of the vendorUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getVendorUrl()
    {
        return vendorUrl;
    }

    /**
     * Sets the value of the vendorUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVendorUrl(String value)
    {
        this.vendorUrl = value;
    }

    /**
     * Gets the value of the appUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getAppUrl()
    {
        return appUrl;
    }

    /**
     * Sets the value of the appUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAppUrl(String value)
    {
        this.appUrl = value;
    }

    /**
     * Gets the value of the icon property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the icon property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIcon().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ProductSectionType.Icon }
     */
    public List<ProductSectionType.Icon> getIcon()
    {
        if (icon == null)
        {
            icon = new ArrayList<ProductSectionType.Icon>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the categoryOrProperty property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the categoryOrProperty property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCategoryOrProperty().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link MsgType }
     * {@link ProductSectionType.Property }
     */
    public List<Object> getCategoryOrProperty()
    {
        if (categoryOrProperty == null)
        {
            categoryOrProperty = new ArrayList<Object>();
        }
        return this.categoryOrProperty;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return possible object is {@link String }
     */
    public String getClazz()
    {
        if (clazz == null)
        {
            return "";
        }
        else
        {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setClazz(String value)
    {
        this.clazz = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return possible object is {@link String }
     */
    public String getInstance()
    {
        if (instance == null)
        {
            return "";
        }
        else
        {
            return instance;
        }
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInstance(String value)
    {
        this.instance = value;
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
     *       &lt;attribute name=&quot;height&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}integer&quot; /&gt;
     *       &lt;attribute name=&quot;width&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}integer&quot; /&gt;
     *       &lt;attribute name=&quot;mimeType&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
     *       &lt;attribute name=&quot;fileRef&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Icon
    {

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected BigInteger height;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected BigInteger width;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected String mimeType;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1", required = true)
        protected String fileRef;

        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the height property.
         * 
         * @return possible object is {@link BigInteger }
         */
        public BigInteger getHeight()
        {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value allowed object is {@link BigInteger }
         */
        public void setHeight(BigInteger value)
        {
            this.height = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return possible object is {@link BigInteger }
         */
        public BigInteger getWidth()
        {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value allowed object is {@link BigInteger }
         */
        public void setWidth(BigInteger value)
        {
            this.width = value;
        }

        /**
         * Gets the value of the mimeType property.
         * 
         * @return possible object is {@link String }
         */
        public String getMimeType()
        {
            return mimeType;
        }

        /**
         * Sets the value of the mimeType property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setMimeType(String value)
        {
            this.mimeType = value;
        }

        /**
         * Gets the value of the fileRef property.
         * 
         * @return possible object is {@link String }
         */
        public String getFileRef()
        {
            return fileRef;
        }

        /**
         * Sets the value of the fileRef property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setFileRef(String value)
        {
            this.fileRef = value;
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
     *         &lt;element name=&quot;Label&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot; minOccurs=&quot;0&quot;/&gt;
     *         &lt;element name=&quot;Description&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type&quot; minOccurs=&quot;0&quot;/&gt;
     *         &lt;element name=&quot;Value&quot; type=&quot;{http://schemas.dmtf.org/ovf/envelope/1}PropertyConfigurationValue_Type&quot; minOccurs=&quot;0&quot;/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name=&quot;key&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
     *       &lt;attribute name=&quot;type&quot; use=&quot;required&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
     *       &lt;attribute name=&quot;qualifiers&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; /&gt;
     *       &lt;attribute name=&quot;userConfigurable&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;false&quot; /&gt;
     *       &lt;attribute name=&quot;runtimeConfigurable&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot; default=&quot;false&quot; /&gt;
     *       &lt;attribute name=&quot;defaultValue&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; default=&quot;&quot; /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"label", "description", "value"})
    public static class Property
    {

        @XmlElement(name = "Label")
        protected MsgType label;

        @XmlElement(name = "Description")
        protected MsgType description;

        @XmlElement(name = "Value")
        protected PropertyConfigurationValueType value;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1", required = true)
        protected String key;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1", required = true)
        protected String type;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected String qualifiers;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected Boolean userConfigurable;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected Boolean runtimeConfigurable;

        @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
        protected String defaultValue;

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
         * Gets the value of the value property.
         * 
         * @return possible object is {@link PropertyConfigurationValueType }
         */
        public PropertyConfigurationValueType getValue()
        {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value allowed object is {@link PropertyConfigurationValueType }
         */
        public void setValue(PropertyConfigurationValueType value)
        {
            this.value = value;
        }

        /**
         * Gets the value of the key property.
         * 
         * @return possible object is {@link String }
         */
        public String getKey()
        {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setKey(String value)
        {
            this.key = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return possible object is {@link String }
         */
        public String getType()
        {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setType(String value)
        {
            this.type = value;
        }

        /**
         * Gets the value of the qualifiers property.
         * 
         * @return possible object is {@link String }
         */
        public String getQualifiers()
        {
            return qualifiers;
        }

        /**
         * Sets the value of the qualifiers property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setQualifiers(String value)
        {
            this.qualifiers = value;
        }

        /**
         * Gets the value of the userConfigurable property.
         * 
         * @return possible object is {@link Boolean }
         */
        public boolean isUserConfigurable()
        {
            if (userConfigurable == null)
            {
                return false;
            }
            else
            {
                return userConfigurable;
            }
        }

        /**
         * Sets the value of the userConfigurable property.
         * 
         * @param value allowed object is {@link Boolean }
         */
        public void setUserConfigurable(Boolean value)
        {
            this.userConfigurable = value;
        }

        /**
         * Gets the value of the runtimeConfigurable property.
         * 
         * @return possible object is {@link Boolean }
         */
        public boolean isRuntimeConfigurable()
        {
            if (runtimeConfigurable == null)
            {
                return false;
            }
            else
            {
                return runtimeConfigurable;
            }
        }

        /**
         * Sets the value of the runtimeConfigurable property.
         * 
         * @param value allowed object is {@link Boolean }
         */
        public void setRuntimeConfigurable(Boolean value)
        {
            this.runtimeConfigurable = value;
        }

        /**
         * Gets the value of the defaultValue property.
         * 
         * @return possible object is {@link String }
         */
        public String getDefaultValue()
        {
            if (defaultValue == null)
            {
                return "";
            }
            else
            {
                return defaultValue;
            }
        }

        /**
         * Sets the value of the defaultValue property.
         * 
         * @param value allowed object is {@link String }
         */
        public void setDefaultValue(String value)
        {
            this.defaultValue = value;
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
