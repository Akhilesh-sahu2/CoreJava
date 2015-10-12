package example;

public class EqualAndHashCodeImpl {
	String empId;
	String empName;
	
	@Override
	public boolean equals(Object obj) {
		    if(obj == null)
		    	return false;
		    if(!(obj instanceof EqualAndHashCodeImpl)) 
		    	return false;
		    
		    EqualAndHashCodeImpl other = (EqualAndHashCodeImpl) obj;
		    
		    if(this.empId != other.empId)     
		    	return false;
		    if(! this.empName.equals(other.empName))
		    	return false;
		    
		    return true;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
}
