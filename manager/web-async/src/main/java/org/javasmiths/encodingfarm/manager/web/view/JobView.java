package org.javasmiths.encodingfarm.manager.web.view;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.manager.web.dto.JobDto;
import org.javasmiths.encodingfarm.manager.web.facade.JobFacade;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author thomas
 */
@RequestScoped
@Named("job")
public class JobView implements Serializable {

	private String jobTitle;
	private List<JobDto> list = new LinkedList<>();
		
	@EJB
	private JobFacade facade;
	
	@PostConstruct
	public void init(){
		list = facade.listAll();
	}
	
	public void create(ActionEvent actionEvent){
		facade.create(jobTitle);
		list = facade.listAll();
	}
        
        public void delete(String id){
            facade.delete(id);
            list = facade.listAll();
        }
        
        public void update(String id, String jobTitle){
            facade.update(id, jobTitle);
            list = facade.listAll();
        }
        
        public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


    public String getjobTitle() {
        return jobTitle;
    }

    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<JobDto> getList() {
        return list;
    }

    public void setList(List<JobDto> list) {
        this.list = list;
    }

    public void deleteById(String id) {
        facade.delete(id);
        list = facade.listAll();
    }

}
	
