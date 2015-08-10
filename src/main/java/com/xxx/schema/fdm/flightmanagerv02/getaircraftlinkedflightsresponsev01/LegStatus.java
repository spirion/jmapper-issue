//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 01:53:08 PM BST 
//


package com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight states for the current flight leg
 *             
 * 
 * <p>Java class for LegStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicDepartureStatus" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}publicDepartureStatusEnum" minOccurs="0"/>
 *         &lt;element name="publicArrivalStatus" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}publicArrivalStatusEnum" minOccurs="0"/>
 *         &lt;element name="operationalDepartureStatus" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}OperationalDepartureStatus" minOccurs="0"/>
 *         &lt;element name="operationalArrivalStatus" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}OperationalArrivalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegStatus", propOrder = {
    "publicDepartureStatus",
    "publicArrivalStatus",
    "operationalDepartureStatus",
    "operationalArrivalStatus"
})
public class LegStatus {

    protected PublicDepartureStatusEnum publicDepartureStatus;
    protected PublicArrivalStatusEnum publicArrivalStatus;
    protected OperationalDepartureStatus operationalDepartureStatus;
    protected OperationalArrivalStatus operationalArrivalStatus;

    /**
     * Gets the value of the publicDepartureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDepartureStatusEnum }
     *     
     */
    public PublicDepartureStatusEnum getPublicDepartureStatus() {
        return publicDepartureStatus;
    }

    /**
     * Sets the value of the publicDepartureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDepartureStatusEnum }
     *     
     */
    public void setPublicDepartureStatus(PublicDepartureStatusEnum value) {
        this.publicDepartureStatus = value;
    }

    /**
     * Gets the value of the publicArrivalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PublicArrivalStatusEnum }
     *     
     */
    public PublicArrivalStatusEnum getPublicArrivalStatus() {
        return publicArrivalStatus;
    }

    /**
     * Sets the value of the publicArrivalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicArrivalStatusEnum }
     *     
     */
    public void setPublicArrivalStatus(PublicArrivalStatusEnum value) {
        this.publicArrivalStatus = value;
    }

    /**
     * Gets the value of the operationalDepartureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalDepartureStatus }
     *     
     */
    public OperationalDepartureStatus getOperationalDepartureStatus() {
        return operationalDepartureStatus;
    }

    /**
     * Sets the value of the operationalDepartureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalDepartureStatus }
     *     
     */
    public void setOperationalDepartureStatus(OperationalDepartureStatus value) {
        this.operationalDepartureStatus = value;
    }

    /**
     * Gets the value of the operationalArrivalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalArrivalStatus }
     *     
     */
    public OperationalArrivalStatus getOperationalArrivalStatus() {
        return operationalArrivalStatus;
    }

    /**
     * Sets the value of the operationalArrivalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalArrivalStatus }
     *     
     */
    public void setOperationalArrivalStatus(OperationalArrivalStatus value) {
        this.operationalArrivalStatus = value;
    }

}
