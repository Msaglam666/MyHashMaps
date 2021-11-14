import java.util.HashMap;

//put
// get
//remove
//getAll
//size
public class main {
	public static void main(String[] args) {
		MyHashMaps<String, String> fullname = new MyHashMaps<String, String>();

		fullname.put("Ugurcan", " Cakir");
		fullname.put("Victor", " Hugo");
		fullname.put("Edgar", " Lee");
		fullname.put("Anastasios", " Bakasetas");
		fullname.put("Marek", " Hamsik");
		fullname.put("Andreas", " Cornelius");
		fullname.put("Anthony", " Nwakaeme");
		fullname.put("Abdulkadir", " Omur");
		fullname.put("Alexander", " Sorloth");
	
		fullname.get("Ugurcan");
		System.out.println("\n O sene bu sene \n");
		fullname.remove("Alexander");		
		fullname.size();
		System.out.println("\n O sene bu sene \n");		
		fullname.getAll();
		
		

	}
}
