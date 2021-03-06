package ca.uqam.projet.controllers;

import java.util.*;
import java.time.*;

import ca.uqam.projet.repositories.*;
import ca.uqam.projet.tasks.*;
import ca.uqam.projet.resources.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FoodTruckController {

  @Autowired FoodTruckRepository repo;

  @RequestMapping("/trucks")
  public List<Truck> findAllT() {
  	return repo.findAll();
  }

  @RequestMapping("/horaires-camions")
  public List<Truck> findAllByDate(@RequestParam(value = "du") String dateDebut,
                                   @RequestParam(value = "au") String dateFin) {
      return repo.findAllByDate(dateDebut, dateFin);
  }

}
