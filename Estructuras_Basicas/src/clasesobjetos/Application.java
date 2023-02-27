package clasesobjetos;
import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.AcceptPendingException;
import java.util.*;

public class Application {


	    public static void main(String[] args) throws Exception {
	      String response = "initial response";


	      try {
	    	  try {
	    		  response=responseOk();
	    	  }catch(AcceptPendingException e) {
	    		  System.out.println("First catch");
	    		  response=responseNoOk(2);
	    	  }
	      }catch(IOException ex) {
	    	  System.out.println("Second Catch");
	    	  System.out.println(response);
	    	  throw new Exception();
	      }finally {
	    	  System.out.println(response);
	      }
	    }

	    public static String responseOk(){
	        return "ok";
	    }
	    public static String responseNoOk(int i) throws AcceptPendingException,IOException,ExceptionInInitializerError{
	        if(i==1) {
	        	throw new AcceptPendingException();
	        }else if(i==2){
	        	throw new IOException();
	        }else {
	        	throw new ExceptionInInitializerError();
	        }
	        
	    }
	    

	
	
}
