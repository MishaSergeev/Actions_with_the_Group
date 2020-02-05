package com.gmail.ps.allllll;
import java.io.*;

public class Serializable {
	public static void seveGroupToFile(File list, Group dp) throws IOException{
		if (list==null || dp == null){
            throw  new IllegalArgumentException("NULL");
        }
        try (ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream(list))){

            oos.writeObject(dp);

        } catch (IOException e){
            throw e;
        }
    }
	
	public static Group readGroupFromFile (File list)  throws IOException, ClassNotFoundException {
    if (list == null){
        throw new IllegalArgumentException("NULL");
    }
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(list))){
        return (Group) ois.readObject();
    } catch (IOException e){
        throw e;
    }
}
}
