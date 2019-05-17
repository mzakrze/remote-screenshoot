package pl.mzakrze.remotescreenshot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MakeAScreenShotController {


    @PostMapping("/screenshot")
    public ScreenshotResponse makeScreenshot() {
        ScreenshotResponse res = new ScreenshotResponse();
        res.status = "mock";
        return res;
    }

    class ScreenshotResponse {
        public String status;
    }

}
