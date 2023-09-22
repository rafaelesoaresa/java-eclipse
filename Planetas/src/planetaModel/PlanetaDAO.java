package planetaModel;

import java.util.ArrayList;
import java.util.List;

import main.Planeta;

public class PlanetaDAO {
    private List<Planeta> planets = new ArrayList<>();

    public void addPlanet(Planeta planeta) {
        planeta.add(planeta);
    }

    public List<Planeta> getAllPlanets() {
        return planets;
    }
}



