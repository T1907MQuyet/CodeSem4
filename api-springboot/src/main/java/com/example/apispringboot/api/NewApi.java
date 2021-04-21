package com.example.javaspringbootapi.api;

import com.example.javaspringbootapi.dto.NewDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewApi {

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model)
    {
        return model;
    }
    @PutMapping(value = "/new")
    public NewDTO updateNew(@RequestBody NewDTO model)
    {
        return model;
    }
    @DeleteMapping (value = "/new")
    public void deleteNew(@RequestBody long[] ids)
    {

    }

}
