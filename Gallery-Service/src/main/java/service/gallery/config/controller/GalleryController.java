package service.gallery.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.gallery.config.model.GalleryEntity;
import service.gallery.config.model.ImageEntity;
import service.gallery.config.proxy.ImageServiceProxy;

import java.util.List;

@RestController
@RequestMapping(value = "/api/gallery")
public class GalleryController {

    @Autowired
    private ImageServiceProxy imageServiceProxy;

    @GetMapping(value = "/list-all")
    public GalleryEntity getGalleryAll(){
         List<ImageEntity> images = imageServiceProxy.getAllImages();
         return new GalleryEntity(1, images);
    }
}
