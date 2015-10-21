package org.javasmiths.encodingfarm.worker.web.dto;

/**
 *
 * @author Quintendockx
 */
public class JobDto {

    private String status;
    private String id;
    private String reqId;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
