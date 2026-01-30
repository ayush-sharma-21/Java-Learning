package org.example.learning.designPatterns;

public class BuilderDesignPattern {

    static class User {
        private final String name;
        private final int age;
        private final String email;
        private final boolean isMarried;

        // Private constructor so only Builder can create object
        private User(UserBuilder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.email = builder.email;
            this.isMarried = builder.isMarried;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    ", isMarried=" + isMarried +
                    '}';
        }

        public static class UserBuilder {
            private String name;
            private int age;
            private String email;
            private boolean isMarried;

            public UserBuilder name(String name) {
                this.name = name;
                return this;
            }

            public UserBuilder age(int age) {
                this.age = age;
                return this;
            }

            public UserBuilder email(String email) {
                this.email = email;
                return this;
            }

            public UserBuilder married(boolean married) {
                this.isMarried = married;
                return this;
            }

            public User build() {
                return new User(this);
            }

            @Override
            public String toString() {
                return "UserBuilder{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", email='" + email + '\'' +
                        ", isMarried=" + isMarried +
                        '}';
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new User.UserBuilder()
                .age(10)
                .email("ayush@gmail.com")
                .build());
    }
}
