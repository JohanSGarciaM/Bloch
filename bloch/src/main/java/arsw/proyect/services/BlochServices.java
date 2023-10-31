package arsw.proyect.services;

import java.util.concurrent.ConcurrentHashMap;

import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arsw.proyect.model.Position;
import arsw.proyect.persistence.BlochPersistence;

@Service
public class BlochServices {

	@Autowired
	BlochPersistence bp;

	public ConcurrentHashMap<Pair<Integer, Integer>,Position> getBoard(){
		return bp.getBoard();
	}
	
}
