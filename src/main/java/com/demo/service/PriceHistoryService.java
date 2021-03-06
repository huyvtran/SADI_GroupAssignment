package com.demo.service;

import com.demo.model.PriceHistory;
import com.demo.repository.PriceHistoryStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PriceHistoryService {
    @Autowired
    public PriceHistoryStore store;

    public void add(PriceHistory history) {
        store.save(history);

    }
}
