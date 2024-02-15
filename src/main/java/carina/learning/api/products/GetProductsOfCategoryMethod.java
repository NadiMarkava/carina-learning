package carina.learning.api.products;

import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${base_url}/products/category/${name_category}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/products/_get_products_of_category/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductsOfCategoryMethod extends AbstractDummyJsonMethod {

    public GetProductsOfCategoryMethod(String nameCategory) {
        super();
        replaceUrlPlaceholder("name_category", nameCategory);
    }

}

