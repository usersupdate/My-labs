
package sample.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videoCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="videoCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firm" type="{http://asu.dgtu.donetsk.ua/ex/passexam}firm" minOccurs="0"/>
 *         &lt;element name="GPUFrequencyMhz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ramGB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ramType" type="{http://asu.dgtu.donetsk.ua/ex/passexam}ramType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "videoCard", propOrder = {
    "firm",
    "gpuFrequencyMhz",
    "id",
    "model",
    "price",
    "ramGB",
    "ramType"
})
public class VideoCard {

    @XmlSchemaType(name = "string")
    protected Firm firm;
    @XmlElement(name = "GPUFrequencyMhz")
    protected int gpuFrequencyMhz;
    protected String id;
    protected String model;
    protected double price;
    protected int ramGB;
    @XmlSchemaType(name = "string")
    protected RamType ramType;

    /**
     * Gets the value of the firm property.
     * 
     * @return
     *     possible object is
     *     {@link Firm }
     *     
     */
    public Firm getFirm() {
        return firm;
    }

    /**
     * Sets the value of the firm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Firm }
     *     
     */
    public void setFirm(Firm value) {
        this.firm = value;
    }

    /**
     * Gets the value of the gpuFrequencyMhz property.
     * 
     */
    public int getGPUFrequencyMhz() {
        return gpuFrequencyMhz;
    }

    /**
     * Sets the value of the gpuFrequencyMhz property.
     * 
     */
    public void setGPUFrequencyMhz(int value) {
        this.gpuFrequencyMhz = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the ramGB property.
     * 
     */
    public int getRamGB() {
        return ramGB;
    }

    /**
     * Sets the value of the ramGB property.
     * 
     */
    public void setRamGB(int value) {
        this.ramGB = value;
    }

    /**
     * Gets the value of the ramType property.
     * 
     * @return
     *     possible object is
     *     {@link RamType }
     *     
     */
    public RamType getRamType() {
        return ramType;
    }

    /**
     * Sets the value of the ramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RamType }
     *     
     */
    public void setRamType(RamType value) {
        this.ramType = value;
    }

}
