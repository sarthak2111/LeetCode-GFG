package com;

public class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }

    public static void main(String[] args) throws CustomException {
        ForExcuting ex = new ForExcuting();
        ex.throwCustomException();
    }
    public static class ForExcuting{
        public void throwCustomException() throws CustomException {
            throw new CustomException("Any message");
        }
    }
}
