package ru.vsu.sberpractice;

import java.lang.reflect.Field;

public class Converter {

    public static Animal convert(Pet pet) {
        Animal animal = new Animal();

        try {
            Field[] petFields = Pet.class.getDeclaredFields();

            for (Field petField : petFields) {
                petField.setAccessible(true);

                Field animalField = Animal.class.getDeclaredField(petField.getName());
                animalField.setAccessible(true);

                animalField.set(animal, petField.get(pet));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return animal;
    }
}