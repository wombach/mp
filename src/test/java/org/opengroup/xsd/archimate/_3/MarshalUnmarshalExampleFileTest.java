package org.opengroup.xsd.archimate._3;


import static org.junit.Assert.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.xmlunit.matchers.CompareMatcher;

public class MarshalUnmarshalExampleFileTest {

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
