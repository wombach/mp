//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.09 at 09:51:24 PM CET 
//


package org.opengroup.xsd.archimate._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This is a container for all of the Viewpoints in the model.
 *             
 * 
 * <p>Java class for ViewpointsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewpointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewpoint" type="{http://www.opengroup.org/xsd/archimate/3.0/}ViewpointType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewpointsType", propOrder = {
    "viewpoint"
})
public class ViewpointsType {

    @XmlElement(required = true)
    protected List<ViewpointType> viewpoint;

    /**
     * Gets the value of the viewpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewpointType }
     * 
     * 
     */
    public List<ViewpointType> getViewpoint() {
        if (viewpoint == null) {
            viewpoint = new ArrayList<ViewpointType>();
        }
        return this.viewpoint;
    }

}
