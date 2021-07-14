package com.example.labspringboot.converter;


public interface RestConverter<Entity, Response, Request> {
        Response Response(Response entity);
        Entity Request(Request dto);
}
