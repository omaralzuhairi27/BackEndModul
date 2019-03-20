package at.nacs.dutchman;

import at.nacs.dutchman.domain.DeadMansChest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadmanschest")
@RequiredArgsConstructor
public class DeadMansChestEndpoint {

    private final DeadMansChest deadMansChest;


    @GetMapping
    DeadMansChest getChest() {
        return deadMansChest;
    }
}
