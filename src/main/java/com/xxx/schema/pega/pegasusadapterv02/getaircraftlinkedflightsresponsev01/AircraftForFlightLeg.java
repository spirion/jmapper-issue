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
import javax.xml.bind.annotation.XmlType;


/**
 * The specific combination of an individual Aircraft
 *                 related to a single Flight Leg
 *             
 * 
 * <p>Java class for AircraftForFlightLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftForFlightLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircraft" type="{http://www.ba.com/schema/pega/PegasusAdapterV02/GetAircraftLinkedFlightsResponseV01}Aircraft"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftForFlightLeg", propOrder = {
    "aircraft"
})
public class AircraftForFlightLeg {

    @XmlElement(required = true)
    protected Aircraft aircraft;

    /**
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link Aircraft }
     *     
     */
    public Aircraft getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aircraft }
     *     
     */
    public void setAircraft(Aircraft value) {
        this.aircraft = value;
    }

}