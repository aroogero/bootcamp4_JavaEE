package bitlab.bootcamp.chapter5.db;

public class Lesson1task7Footballer {
    private String name;
    private String surname;
    private String club;
    private int salary;
    private int transfer;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getTransfer() {
        return transfer;
    }
    public void setTransfer(int transfer) {
        this.transfer = transfer;
    }
    //Создаем конструкторы
    public Lesson1task7Footballer () {

    }
    public Lesson1task7Footballer (String name, String surname, String club, int salary, int transfer) {
        this.name = name;
        this.surname = surname;
        this.club = club;
        this.salary = salary;
        this.transfer = transfer;
    }
}
