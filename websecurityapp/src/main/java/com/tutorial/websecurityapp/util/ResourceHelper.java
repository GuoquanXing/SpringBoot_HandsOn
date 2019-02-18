package com.tutorial.websecurityapp.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceHelper {

    public static String getKeyByFileName(String filename){
        Resource resource = new ClassPathResource(filename);
        String key = null;
        try {
            key = resource.getInputStream().toString();
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
        return key;
    }

}
