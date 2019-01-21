package net.simplifiedcoding.dbexample;

public class Student {

    private int id;
    private String name;
    private String sClass;
    private String session;

    public Student(int id, String name, String sClass, String session) {
        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.session = session;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getsClass() {
        return sClass;
    }

    public String getSession() {
        return session;
    }
}
