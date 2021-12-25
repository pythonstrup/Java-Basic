public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        String fullName;
        if (firstName.isEmpty() && lastName.isEmpty()){
            fullName = "";
        } else if(firstName.isEmpty()){
            fullName = lastName;
        } else if(lastName.isEmpty()){
            fullName = firstName;
        } else{
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }
}
