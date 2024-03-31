package br.com.FullStack.M1S09.erro;

public class NotFound extends RuntimeException{
    public NotFound() {
    }

    public NotFound(String message) {
        super(message);
    }
}
