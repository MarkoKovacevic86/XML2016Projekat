//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.31 at 02:38:52 PM CEST 
//


package jaxB.akt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice>
 *         &lt;element name="Akt_u_proceduri">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Predlagac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Upucuje_se" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Meta_podaci">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Mesto"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Naziv"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrUkupnihGlasova"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrPozitivnihGlasova"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Donet_akt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Donet_od_strane" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Po_postupku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Po_cilju" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Meta_podaci">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
 *                             &lt;element ref="{http://www.parlament.gov.rs/propisi/}Naziv"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Osnov_donosenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aktUProceduri",
    "donetAkt"
})
@XmlRootElement(name = "Sporedni_deo")
public class SporedniDeo {

    @XmlElement(name = "Akt_u_proceduri")
    protected SporedniDeo.AktUProceduri aktUProceduri;
    @XmlElement(name = "Donet_akt")
    protected SporedniDeo.DonetAkt donetAkt;

    /**
     * Gets the value of the aktUProceduri property.
     * 
     * @return
     *     possible object is
     *     {@link SporedniDeo.AktUProceduri }
     *     
     */
    public SporedniDeo.AktUProceduri getAktUProceduri() {
        return aktUProceduri;
    }

    /**
     * Sets the value of the aktUProceduri property.
     * 
     * @param value
     *     allowed object is
     *     {@link SporedniDeo.AktUProceduri }
     *     
     */
    public void setAktUProceduri(SporedniDeo.AktUProceduri value) {
        this.aktUProceduri = value;
    }

    /**
     * Gets the value of the donetAkt property.
     * 
     * @return
     *     possible object is
     *     {@link SporedniDeo.DonetAkt }
     *     
     */
    public SporedniDeo.DonetAkt getDonetAkt() {
        return donetAkt;
    }

    /**
     * Sets the value of the donetAkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SporedniDeo.DonetAkt }
     *     
     */
    public void setDonetAkt(SporedniDeo.DonetAkt value) {
        this.donetAkt = value;
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
     *         &lt;element name="Predlagac" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Upucuje_se" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Meta_podaci">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Mesto"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Naziv"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrUkupnihGlasova"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrPozitivnihGlasova"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "predlagac",
        "upucujeSe",
        "metaPodaci"
    })
    public static class AktUProceduri {

        @XmlElement(name = "Predlagac", required = true)
        protected String predlagac;
        @XmlElement(name = "Upucuje_se", required = true)
        protected String upucujeSe;
        @XmlElement(name = "Meta_podaci", required = true)
        protected SporedniDeo.AktUProceduri.MetaPodaci metaPodaci;

        /**
         * Gets the value of the predlagac property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPredlagac() {
            return predlagac;
        }

        /**
         * Sets the value of the predlagac property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPredlagac(String value) {
            this.predlagac = value;
        }

        /**
         * Gets the value of the upucujeSe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpucujeSe() {
            return upucujeSe;
        }

        /**
         * Sets the value of the upucujeSe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpucujeSe(String value) {
            this.upucujeSe = value;
        }

        /**
         * Gets the value of the metaPodaci property.
         * 
         * @return
         *     possible object is
         *     {@link SporedniDeo.AktUProceduri.MetaPodaci }
         *     
         */
        public SporedniDeo.AktUProceduri.MetaPodaci getMetaPodaci() {
            return metaPodaci;
        }

        /**
         * Sets the value of the metaPodaci property.
         * 
         * @param value
         *     allowed object is
         *     {@link SporedniDeo.AktUProceduri.MetaPodaci }
         *     
         */
        public void setMetaPodaci(SporedniDeo.AktUProceduri.MetaPodaci value) {
            this.metaPodaci = value;
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
         *       &lt;all>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Mesto"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Naziv"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrUkupnihGlasova"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}BrPozitivnihGlasova"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class MetaPodaci {

            @XmlElement(name = "Oznaka", required = true)
            protected Oznaka oznaka;
            @XmlElement(name = "Mesto", required = true)
            protected Mesto mesto;
            @XmlElement(name = "Datum", required = true)
            protected Datum datum;
            @XmlElement(name = "Vrsta", required = true)
            protected Vrsta vrsta;
            @XmlElement(name = "Naziv", required = true)
            protected Naziv naziv;
            @XmlElement(name = "BrUkupnihGlasova", required = true, defaultValue = "0")
            protected BrUkupnihGlasova brUkupnihGlasova;
            @XmlElement(name = "BrPozitivnihGlasova", required = true, defaultValue = "0")
            protected BrPozitivnihGlasova brPozitivnihGlasova;

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

            /**
             * Gets the value of the naziv property.
             * 
             * @return
             *     possible object is
             *     {@link Naziv }
             *     
             */
            public Naziv getNaziv() {
                return naziv;
            }

            /**
             * Sets the value of the naziv property.
             * 
             * @param value
             *     allowed object is
             *     {@link Naziv }
             *     
             */
            public void setNaziv(Naziv value) {
                this.naziv = value;
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

        }

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
     *         &lt;element name="Donet_od_strane" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Po_postupku" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Po_cilju" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Meta_podaci">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
     *                   &lt;element ref="{http://www.parlament.gov.rs/propisi/}Naziv"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Osnov_donosenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "donetOdStrane",
        "poPostupku",
        "poCilju",
        "metaPodaci",
        "osnovDonosenja"
    })
    public static class DonetAkt {

        @XmlElement(name = "Donet_od_strane", required = true)
        protected String donetOdStrane;
        @XmlElement(name = "Po_postupku", required = true)
        protected String poPostupku;
        @XmlElement(name = "Po_cilju", required = true)
        protected String poCilju;
        @XmlElement(name = "Meta_podaci", required = true)
        protected SporedniDeo.DonetAkt.MetaPodaci metaPodaci;
        @XmlElement(name = "Osnov_donosenja", required = true)
        protected String osnovDonosenja;

        /**
         * Gets the value of the donetOdStrane property.
         * 
         * @return
         *     possible object is
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
         * Gets the value of the poPostupku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoPostupku() {
            return poPostupku;
        }

        /**
         * Sets the value of the poPostupku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoPostupku(String value) {
            this.poPostupku = value;
        }

        /**
         * Gets the value of the poCilju property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoCilju() {
            return poCilju;
        }

        /**
         * Sets the value of the poCilju property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoCilju(String value) {
            this.poCilju = value;
        }

        /**
         * Gets the value of the metaPodaci property.
         * 
         * @return
         *     possible object is
         *     {@link SporedniDeo.DonetAkt.MetaPodaci }
         *     
         */
        public SporedniDeo.DonetAkt.MetaPodaci getMetaPodaci() {
            return metaPodaci;
        }

        /**
         * Sets the value of the metaPodaci property.
         * 
         * @param value
         *     allowed object is
         *     {@link SporedniDeo.DonetAkt.MetaPodaci }
         *     
         */
        public void setMetaPodaci(SporedniDeo.DonetAkt.MetaPodaci value) {
            this.metaPodaci = value;
        }

        /**
         * Gets the value of the osnovDonosenja property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOsnovDonosenja() {
            return osnovDonosenja;
        }

        /**
         * Sets the value of the osnovDonosenja property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOsnovDonosenja(String value) {
            this.osnovDonosenja = value;
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
         *       &lt;all>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Oznaka"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Datum"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Vrsta"/>
         *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Naziv"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class MetaPodaci {

            @XmlElement(name = "Oznaka", required = true)
            protected Oznaka oznaka;
            @XmlElement(name = "Datum", required = true)
            protected Datum datum;
            @XmlElement(name = "Vrsta", required = true)
            protected Vrsta vrsta;
            @XmlElement(name = "Naziv", required = true)
            protected Naziv naziv;

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

            /**
             * Gets the value of the naziv property.
             * 
             * @return
             *     possible object is
             *     {@link Naziv }
             *     
             */
            public Naziv getNaziv() {
                return naziv;
            }

            /**
             * Sets the value of the naziv property.
             * 
             * @param value
             *     allowed object is
             *     {@link Naziv }
             *     
             */
            public void setNaziv(Naziv value) {
                this.naziv = value;
            }

        }

    }

}