package carina.learning.api.employees;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/employee/${id}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/_get_by_id/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetEmployeeByIdMethod extends AbstractApiMethodV2 {

    public GetEmployeeByIdMethod(int id) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("restapiexample_api_url"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}

