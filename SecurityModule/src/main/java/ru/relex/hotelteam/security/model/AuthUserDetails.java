package ru.relex.hotelteam.security.model;

import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.relex.hotelteam.shared.model.Authority;

public class AuthUserDetails implements UserDetails {

  private final String username;
  private final String password;
  private final Collection<? extends GrantedAuthority> auth;

  public AuthUserDetails(final String username, final String password, final Authority authority) {
    this.username = username;
    this.password = password;
    auth = List.of(new SimpleGrantedAuthority("ROLE_" + authority.name()));

  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return auth;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
