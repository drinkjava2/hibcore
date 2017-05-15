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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Describes an XSD base type for any complex type that can contain "tooling hints".
 *             
 * 
 * <p>Java class for ToolingHintContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToolingHintContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="meta" type="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolingHintContainer", propOrder = {
    "toolingHints"
})
public abstract class JaxbHbmToolingHintContainer implements Serializable, ToolingHintContainer
{

    @XmlElement(name = "meta")
    protected List<JaxbHbmToolingHintType> toolingHints;

    /**
     * Gets the value of the toolingHints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toolingHints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToolingHints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmToolingHintType }
     * 
     * 
     */
    public List<JaxbHbmToolingHintType> getToolingHints() {
        if (toolingHints == null) {
            toolingHints = new ArrayList<JaxbHbmToolingHintType>();
        }
        return this.toolingHints;
    }

}
