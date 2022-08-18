package pl.js.modbus;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

// @EnableAutoConfiguration
@SpringBootApplication
public class ModbusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModbusApplication.class, args);
	}

	// CORS CONFIG
	@Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*", "https://modbuspanel.herokuapp.com"));
        configuration.setAllowedMethods(
            Arrays.asList("GET","POST","HEAD","DELETE","PUT","OPTIONS"));
        configuration.setMaxAge(1l);
        configuration.setAllowCredentials(true);
        configuration.setAllowedHeaders(Arrays.asList("*", "https://modbuspanel.herokuapp.com"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
	}
}



