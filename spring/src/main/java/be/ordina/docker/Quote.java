package be.ordina.docker;

import org.springframework.data.annotation.Id;

public class Quote {

    @Id
    private Long id;

    private String quote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
