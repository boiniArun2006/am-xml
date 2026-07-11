package androidx.appcompat.app;

import ScC.FuwU.XIvb;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import com.pairip.VMRunner;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@RestrictTo
class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f13615B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f13616C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    ViewGroup f13617D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    PopupWindow f13618E;
    final Object E2;
    private LayoutIncludeDetector EWS;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    ViewPropertyAnimatorCompat f13619FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private int f13620G7;
    private Rect GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f13621GR;
    private Rect HV;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private View f13622I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f13623J;
    private AutoNightModeManager Jk;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    Runnable f13624M;
    private PanelMenuPresenterCallback M7;
    private Configuration Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final AppCompatCallback f13625N;
    private boolean Nxk;
    private boolean Org;
    private ActionMenuPresenterCallback P5;
    private AppCompatViewInflater Po6;
    boolean Rl;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private AppCompatWindowCallback f13626T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private DecorContentParent f13627U;
    private OnBackInvokedCallback UhV;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    Window f13628X;
    MenuInflater Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f13629Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f13630a;
    boolean dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f13631e;
    ActionBarContextView eF;
    private PanelFeatureState eTf;
    private int eWT;
    private int fcU;
    private OnBackInvokedDispatcher hRu;
    private boolean ijL;
    private CharSequence jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f13632k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PanelFeatureState[] f13633m;
    private final Runnable mYa;
    private AutoNightModeManager n1;
    private boolean ofS;
    ActionMode p5;
    private boolean pJg;
    boolean piY;
    int qm;
    private boolean ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ActionBar f13634v;
    private boolean xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f13635z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final SimpleArrayMap f13614i = new SimpleArrayMap();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final boolean f13613K = false;
    private static final int[] How = {R.attr.windowBackground};
    private static final boolean tUK = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass1 implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f13636n;

        private boolean n(Throwable th) {
            String message;
            return (th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"));
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (n(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f13636n.uncaughtException(thread, notFoundException);
                return;
            }
            this.f13636n.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AppCompatDelegateImpl f13639n;

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void n(Rect rect) {
            rect.top = this.f13639n.Qu(null, rect);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void n(int i2) {
            ActionBar actionBarO = AppCompatDelegateImpl.this.o();
            if (actionBarO != null) {
                actionBarO.r(i2);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    interface ActionBarMenuCallback {
        boolean n(int i2);

        View onCreatePanelView(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void rl(MenuBuilder menuBuilder, boolean z2) {
            AppCompatDelegateImpl.this.B(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean t(MenuBuilder menuBuilder) {
            Window.Callback callbackEWT = AppCompatDelegateImpl.this.eWT();
            if (callbackEWT == null) {
                return true;
            }
            callbackEWT.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class ActionModeCallbackWrapperV9 implements ActionMode.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ActionMode.Callback f13646n;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.f13646n = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void n(ActionMode actionMode) {
            this.f13646n.n(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f13618E != null) {
                appCompatDelegateImpl.f13628X.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f13624M);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.eF != null) {
                appCompatDelegateImpl2.z();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f13619FX = ViewCompat.O(appCompatDelegateImpl3.eF).rl(0.0f);
                AppCompatDelegateImpl.this.f13619FX.Uo(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public void rl(View view) {
                        AppCompatDelegateImpl.this.eF.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl4.f13618E;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl4.eF.getParent() instanceof View) {
                            ViewCompat.piY((View) AppCompatDelegateImpl.this.eF.getParent());
                        }
                        AppCompatDelegateImpl.this.eF.qie();
                        AppCompatDelegateImpl.this.f13619FX.Uo(null);
                        AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl5.f13619FX = null;
                        ViewCompat.piY(appCompatDelegateImpl5.f13617D);
                    }
                });
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.f13625N;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.p5);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.p5 = null;
            ViewCompat.piY(appCompatDelegateImpl5.f13617D);
            AppCompatDelegateImpl.this.f();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean nr(ActionMode actionMode, Menu menu) {
            ViewCompat.piY(AppCompatDelegateImpl.this.f13617D);
            return this.f13646n.nr(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean rl(ActionMode actionMode, Menu menu) {
            return this.f13646n.rl(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean t(ActionMode actionMode, MenuItem menuItem) {
            return this.f13646n.t(actionMode, menuItem);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AppCompatWindowCallback extends WindowCallbackWrapper {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f13648O;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f13650r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ActionBarMenuCallback f13651t;

        public void nr(Window.Callback callback, int i2, Menu menu) {
            try {
                this.f13650r = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                this.f13650r = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public boolean rl(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.J2 = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.J2 = false;
            }
        }

        public void t(Window.Callback callback) {
            try {
                this.f13648O = true;
                callback.onContentChanged();
            } finally {
                this.f13648O = false;
            }
        }

        AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        final android.view.ActionMode J2(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.f13631e, callback);
            androidx.appcompat.view.ActionMode actionModeBzg = AppCompatDelegateImpl.this.bzg(callbackWrapper);
            if (actionModeBzg != null) {
                return callbackWrapper.O(actionModeBzg);
            }
            return null;
        }

        void O(ActionBarMenuCallback actionBarMenuCallback) {
            this.f13651t = actionBarMenuCallback;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.J2 ? n().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.k(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f13648O) {
                n().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            View viewOnCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.f13651t;
            return (actionBarMenuCallback == null || (viewOnCreatePanelView = actionBarMenuCallback.onCreatePanelView(i2)) == null) ? super.onCreatePanelView(i2) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            if (this.f13650r) {
                n().onPanelClosed(i2, menu);
            } else {
                super.onPanelClosed(i2, menu);
                AppCompatDelegateImpl.this.K(i2);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i2 == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.Nxk(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.f13651t;
            boolean zOnPreparePanel = actionBarMenuCallback != null && actionBarMenuCallback.n(i2);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.Nxk(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
            MenuBuilder menuBuilder;
            PanelFeatureState panelFeatureStateG7 = AppCompatDelegateImpl.this.G7(0, true);
            if (panelFeatureStateG7 == null || (menuBuilder = panelFeatureStateG7.mUb) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i2);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (AppCompatDelegateImpl.this.mYa() && i2 == 0) ? J2(callback) : super.onWindowStartingActionMode(callback, i2);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.EWS(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            AppCompatDelegateImpl.this.i(i2);
            return true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class AutoBatteryNightModeManager extends AutoNightModeManager {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final PowerManager f13652t;

        AutoBatteryNightModeManager(Context context) {
            super();
            this.f13652t = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void nr() {
            AppCompatDelegateImpl.this.M7();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter rl() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int t() {
            return Api21Impl.n(this.f13652t) ? 2 : 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RestrictTo
    @VisibleForTesting
    abstract class AutoNightModeManager {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private BroadcastReceiver f13653n;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void nr();

        abstract IntentFilter rl();

        abstract int t();

        AutoNightModeManager() {
        }

        void n() {
            BroadcastReceiver broadcastReceiver = this.f13653n;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f13631e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f13653n = null;
            }
        }

        void O() {
            n();
            IntentFilter intentFilterRl = rl();
            if (intentFilterRl != null && intentFilterRl.countActions() != 0) {
                if (this.f13653n == null) {
                    this.f13653n = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            VMRunner.invoke("7CeJ2fz0qGELcFJg", new Object[]{this, context, intent});
                        }
                    };
                }
                AppCompatDelegateImpl.this.f13631e.registerReceiver(this.f13653n, intentFilterRl);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class AutoTimeNightModeManager extends AutoNightModeManager {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final TwilightManager f13655t;

        AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.f13655t = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void nr() {
            AppCompatDelegateImpl.this.M7();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter rl() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int t() {
            return this.f13655t.nr() ? 2 : 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class ListMenuDecorView extends ContentFrameLayout {
        private boolean rl(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public ListMenuDecorView(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.k(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && rl((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.D(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(AppCompatResources.rl(getContext(), i2));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    protected static final class PanelFeatureState {
        boolean HI;
        boolean Ik = false;
        int J2;
        View KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f13656O;
        ViewGroup Uo;
        boolean az;
        public boolean ck;
        ListMenuPresenter gh;
        MenuBuilder mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13657n;
        int nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Bundle f13658o;
        Context qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f13659r;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f13660t;
        boolean ty;
        View xMQ;

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.n(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.n(parcel, classLoader);
                }
            };

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Bundle f13661O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13662n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            boolean f13663t;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            static SavedState n(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f13662n = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                savedState.f13663t = z2;
                if (z2) {
                    savedState.f13661O = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f13662n);
                parcel.writeInt(this.f13663t ? 1 : 0);
                if (this.f13663t) {
                    parcel.writeBundle(this.f13661O);
                }
            }

            SavedState() {
            }
        }

        MenuView n(MenuPresenter.Callback callback) {
            if (this.mUb == null) {
                return null;
            }
            if (this.gh == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.qie, androidx.appcompat.R.layout.qie);
                this.gh = listMenuPresenter;
                listMenuPresenter.nr(callback);
                this.mUb.rl(this.gh);
            }
            return this.gh.qie(this.Uo);
        }

        void nr(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.f13439n, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.piY, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            } else {
                themeNewTheme.applyStyle(androidx.appcompat.R.style.rl, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(themeNewTheme);
            this.qie = contextThemeWrapper;
            TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.appcompat.R.styleable.qm);
            this.rl = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.HV, 0);
            this.J2 = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Org, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean rl() {
            if (this.KN == null) {
                return false;
            }
            return this.xMQ != null || this.gh.n().getCount() > 0;
        }

        void t(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.mUb;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.U(this.gh);
            }
            this.mUb = menuBuilder;
            if (menuBuilder == null || (listMenuPresenter = this.gh) == null) {
                return;
            }
            menuBuilder.rl(listMenuPresenter);
        }

        PanelFeatureState(int i2) {
            this.f13657n = i2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void rl(MenuBuilder menuBuilder, boolean z2) {
            boolean z3;
            MenuBuilder menuBuilderE = menuBuilder.e();
            if (menuBuilderE != menuBuilder) {
                z3 = true;
            } else {
                z3 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z3) {
                menuBuilder = menuBuilderE;
            }
            PanelFeatureState panelFeatureStateM = appCompatDelegateImpl.m(menuBuilder);
            if (panelFeatureStateM != null) {
                if (z3) {
                    AppCompatDelegateImpl.this.FX(panelFeatureStateM.f13657n, panelFeatureStateM, menuBuilderE);
                    AppCompatDelegateImpl.this.a(panelFeatureStateM, true);
                } else {
                    AppCompatDelegateImpl.this.a(panelFeatureStateM, z2);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean t(MenuBuilder menuBuilder) {
            Window.Callback callbackEWT;
            if (menuBuilder == menuBuilder.e()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f13629Y && (callbackEWT = appCompatDelegateImpl.eWT()) != null && !AppCompatDelegateImpl.this.f13616C) {
                    callbackEWT.onMenuOpened(108, menuBuilder);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    private Configuration I(Context context, int i2, LocaleListCompat localeListCompat, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            a63(configuration2, localeListCompat);
        }
        return configuration2;
    }

    private boolean U(boolean z2) {
        return P5(z2, true);
    }

    private boolean tFV(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f13628X.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    void D(int i2) {
        a(G7(i2, true), true);
    }

    boolean GD(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.xg = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            Po6(0, keyEvent);
            return true;
        }
        return false;
    }

    void How(ViewGroup viewGroup) {
    }

    public boolean M7() {
        return U(true);
    }

    final int Qu(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z2;
        boolean z3;
        int iAz = windowInsetsCompat != null ? windowInsetsCompat.az() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.eF;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.eF.getLayoutParams();
            if (this.eF.isShown()) {
                if (this.HV == null) {
                    this.HV = new Rect();
                    this.GD = new Rect();
                }
                Rect rect2 = this.HV;
                Rect rect3 = this.GD;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.gh(), windowInsetsCompat.az(), windowInsetsCompat.qie(), windowInsetsCompat.mUb());
                }
                ViewUtils.n(this.f13617D, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i5 = rect2.right;
                WindowInsetsCompat windowInsetsCompatX = ViewCompat.X(this.f13617D);
                int iGh = windowInsetsCompatX == null ? 0 : windowInsetsCompatX.gh();
                int iQie = windowInsetsCompatX == null ? 0 : windowInsetsCompatX.qie();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                if (i2 <= 0 || this.f13622I != null) {
                    View view = this.f13622I;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != iGh || marginLayoutParams2.rightMargin != iQie) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = iGh;
                            marginLayoutParams2.rightMargin = iQie;
                            this.f13622I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f13631e);
                    this.f13622I = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iGh;
                    layoutParams.rightMargin = iQie;
                    this.f13617D.addView(this.f13622I, -1, layoutParams);
                }
                View view3 = this.f13622I;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    HBN(this.f13622I);
                }
                if (!this.dR0 && z) {
                    iAz = 0;
                }
                z2 = z;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z) {
                this.eF.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f13622I;
        if (view4 != null) {
            view4.setVisibility(z2 ? 0 : 8);
        }
        return iAz;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context Uo(Context context) {
        Context context2;
        this.pJg = true;
        int iOrg = Org(context, M());
        if (AppCompatDelegate.S(context)) {
            AppCompatDelegate.jB(context);
        }
        LocaleListCompat localeListCompatE = E(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            context2 = context;
            try {
                ((android.view.ContextThemeWrapper) context2).applyOverrideConfiguration(I(context2, iOrg, localeListCompatE, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context2).n(I(context2, iOrg, localeListCompatE, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!tUK) {
            return super.Uo(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationI = I(context2, iOrg, localeListCompatE, !configuration2.equals(configuration3) ? eTf(configuration2, configuration3) : null, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, androidx.appcompat.R.style.f13489t);
        contextThemeWrapper.n(configurationI);
        try {
            if (context2.getTheme() != null) {
                ResourcesCompat.ThemeCompat.n(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.Uo(contextThemeWrapper);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void aYN(Bundle bundle) {
        String strT;
        this.pJg = true;
        U(false);
        ijL();
        Object obj = this.E2;
        if (obj instanceof Activity) {
            try {
                strT = NavUtils.t((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strT = null;
            }
            if (strT != null) {
                ActionBar actionBarER = ER();
                if (actionBarER == null) {
                    this.Org = true;
                } else {
                    actionBarER.Ik(true);
                }
            }
            AppCompatDelegate.nr(this);
        }
        this.Mx = new Configuration(this.f13631e.getResources().getConfiguration());
        this.ofS = true;
    }

    void dR0(int i2) {
        PanelFeatureState panelFeatureStateG7;
        PanelFeatureState panelFeatureStateG72 = G7(i2, true);
        if (panelFeatureStateG72.mUb != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateG72.mUb.p5(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateG72.f13658o = bundle;
            }
            panelFeatureStateG72.mUb.dR0();
            panelFeatureStateG72.mUb.clear();
        }
        panelFeatureStateG72.f13659r = true;
        panelFeatureStateG72.Ik = true;
        if ((i2 != 108 && i2 != 0) || this.f13627U == null || (panelFeatureStateG7 = G7(0, false)) == null) {
            return;
        }
        panelFeatureStateG7.az = false;
        kSg(panelFeatureStateG7, null);
    }

    boolean hRu(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                UhV(0, keyEvent);
                return true;
            }
        } else if (HV()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void iF() {
        P5(true, false);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return Nxk(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void rl(MenuBuilder menuBuilder) {
        W(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void te(Bundle bundle) {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static boolean n(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        static String rl(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static void n(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        @DoNotInline
        static void nr(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.xMQ()));
        }

        @DoNotInline
        static LocaleListCompat rl(Configuration configuration) {
            return LocaleListCompat.t(configuration.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void t(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.xMQ()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RequiresApi
    static class Api26Impl {
        static void n(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RequiresApi
    static class Api33Impl {
        @DoNotInline
        static OnBackInvokedDispatcher n(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @DoNotInline
        static OnBackInvokedCallback rl(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.aC
                public final void onBackInvoked() {
                    appCompatDelegateImpl.HV();
                }
            };
            Wre.n(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @DoNotInline
        static void t(Object obj, Object obj2) {
            Wre.n(obj).unregisterOnBackInvokedCallback(I28.n(obj2));
        }
    }

    AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    private AppCompatActivity Bu() {
        for (Context baseContext = this.f13631e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private AutoNightModeManager C(Context context) {
        if (this.n1 == null) {
            this.n1 = new AutoTimeNightModeManager(TwilightManager.n(context));
        }
        return this.n1;
    }

    private ViewGroup GR() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f13631e.obtainStyledAttributes(androidx.appcompat.R.styleable.qm);
        int i2 = androidx.appcompat.R.styleable.Po6;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.lLA, false)) {
            X(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            X(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.EWS, false)) {
            X(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.hRu, false)) {
            X(10);
        }
        this.f13635z = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.mYa, false);
        typedArrayObtainStyledAttributes.recycle();
        ijL();
        this.f13628X.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13631e);
        if (this.piY) {
            viewGroup = this.dR0 ? (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.Ik, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.ck, (ViewGroup) null);
        } else if (this.f13635z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.KN, (ViewGroup) null);
            this.f13632k = false;
            this.f13629Y = false;
        } else if (this.f13629Y) {
            TypedValue typedValue = new TypedValue();
            this.f13631e.getTheme().resolveAttribute(androidx.appcompat.R.attr.J2, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(this.f13631e, typedValue.resourceId) : this.f13631e).inflate(androidx.appcompat.R.layout.f13483r, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(androidx.appcompat.R.id.Ik);
            this.f13627U = decorContentParent;
            decorContentParent.setWindowCallback(eWT());
            if (this.f13632k) {
                this.f13627U.KN(109);
            }
            if (this.f13621GR) {
                this.f13627U.KN(2);
            }
            if (this.Nxk) {
                this.f13627U.KN(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13629Y + ", windowActionBarOverlay: " + this.f13632k + ", android:windowIsFloating: " + this.f13635z + ", windowActionModeOverlay: " + this.dR0 + XIvb.LPlhW + this.piY + " }");
        }
        ViewCompat.Org(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                int iAz = windowInsetsCompat.az();
                int iQu = AppCompatDelegateImpl.this.Qu(windowInsetsCompat, null);
                if (iAz != iQu) {
                    windowInsetsCompat = windowInsetsCompat.Z(windowInsetsCompat.gh(), iQu, windowInsetsCompat.qie(), windowInsetsCompat.mUb());
                }
                return ViewCompat.B(view, windowInsetsCompat);
            }
        });
        if (this.f13627U == null) {
            this.f13630a = (TextView) viewGroup.findViewById(androidx.appcompat.R.id.nHg);
        }
        ViewUtils.t(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.rl);
        ViewGroup viewGroup2 = (ViewGroup) this.f13628X.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f13628X.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void n() {
            }

            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                AppCompatDelegateImpl.this.Y();
            }
        });
        return viewGroup;
    }

    private void J() {
        AutoNightModeManager autoNightModeManager = this.n1;
        if (autoNightModeManager != null) {
            autoNightModeManager.n();
        }
        AutoNightModeManager autoNightModeManager2 = this.Jk;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.n();
        }
    }

    private int M() {
        int i2 = this.f13620G7;
        return i2 != -100 ? i2 : AppCompatDelegate.az();
    }

    private boolean P5(boolean z2, boolean z3) {
        if (this.f13616C) {
            return false;
        }
        int iM = M();
        int iOrg = Org(this.f13631e, iM);
        LocaleListCompat localeListCompatE = Build.VERSION.SDK_INT < 33 ? E(this.f13631e) : null;
        if (!z3 && localeListCompatE != null) {
            localeListCompatE = Mx(this.f13631e.getResources().getConfiguration());
        }
        boolean zUf = Uf(iOrg, localeListCompatE, z2);
        if (iM == 0) {
            C(this.f13631e).O();
        } else {
            AutoNightModeManager autoNightModeManager = this.n1;
            if (autoNightModeManager != null) {
                autoNightModeManager.n();
            }
        }
        if (iM == 3) {
            ofS(this.f13631e).O();
            return zUf;
        }
        AutoNightModeManager autoNightModeManager2 = this.Jk;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.n();
        }
        return zUf;
    }

    private int RQ(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean Rl(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.f13631e;
        int i2 = panelFeatureState.f13657n;
        if ((i2 == 0 || i2 == 108) && this.f13627U != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(androidx.appcompat.R.attr.J2, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.Uo, typedValue, true);
            } else {
                theme.resolveAttribute(androidx.appcompat.R.attr.Uo, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.E(this);
        panelFeatureState.t(menuBuilder);
        return true;
    }

    private void T3L() {
        if (this.f13623J) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Uf(int i2, LocaleListCompat localeListCompat, boolean z2) {
        boolean z3;
        Configuration configurationI = I(this.f13631e, i2, localeListCompat, null, false);
        int iPJg = pJg(this.f13631e);
        Configuration configuration = this.Mx;
        if (configuration == null) {
            configuration = this.f13631e.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i5 = configurationI.uiMode & 48;
        LocaleListCompat localeListCompatMx = Mx(configuration);
        LocaleListCompat localeListCompatMx2 = localeListCompat == null ? null : Mx(configurationI);
        int i7 = i3 != i5 ? 512 : 0;
        if (localeListCompatMx2 != null && !localeListCompatMx.equals(localeListCompatMx2)) {
            i7 |= 8196;
        }
        boolean z4 = true;
        if (((~iPJg) & i7) != 0 && z2 && this.pJg && (tUK || this.ofS)) {
            Object obj = this.E2;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i7 & 8192) != 0) {
                    ((Activity) this.E2).getWindow().getDecorView().setLayoutDirection(configurationI.getLayoutDirection());
                }
                ActivityCompat.O((Activity) this.E2);
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z4 = z3;
        } else {
            ub(i5, localeListCompatMx2, (i7 & iPJg) == i7, null);
        }
        if (z4) {
            Object obj2 = this.E2;
            if (obj2 instanceof AppCompatActivity) {
                if ((i7 & 512) != 0) {
                    ((AppCompatActivity) obj2).onNightModeChanged(i2);
                }
                if ((i7 & 4) != 0) {
                    ((AppCompatActivity) this.E2).onLocalesChanged(localeListCompat);
                }
            }
        }
        if (localeListCompatMx2 != null) {
            F(Mx(this.f13631e.getResources().getConfiguration()));
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean UhV(int i2, KeyEvent keyEvent) {
        boolean zKSg;
        DecorContentParent decorContentParent;
        if (this.p5 != null) {
            return false;
        }
        boolean zRl = true;
        PanelFeatureState panelFeatureStateG7 = G7(i2, true);
        if (i2 != 0 || (decorContentParent = this.f13627U) == null || !decorContentParent.n() || ViewConfiguration.get(this.f13631e).hasPermanentMenuKey()) {
            boolean z2 = panelFeatureStateG7.HI;
            if (z2 || panelFeatureStateG7.ty) {
                a(panelFeatureStateG7, true);
                zRl = z2;
            } else if (panelFeatureStateG7.az) {
                if (panelFeatureStateG7.f13659r) {
                    panelFeatureStateG7.az = false;
                    zKSg = kSg(panelFeatureStateG7, keyEvent);
                } else {
                    zKSg = true;
                }
                if (zKSg) {
                    tUK(panelFeatureStateG7, keyEvent);
                }
            } else {
                zRl = false;
            }
        } else if (this.f13627U.O()) {
            zRl = this.f13627U.rl();
        } else if (!this.f13616C && kSg(panelFeatureStateG7, keyEvent)) {
            zRl = this.f13627U.t();
        }
        if (zRl) {
            AudioManager audioManager = (AudioManager) this.f13631e.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zRl;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zRl;
    }

    private void W(boolean z2) {
        DecorContentParent decorContentParent = this.f13627U;
        if (decorContentParent == null || !decorContentParent.n() || (ViewConfiguration.get(this.f13631e).hasPermanentMenuKey() && !this.f13627U.Uo())) {
            PanelFeatureState panelFeatureStateG7 = G7(0, true);
            panelFeatureStateG7.Ik = true;
            a(panelFeatureStateG7, false);
            tUK(panelFeatureStateG7, null);
            return;
        }
        Window.Callback callbackEWT = eWT();
        if (this.f13627U.O() && z2) {
            this.f13627U.rl();
            if (this.f13616C) {
                return;
            }
            callbackEWT.onPanelClosed(108, G7(0, true).mUb);
            return;
        }
        if (callbackEWT == null || this.f13616C) {
            return;
        }
        if (this.Rl && (this.qm & 1) != 0) {
            this.f13628X.getDecorView().removeCallbacks(this.mYa);
            this.mYa.run();
        }
        PanelFeatureState panelFeatureStateG72 = G7(0, true);
        MenuBuilder menuBuilder = panelFeatureStateG72.mUb;
        if (menuBuilder == null || panelFeatureStateG72.f13659r || !callbackEWT.onPreparePanel(0, panelFeatureStateG72.xMQ, menuBuilder)) {
            return;
        }
        callbackEWT.onMenuOpened(108, panelFeatureStateG72.mUb);
        this.f13627U.t();
    }

    private void eF(Window window) {
        if (this.f13628X != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.f13626T = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        TintTypedArray tintTypedArrayXQ = TintTypedArray.XQ(this.f13631e, null, How);
        Drawable drawableKN = tintTypedArrayXQ.KN(0);
        if (drawableKN != null) {
            window.setBackgroundDrawable(drawableKN);
        }
        tintTypedArrayXQ.aYN();
        this.f13628X = window;
        if (Build.VERSION.SDK_INT < 33 || this.hRu != null) {
            return;
        }
        s7N(null);
    }

    private static Configuration eTf(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f3 = configuration.fontScale;
            float f4 = configuration2.fontScale;
            if (f3 != f4) {
                configuration3.fontScale = f4;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i5 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i5 != i7) {
                configuration3.mnc = i7;
            }
            int i8 = Build.VERSION.SDK_INT;
            Api24Impl.n(configuration, configuration2, configuration3);
            int i9 = configuration.touchscreen;
            int i10 = configuration2.touchscreen;
            if (i9 != i10) {
                configuration3.touchscreen = i10;
            }
            int i11 = configuration.keyboard;
            int i12 = configuration2.keyboard;
            if (i11 != i12) {
                configuration3.keyboard = i12;
            }
            int i13 = configuration.keyboardHidden;
            int i14 = configuration2.keyboardHidden;
            if (i13 != i14) {
                configuration3.keyboardHidden = i14;
            }
            int i15 = configuration.navigation;
            int i16 = configuration2.navigation;
            if (i15 != i16) {
                configuration3.navigation = i16;
            }
            int i17 = configuration.navigationHidden;
            int i18 = configuration2.navigationHidden;
            if (i17 != i18) {
                configuration3.navigationHidden = i18;
            }
            int i19 = configuration.orientation;
            int i20 = configuration2.orientation;
            if (i19 != i20) {
                configuration3.orientation = i20;
            }
            int i21 = configuration.screenLayout & 15;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 15)) {
                configuration3.screenLayout |= i22 & 15;
            }
            int i23 = configuration.screenLayout & 192;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 192)) {
                configuration3.screenLayout |= i24 & 192;
            }
            int i25 = configuration.screenLayout & 48;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 48)) {
                configuration3.screenLayout |= i26 & 48;
            }
            int i27 = configuration.screenLayout & 768;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 768)) {
                configuration3.screenLayout |= i28 & 768;
            }
            if (i8 >= 26) {
                Api26Impl.n(configuration, configuration2, configuration3);
            }
            int i29 = configuration.uiMode & 15;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 15)) {
                configuration3.uiMode |= i30 & 15;
            }
            int i31 = configuration.uiMode & 48;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 48)) {
                configuration3.uiMode |= i32 & 48;
            }
            int i33 = configuration.screenWidthDp;
            int i34 = configuration2.screenWidthDp;
            if (i33 != i34) {
                configuration3.screenWidthDp = i34;
            }
            int i35 = configuration.screenHeightDp;
            int i36 = configuration2.screenHeightDp;
            if (i35 != i36) {
                configuration3.screenHeightDp = i36;
            }
            int i37 = configuration.smallestScreenWidthDp;
            int i38 = configuration2.smallestScreenWidthDp;
            if (i37 != i38) {
                configuration3.smallestScreenWidthDp = i38;
            }
            int i39 = configuration.densityDpi;
            int i40 = configuration2.densityDpi;
            if (i39 != i40) {
                configuration3.densityDpi = i40;
            }
        }
        return configuration3;
    }

    private void ijL() {
        if (this.f13628X == null) {
            Object obj = this.E2;
            if (obj instanceof Activity) {
                eF(((Activity) obj).getWindow());
            }
        }
        if (this.f13628X == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private boolean kSg(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f13616C) {
            return false;
        }
        if (panelFeatureState.az) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.eTf;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            a(panelFeatureState2, false);
        }
        Window.Callback callbackEWT = eWT();
        if (callbackEWT != null) {
            panelFeatureState.xMQ = callbackEWT.onCreatePanelView(panelFeatureState.f13657n);
        }
        int i2 = panelFeatureState.f13657n;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (decorContentParent3 = this.f13627U) != null) {
            decorContentParent3.J2();
        }
        if (panelFeatureState.xMQ == null && (!z2 || !(ER() instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = panelFeatureState.mUb;
            if (menuBuilder == null || panelFeatureState.f13659r) {
                if (menuBuilder == null && (!Rl(panelFeatureState) || panelFeatureState.mUb == null)) {
                    return false;
                }
                if (z2 && this.f13627U != null) {
                    if (this.P5 == null) {
                        this.P5 = new ActionMenuPresenterCallback();
                    }
                    this.f13627U.nr(panelFeatureState.mUb, this.P5);
                }
                panelFeatureState.mUb.dR0();
                if (!callbackEWT.onCreatePanelMenu(panelFeatureState.f13657n, panelFeatureState.mUb)) {
                    panelFeatureState.t(null);
                    if (z2 && (decorContentParent = this.f13627U) != null) {
                        decorContentParent.nr(null, this.P5);
                    }
                    return false;
                }
                panelFeatureState.f13659r = false;
            }
            panelFeatureState.mUb.dR0();
            Bundle bundle = panelFeatureState.f13658o;
            if (bundle != null) {
                panelFeatureState.mUb.P5(bundle);
                panelFeatureState.f13658o = null;
            }
            if (!callbackEWT.onPreparePanel(0, panelFeatureState.xMQ, panelFeatureState.mUb)) {
                if (z2 && (decorContentParent2 = this.f13627U) != null) {
                    decorContentParent2.nr(null, this.P5);
                }
                panelFeatureState.mUb.k();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.ck = z3;
            panelFeatureState.mUb.setQwertyMode(z3);
            panelFeatureState.mUb.k();
        }
        panelFeatureState.az = true;
        panelFeatureState.ty = false;
        this.eTf = panelFeatureState;
        return true;
    }

    private boolean n1(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.xMQ;
        if (view != null) {
            panelFeatureState.KN = view;
            return true;
        }
        if (panelFeatureState.mUb == null) {
            return false;
        }
        if (this.M7 == null) {
            this.M7 = new PanelMenuPresenterCallback();
        }
        View view2 = (View) panelFeatureState.n(this.M7);
        panelFeatureState.KN = view2;
        return view2 != null;
    }

    private AutoNightModeManager ofS(Context context) {
        if (this.Jk == null) {
            this.Jk = new AutoBatteryNightModeManager(context);
        }
        return this.Jk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void p0N(Configuration configuration) {
        Activity activity = (Activity) this.E2;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycleRegistry().getState().rl(Lifecycle.State.f38880O)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.ofS || this.f13616C) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private void p5() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f13617D.findViewById(R.id.content);
        View decorView = this.f13628X.getDecorView();
        contentFrameLayout.n(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f13631e.obtainStyledAttributes(androidx.appcompat.R.styleable.qm);
        typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.tUK, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.ER, contentFrameLayout.getMinWidthMinor());
        int i2 = androidx.appcompat.R.styleable.f13503K;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = androidx.appcompat.R.styleable.How;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i5 = androidx.appcompat.R.styleable.UhV;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMajor());
        }
        int i7 = androidx.appcompat.R.styleable.f13526i;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            typedArrayObtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int pJg(Context context) {
        if (!this.ul && (this.E2 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.E2.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.eWT = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.eWT = 0;
            }
        }
        this.ul = true;
        return this.eWT;
    }

    private void piY() {
        if (this.f13623J) {
            return;
        }
        this.f13617D = GR();
        CharSequence charSequenceFcU = fcU();
        if (!TextUtils.isEmpty(charSequenceFcU)) {
            DecorContentParent decorContentParent = this.f13627U;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(charSequenceFcU);
            } else if (ER() != null) {
                ER().Z(charSequenceFcU);
            } else {
                TextView textView = this.f13630a;
                if (textView != null) {
                    textView.setText(charSequenceFcU);
                }
            }
        }
        p5();
        How(this.f13617D);
        this.f13623J = true;
        PanelFeatureState panelFeatureStateG7 = G7(0, false);
        if (this.f13616C) {
            return;
        }
        if (panelFeatureStateG7 == null || panelFeatureStateG7.mUb == null) {
            qm(108);
        }
    }

    private void qm(int i2) {
        this.qm = (1 << i2) | this.qm;
        if (this.Rl) {
            return;
        }
        ViewCompat.Nxk(this.f13628X.getDecorView(), this.mYa);
        this.Rl = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void tUK(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.HI || this.f13616C) {
            return;
        }
        if (panelFeatureState.f13657n == 0 && (this.f13631e.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackEWT = eWT();
        if (callbackEWT != null && !callbackEWT.onMenuOpened(panelFeatureState.f13657n, panelFeatureState.mUb)) {
            a(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f13631e.getSystemService("window");
        if (windowManager == null || !kSg(panelFeatureState, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = panelFeatureState.Uo;
        if (viewGroup != null && !panelFeatureState.Ik) {
            View view = panelFeatureState.xMQ;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
            }
            panelFeatureState.ty = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.nr, panelFeatureState.f13656O, 1002, 8519680, -3);
            layoutParams2.gravity = panelFeatureState.f13660t;
            layoutParams2.windowAnimations = panelFeatureState.J2;
            windowManager.addView(panelFeatureState.Uo, layoutParams2);
            panelFeatureState.HI = true;
            if (panelFeatureState.f13657n != 0) {
                f();
                return;
            }
            return;
        }
        if (viewGroup == null) {
            if (!Jk(panelFeatureState) || panelFeatureState.Uo == null) {
                return;
            }
        } else if (panelFeatureState.Ik && viewGroup.getChildCount() > 0) {
            panelFeatureState.Uo.removeAllViews();
        }
        if (!n1(panelFeatureState) || !panelFeatureState.rl()) {
            panelFeatureState.Ik = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = panelFeatureState.KN.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        }
        panelFeatureState.Uo.setBackgroundResource(panelFeatureState.rl);
        ViewParent parent = panelFeatureState.KN.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(panelFeatureState.KN);
        }
        panelFeatureState.Uo.addView(panelFeatureState.KN, layoutParams3);
        if (!panelFeatureState.KN.hasFocus()) {
            panelFeatureState.KN.requestFocus();
        }
        i2 = -2;
        panelFeatureState.ty = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.nr, panelFeatureState.f13656O, 1002, 8519680, -3);
        layoutParams22.gravity = panelFeatureState.f13660t;
        layoutParams22.windowAnimations = panelFeatureState.J2;
        windowManager.addView(panelFeatureState.Uo, layoutParams22);
        panelFeatureState.HI = true;
        if (panelFeatureState.f13657n != 0) {
        }
    }

    private void ub(int i2, LocaleListCompat localeListCompat, boolean z2, Configuration configuration) {
        Resources resources = this.f13631e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            a63(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            ResourcesFlusher.n(resources);
        }
        int i3 = this.fcU;
        if (i3 != 0) {
            this.f13631e.setTheme(i3);
            this.f13631e.getTheme().applyStyle(this.fcU, true);
        }
        if (z2 && (this.E2 instanceof Activity)) {
            p0N(configuration2);
        }
    }

    void B(MenuBuilder menuBuilder) {
        if (this.ijL) {
            return;
        }
        this.ijL = true;
        this.f13627U.qie();
        Window.Callback callbackEWT = eWT();
        if (callbackEWT != null && !this.f13616C) {
            callbackEWT.onPanelClosed(108, menuBuilder);
        }
        this.ijL = false;
    }

    LocaleListCompat E(Context context) {
        LocaleListCompat localeListCompatR;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompatR = AppCompatDelegate.r()) == null) {
            return null;
        }
        LocaleListCompat localeListCompatMx = Mx(context.getApplicationContext().getResources().getConfiguration());
        LocaleListCompat localeListCompatRl = LocaleOverlayHelper.rl(localeListCompatR, localeListCompatMx);
        return localeListCompatRl.Uo() ? localeListCompatMx : localeListCompatRl;
    }

    final ActionBar ER() {
        return this.f13634v;
    }

    void FX(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f13633m;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.mUb;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.HI) && !this.f13616C) {
            this.f13626T.nr(this.f13628X.getCallback(), i2, menu);
        }
    }

    protected PanelFeatureState G7(int i2, boolean z2) {
        PanelFeatureState[] panelFeatureStateArr = this.f13633m;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f13633m = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int HI() {
        return this.f13620G7;
    }

    boolean HV() {
        boolean z2 = this.xg;
        this.xg = false;
        PanelFeatureState panelFeatureStateG7 = G7(0, false);
        if (panelFeatureStateG7 != null && panelFeatureStateG7.HI) {
            if (!z2) {
                a(panelFeatureStateG7, true);
            }
            return true;
        }
        androidx.appcompat.view.ActionMode actionMode = this.p5;
        if (actionMode != null) {
            actionMode.t();
            return true;
        }
        ActionBar actionBarO = o();
        return actionBarO != null && actionBarO.Uo();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater Ik() {
        if (this.Xw == null) {
            ul();
            ActionBar actionBar = this.f13634v;
            this.Xw = new SupportMenuInflater(actionBar != null ? actionBar.mUb() : this.f13631e);
        }
        return this.Xw;
    }

    void K(int i2) {
        if (i2 == 108) {
            ActionBar actionBarO = o();
            if (actionBarO != null) {
                actionBarO.KN(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            PanelFeatureState panelFeatureStateG7 = G7(i2, true);
            if (panelFeatureStateG7.HI) {
                a(panelFeatureStateG7, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View Nxk(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean zTFV = false;
        if (this.Po6 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f13631e.obtainStyledAttributes(androidx.appcompat.R.styleable.qm);
            String string = typedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.GD);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.Po6 = new AppCompatViewInflater();
            } else {
                try {
                    this.Po6 = (AppCompatViewInflater) this.f13631e.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.Po6 = new AppCompatViewInflater();
                }
            }
        }
        boolean z3 = f13613K;
        if (z3) {
            if (this.EWS == null) {
                this.EWS = new LayoutIncludeDetector();
            }
            if (this.EWS.n(attributeSet)) {
                z2 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zTFV = tFV((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zTFV = true;
                }
                z2 = zTFV;
            }
        } else {
            z2 = zTFV;
        }
        return this.Po6.r(view, str, context, attributeSet, z2, z3, true, VectorEnabledTintResources.t());
    }

    int Org(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return C(context).t();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return ofS(context).t();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    final boolean QZ6() {
        ViewGroup viewGroup;
        return this.f13623J && (viewGroup = this.f13617D) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ViF() {
        if (this.E2 instanceof Activity) {
            AppCompatDelegate.E2(this);
        }
        if (this.Rl) {
            this.f13628X.getDecorView().removeCallbacks(this.mYa);
        }
        this.f13616C = true;
        if (this.f13620G7 != -100) {
            Object obj = this.E2;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f13614i.put(this.E2.getClass().getName(), Integer.valueOf(this.f13620G7));
            } else {
                f13614i.remove(this.E2.getClass().getName());
            }
        }
        ActionBar actionBar = this.f13634v;
        if (actionBar != null) {
            actionBar.az();
        }
        J();
    }

    boolean VwL() {
        if (this.hRu == null) {
            return false;
        }
        PanelFeatureState panelFeatureStateG7 = G7(0, false);
        return (panelFeatureStateG7 != null && panelFeatureStateG7.HI) || this.p5 != null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void WPU(Configuration configuration) {
        ActionBar actionBarO;
        if (this.f13629Y && this.f13623J && (actionBarO = o()) != null) {
            actionBarO.qie(configuration);
        }
        AppCompatDrawableManager.rl().Uo(this.f13631e);
        this.Mx = new Configuration(this.f13631e.getResources().getConfiguration());
        P5(false, false);
    }

    void Y() {
        MenuBuilder menuBuilder;
        DecorContentParent decorContentParent = this.f13627U;
        if (decorContentParent != null) {
            decorContentParent.qie();
        }
        if (this.f13618E != null) {
            this.f13628X.getDecorView().removeCallbacks(this.f13624M);
            if (this.f13618E.isShowing()) {
                try {
                    this.f13618E.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f13618E = null;
        }
        z();
        PanelFeatureState panelFeatureStateG7 = G7(0, false);
        if (panelFeatureStateG7 == null || (menuBuilder = panelFeatureStateG7.mUb) == null) {
            return;
        }
        menuBuilder.close();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void Z() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13631e);
        if (layoutInflaterFrom.getFactory() == null) {
            LayoutInflaterCompat.n(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    void a(PanelFeatureState panelFeatureState, boolean z2) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z2 && panelFeatureState.f13657n == 0 && (decorContentParent = this.f13627U) != null && decorContentParent.O()) {
            B(panelFeatureState.mUb);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f13631e.getSystemService("window");
        if (windowManager != null && panelFeatureState.HI && (viewGroup = panelFeatureState.Uo) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                FX(panelFeatureState.f13657n, panelFeatureState, null);
            }
        }
        panelFeatureState.az = false;
        panelFeatureState.ty = false;
        panelFeatureState.HI = false;
        panelFeatureState.KN = null;
        panelFeatureState.Ik = true;
        if (this.eTf == panelFeatureState) {
            this.eTf = null;
        }
        if (panelFeatureState.f13657n == 0) {
            f();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.view.ActionMode bzg(ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.ActionMode actionMode = this.p5;
        if (actionMode != null) {
            actionMode.t();
        }
        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
        ActionBar actionBarO = o();
        if (actionBarO != null) {
            androidx.appcompat.view.ActionMode actionModeXQ = actionBarO.XQ(actionModeCallbackWrapperV9);
            this.p5 = actionModeXQ;
            if (actionModeXQ != null && (appCompatCallback = this.f13625N) != null) {
                appCompatCallback.onSupportActionModeStarted(actionModeXQ);
            }
        }
        if (this.p5 == null) {
            this.p5 = mI(actionModeCallbackWrapperV9);
        }
        f();
        return this.p5;
    }

    final Window.Callback eWT() {
        return this.f13628X.getCallback();
    }

    void f() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zVwL = VwL();
            if (zVwL && this.UhV == null) {
                this.UhV = Api33Impl.rl(this.hRu, this);
            } else {
                if (zVwL || (onBackInvokedCallback = this.UhV) == null) {
                    return;
                }
                Api33Impl.t(this.hRu, onBackInvokedCallback);
                this.UhV = null;
            }
        }
    }

    final CharSequence fcU() {
        Object obj = this.E2;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.jB;
    }

    void i(int i2) {
        ActionBar actionBarO;
        if (i2 != 108 || (actionBarO = o()) == null) {
            return;
        }
        actionBarO.KN(true);
    }

    boolean k(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.E2;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.f13628X.getDecorView()) != null && KeyEventDispatcher.nr(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f13626T.rl(this.f13628X.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? GD(keyCode, keyEvent) : hRu(keyCode, keyEvent);
    }

    PanelFeatureState m(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f13633m;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.mUb == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public boolean mYa() {
        return this.f13615B;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context qie() {
        return this.f13631e;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void rV9(CharSequence charSequence) {
        this.jB = charSequence;
        DecorContentParent decorContentParent = this.f13627U;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (ER() != null) {
            ER().Z(charSequence);
            return;
        }
        TextView textView = this.f13630a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate ty() {
        return new ActionBarDrawableToggleImpl();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void v(int i2) {
        this.fcU = i2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void wTp(Toolbar toolbar) {
        if (this.E2 instanceof Activity) {
            ActionBar actionBarO = o();
            if (actionBarO instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.Xw = null;
            if (actionBarO != null) {
                actionBarO.az();
            }
            this.f13634v = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, fcU(), this.f13626T);
                this.f13634v = toolbarActionBar;
                this.f13626T.O(toolbarActionBar.f13680t);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f13626T.O(null);
            }
            XQ();
        }
    }

    void z() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f13619FX;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.t();
        }
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity appCompatActivityBu;
        this.f13619FX = null;
        this.f13615B = true;
        this.f13620G7 = -100;
        this.mYa = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl.qm & 1) != 0) {
                    appCompatDelegateImpl.dR0(0);
                }
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl2.qm & 4096) != 0) {
                    appCompatDelegateImpl2.dR0(108);
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.Rl = false;
                appCompatDelegateImpl3.qm = 0;
            }
        };
        this.f13631e = context;
        this.f13625N = appCompatCallback;
        this.E2 = obj;
        if (this.f13620G7 == -100 && (obj instanceof Dialog) && (appCompatActivityBu = Bu()) != null) {
            this.f13620G7 = appCompatActivityBu.getDelegate().HI();
        }
        if (this.f13620G7 == -100) {
            SimpleArrayMap simpleArrayMap = f13614i;
            Integer num = (Integer) simpleArrayMap.get(obj.getClass().getName());
            if (num != null) {
                this.f13620G7 = num.intValue();
                simpleArrayMap.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            eF(window);
        }
        AppCompatDrawableManager.KN();
    }

    private void HBN(View view) {
        int color;
        if ((ViewCompat.wTp(view) & 8192) != 0) {
            color = ContextCompat.getColor(this.f13631e, androidx.appcompat.R.color.rl);
        } else {
            color = ContextCompat.getColor(this.f13631e, androidx.appcompat.R.color.f13447n);
        }
        view.setBackgroundColor(color);
    }

    private boolean Jk(PanelFeatureState panelFeatureState) {
        panelFeatureState.nr(xg());
        panelFeatureState.Uo = new ListMenuDecorView(panelFeatureState.qie);
        panelFeatureState.f13660t = 81;
        return true;
    }

    private boolean Po6(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState panelFeatureStateG7 = G7(i2, true);
            if (!panelFeatureStateG7.HI) {
                return kSg(panelFeatureStateG7, keyEvent);
            }
            return false;
        }
        return false;
    }

    private boolean lLA(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        MenuBuilder menuBuilder;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.az || kSg(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.mUb) != null) {
            zPerformShortcut = menuBuilder.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f13627U == null) {
            a(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private void ul() {
        piY();
        if (this.f13629Y && this.f13634v == null) {
            Object obj = this.E2;
            if (obj instanceof Activity) {
                this.f13634v = new WindowDecorActionBar((Activity) this.E2, this.f13632k);
            } else if (obj instanceof Dialog) {
                this.f13634v = new WindowDecorActionBar((Dialog) this.E2);
            }
            ActionBar actionBar = this.f13634v;
            if (actionBar != null) {
                actionBar.Ik(this.Org);
            }
        }
    }

    boolean EWS(int i2, KeyEvent keyEvent) {
        ActionBar actionBarO = o();
        if (actionBarO != null && actionBarO.ty(i2, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.eTf;
        if (panelFeatureState != null && lLA(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.eTf;
            if (panelFeatureState2 != null) {
                panelFeatureState2.ty = true;
            }
            return true;
        }
        if (this.eTf == null) {
            PanelFeatureState panelFeatureStateG7 = G7(0, true);
            kSg(panelFeatureStateG7, keyEvent);
            boolean zLLA = lLA(panelFeatureStateG7, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateG7.az = false;
            if (zLLA) {
                return true;
            }
        }
        return false;
    }

    void F(LocaleListCompat localeListCompat) {
        Api24Impl.t(localeListCompat);
    }

    LocaleListCompat Mx(Configuration configuration) {
        return Api24Impl.rl(configuration);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void N(View view) {
        piY();
        ViewGroup viewGroup = (ViewGroup) this.f13617D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13626T.t(this.f13628X.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void O(View view, ViewGroup.LayoutParams layoutParams) {
        piY();
        ((ViewGroup) this.f13617D.findViewById(R.id.content)).addView(view, layoutParams);
        this.f13626T.t(this.f13628X.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void T(int i2) {
        piY();
        ViewGroup viewGroup = (ViewGroup) this.f13617D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13631e).inflate(i2, viewGroup);
        this.f13626T.t(this.f13628X.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean X(int i2) {
        int iRQ = RQ(i2);
        if (this.piY && iRQ == 108) {
            return false;
        }
        if (this.f13629Y && iRQ == 1) {
            this.f13629Y = false;
        }
        if (iRQ != 1) {
            if (iRQ != 2) {
                if (iRQ != 5) {
                    if (iRQ != 10) {
                        if (iRQ != 108) {
                            if (iRQ != 109) {
                                return this.f13628X.requestFeature(iRQ);
                            }
                            T3L();
                            this.f13632k = true;
                            return true;
                        }
                        T3L();
                        this.f13629Y = true;
                        return true;
                    }
                    T3L();
                    this.dR0 = true;
                    return true;
                }
                T3L();
                this.Nxk = true;
                return true;
            }
            T3L();
            this.f13621GR = true;
            return true;
        }
        T3L();
        this.piY = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void XQ() {
        if (ER() != null && !o().gh()) {
            qm(0);
        }
    }

    void a63(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.nr(configuration, localeListCompat);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void fD() {
        ActionBar actionBarO = o();
        if (actionBarO != null) {
            actionBarO.o(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void g() {
        ActionBar actionBarO = o();
        if (actionBarO != null) {
            actionBarO.o(true);
        }
    }

    androidx.appcompat.view.ActionMode mI(ActionMode.Callback callback) {
        androidx.appcompat.view.ActionMode actionModeOnWindowStartingSupportActionMode;
        Context contextThemeWrapper;
        AppCompatCallback appCompatCallback;
        z();
        androidx.appcompat.view.ActionMode actionMode = this.p5;
        if (actionMode != null) {
            actionMode.t();
        }
        if (!(callback instanceof ActionModeCallbackWrapperV9)) {
            callback = new ActionModeCallbackWrapperV9(callback);
        }
        AppCompatCallback appCompatCallback2 = this.f13625N;
        if (appCompatCallback2 != null && !this.f13616C) {
            try {
                actionModeOnWindowStartingSupportActionMode = appCompatCallback2.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError unused) {
                actionModeOnWindowStartingSupportActionMode = null;
            }
        } else {
            actionModeOnWindowStartingSupportActionMode = null;
        }
        if (actionModeOnWindowStartingSupportActionMode != null) {
            this.p5 = actionModeOnWindowStartingSupportActionMode;
        } else {
            boolean z2 = true;
            if (this.eF == null) {
                if (this.f13635z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f13631e.getTheme();
                    theme.resolveAttribute(androidx.appcompat.R.attr.J2, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f13631e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        contextThemeWrapper = new ContextThemeWrapper(this.f13631e, 0);
                        contextThemeWrapper.getTheme().setTo(themeNewTheme);
                    } else {
                        contextThemeWrapper = this.f13631e;
                    }
                    this.eF = new ActionBarContextView(contextThemeWrapper);
                    PopupWindow popupWindow = new PopupWindow(contextThemeWrapper, (AttributeSet) null, androidx.appcompat.R.attr.xMQ);
                    this.f13618E = popupWindow;
                    PopupWindowCompat.rl(popupWindow, 2);
                    this.f13618E.setContentView(this.eF);
                    this.f13618E.setWidth(-1);
                    contextThemeWrapper.getTheme().resolveAttribute(androidx.appcompat.R.attr.rl, typedValue, true);
                    this.eF.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, contextThemeWrapper.getResources().getDisplayMetrics()));
                    this.f13618E.setHeight(-2);
                    this.f13624M = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                            appCompatDelegateImpl.f13618E.showAtLocation(appCompatDelegateImpl.eF, 55, 0, 0);
                            AppCompatDelegateImpl.this.z();
                            if (!AppCompatDelegateImpl.this.QZ6()) {
                                AppCompatDelegateImpl.this.eF.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.eF.setVisibility(0);
                            } else {
                                AppCompatDelegateImpl.this.eF.setAlpha(0.0f);
                                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                                appCompatDelegateImpl2.f13619FX = ViewCompat.O(appCompatDelegateImpl2.eF).rl(1.0f);
                                AppCompatDelegateImpl.this.f13619FX.Uo(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6.1
                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public void rl(View view) {
                                        AppCompatDelegateImpl.this.eF.setAlpha(1.0f);
                                        AppCompatDelegateImpl.this.f13619FX.Uo(null);
                                        AppCompatDelegateImpl.this.f13619FX = null;
                                    }

                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public void t(View view) {
                                        AppCompatDelegateImpl.this.eF.setVisibility(0);
                                    }
                                });
                            }
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f13617D.findViewById(androidx.appcompat.R.id.KN);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(xg()));
                        this.eF = (ActionBarContextView) viewStubCompat.n();
                    }
                }
            }
            if (this.eF != null) {
                z();
                this.eF.qie();
                Context context = this.eF.getContext();
                ActionBarContextView actionBarContextView = this.eF;
                if (this.f13618E != null) {
                    z2 = false;
                }
                StandaloneActionMode standaloneActionMode = new StandaloneActionMode(context, actionBarContextView, callback, z2);
                if (callback.rl(standaloneActionMode, standaloneActionMode.O())) {
                    standaloneActionMode.gh();
                    this.eF.xMQ(standaloneActionMode);
                    this.p5 = standaloneActionMode;
                    if (QZ6()) {
                        this.eF.setAlpha(0.0f);
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatRl = ViewCompat.O(this.eF).rl(1.0f);
                        this.f13619FX = viewPropertyAnimatorCompatRl;
                        viewPropertyAnimatorCompatRl.Uo(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                            public void rl(View view) {
                                AppCompatDelegateImpl.this.eF.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.f13619FX.Uo(null);
                                AppCompatDelegateImpl.this.f13619FX = null;
                            }

                            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                            public void t(View view) {
                                AppCompatDelegateImpl.this.eF.setVisibility(0);
                                if (AppCompatDelegateImpl.this.eF.getParent() instanceof View) {
                                    ViewCompat.piY((View) AppCompatDelegateImpl.this.eF.getParent());
                                }
                            }
                        });
                    } else {
                        this.eF.setAlpha(1.0f);
                        this.eF.setVisibility(0);
                        if (this.eF.getParent() instanceof View) {
                            ViewCompat.piY((View) this.eF.getParent());
                        }
                    }
                    if (this.f13618E != null) {
                        this.f13628X.getDecorView().post(this.f13624M);
                    }
                } else {
                    this.p5 = null;
                }
            }
        }
        androidx.appcompat.view.ActionMode actionMode2 = this.p5;
        if (actionMode2 != null && (appCompatCallback = this.f13625N) != null) {
            appCompatCallback.onSupportActionModeStarted(actionMode2);
        }
        f();
        return this.p5;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View mUb(int i2) {
        piY();
        return this.f13628X.findViewById(i2);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateM;
        Window.Callback callbackEWT = eWT();
        if (callbackEWT != null && !this.f13616C && (panelFeatureStateM = m(menuBuilder.e())) != null) {
            return callbackEWT.onMenuItemSelected(panelFeatureStateM.f13657n, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void nHg(View view, ViewGroup.LayoutParams layoutParams) {
        piY();
        ViewGroup viewGroup = (ViewGroup) this.f13617D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13626T.t(this.f13628X.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void nY(Bundle bundle) {
        piY();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar o() {
        ul();
        return this.f13634v;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s7N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.s7N(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.hRu;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.UhV) != null) {
            Api33Impl.t(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.UhV = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.E2;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.hRu = Api33Impl.n((Activity) this.E2);
            } else {
                this.hRu = onBackInvokedDispatcher;
            }
        }
        f();
    }

    final Context xg() {
        Context contextMUb;
        ActionBar actionBarO = o();
        if (actionBarO != null) {
            contextMUb = actionBarO.mUb();
        } else {
            contextMUb = null;
        }
        if (contextMUb == null) {
            return this.f13631e;
        }
        return contextMUb;
    }
}
