class User{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public User(String firstName, String lastName, int age, double salary){
        if( age >= 0 && age <= 100){
            this.age = age;
        }else{
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if( age >= 0 && age <= 100){
            this.age = age;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public boolean isValidAge(){
        if(age >= 18 && age <= 60){
            return true;
        }
        return false;
    }

    public String getFullName(){
        String fullName = firstName + lastName;
        return fullName;
    }
}