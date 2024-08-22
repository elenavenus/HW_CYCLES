package ru.netology.services;

public class FreelanceCalculateService {

    public int calculate(int income, int expenses, int threshold){
        int count = 0;
        int money = 0;
        for(int month = 0; month < 12; month++){ //цикл пройдет ровно 12 раз - на каждый месяц
            if(money >= threshold){//будем отдыхать в это месяце
                money = money - expenses;
                money = money / 3;
                count++;
            }else{//будем работать в этом месяце
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
