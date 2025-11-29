public class Person {

        protected String name;
        protected String surname;
        protected Gender gender;

        public Person(String name, String surname, Gender gender) {
            this.name = name;
            this.surname = surname;
            this.gender = gender;

            PersonChecking.register(this);
        }



    @Override
        public String toString() {
            return name + " " + surname;
        }

        public String getFullName(){
            return name + " " + surname;
        }

}
