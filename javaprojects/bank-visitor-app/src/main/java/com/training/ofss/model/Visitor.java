package com.training.ofss.model;

public class Visitor {
		private int visitorId;
		private String visitorName;
		private String purpose;
		private String mobileNumber;
		
		public Visitor() {
			// TODO Auto-generated constructor stub
		}

		public Visitor(int visitorId, String visitorName, String purpose, String mobileNumber) {
			super();
			this.visitorId = visitorId;
			this.visitorName = visitorName;
			this.purpose = purpose;
			this.mobileNumber = mobileNumber;
		}

		public String getVisitorName() {
			return visitorName;
		}

		public void setVisitorName(String visitorName) {
			this.visitorName = visitorName;
		}

		public String getPurpose() {
			return purpose;
		}

		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public int getVisitorId() {
			return visitorId;
		}

		@Override
		public String toString() {
			return "Visitor [visitorId=" + visitorId + ", visitorName=" + visitorName + ", purpose=" + purpose
					+ ", mobileNumber=" + mobileNumber + "]";
		}
	
}
