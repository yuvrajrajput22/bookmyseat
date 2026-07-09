package com.bookmyseat.bookmyseat.service;

import com.bookmyseat.bookmyseat.entity.Show;
import com.bookmyseat.bookmyseat.repository.ShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    private ShowRepository showRepository;

    public ShowService(ShowRepository showRepository){
        this.showRepository = showRepository;}


        public List<Show> getAllShows()
        {
            return showRepository.findAll();

        }

        public Show addShow(Show show){
        return showRepository.save(show);
        }
}
