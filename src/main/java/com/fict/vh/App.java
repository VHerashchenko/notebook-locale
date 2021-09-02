package com.fict.vh;

import com.fict.vh.controller.AppController;
import com.fict.vh.model.NoteModel;
import com.fict.vh.view.View;

public class App {
    public static void main( String[] args ) {
        NoteModel noteModel = new NoteModel();
        View view = new View();
        AppController appController = new AppController(view, noteModel);
        appController.processUser();
    }
}
