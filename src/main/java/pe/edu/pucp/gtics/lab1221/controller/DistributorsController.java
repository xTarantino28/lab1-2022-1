package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;
import pe.edu.pucp.gtics.lab1221.repository.DistributorsRepository;

import java.util.List;


@Controller
public class DistributorsController {


    final DistributorsRepository distributorsRepository;

    public DistributorsController (DistributorsRepository distributorsRepository) {
        this.distributorsRepository = distributorsRepository;
    }



    @GetMapping(value = "/distribuidora/lista")
    public String listaDistribuidoras(Model model){
        List<Distributors> listaDistribuidoras =  distributorsRepository.findAll();
        model.addAttribute("listaDistribuidoras",listaDistribuidoras);
        return "distribuidoras/lista";
    }

    public String editarDistribuidoras(){
        return "";
    };

    public String nuevaDistribuidora(){
        return "";
    };

    public String guardarDistribuidora(){
        return "";
    };

    public String borrarDistribuidora(){
        return "";
    };

}
