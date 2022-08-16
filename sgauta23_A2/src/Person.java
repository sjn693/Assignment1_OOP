public abstract class Person {
    private String name; private String email; private int age;
    public Person() { }
    public Person(String name, String email, int age) { this.name = name;
        setAge(age);
        setName(name);
        setEmail(email);
    }

    public String getName() { return name;
    }
    public void setName(String name) {
        if (integerCheck(name)){
            throw new IllegalArgumentException("---Invalid Name---");
        }else {
            this.name= name;
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (atCheck(email)){
            this.email = email;
        }else{
            throw new IllegalArgumentException("---Invalid Email Address---");
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("---Invalid Age---");
        }else{
            this.age = age;
        }
    }

    public boolean integerCheck (String name){
        boolean result = false;
        char [] args = name.toCharArray();
        for(char elements: args){
            if (Character.isDigit(elements))
                return true;
        }
        return result;
    }

    public boolean atCheck (String email){
        boolean result = false;
        char [] args = email.toCharArray();
        Character at ='@';
        for (int i = 0; i<args.length; i++){
            if(at.equals(args[i])){
                return true;
            }
        }return result;
    }
}
