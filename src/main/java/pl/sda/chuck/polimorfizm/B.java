package pl.sda.chuck.polimorfizm;

import org.springframework.stereotype.Component;

@Component
public class B implements C{

    String status;
    public B() {
        this.status = "ACTIVE";
    }
    @Override
    public String getStatus() {
        return status;
    }
}
