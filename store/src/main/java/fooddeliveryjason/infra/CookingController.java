package fooddeliveryjason.infra;
import fooddeliveryjason.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/cookings")
@Transactional
public class CookingController {
    @Autowired
    CookingRepository cookingRepository;




    @RequestMapping(value = "cookings/",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public Cooking accept(HttpServletRequest request, HttpServletResponse response, 
        ) throws Exception {
            System.out.println("##### /cooking/accept  called #####");
            cooking.accept();
            cookingRepository.save(cooking);
            return cooking;
    }

    @RequestMapping(value = "cookings/{id}/start",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Cooking start(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /cooking/start  called #####");
            Optional<Cooking> optionalCooking = cookingRepository.findById(id);
            
            optionalCooking.orElseThrow(()-> new Exception("No Entity Found"));
            Cooking cooking = optionalCooking.get();
            cooking.start();
            
            cookingRepository.save(cooking);
            return cooking;
            
    }
    



    @RequestMapping(value = "cookings/{id}/finish",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Cooking finish(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /cooking/finish  called #####");
            Optional<Cooking> optionalCooking = cookingRepository.findById(id);
            
            optionalCooking.orElseThrow(()-> new Exception("No Entity Found"));
            Cooking cooking = optionalCooking.get();
            cooking.finish();
            
            cookingRepository.save(cooking);
            return cooking;
            
    }
    



    @RequestMapping(value = "cookings/{id}/reject",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Cooking reject(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /cooking/reject  called #####");
            Optional<Cooking> optionalCooking = cookingRepository.findById(id);
            
            optionalCooking.orElseThrow(()-> new Exception("No Entity Found"));
            Cooking cooking = optionalCooking.get();
            cooking.reject();
            
            cookingRepository.save(cooking);
            return cooking;
            
    }
    



}
