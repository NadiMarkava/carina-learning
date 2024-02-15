package carina.learning.api.products;

import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${base_url}/products/categories", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_product_categories/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductCategoriesMethod extends AbstractDummyJsonMethod {

    public GetProductCategoriesMethod() {
       super();
    }

}

