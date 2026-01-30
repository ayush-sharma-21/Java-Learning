package org.example.learning.designPatterns;

public class SingletonDesignPattern {

    public SingletonDesignPattern() {
    }

    private static volatile SingletonDesignPattern instanceOfSingleToneClass;

    public static SingletonDesignPattern getLazyInstance() {
        if (instanceOfSingleToneClass == null)
            instanceOfSingleToneClass = new SingletonDesignPattern();
        return instanceOfSingleToneClass;
    }

    private static SingletonDesignPattern getThreadSafeInstance() {
        if (instanceOfSingleToneClass == null) {
            synchronized (getThreadSafeInstance()) {
                if (instanceOfSingleToneClass == null) {
                    instanceOfSingleToneClass = new SingletonDesignPattern();
                }
            }
        }
        return instanceOfSingleToneClass;
    }

    public static void main(String[] args) {
        SingletonDesignPattern lazyInstance = SingletonDesignPattern.getLazyInstance();
        SingletonDesignPattern threadSafeInstance = SingletonDesignPattern.getThreadSafeInstance();
    }
}
