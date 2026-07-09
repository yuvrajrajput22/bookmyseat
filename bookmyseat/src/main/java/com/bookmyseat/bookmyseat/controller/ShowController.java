package com.bookmyseat.bookmyseat.controller;

import com.bookmyseat.bookmyseat.entity.Show;
import com.bookmyseat.bookmyseat.service.ShowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmyseat/shows")
public class ShowController {

    private ShowService showService;
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @PostMapping
    public List<Show> getAllShows()
    {
        return showService.getAllShows();
    }

    @PostMapping("/add")
    public Show addShow(@RequestBody Show show)
    {
    return showService.addShow(show);
    }
}
