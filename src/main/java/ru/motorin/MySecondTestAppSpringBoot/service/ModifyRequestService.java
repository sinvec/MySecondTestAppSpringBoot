package ru.motorin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.motorin.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);

}
