package com.company;


public class Patterns {

    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        System.out.println(db.getName());

        DataBase db2 = DataBase.getInstance();
        System.out.println(db2.getName());

        UserFactory factory = new UserFactory();

        User u = factory.setUserAge(12)
                .setuserName("Vasya")
                .addHobby("Hockey")
                .setuserName("TEMA")
                .addHobby("FOOTBALL")
                .addHobby("SLEEP").build();
    }

    private static class DataBase {
        private static DataBase db;
        private String name;

        public DataBase(String name) {
            this.name = name;
        }

        //singleton
        public static DataBase getInstance() {
            if (db == null) {
                db = new DataBase("users");
            }
            return db;
        }

        public String getName() {
            return this.name;

        }
    }
}
