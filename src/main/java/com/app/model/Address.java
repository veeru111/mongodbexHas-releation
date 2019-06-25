package com.app.model;

public class Address {
	
		private String loc;
		private String hoc;
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		public String getHoc() {
			return hoc;
		}
		public void setHoc(String hoc) {
			this.hoc = hoc;
		}
		@Override
		public String toString() {
			return "Address [loc=" + loc + ", hoc=" + hoc + "]";
		}
		public Address() {
			super();
		}
		public Address(String loc, String hoc) {
			super();
			this.loc = loc;
			this.hoc = hoc;
		}

		
}
