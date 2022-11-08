public class People {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    People(String name, int yearOfBirth, String town, String jobTitle) {
        if (name.length() <= 0 || name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town.length() <= 0 || town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle.length() <= 0 || jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + this.name +
                ". Я из города " + this.town +
                ". Я родился в " + this.yearOfBirth +
                " году. Я работаю на должности " + this.jobTitle + ". Будем знакомы!";
    }
}
