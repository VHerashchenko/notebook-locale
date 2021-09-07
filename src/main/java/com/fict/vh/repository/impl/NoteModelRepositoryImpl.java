package com.fict.vh.repository.impl;

import com.fict.vh.model.NoteModel;
import com.fict.vh.model.exception.LoginException;
import com.fict.vh.repository.NoteModelRepository;

import java.util.ArrayList;
import java.util.List;

public class NoteModelRepositoryImpl implements NoteModelRepository {

    private static final List<NoteModel> DB = new ArrayList<>();

    @Override
    public void insertNoteModel(NoteModel noteModel) throws LoginException {
        if(checkLogin(noteModel)) {
            DB.add(new NoteModel(noteModel));
        }
    }

    @Override
    public List<NoteModel> selectAllNoteModel() {
        return DB;
    }

    private boolean checkLogin(NoteModel noteModel) throws LoginException{
        for(NoteModel current : DB){
            String currentLogin = noteModel.getLogin();
            if(current.getLogin().equals(currentLogin)){
                throw new LoginException(currentLogin);
            }
        }
        return true;
    }
}