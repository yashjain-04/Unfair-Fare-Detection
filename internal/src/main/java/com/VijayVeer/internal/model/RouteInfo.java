package com.VijayVeer.internal.model;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class RouteInfo {
    String distance;
    String duration;

    public RouteInfo(String distance, String duration){
        this.distance = distance;
        this.duration = duration;
    }

    public String getDistance(){
        return distance;
    }

    public String getDuration(){
        return duration;
    }
}
