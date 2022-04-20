package day42_Exceptions;

public class ThrowKeyword2 {
    public static void main(String[] args) throws NoSuchFieldException {
        throw new NoSuchFieldException("There is no such element");
    }
}
