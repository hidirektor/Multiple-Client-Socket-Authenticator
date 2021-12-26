package me.t3sl4.socketauthenticator;

import me.t3sl4.socketauthenticator.server.Server;

import java.io.IOException;

public class Runner {

    //Programı jar olarak dışarı exportladığımızda çalışması için bir yönlendirici main method tanımlıyorum.
    public static void main(String[] args) throws IOException {
        //Programın ana sınıfını çağırıyorum.
        SocketAuthenticator.main(args);
        //Sunucuyu başlatıyorum.
        Server.main(args);
    }
}
