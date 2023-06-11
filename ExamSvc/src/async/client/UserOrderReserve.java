
package async.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userOrderReserve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userOrderReserve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="videoCard" type="{http://asu.dgtu.donetsk.ua/ex/students}videoCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userOrderReserve", propOrder = {
    "count",
    "orderPrice",
    "videoCard"
})
public class UserOrderReserve {

    protected int count;
    protected double orderPrice;
    protected VideoCard videoCard;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the orderPrice property.
     * 
     */
    public double getOrderPrice() {
        return orderPrice;
    }

    /**
     * Sets the value of the orderPrice property.
     * 
     */
    public void setOrderPrice(double value) {
        this.orderPrice = value;
    }

    /**
     * Gets the value of the videoCard property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCard }
     *     
     */
    public VideoCard getVideoCard() {
        return videoCard;
    }

    /**
     * Sets the value of the videoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCard }
     *     
     */
    public void setVideoCard(VideoCard value) {
        this.videoCard = value;
    }

}
