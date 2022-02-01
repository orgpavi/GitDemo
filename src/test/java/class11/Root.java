package class11;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true) --> Ignoring the propeties
@JsonIgnoreProperties(value = {"support"})
public class Root {
	
	    private Data data;
	    private Support support;
		public Data getData() {
			return data;
		}
		public void setData(Data data) {
			this.data = data;
		}
		/*public Support getSupport() {
			return support;
		}
		public void setSupport(Support support) {
			this.support = support;
		}*/
	    

}
