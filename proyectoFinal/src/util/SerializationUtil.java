/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.*;

/**
 *
 * @author Joel
 */
public class SerializationUtil {

    public static void serialize(Object obj, String path) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
            oos.flush();
        }
    }

    public static <T> T deserialize(String path, Class<T> clazz) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Object o = ois.readObject();
            return clazz.cast(o);
        }
    }
}

