package pl.sda.chuckjokescollector.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;



    @Data
    @AllArgsConstructor
    public class Greeting {
        @NonNull
        String value;
    }

