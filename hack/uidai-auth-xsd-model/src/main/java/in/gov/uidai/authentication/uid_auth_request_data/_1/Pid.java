//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.06 at 01:34:16 PM IST 
//


package in.gov.uidai.authentication.uid_auth_request_data._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Demo" type="{http://www.uidai.gov.in/authentication/uid-auth-request-data/1.0}Demo" minOccurs="0"/&gt;
 *         &lt;element name="Bios" type="{http://www.uidai.gov.in/authentication/uid-auth-request-data/1.0}Bios" minOccurs="0"/&gt;
 *         &lt;element name="Pv" type="{http://www.uidai.gov.in/authentication/uid-auth-request-data/1.0}Pv" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ts" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ver" type="{http://www.w3.org/2001/XMLSchema}string" default="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "demo",
    "bios",
    "pv"
})
@XmlRootElement(name = "Pid")
public class Pid {

    @XmlElement(name = "Demo")
    protected Demo demo;
    @XmlElement(name = "Bios")
    protected Bios bios;
    @XmlElement(name = "Pv")
    protected Pv pv;
    @XmlAttribute(name = "ts", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ts;
    @XmlAttribute(name = "ver")
    protected String ver;

    /**
     * Gets the value of the demo property.
     * 
     * @return
     *     possible object is
     *     {@link Demo }
     *     
     */
    public Demo getDemo() {
        return demo;
    }

    /**
     * Sets the value of the demo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demo }
     *     
     */
    public void setDemo(Demo value) {
        this.demo = value;
    }

    /**
     * Gets the value of the bios property.
     * 
     * @return
     *     possible object is
     *     {@link Bios }
     *     
     */
    public Bios getBios() {
        return bios;
    }

    /**
     * Sets the value of the bios property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bios }
     *     
     */
    public void setBios(Bios value) {
        this.bios = value;
    }

    /**
     * Gets the value of the pv property.
     * 
     * @return
     *     possible object is
     *     {@link Pv }
     *     
     */
    public Pv getPv() {
        return pv;
    }

    /**
     * Sets the value of the pv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pv }
     *     
     */
    public void setPv(Pv value) {
        this.pv = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTs() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTs(XMLGregorianCalendar value) {
        this.ts = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        if (ver == null) {
            return "1.0";
        } else {
            return ver;
        }
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

}
