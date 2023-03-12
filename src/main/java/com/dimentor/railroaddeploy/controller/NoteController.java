package com.dimentor.railroaddeploy.controller;

import com.dimentor.railroaddeploy.model.Note;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @GetMapping(value = "/all", produces = "application/json")
    public List<Note> getAll() {
        return List.of(
                new Note("Note 1"),
                new Note("Note 2"),
                new Note("Note 3"));
    }

}
