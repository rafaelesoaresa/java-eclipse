package planetaController;

import java.util.List;

import main.Planeta;

public class PlanetaController {
	    private static  String planeta1 = null;
		public PlanetaController() {
	    }

	    public void addPlanet(String name) {
	        Planeta planeta = new Planeta(name);
	        planeta.addPlaneta(planeta1);
	    }

	    public List<Planeta> getAllPlanets() {
	        return planeta1.getAllPlaneta();
	    }

		public List<Planeta> getAllPlanetas() {
			return null;
		}

		
	}


