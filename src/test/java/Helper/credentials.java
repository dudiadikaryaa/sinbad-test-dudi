package Helper;

import io.github.cdimascio.dotenv.Dotenv;

public interface credentials {

    Dotenv dotenv = Dotenv.load();

    String user_email = dotenv.get("USER_EMAIL");
    String user_password = dotenv.get("USER_PASSWORD");
}
