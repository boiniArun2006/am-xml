package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    private MenuItemImpl iF;
    private MenuBuilder te;

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.J(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.I(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.iF.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void E(MenuBuilder.Callback callback) {
        this.te.E(callback);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean J2(MenuItemImpl menuItemImpl) {
        return this.te.J2(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean N() {
        return this.te.N();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public String S() {
        MenuItemImpl menuItemImpl = this.iF;
        int itemId = menuItemImpl != null ? menuItemImpl.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.S() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean az(MenuItemImpl menuItemImpl) {
        return this.te.az(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public MenuBuilder e() {
        return this.te.e();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.iF;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean nHg() {
        return this.te.nHg();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean s7N() {
        return this.te.s7N();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.te.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.B(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.a(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.iF.setIcon(i2);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.te.setQwertyMode(z2);
    }

    public Menu z() {
        return this.te;
    }

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.te = menuBuilder;
        this.iF = menuItemImpl;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    boolean KN(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (!super.KN(menuBuilder, menuItem) && !this.te.KN(menuBuilder, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.GR(view);
    }
}
