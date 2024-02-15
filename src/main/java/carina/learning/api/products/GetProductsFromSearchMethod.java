package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/products/search?q=Laptop", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_products_from_search/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductsFromSearchMethod extends AbstractApiMethodV2 {

    public GetProductsFromSearchMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_products"));
    }
}
