package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/products/categories", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_product_categories/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductCategoriesMethod extends AbstractApiMethodV2 {

    public GetProductCategoriesMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_products"));
    }

}

