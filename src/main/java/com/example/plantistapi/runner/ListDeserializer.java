package com.example.plantistapi.runner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDeserializer extends JsonDeserializer<List<String>> {
    @Override
    public List<String> deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        if (node.isTextual()) {
            String text = node.asText();
            if ("N/A".equals(text)) {
                return Collections.emptyList();
            } else {
                return Collections.singletonList(text);
            }
        } else if (node.isArray()) {
            List<String> list = new ArrayList<>();
            node.forEach(jsonNode -> list.add(jsonNode.asText()));
            return list;
        }
        return Collections.emptyList();
    }
}