//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.28 at 12:07:24 PM CEST 
//


package disco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Layout" type="{}LayoutType"/>
 *         &lt;element name="Nodes" type="{}NodesType"/>
 *         &lt;element name="Edges" type="{}EdgesType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numNodes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nodeThreshold" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="edgeThreshold" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="discoVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessMapType", propOrder = {
    "layout",
    "nodes",
    "edges"
})
public class ProcessMapType {

    @XmlElement(name = "Layout", required = true)
    protected LayoutType layout;
    @XmlElement(name = "Nodes", required = true)
    protected NodesType nodes;
    @XmlElement(name = "Edges", required = true)
    protected EdgesType edges;
    @XmlAttribute(name = "numNodes")
    protected Integer numNodes;
    @XmlAttribute(name = "nodeThreshold")
    protected Float nodeThreshold;
    @XmlAttribute(name = "edgeThreshold")
    protected Float edgeThreshold;
    @XmlAttribute(name = "discoVersion")
    protected String discoVersion;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutType }
     *     
     */
    public LayoutType getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutType }
     *     
     */
    public void setLayout(LayoutType value) {
        this.layout = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link NodesType }
     *     
     */
    public NodesType getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodesType }
     *     
     */
    public void setNodes(NodesType value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link EdgesType }
     *     
     */
    public EdgesType getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgesType }
     *     
     */
    public void setEdges(EdgesType value) {
        this.edges = value;
    }

    /**
     * Gets the value of the numNodes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumNodes() {
        return numNodes;
    }

    /**
     * Sets the value of the numNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumNodes(Integer value) {
        this.numNodes = value;
    }

    /**
     * Gets the value of the nodeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNodeThreshold() {
        return nodeThreshold;
    }

    /**
     * Sets the value of the nodeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNodeThreshold(Float value) {
        this.nodeThreshold = value;
    }

    /**
     * Gets the value of the edgeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEdgeThreshold() {
        return edgeThreshold;
    }

    /**
     * Sets the value of the edgeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEdgeThreshold(Float value) {
        this.edgeThreshold = value;
    }

    /**
     * Gets the value of the discoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoVersion() {
        return discoVersion;
    }

    /**
     * Sets the value of the discoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoVersion(String value) {
        this.discoVersion = value;
    }

}