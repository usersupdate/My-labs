
package sample.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="firm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASUS"/>
 *     &lt;enumeration value="MSI"/>
 *     &lt;enumeration value="GIGABYTE"/>
 *     &lt;enumeration value="PALIT"/>
 *     &lt;enumeration value="SAPPHIRE"/>
 *     &lt;enumeration value="RADEON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "firm")
@XmlEnum
public enum Firm {

    ASUS,
    MSI,
    GIGABYTE,
    PALIT,
    SAPPHIRE,
    RADEON;

    public String value() {
        return name();
    }

    public static Firm fromValue(String v) {
        return valueOf(v);
    }

}
