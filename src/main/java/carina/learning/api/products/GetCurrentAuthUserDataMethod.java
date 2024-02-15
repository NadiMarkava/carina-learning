package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;
import org.apache.http.HttpHeaders;

@Endpoint(url = "${base_url}/auth/me", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_auth_user_data/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetCurrentAuthUserDataMethod extends AbstractDummyJsonMethod {

    public GetCurrentAuthUserDataMethod(String token) {
        super();
        setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }

}

