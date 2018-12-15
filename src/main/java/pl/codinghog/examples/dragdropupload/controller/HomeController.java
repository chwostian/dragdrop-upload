package pl.codinghog.examples.dragdropupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String singleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            Path tempFile = Files.createTempFile("upload", ".tmp");
            Files.write(tempFile, file.getBytes());
            return "DONE: " + tempFile.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "SOMETHING WENT WRONG!";
    }
}
