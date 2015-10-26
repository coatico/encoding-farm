package org.javasmiths.encodingfarm.distributor.web.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import org.javasmiths.encodingfarm.distributor.web.controller.VideoController;

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
        resources.add(org.javasmiths.encodingfarm.distributor.domain.entity.InitDbStartup.class);
		resources.add(org.javasmiths.encodingfarm.distributor.web.controller.VideoController.class);
    }

}
