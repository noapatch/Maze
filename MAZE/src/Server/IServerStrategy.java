package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface IServerStrategy {
    void serverstrategy(InputStream inputStream, OutputStream outputStream) throws IOException;
}
