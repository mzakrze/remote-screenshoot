package pl.mzakrze.remotescreenshot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class MakeAScreenShotController {


    @PostMapping("/screenshot")
    public ScreenshotResponse makeScreenshot() {
        ScreenshotResponse res = new ScreenshotResponse();

        try {
            ProcessBuilder pb = new ProcessBuilder();
            pb.command("./src/main/resources/do-make-screenshot.sh");
            pb.start();
            res.status = "OK";
        } catch (IOException  e) {
            res.status = "ERROR";
            e.printStackTrace();
        }

        return res;
    }

    class ScreenshotResponse {
        public String status;
    }

}
