# mp
modelParser

Creating the models from xsd files
====================================
need a path without spaces... thus copy some of the libs and xsd files into a different location

set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_73
D:\jaxb\eclipselink\bin>jaxb-compiler.cmd BPMN20.xsd

this creates the relevant sources
copy them into the right place.

Discussion on Architect file exchange options
==============================================
Architect has different export formats:
- Archimate export: there are no profile information present although the archimate export format supports the use of properties. However, Architect chooses not to use them,
- Architect raw XML file: this is not a proper XML file. At least the XML editor of Eclipse does not recognizes the format as valid XML
- XMI export: this seems to cover all different models but not the profile information; it is unclear whether cross references are supported or not
- XML export: Own XML format which contains all information of the archimate model in proper XML. It also includes the profile information. It seems to be a proprietary XML schema; I do not have the xsd of the schema.
 
 