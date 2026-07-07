package borodino;

import java.io.*;

public class HeroSaveLoad {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Hero hero = new Hero("Warrior", 1, new Weapon("Stick", 5));

        // меняем значения по умолчанию
        hero.name = "Aragorn";
        hero.lvl = 25;
        hero.weapon.name = "Sword";
        hero.weapon.damage = 50;

        // сохраняем объект в файл
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hero.dat"));
        out.writeObject(hero);
        out.close();

        // загружаем объект из файла
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("hero.dat"));
        Hero loadedHero = (Hero) in.readObject();
        in.close();

        // выводим поля загруженного объекта
        System.out.println("Имя: " + loadedHero.name);
        System.out.println("Уровень: " + loadedHero.lvl);
        System.out.println("Оружие: " + loadedHero.weapon.name);
        System.out.println("Урон оружия: " + loadedHero.weapon.damage);
    }
}
