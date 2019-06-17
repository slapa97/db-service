package com.piotrek.stock.dbservice.resource;

import com.piotrek.stock.dbservice.model.Quote;
import com.piotrek.stock.dbservice.model.Quotes;
import com.piotrek.stock.dbservice.repository.QuotesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {
    private QuotesRepository quotesRepository;

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username") final String username) {

        quotesRepository.findByUserName(username);

        return null;
    }

}
