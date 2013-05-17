package LaSenza.Steps

import net.thucydides.core.annotations.Steps
import LaSenza.UseSteps.AdminPanelSteps
import LaSenza.UseSteps.CustomerSteps
import LaSenza.UseSteps.UserSteps

class DevelopingSteps {


    @Steps
    CustomerSteps customer

    @Steps
    UserSteps user
    @Steps
    AdminPanelSteps admin

/*
    @Given("I am on home page as customer.")
    public void open_home_page_as_customer_with_cookie(){
        user.log_in(true)
    }

    @Given("Prepare_base")
    public void prepare_base(){
        admin.open_admin_panel()
        admin.open_product(1929)
        admin.set_product_visibility("Catalog, Search")
        admin.set_product_qty("1000")
        admin.set_brand_name_category("Brand Name1",1929)
        admin.getDriver().close()
    }

    @Then("I should redirects to the My Account Dashboard page.")
    public void assert_on_my_account_dashboard_page(){
        customer.assert_on_my_account_dashboard_page()
    }*/


}
