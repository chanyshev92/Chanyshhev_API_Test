
package ru.reqresin.data.unknownpage;

public class Datum {

    private Integer id;
    private String name;
    private Integer year;
    private String color;
    private String pantoneValue;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
        super();
    }

    /**
     * 
     * @param pantoneValue
     * @param color
     * @param year
     * @param name
     * @param id
     */
    public Datum(Integer id, String name, Integer year, String color, String pantoneValue) {
        super();
        this.id = id;
        this.name = name;
        this.year = year;
        this.color = color;
        this.pantoneValue = pantoneValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPantoneValue() {
        return pantoneValue;
    }

    public void setPantoneValue(String pantoneValue) {
        this.pantoneValue = pantoneValue;
    }

}
