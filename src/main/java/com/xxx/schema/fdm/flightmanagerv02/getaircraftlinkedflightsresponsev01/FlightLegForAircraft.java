//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 01:53:08 PM BST 
//


package com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.joda.time.LocalDate;


/**
 * The specific combination of an individual Aircraft
 *                 related to a single Flight Leg
 *             
 * 
 * <p>Java class for FlightLegForAircraft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightLegForAircraft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operatingFlightNumber" type="{http://www.ba.com/schema/fdm/FlightManagerV02/GetAircraftLinkedFlightsResponseV01}OperatingFlightNumber"/>
 *         &lt;element name="originDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="departureAirportCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="([A-Z]{3,5})"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="arrivalAirportCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="([A-Z]{3,5})"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="repeatNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightLegForAircraft", propOrder = {
    "operatingFlightNumber",
    "originDate",
    "departureAirportCode",
    "arrivalAirportCode",
    "repeatNumber"
})
public class FlightLegForAircraft {

    @XmlElement(required = true)
    protected OperatingFlightNumber operatingFlightNumber;
    @XmlElement(type = String.class)
    @XmlSchemaType(name = "date")
    protected LocalDate originDate;
    protected String departureAirportCode;
    protected String arrivalAirportCode;
    protected BigInteger repeatNumber;

    /**
     * Gets the value of the operatingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingFlightNumber }
     *     
     */
    public OperatingFlightNumber getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingFlightNumber }
     *     
     */
    public void setOperatingFlightNumber(OperatingFlightNumber value) {
        this.operatingFlightNumber = value;
    }

    /**
     * Gets the value of the originDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getOriginDate() {
        return originDate;
    }

    /**
     * Sets the value of the originDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDate(LocalDate value) {
        this.originDate = value;
    }

    /**
     * Gets the value of the departureAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    /**
     * Sets the value of the departureAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportCode(String value) {
        this.departureAirportCode = value;
    }

    /**
     * Gets the value of the arrivalAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    /**
     * Sets the value of the arrivalAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportCode(String value) {
        this.arrivalAirportCode = value;
    }

    /**
     * Gets the value of the repeatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepeatNumber() {
        return repeatNumber;
    }

    /**
     * Sets the value of the repeatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepeatNumber(BigInteger value) {
        this.repeatNumber = value;
    }

}