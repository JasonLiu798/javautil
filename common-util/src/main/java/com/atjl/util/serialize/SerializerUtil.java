package com.atjl.util.serialize;

import com.atjl.util.serialize.fst.FstSerializer;


/**
 * package of FstSerializer
 */
public class SerializerUtil {
	private SerializerUtil(){
		throw new UnsupportedOperationException();
	}
	
    private static Serializer serializer = new FstSerializer();

    public static byte[] serialize(Object object){
        return serializer.serialize(object);
    }

    public static <T> T deserialize(byte[] bytes, Class<T> clazz) {
        return serializer.deserialize(bytes, clazz);
    }

    public static Object deserialize(byte[] bytes) {
        return serializer.deserialize(bytes);
    }

}
