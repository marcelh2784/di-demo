package nl.marbink.didemo.configuration;

import nl.marbink.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfiguration {

    //TODO: env value can be overriden with -D variable marbink.user
    //TODO: value can be overriden with env variable MARBINK_USER
    @Value("${marbink.user}")
    String user;

    @Value("${marbink.password}")
    String password;

    @Value("${marbink.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

}
