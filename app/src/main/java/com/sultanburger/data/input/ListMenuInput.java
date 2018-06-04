package com.sultanburger.data.input;

import android.content.Context;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sultanburger.utils.Validate;

import java.util.List;

public class ListMenuInput implements Validate {

    @Expose
    @SerializedName("branch_id")
    String branch_id;

    @Expose
    @SerializedName("order_type")
     int order_type;

    @Expose
    @SerializedName("user_address_id")
     String user_address_id;

    @Expose
    @SerializedName("modifiers")
    List<Integer> modifiers;


    @Expose
    @SerializedName("addons")
     List<Integer> addons;

    @Expose
    @SerializedName("menu_item_id")
     String menu_item_id;



    public ListMenuInput() {

    }


    public String getMenuItemid() {
        return menu_item_id;
    }

    public void setMenuItemid(String menu_item_id) {
        this.menu_item_id = menu_item_id;
    }


    public List<Integer> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<Integer> modifiers) {
        this.modifiers = modifiers;
    }

    public List<Integer> getAddons() {
        return addons;
    }

    public void setAddons(List<Integer> addons) {
        this.addons = addons;
    }



    public String getBranchId() {
        return branch_id;
    }

    public void setBranchId(String branch_id) {
        this.branch_id = branch_id;
    }

  /*  public String getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setMenuCategoryId(String menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }*/

    public int getOrderType() {
        return order_type;
    }

    public void setOrderType(int order_type) {
        this.order_type = order_type;
    }

    public String getUserAddressId() {
        return user_address_id;
    }

    public void setUserAddressId(String user_address_id) {
        this.user_address_id = user_address_id;
    }

  /*  public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
*/
    @Override
    public boolean isValid(Context context) {
        boolean retVal = true;

        return retVal;
    }
}
