package org.javasmiths.encodingfarm.worker.web.dto;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Quintendockx
 */
public class RequestDto {

    private String id;
    private String path;
    private List<String> jobIds = new LinkedList<>();
    private String jobs;

    public String getJobs() {
        String jobs = "";
        if (jobIds.isEmpty()) {
            jobs = "Geen jobs gestart";
        } else {
            for (int i = 0; i < jobIds.size(); i++) {
                jobs += jobIds.get(i) + " ";
            }
        }
        return jobs;
    }

    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
