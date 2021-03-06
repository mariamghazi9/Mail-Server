package eg.edu.alexu.cs.datastructures.classes;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.stream.Stream;
import eg.edu.alexu.cs.datastructures.Interfaces.IContact;
import eg.edu.alexu.csd.datastructure.SinglyLinkedList;

public class Contact implements IContact,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	enum Folders{Inbox,Sent,Drafts,Trash}
    private String name;
    private String email;
    private String password;
    private String birthday;
    private String userPath;

    
    public Contact(){}
    public Contact(String email, String password){
    	this.email = email.toLowerCase();
    	this.password = password;
    }
    
    Contact(String email){
    	this.email = email.toLowerCase();
    }

   public String getEmail()
    {
    	return email;
    }
 
   public void setEmail(final String email)
   {
	   this.email=email.toLowerCase();
   }
   
   public String getPassword()
   {
	   return password;
   }
   
   public void setPassword(final String password)
   {
	   this.password=password;
   }
   
   public void setName(final String name)
   {
	   this.name=name;
   }
   
   public String getName()
   {
	   return name;
   }
    
   public void setBirthday(String birthday)
   {
	   this.birthday=birthday;
   }
   
   public String getBirthday()
   {
	   return birthday;
   }
   
   public void setUserPath()
   {
	   this.userPath=App.accountsFolderPath+File.separator+this.email;
   }
   
   public String getUserPath()
   {
	   return userPath;
   }
	
}
