package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;
import org.apache.http.HttpHeaders;

@Endpoint(url = "${base_url}/auth/products", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_products/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductsWithAuthTokenMethod extends AbstractApiMethodV2 {

    public GetProductsWithAuthTokenMethod(String token) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("dummyjson_api_url"));
        setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }
}
