package org.opengroup.xsd.archimate._3;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DataTypeAdapter extends XmlAdapter{

	@Override
	public Object marshal(Object arg0) throws Exception {
		System.out.println("marshal:"+arg0.getClass().getCanonicalName()+"|"+arg0.toString());
		return arg0;
	}

	@Override
	public Object unmarshal(Object arg0) throws Exception {
		System.out.println("unmarshal"+arg0.getClass().getCanonicalName()+"|"+arg0.toString());
		return null;
	}

}
