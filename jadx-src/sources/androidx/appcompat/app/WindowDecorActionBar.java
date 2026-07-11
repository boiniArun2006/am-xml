package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    ActionMode HI;
    private boolean Ik;
    DecorToolbar J2;
    View KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ActionBarContainer f13694O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    boolean f13695S;
    ActionBarContextView Uo;
    boolean WPU;
    private boolean aYN;
    private boolean az;
    ActionMode.Callback ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13697g;
    private TabImpl gh;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Context f13698n;
    ViewPropertyAnimatorCompatSet nY;
    ActionBarOverlayLayout nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13699o;
    private Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Activity f13701t;
    boolean te;
    ActionModeImpl ty;
    ScrollingTabContainerView xMQ;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Interpolator f13693e = new AccelerateInterpolator();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Interpolator f13692X = new DecelerateInterpolator();
    private ArrayList mUb = new ArrayList();
    private int qie = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f13700r = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f13696Z = 0;
    boolean XQ = true;
    private boolean ViF = true;
    final ViewPropertyAnimatorListener iF = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.1
        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void rl(View view) {
            View view2;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.XQ && (view2 = windowDecorActionBar.KN) != null) {
                view2.setTranslationY(0.0f);
                WindowDecorActionBar.this.f13694O.setTranslationY(0.0f);
            }
            WindowDecorActionBar.this.f13694O.setVisibility(8);
            WindowDecorActionBar.this.f13694O.setTransitioning(false);
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.nY = null;
            windowDecorActionBar2.aYN();
            ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.nr;
            if (actionBarOverlayLayout != null) {
                ViewCompat.piY(actionBarOverlayLayout);
            }
        }
    };
    final ViewPropertyAnimatorListener fD = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.2
        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void rl(View view) {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.nY = null;
            windowDecorActionBar.f13694O.requestLayout();
        }
    };
    final ViewPropertyAnimatorUpdateListener E2 = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public void n(View view) {
            ((View) WindowDecorActionBar.this.f13694O.getParent()).invalidate();
        }
    };

    @RestrictTo
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {
        private final MenuBuilder J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Context f13705O;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference f13707o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ActionMode.Callback f13708r;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f13705O = context;
            this.f13708r = callback;
            MenuBuilder menuBuilderM = new MenuBuilder(context).M(1);
            this.J2 = menuBuilderM;
            menuBuilderM.E(this);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void HI(CharSequence charSequence) {
            WindowDecorActionBar.this.Uo.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void Ik(int i2) {
            r(WindowDecorActionBar.this.f13698n.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        public MenuInflater J2() {
            return new SupportMenuInflater(this.f13705O);
        }

        @Override // androidx.appcompat.view.ActionMode
        public Menu O() {
            return this.J2;
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence Uo() {
            return WindowDecorActionBar.this.Uo.getSubtitle();
        }

        public boolean Z() {
            this.J2.dR0();
            try {
                return this.f13708r.rl(this, this.J2);
            } finally {
                this.J2.k();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public void az(View view) {
            WindowDecorActionBar.this.Uo.setCustomView(view);
            this.f13707o = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void gh() {
            if (WindowDecorActionBar.this.ty != this) {
                return;
            }
            this.J2.dR0();
            try {
                this.f13708r.nr(this, this.J2);
            } finally {
                this.J2.k();
            }
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
            ActionMode.Callback callback = this.f13708r;
            if (callback != null) {
                return callback.t(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.ActionMode
        public View nr() {
            WeakReference weakReference = this.f13707o;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean qie() {
            return WindowDecorActionBar.this.Uo.gh();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void r(CharSequence charSequence) {
            WindowDecorActionBar.this.Uo.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void rl(MenuBuilder menuBuilder) {
            if (this.f13708r == null) {
                return;
            }
            gh();
            WindowDecorActionBar.this.Uo.Uo();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void t() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.ty != this) {
                return;
            }
            if (WindowDecorActionBar.WPU(windowDecorActionBar.f13695S, windowDecorActionBar.WPU, false)) {
                this.f13708r.n(this);
            } else {
                WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
                windowDecorActionBar2.HI = this;
                windowDecorActionBar2.ck = this.f13708r;
            }
            this.f13708r = null;
            WindowDecorActionBar.this.S(false);
            WindowDecorActionBar.this.Uo.KN();
            WindowDecorActionBar windowDecorActionBar3 = WindowDecorActionBar.this;
            windowDecorActionBar3.nr.setHideOnContentScrollEnabled(windowDecorActionBar3.te);
            WindowDecorActionBar.this.ty = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void ty(int i2) {
            HI(WindowDecorActionBar.this.f13698n.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence xMQ() {
            return WindowDecorActionBar.this.Uo.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void o(boolean z2) {
            super.o(z2);
            WindowDecorActionBar.this.Uo.setTitleOptional(z2);
        }
    }

    @RestrictTo
    public class TabImpl extends ActionBar.Tab {
        private View J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f13709O;
        final /* synthetic */ WindowDecorActionBar Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ActionBar.TabListener f13710n;
        private CharSequence nr;
        private Drawable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private CharSequence f13711t;

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void J2() {
            this.Uo.E2(this);
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public CharSequence O() {
            return this.f13711t;
        }

        public ActionBar.TabListener Uo() {
            return this.f13710n;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public CharSequence n() {
            return this.nr;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int nr() {
            return this.f13709O;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public View rl() {
            return this.J2;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public Drawable t() {
            return this.rl;
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z2) {
        this.f13701t = activity;
        View decorView = activity.getWindow().getDecorView();
        fD(decorView);
        if (z2) {
            return;
        }
        this.KN = decorView.findViewById(R.id.content);
    }

    static boolean WPU(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    public void e(boolean z2) {
        X(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void rl() {
    }

    private void N(boolean z2) {
        this.f13699o = z2;
        if (z2) {
            this.f13694O.setTabContainer(null);
            this.J2.o(this.xMQ);
        } else {
            this.J2.o(null);
            this.f13694O.setTabContainer(this.xMQ);
        }
        boolean z3 = te() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.xMQ;
        if (scrollingTabContainerView != null) {
            if (z3) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.nr;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.piY(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.J2.Ik(!this.f13699o && z3);
        this.nr.setHasNonEmbeddedTabs(!this.f13699o && z3);
    }

    private void fD(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(androidx.appcompat.R.id.Ik);
        this.nr = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.J2 = g(view.findViewById(androidx.appcompat.R.id.f13474n));
        this.Uo = (ActionBarContextView) view.findViewById(androidx.appcompat.R.id.J2);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(androidx.appcompat.R.id.f13477t);
        this.f13694O = actionBarContainer;
        DecorToolbar decorToolbar = this.J2;
        if (decorToolbar == null || this.Uo == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f13698n = decorToolbar.getContext();
        boolean z2 = (this.J2.S() & 4) != 0;
        if (z2) {
            this.az = true;
        }
        ActionBarPolicy actionBarPolicyRl = ActionBarPolicy.rl(this.f13698n);
        s7N(actionBarPolicyRl.n() || z2);
        N(actionBarPolicyRl.Uo());
        TypedArray typedArrayObtainStyledAttributes = this.f13698n.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f13531n, androidx.appcompat.R.attr.f13442t, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.gh, false)) {
            nHg(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.xMQ, 0);
        if (dimensionPixelSize != 0) {
            T(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DecorToolbar g(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : V8ValueNull.NULL);
        throw new IllegalStateException(sb.toString());
    }

    private void iF() {
        if (this.aYN) {
            this.aYN = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.nr;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            rV9(false);
        }
    }

    private void rV9(boolean z2) {
        if (WPU(this.f13695S, this.WPU, this.aYN)) {
            if (this.ViF) {
                return;
            }
            this.ViF = true;
            nY(z2);
            return;
        }
        if (this.ViF) {
            this.ViF = false;
            ViF(z2);
        }
    }

    private void v() {
        if (this.aYN) {
            return;
        }
        this.aYN = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.nr;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        rV9(false);
    }

    private boolean wTp() {
        return this.f13694O.isLaidOut();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Ik(boolean z2) {
        if (this.az) {
            return;
        }
        e(z2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void KN(boolean z2) {
        if (z2 == this.Ik) {
            return;
        }
        this.Ik = z2;
        int size = this.f13700r.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ActionBar.OnMenuVisibilityListener) this.f13700r.get(i2)).n(z2);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void O() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.nY;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.n();
            this.nY = null;
        }
    }

    public void S(boolean z2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatQie;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatJ2;
        if (z2) {
            v();
        } else {
            iF();
        }
        if (!wTp()) {
            if (z2) {
                this.J2.setVisibility(4);
                this.Uo.setVisibility(0);
                return;
            } else {
                this.J2.setVisibility(0);
                this.Uo.setVisibility(8);
                return;
            }
        }
        if (z2) {
            viewPropertyAnimatorCompatJ2 = this.J2.qie(4, 100L);
            viewPropertyAnimatorCompatQie = this.Uo.J2(0, 200L);
        } else {
            viewPropertyAnimatorCompatQie = this.J2.qie(0, 200L);
            viewPropertyAnimatorCompatJ2 = this.Uo.J2(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.nr(viewPropertyAnimatorCompatJ2, viewPropertyAnimatorCompatQie);
        viewPropertyAnimatorCompatSet.KN();
    }

    public void T(float f3) {
        ViewCompat.fcU(this.f13694O, f3);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean Uo() {
        DecorToolbar decorToolbar = this.J2;
        if (decorToolbar == null || !decorToolbar.KN()) {
            return false;
        }
        this.J2.collapseActionView();
        return true;
    }

    public void ViF(boolean z2) {
        View view;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.nY;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.n();
        }
        if (this.f13696Z != 0 || (!this.f13697g && !z2)) {
            this.iF.rl(null);
            return;
        }
        this.f13694O.setAlpha(1.0f);
        this.f13694O.setTransitioning(true);
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
        float f3 = -this.f13694O.getHeight();
        if (z2) {
            this.f13694O.getLocationInWindow(new int[]{0, 0});
            f3 -= r5[1];
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatQie = ViewCompat.O(this.f13694O).qie(f3);
        viewPropertyAnimatorCompatQie.mUb(this.E2);
        viewPropertyAnimatorCompatSet2.t(viewPropertyAnimatorCompatQie);
        if (this.XQ && (view = this.KN) != null) {
            viewPropertyAnimatorCompatSet2.t(ViewCompat.O(view).qie(f3));
        }
        viewPropertyAnimatorCompatSet2.J2(f13693e);
        viewPropertyAnimatorCompatSet2.O(250L);
        viewPropertyAnimatorCompatSet2.Uo(this.iF);
        this.nY = viewPropertyAnimatorCompatSet2;
        viewPropertyAnimatorCompatSet2.KN();
    }

    public void X(int i2, int i3) {
        int iS = this.J2.S();
        if ((i3 & 4) != 0) {
            this.az = true;
        }
        this.J2.xMQ((i2 & i3) | ((~i3) & iS));
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionMode XQ(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.ty;
        if (actionModeImpl != null) {
            actionModeImpl.t();
        }
        this.nr.setHideOnContentScrollEnabled(false);
        this.Uo.qie();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.Uo.getContext(), callback);
        if (!actionModeImpl2.Z()) {
            return null;
        }
        this.ty = actionModeImpl2;
        actionModeImpl2.gh();
        this.Uo.xMQ(actionModeImpl2);
        S(true);
        return actionModeImpl2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(CharSequence charSequence) {
        this.J2.setWindowTitle(charSequence);
    }

    void aYN() {
        ActionMode.Callback callback = this.ck;
        if (callback != null) {
            callback.n(this.HI);
            this.HI = null;
            this.ck = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context mUb() {
        if (this.rl == null) {
            TypedValue typedValue = new TypedValue();
            this.f13698n.getTheme().resolveAttribute(androidx.appcompat.R.attr.Uo, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.rl = new ContextThemeWrapper(this.f13698n, i2);
            } else {
                this.rl = this.f13698n;
            }
        }
        return this.rl;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void n() {
        if (this.WPU) {
            this.WPU = false;
            rV9(true);
        }
    }

    public void nHg(boolean z2) {
        if (z2 && !this.nr.aYN()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.te = z2;
        this.nr.setHideOnContentScrollEnabled(z2);
    }

    public void nY(boolean z2) {
        View view;
        View view2;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.nY;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.n();
        }
        this.f13694O.setVisibility(0);
        if (this.f13696Z == 0 && (this.f13697g || z2)) {
            this.f13694O.setTranslationY(0.0f);
            float f3 = -this.f13694O.getHeight();
            if (z2) {
                this.f13694O.getLocationInWindow(new int[]{0, 0});
                f3 -= r5[1];
            }
            this.f13694O.setTranslationY(f3);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatQie = ViewCompat.O(this.f13694O).qie(0.0f);
            viewPropertyAnimatorCompatQie.mUb(this.E2);
            viewPropertyAnimatorCompatSet2.t(viewPropertyAnimatorCompatQie);
            if (this.XQ && (view2 = this.KN) != null) {
                view2.setTranslationY(f3);
                viewPropertyAnimatorCompatSet2.t(ViewCompat.O(this.KN).qie(0.0f));
            }
            viewPropertyAnimatorCompatSet2.J2(f13692X);
            viewPropertyAnimatorCompatSet2.O(250L);
            viewPropertyAnimatorCompatSet2.Uo(this.fD);
            this.nY = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.KN();
        } else {
            this.f13694O.setAlpha(1.0f);
            this.f13694O.setTranslationY(0.0f);
            if (this.XQ && (view = this.KN) != null) {
                view.setTranslationY(0.0f);
            }
            this.fD.rl(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.nr;
        if (actionBarOverlayLayout != null) {
            ViewCompat.piY(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void nr() {
        if (this.WPU) {
            return;
        }
        this.WPU = true;
        rV9(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o(boolean z2) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f13697g = z2;
        if (z2 || (viewPropertyAnimatorCompatSet = this.nY) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.n();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i2) {
        this.f13696Z = i2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void qie(Configuration configuration) {
        N(ActionBarPolicy.rl(this.f13698n).Uo());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r(int i2) {
        this.J2.HI(i2);
    }

    public void s7N(boolean z2) {
        this.J2.ty(z2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void t(boolean z2) {
        this.XQ = z2;
    }

    public int te() {
        return this.J2.gh();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean ty(int i2, KeyEvent keyEvent) {
        Menu menuO;
        ActionModeImpl actionModeImpl = this.ty;
        if (actionModeImpl == null || (menuO = actionModeImpl.O()) == null) {
            return false;
        }
        menuO.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuO.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int xMQ() {
        return this.J2.S();
    }

    public void E2(ActionBar.Tab tab) {
        FragmentTransaction fragmentTransactionHI;
        int iNr = -1;
        if (te() != 2) {
            if (tab != null) {
                iNr = tab.nr();
            }
            this.qie = iNr;
            return;
        }
        if ((this.f13701t instanceof FragmentActivity) && !this.J2.az().isInEditMode()) {
            fragmentTransactionHI = ((FragmentActivity) this.f13701t).getSupportFragmentManager().o().HI();
        } else {
            fragmentTransactionHI = null;
        }
        TabImpl tabImpl = this.gh;
        if (tabImpl == tab) {
            if (tabImpl != null) {
                tabImpl.Uo().t(this.gh, fragmentTransactionHI);
                this.xMQ.n(tab.nr());
            }
        } else {
            ScrollingTabContainerView scrollingTabContainerView = this.xMQ;
            if (tab != null) {
                iNr = tab.nr();
            }
            scrollingTabContainerView.setTabSelected(iNr);
            TabImpl tabImpl2 = this.gh;
            if (tabImpl2 != null) {
                tabImpl2.Uo().rl(this.gh, fragmentTransactionHI);
            }
            TabImpl tabImpl3 = (TabImpl) tab;
            this.gh = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.Uo().n(this.gh, fragmentTransactionHI);
            }
        }
        if (fragmentTransactionHI != null && !fragmentTransactionHI.Ik()) {
            fragmentTransactionHI.mUb();
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        fD(dialog.getWindow().getDecorView());
    }
}
