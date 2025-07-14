package com.ARDE.MMD.IMMS.Utility;

import lombok.Data;

@Data
public class StringResponse {
	
	private String response;

	public StringResponse() {
	}

	public StringResponse(String s) {
		this.response = s;
	}
}
