package carina.learning.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public abstract class AbstractDummyJsonMethod extends AbstractApiMethodV2 {

    public AbstractDummyJsonMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("dummyjson_api_url"));
    }

}
