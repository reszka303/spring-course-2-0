package pl.javastart.naturaltemplates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PictureController {

    private final PictureRepository pictureRepository;

    public PictureController(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @GetMapping("/pic")
    String getPicture(@RequestParam String id, Model model) {
        Picture picture = pictureRepository.findImageById(id);
        model.addAttribute("picture", picture);
        return "picture";
    }
}
