package org.javasmiths.encodingfarm.worker.web.dto;

/**
 *
 * @author Quintendockx
 */
public class RequestDto {

    private String id;
    private String path;

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
