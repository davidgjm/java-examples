package com.sandbox.designpatterns.observer.example5_listener;

/**
 * Created with IntelliJ IDEA.
 * User: Jian-Min Gao
 * Date: 2015/8/21
 * Time: 11:26
 */
public class JobSeeker implements StepListener {

    private String name;

    public JobSeeker(String name){
        this.name = name;
    }
    @Override
    public void update(ObservableStep s) {
        System.out.println(this.name + " got notified!");
        //print job list
        System.out.println(s);
    }
}
