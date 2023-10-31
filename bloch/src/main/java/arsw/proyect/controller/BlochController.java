package arsw.proyect.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import arsw.proyect.services.BlochServices;

@RestController
@RequestMapping(value = "/board")
public class BlochController {
    @Autowired
    BlochServices blochServices;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getBoard(){
        try{
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(blochServices.getBoard(), HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(BlochController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/players")
    public ResponseEntity<?> getPlayer(){
        try{
            return new ResponseEntity<>(blochServices.getPlayers(), HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(BlochController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/players/{name}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateNamePlayer(@PathVariable String name){
        try{
            // Registrar dato
            blochServices.setPlayerName(name);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch(Exception ex){
            Logger.getLogger(BlochController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ", HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(path = "/players/{playerName}/{movement}", method = RequestMapping.PUT)
    public ResponseEntity<?> updateMovement(@PathVariable String playerName, @PathVariable String movement){
        try{
            //Registrar dato
            blochServices.movement(playerName, movement);
            return new ResponseEntity<>(HttpStatus.CREATED);
            catch(Exception ex){
                Logger.getLogger(BlochController.class.getName()).log(Level.SEVERE,null,ex);
                return new ResponseEntity<>("Error ", HttpStatus.FORBIDDEN);
            }
        }
    }
}
