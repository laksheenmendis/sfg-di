package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by laksheenmendis on 5/26/20 at 12:14 AM
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    // @Value annotations will be evaluated as expressions
    // goes to the spring context and gets the external properties

    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource()
    {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    // PropertySourcesPlaceholderConfigurer Bean will match the values and read the file mentioned
    // in @PropertySource
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties()
    {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return placeholderConfigurer;
    }
}
