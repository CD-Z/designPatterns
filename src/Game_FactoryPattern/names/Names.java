package Game_FactoryPattern.names;

public class Names {
    private static final String[] names;

    static {
        names = new String[]{"Adam", "Alex", "Amanda", "Ben", "Brad", "Caitlin", "Chloe", "Chris", "Daniel", "David", "Emily", "Emma", "Ethan", "Hannah", "Jack", "Jacob", "James", "Jasmine", "Jessica", "John", "Jordan", "Julia", "Katie", "Kelvin", "Kevin", "Kimberly", "Liam", "Logan", "Madison", "Makayla", "Mark", "Mary", "Matthew", "Megan", "Michael", "Nathan", "Nicholas", "Olivia", "Patrick", "Paul", "Rachel", "Ryan", "Samantha", "Sara", "Sarah", "Scott", "Sophia", "Steven", "Taylor", "Thomas", "Tiffany", "Timothy", "Tyler", "Victoria", "William", "Wyatt", "Zachary", "Zoe", "Avery", "Aiden", "Cameron", "Eli", "Evelyn", "Grace", "Isaiah", "Jaden", "Jordyn", "Kaylee", "Kendall", "Landon", "Mackenzie", "Maggie", "Natalie", "Nathanial", "Parker", "Quinn", "Rebecca", "Riley", "Spencer", "Sydney", "Trevor", "Tristan", "Aaliyah", "Abigail", "Addison", "Adeline", "Adriana", "Aileen", "Ainsley", "Alessandra", "Alessia", "Alexandria", "Alexis", "Alice"};
    }

    public static int getLength() {
        return names.length;
    }
    public static String getName(int i){
        if (i < names.length && i >= 0){
            return names[i];
        }else {
            return i + " is out of Range";
        }

    }
}
