//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 03:21:34 PM PDT 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.hibernate.FlushMode;

public class Adapter5
    extends XmlAdapter<String, FlushMode>
{


    public FlushMode unmarshal(String value) {
        return (org.hibernate.boot.jaxb.hbm.internal.FlushModeConverter.fromXml(value));
    }

    public String marshal(FlushMode value) {
        return (org.hibernate.boot.jaxb.hbm.internal.FlushModeConverter.toXml(value));
    }

}
