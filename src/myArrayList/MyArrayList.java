package myArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    int size = 0;
    Object[] mass = new Object[100];

    public void add(T element){   //add
        if(mass.length<=size){
            resize();

        }
        mass[size] = element;
        size++;
    }

    public T get(int index){     //get

    return (T) mass[index];
    }

    public void remove(int index){ //remove
        resize(index);
        size--;
    }

    public void resize(){
             int count = mass.length;
             Object[] newMass = new Object[count * 2];
             System.arraycopy(mass, 0, newMass, 0, mass.length);
             mass = newMass;
    }

    public void resize(int index){
        int count = mass.length;
        Object[] newMass = new Object[count-1];
        for(int i = 0,j = 0; i<mass.length;i++,j++){
            if(!(i==index)){
                newMass[j]= mass[i];

            } else {
                j--;
            }
        }
        mass = new Object[newMass.length];
        mass = newMass;
        System.out.println(mass.length);

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}
