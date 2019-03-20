package at.nacs.ex6properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaysOfWeek {
    @Getter
    @Value("${week.days}")
    private List<String> days;
}
