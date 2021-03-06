//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 10:07:40 AM BST 
//


package com.xxx.schema.pega.pegasusadapterv02.getaircraftlinkedflightsresponsev01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This attempts to describe the various views the
 *                 owners and operators may have of a vehicle, as opposed to the
 *                 manufacturers view which is used to fundamentally define the
 *                 vehicle. This is built as a hierarchy because that is how the
 *                 business likes to view it. Thus each level of their hierarchy is
 *                 defined by another set of attributes of the vehicle in which
 *                 they
 *                 are interested There are as many types here as there are
 *                 interest
 *                 groups as this is a business focused view. The various different
 *                 types will NEVER directly correlate with each other and no
 *                 attempt
 *                 should ever be made to make them do so! Thus the Operations
 *                 controllers want to know which aircraft would be suitable to
 *                 substitute for another in the event of operational problems.
 *                 They
 *                 will probably accept anything which can be operated by the same
 *                 crew
 *                 even if it has a different number or configuration of seats as
 *                 this
 *                 will be the most likely to keep us operating on the day.
 *                 Therefore
 *                 they have built up a number of type codes that meet their need,
 *                 and
 *                 they are used in the FICO system. Conversely the route planners
 *                 are
 *                 interested in ensuring that we offer the right number of seats
 *                 of
 *                 the right class to maximise our revenue. They don\&rsquo;t
 *                 care
 *                 if it has different engines that require a different type of
 *                 crew as
 *                 this can be planned and scheduled ahead of time an does not
 *                 significantly affect our costs over the long term. Therefore
 *                 they
 *                 have a series of types that are based around the cabin
 *                 configuration
 *                 and are used in ISIS, CSD COBRA etc. N.B. Each type defined here
 *                 is
 *                 really a \&rsquo;moment in time aggregate\&rsquo; of all
 *                 the
 *                 vehicles that satisfy a series of conditions or rules. It is
 *                 important that these be understood, else the type has no meaning
 *                 of
 *                 any kind. As the vehicle undergoes maintenance, its type may
 *                 change.
 *                 Also when it operates different services its type may change.
 *                 Often
 *                 the changes are too frequent to be kept up to date in this kind
 *                 of
 *                 hierarchy and short cuts are taken by the business. This can
 *                 NEVER
 *                 be reflected in this kind of data structure, so this table
 *                 should
 *                 only be used as a GUIDE rather than an absolute.
 *             
 * 
 * <p>Java class for AircraftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircraftType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aircraftTypeDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aircraftTypeSource" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aircraftSubType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftType", propOrder = {
    "aircraftType",
    "aircraftTypeDescription",
    "aircraftTypeSource",
    "aircraftSubType"
})
public class AircraftType {

    protected String aircraftType;
    protected String aircraftTypeDescription;
    protected String aircraftTypeSource;
    protected String aircraftSubType;

    /**
     * Gets the value of the aircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the value of the aircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * Gets the value of the aircraftTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftTypeDescription() {
        return aircraftTypeDescription;
    }

    /**
     * Sets the value of the aircraftTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftTypeDescription(String value) {
        this.aircraftTypeDescription = value;
    }

    /**
     * Gets the value of the aircraftTypeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftTypeSource() {
        return aircraftTypeSource;
    }

    /**
     * Sets the value of the aircraftTypeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftTypeSource(String value) {
        this.aircraftTypeSource = value;
    }

    /**
     * Gets the value of the aircraftSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftSubType() {
        return aircraftSubType;
    }

    /**
     * Sets the value of the aircraftSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftSubType(String value) {
        this.aircraftSubType = value;
    }

}
