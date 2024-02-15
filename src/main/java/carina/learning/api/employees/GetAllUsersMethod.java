package carina.learning.api.employees;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/employees", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/_get_all/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAllUsersMethod extends AbstractApiMethodV2 {

    public GetAllUsersMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
