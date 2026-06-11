package Day8.Serization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Tester_PrdSerialize {

	public static void main(String[] args) {
		
		//object-----> byte-stream
		
		//write into file
		
		try(ObjectOutputStream  writer=new ObjectOutputStream(new FileOutputStream("ProductStore.dat"));)
		{
			//create product
			Product prd=new Product(101, "Tv", 100);	
			//serialize prd into file
			writer.writeObject(prd);//
			System.out.println("---Prd get stored----");
			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}