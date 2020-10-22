package lukas.prodj.controller;


import lukas.prodj.entity.AngebotEntity;
import lukas.prodj.service.AngebotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AngebotController {

    @Autowired
    private AngebotService angebotService;

    @RequestMapping(value = { "/angebotcreate"}, method = RequestMethod.GET)
    public String showAddAngebots(Model model) {

        model.addAttribute("angebotmodel", new AngebotEntity());

        return "angebotcreate";
    }

    @RequestMapping(value = { "/angebotcreate" }, method = RequestMethod.POST)
    public String createAngebot(@ModelAttribute("angebotmodel") AngebotEntity angebot) {

        angebotService.createAngebot(angebot);
        return "redirect:/angebotmenu";

    }

    @RequestMapping(value = { "/angebotshow" }, method = RequestMethod.GET)
    public String showAngebots(Model model){
        List<AngebotEntity> angebotEntityList = angebotService.getAngebots();
        for (AngebotEntity angebot:angebotEntityList
             ) {
            if(angebot.getKundenStamm()==null){
                Long id = Long.valueOf(1);
                angebot.setKundenStamm(angebotService.getAngebot(id).getKundenStamm());
            }
        }
        model.addAttribute("angebotshow",angebotService.getAngebots() );

        return "angebotshow";
    }

    @RequestMapping(value = { "/oneangebot/{id}" }, method = RequestMethod.GET)
    public String showAngebots(@PathVariable Long id,Model model){

        model.addAttribute("angebot",angebotService.getAngebot(id));
        return "oneangebot";
    }

    @RequestMapping(value = { "/angebotmenu" }, method = RequestMethod.GET)
    public String angebotMenu(Model model){

        return "angebotmenu";
    }
}
