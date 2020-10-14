package nz.ac.eit;

public class NumberNotAnIntegerException extends Exception {
    private String typed;

    public NumberNotAnIntegerException(String typed) {
        this.typed=typed;
    }

    @Override
    public String getMessage() {
        return "The value typed: "+typed+" is not an integer";
    }
}
