package co.ptm.embabel_spring.service;

import com.embabel.agent.api.common.Ai;
import com.embabel.common.ai.model.LlmOptions;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DadJokeService {
    private final Ai ai;

    public String tellOneLinerDadJoke() {
        return ai.withLlm(LlmOptions.withDefaultLlm())
                .generateText("Tell me a clean, punny one-liner dad joke. Return only the joke.");
    }

}
