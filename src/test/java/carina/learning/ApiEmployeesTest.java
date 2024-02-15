package carina.learning;

import carina.learning.api.employees.*;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class ApiEmployeesTest {

    @Test()
    @MethodOwner(owner = "nknysh")
    public void testCreateEmployee() {
        PostEmployeeMethod postEmployeeMethod = new PostEmployeeMethod();
        postEmployeeMethod.setProperties("api/users/user.properties");
        postEmployeeMethod.callAPIExpectSuccess();
        postEmployeeMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "nknysh")
    public void testUpdateEmployee() {
        PutEmployeeMethod putEmployeeMethod = new PutEmployeeMethod(24);
        putEmployeeMethod.setProperties("api/users/user.properties");
        putEmployeeMethod.callAPIExpectSuccess();
        putEmployeeMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "nknysh")
    public void testGetUsers() {
        GetAllEmployeesMethod getEmployeesMethods = new GetAllEmployeesMethod();
        getEmployeesMethods.callAPIExpectSuccess();
        getEmployeesMethods.validateResponse();
        getEmployeesMethods.validateResponseAgainstSchema("api/users/_get_all/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "nknysh")
    public void testGetEmployee() {
        GetEmployeeByIdMethod getEmployeeMethod = new GetEmployeeByIdMethod(23);
        getEmployeeMethod.callAPIExpectSuccess();
        getEmployeeMethod.validateResponse();
        getEmployeeMethod.validateResponseAgainstSchema("api/users/_get_by_id/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "nknysh")
    public void testDeleteEmployee() {
        DeleteEmployeeMethod deleteEmployeeMethod = new DeleteEmployeeMethod(24);
        deleteEmployeeMethod.callAPIExpectSuccess();
        deleteEmployeeMethod.validateResponse();
    }
}
