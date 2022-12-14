package com.config;

import com.service.user.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import static org.hibernate.cfg.AvailableSettings.USER;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailService userDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService)
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/", true).permitAll()
                .and().authorizeRequests().antMatchers("/customer").hasRole("USER")
                .and().authorizeRequests().antMatchers("/contract").hasRole("ADMIN")
//                .and().authorizeRequests().antMatchers("/customer/create","/customer/edit/{id}","/customer/delete").hasRole("ADMIN")
                .and().authorizeRequests().antMatchers("/customer","/facility").hasAnyRole("USER","ADMIN")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
//        // C??c trang kh??ng y??u c???u login
//        http.authorizeRequests().antMatchers( "/","/login", "/logout").permitAll();
//
//        // Trang /userInfo y??u c???u ph???i login v???i vai tr?? ROLE_USER ho???c ROLE_ADMIN.
//        // N???u ch??a login, n?? s??? redirect t???i trang /login.
//        http.authorizeRequests().antMatchers("/userInfo").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
//
//        // Trang ch??? d??nh cho ADMIN
//        http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_ADMIN')");
//
//        // Khi ng?????i d??ng ???? login, v???i vai tr?? XX.
//        // Nh??ng truy c???p v??o trang y??u c???u vai tr?? YY,
//        // Ngo???i l??? AccessDeniedException s??? n??m ra.
//        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
//
//        // C???u h??nh cho Login Form.
//        http.authorizeRequests().and().formLogin()//
//                // Submit URL c???a trang login
//                .loginProcessingUrl("/j_spring_security_check") // Submit URL
//                .loginPage("/login")//
//                .defaultSuccessUrl("/userAccountInfo")//
//                .failureUrl("/login?error=true")//
//                .usernameParameter("username")//
//                .passwordParameter("password")
//                // C???u h??nh cho Logout Page.
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");

        // C???u h??nh Remember Me.
        http.authorizeRequests().and() //
                .rememberMe().tokenRepository(this.persistentTokenRepository()) //
                .tokenValiditySeconds(10); // 1 * 24 * 60 * 60 : 24h

    }

    private PersistentTokenRepository persistentTokenRepository() {
        InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl();
        return memory;
    }
}

