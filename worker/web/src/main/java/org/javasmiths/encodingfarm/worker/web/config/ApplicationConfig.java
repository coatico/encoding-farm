
package org.javasmiths.encodingfarm.worker.web.config;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.javasmiths.encodingfarm.worker.web.controller.JobController;
import org.javasmiths.encodingfarm.worker.web.controller.RequestController;

/**
 *
 * @author Pieter
 */
@ApplicationPath("worker")
public class ApplicationConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();;
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.javasmiths.encodingfarm.worker.web.controller.JobController.class);
        resources.add(org.javasmiths.encodingfarm.worker.web.controller.RequestController.class);
        resources.add(org.javasmiths.encodingfarm.worker.web.controller.WorkerController.class);
    }
}
