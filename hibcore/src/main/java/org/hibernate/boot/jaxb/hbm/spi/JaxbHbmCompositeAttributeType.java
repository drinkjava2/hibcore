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
 *                 A component is a user-defined class, persisted along with its containing entity
 *                 to the table of the entity class. JavaBeans style properties of the component are
 *                 mapped to columns of the table of the containing entity. A null component reference
 *                 is mapped to null values in all columns and vice versa. Components do not support
 *                 shared reference semantics.
 *             
 * 
 * <p>Java class for CompositeAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tuplizer" type="{http://www.hibernate.org/xsd/orm/hbm}tuplizer-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{http://www.hibernate.org/xsd/orm/hbm}parent-type" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}SingularAttributeGroup"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="insert" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="lazy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optimistic-lock" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="update" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeAttributeType", propOrder = {
    "tuplizer",
    "parent",
    "attributes"
})
public class JaxbHbmCompositeAttributeType
    extends JaxbHbmToolingHintContainer
    implements Serializable, ToolingHintContainer
{

    protected List<JaxbHbmTuplizerType> tuplizer;
    protected JaxbHbmParentType parent;
    @XmlElements({
        @XmlElement(name = "property", type = JaxbHbmBasicAttributeType.class),
        @XmlElement(name = "many-to-one", type = JaxbHbmManyToOneType.class),
        @XmlElement(name = "one-to-one", type = JaxbHbmOneToOneType.class),
        @XmlElement(name = "component", type = JaxbHbmCompositeAttributeType.class),
        @XmlElement(name = "dynamic-component", type = JaxbHbmDynamicComponentType.class),
        @XmlElement(name = "properties", type = JaxbHbmPropertiesType.class),
        @XmlElement(name = "any", type = JaxbHbmAnyAssociationType.class),
        @XmlElement(name = "map", type = JaxbHbmMapType.class),
        @XmlElement(name = "set", type = JaxbHbmSetType.class),
        @XmlElement(name = "list", type = JaxbHbmListType.class),
        @XmlElement(name = "bag", type = JaxbHbmBagCollectionType.class),
        @XmlElement(name = "array", type = JaxbHbmArrayType.class),
        @XmlElement(name = "primitive-array", type = JaxbHbmPrimitiveArrayType.class)
    })
    protected List<Serializable> attributes;
    @XmlAttribute(name = "access")
    protected String access;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "insert")
    protected Boolean insert;
    @XmlAttribute(name = "lazy")
    protected Boolean lazy;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "node")
    protected String node;
    @XmlAttribute(name = "optimistic-lock")
    protected Boolean optimisticLock;
    @XmlAttribute(name = "unique")
    protected Boolean unique;
    @XmlAttribute(name = "update")
    protected Boolean update;

    /**
     * Gets the value of the tuplizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmTuplizerType }
     * 
     * 
     */
    public List<JaxbHbmTuplizerType> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<JaxbHbmTuplizerType>();
        }
        return this.tuplizer;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmParentType }
     *     
     */
    public JaxbHbmParentType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmParentType }
     *     
     */
    public void setParent(JaxbHbmParentType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmBasicAttributeType }
     * {@link JaxbHbmManyToOneType }
     * {@link JaxbHbmOneToOneType }
     * {@link JaxbHbmCompositeAttributeType }
     * {@link JaxbHbmDynamicComponentType }
     * {@link JaxbHbmPropertiesType }
     * {@link JaxbHbmAnyAssociationType }
     * {@link JaxbHbmMapType }
     * {@link JaxbHbmSetType }
     * {@link JaxbHbmListType }
     * {@link JaxbHbmBagCollectionType }
     * {@link JaxbHbmArrayType }
     * {@link JaxbHbmPrimitiveArrayType }
     * 
     * 
     */
    public List<Serializable> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Serializable>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the insert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInsert() {
        if (insert == null) {
            return true;
        } else {
            return insert;
        }
    }

    /**
     * Sets the value of the insert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsert(Boolean value) {
        this.insert = value;
    }

    /**
     * Gets the value of the lazy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLazy() {
        if (lazy == null) {
            return false;
        } else {
            return lazy;
        }
    }

    /**
     * Sets the value of the lazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLazy(Boolean value) {
        this.lazy = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the optimisticLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptimisticLock() {
        if (optimisticLock == null) {
            return true;
        } else {
            return optimisticLock;
        }
    }

    /**
     * Sets the value of the optimisticLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimisticLock(Boolean value) {
        this.optimisticLock = value;
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

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUpdate() {
        if (update == null) {
            return true;
        } else {
            return update;
        }
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdate(Boolean value) {
        this.update = value;
    }

}
