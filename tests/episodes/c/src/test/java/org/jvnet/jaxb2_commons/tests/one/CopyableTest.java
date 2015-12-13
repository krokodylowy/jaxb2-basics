package org.jvnet.jaxb2_commons.tests.one;

import java.io.File;

import junit.framework.Assert;

import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.test.AbstractSamplesTest;
import org.jvnet.jaxb2_commons.test.episodes.b.BType;

public class CopyableTest extends AbstractSamplesTest {

	@Override
	protected void checkSample(File sample) throws Exception {

		//final Object object = createContext().createUnmarshaller().unmarshal(
		//1	sample);
		//final Object copy = JAXBCopyStrategy.INSTANCE.copy(null, object);

		final BType object = new BType();
		object.setB1("b1");
		object.setId("id");
		final BType copy = (BType) object.clone();
		//missing id value
		Assert.assertTrue("Source and copy must be equal.", JAXBEqualsStrategy.INSTANCE.equals(null, null, object, copy));
	}

}
