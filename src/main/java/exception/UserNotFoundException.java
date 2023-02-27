package exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Coul not found the user with id :" +id);
    }
}
