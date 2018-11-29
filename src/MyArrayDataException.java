public class MyArrayDataException extends NumberFormatException{

    private int failedIndexNumberArray;
    private int failedIndexNumberElement;

    public MyArrayDataException(int failedIndexNumberArray, int failedIndexNumberElement) {
        super("Ячейка содержащяя символ попалась в строке под номером " + failedIndexNumberArray + " в ячейке номер " + failedIndexNumberElement);
        this.failedIndexNumberArray = failedIndexNumberArray;
        this.failedIndexNumberElement = failedIndexNumberElement;
    }
}
