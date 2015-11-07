package org.javasmiths.encodingfarm.manager.webadmin.config;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
<<<<<<< HEAD:manager/web-admin/src/main/java/org/javasmiths/encodingfarm/manager/webadmin/config/ApplicationConfig.java
        resources.add(org.javasmiths.encodingfarm.manager.webadmin.controller.WorkerController.class);
=======
        resources.add(org.javasmiths.encodingfarm.manager.web.controller.JobController.class);
        resources.add(org.javasmiths.encodingfarm.manager.web.controller.VideoController.class);
	    resources.add(org.javasmiths.encodingfarm.manager.web.controller.WorkerController.class);

>>>>>>> refs/remotes/origin/Manager-async:manager/web-async/src/main/java/org/javasmiths/encodingfarm/manager/web/config/ApplicationConfig.java
    }

}