package model;

public class HarryPotter {



    private String name;
    private String species;
    private  String gender;
    private String house;
    private String dateOfBirth;
    private int yearOfBirth;
    private String wood;
    private  String core;
    private String image;
    public HarryPotter(String name, String species, String gender, String house, String dateOfBirth, int yearOfBirth, String wood, String core, String image) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.house = house;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.wood = wood;
        this.core = core;
        this.image = image;
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
        return dateOfBirth;
    }

    public void setDateOfBird(String dateOfBird) {
        dateOfBirth = dateOfBird;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
