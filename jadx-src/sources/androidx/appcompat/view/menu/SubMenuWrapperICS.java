package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SupportSubMenu f13919O;

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        this.f13919O.setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        this.f13919O.setHeaderTitle(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f13919O.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f13919O.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return t(this.f13919O.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f13919O.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f13919O.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f13919O.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f13919O.setIcon(drawable);
        return this;
    }

    SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f13919O = supportSubMenu;
    }
}
