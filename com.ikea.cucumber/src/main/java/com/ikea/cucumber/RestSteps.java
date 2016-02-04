package com.ikea.cucumber;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Assert;
public class RestSteps {
	HttpGet httpGet;
	CloseableHttpClient httpClient;
	String urlBase="http://dev15.bulpros.com:8080/alfresco/s/dwt/admin/";
	String param="activityFromNode";	
	@When("^the user click POST updateCart$")
	public void the_user_click_POST_updateCart() throws Throwable {	
		this.httpClient = HttpClients.createDefault();
		 this.httpGet = new HttpGet(this.urlBase+param);
		 this.httpGet.addHeader("User-Agent", "Mozilla/5.0");
		 CredentialsProvider provider = new BasicCredentialsProvider();
   	 UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("admin", "admin");
   	 provider.setCredentials(AuthScope.ANY, credentials);
   	 this.httpClient = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();    	  	
   	 CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
   	 int statusCode = httpResponse.getStatusLine().getStatusCode();
   	 System.out.println(statusCode);
		JSONObject object = new JSONObject();
		String result=object.getJSONObject("status").getString("description");
	}
	@Then("^the response should be")
	public void the_response_should_be() throws Throwable {
		
	}	
	 /*@Then("^the collect points view is loaded$")
	public void is_it_logged() throws Throwable {
		 URL url = new URL(this.urlBase+this.param);
         URLConnection con = url.openConnection();
         InputStream in = con.getInputStream();
         String encoding = con.getContentEncoding();
         encoding = encoding == null ? "UTF-8" : encoding;
         String body = IOUtils.toString(in, encoding);
         System.out.println(body);
         Document doc = Jsoup.parse(body);
         List links = doc.getElementsByClass("nav_label");
         Assert.assertEquals(11, links.size());
         System.out.println("The found elements are:"+" "+links.size());
	}	*/
}