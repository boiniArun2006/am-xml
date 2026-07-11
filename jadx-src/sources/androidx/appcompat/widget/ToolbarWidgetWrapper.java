package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class ToolbarWidgetWrapper implements DecorToolbar {
    private int HI;
    private Drawable Ik;
    private Drawable J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Drawable f14427O;
    private Drawable Uo;
    boolean az;
    private int ck;
    private CharSequence gh;
    private CharSequence mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Toolbar f14428n;
    private View nr;
    Window.Callback qie;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f14429t;
    private ActionMenuPresenter ty;
    CharSequence xMQ;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, R.string.f13486n, R.drawable.ty);
    }

    public void E2(CharSequence charSequence) {
        this.KN = true;
        e(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void J2() {
        this.az = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void ty(boolean z2) {
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z2, int i2, int i3) {
        Drawable drawable;
        this.HI = 0;
        this.ck = 0;
        this.f14428n = toolbar;
        this.xMQ = toolbar.getTitle();
        this.mUb = toolbar.getSubtitle();
        this.KN = this.xMQ != null;
        this.Uo = toolbar.getNavigationIcon();
        TintTypedArray tintTypedArrayS = TintTypedArray.S(toolbar.getContext(), null, R.styleable.f13531n, R.attr.f13442t, 0);
        this.Ik = tintTypedArrayS.Uo(R.styleable.qie);
        if (z2) {
            CharSequence charSequenceCk = tintTypedArrayS.ck(R.styleable.f13533r);
            if (!TextUtils.isEmpty(charSequenceCk)) {
                E2(charSequenceCk);
            }
            CharSequence charSequenceCk2 = tintTypedArrayS.ck(R.styleable.ck);
            if (!TextUtils.isEmpty(charSequenceCk2)) {
                fD(charSequenceCk2);
            }
            Drawable drawableUo = tintTypedArrayS.Uo(R.styleable.ty);
            if (drawableUo != null) {
                g(drawableUo);
            }
            Drawable drawableUo2 = tintTypedArrayS.Uo(R.styleable.az);
            if (drawableUo2 != null) {
                setIcon(drawableUo2);
            }
            if (this.Uo == null && (drawable = this.Ik) != null) {
                iF(drawable);
            }
            xMQ(tintTypedArrayS.gh(R.styleable.KN, 0));
            int iTy = tintTypedArrayS.ty(R.styleable.Uo, 0);
            if (iTy != 0) {
                ViF(LayoutInflater.from(this.f14428n.getContext()).inflate(iTy, (ViewGroup) this.f14428n, false));
                xMQ(this.rl | 16);
            }
            int iAz = tintTypedArrayS.az(R.styleable.mUb, 0);
            if (iAz > 0) {
                ViewGroup.LayoutParams layoutParams = this.f14428n.getLayoutParams();
                layoutParams.height = iAz;
                this.f14428n.setLayoutParams(layoutParams);
            }
            int iO = tintTypedArrayS.O(R.styleable.J2, -1);
            int iO2 = tintTypedArrayS.O(R.styleable.f13508O, -1);
            if (iO >= 0 || iO2 >= 0) {
                this.f14428n.s7N(Math.max(iO, 0), Math.max(iO2, 0));
            }
            int iTy2 = tintTypedArrayS.ty(R.styleable.f13532o, 0);
            if (iTy2 != 0) {
                Toolbar toolbar2 = this.f14428n;
                toolbar2.bzg(toolbar2.getContext(), iTy2);
            }
            int iTy3 = tintTypedArrayS.ty(R.styleable.Ik, 0);
            if (iTy3 != 0) {
                Toolbar toolbar3 = this.f14428n;
                toolbar3.rV9(toolbar3.getContext(), iTy3);
            }
            int iTy4 = tintTypedArrayS.ty(R.styleable.HI, 0);
            if (iTy4 != 0) {
                this.f14428n.setPopupTheme(iTy4);
            }
        } else {
            this.rl = aYN();
        }
        tintTypedArrayS.aYN();
        nY(i2);
        this.gh = this.f14428n.getNavigationContentDescription();
        this.f14428n.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final ActionMenuItem f14430n;

            {
                this.f14430n = new ActionMenuItem(ToolbarWidgetWrapper.this.f14428n.getContext(), 0, android.R.id.home, 0, 0, ToolbarWidgetWrapper.this.xMQ);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.qie;
                if (callback == null || !toolbarWidgetWrapper.az) {
                    return;
                }
                callback.onMenuItemSelected(0, this.f14430n);
            }
        });
    }

    private void N() {
        Drawable drawable;
        int i2 = this.rl;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.J2) == null) {
            drawable = this.f14427O;
        }
        this.f14428n.setLogo(drawable);
    }

    private void T() {
        if ((this.rl & 4) == 0) {
            this.f14428n.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f14428n;
        Drawable drawable = this.Uo;
        if (drawable == null) {
            drawable = this.Ik;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void X() {
        if ((this.rl & 4) != 0) {
            if (TextUtils.isEmpty(this.gh)) {
                this.f14428n.setNavigationContentDescription(this.ck);
            } else {
                this.f14428n.setNavigationContentDescription(this.gh);
            }
        }
    }

    private int aYN() {
        if (this.f14428n.getNavigationIcon() == null) {
            return 11;
        }
        this.Ik = this.f14428n.getNavigationIcon();
        return 15;
    }

    private void e(CharSequence charSequence) {
        this.xMQ = charSequence;
        if ((this.rl & 8) != 0) {
            this.f14428n.setTitle(charSequence);
            if (this.KN) {
                ViewCompat.ofS(this.f14428n.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void HI(int i2) {
        te(i2 == 0 ? null : getContext().getString(i2));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void Ik(boolean z2) {
        this.f14428n.setCollapsible(z2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean KN() {
        return this.f14428n.WPU();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean O() {
        return this.f14428n.iF();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int S() {
        return this.rl;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean Uo() {
        return this.f14428n.te();
    }

    public void ViF(View view) {
        View view2 = this.nr;
        if (view2 != null && (this.rl & 16) != 0) {
            this.f14428n.removeView(view2);
        }
        this.nr = view;
        if (view == null || (this.rl & 16) == 0) {
            return;
        }
        this.f14428n.addView(view);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void WPU() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void XQ(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f14428n.v(callback, callback2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void Z(int i2) {
        g(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewGroup az() {
        return this.f14428n;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void ck() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.f14428n.J2();
    }

    public void fD(CharSequence charSequence) {
        this.mUb = charSequence;
        if ((this.rl & 8) != 0) {
            this.f14428n.setSubtitle(charSequence);
        }
    }

    public void g(Drawable drawable) {
        this.J2 = drawable;
        N();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Context getContext() {
        return this.f14428n.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.f14428n.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int gh() {
        return this.HI;
    }

    public void iF(Drawable drawable) {
        this.Uo = drawable;
        T();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public Menu mUb() {
        return this.f14428n.getMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean n() {
        return this.f14428n.O();
    }

    public void nY(int i2) {
        if (i2 == this.ck) {
            return;
        }
        this.ck = i2;
        if (TextUtils.isEmpty(this.f14428n.getNavigationContentDescription())) {
            HI(this.ck);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void nr(Menu menu, MenuPresenter.Callback callback) {
        if (this.ty == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f14428n.getContext());
            this.ty = actionMenuPresenter;
            actionMenuPresenter.o(R.id.Uo);
        }
        this.ty.nr(callback);
        this.f14428n.wTp((MenuBuilder) menu, this.ty);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void o(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f14429t;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f14428n;
            if (parent == toolbar) {
                toolbar.removeView(this.f14429t);
            }
        }
        this.f14429t = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.HI != 2) {
            return;
        }
        this.f14428n.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f14429t.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f13541n = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public ViewPropertyAnimatorCompat qie(final int i2, long j2) {
        return ViewCompat.O(this.f14428n).rl(i2 == 0 ? 1.0f : 0.0f).O(j2).Uo(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f14432n = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void n(View view) {
                this.f14432n = true;
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void rl(View view) {
                if (this.f14432n) {
                    return;
                }
                ToolbarWidgetWrapper.this.f14428n.setVisibility(i2);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void t(View view) {
                ToolbarWidgetWrapper.this.f14428n.setVisibility(0);
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void r() {
        this.f14428n.Uo();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean rl() {
        return this.f14428n.aYN();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.f14427O = drawable;
        N();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i2) {
        this.f14428n.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
        this.qie = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (this.KN) {
            return;
        }
        e(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean t() {
        return this.f14428n.U();
    }

    public void te(CharSequence charSequence) {
        this.gh = charSequence;
        X();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void xMQ(int i2) {
        View view;
        int i3 = this.rl ^ i2;
        this.rl = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    X();
                }
                T();
            }
            if ((i3 & 3) != 0) {
                N();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f14428n.setTitle(this.xMQ);
                    this.f14428n.setSubtitle(this.mUb);
                } else {
                    this.f14428n.setTitle((CharSequence) null);
                    this.f14428n.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.nr) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f14428n.addView(view);
            } else {
                this.f14428n.removeView(view);
            }
        }
    }
}
