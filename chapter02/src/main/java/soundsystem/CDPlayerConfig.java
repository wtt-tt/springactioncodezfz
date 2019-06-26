package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class,DVDPlayer.class})
public class CDPlayerConfig {
}
