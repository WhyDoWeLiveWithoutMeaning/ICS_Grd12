package Unit3.Planets.PlanetObjects;

import Unit3.Planets.Planet;
import Unit3.Planets.Satellite;

public class Moon extends Planet implements Satellite{

    private double orbitRadius;
    private Planet orbitingPlanet;

    public Moon(String name, double mass, double radius, double orbitRadius, Planet oPlanet) {
        super(name, mass, radius);
        this.orbitRadius = orbitRadius;
        this.orbitingPlanet = oPlanet;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    public void setOrbitRadius(double orbitRadius) {
        this.orbitRadius = orbitRadius;
    }

    public Planet getOrbitingPlanet() {
        return orbitingPlanet;
    }

    public void setOrbitingPlanet(Planet orbitingPlanet) {
        this.orbitingPlanet = orbitingPlanet;
    }
}
