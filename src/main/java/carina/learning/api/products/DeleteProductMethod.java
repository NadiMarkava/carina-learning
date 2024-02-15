package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/products/${id}", methodType = HttpMethodType.DELETE)
@ResponseTemplatePath(path = "api/products/_delete_product/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteProductMethod extends AbstractApiMethodV2 {

    public DeleteProductMethod(int id) {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url_products"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}
