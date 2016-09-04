//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.31 at 03:11:30 PM CEST 
//


package jaxB.amandman;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


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
 *         &lt;element name="Pravni_osnov_donosenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Donet_od_strane" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Postupak_donosenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cilj_donosenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Meta_podaci">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrPozitivnihGlasova"/>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrUkupnihGlasova"/>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Mesto"/>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pravniOsnovDonosenja",
    "donetOdStrane",
    "postupakDonosenja",
    "ciljDonosenja",
    "metaPodaci"
})
@XmlRootElement(name = "Sporedni_deo")
public class SporedniDeo {

    @XmlElement(name = "Pravni_osnov_donosenja", required = true)
    protected String pravniOsnovDonosenja;
    @XmlElement(name = "Donet_od_strane", required = true)
    protected String donetOdStrane;
    @XmlElement(name = "Postupak_donosenja", required = true)
    protected String postupakDonosenja;
    @XmlElement(name = "Cilj_donosenja", required = true)
    protected String ciljDonosenja;
    @XmlElement(name = "Meta_podaci", required = true)
    protected SporedniDeo.MetaPodaci metaPodaci;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the pravniOsnovDonosenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPravniOsnovDonosenja() {
        return pravniOsnovDonosenja;
    }

    /**
     * Sets the value of the pravniOsnovDonosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPravniOsnovDonosenja(String value) {
        this.pravniOsnovDonosenja = value;
    }

    /**
     * Gets the value of the donetOdStrane property.
     * 
     * @return
     *     possible object is XMLWriter
     *     {@link String }
     *     
     */
    public String getDonetOdStrane() {
        return donetOdStrane;
    }

    /**
     * Sets the value of the donetOdStrane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonetOdStrane(String value) {
        this.donetOdStrane = value;
    }

    /**
     * Gets the value of the postupakDonosenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostupakDonosenja() {
        return postupakDonosenja;
    }

    /**
     * Sets the value of the postupakDonosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostupakDonosenja(String value) {
        this.postupakDonosenja = value;
    }

    /**
     * Gets the value of the ciljDonosenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiljDonosenja() {
        return ciljDonosenja;
    }

    /**
     * Sets the value of the ciljDonosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiljDonosenja(String value) {
        this.ciljDonosenja = value;
    }

    /**
     * Gets the value of the metaPodaci property.
     * 
     * @return
     *     possible object is
     *     {@link SporedniDeo.MetaPodaci }
     *     
     */
    public SporedniDeo.MetaPodaci getMetaPodaci() {
        return metaPodaci;
    }

    /**
     * Sets the value of the metaPodaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link SporedniDeo.MetaPodaci }
     *     
     */
    public void setMetaPodaci(SporedniDeo.MetaPodaci value) {
        this.metaPodaci = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


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
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrPozitivnihGlasova"/>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrUkupnihGlasova"/>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Mesto"/>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "brPozitivnihGlasova",
        "brUkupnihGlasova",
        "oznaka",
        "mesto",
        "datum",
        "vrsta"
    })
    public static class MetaPodaci {

        @XmlElement(name = "BrPozitivnihGlasova", required = true, defaultValue = "0")
        protected BrPozitivnihGlasova brPozitivnihGlasova;
        @XmlElement(name = "BrUkupnihGlasova", required = true, defaultValue = "0")
        protected BrUkupnihGlasova brUkupnihGlasova;
        @XmlElement(name = "Oznaka", required = true)
        protected Oznaka oznaka;
        @XmlElement(name = "Mesto", required = true)
        protected Mesto mesto;
        @XmlElement(name = "Datum", required = true)
        protected Datum datum;
        @XmlElement(name = "Vrsta", required = true)
        protected Vrsta vrsta;

        /**
         * Gets the value of the brPozitivnihGlasova property.
         * 
         * @return
         *     possible object is
         *     {@link BrPozitivnihGlasova }
         *     
         */
        public BrPozitivnihGlasova getBrPozitivnihGlasova() {
            return brPozitivnihGlasova;
        }

        /**
         * Sets the value of the brPozitivnihGlasova property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrPozitivnihGlasova }
         *     
         */
        public void setBrPozitivnihGlasova(BrPozitivnihGlasova value) {
            this.brPozitivnihGlasova = value;
        }

        /**
         * Gets the value of the brUkupnihGlasova property.
         * 
         * @return
         *     possible object is
         *     {@link BrUkupnihGlasova }
         *     
         */
        public BrUkupnihGlasova getBrUkupnihGlasova() {
            return brUkupnihGlasova;
        }

        /**
         * Sets the value of the brUkupnihGlasova property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrUkupnihGlasova }
         *     
         */
        public void setBrUkupnihGlasova(BrUkupnihGlasova value) {
            this.brUkupnihGlasova = value;
        }

        /**
         * Gets the value of the oznaka property.
         * 
         * @return
         *     possible object is
         *     {@link Oznaka }
         *     
         */
        public Oznaka getOznaka() {
            return oznaka;
        }

        /**
         * Sets the value of the oznaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link Oznaka }
         *     
         */
        public void setOznaka(Oznaka value) {
            this.oznaka = value;
        }

        /**
         * Gets the value of the mesto property.
         * 
         * @return
         *     possible object is
         *     {@link Mesto }
         *     
         */
        public Mesto getMesto() {
            return mesto;
        }

        /**
         * Sets the value of the mesto property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mesto }
         *     
         */
        public void setMesto(Mesto value) {
            this.mesto = value;
        }

        /**
         * Gets the value of the datum property.
         * 
         * @return
         *     possible object is
         *     {@link Datum }
         *     
         */
        public Datum getDatum() {
            return datum;
        }

        /**
         * Sets the value of the datum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Datum }
         *     
         */
        public void setDatum(Datum value) {
            this.datum = value;
        }

        /**
         * Gets the value of the vrsta property.
         * 
         * @return
         *     possible object is
         *     {@link Vrsta }
         *     
         */
        public Vrsta getVrsta() {
            return vrsta;
        }

        /**
         * Sets the value of the vrsta property.
         * 
         * @param value
         *     allowed object is
         *     {@link Vrsta }
         *     
         */
        public void setVrsta(Vrsta value) {
            this.vrsta = value;
        }

    }

}