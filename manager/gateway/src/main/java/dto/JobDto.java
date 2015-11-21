
package dto;

/**
 *
 * @author Pieter
 */
public class JobDto {
    
    private String status;
    
    public JobDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}
