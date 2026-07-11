package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ViewCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static WeakHashMap f36766n;
    private static Field rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f36767t;
    private static final int[] nr = {R.id.rl, R.id.f36171t, R.id.ty, R.id.ViF, R.id.te, R.id.iF, R.id.fD, R.id.E2, R.id.f36165e, R.id.f36161X, R.id.nr, R.id.f36157O, R.id.J2, R.id.Uo, R.id.KN, R.id.xMQ, R.id.mUb, R.id.gh, R.id.qie, R.id.az, R.id.HI, R.id.ck, R.id.Ik, R.id.f36170r, R.id.f36169o, R.id.f36163Z, R.id.XQ, R.id.f36158S, R.id.WPU, R.id.aYN, R.id.nY, R.id.f36166g};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final OnReceiveContentViewBehavior f36765O = new OnReceiveContentViewBehavior() { // from class: androidx.core.view.UGc
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            return ViewCompat.n(contentInfoCompat);
        }
    };
    private static final AccessibilityPaneVisibilityManager J2 = new AccessibilityPaneVisibilityManager();

    static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakHashMap f36768n = new WeakHashMap();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        void n(View view) {
            this.f36768n.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                t(view);
            }
        }

        void nr(View view) {
            this.f36768n.remove(view);
            view.removeOnAttachStateChangeListener(this);
            O(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f36768n.entrySet().iterator();
                while (it.hasNext()) {
                    rl((Map.Entry) it.next());
                }
            }
        }

        AccessibilityPaneVisibilityManager() {
        }

        private void O(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        private void rl(Map.Entry entry) {
            boolean z2;
            int i2;
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (zBooleanValue != z2) {
                if (z2) {
                    i2 = 16;
                } else {
                    i2 = 32;
                }
                ViewCompat.E(view, i2);
                entry.setValue(Boolean.valueOf(z2));
            }
        }

        private void t(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            t(view);
        }
    }

    static abstract class AccessibilityViewProperty<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f36769n;
        private final int nr;
        private final Class rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36770t;

        AccessibilityViewProperty(int i2, Class cls, int i3) {
            this(i2, cls, 0, i3);
        }

        boolean n(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract void nr(View view, Object obj);

        abstract Object t(View view);

        AccessibilityViewProperty(int i2, Class cls, int i3, int i5) {
            this.f36769n = i2;
            this.rl = cls;
            this.nr = i3;
            this.f36770t = i5;
        }

        private boolean rl() {
            return Build.VERSION.SDK_INT >= this.f36770t;
        }

        void J2(View view, Object obj) {
            if (rl()) {
                nr(view, obj);
            } else if (Uo(O(view), obj)) {
                ViewCompat.mUb(view);
                view.setTag(this.f36769n, obj);
                ViewCompat.E(view, this.nr);
            }
        }

        Object O(View view) {
            if (rl()) {
                return t(view);
            }
            Object tag = view.getTag(this.f36769n);
            if (this.rl.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        boolean Uo(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }
    }

    @RequiresApi
    static class Api20Impl {
        static WindowInsets n(View view, WindowInsets windowInsets) {
            return ViewGroupCompat.rl ? ViewGroupCompat.rl(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets rl(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void t(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi
    private static class Api21Impl {
        static void n(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.f36153I);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static void ty(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener != null ? new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                WindowInsetsCompat f36771n = null;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsetsCompat windowInsetsCompatTe = WindowInsetsCompat.te(windowInsets, view2);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 30) {
                        Api21Impl.n(windowInsets, view);
                        if (windowInsetsCompatTe.equals(this.f36771n)) {
                            return onApplyWindowInsetsListener.n(view2, windowInsetsCompatTe).nY();
                        }
                    }
                    this.f36771n = windowInsetsCompatTe;
                    WindowInsetsCompat windowInsetsCompatN = onApplyWindowInsetsListener.n(view2, windowInsetsCompatTe);
                    if (i2 >= 30) {
                        return windowInsetsCompatN.nY();
                    }
                    ViewCompat.piY(view2);
                    return windowInsetsCompatN.nY();
                }
            } : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.eF, onApplyWindowInsetsListener2);
            }
            if (view.getTag(R.id.p5) != null) {
                return;
            }
            if (onApplyWindowInsetsListener2 != null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener2);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.f36153I));
            }
        }

        static void HI(View view, String str) {
            view.setTransitionName(str);
        }

        static void Ik(View view, float f3) {
            view.setZ(f3);
        }

        static String J2(View view) {
            return view.getTransitionName();
        }

        static float KN(View view) {
            return view.getZ();
        }

        static float O(View view) {
            return view.getElevation();
        }

        static float Uo(View view) {
            return view.getTranslationZ();
        }

        static void az(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        static void ck(View view, float f3) {
            view.setTranslationZ(f3);
        }

        static void gh(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void mUb(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static PorterDuff.Mode nr(View view) {
            return view.getBackgroundTintMode();
        }

        static void qie(View view, float f3) {
            view.setElevation(f3);
        }

        static void r(View view) {
            view.stopNestedScroll();
        }

        static WindowInsetsCompat rl(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsNY = windowInsetsCompat.nY();
            if (windowInsetsNY != null) {
                return WindowInsetsCompat.te(view.computeSystemWindowInsets(windowInsetsNY, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static ColorStateList t(View view) {
            return view.getBackgroundTintList();
        }

        static boolean xMQ(View view) {
            return view.isNestedScrollingEnabled();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean n(View view, KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollIndicators {
    }

    static class UnhandledKeyEventManager {
        private static final ArrayList nr = new ArrayList();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private WeakHashMap f36774n = null;
        private SparseArray rl = null;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private WeakReference f36775t = null;

        private boolean O(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.f36164a);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).n(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void Uo() {
            WeakHashMap weakHashMap = this.f36774n;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = nr;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f36774n == null) {
                        this.f36774n = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = nr;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f36774n.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f36774n.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static UnhandledKeyEventManager n(View view) {
            int i2 = R.id.f36149D;
            UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(i2);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            UnhandledKeyEventManager unhandledKeyEventManager2 = new UnhandledKeyEventManager();
            view.setTag(i2, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        private SparseArray nr() {
            if (this.rl == null) {
                this.rl = new SparseArray();
            }
            return this.rl;
        }

        private View t(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f36774n;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewT = t(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewT != null) {
                            return viewT;
                        }
                    }
                }
                if (O(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        boolean J2(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f36775t;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f36775t = new WeakReference(keyEvent);
            SparseArray sparseArrayNr = nr();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayNr.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayNr.valueAt(iIndexOfKey);
                sparseArrayNr.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayNr.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                O(view, keyEvent);
            }
            return true;
        }

        UnhandledKeyEventManager() {
        }

        boolean rl(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                Uo();
            }
            View viewT = t(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewT != null && !KeyEvent.isModifierKey(keyCode)) {
                    nr().put(keyCode, new WeakReference(viewT));
                }
            }
            if (viewT != null) {
                return true;
            }
            return false;
        }
    }

    public static ContentInfoCompat I(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.rl(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.f36150E);
        if (onReceiveContentListener == null) {
            return S(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatN = onReceiveContentListener.n(view, contentInfoCompat);
        if (contentInfoCompatN == null) {
            return null;
        }
        return S(view).onReceiveContent(contentInfoCompatN);
    }

    public static /* synthetic */ ContentInfoCompat n(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    @RequiresApi
    private static class Api23Impl {
        public static WindowInsetsCompat n(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(rootWindowInsets);
            windowInsetsCompatG.WPU(windowInsetsCompatG);
            windowInsetsCompatG.nr(view.getRootView());
            return windowInsetsCompatG;
        }

        static void rl(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    @RequiresApi
    static class Api24Impl {
        static void n(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    @RequiresApi
    static class Api26Impl {
        static int n(View view) {
            return view.getImportantForAutofill();
        }

        static void rl(View view, int i2) {
            view.setImportantForAutofill(i2);
        }
    }

    @RequiresApi
    static class Api28Impl {
        static void J2(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }

        static void O(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static CharSequence n(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static void nr(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        static boolean rl(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean t(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    @RequiresApi
    private static class Api29Impl {
        static View.AccessibilityDelegate n(View view) {
            return view.getAccessibilityDelegate();
        }

        static void rl(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @RequiresApi
    private static class Api30Impl {
        static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static void nr(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        static CharSequence rl(View view) {
            return view.getStateDescription();
        }

        public static WindowInsetsControllerCompat t(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.J2(windowInsetsController);
            }
            return null;
        }
    }

    @RequiresApi
    private static final class Api31Impl {
        public static String[] n(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat rl(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoJ2 = contentInfoCompat.J2();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoJ2);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            if (contentInfoPerformReceiveContent == contentInfoJ2) {
                return contentInfoCompat;
            }
            return ContentInfoCompat.Uo(contentInfoPerformReceiveContent);
        }
    }

    @RequiresApi
    private static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final OnReceiveContentListener f36773n;

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompatUo = ContentInfoCompat.Uo(contentInfo);
            ContentInfoCompat contentInfoCompatN = this.f36773n.n(view, contentInfoCompatUo);
            if (contentInfoCompatN == null) {
                return null;
            }
            if (contentInfoCompatN == contentInfoCompatUo) {
                return contentInfo;
            }
            return contentInfoCompatN.J2();
        }
    }

    private static AccessibilityViewProperty D() {
        return new AccessibilityViewProperty<CharSequence>(R.id.M7, CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public CharSequence t(View view) {
                return Api28Impl.n(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
            public boolean Uo(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
            public void nr(View view, CharSequence charSequence) {
                Api28Impl.O(view, charSequence);
            }
        };
    }

    public static void GD(View view, PointerIconCompat pointerIconCompat) {
        Api24Impl.n(view, (PointerIcon) (pointerIconCompat != null ? pointerIconCompat.n() : null));
    }

    public static void Jk(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.rl(view, i2);
        }
    }

    static boolean KN(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.n(view).rl(view, keyEvent);
    }

    public static ViewPropertyAnimatorCompat O(View view) {
        if (f36766n == null) {
            f36766n = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f36766n.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f36766n.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static OnReceiveContentViewBehavior S(View view) {
        return view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f36765O;
    }

    public static WindowInsetsCompat Uo(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsNY = windowInsetsCompat.nY();
        if (windowInsetsNY != null) {
            WindowInsets windowInsetsN = i2 >= 30 ? Api30Impl.n(view, windowInsetsNY) : Api20Impl.n(view, windowInsetsNY);
            if (!windowInsetsN.equals(windowInsetsNY)) {
                return WindowInsetsCompat.te(windowInsetsN, view);
            }
        }
        return windowInsetsCompat;
    }

    public static int ViF(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.n(view);
        }
        return 0;
    }

    private static View.AccessibilityDelegate az(View view) {
        return Build.VERSION.SDK_INT >= 29 ? Api29Impl.n(view) : ty(view);
    }

    private static List ck(View view) {
        int i2 = R.id.jB;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    public static void eTf(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (az(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        n1(view);
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.nr());
    }

    public static String[] iF(View view) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.n(view) : (String[]) view.getTag(R.id.f36155M);
    }

    public static void ijL(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.rl(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static AccessibilityViewProperty m() {
        return new AccessibilityViewProperty<Boolean>(R.id.f36151FX, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public Boolean t(View view) {
                return Boolean.valueOf(Api28Impl.t(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
            public boolean Uo(Boolean bool, Boolean bool2) {
                return !n(bool, bool2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
            public void nr(View view, Boolean bool) {
                Api28Impl.J2(view, bool.booleanValue());
            }
        };
    }

    private static AccessibilityViewProperty rl() {
        return new AccessibilityViewProperty<Boolean>(R.id.P5, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public Boolean t(View view) {
                return Boolean.valueOf(Api28Impl.rl(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
            public boolean Uo(Boolean bool, Boolean bool2) {
                return !n(bool, bool2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
            public void nr(View view, Boolean bool) {
                Api28Impl.nr(view, bool.booleanValue());
            }
        };
    }

    public static WindowInsetsControllerCompat s7N(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.t(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return WindowCompat.n(window, view);
                }
                return null;
            }
        }
        return null;
    }

    private static AccessibilityViewProperty tUK() {
        return new AccessibilityViewProperty<CharSequence>(R.id.f36148B, CharSequence.class, 64, 30) { // from class: androidx.core.view.ViewCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public CharSequence t(View view) {
                return Api30Impl.rl(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
            public boolean Uo(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
            public void nr(View view, CharSequence charSequence) {
                Api30Impl.nr(view, charSequence);
            }
        };
    }

    private static View.AccessibilityDelegate ty(View view) {
        if (f36767t) {
            return null;
        }
        if (rl == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                rl = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f36767t = true;
                return null;
            }
        }
        try {
            Object obj = rl.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f36767t = true;
            return null;
        }
    }

    static boolean xMQ(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.n(view).J2(keyEvent);
    }

    public static void z(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            k(view, accessibilityActionCompat.rl());
        } else {
            nr(view, accessibilityActionCompat.n(charSequence, accessibilityViewCommand));
        }
    }

    public static WindowInsetsCompat B(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsNY = windowInsetsCompat.nY();
        if (windowInsetsNY != null) {
            WindowInsets windowInsetsRl = Api20Impl.rl(view, windowInsetsNY);
            if (!windowInsetsRl.equals(windowInsetsNY)) {
                return WindowInsetsCompat.te(windowInsetsRl, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void C(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    static void E(View view, int i2) {
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (HI(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z2) {
                if (i2 == 32) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(accessibilityEventObtain);
                    accessibilityEventObtain.setEventType(32);
                    accessibilityEventObtain.setContentChangeTypes(i2);
                    accessibilityEventObtain.setSource(view);
                    view.onPopulateAccessibilityEvent(accessibilityEventObtain);
                    accessibilityEventObtain.getText().add(HI(view));
                    accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            if (!z2) {
                i3 = 2048;
            }
            accessibilityEventObtain2.setEventType(i3);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            if (z2) {
                accessibilityEventObtain2.getText().add(HI(view));
                n1(view);
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain2);
        }
    }

    public static int E2(View view) {
        return view.getPaddingStart();
    }

    public static void ER(View view) {
        Api21Impl.r(view);
    }

    public static void EWS(View view, int i2, int i3) {
        Api23Impl.rl(view, i2, i3);
    }

    public static void FX(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static void G7(View view, PorterDuff.Mode mode) {
        Api21Impl.gh(view, mode);
    }

    public static void GR(View view) {
        view.postInvalidateOnAnimation();
    }

    public static CharSequence HI(View view) {
        return (CharSequence) D().O(view);
    }

    public static void HV(View view, int i2, int i3, int i5, int i7) {
        view.setPaddingRelative(i2, i3, i5, i7);
    }

    public static void How(View view, float f3) {
        Api21Impl.Ik(view, f3);
    }

    private static int Ik(View view, CharSequence charSequence) {
        boolean z2;
        List listCk = ck(view);
        for (int i2 = 0; i2 < listCk.size(); i2++) {
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) listCk.get(i2)).t())) {
                return ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) listCk.get(i2)).rl();
            }
        }
        int i3 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = nr;
            if (i5 >= iArr.length || i3 != -1) {
                break;
            }
            int i7 = iArr[i5];
            boolean z3 = true;
            for (int i8 = 0; i8 < listCk.size(); i8++) {
                if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) listCk.get(i8)).rl() != i7) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 &= z2;
            }
            if (z3) {
                i3 = i7;
            }
            i5++;
        }
        return i3;
    }

    public static void J(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.X4T());
    }

    public static WindowInsetsCompat J2(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return Api21Impl.rl(view, windowInsetsCompat, rect);
    }

    public static void K(View view, WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.O(view, callback);
    }

    public static void M(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static boolean M7(View view) {
        return Api21Impl.xMQ(view);
    }

    public static void Mx(View view, ColorStateList colorStateList) {
        Api21Impl.mUb(view, colorStateList);
    }

    public static String N(View view) {
        return Api21Impl.J2(view);
    }

    public static void Nxk(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void Org(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.ty(view, onApplyWindowInsetsListener);
    }

    public static boolean P5(View view) {
        return view.isLaidOut();
    }

    public static void Po6(View view, boolean z2) {
        m().J2(view, Boolean.valueOf(z2));
    }

    public static void Rl(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static CharSequence T(View view) {
        return (CharSequence) tUK().O(view);
    }

    public static boolean U(View view) {
        return view.isAttachedToWindow();
    }

    public static void UhV(View view, String str) {
        Api21Impl.HI(view, str);
    }

    public static boolean WPU(View view) {
        return view.getFitsSystemWindows();
    }

    public static WindowInsetsCompat X(View view) {
        return Api23Impl.n(view);
    }

    public static float XQ(View view) {
        return Api21Impl.O(view);
    }

    public static boolean Xw(View view) {
        return view.hasTransientState();
    }

    public static void Y(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static Display Z(View view) {
        return view.getDisplay();
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static int aYN(View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean bzg(View view) {
        return view.hasOnClickListeners();
    }

    private static void dR0(int i2, View view) {
        List listCk = ck(view);
        for (int i3 = 0; i3 < listCk.size(); i3++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) listCk.get(i3)).rl() == i2) {
                listCk.remove(i3);
                return;
            }
        }
    }

    public static ViewParent e(View view) {
        return view.getParentForAccessibility();
    }

    public static boolean eF(View view) {
        Boolean bool = (Boolean) m().O(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void eWT(View view, boolean z2) {
        view.setFitsSystemWindows(z2);
    }

    public static int fD(View view) {
        return view.getPaddingEnd();
    }

    public static void fcU(View view, float f3) {
        Api21Impl.qie(view, f3);
    }

    public static int g(View view) {
        return view.getMinimumHeight();
    }

    public static int gh() {
        return View.generateViewId();
    }

    public static void hRu(View view, CharSequence charSequence) {
        tUK().J2(view, charSequence);
    }

    public static void i(View view, float f3) {
        Api21Impl.ck(view, f3);
    }

    public static boolean jB(View view) {
        Boolean bool = (Boolean) rl().O(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void k(View view, int i2) {
        dR0(i2, view);
        E(view, 0);
    }

    static void mUb(View view) {
        AccessibilityDelegateCompat accessibilityDelegateCompatQie = qie(view);
        if (accessibilityDelegateCompatQie == null) {
            accessibilityDelegateCompatQie = new AccessibilityDelegateCompat();
        }
        eTf(view, accessibilityDelegateCompatQie);
    }

    public static void mYa(View view, boolean z2) {
        Api21Impl.az(view, z2);
    }

    private static void n1(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static float nHg(View view) {
        return Api21Impl.Uo(view);
    }

    public static int nY(View view) {
        return view.getLayoutDirection();
    }

    private static void nr(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        mUb(view);
        dR0(accessibilityActionCompat.rl(), view);
        ck(view).add(accessibilityActionCompat);
        E(view, 0);
    }

    public static PorterDuff.Mode o(View view) {
        return Api21Impl.nr(view);
    }

    public static void ofS(View view, CharSequence charSequence) {
        D().J2(view, charSequence);
        if (charSequence != null) {
            J2.n(view);
        } else {
            J2.nr(view);
        }
    }

    public static boolean p5(View view) {
        return view.isPaddingRelative();
    }

    public static void pJg(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    public static void piY(View view) {
        Api20Impl.t(view);
    }

    public static AccessibilityDelegateCompat qie(View view) {
        View.AccessibilityDelegate accessibilityDelegateAz = az(view);
        if (accessibilityDelegateAz == null) {
            return null;
        }
        if (accessibilityDelegateAz instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateAz).f36713n;
        }
        return new AccessibilityDelegateCompat(accessibilityDelegateAz);
    }

    public static void qm(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static ColorStateList r(View view) {
        return Api21Impl.t(view);
    }

    public static boolean rV9(View view) {
        if (az(view) != null) {
            return true;
        }
        return false;
    }

    public static int t(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int iIk = Ik(view, charSequence);
        if (iIk != -1) {
            nr(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iIk, charSequence, accessibilityViewCommand));
        }
        return iIk;
    }

    public static int te(View view) {
        return view.getMinimumWidth();
    }

    public static void ul(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static float v(View view) {
        return Api21Impl.KN(view);
    }

    public static int wTp(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void xg(View view, boolean z2) {
        rl().J2(view, Boolean.valueOf(z2));
    }
}
