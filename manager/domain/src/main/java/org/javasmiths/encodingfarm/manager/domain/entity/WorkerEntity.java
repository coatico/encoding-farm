/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

/**
 *
 * @author Arne
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

@Entity
@Table(name = "WORKERS")
public class WorkerEntity extends BaseTrackableEntity {

    //In deze File worden de Entities aangemaakt voor de tabel in de database.
    @Column
    private String Name;
    @Column
    private boolean Disabled;
    @Column
    private String URL;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isDisabled() {
        return Disabled;
    }

    public void setDisabled(boolean Disabled) {
        this.Disabled = Disabled;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

}
