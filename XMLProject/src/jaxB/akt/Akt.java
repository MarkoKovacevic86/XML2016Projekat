//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 06:21:59 PM CEST 
//


package jaxB.akt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Glavni_deo"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Sporedni_deo"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "glavniDeo",
    "sporedniDeo"
})
@XmlRootElement(name = "Akt")
public class Akt {

    @XmlElement(name = "Glavni_deo", required = true)
    protected GlavniDeo glavniDeo;
    @XmlElement(name = "Sporedni_deo", required = true)
    protected SporedniDeo sporedniDeo;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the glavniDeo property.
     * 
     * @return
     *     possible object is
     *     {@link GlavniDeo }
     *     
     */
    public GlavniDeo getGlavniDeo() {
        return glavniDeo;
    }

    /**
     * Sets the value of the glavniDeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlavniDeo }
     *     
     */
    public void setGlavniDeo(GlavniDeo value) {
        this.glavniDeo = value;
    }

    /**
     * Gets the value of the sporedniDeo property.
     * 
     * @return
     *     possible object is
     *     {@link SporedniDeo }
     *     
     */
    public SporedniDeo getSporedniDeo() {
        return sporedniDeo;
    }

    /**
     * Sets the value of the sporedniDeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SporedniDeo }
     *     
     */
    public void setSporedniDeo(SporedniDeo value) {
        this.sporedniDeo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
