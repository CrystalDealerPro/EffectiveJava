package crystal.dealer.pro.effective.java.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import crystal.dealer.pro.effective.java.singleton.serializable.FactoryMethodSerializable;
import crystal.dealer.pro.effective.java.singleton.serializable.PublicFinalFieldSerializable;

public class Main {

	private static final String FILE1 = "x.ser";
	
	private static final String FILE2 = "y.ser";
	
	private static final String FILE3 = "z.ser";
	
	public static void main(String[] args){
		
		checkSingleInstances();
		checkSerialization();	
	}
	
	private static void serializeSingleton(Serializable singleton, File f){
		FileOutputStream foStream = null;
		ObjectOutputStream objStream = null;

		try{
			if(!f.exists()){
				f.createNewFile();
			}
			foStream = new FileOutputStream(f, false);
			
			objStream = new ObjectOutputStream(foStream);
			
			objStream.writeObject(singleton);
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
			
		}finally{
			try{
				foStream.close();
				objStream.close();
			}catch (IOException e) {		
				e.printStackTrace();
			}			
		}
	}
	
	private static Serializable deserializeSingleton(File f){
		FileInputStream fiStream = null;
		ObjectInputStream objStream = null;
		Serializable obj = null;
		if(f.exists()){
			try{
				fiStream = new FileInputStream(f);
				objStream = new ObjectInputStream(fiStream);
				obj = (Serializable) objStream.readObject();
			} catch(IOException e){
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally{
				try{
					fiStream.close();
					objStream.close();
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
		return obj;
	}

	private static void checkSingleInstances(){
		
		for(int i = 0; i < 20; i++){
			System.out.println("i = " + i + ":");
			PublicFinalField.INSTANCE.printHashCode();
			FactoryMethod.getInstance().printHashCode();
			Enum.INSTANCE.printHashCode();
		}
		
	}

	private static void checkSerialization(){
		File f1 = new File(FILE1);
		File f2 = new File(FILE2);
		File f3 = new File(FILE3);
		
		PublicFinalFieldSerializable s1 = PublicFinalFieldSerializable.INSTANCE;
		s1.setD(1.5432);
		s1.setData(new Date());
		s1.setDecimal(new BigDecimal("6487326844324.5437543543"));
		s1.setName("S!");
		s1.setNumber(1432);
		
		FactoryMethodSerializable s2 = FactoryMethodSerializable.getInstance();
		s2.setD(9843.432);
		s2.setData(new Date());
		s2.setDecimal(new BigDecimal("5435436574.7457457"));
		s2.setName("S@");
		s2.setNumber(432);
		
		Enum s3 = Enum.INSTANCE;
		s3.setD(98776890d);
		s3.setData(new Date());
		s3.setDecimal(new BigDecimal(1));
		s3.setName("s#");
		s3.setNumber(8765);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toFiledString());	
		
		serializeSingleton(s1, f1);
		serializeSingleton(s2, f2);
		serializeSingleton(s3, f3);
				
		
		PublicFinalFieldSerializable d1 = (PublicFinalFieldSerializable) deserializeSingleton(f1);
		FactoryMethodSerializable d2 = (FactoryMethodSerializable) deserializeSingleton(f2);
		Enum d3 = (Enum) deserializeSingleton(f3);
		
		d1.printHashCode();
		d2.printHashCode();
		d3.printHashCode();
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toFiledString());
	}
}
