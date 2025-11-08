package com.genai.ollama.SpringAI.CarPucho.Service;

import org.springframework.stereotype.Service;

@Service
public interface CarQueryService {

    String chat(String query);
}
