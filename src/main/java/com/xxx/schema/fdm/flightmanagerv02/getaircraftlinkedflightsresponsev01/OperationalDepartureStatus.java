//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 01:53:08 PM BST 
//


package com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.joda.time.DateTime;


/**
 * The flight leg departure status used by
 *                 operational
 *                 systems.
 *             
 * 
 * <p>Java class for OperationalDepartureStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationalDepartureStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}OperationalDepartureStatusCodeEnum" minOccurs="0"/>
 *         &lt;element name="updateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}OperationalDepartureStatusEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalDepartureStatus", propOrder = {
    "statusCode",
    "updateDateTime",
    "status"
})
public class OperationalDepartureStatus {

    protected OperationalDepartureStatusCodeEnum statusCode;
    @XmlElement(type = String.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime updateDateTime;
    protected OperationalDepartureStatusEnum status;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalDepartureStatusCodeEnum }
     *     
     */
    public OperationalDepartureStatusCodeEnum getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalDepartureStatusCodeEnum }
     *     
     */
    public void setStatusCode(OperationalDepartureStatusCodeEnum value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the updateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDateTime(DateTime value) {
        this.updateDateTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalDepartureStatusEnum }
     *     
     */
    public OperationalDepartureStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalDepartureStatusEnum }
     *     
     */
    public void setStatus(OperationalDepartureStatusEnum value) {
        this.status = value;
    }

}