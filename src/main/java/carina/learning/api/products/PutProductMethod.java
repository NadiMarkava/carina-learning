package carina.learning.api.products;

import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${base_url}/products/${id}", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/products/_put_product/rq.json")
@ResponseTemplatePath(path = "api/products/_put_product/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutProductMethod extends AbstractDummyJsonMethod {

    public PutProductMethod(int id) {
        super();
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}

