package service.gallery.config.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GalleryEntity implements Serializable {
    private Integer id;
    private List<ImageEntity> images;
}
