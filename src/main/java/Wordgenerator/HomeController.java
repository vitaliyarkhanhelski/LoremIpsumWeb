package Wordgenerator;

import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/result")
    public String getResult(@RequestParam Integer count,
                            ModelMap map) {
        LoremIpsum loremIpsum = new LoremIpsum();
        map.put("words", loremIpsum.getWords(count));
        return "result";
    }

    @GetMapping("/")
    public String getResult(){
        return "index";
    }

}
