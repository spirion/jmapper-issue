//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 10:07:40 AM BST 
//


package com.xxx.schema.pega.pegasusadapterv02.getaircraftlinkedflightsresponsev01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.joda.time.DateTime;


/**
 * Description: Event related dates and times. These
 *                 may be specified as either UTC (Zulu) or as a local time - where
 *                 local is appropriately specific to where the event occurs. For
 *                 example flight departure times would be local to the Departure
 *                 Airport whereas flight arrival times would be local to the
 *                 Arrival
 *                 Airport
 *             
 * 
 * <p>Java class for EventDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="utc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDate", propOrder = {
    "local",
    "utc"
})
public class EventDate {

    @XmlElement(type = String.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime local;
    @XmlElement(type = String.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime utc;

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(DateTime value) {
        this.local = value;
    }

    /**
     * Gets the value of the utc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getUtc() {
        return utc;
    }

    /**
     * Sets the value of the utc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtc(DateTime value) {
        this.utc = value;
    }

}