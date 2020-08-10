package service.gallery.config.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import service.gallery.config.model.ImageEntity;

import java.util.List;

@Service
@FeignClient(name = "image-service")
@RibbonClient(name = "image-service")
public interface ImageServiceProxy {

    @GetMapping(value = "/api/image/list-all")
    List<ImageEntity> getAllImages();
}
