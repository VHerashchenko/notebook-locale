package com.fict.vh.repository;

import com.fict.vh.model.NoteModel;
import com.fict.vh.model.exception.LoginException;

import java.util.List;

public interface NoteModelRepository {

    void insertNoteModel(NoteModel noteModel) throws LoginException;

    List<NoteModel> selectAllNoteModel();
}