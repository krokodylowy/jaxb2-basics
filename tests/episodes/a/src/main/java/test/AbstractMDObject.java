package test;

import java.io.Serializable;

import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

public class AbstractMDObject implements Cloneable, Serializable, CopyTo/*, AbstractMD */{

	private String id;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public Object createNewInstance() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object copyTo(Object target) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object copyTo(ObjectLocator locator, Object target, CopyStrategy copyStrategy) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	public Object clone() {
		AbstractMDObject clone = new AbstractMDObject();
		copyTo(clone);
		return clone;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractMDObject other = (AbstractMDObject) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
