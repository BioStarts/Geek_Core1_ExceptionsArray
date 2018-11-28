public class MyArrayDataException extends NumberFormatException{

    private int failedIndexNumberArray;
    private int failedIndexNumberElement;

    public MyArrayDataException(int failedIndexNumberArray, int failedIndexNumberElement) {
        super("Ячейка содержащяя символ попалась в массиве под номером " + failedIndexNumberArray + " в элементе номер " + failedIndexNumberElement);
        this.failedIndexNumberArray = failedIndexNumberArray;
        this.failedIndexNumberElement = failedIndexNumberElement;
    }
}
