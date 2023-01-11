package Sockets.contract;

import Sockets.pojos.HttpRequest;
import Sockets.pojos.HttpResponse;

public interface RequestRunner {
    HttpResponse run(HttpRequest request);
}
