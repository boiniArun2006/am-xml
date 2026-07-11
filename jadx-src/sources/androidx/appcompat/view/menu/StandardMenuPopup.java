package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuPopupWindow;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {
    private static final int eF = R.layout.HI;
    private final MenuAdapter J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    View f13904N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MenuBuilder f13905O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f13906S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f13907T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f13908U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private PopupWindow.OnDismissListener f13909X;
    ViewTreeObserver Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f13910Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MenuPopupWindow f13912g;
    private boolean jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f13913o;
    private boolean p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f13914r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f13915t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MenuPresenter.Callback f13916v;
    final ViewTreeObserver.OnGlobalLayoutListener E2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!StandardMenuPopup.this.n() || StandardMenuPopup.this.f13912g.g()) {
                return;
            }
            View view = StandardMenuPopup.this.f13904N;
            if (view == null || !view.isShown()) {
                StandardMenuPopup.this.dismiss();
            } else {
                StandardMenuPopup.this.f13912g.show();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f13911e = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = StandardMenuPopup.this.Xw;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    StandardMenuPopup.this.Xw = view.getViewTreeObserver();
                }
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                standardMenuPopup.Xw.removeGlobalOnLayoutListener(standardMenuPopup.E2);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int M7 = 0;

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void KN(boolean z2) {
        this.f13908U = false;
        MenuAdapter menuAdapter = this.J2;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void O(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable Uo() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.jB = true;
        this.f13905O.close();
        ViewTreeObserver viewTreeObserver = this.Xw;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.Xw = this.f13904N.getViewTreeObserver();
            }
            this.Xw.removeGlobalOnLayoutListener(this.E2);
            this.Xw = null;
        }
        this.f13904N.removeOnAttachStateChangeListener(this.f13911e);
        PopupWindow.OnDismissListener onDismissListener = this.f13909X;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void qie(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean xMQ() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void Ik(View view) {
        this.f13907T = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void S(PopupWindow.OnDismissListener onDismissListener) {
        this.f13909X = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void WPU(boolean z2) {
        this.p5 = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void XQ(int i2) {
        this.f13912g.nr(i2);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void Z(int i2) {
        this.M7 = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void aYN(int i2) {
        this.f13912g.KN(i2);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean n() {
        return !this.jB && this.f13912g.n();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void nr(MenuPresenter.Callback callback) {
        this.f13916v = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void o(boolean z2) {
        this.J2.nr(z2);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        if (menuBuilder != this.f13905O) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f13916v;
        if (callback != null) {
            callback.rl(menuBuilder, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView ty() {
        return this.f13912g.ty();
    }

    public StandardMenuPopup(Context context, MenuBuilder menuBuilder, View view, int i2, int i3, boolean z2) {
        this.f13915t = context;
        this.f13905O = menuBuilder;
        this.f13914r = z2;
        this.J2 = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z2, eF);
        this.f13910Z = i2;
        this.f13906S = i3;
        Resources resources = context.getResources();
        this.f13913o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.nr));
        this.f13907T = view;
        this.f13912g = new MenuPopupWindow(context, null, i2, i3);
        menuBuilder.t(this, context);
    }

    private boolean g() {
        View view;
        boolean z2;
        if (n()) {
            return true;
        }
        if (this.jB || (view = this.f13907T) == null) {
            return false;
        }
        this.f13904N = view;
        this.f13912g.nHg(this);
        this.f13912g.s7N(this);
        this.f13912g.N(true);
        View view2 = this.f13904N;
        if (this.Xw == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.Xw = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.E2);
        }
        view2.addOnAttachStateChangeListener(this.f13911e);
        this.f13912g.iF(view2);
        this.f13912g.e(this.M7);
        if (!this.f13908U) {
            this.P5 = MenuPopup.ck(this.J2, null, this.f13915t, this.f13913o);
            this.f13908U = true;
        }
        this.f13912g.E2(this.P5);
        this.f13912g.T(2);
        this.f13912g.X(HI());
        this.f13912g.show();
        ListView listViewTy = this.f13912g.ty();
        listViewTy.setOnKeyListener(this);
        if (this.p5 && this.f13905O.nY() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f13915t).inflate(R.layout.ty, (ViewGroup) listViewTy, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f13905O.nY());
            }
            frameLayout.setEnabled(false);
            listViewTy.addHeaderView(frameLayout, null, false);
        }
        this.f13912g.qie(this.J2);
        this.f13912g.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean J2(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f13915t, subMenuBuilder, this.f13904N, this.f13914r, this.f13910Z, this.f13906S);
            menuPopupHelper.mUb(this.f13916v);
            menuPopupHelper.Uo(MenuPopup.ViF(subMenuBuilder));
            menuPopupHelper.xMQ(this.f13909X);
            this.f13909X = null;
            this.f13905O.O(false);
            int iRl = this.f13912g.rl();
            int iGh = this.f13912g.gh();
            if ((Gravity.getAbsoluteGravity(this.M7, this.f13907T.getLayoutDirection()) & 7) == 5) {
                iRl += this.f13907T.getWidth();
            }
            if (menuPopupHelper.ty(iRl, iGh)) {
                MenuPresenter.Callback callback = this.f13916v;
                if (callback != null) {
                    callback.t(subMenuBuilder);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        if (n()) {
            this.f13912g.dismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        if (g()) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
