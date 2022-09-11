package InnerClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class State {
    private String name;
    private Double population;

    public static void main(String[] args) {
        State st1= new State("Iowa",2000.0);
        State st2 = new State("Texas",300000.0);
        State st3 = new State("New York",530000.0);
        State st4= new State("Georgia",23000.0);
        ArrayList<State> list= new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
      Collections.sort(list,st1.populationCompare);
        System.out.println(list);
        Collections.sort(list,st2.nameComparator);

        System.out.println(list);

    }

    public State(String name, Double population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
    Comparator<State> populationCompare= new Comparator<State>() {
        @Override
        public int compare(State o1, State o2) {
           if(o1.getPopulation()==o2.getPopulation())
               return 0;
           else if(o1.getPopulation()>o2.getPopulation())
               return 1;
           else return -1;

        }
    };
    Comparator<State> nameComparator= new Comparator<State>() {
        @Override
        public int compare(State o1, State o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };


}
