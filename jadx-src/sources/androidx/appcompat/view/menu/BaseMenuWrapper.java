package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class BaseMenuWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Context f13814n;
    private SimpleArrayMap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SimpleArrayMap f13815t;

    final void J2(int i2) {
        if (this.rl == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.rl.getSize()) {
            if (((SupportMenuItem) this.rl.xMQ(i3)).getGroupId() == i2) {
                this.rl.gh(i3);
                i3--;
            }
            i3++;
        }
    }

    final void O() {
        SimpleArrayMap simpleArrayMap = this.rl;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f13815t;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    final void Uo(int i2) {
        if (this.rl == null) {
            return;
        }
        for (int i3 = 0; i3 < this.rl.getSize(); i3++) {
            if (((SupportMenuItem) this.rl.xMQ(i3)).getItemId() == i2) {
                this.rl.gh(i3);
                return;
            }
        }
    }

    final SubMenu nr(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f13815t == null) {
            this.f13815t = new SimpleArrayMap();
        }
        SubMenu subMenu2 = (SubMenu) this.f13815t.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f13814n, supportSubMenu);
        this.f13815t.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    final MenuItem t(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.rl == null) {
            this.rl = new SimpleArrayMap();
        }
        MenuItem menuItem2 = (MenuItem) this.rl.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f13814n, supportMenuItem);
        this.rl.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    BaseMenuWrapper(Context context) {
        this.f13814n = context;
    }
}
