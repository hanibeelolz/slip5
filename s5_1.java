
import java.io.*; 
import java.util.*; 
class HashTableDemo {  
public static void main(String[] args) 
{ 
Hashtable<String, String> ht = new Hashtable<String, String>(); 
ht.put("Name", "Rohan"); 
ht.put("Mpbile_Nos", "8446049402");
Enumeration<String> e = ht.keys(); 
while (e.hasMoreElements()) { 
String key = e.nextElement(); 
System.out.println(key + ":" + ht.get(key)); 
} 
} 
}
