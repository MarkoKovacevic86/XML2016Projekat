//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.02 at 04:47:18 PM CEST 
//


package jaxB.akt;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Odeljak" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Clan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Stav" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Tacka" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Podtacka" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Alineja" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Glava" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi/}Deo" maxOccurs="unbounded" minOccurs="0"/>
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
    "odeljak",
    "clan",
    "stav",
    "tacka",
    "podtacka",
    "alineja",
    "glava",
    "deo"
})
@XmlRootElement(name = "Glavni_deo")
public class GlavniDeo {

    @XmlElement(name = "Odeljak")
    protected List<Odeljak> odeljak;
    @XmlElement(name = "Clan")
    protected List<Clan> clan;
    @XmlElement(name = "Stav")
    protected List<Stav> stav;
    @XmlElement(name = "Tacka")
    protected List<Tacka> tacka;
    @XmlElement(name = "Podtacka")
    protected List<Podtacka> podtacka;
    @XmlElement(name = "Alineja")
    protected List<Alineja> alineja;
    @XmlElement(name = "Glava")
    protected List<Glava> glava;
    @XmlElement(name = "Deo")
    protected List<Deo> deo;

    /**
     * Gets the value of the odeljak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odeljak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdeljak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Odeljak }
     * 
     * 
     */
    public List<Odeljak> getOdeljak() {
        if (odeljak == null) {
            odeljak = new ArrayList<Odeljak>();
        }
        return this.odeljak;
    }

    /**
     * Gets the value of the clan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clan }
     * 
     * 
     */
    public List<Clan> getClan() {
        if (clan == null) {
            clan = new ArrayList<Clan>();
        }
        return this.clan;
    }

    /**
     * Gets the value of the stav property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stav property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStav().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stav }
     * 
     * 
     */
    public List<Stav> getStav() {
        if (stav == null) {
            stav = new ArrayList<Stav>();
        }
        return this.stav;
    }

    /**
     * Gets the value of the tacka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tacka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTacka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tacka }
     * 
     * 
     */
    public List<Tacka> getTacka() {
        if (tacka == null) {
            tacka = new ArrayList<Tacka>();
        }
        return this.tacka;
    }

    /**
     * Gets the value of the podtacka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the podtacka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPodtacka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Podtacka }
     * 
     * 
     */
    public List<Podtacka> getPodtacka() {
        if (podtacka == null) {
            podtacka = new ArrayList<Podtacka>();
        }
        return this.podtacka;
    }

    /**
     * Gets the value of the alineja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alineja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlineja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alineja }
     * 
     * 
     */
    public List<Alineja> getAlineja() {
        if (alineja == null) {
            alineja = new ArrayList<Alineja>();
        }
        return this.alineja;
    }

    /**
     * Gets the value of the glava property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glava property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlava().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glava }
     * 
     * 
     */
    public List<Glava> getGlava() {
        if (glava == null) {
            glava = new ArrayList<Glava>();
        }
        return this.glava;
    }

    /**
     * Gets the value of the deo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deo }
     * 
     * 
     */
    public List<Deo> getDeo() {
        if (deo == null) {
            deo = new ArrayList<Deo>();
        }
        return this.deo;
    }

}
