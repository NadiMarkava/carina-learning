package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/auth/login", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/products/_get_login/rq.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostLoginUserMethod extends AbstractApiMethodV2 {

    public PostLoginUserMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_products"));
    }
}
