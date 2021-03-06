//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 06:21:59 PM CEST 
//


package jaxB.akt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxB.akt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Status_QNAME = new QName("http://www.parlament.gov.rs/propisi", "status");
    private final static QName _StatusIzmene_QNAME = new QName("http://www.parlament.gov.rs/propisi", "status_izmene");
    private final static QName _SadrzajOdeljkaClan_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Clan");
    private final static QName _SadrzajStavTacka_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Tacka");
    private final static QName _SadrzajClanStav_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Stav");
    private final static QName _SadrzajPodtackeAlineja_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Alineja");
    private final static QName _SadrzajDeoOdeljak_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Odeljak");
    private final static QName _SadrzajDeoGlava_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Glava");
    private final static QName _SadrzajTackePodtacka_QNAME = new QName("http://www.parlament.gov.rs/propisi", "Podtacka");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxB.akt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SporedniDeo }
     * 
     */
    public SporedniDeo createSporedniDeo() {
        return new SporedniDeo();
    }

    /**
     * Create an instance of {@link SporedniDeo.DonetAkt }
     * 
     */
    public SporedniDeo.DonetAkt createSporedniDeoDonetAkt() {
        return new SporedniDeo.DonetAkt();
    }

    /**
     * Create an instance of {@link SporedniDeo.AktUProceduri }
     * 
     */
    public SporedniDeo.AktUProceduri createSporedniDeoAktUProceduri() {
        return new SporedniDeo.AktUProceduri();
    }

    /**
     * Create an instance of {@link SadrzajDeo }
     * 
     */
    public SadrzajDeo createSadrzajDeo() {
        return new SadrzajDeo();
    }

    /**
     * Create an instance of {@link SadrzajGlave }
     * 
     */
    public SadrzajGlave createSadrzajGlave() {
        return new SadrzajGlave();
    }

    /**
     * Create an instance of {@link SadrzajStav }
     * 
     */
    public SadrzajStav createSadrzajStav() {
        return new SadrzajStav();
    }

    /**
     * Create an instance of {@link SadrzajClan }
     * 
     */
    public SadrzajClan createSadrzajClan() {
        return new SadrzajClan();
    }

    /**
     * Create an instance of {@link SadrzajOdeljka }
     * 
     */
    public SadrzajOdeljka createSadrzajOdeljka() {
        return new SadrzajOdeljka();
    }

    /**
     * Create an instance of {@link SadrzajPodtacke }
     * 
     */
    public SadrzajPodtacke createSadrzajPodtacke() {
        return new SadrzajPodtacke();
    }

    /**
     * Create an instance of {@link SadrzajPodtacke.Alineja }
     * 
     */
    public SadrzajPodtacke.Alineja createSadrzajPodtackeAlineja() {
        return new SadrzajPodtacke.Alineja();
    }

    /**
     * Create an instance of {@link SadrzajPodtacke.Alineja.Status }
     * 
     */
    public SadrzajPodtacke.Alineja.Status createSadrzajPodtackeAlinejaStatus() {
        return new SadrzajPodtacke.Alineja.Status();
    }

    /**
     * Create an instance of {@link SadrzajTacke }
     * 
     */
    public SadrzajTacke createSadrzajTacke() {
        return new SadrzajTacke();
    }

    /**
     * Create an instance of {@link jaxB.akt.Tacka }
     * 
     */
    public jaxB.akt.Tacka createTacka() {
        return new jaxB.akt.Tacka();
    }

    /**
     * Create an instance of {@link AmandmanStatus }
     * 
     */
    public AmandmanStatus createAmandmanStatus() {
        return new AmandmanStatus();
    }

    /**
     * Create an instance of {@link jaxB.akt.Podtacka }
     * 
     */
    public jaxB.akt.Podtacka createPodtacka() {
        return new jaxB.akt.Podtacka();
    }

    /**
     * Create an instance of {@link Datum }
     * 
     */
    public Datum createDatum() {
        return new Datum();
    }

    /**
     * Create an instance of {@link jaxB.akt.Odeljak }
     * 
     */
    public jaxB.akt.Odeljak createOdeljak() {
        return new jaxB.akt.Odeljak();
    }

    /**
     * Create an instance of {@link Akt }
     * 
     */
    public Akt createAkt() {
        return new Akt();
    }

    /**
     * Create an instance of {@link GlavniDeo }
     * 
     */
    public GlavniDeo createGlavniDeo() {
        return new GlavniDeo();
    }

    /**
     * Create an instance of {@link jaxB.akt.Clan }
     * 
     */
    public jaxB.akt.Clan createClan() {
        return new jaxB.akt.Clan();
    }

    /**
     * Create an instance of {@link jaxB.akt.Stav }
     * 
     */
    public jaxB.akt.Stav createStav() {
        return new jaxB.akt.Stav();
    }

    /**
     * Create an instance of {@link jaxB.akt.Alineja }
     * 
     */
    public jaxB.akt.Alineja createAlineja() {
        return new jaxB.akt.Alineja();
    }

    /**
     * Create an instance of {@link jaxB.akt.Glava }
     * 
     */
    public jaxB.akt.Glava createGlava() {
        return new jaxB.akt.Glava();
    }

    /**
     * Create an instance of {@link Deo }
     * 
     */
    public Deo createDeo() {
        return new Deo();
    }

    /**
     * Create an instance of {@link Naziv }
     * 
     */
    public Naziv createNaziv() {
        return new Naziv();
    }

    /**
     * Create an instance of {@link BrPozitivnihGlasova }
     * 
     */
    public BrPozitivnihGlasova createBrPozitivnihGlasova() {
        return new BrPozitivnihGlasova();
    }

    /**
     * Create an instance of {@link Oznaka }
     * 
     */
    public Oznaka createOznaka() {
        return new Oznaka();
    }

    /**
     * Create an instance of {@link jaxB.akt.Ref }
     * 
     */
    public jaxB.akt.Ref createRef() {
        return new jaxB.akt.Ref();
    }

    /**
     * Create an instance of {@link BrUkupnihGlasova }
     * 
     */
    public BrUkupnihGlasova createBrUkupnihGlasova() {
        return new BrUkupnihGlasova();
    }

    /**
     * Create an instance of {@link Vrsta }
     * 
     */
    public Vrsta createVrsta() {
        return new Vrsta();
    }

    /**
     * Create an instance of {@link Mesto }
     * 
     */
    public Mesto createMesto() {
        return new Mesto();
    }

    /**
     * Create an instance of {@link SporedniDeo.DonetAkt.MetaPodaci }
     * 
     */
    public SporedniDeo.DonetAkt.MetaPodaci createSporedniDeoDonetAktMetaPodaci() {
        return new SporedniDeo.DonetAkt.MetaPodaci();
    }

    /**
     * Create an instance of {@link SporedniDeo.AktUProceduri.MetaPodaci }
     * 
     */
    public SporedniDeo.AktUProceduri.MetaPodaci createSporedniDeoAktUProceduriMetaPodaci() {
        return new SporedniDeo.AktUProceduri.MetaPodaci();
    }

    /**
     * Create an instance of {@link SadrzajDeo.Clan }
     * 
     */
    public SadrzajDeo.Clan createSadrzajDeoClan() {
        return new SadrzajDeo.Clan();
    }

    /**
     * Create an instance of {@link SadrzajDeo.Odeljak }
     * 
     */
    public SadrzajDeo.Odeljak createSadrzajDeoOdeljak() {
        return new SadrzajDeo.Odeljak();
    }

    /**
     * Create an instance of {@link SadrzajDeo.Glava }
     * 
     */
    public SadrzajDeo.Glava createSadrzajDeoGlava() {
        return new SadrzajDeo.Glava();
    }

    /**
     * Create an instance of {@link SadrzajGlave.Clan }
     * 
     */
    public SadrzajGlave.Clan createSadrzajGlaveClan() {
        return new SadrzajGlave.Clan();
    }

    /**
     * Create an instance of {@link SadrzajGlave.Odeljak }
     * 
     */
    public SadrzajGlave.Odeljak createSadrzajGlaveOdeljak() {
        return new SadrzajGlave.Odeljak();
    }

    /**
     * Create an instance of {@link SadrzajStav.Tacka }
     * 
     */
    public SadrzajStav.Tacka createSadrzajStavTacka() {
        return new SadrzajStav.Tacka();
    }

    /**
     * Create an instance of {@link SadrzajClan.Tacka }
     * 
     */
    public SadrzajClan.Tacka createSadrzajClanTacka() {
        return new SadrzajClan.Tacka();
    }

    /**
     * Create an instance of {@link SadrzajClan.Stav }
     * 
     */
    public SadrzajClan.Stav createSadrzajClanStav() {
        return new SadrzajClan.Stav();
    }

    /**
     * Create an instance of {@link SadrzajOdeljka.Clan }
     * 
     */
    public SadrzajOdeljka.Clan createSadrzajOdeljkaClan() {
        return new SadrzajOdeljka.Clan();
    }

    /**
     * Create an instance of {@link SadrzajPodtacke.Alineja.Status.Ref }
     * 
     */
    public SadrzajPodtacke.Alineja.Status.Ref createSadrzajPodtackeAlinejaStatusRef() {
        return new SadrzajPodtacke.Alineja.Status.Ref();
    }

    /**
     * Create an instance of {@link SadrzajTacke.Podtacka }
     * 
     */
    public SadrzajTacke.Podtacka createSadrzajTackePodtacka() {
        return new SadrzajTacke.Podtacka();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmandmanStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "status")
    public JAXBElement<AmandmanStatus> createStatus(AmandmanStatus value) {
        return new JAXBElement<AmandmanStatus>(_Status_QNAME, AmandmanStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TStatusAkta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "status_izmene")
    public JAXBElement<TStatusAkta> createStatusIzmene(TStatusAkta value) {
        return new JAXBElement<TStatusAkta>(_StatusIzmene_QNAME, TStatusAkta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajOdeljka.Clan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Clan", scope = SadrzajOdeljka.class)
    public JAXBElement<SadrzajOdeljka.Clan> createSadrzajOdeljkaClan(SadrzajOdeljka.Clan value) {
        return new JAXBElement<SadrzajOdeljka.Clan>(_SadrzajOdeljkaClan_QNAME, SadrzajOdeljka.Clan.class, SadrzajOdeljka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajStav.Tacka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Tacka", scope = SadrzajStav.class)
    public JAXBElement<SadrzajStav.Tacka> createSadrzajStavTacka(SadrzajStav.Tacka value) {
        return new JAXBElement<SadrzajStav.Tacka>(_SadrzajStavTacka_QNAME, SadrzajStav.Tacka.class, SadrzajStav.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajClan.Tacka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Tacka", scope = SadrzajClan.class)
    public JAXBElement<SadrzajClan.Tacka> createSadrzajClanTacka(SadrzajClan.Tacka value) {
        return new JAXBElement<SadrzajClan.Tacka>(_SadrzajStavTacka_QNAME, SadrzajClan.Tacka.class, SadrzajClan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajClan.Stav }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Stav", scope = SadrzajClan.class)
    public JAXBElement<SadrzajClan.Stav> createSadrzajClanStav(SadrzajClan.Stav value) {
        return new JAXBElement<SadrzajClan.Stav>(_SadrzajClanStav_QNAME, SadrzajClan.Stav.class, SadrzajClan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajPodtacke.Alineja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Alineja", scope = SadrzajPodtacke.class)
    public JAXBElement<SadrzajPodtacke.Alineja> createSadrzajPodtackeAlineja(SadrzajPodtacke.Alineja value) {
        return new JAXBElement<SadrzajPodtacke.Alineja>(_SadrzajPodtackeAlineja_QNAME, SadrzajPodtacke.Alineja.class, SadrzajPodtacke.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajDeo.Odeljak }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Odeljak", scope = SadrzajDeo.class)
    public JAXBElement<SadrzajDeo.Odeljak> createSadrzajDeoOdeljak(SadrzajDeo.Odeljak value) {
        return new JAXBElement<SadrzajDeo.Odeljak>(_SadrzajDeoOdeljak_QNAME, SadrzajDeo.Odeljak.class, SadrzajDeo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajDeo.Glava }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Glava", scope = SadrzajDeo.class)
    public JAXBElement<SadrzajDeo.Glava> createSadrzajDeoGlava(SadrzajDeo.Glava value) {
        return new JAXBElement<SadrzajDeo.Glava>(_SadrzajDeoGlava_QNAME, SadrzajDeo.Glava.class, SadrzajDeo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajDeo.Clan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Clan", scope = SadrzajDeo.class)
    public JAXBElement<SadrzajDeo.Clan> createSadrzajDeoClan(SadrzajDeo.Clan value) {
        return new JAXBElement<SadrzajDeo.Clan>(_SadrzajOdeljkaClan_QNAME, SadrzajDeo.Clan.class, SadrzajDeo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajGlave.Odeljak }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Odeljak", scope = SadrzajGlave.class)
    public JAXBElement<SadrzajGlave.Odeljak> createSadrzajGlaveOdeljak(SadrzajGlave.Odeljak value) {
        return new JAXBElement<SadrzajGlave.Odeljak>(_SadrzajDeoOdeljak_QNAME, SadrzajGlave.Odeljak.class, SadrzajGlave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajGlave.Clan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Clan", scope = SadrzajGlave.class)
    public JAXBElement<SadrzajGlave.Clan> createSadrzajGlaveClan(SadrzajGlave.Clan value) {
        return new JAXBElement<SadrzajGlave.Clan>(_SadrzajOdeljkaClan_QNAME, SadrzajGlave.Clan.class, SadrzajGlave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SadrzajTacke.Podtacka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/propisi", name = "Podtacka", scope = SadrzajTacke.class)
    public JAXBElement<SadrzajTacke.Podtacka> createSadrzajTackePodtacka(SadrzajTacke.Podtacka value) {
        return new JAXBElement<SadrzajTacke.Podtacka>(_SadrzajTackePodtacka_QNAME, SadrzajTacke.Podtacka.class, SadrzajTacke.class, value);
    }

}
