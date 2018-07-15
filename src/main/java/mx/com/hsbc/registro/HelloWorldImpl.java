
package mx.com.hsbc.registro;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.com.hsbc.registro.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String sayBye(String text) {
        return "Adiós " + text;
    }
}

