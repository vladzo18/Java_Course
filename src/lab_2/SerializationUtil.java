package lab_2;

import java.io.*;

public class SerializationUtil {

    public static void serialize(Object object, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

               oos.writeObject(object);

        } catch (Exception e) { }
    }

    public static Object deserialize(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fis)){

            return objectInputStream.readObject();

        }catch (Exception e) {}

        return null;
    }

}
