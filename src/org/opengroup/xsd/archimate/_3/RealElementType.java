//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.09 at 09:51:24 PM CET 
//


package org.opengroup.xsd.archimate._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Forces Real Elements to have Names.
 *             
 * 
 * <p>Java class for RealElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengroup.org/xsd/archimate/3.0/}ElementType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}NameGroup" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}DocumentationGroup"/>
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}grp.any"/>
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}ConceptGroup"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengroup.org/xsd/archimate/3.0/}ConceptAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opengroup.org/xsd/archimate/3.0/}IdentifierGroup"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealElementType")
@XmlSeeAlso({
    TechnologyProcess.class,
    Node.class,
    Product.class,
    BusinessObject.class,
    BusinessCollaboration.class,
    Goal.class,
    ImplementationEvent.class,
    Capability.class,
    BusinessEvent.class,
    DistributionNetwork.class,
    ApplicationFunction.class,
    TechnologyInterface.class,
    ApplicationEvent.class,
    Principle.class,
    Requirement.class,
    Contract.class,
    ApplicationService.class,
    Deliverable.class,
    CommunicationNetwork.class,
    TechnologyCollaboration.class,
    ApplicationCollaboration.class,
    Path.class,
    Plateau.class,
    ApplicationComponent.class,
    TechnologyInteraction.class,
    Artifact.class,
    BusinessFunction.class,
    Outcome.class,
    Facility.class,
    Constraint.class,
    BusinessActor.class,
    BusinessInteraction.class,
    WorkPackage.class,
    TechnologyFunction.class,
    Stakeholder.class,
    Device.class,
    Resource.class,
    Representation.class,
    DataObject.class,
    Gap.class,
    Value.class,
    BusinessInterface.class,
    ApplicationProcess.class,
    TechnologyService.class,
    BusinessRole.class,
    Assessment.class,
    SystemSoftware.class,
    Driver.class,
    ApplicationInterface.class,
    TechnologyEvent.class,
    CourseOfAction.class,
    Material.class,
    BusinessService.class,
    Equipment.class,
    ApplicationInteraction.class,
    Meaning.class,
    BusinessProcess.class
})
public abstract class RealElementType
    extends ElementType
{


}
