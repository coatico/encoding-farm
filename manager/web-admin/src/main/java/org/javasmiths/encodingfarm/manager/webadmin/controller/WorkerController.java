package org.javasmiths.encodingfarm.manager.webadmin.controller;

/*

package manager.ui.ui.controller;


import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.javasmiths.encodingfarm.manager.domain.dao.WorkerDao;
import manager.ui.entity.WorkerEntity;
import manager.ui.ui.model.SessionDto;
import manager.ui.ui.model.WorkerDetailDto;
import manager.ui.ui.model.WorkerListDetailDto;
import manager.ui.ui.model.WorkerPageDto;


@Named(value = "Worker")

@RequestScoped
public class WorkerController {

    private WorkerPageDto dto;

    @EJB
    private WorkerDao workerDao;

    @Inject
    private SessionDto sessionDto;

    @PostConstruct
    public void init() {
        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String editId = req.getParameter("edit");

        List<WorkerEntity> Workers = workerDao.listAll();
        dto = new WorkerPageDto();
        //edit
        if (editId != null) {
            WorkerEntity ce = workerDao.findById(editId);
            if (ce != null) {
                dto.getDetail().setId(ce.getId());
                dto.getDetail().setFirstName(ce.getFirstName());
                dto.getDetail().setLastName(ce.getLastName());
                dto.getDetail().setBirthdate(ce.getBirthdate());
                dto.getDetail().setEmail(ce.getEmail());
                dto.getDetail().setSex(ce.getSex());

            }
        }
        
        if (editId == null) {
            for (WorkerEntity Worker : Workers) {
                WorkerListDetailDto listDetail = new WorkerListDetailDto();
                listDetail.setId(Worker.getId());
                listDetail.setFirstName(Worker.getFirstName());
                listDetail.setLastName(Worker.getLastName());
                listDetail.setSex(Worker.getSex());
                listDetail.setEmail(Worker.getEmail());
                listDetail.setBirthdate(Worker.getBirthdate());
                dto.getList().add(listDetail);
            }
        }

    }

    public List<WorkerEntity> getlist() {
        List<WorkerEntity> workers = workerDao.listAll();

        for (WorkerEntity Worker : workers) {
            WorkerListDetailDto listDetail = new WorkerListDetailDto();
            listDetail.setId(Worker.getId());
            listDetail.setLastName(Worker.getLastName());
            listDetail.setFirstName(Worker.getFirstName());
            listDetail.setBirthdate(Worker.getBirthdate());
            listDetail.setSex(Worker.getSex());
            listDetail.setEmail(Worker.getEmail());
            dto.getList().add(listDetail);
        }

        return workers;
    }

    //Create function "Add"
    public String add() {
        String id = dto.getDetail().getId();
        WorkerEntity ce = null;
        if (id != null) {
            ce = workerDao.findById(id);
        }
        if (ce == null) {
            ce = new WorkerEntity();
        }
        ce.setFirstName(dto.getDetail().getFirstName());
        ce.setLastName(dto.getDetail().getLastName());
        ce.setSex(dto.getDetail().getSex());
        ce.setBirthdate(dto.getDetail().getBirthdate());
        ce.setEmail(dto.getDetail().getEmail());
        workerDao.save(ce);

        sessionDto.getUserDto().setFname(dto.getDetail().getFirstName());
        sessionDto.getUserDto().setLname(dto.getDetail().getLastName());
        sessionDto.getUserDto().setBirthd(dto.getDetail().getBirthdate());
        sessionDto.getUserDto().setSex(dto.getDetail().getSex());
        sessionDto.getUserDto().setEmail(dto.getDetail().getEmail());
        sessionDto.getUserDto().setLoggedIn(true);

        // Forces page refresh
        return "empregisterconfirmation.xhtml??faces-redirect=true";
    }

    public WorkerPageDto getDto() {
        return dto;
    }

    public void setDto(WorkerPageDto dto) {
        this.dto = dto;
    }

    public String remove() {
        String id = dto.getDetail().getId();

        workerDao.deleteById(id);

        // Forces page refresh
        return "empdeleteconfirmation.xhtml??faces-redirect=true";
    }



}
*/
