/*package SeleniumTest;

package SeleniumTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import Econ4Configuration.EconData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ProductCategoriesByDealer2 {



	static Connection conn=null;
	static Statement st=null;
	static ResultSet rs =null;
	static  List<String> l=new ArrayList<String>();
	static  List<String> l1=new ArrayList<String>();
	static 	List<String> l2=new ArrayList<String>();
	static 	List<String> l3=new ArrayList<String>();
	static 	List<String> l4=new ArrayList<String>();
    
	@Test
	public  static void ProductCategoriesBydealer()
	{
		RestAssured.baseURI=EconData.BaseUri;

		given().
		header("Accept",EconData.Accept).
		header("Content-Type",EconData.ContentType).
		header("Authorization",EconData.Token).
		when().
		get(EconData.ProductCategoriesByDealer).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and();


			 
			 String response = given().header("Accept",EconData.Accept).header("Content-Type",EconData.ContentType).header("Authorization",EconData.Token).
						when().get(EconData.ProductCategoriesByDealer).asString();



		Response  response1 = given().header("Accept","application/json").header("Content-Type","application/json").header("Authorization",EconData.Token).
				when().get(EconData.ProductCategoriesByDealer);
		System.err.println("Response:"+response1.body().prettyPrint());

		String response = given().header("Accept",EconData.Accept).header("Content-Type",EconData.ContentType).header("Authorization",EconData.Token).
				when().get(EconData.ProductCategoriesByDealer).asString();

		JsonPath jp = new JsonPath(response);



		
	     	Connection conn=null;
				Statement st=null;
				ResultSet rs =null;

		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			conn=DriverManager.getConnection("jdbc:sqlserver://QTSQADB-2;instanceName=QABETA;databaseName=SGEAS_DIFF","srvecon4","R3c0n$3@1b7");
			String ob="select status,ecom_prod_category_desc,ecom_prod_category_name,ecom_prod_category_code,language_code,id\r\n" + 
					"from ref_product_code as rpc inner join Ref_Product_category as rpp on rpc.ecom_prod_category=rpp.ecom_prod_category_code \r\n" + 
					"inner join V_DEALER as d on d.Program_id=rpc.Program_ID\r\n" + 
					"where rpc.program_id=20285 and cms_dealer_number='AU401A31'\r\n" + 
					"";

			st=conn.createStatement();
			rs=st.executeQuery(ob);
			System.out.println("");
			while(rs.next()){
				String s=rs.getString(1);
				String s1=rs.getString(2);
				String s2=rs.getString(3);
				String s3=rs.getString(4);
				String s4=rs.getString(5);
				String s5=rs.getString(6);

				//System.out.println("=============================================================================================");	
				//System.out.println(s);	
				//	System.out.println(s+"\t"     +s1+"\t"           +s2+"\t"          +s3+"\t"              +s4+"\t"                +s5+"\t");
				//	System.out.println("=============================================================================================");


				/ ================================================== Array list Data===================================================*/		

			/*			l.add(s);	
				l1.add(s1);
				l2.add(s2);
				l3.add(s3);
				l4.add(s4);	

			}
			System.out.println(l);
			System.out.println(l1);
			System.out.println(l2);
			System.out.println(l3);
			System.out.println(l4);




			/ =============================================== Data Validation:"ecomProdCategoryCode":VSC===================================*/


		/*			assertEquals(l3.get(9), jp.get("productCategories[0].ecomProdCategoryCode"));
			assertEquals(l1.get(10), jp.get("productCategories[0].ecomCategoryDescription"));
			assertEquals(l2.get(9), jp.get("productCategories[0].ecomCategoryName"));
			assertEquals(l4.get(9), jp.get("productCategories[0].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[0].categoryStatus"));

			/ =============================================== Data Validation:"ecomProdCategoryCode":GAP===================================*/

/*
					assertEquals(l3.get(8), jp.get("productCategories[1].ecomProdCategoryCode"));
			assertEquals(l1.get(8), jp.get("productCategories[1].ecomCategoryDescription"));
			assertEquals(l2.get(8), jp.get("productCategories[1].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[1].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[1].categoryStatus"));


			/ =============================================== Data Validation:"ecomProdCategoryCode":CPO===================================*/


		/*			assertEquals(l3.get(6), jp.get("productCategories[2].ecomProdCategoryCode"));
			assertEquals(l1.get(6), jp.get("productCategories[2].ecomCategoryDescription"));
			assertEquals(l2.get(6), jp.get("productCategories[2].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[2].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[2].categoryStatus"));

			/ =============================================== Data Validation:"ecomProdCategoryCode":GAP PLUS===================================*/


		/*			assertEquals(l3.get(5), jp.get("productCategories[3].ecomProdCategoryCode"));
			assertEquals(l1.get(5), jp.get("productCategories[3].ecomCategoryDescription"));
			assertEquals(l2.get(5), jp.get("productCategories[3].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[3].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[3].categoryStatus"));



			/ =============================================== Data Validation:"ecomProdCategoryCode":LWT===================================*/

/*
					assertEquals(l3.get(4), jp.get("productCategories[4].ecomProdCategoryCode"));
			assertEquals(l1.get(4), jp.get("productCategories[4].ecomCategoryDescription"));
			assertEquals(l2.get(4), jp.get("productCategories[4].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[4].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[4].categoryStatus"));

			/ =============================================== Data Validation:"ecomProdCategoryCode":PROTECTION===================================*/

/*
					assertEquals(l3.get(3), jp.get("productCategories[5].ecomProdCategoryCode"));
			assertEquals(l1.get(3), jp.get("productCategories[5].ecomCategoryDescription"));
			assertEquals(l2.get(3), jp.get("productCategories[5].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[5].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[5].categoryStatus"));

			/ =============================================== Data Validation:"ecomProdCategoryCode":TERM===================================*/

/*
					assertEquals(l3.get(1), jp.get("productCategories[6].ecomProdCategoryCode"));
			assertEquals(l1.get(1), jp.get("productCategories[6].ecomCategoryDescription"));
			assertEquals(l2.get(1), jp.get("productCategories[6].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[6].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[6].categoryStatus"));


			/ =============================================== Data Validation:"ecomProdCategoryCode":"THEFT===================================*/


	/*			assertEquals(l3.get(0), jp.get("productCategories[7].ecomProdCategoryCode"));
			assertEquals(l1.get(0), jp.get("productCategories[7].ecomCategoryDescription"));
			assertEquals(l2.get(0), jp.get("productCategories[7].ecomCategoryName"));
			assertEquals(l4.get(0), jp.get("productCategories[7].languageCode"));
			assertEquals(l.get(1), jp.get("productCategories[7].categoryStatus"));




		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(conn!=null)
					conn.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}


				 JsonPath jp = new JsonPath(response); 
	             assertEquals("VSC", jp.get("productCategories[0].ecomCategoryName"));
	            assertEquals("GAP", jp.get("productCategories[1].ecomCategoryName"));
	             assertEquals("CPO", jp.get("productCategories[2].ecomCategoryName"));
	             assertEquals("GAP PLUS", jp.get("productCategories[3].ecomCategoryName"));
	             assertEquals("LWT", jp.get("productCategories[4].ecomCategoryName"));
	             assertEquals("PROTECTION", jp.get("productCategories[5].ecomCategoryName"));
	              assertEquals("TERM", jp.get("productCategories[6].ecomCategoryName"));
	              assertEquals("THEFT", jp.get("productCategories[7].ecomCategoryName"));
	              assertEquals("200", jp.get("messages[0].status"));
	              assertEquals("Success", jp.get("messages[0].details"));

		}

	}
}


}
*/