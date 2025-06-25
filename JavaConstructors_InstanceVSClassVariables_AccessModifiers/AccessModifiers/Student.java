package AccessModifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void showInfo() {
        System.out.println("Name (protected): " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Ravi";
        pg.setCGPA(8.5);

        System.out.println("Roll No (public): " + pg.rollNumber);
        pg.showInfo();
        System.out.println("CGPA (private via getter): " + pg.getCGPA());
    }
}
