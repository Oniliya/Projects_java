// Задание №2
// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
// приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

// Задание №3
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько
// экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

// Задание №4
// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
// должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
// Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.



package CatLibrary;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;

public class Cat {
   
    public int weight;
    public String name;
    public int color;
    // public java.util.Date age;
    public Date age;
    public boolean isMan;
    public long id;

    public Cat(int weight, String name, int color, java.util.Date date, boolean isMan, long id) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.age = date;
        this.isMan = isMan;
        this.id = id;
    }



    public boolean medSup()
    {
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        // TODO Auto-generated method stub
        return "Кличка: "+ name+" ID: "+id+" Вес: "+weight+ " Дата рождения: "+formatter.format(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && color == cat.color && isMan == cat.isMan ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, color, age, isMan, id);
    }  

}
