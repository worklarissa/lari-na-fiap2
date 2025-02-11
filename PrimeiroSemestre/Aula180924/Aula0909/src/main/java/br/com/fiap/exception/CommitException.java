package br.com.fiap.exception;

public class CommitException extends Exception{
    public CommitException(){
        super("Erro aao realizar commit");
    }

    public CommitException(String message){
        super(message);
    }
}