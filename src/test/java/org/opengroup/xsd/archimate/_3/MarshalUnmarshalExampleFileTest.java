package org.opengroup.xsd.archimate._3;


import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.Difference;
import org.xmlunit.diff.ElementSelectors;
import org.xmlunit.matchers.CompareMatcher;

public class MarshalUnmarshalExampleFileTest {

	@Test
	public void givenXMLFile_unmarshal_marshal_expectFileEqualsResult() throws JAXBException, IOException{
		JAXBContext jaxbContext =  JAXBContext.newInstance(ModelType.class);

		File file = new File("demo_archimate3.xml");
		StreamSource source = new StreamSource(file);
		Unmarshaller unmarshaller2 = jaxbContext.createUnmarshaller();
		JAXBElement<ModelType> result = unmarshaller2.unmarshal(source, ModelType.class);
		ModelType model = (ModelType) result.getValue();

		jaxbContext =  JAXBContext.newInstance(ModelType.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		FileWriter out = new FileWriter( "Main5_out.xml");
		marshaller.marshal(model, out);
		out.flush();
		out.close();
		File file2 = new File("Main5_out.xml");
//		
//		Diff diff = DiffBuilder.compare(Input.fromFile(file))
//				   .withTest(Input.fromFile(file2))
//				   .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndText))
//				   .build();
//		Iterator<Difference> it = diff.getDifferences().iterator();
//		while(it.hasNext()){
//			System.out.println(it.next().toString());
//		}
		assertThat(file, CompareMatcher.isSimilarTo(file2).ignoreComments().ignoreWhitespace());
		
}

	@Test
	public void given2XMLS_whenIdentical_thenCorrect() {
		String controlXml = "<struct><int>3</int><boolean>false</boolean></struct>";
		String testXml = "<struct><int>3</int><boolean>false</boolean></struct>";
		assertThat(testXml, CompareMatcher.isIdenticalTo(controlXml));
	}

	@Test
	public void jsonTest() throws JSONException {
		JSONObject data = new JSONObject("{friends:[{id:123,name:\"Corby Page\"},{id:456,name:\"Carter Page\"}]}");
		String expected = "{friends:[{id:123,name:\"Corby Page\"},{id:456,name:\"Carter Page\"}]}";
		JSONAssert.assertEquals(expected, data, false);
	}
	
	
}
