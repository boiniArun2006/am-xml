package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {
    private MenuPresenter.Callback J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ListMenuPresenter f13881O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MenuBuilder f13882n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AlertDialog f13883t;

    public void n() {
        AlertDialog alertDialog = this.f13883t;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void nr(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f13882n;
        AlertDialog.Builder builder = new AlertDialog.Builder(menuBuilder.WPU());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext(), R.layout.qie);
        this.f13881O = listMenuPresenter;
        listMenuPresenter.nr(this);
        this.f13882n.rl(this.f13881O);
        builder.n(this.f13881O.n(), this);
        View viewG = menuBuilder.g();
        if (viewG != null) {
            builder.t(viewG);
        } else {
            builder.O(menuBuilder.ViF()).setTitle(menuBuilder.nY());
        }
        builder.HI(this);
        AlertDialog alertDialogCreate = builder.create();
        this.f13883t = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f13883t.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f13883t.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f13882n.bzg((MenuItemImpl) this.f13881O.n().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f13881O.rl(this.f13882n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13883t.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13883t.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f13882n.O(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f13882n.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        if (z2 || menuBuilder == this.f13882n) {
            n();
        }
        MenuPresenter.Callback callback = this.J2;
        if (callback != null) {
            callback.rl(menuBuilder, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean t(MenuBuilder menuBuilder) {
        MenuPresenter.Callback callback = this.J2;
        if (callback != null) {
            return callback.t(menuBuilder);
        }
        return false;
    }

    public MenuDialogHelper(MenuBuilder menuBuilder) {
        this.f13882n = menuBuilder;
    }
}
