package carina.learning.api.products;

import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${base_url}/auth/login", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/products/_get_login/rq.json")
@ResponseTemplatePath(path = "api/products/_get_login/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostLoginUserMethod extends AbstractDummyJsonMethod {

    public PostLoginUserMethod() {
       super();
    }
}
