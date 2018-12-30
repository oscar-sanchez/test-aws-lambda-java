package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<RequestClass, ResponseClass> {
    public ResponseClass handleRequest(RequestClass request, Context context){
        LambdaLogger logger = context.getLogger();
        logger.log("received Request from : " + request.getFirstName());
        String greetingString = String.format("Muy buenas %s, %s.",
                request.getFirstName(), request.getLastName());
        return new ResponseClass(greetingString);
    }
}