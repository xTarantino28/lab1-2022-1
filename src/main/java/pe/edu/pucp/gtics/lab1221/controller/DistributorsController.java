package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;
import pe.edu.pucp.gtics.lab1221.repository.DistributorsRepository;

import java.util.List;
import java.util.Optional;


@Controller
public class DistributorsController {



    /*Para usar el repository con JPA en el controller*/
    final DistributorsRepository distributorsRepository;
    public DistributorsController (DistributorsRepository distributorsRepository) {
        this.distributorsRepository = distributorsRepository;
    }



    @GetMapping(value = "/distribuidoras/lista")
    public String listaDistribuidoras(Model model){
        List<Distributors> listaDistribuidoras =  distributorsRepository.findAll();
        model.addAttribute("listaDistribuidoras",listaDistribuidoras);
        return "distribuidoras/lista";
    }

    @GetMapping(value = "/distribuidoras/editar")
    public String editarDistribuidoras(@RequestParam("id") int id, Model model){

        Optional<Distributors> optionalDistributors = distributorsRepository.findById(id);
        if (optionalDistributors.isPresent()) {
            Distributors distributors = optionalDistributors.get();
            model.addAttribute("distribuidora",distributors);
            return "/distribuidoras/editar";
        } else {
            return "redirect:/distribuidoras/lista";
        }



    };


    @GetMapping(value = "/distribuidoras/nuevo")
    public String nuevaDistribuidora(){
        return "distribuidoras/nuevo";
    }




    @PostMapping(value = "/distribuidoras/guardar")
    public String guardarDistribuidora(Distributors distributors){
        distributorsRepository.save(distributors);
        return "redirect:/distribuidoras/lista";
    };

    public String borrarDistribuidora(){
        return "";
    };

}
