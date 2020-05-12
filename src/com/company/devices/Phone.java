package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {
    private Double screenSize;

    public Phone(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is working");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("not enough money, sorry");
        }
        if (seller.phone != this) {
            throw new Exception("you cannot sell something that is not yours");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = this;
        seller.phone = null;
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    //instalować app podając nazwę
    //instalować app podając nazwę i wersję
    //instalować app podając link
    //instalować app podając listę nazw

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(String name) throws MalformedURLException {
        installAnApp(name, "latest");
    }

    public void installAnApp(String name, String version) throws MalformedURLException {
        URL url = new URL("https", "ourappserver.com", 443, name + "-" + version);
        installAnApp(url);
    }

    public void installAnApp(URL url) {
        //autoryzacja do serwera
        //sprawdzenie czy nie jest płatna
        //ew płatność
        //obsługa braku pieniędzy
        //pobranie plików
        //walidacja plików
        //unzip plików
        //instalacja
        //komunikacja z użytkownikem
        System.out.println("you installed a new app " + url.getFile());
    }


}
