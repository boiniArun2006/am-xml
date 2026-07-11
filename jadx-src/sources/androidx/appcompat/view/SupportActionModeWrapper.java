package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class SupportActionModeWrapper extends android.view.ActionMode {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Context f13770n;
    final ActionMode rl;

    @RestrictTo
    public static class CallbackWrapper implements ActionMode.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ActionMode.Callback f13771n;
        final Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final ArrayList f13772t = new ArrayList();
        final SimpleArrayMap nr = new SimpleArrayMap();

        private Menu J2(Menu menu) {
            Menu menu2 = (Menu) this.nr.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuWrapperICS menuWrapperICS = new MenuWrapperICS(this.rl, (SupportMenu) menu);
            this.nr.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }

        public android.view.ActionMode O(ActionMode actionMode) {
            int size = this.f13772t.size();
            for (int i2 = 0; i2 < size; i2++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) this.f13772t.get(i2);
                if (supportActionModeWrapper != null && supportActionModeWrapper.rl == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.rl, actionMode);
            this.f13772t.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void n(ActionMode actionMode) {
            this.f13771n.onDestroyActionMode(O(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean nr(ActionMode actionMode, Menu menu) {
            return this.f13771n.onPrepareActionMode(O(actionMode), J2(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean rl(ActionMode actionMode, Menu menu) {
            return this.f13771n.onCreateActionMode(O(actionMode), J2(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean t(ActionMode actionMode, MenuItem menuItem) {
            return this.f13771n.onActionItemClicked(O(actionMode), new MenuItemWrapperICS(this.rl, (SupportMenuItem) menuItem));
        }

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.rl = context;
            this.f13771n = callback;
        }
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.rl.HI(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.rl.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.rl.t();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.rl.nr();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuWrapperICS(this.f13770n, (SupportMenu) this.rl.O());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.rl.J2();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.rl.Uo();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.rl.KN();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.rl.xMQ();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.rl.mUb();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.rl.gh();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.rl.qie();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.rl.az(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.rl.ty(i2);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.rl.ck(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.rl.Ik(i2);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.rl.o(z2);
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f13770n = context;
        this.rl = actionMode;
    }
}
