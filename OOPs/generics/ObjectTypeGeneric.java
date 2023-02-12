package generics;

import java.util.ArrayList;

public class ObjectTypeGeneric<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public ObjectTypeGeneric(){
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for(int i=0;i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed =(T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public static void main(String[] args) {
        ObjectTypeGeneric<Integer> list = new ObjectTypeGeneric();
    }

}
