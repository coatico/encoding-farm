
package org.javasmiths.encodingfarm.worker.web.dto;

/**
 *
 * @author Quintendockx
 */
public class RequestDto {
    private String id;
     private String video_path;

    public String getVideo_path() {
        return video_path;
    }

    public void setVideo_path(String video_path) {
        this.video_path = video_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     
}
