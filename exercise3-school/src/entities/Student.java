package entities;

public class Student {

    private String name;
    private String cpf;
    private String gender;


    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
