//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 06:21:59 PM CEST 
//


package jaxB.akt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TStatusAmandmana.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TStatusAmandmana">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="odbijen"/>
 *     &lt;enumeration value="prihvacen"/>
 *     &lt;enumeration value="u_proceduri"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TStatusAmandmana")
@XmlEnum
public enum TStatusAmandmana {

    @XmlEnumValue("odbijen")
    ODBIJEN("odbijen"),
    @XmlEnumValue("prihvacen")
    PRIHVACEN("prihvacen"),
    @XmlEnumValue("u_proceduri")
    U_PROCEDURI("u_proceduri");
    private final String value;

    TStatusAmandmana(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TStatusAmandmana fromValue(String v) {
        for (TStatusAmandmana c: TStatusAmandmana.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
