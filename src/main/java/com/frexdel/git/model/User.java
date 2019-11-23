package com.frexdel.git.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Observable;

public class User {
    private static String[] quotes = {"AAPL", "GOOG", "INTC", "BABA", "TSLA", "AIR.PA"};

    public Observable<St
    ock> getStock() {

        return Observable.create(subscriber -> {
            if (!subscriber.isUnsubscribed()) {
                Arrays.stream(quotes)
                        .map(quote -> getStock(quote, subscriber))
                        .filter(Objects::nonNull)
                        .forEach(stock -> {
                            subscriber.onNext(stock);
                            sleep(3000);
                            subscriber.onError(new RuntimeException("exception"));
                        });

            }
            subscriber.onCompleted();
        });
    }
}
