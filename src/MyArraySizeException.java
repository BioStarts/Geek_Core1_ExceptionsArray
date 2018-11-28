public class MyArraySizeException extends RuntimeException{

    public String getSizeMessage() {
        return sizeMessage;
    }
    private String sizeMessage;

    public MyArraySizeException(String sizeMessage) {
        super(sizeMessage);
    }
}
