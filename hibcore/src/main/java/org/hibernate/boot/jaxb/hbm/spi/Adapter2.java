//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 03:21:34 PM PDT 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.hibernate.cache.spi.access.AccessType;

public class Adapter2
    extends XmlAdapter<String, AccessType>
{


    public AccessType unmarshal(String value) {
        return (org.hibernate.boot.jaxb.hbm.internal.CacheAccessTypeConverter.fromXml(value));
    }

    public String marshal(AccessType value) {
        return (org.hibernate.boot.jaxb.hbm.internal.CacheAccessTypeConverter.toXml(value));
    }

}
