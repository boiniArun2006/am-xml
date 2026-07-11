package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class fuX extends MenuBuilder {
    public fuX(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i5, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) n(i2, i3, i5, charSequence);
        aC aCVar = new aC(WPU(), this, menuItemImpl);
        menuItemImpl.aYN(aCVar);
        return aCVar;
    }
}
