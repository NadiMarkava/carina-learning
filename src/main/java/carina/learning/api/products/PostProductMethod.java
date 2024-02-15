package carina.learning.api.products;

import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${base_url}/products/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/products/_post_product/rq.json")
@ResponseTemplatePath(path = "api/products/_post_product/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostProductMethod extends AbstractDummyJsonMethod {

    public PostProductMethod() {
        super();
    }
}
