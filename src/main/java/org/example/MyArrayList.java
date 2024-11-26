package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyArrayList<T> {
    ArrayList<T> thisArrayList;

    public void removeElementByIndex(T element, int index) {
        thisArrayList.add(index, element);
    }
    public void addElementByIndex(T element, int index){

    }

    public void addElement(T element) {
        thisArrayList.add(element);
    }

    public T getElement(int index) {
        return thisArrayList.get(index);
    }

    public void deleteElement(int index) {
        thisArrayList.remove(index);
    }

    public void clearList() {
        thisArrayList.clear();
    }

    public void sortCollectionsWithComparator(ArrayList thisArrayList, Comparator<T> comparator){


        System.out.println(thisArrayList);

    }

    public void sortComparableCollections(ArrayList thisArrayList, Comparator<T> comparator){

        for (int s = thisArrayList.size() / 2; s > 0; s /= 2) {
            for (int i = s; i < thisArrayList.size(); i++) {
                for (int j = i - s; j >= 0 && comparator.compare((T) thisArrayList.get(j), (T) thisArrayList.get(j + s)) > 0; j -= s) {
                    Collections.swap(thisArrayList, j, j + s);
                }
            }
        }
        System.out.println(thisArrayList);

    }
}

/*
Реализовать свой ArrayList (не потокобезопасный) Методы -
добавить элемент,
добавить элемент по индексу(не заменить),
получить элемент,
удалить элемент,
очистить всю коллекцию,
отсортировать,
заменить элемент по индексу,
остальное по желанию.
 */
