package converts_casting;

public class WrapperExample {
    public static void main(String[] args) {
        String s1 = "123";
        byte b1 = Byte.parseByte(s1);
        short short1 = Short.parseShort(s1);
        String s2 = "123123123123";
        long l1 = Long.parseLong(s2);
        String s3 = "123.34";
        float f1 = Float.parseFloat(s3);
        double d1 = Double.parseDouble(s3);
        String s4 = "true";
        boolean bool1 = Boolean.parseBoolean(s4);
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.valueOf(s1);

    }
}














