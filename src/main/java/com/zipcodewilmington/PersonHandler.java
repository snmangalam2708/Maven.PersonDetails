package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;
        while (i < personArray.length) {

            result += personArray[i].toString();
            i++;
        }
            return result;

    }

        public String forLoop () {
            String result = "";
            int i;
            for(i=0; i< personArray.length; i++)
            {
                result += personArray[i].toString();

            }
            return result;

    }

        public String forEachLoop () {
            String result = "";
            for (Person item : personArray)
            {
                result += item;
            }

            return result;
        }


    }