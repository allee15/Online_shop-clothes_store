package model;

public class Category {

    public Integer idCateg;


    public String name;


    public String description;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getIdCateg() {
        return idCateg;
    }

    public void setIdCateg(Integer idCateg) {
        this.idCateg = idCateg;
    }

    public Category(Integer idCateg, String name, String description){
        this.idCateg=idCateg;
        this.name=name;
        this.description=description;
    }
}

