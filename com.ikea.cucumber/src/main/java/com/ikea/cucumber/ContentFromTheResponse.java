package com.ikea.cucumber;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import javax.net.ssl.HttpsURLConnection;

public class ContentFromTheResponse {
	HttpURLConnection urlConn = null;
	URL url;
	//--------------Create method callURL return json response--------------//	
	String callURL(String myURL) {
	StringBuilder sb = new StringBuilder();
	InputStreamReader in = null;
		try {
			this.url = new URL(myURL);
			urlConn = (HttpURLConnection) this.url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			urlConn.setRequestProperty("Content-Type", "application/json");
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
						}
					bufferedReader.close();
					}
				}
			in.close();
		} 
		catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:" + myURL,e);
		}
	return sb.toString();
	}	
	//------------------Create method responseCode to get response code-------------------//	
	int responseCode() throws IOException {
		return urlConn.getResponseCode();
	}
	String sendPost(String myURL) throws Exception {
		this.url=new URL(myURL);
		String USER_AGENT = "Mozilla/5.0";
		urlConn = (HttpURLConnection) this.url.openConnection();
		// add request header
		urlConn.setRequestMethod("POST");
		urlConn.setRequestProperty("User-Agent", USER_AGENT);
		urlConn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		/* If there is the parameters in the url: String urlParameters ="sn=C02G8416DRJM&cn=&locale=&caller=&num=12345"; */
		urlConn.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(urlConn.getOutputStream());
		wr.flush();
		wr.close();
		int responseCode = urlConn.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				urlConn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
	}
}
