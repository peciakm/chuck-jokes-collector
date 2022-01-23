package pl.sda.chuck.polimorfizm;

import org.springframework.stereotype.Component;

@Component
public class D extends B {
    String status;

    public D() {
        this.status = "ACTIVE";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
