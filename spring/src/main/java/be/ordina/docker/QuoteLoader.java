package be.ordina.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class QuoteLoader {

    private QuoteRepository repository;

    @Autowired
    public QuoteLoader(QuoteRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void insertQuotes(){
        createQuote(1L, "Listen Morty, I hate to break it to you, but what people calls \"love\" is just a chemical reaction that compels animals to breed. It hits hard, Morty, then it slowly fades, leaving you stranded in a failing marriage.");
        createQuote(2L, "Nobody exists on purpose. Nobody belongs anywhere. We're all going to die. Come watch TV.");
        createQuote(3L, "Weddings are basically funerals with cake.");
        createQuote(4L, "Wow, I really Cronenberged up the whole place, huh Morty? Just a bunch a Cronenbergs walkin' around.");
        createQuote(5L, "HI! I'M MR MEESEEKS! LOOK AT ME!");
        createQuote(6L, "They're robots Morty! It's okay to shoot them! They're just robots!");
        createQuote(7L, "You're not gonna believe this, because it usually never happens, but I made a mistake!");
        createQuote(8L, "Sometimes science is a lot more art, than science. A lot of people don't get that.");
    }

    private void createQuote(final Long id, String value){
        final Quote quote = new Quote();
        quote.setId(id);
        quote.setQuote(value);
        this.repository.insert(quote);
    }
}
