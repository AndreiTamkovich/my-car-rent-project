package by.mycourseproject.back.context;

import org.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class ContextCreator {

    public String getUserFromAuth() {
        String username = "";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            JSONObject auth = new JSONObject(authentication.getPrincipal());
            username =auth.getString("username");
        }
        return username;
    }
}
