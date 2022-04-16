package com.kodluyoruz.springegitim.altincihafta.cmt.springsec.ConfigSecurity;

//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableWebSecurity
public class SecuritySpring2{
//        extends WebSecurityConfigurerAdapter {


    /**
     * inmemory auth kavramı,
     * uygulamanın bellek içerisinde kimlik doğrulamasını yapabildiğimiz bir yol.
     * Uygulama kill olduğu zaman sorun çıkabilir. Bellek temizlenecektir çünkü ve doprulama yapılamaz.
     *
     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.httpBasic();
//
//        http.authorizeRequests()
//                .antMatchers("/dashboard")
//                .hasAnyRole("admin", "user")
//                .antMatchers("/addUser")
//                .hasAnyRole("admin")
//                .and()
//                .authorizeHttpRequests()
//                .antMatchers("/home")
//                .permitAll();
//
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("{noop}1234")
//                .roles("admin")
//                .and()
//                .withUser("Ali")
//                .password("{noop}1234")
//                .roles("user");
//
//
//
//    }
}
