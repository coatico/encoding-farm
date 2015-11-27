package org.javasmiths.encodingfarm.manager.domain.entity;

/**
 *
 * @author Arne
 */
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

@Entity
@Table(name = "WORKERS")
public class WorkerEntity extends BaseTrackableEntity implements Serializable {

    @Column
    private String Name;
    @Column
    private boolean Status;
    @Column
    private String URL;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;

    }
    private String workerName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<workerJobEntity> workerworkerJob;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<JobStatusDescriptionEntity> workerJobStatusDescriptionEntity;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Collection<workerJobEntity> getWorkerworkerJob() {
        return workerworkerJob;
    }

    public void setWorkerworkerJob(Collection<workerJobEntity> workerworkerJob) {
        this.workerworkerJob = workerworkerJob;
    }

    public Collection<JobStatusDescriptionEntity> getWorkerJobStatusDescriptionEntity() {
        return workerJobStatusDescriptionEntity;
    }

    public void setWorkerJobStatusDescriptionEntity(Collection<JobStatusDescriptionEntity> workerJobStatusDescriptionEntity) {
        this.workerJobStatusDescriptionEntity = workerJobStatusDescriptionEntity;
    }

}
