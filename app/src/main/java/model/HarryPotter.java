package model;

public class HarryPotter {



    private String name;
    private String species;
    private  String gender;
    private String house;
    private String DateOfBird;
    private String yearsOfBird;
    private String wood;
    private  String core;

    public HarryPotter(String name, String species, String gender, String house, String dateOfBird, String yearsOfBird, String wood, String core) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.house = house;
        DateOfBird = dateOfBird;
        this.yearsOfBird = yearsOfBird;
        this.wood = wood;
        this.core = core;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getDateOfBird() {
        return DateOfBird;
    }

    public void setDateOfBird(String dateOfBird) {
        DateOfBird = dateOfBird;
    }

    public String getYearsOfBird() {
        return yearsOfBird;
    }

    public void setYearsOfBird(String yearsOfBird) {
        this.yearsOfBird = yearsOfBird;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }
}
