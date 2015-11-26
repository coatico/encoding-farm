
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.manager.web.dto.VideoDto;

/**
 *
 * @author Alexander Hermans
 */
public interface VideoFacade {

    public void create(String videoTitle, String videoLink, String videoCode, String videoDescription);

    public void delete(String id);

    public void update(String id, String title, String videoLink, String videoCode, String videoDescription);

    public List<VideoDto> listAll();

}
