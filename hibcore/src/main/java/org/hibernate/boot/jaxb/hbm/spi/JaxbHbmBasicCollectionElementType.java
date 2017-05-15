//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 03:21:34 PM PDT 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Declares the element type of a collection where the element is of basic type
 *             
 * 
 * <p>Java class for BasicCollectionElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicCollectionElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}column-or-formula"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="type" type="{http://www.hibernate.org/xsd/orm/hbm}TypeSpecificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="not-null" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicCollectionElementType", propOrder = {
    "columnOrFormula",
    "type"
})
public class JaxbHbmBasicCollectionElementType
    implements Serializable, TypeContainer
{

    @XmlElements({
        @XmlElement(name = "column", type = JaxbHbmColumnType.class),
        @XmlElement(name = "formula", type = String.class)
    })
    protected List<Serializable> columnOrFormula;
    protected JaxbHbmTypeSpecificationType type;
    @XmlAttribute(name = "column")
    protected String columnAttribute;
    @XmlAttribute(name = "formula")
    protected String formulaAttribute;
    @XmlAttribute(name = "length")
    protected Integer length;
    @XmlAttribute(name = "node")
    protected String node;
    @XmlAttribute(name = "not-null")
    protected Boolean notNull;
    @XmlAttribute(name = "precision")
    protected Integer precision;
    @XmlAttribute(name = "scale")
    protected Integer scale;
    @XmlAttribute(name = "type")
    protected String typeAttribute;
    @XmlAttribute(name = "unique")
    protected Boolean unique;

    /**
     * Gets the value of the columnOrFormula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnOrFormula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnOrFormula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmColumnType }
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getColumnOrFormula() {
        if (columnOrFormula == null) {
            columnOrFormula = new ArrayList<Serializable>();
        }
        return this.columnOrFormula;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmTypeSpecificationType }
     *     
     */
    public JaxbHbmTypeSpecificationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmTypeSpecificationType }
     *     
     */
    public void setType(JaxbHbmTypeSpecificationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the columnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnAttribute() {
        return columnAttribute;
    }

    /**
     * Sets the value of the columnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnAttribute(String value) {
        this.columnAttribute = value;
    }

    /**
     * Gets the value of the formulaAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaAttribute() {
        return formulaAttribute;
    }

    /**
     * Sets the value of the formulaAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaAttribute(String value) {
        this.formulaAttribute = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the notNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotNull() {
        if (notNull == null) {
            return false;
        } else {
            return notNull;
        }
    }

    /**
     * Sets the value of the notNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotNull(Boolean value) {
        this.notNull = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Gets the value of the typeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAttribute() {
        return typeAttribute;
    }

    /**
     * Sets the value of the typeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAttribute(String value) {
        this.typeAttribute = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnique() {
        if (unique == null) {
            return false;
        } else {
            return unique;
        }
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnique(Boolean value) {
        this.unique = value;
    }

}
