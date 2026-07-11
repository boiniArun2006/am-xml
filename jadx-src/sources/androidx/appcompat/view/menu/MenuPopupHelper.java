package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class MenuPopupHelper implements MenuHelper {
    private View J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f13900O;
    private int Uo;
    private PopupWindow.OnDismissListener gh;
    private MenuPopup mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f13901n;
    private final int nr;
    private final PopupWindow.OnDismissListener qie;
    private final MenuBuilder rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f13902t;
    private MenuPresenter.Callback xMQ;

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z2, int i2) {
        this(context, menuBuilder, view, z2, i2, 0);
    }

    protected void O() {
        this.mUb = null;
        PopupWindow.OnDismissListener onDismissListener = this.gh;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z2, int i2, int i3) {
        this.Uo = 8388611;
        this.qie = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                MenuPopupHelper.this.O();
            }
        };
        this.f13901n = context;
        this.rl = menuBuilder;
        this.J2 = view;
        this.f13902t = z2;
        this.nr = i2;
        this.f13900O = i3;
    }

    private MenuPopup n() {
        Display defaultDisplay = ((WindowManager) this.f13901n.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        MenuPopup cascadingMenuPopup = Math.min(point.x, point.y) >= this.f13901n.getResources().getDimensionPixelSize(R.dimen.f13451t) ? new CascadingMenuPopup(this.f13901n, this.J2, this.nr, this.f13900O, this.f13902t) : new StandardMenuPopup(this.f13901n, this.rl, this.J2, this.nr, this.f13900O, this.f13902t);
        cascadingMenuPopup.qie(this.rl);
        cascadingMenuPopup.S(this.qie);
        cascadingMenuPopup.Ik(this.J2);
        cascadingMenuPopup.nr(this.xMQ);
        cascadingMenuPopup.o(this.KN);
        cascadingMenuPopup.Z(this.Uo);
        return cascadingMenuPopup;
    }

    public void J2(View view) {
        this.J2 = view;
    }

    public void KN(int i2) {
        this.Uo = i2;
    }

    public void Uo(boolean z2) {
        this.KN = z2;
        MenuPopup menuPopup = this.mUb;
        if (menuPopup != null) {
            menuPopup.o(z2);
        }
    }

    public void mUb(MenuPresenter.Callback callback) {
        this.xMQ = callback;
        MenuPopup menuPopup = this.mUb;
        if (menuPopup != null) {
            menuPopup.nr(callback);
        }
    }

    public boolean nr() {
        MenuPopup menuPopup = this.mUb;
        return menuPopup != null && menuPopup.n();
    }

    public MenuPopup t() {
        if (this.mUb == null) {
            this.mUb = n();
        }
        return this.mUb;
    }

    public void xMQ(PopupWindow.OnDismissListener onDismissListener) {
        this.gh = onDismissListener;
    }

    private void qie(int i2, int i3, boolean z2, boolean z3) {
        MenuPopup menuPopupT = t();
        menuPopupT.WPU(z3);
        if (z2) {
            if ((GravityCompat.rl(this.Uo, this.J2.getLayoutDirection()) & 7) == 5) {
                i2 -= this.J2.getWidth();
            }
            menuPopupT.XQ(i2);
            menuPopupT.aYN(i3);
            int i5 = (int) ((this.f13901n.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            menuPopupT.r(new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5));
        }
        menuPopupT.show();
    }

    public boolean az() {
        if (nr()) {
            return true;
        }
        if (this.J2 == null) {
            return false;
        }
        qie(0, 0, false, false);
        return true;
    }

    public void gh() {
        if (az()) {
        } else {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void rl() {
        if (nr()) {
            this.mUb.dismiss();
        }
    }

    public boolean ty(int i2, int i3) {
        if (nr()) {
            return true;
        }
        if (this.J2 == null) {
            return false;
        }
        qie(i2, i3, true, true);
        return true;
    }
}
