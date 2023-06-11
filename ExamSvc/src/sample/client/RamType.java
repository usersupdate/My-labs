
package sample.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ramType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ramType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GDDR6"/>
 *     &lt;enumeration value="GDDR5"/>
 *     &lt;enumeration value="GDDR4"/>
 *     &lt;enumeration value="GDDR3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ramType")
@XmlEnum
public enum RamType {

    @XmlEnumValue("GDDR6")
    GDDR_6("GDDR6"),
    @XmlEnumValue("GDDR5")
    GDDR_5("GDDR5"),
    @XmlEnumValue("GDDR4")
    GDDR_4("GDDR4"),
    @XmlEnumValue("GDDR3")
    GDDR_3("GDDR3");
    private final String value;

    RamType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RamType fromValue(String v) {
        for (RamType c: RamType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
