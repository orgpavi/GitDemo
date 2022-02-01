package class13;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Permissions {

	    private boolean push;
	    private boolean pull;
		public boolean isPush() {
			return push;
		}
		public void setPush(boolean push) {
			this.push = push;
		}
		public boolean isPull() {
			return pull;
		}
		public void setPull(boolean pull) {
			this.pull = pull;
		}
	    
}
