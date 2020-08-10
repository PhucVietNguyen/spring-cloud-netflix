package service.image.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.image.config.model.ImageEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/image")
public class ImageController {

    @GetMapping(value = "/list-all")
    public List<ImageEntity> getAllImages(){
        List<ImageEntity> images = new ArrayList<>();
        images.add(new ImageEntity(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"));
        images.add(new ImageEntity(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"));
        images.add(new ImageEntity(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
        return images;
    }
}
