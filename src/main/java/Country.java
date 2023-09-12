public class Country {
    private String continent;
    private String capital;
    private int population;

    public Country(String continent, String capital, int population) {
        this.continent = continent;
        this.capital = capital;
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
