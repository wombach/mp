//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.09 at 09:51:24 PM CET 
//


package org.opengroup.xsd.archimate._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FontStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="bold"/>
 *     &lt;enumeration value="italic"/>
 *     &lt;enumeration value="underline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontStyleEnum")
@XmlEnum
public enum FontStyleEnum {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("bold")
    BOLD("bold"),
    @XmlEnumValue("italic")
    ITALIC("italic"),
    @XmlEnumValue("underline")
    UNDERLINE("underline");
    private final String value;

    FontStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontStyleEnum fromValue(String v) {
        for (FontStyleEnum c: FontStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
