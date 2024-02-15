package carina.learning.api.products;

import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.apache.http.HttpHeaders;

@Endpoint(url = "${base_url}/auth/products", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_products/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductsWithAuthTokenMethod extends AbstractDummyJsonMethod {

    public GetProductsWithAuthTokenMethod(String token) {
        super();
        setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }
}
