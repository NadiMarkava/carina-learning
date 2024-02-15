package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;
import org.apache.http.HttpHeaders;

@Endpoint(url = "${base_url}/auth/me", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetTokenInBearerMethod extends AbstractApiMethodV2 {

    public GetTokenInBearerMethod(String token) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_products"));
        setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }

}

