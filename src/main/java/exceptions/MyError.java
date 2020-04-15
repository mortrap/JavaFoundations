package exceptions;

public class MyError extends Error {
    public MyError(String message){
        super(message);
    }
}
