package nz.ac.eit;

public class InputNotSupportedException extends Exception {
    private String input;

    public InputNotSupportedException(String language) {
        this.input=input;
    }

    @Override
    public String getMessage() {
        return "The language "+input+" is not supported";
    }
}
