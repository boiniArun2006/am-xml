package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public interface MenuView {

    public interface ItemView {
        boolean O();

        MenuItemImpl getItemData();

        void t(MenuItemImpl menuItemImpl, int i2);
    }

    void n(MenuBuilder menuBuilder);
}
