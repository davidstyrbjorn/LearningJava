package com.serialization;

import java.io.*;

class Entity implements Serializable {
    public String name;
    public boolean active;

   public String toString(){
       return "Name: " + name + "|| State: " + active;
   }
}

public class SerializationExample {

    public static void main(String[] args) throws IOException {
        Entity love = new Entity();
        love.name = "yo";
        love.active = false;

        Entity me = new Entity();
        me.name = "me";
        me.active = true;

        // Serialize entity to D:\\temp\\entity.ser
        FileOutputStream fileOut = new FileOutputStream("D:\\temp\\entity.wtf");
        ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
        outStream.writeObject(me); // The writeObject(Object) Object must implement Serializable Interface
        // All members from Object must be serializable, if not mark member as transient which means the serializer will ignore it
        outStream.close();
        System.out.println("Serialized at D:\\temp\\entity.ser");

        // Deserialize entity from D:\\temp\\entity.ser
        Entity entity = null;
        try {
            // Deserialize from file and set entity to fetched object
            FileInputStream fileIn = new FileInputStream("D:\\temp\\entity.wtf");
            ObjectInputStream inStream = new ObjectInputStream(fileIn);
            entity = ((Entity) inStream.readObject());
            fileIn.close();
        }
        catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
        }

        System.out.println(entity.toString());
    }

}
