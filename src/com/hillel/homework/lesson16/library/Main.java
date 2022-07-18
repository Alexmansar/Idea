package com.hillel.homework.lesson16.library;

import com.hillel.homework.lesson16.library.controller.MainController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.startApp();
    }
}