package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class ToolbarActionBar extends ActionBar {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f13678O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final DecorToolbar f13679n;
    boolean nr;
    final Window.Callback rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final AppCompatDelegateImpl.ActionBarMenuCallback f13680t;
    private final Toolbar.OnMenuItemClickListener xMQ;
    private ArrayList Uo = new ArrayList();
    private final Runnable KN = new Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        @Override // java.lang.Runnable
        public void run() {
            ToolbarActionBar.this.WPU();
        }
    };

    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f13683n;

        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void rl(MenuBuilder menuBuilder, boolean z2) {
            if (this.f13683n) {
                return;
            }
            this.f13683n = true;
            ToolbarActionBar.this.f13679n.r();
            ToolbarActionBar.this.rl.onPanelClosed(108, menuBuilder);
            this.f13683n = false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean t(MenuBuilder menuBuilder) {
            ToolbarActionBar.this.rl.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    private final class MenuBuilderCallback implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void rl(MenuBuilder menuBuilder) {
            if (ToolbarActionBar.this.f13679n.O()) {
                ToolbarActionBar.this.rl.onPanelClosed(108, menuBuilder);
            } else if (ToolbarActionBar.this.rl.onPreparePanel(0, null, menuBuilder)) {
                ToolbarActionBar.this.rl.onMenuOpened(108, menuBuilder);
            }
        }
    }

    private class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {
        ToolbarMenuCallback() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public boolean n(int i2) {
            if (i2 != 0) {
                return false;
            }
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            if (toolbarActionBar.nr) {
                return false;
            }
            toolbarActionBar.f13679n.J2();
            ToolbarActionBar.this.nr = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(ToolbarActionBar.this.f13679n.getContext());
            }
            return null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Ik(boolean z2) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o(boolean z2) {
    }

    private Menu S() {
        if (!this.f13678O) {
            this.f13679n.XQ(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            this.f13678O = true;
        }
        return this.f13679n.mUb();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean J2() {
        return this.f13679n.rl();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void KN(boolean z2) {
        if (z2 == this.J2) {
            return;
        }
        this.J2 = z2;
        int size = this.Uo.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ActionBar.OnMenuVisibilityListener) this.Uo.get(i2)).n(z2);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean Uo() {
        if (!this.f13679n.KN()) {
            return false;
        }
        this.f13679n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(CharSequence charSequence) {
        this.f13679n.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    void az() {
        this.f13679n.az().removeCallbacks(this.KN);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean ck() {
        return this.f13679n.t();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean gh() {
        this.f13679n.az().removeCallbacks(this.KN);
        ViewCompat.Nxk(this.f13679n.az(), this.KN);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context mUb() {
        return this.f13679n.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r(int i2) {
        this.f13679n.HI(i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int xMQ() {
        return this.f13679n.S();
    }

    ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                return ToolbarActionBar.this.rl.onMenuItemSelected(0, menuItem);
            }
        };
        this.xMQ = onMenuItemClickListener;
        Preconditions.Uo(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f13679n = toolbarWidgetWrapper;
        this.rl = (Window.Callback) Preconditions.Uo(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f13680t = new ToolbarMenuCallback();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean HI(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            ck();
        }
        return true;
    }

    void WPU() {
        MenuBuilder menuBuilder;
        Menu menuS = S();
        if (menuS instanceof MenuBuilder) {
            menuBuilder = (MenuBuilder) menuS;
        } else {
            menuBuilder = null;
        }
        if (menuBuilder != null) {
            menuBuilder.dR0();
        }
        try {
            menuS.clear();
            if (!this.rl.onCreatePanelMenu(0, menuS) || !this.rl.onPreparePanel(0, null, menuS)) {
                menuS.clear();
            }
            if (menuBuilder != null) {
                menuBuilder.k();
            }
        } catch (Throwable th) {
            if (menuBuilder != null) {
                menuBuilder.k();
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void qie(Configuration configuration) {
        super.qie(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean ty(int i2, KeyEvent keyEvent) {
        int deviceId;
        Menu menuS = S();
        if (menuS == null) {
            return false;
        }
        if (keyEvent != null) {
            deviceId = keyEvent.getDeviceId();
        } else {
            deviceId = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(deviceId).getKeyboardType() == 1) {
            z2 = false;
        }
        menuS.setQwertyMode(z2);
        return menuS.performShortcut(i2, keyEvent, 0);
    }
}
