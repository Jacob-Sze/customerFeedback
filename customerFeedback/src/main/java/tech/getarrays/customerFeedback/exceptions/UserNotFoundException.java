package tech.getarrays.customerFeedback.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String name){
        super(name);
    }
}
