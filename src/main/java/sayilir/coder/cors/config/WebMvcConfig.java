package sayilir.coder.cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

/*SecurityConfig de CorsConfigurationSource corsConfigurationSource() methodunu yazdigimizdan  altakine gerek kalmadi

@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/coffee")
                .allowedOrigins("http://localhost:5137")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS");
                //.allowCredentials(true);
    }*/
}
