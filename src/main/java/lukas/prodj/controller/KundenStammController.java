package lukas.prodj.controller;


import lukas.prodj.entity.KundenStammEntity;
import lukas.prodj.service.KundenStammService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KundenStammController {

    @Autowired
    private KundenStammService kundenStammService;

    @RequestMapping(value = { "/kundenstammcreate"}, method = RequestMethod.GET)
    public String showAddKundenstamms(Model model) {

        model.addAttribute("kundenstammmodel", new KundenStammEntity());

        return "kundenstammcreate";
    }

    @RequestMapping(value = { "/kundenstammcreate" }, method = RequestMethod.POST)
    public String createKundenstamm(@ModelAttribute("kundenstammmodel") KundenStammEntity kundenStamm) {
        kundenStammService.createKunden(kundenStamm);
        return "redirect:/kundenstammmenu";

    }

    @RequestMapping(value = { "/kundenstammshow" }, method = RequestMethod.GET)
    public String showKundenstamm(Model model){

        model.addAttribute("kundenstammshow",kundenStammService.getKundens());
        return "kundenstammshow";
    }
    // Poisk po ID
    @RequestMapping(value = { "/kundenstammmenu" }, method = RequestMethod.GET)
    public String kundenstammMenu(Model model){

        return "kundenstammmenu";
    }
}
