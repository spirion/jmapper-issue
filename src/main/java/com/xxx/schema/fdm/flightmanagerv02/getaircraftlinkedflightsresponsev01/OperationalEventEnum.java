//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 01:53:08 PM BST 
//


package com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalEventEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalEventEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIRBORNE"/>
 *     &lt;enumeration value="TOUCHDOWN"/>
 *     &lt;enumeration value="TAKEOFF"/>
 *     &lt;enumeration value="SLOT_APPROVAL"/>
 *     &lt;enumeration value="DEICING_START"/>
 *     &lt;enumeration value="DEICING_END"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationalEventEnum")
@XmlEnum
public enum OperationalEventEnum {

    AIRBORNE,
    TOUCHDOWN,
    TAKEOFF,
    SLOT_APPROVAL,
    DEICING_START,
    DEICING_END;

    public String value() {
        return name();
    }

    public static OperationalEventEnum fromValue(String v) {
        return valueOf(v);
    }

}
