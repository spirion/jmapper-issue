//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 10:07:40 AM BST 
//


package com.xxx.schema.pega.pegasusadapterv02.getaircraftlinkedflightsresponsev01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An Aircraft is a vehicle that is designed or used
 *                 to transport people or cargo by air. It will be propelled by
 *                 engines, has wings and must be capable of flight.
 *                 IATA has defined the 3 letter aircraft type code for uniquely
 *                 identifying the aircraft model e.g. �744� for Boeing 747-400. or
 *                 similar
 *             
 * 
 * <p>Java class for Aircraft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aircraft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircraftRegistration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="operator" type="{http://www.ba.com/schema/pega/PegasusAdapterV02/GetAircraftLinkedFlightsResponseV01}Organisation" minOccurs="0"/>
 *         &lt;element name="aircraftType" type="{http://www.ba.com/schema/pega/PegasusAdapterV02/GetAircraftLinkedFlightsResponseV01}AircraftType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aircraft", propOrder = {
    "aircraftRegistration",
    "operator",
    "aircraftType"
})
public class Aircraft {

    protected String aircraftRegistration;
    protected Organisation operator;
    protected List<AircraftType> aircraftType;

    /**
     * Gets the value of the aircraftRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * Sets the value of the aircraftRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftRegistration(String value) {
        this.aircraftRegistration = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOperator(Organisation value) {
        this.operator = value;
    }

    /**
     * Gets the value of the aircraftType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftType }
     * 
     * 
     */
    public List<AircraftType> getAircraftType() {
        if (aircraftType == null) {
            aircraftType = new ArrayList<AircraftType>();
        }
        return this.aircraftType;
    }

    public void setAircraftType(List<AircraftType> value) {
        this.aircraftType = null;
        List<AircraftType> draftl = this.getAircraftType();
        draftl.addAll(value);
    }

}