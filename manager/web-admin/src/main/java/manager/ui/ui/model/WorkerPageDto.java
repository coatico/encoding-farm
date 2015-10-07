/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui.ui.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Arne
 */
public class WorkerPageDto {
    
    private WorkerDetailDto detail = new WorkerDetailDto();

    private List<WorkerListDetailDto> list = new LinkedList<>();

    private List<String> workerList = new LinkedList<>();

    public List<String> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<String> workerList) {
        this.workerList = workerList;
    }

    public WorkerDetailDto getDetail() {
        return detail;
    }

    public void setDetail(WorkerDetailDto detail) {
        this.detail = detail;
    }

    public List<WorkerListDetailDto> getList() {
        return list;
    }

    public void setList(List<WorkerListDetailDto> list) {
        this.list = list;
    }

}
