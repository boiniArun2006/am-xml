package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.sidecar.FoldingFeature;
import androidx.window.sidecar.WindowInfoTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static boolean f41971J;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private FoldingFeatureObserver f41972B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f41973E;
    int E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private FoldingFeatureObserver.OnFoldingFeatureChangeListener f41974FX;
    private Drawable J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    FoldingFeature f41975M;
    private boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f41976N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Drawable f41977O;
    boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float f41978S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f41979T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    final ViewDragHelper f41980U;
    private final List Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f41981e;
    final ArrayList eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f41982g;
    private PanelSlideListener jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f41984o;
    private final Rect p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41985r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f41986t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f41987v;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect nr = new Rect();

        AccessibilityDelegate() {
        }

        private void ty(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.nr;
            accessibilityNodeInfoCompat2.ty(rect);
            accessibilityNodeInfoCompat.m(rect);
            accessibilityNodeInfoCompat.UF(accessibilityNodeInfoCompat2.J());
            accessibilityNodeInfoCompat.How(accessibilityNodeInfoCompat2.nY());
            accessibilityNodeInfoCompat.ofS(accessibilityNodeInfoCompat2.Ik());
            accessibilityNodeInfoCompat.fcU(accessibilityNodeInfoCompat2.Z());
            accessibilityNodeInfoCompat.Jk(accessibilityNodeInfoCompat2.bzg());
            accessibilityNodeInfoCompat.C(accessibilityNodeInfoCompat2.v());
            accessibilityNodeInfoCompat.qm(accessibilityNodeInfoCompat2.jB());
            accessibilityNodeInfoCompat.mYa(accessibilityNodeInfoCompat2.U());
            accessibilityNodeInfoCompat.dR0(accessibilityNodeInfoCompat2.nHg());
            accessibilityNodeInfoCompat.QZ6(accessibilityNodeInfoCompat2.M());
            accessibilityNodeInfoCompat.UhV(accessibilityNodeInfoCompat2.p5());
            accessibilityNodeInfoCompat.n(accessibilityNodeInfoCompat2.gh());
            accessibilityNodeInfoCompat.K(accessibilityNodeInfoCompat2.aYN());
        }

        public boolean HI(View view) {
            return SlidingPaneLayout.this.gh(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void J2(View view, AccessibilityEvent accessibilityEvent) {
            super.J2(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatI = AccessibilityNodeInfoCompat.I(accessibilityNodeInfoCompat);
            super.Uo(view, accessibilityNodeInfoCompatI);
            ty(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatI);
            accessibilityNodeInfoCompatI.Nxk();
            accessibilityNodeInfoCompat.ofS("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.VwL(view);
            Object objE = ViewCompat.e(view);
            if (objE instanceof View) {
                accessibilityNodeInfoCompat.ER((View) objE);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i2);
                if (!HI(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.ul(childAt, 1);
                    accessibilityNodeInfoCompat.t(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean xMQ(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!HI(view)) {
                return super.xMQ(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private class DisableLayerRunnable implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final View f41990n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SlidingPaneLayout f41991t;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f41990n.getParent() == this.f41991t) {
                this.f41990n.setLayerType(0, null);
                this.f41991t.mUb(this.f41990n);
            }
            this.f41991t.eF.remove(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private class DragHelperCallback extends ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        private boolean ty() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f41981e || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.az() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.az() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void gh(View view, int i2, int i3, int i5, int i7) {
            SlidingPaneLayout.this.ck(i2);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void mUb(int i2) {
            if (SlidingPaneLayout.this.f41980U.te() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f41978S != 1.0f) {
                    slidingPaneLayout.O(slidingPaneLayout.f41984o);
                    SlidingPaneLayout.this.P5 = true;
                } else {
                    slidingPaneLayout.aYN(slidingPaneLayout.f41984o);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.nr(slidingPaneLayout2.f41984o);
                    SlidingPaneLayout.this.P5 = false;
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int n(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f41984o.getLayoutParams();
            if (SlidingPaneLayout.this.qie()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f41984o.getWidth());
                return Math.max(Math.min(i2, width), width - SlidingPaneLayout.this.E2);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i2, paddingLeft), SlidingPaneLayout.this.E2 + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int nr(View view) {
            return SlidingPaneLayout.this.E2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void xMQ(View view, int i2) {
            SlidingPaneLayout.this.XQ();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void J2(int i2, int i3) {
            if (!ty()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f41980U.t(slidingPaneLayout.f41984o, i3);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void KN(int i2, int i3) {
            if (!ty()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f41980U.t(slidingPaneLayout.f41984o, i3);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean az(View view, int i2) {
            if (!ty()) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).rl;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void qie(View view, float f3, float f4) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.qie()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f3 < 0.0f || (f3 == 0.0f && SlidingPaneLayout.this.f41978S > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.E2;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f41984o.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f3 > 0.0f || (f3 == 0.0f && SlidingPaneLayout.this.f41978S > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.E2;
                }
            }
            SlidingPaneLayout.this.f41980U.Xw(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int rl(View view, int i2, int i3) {
            return view.getTop();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface PanelSlideListener {
        void n(View view);

        void rl(View view);

        void t(View view, float f3);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f41996O;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f41996O = parcel.readInt() != 0;
            this.J2 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f41996O ? 1 : 0);
            parcel.writeInt(this.J2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void n(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void rl(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void t(View view, float f3) {
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private static Rect KN(FoldingFeature foldingFeature, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        Rect rect = new Rect(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(foldingFeature.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    public boolean Ik() {
        return r(0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    boolean gh(View view) {
        if (view == null) {
            return false;
        }
        return this.f41985r && ((LayoutParams) view.getLayoutParams()).f41995t && this.f41978S > 0.0f;
    }

    public boolean rl() {
        return t(0);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int[] f41993O = {R.attr.layout_weight};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f41994n;
        Paint nr;
        boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f41995t;

        public LayoutParams() {
            super(-1, -1);
            this.f41994n = 0.0f;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f41994n = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f41994n = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f41994n = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41994n = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f41993O);
            this.f41994n = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static class TouchBlocker extends FrameLayout {
        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }
    }

    static {
        f41971J = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static Activity Uo(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private ArrayList WPU() {
        Rect rectKN;
        FoldingFeature foldingFeature = this.f41975M;
        if (foldingFeature == null || !foldingFeature.rl() || this.f41975M.getBounds().left == 0 || this.f41975M.getBounds().top != 0 || (rectKN = KN(this.f41975M, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectKN.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList(Arrays.asList(rect, new Rect(Math.min(width, rectKN.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat windowInsetsCompatX;
        if (!f41971J || (windowInsetsCompatX = ViewCompat.X(this)) == null) {
            return null;
        }
        return windowInsetsCompatX.xMQ();
    }

    private boolean r(int i2) {
        if (!this.f41985r) {
            this.P5 = true;
        }
        if (!this.M7 && !S(0.0f, i2)) {
            return false;
        }
        this.P5 = true;
        return true;
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.f41972B = foldingFeatureObserver;
        foldingFeatureObserver.J2(this.f41974FX);
    }

    private boolean t(int i2) {
        if (!this.f41985r) {
            this.P5 = false;
        }
        if (!this.M7 && !S(1.0f, i2)) {
            return false;
        }
        this.P5 = false;
        return true;
    }

    private static int xMQ(View view) {
        return view instanceof TouchBlocker ? ViewCompat.te(((TouchBlocker) view).getChildAt(0)) : ViewCompat.te(view);
    }

    void J2(View view) {
        Iterator it = this.Xw.iterator();
        while (it.hasNext()) {
            ((PanelSlideListener) it.next()).t(view, this.f41978S);
        }
    }

    void O(View view) {
        Iterator it = this.Xw.iterator();
        while (it.hasNext()) {
            ((PanelSlideListener) it.next()).n(view);
        }
        sendAccessibilityEvent(32);
    }

    boolean S(float f3, int i2) {
        int paddingLeft;
        if (!this.f41985r) {
            return false;
        }
        boolean zQie = qie();
        LayoutParams layoutParams = (LayoutParams) this.f41984o.getLayoutParams();
        if (zQie) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f3 * this.E2)) + this.f41984o.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f3 * this.E2));
        }
        ViewDragHelper viewDragHelper = this.f41980U;
        View view = this.f41984o;
        if (!viewDragHelper.U(view, paddingLeft, view.getTop())) {
            return false;
        }
        XQ();
        ViewCompat.GR(this);
        return true;
    }

    public void Z(PanelSlideListener panelSlideListener) {
        this.Xw.remove(panelSlideListener);
    }

    void aYN(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z2;
        View view2 = view;
        boolean zQie = qie();
        int width = zQie ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zQie ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !ViF(view2)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount && (childAt = getChildAt(i2)) != view2) {
            if (childAt.getVisibility() == 8) {
                z2 = zQie;
            } else {
                z2 = zQie;
                childAt.setVisibility((Math.max(zQie ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zQie ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i2++;
            view2 = view;
            zQie = z2;
        }
    }

    public boolean az() {
        return !this.f41985r || this.f41978S == 0.0f;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    void ck(int i2) {
        if (this.f41984o == null) {
            this.f41978S = 0.0f;
            return;
        }
        boolean zQie = qie();
        LayoutParams layoutParams = (LayoutParams) this.f41984o.getLayoutParams();
        int width = this.f41984o.getWidth();
        if (zQie) {
            i2 = (getWidth() - i2) - width;
        }
        float paddingRight = (i2 - ((zQie ? getPaddingRight() : getPaddingLeft()) + (zQie ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.E2;
        this.f41978S = paddingRight;
        if (this.f41979T != 0) {
            o(paddingRight);
        }
        J2(this.f41984o);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f41980U.ty(true)) {
            if (this.f41985r) {
                ViewCompat.GR(this);
            } else {
                this.f41980U.n();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f41986t;
    }

    public final int getLockMode() {
        return this.f41973E;
    }

    @Px
    public int getParallaxDistance() {
        return this.f41979T;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.f41983n;
    }

    public void n(PanelSlideListener panelSlideListener) {
        this.Xw.add(panelSlideListener);
    }

    void nr(View view) {
        Iterator it = this.Xw.iterator();
        while (it.hasNext()) {
            ((PanelSlideListener) it.next()).rl(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean zQie = qie();
        int i12 = i5 - i2;
        int paddingRight = zQie ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zQie ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.M7) {
            this.f41978S = (this.f41985r && this.P5) ? 0.0f : 1.0f;
        }
        int i13 = paddingRight;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.rl) {
                    int i15 = i12 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i15) - i13) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.E2 = iMin;
                    int i16 = zQie ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f41995t = ((i13 + i16) + iMin) + (measuredWidth / 2) > i15;
                    int i17 = (int) (iMin * this.f41978S);
                    i13 += i16 + i17;
                    this.f41978S = i17 / iMin;
                } else if (!this.f41985r || (i8 = this.f41979T) == 0) {
                    i13 = paddingRight;
                } else {
                    i9 = (int) ((1.0f - this.f41978S) * i8);
                    i13 = paddingRight;
                    if (zQie) {
                        i10 = i13 - i9;
                        i11 = i10 + measuredWidth;
                    } else {
                        i11 = (i12 - i13) + i9;
                        i10 = i11 - measuredWidth;
                    }
                    childAt.layout(i10, paddingTop, i11, childAt.getMeasuredHeight() + paddingTop);
                    FoldingFeature foldingFeature = this.f41975M;
                    paddingRight += childAt.getWidth() + Math.abs((foldingFeature == null && foldingFeature.n() == FoldingFeature.Orientation.f42639t && this.f41975M.rl()) ? this.f41975M.getBounds().width() : 0);
                }
                i9 = 0;
                if (zQie) {
                }
                childAt.layout(i10, paddingTop, i11, childAt.getMeasuredHeight() + paddingTop);
                FoldingFeature foldingFeature2 = this.f41975M;
                if (foldingFeature2 == null) {
                    paddingRight += childAt.getWidth() + Math.abs((foldingFeature2 == null && foldingFeature2.n() == FoldingFeature.Orientation.f42639t && this.f41975M.rl()) ? this.f41975M.getBounds().width() : 0);
                }
            }
        }
        if (this.M7) {
            if (this.f41985r && this.f41979T != 0) {
                o(this.f41978S);
            }
            aYN(this.f41984o);
        }
        this.M7 = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int paddingTop;
        int iMin;
        int i5;
        int iMax;
        int iMakeMeasureSpec;
        int i7;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(GDEJgAYrPQHfw.SmgZkcRNsgaMypi, "onMeasure: More than two child views are not supported.");
        }
        this.f41984o = null;
        int i8 = 0;
        boolean z2 = false;
        int i9 = iMax2;
        float f3 = 0.0f;
        while (true) {
            i5 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i10 = iMax2;
            if (childAt.getVisibility() == 8) {
                layoutParams.f41995t = false;
            } else {
                float f4 = layoutParams.f41994n;
                if (f4 > 0.0f) {
                    f3 += f4;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                    i8 = i7 + 1;
                    iMax2 = i10;
                }
                int iMax3 = Math.max(i10 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), 0);
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                i7 = i8;
                childAt.measure(i11 == -2 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE) : i11 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > iMin) {
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        iMin = measuredHeight;
                    }
                }
                i9 -= measuredWidth;
                if (i7 != 0) {
                    boolean z3 = i9 < 0;
                    layoutParams.rl = z3;
                    z2 |= z3;
                    if (z3) {
                        this.f41984o = childAt;
                    }
                }
                i8 = i7 + 1;
                iMax2 = i10;
            }
            i7 = i8;
            i8 = i7 + 1;
            iMax2 = i10;
        }
        int i12 = iMax2;
        if (z2 || f3 > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) layoutParams2).width != 0 || layoutParams2.f41994n <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = i12 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.f41994n > 0.0f) {
                        iMax = measuredWidth2 + ((int) ((layoutParams2.f41994n * Math.max(0, i9)) / f3));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int iHI = HI(childAt2, i3, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iHI);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight2;
                            }
                        }
                    }
                }
                i13++;
                i5 = 8;
            }
        }
        ArrayList arrayListWPU = WPU();
        if (arrayListWPU != null && !z2) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = (Rect) arrayListWPU.get(i14);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i15 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (xMQ(childAt3) != 0 && rect.width() < xMQ(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(i12 - i15, 1073741824), iMakeMeasureSpec2);
                        if (i14 != 0) {
                            layoutParams3.rl = true;
                            this.f41984o = childAt3;
                            z2 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec2);
                    }
                }
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.f41985r = z2;
        if (this.f41980U.te() == 0 || z2) {
            return;
        }
        this.f41980U.n();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        if (savedState.f41996O) {
            Ik();
        } else {
            rl();
        }
        this.P5 = savedState.f41996O;
        setLockMode(savedState.J2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41985r) {
            return super.onTouchEvent(motionEvent);
        }
        this.f41980U.X(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f41976N = x2;
            this.f41987v = y2;
            return true;
        }
        if (actionMasked == 1 && gh(this.f41984o)) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f3 = x3 - this.f41976N;
            float f4 = y3 - this.f41987v;
            int iG = this.f41980U.g();
            if ((f3 * f3) + (f4 * f4) < iG * iG && this.f41980U.e(this.f41984o, (int) x3, (int) y3)) {
                t(0);
            }
        }
        return true;
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i2) {
        this.f41986t = i2;
    }

    public final void setLockMode(int i2) {
        this.f41973E = i2;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.jB;
        if (panelSlideListener2 != null) {
            Z(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            n(panelSlideListener);
        }
        this.jB = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i2) {
        this.f41979T = i2;
        requestLayout();
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f41977O = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.J2 = drawable;
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i2) {
        this.f41983n = i2;
    }

    public boolean ty() {
        return this.f41985r;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f41983n = 0;
        this.f41978S = 1.0f;
        this.Xw = new CopyOnWriteArrayList();
        this.M7 = true;
        this.p5 = new Rect();
        this.eF = new ArrayList();
        this.f41974FX = new FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            public void n(FoldingFeature foldingFeature) {
                SlidingPaneLayout.this.f41975M = foldingFeature;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.k(300L);
                changeBounds.z(PathInterpolatorCompat.n(0.2f, 0.0f, 0.0f, 1.0f));
                TransitionManager.n(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float f3 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.eTf(this, new AccessibilityDelegate());
        ViewCompat.ul(this, 1);
        ViewDragHelper viewDragHelperHI = ViewDragHelper.HI(this, 0.5f, new DragHelperCallback());
        this.f41980U = viewDragHelperHI;
        viewDragHelperHI.bzg(f3 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.n(context), ContextCompat.getMainExecutor(context)));
    }

    private static int HI(View view, int i2, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && layoutParams.f41994n > 0.0f) {
            return ViewGroup.getChildMeasureSpec(i2, i3, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        }
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private static boolean ViF(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    private void o(float f3) {
        boolean zQie = qie();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.f41984o) {
                float f4 = 1.0f - this.f41982g;
                int i3 = this.f41979T;
                this.f41982g = f3;
                int i5 = ((int) (f4 * i3)) - ((int) ((1.0f - f3) * i3));
                if (zQie) {
                    i5 = -i5;
                }
                childAt.offsetLeftAndRight(i5);
            }
        }
    }

    void XQ() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View childAt;
        int i2;
        int right;
        super.draw(canvas);
        if (qie()) {
            drawable = this.J2;
        } else {
            drawable = this.f41977O;
        }
        if (getChildCount() > 1) {
            childAt = getChildAt(1);
        } else {
            childAt = null;
        }
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (qie()) {
                right = childAt.getRight();
                i2 = intrinsicWidth + right;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i2 = left;
                right = i3;
            }
            drawable.setBounds(right, top, i2, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        if (qie() ^ az()) {
            this.f41980U.rV9(1);
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                ViewDragHelper viewDragHelper = this.f41980U;
                viewDragHelper.v(Math.max(viewDragHelper.aYN(), systemGestureInsets.f36410n));
            }
        } else {
            this.f41980U.rV9(2);
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                ViewDragHelper viewDragHelper2 = this.f41980U;
                viewDragHelper2.v(Math.max(viewDragHelper2.aYN(), systemGestureInsets2.f36411t));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f41985r && !layoutParams.rl && this.f41984o != null) {
            canvas.getClipBounds(this.p5);
            if (qie()) {
                Rect rect = this.p5;
                rect.left = Math.max(rect.left, this.f41984o.getRight());
            } else {
                Rect rect2 = this.p5;
                rect2.right = Math.min(rect2.right, this.f41984o.getLeft());
            }
            canvas.clipRect(this.p5);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void mUb(View view) {
        ViewCompat.qm(view, ((LayoutParams) view.getLayoutParams()).nr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityUo;
        super.onAttachedToWindow();
        this.M7 = true;
        if (this.f41972B != null && (activityUo = Uo(getContext())) != null) {
            this.f41972B.O(activityUo);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.M7 = true;
        FoldingFeatureObserver foldingFeatureObserver = this.f41972B;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.Uo();
        }
        int size = this.eF.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((DisableLayerRunnable) this.eF.get(i2)).run();
        }
        this.eF.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f41985r && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.P5 = this.f41980U.e(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f41985r && (!this.f41981e || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float fAbs = Math.abs(x2 - this.f41976N);
                        float fAbs2 = Math.abs(y2 - this.f41987v);
                        if (fAbs > this.f41980U.g() && fAbs2 > fAbs) {
                            this.f41980U.rl();
                            this.f41981e = true;
                            return false;
                        }
                    }
                } else {
                    this.f41981e = false;
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    this.f41976N = x3;
                    this.f41987v = y3;
                    if (this.f41980U.e(this.f41984o, (int) x3, (int) y3) && gh(this.f41984o)) {
                        z2 = true;
                    }
                    if (!this.f41980U.jB(motionEvent) || z2) {
                        return true;
                    }
                    return false;
                }
                z2 = false;
                if (!this.f41980U.jB(motionEvent)) {
                }
                return true;
            }
            this.f41980U.rl();
            return false;
        }
        this.f41980U.rl();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean zAz;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (ty()) {
            zAz = az();
        } else {
            zAz = this.P5;
        }
        savedState.f41996O = zAz;
        savedState.J2 = this.f41973E;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        super.onSizeChanged(i2, i3, i5, i7);
        if (i2 != i5) {
            this.M7 = true;
        }
    }

    boolean qie() {
        if (ViewCompat.nY(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z2;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f41985r) {
            if (view == this.f41984o) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.P5 = z2;
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i2) {
        setShadowDrawableLeft(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i2));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
