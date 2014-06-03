package pizashop;

import java.net.URL;
import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
	 @PrimaryKey
	    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	    private Long id;
	     
	    @Persistent
	    private String title;
	     
	   
	    @Persistent
	    private String comment;
	     
	    @Persistent
	    private Date datetime;
	 
	    public LinkData(String title, String comment,Date datetime) {
	        super();
	        this.title = title;
	        this.comment = comment;
	        
	        this.datetime = datetime;
	    }
	 

		public Long getId() {
	        return id;
	    }
	 
	    public void setId(Long id) {
	        this.id = id;
	    }
	 
	    public String getTitle() {
	        return title;
	    }
	 
	    public void setTitle(String title) {
	        this.title= title;
	    }
	    
	    public String getComment() {
	        return comment;
	    }
	 
	    public void setComment(String title) {
	        this.comment= comment;
	    }
	   
	 
	    public Date getDatetime() {
	        return datetime;
	    }
	 
	    public void setDatetime(Date datetime) {
	        this.datetime = datetime;
	    }
}
