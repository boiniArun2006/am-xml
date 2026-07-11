package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {
    private final SupportMenu nr;

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return t(this.nr.add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return nr(this.nr.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return t(this.nr.add(i2));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.nr.addIntentOptions(i2, i3, i5, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = t(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return nr(this.nr.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public void close() {
        this.nr.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        return t(this.nr.findItem(i2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return t(this.nr.getItem(i2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.nr.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.nr.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return this.nr.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.nr.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.nr.setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        this.nr.setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        this.nr.setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.nr.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public int size() {
        return this.nr.size();
    }

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu != null) {
            this.nr = supportMenu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i5, CharSequence charSequence) {
        return t(this.nr.add(i2, i3, i5, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i5, CharSequence charSequence) {
        return nr(this.nr.addSubMenu(i2, i3, i5, charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        O();
        this.nr.clear();
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        J2(i2);
        this.nr.removeGroup(i2);
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        Uo(i2);
        this.nr.removeItem(i2);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i5, int i7) {
        return t(this.nr.add(i2, i3, i5, i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i5, int i7) {
        return nr(this.nr.addSubMenu(i2, i3, i5, i7));
    }
}
