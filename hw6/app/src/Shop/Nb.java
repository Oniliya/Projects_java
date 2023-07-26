// Задание
// Базовое задание:
// Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Переопределить toString, equals и hashCode(как на семинаре).
// Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.

// Задание со звездочкой:
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Shop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Nb {
    public class NoteBooks {
        protected long id;              // номер в базе данных
        protected String model;         // модель ноутбука
        protected String brand;         // фирма производитель
        protected long serialNumber;     // серийный номер
        protected int dateOfManufacture;   // год производства
        protected int ramSize;          // объем памяти
        protected int hddSize;          // объем жесткого диска
        protected int frequency;        // частота процессора
        protected String coresBrand;    // бренд процессора
        protected String color;         // цвет
        protected String diagon;        // размер экрана
        protected String os;            // операционная система

        public NoteBooks(long id, String model, String brand, long serialNumber, int dateOfManufacture, int ramSize,
                int hddSize, int frequency, String coresBrand, String color, String diagon) {
            this.id = id;
            this.model = model;
            this.brand = brand;
            this.serialNumber = serialNumber;
            this.dateOfManufacture = dateOfManufacture;
            this.ramSize = ramSize;
            this.hddSize = hddSize;
            this.frequency = frequency;
            this.coresBrand = coresBrand;
            this.color = color;
            this.diagon = diagon;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            // return super.toString();
            return "Фирма: "+ brand +" модель: "+ model + "цвет "+color+ "размер экрана "+diagon+""+" ОС: "+os+" дата производства: " + Integer.toString(dateOfManufacture);
        }

        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            // return super.equals(obj);
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            NoteBooks notebook = (NoteBooks) obj;
            return brand == notebook.brand && model == notebook.model && color==notebook.color && diagon == notebook.diagon && os == notebook.os && dateOfManufacture == notebook.dateOfManufacture;
        }

        @Override
        public int hashCode() {
            // TODO Auto-generated method stub
            // return super.hashCode();
            return Objects.hash(brand, model, color, diagon, os, dateOfManufacture);
        }

        




    }
    
}
    

