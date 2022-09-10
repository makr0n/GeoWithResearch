public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", Gender.female);
        Person vasya = new Person("Вася", Gender.male);
        Person masha = new Person("Маша", Gender.female);
        Person jane = new Person("Женя", Gender.female);
        Person ivan = new Person("Ваня", Gender.male);
        Person nik = new Person("Коля", Gender.male);

        GeoTree gt = new GeoTree();
        gt.relations(nik, irina);
        gt.relations(irina, vasya);
        gt.relations(irina, masha);
        gt.relations(irina, ivan);
        gt.relations(vasya, jane);
        gt.relations(vasya, ivan);


        new Research(gt).familyMembers(irina,
                Relationship.parent);
        new Research(gt).familyMembers(vasya,
                Relationship.parent);
        new Research(gt).familyMembers(irina,
                Relationship.children);
        new Research(gt).familyMembers(vasya,
                Relationship.children);

    }

}
