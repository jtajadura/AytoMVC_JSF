package open4job.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
 
@ManagedBean
@SessionScoped
//con esto sabe si tiene que hacer un get o un set
//en este caso trata el objeto como sesion
//si nos diera igual que muriera el objeto usariamos @RequestScoped

public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
