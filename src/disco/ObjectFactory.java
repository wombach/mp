//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.28 at 12:07:24 PM CEST 
//


package disco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _ProcessMap_QNAME = new QName("", "ProcessMap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartNodeType }
     * 
     */
    public StartNodeType createStartNodeType() {
        return new StartNodeType();
    }

    /**
     * Create an instance of {@link EndNodeType }
     * 
     */
    public EndNodeType createEndNodeType() {
        return new EndNodeType();
    }

    /**
     * Create an instance of {@link EdgeType }
     * 
     */
    public EdgeType createEdgeType() {
        return new EdgeType();
    }

    /**
     * Create an instance of {@link FrequencyType }
     * 
     */
    public FrequencyType createFrequencyType() {
        return new FrequencyType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link LayoutType }
     * 
     */
    public LayoutType createLayoutType() {
        return new LayoutType();
    }

    /**
     * Create an instance of {@link EdgesType }
     * 
     */
    public EdgesType createEdgesType() {
        return new EdgesType();
    }

    /**
     * Create an instance of {@link NodesType }
     * 
     */
    public NodesType createNodesType() {
        return new NodesType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link ProcessMapType }
     * 
     */
    public ProcessMapType createProcessMapType() {
        return new ProcessMapType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessMapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessMap")
    public JAXBElement<ProcessMapType> createProcessMap(ProcessMapType value) {
        return new JAXBElement<ProcessMapType>(_ProcessMap_QNAME, ProcessMapType.class, null, value);
    }

}
