package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f42377B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private EdgeEffect f42378C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f42379D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f42380E;
    private ClassLoader E2;
    private int EWS;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f42381FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private boolean f42382G7;
    private ArrayList GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private int f42383GR;
    private int HV;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f42384I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f42385J;
    private final Rect J2;
    private OnPageChangeListener Jk;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f42386M;
    private float M7;
    private EdgeEffect Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private PagerObserver f42387N;
    private float Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ItemInfo f42388O;
    private int Org;
    private float P5;
    private final Runnable Po6;
    private OnPageChangeListener Rl;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f42389S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f42390T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f42391U;
    private Drawable Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42392a;
    private float dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Scroller f42393e;
    private int eF;
    private int eTf;
    private boolean eWT;
    private boolean fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Parcelable f42394g;
    private VelocityTracker ijL;
    private int jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f42395k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42396m;
    private PageTransformer mYa;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42397n;
    private List n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f42398o;
    private boolean ofS;
    private int p5;
    private int pJg;
    private int piY;
    private List qm;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    PagerAdapter f42399r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f42400t;
    private int ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f42401v;
    private int xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f42402z;
    static final int[] hRu = {R.attr.layout_gravity};
    private static final Comparator UhV = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.rl - itemInfo2.rl;
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Interpolator f42376i = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    };

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final ViewPositionComparator f42375K = new ViewPositionComparator();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        private boolean ty() {
            PagerAdapter pagerAdapter = ViewPager.this.f42399r;
            return pagerAdapter != null && pagerAdapter.O() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void J2(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.J2(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(ty());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = ViewPager.this.f42399r) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.O());
                accessibilityEvent.setFromIndex(ViewPager.this.f42398o);
                accessibilityEvent.setToIndex(ViewPager.this.f42398o);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.ofS(ViewPager.class.getName());
            accessibilityNodeInfoCompat.F(ty());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.n(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.n(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean mUb(View view, int i2, Bundle bundle) {
            if (super.mUb(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f42398o - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f42398o + 1);
            return true;
        }
    }

    public interface OnAdapterChangeListener {
        void rl(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void n(int i2, float f3, int i3);

        void nr(int i2);

        void t(int i2);
    }

    public interface PageTransformer {
        void n(View view, float f3);
    }

    private class PagerObserver extends DataSetObserver {
        PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.KN();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.KN();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        Parcelable J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f42413O;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        ClassLoader f42414r;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f42413O = parcel.readInt();
            this.J2 = parcel.readParcelable(classLoader);
            this.f42414r = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f42413O + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f42413O);
            parcel.writeParcelable(this.J2, i2);
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void n(int i2, float f3, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void nr(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void t(int i2) {
        }
    }

    private void HI() {
        this.f42385J = false;
        this.f42379D = false;
        VelocityTracker velocityTracker = this.ijL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ijL = null;
        }
    }

    private void T() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f42410n) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private boolean wTp() {
        this.piY = -1;
        HI();
        this.f42378C.onRelease();
        this.Mx.onRelease();
        return this.f42378C.isFinished() || this.Mx.isFinished();
    }

    void S() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f42393e = new Scroller(context, f42376i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f42383GR = viewConfiguration.getScaledPagingTouchSlop();
        this.f42396m = (int) (400.0f * f3);
        this.eTf = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f42378C = new EdgeEffect(context);
        this.Mx = new EdgeEffect(context);
        this.xg = (int) (25.0f * f3);
        this.pJg = (int) (2.0f * f3);
        this.f42392a = (int) (f3 * 16.0f);
        ViewCompat.eTf(this, new MyAccessibilityDelegate());
        if (ViewCompat.aYN(this) == 0) {
            ViewCompat.ul(this, 1);
        }
        ViewCompat.Org(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Rect f42404n = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatB = ViewCompat.B(view, windowInsetsCompat);
                if (windowInsetsCompatB.r()) {
                    return windowInsetsCompatB;
                }
                Rect rect = this.f42404n;
                rect.left = windowInsetsCompatB.gh();
                rect.top = windowInsetsCompatB.az();
                rect.right = windowInsetsCompatB.qie();
                rect.bottom = windowInsetsCompatB.mUb();
                int childCount = ViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    WindowInsetsCompat windowInsetsCompatUo = ViewCompat.Uo(ViewPager.this.getChildAt(i2), windowInsetsCompatB);
                    rect.left = Math.min(windowInsetsCompatUo.gh(), rect.left);
                    rect.top = Math.min(windowInsetsCompatUo.az(), rect.top);
                    rect.right = Math.min(windowInsetsCompatUo.qie(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatUo.mUb(), rect.bottom);
                }
                return windowInsetsCompatB.Z(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    ItemInfo XQ(int i2) {
        for (int i3 = 0; i3 < this.f42400t.size(); i3++) {
            ItemInfo itemInfo = (ItemInfo) this.f42400t.get(i3);
            if (itemInfo.rl == i2) {
                return itemInfo;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        ItemInfo itemInfoO;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (itemInfoO = o(childAt)) != null && itemInfoO.rl == this.f42398o) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    void bzg(int i2, boolean z2, boolean z3) {
        Xw(i2, z2, z3, 0);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f42390T = true;
        if (this.f42393e.isFinished() || !this.f42393e.computeScrollOffset()) {
            Uo(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f42393e.getCurrX();
        int currY = this.f42393e.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!iF(currX)) {
                this.f42393e.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.GR(this);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    ItemInfo o(View view) {
        for (int i2 = 0; i2 < this.f42400t.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) this.f42400t.get(i2);
            if (this.f42399r.gh(view, itemInfo.f42407n)) {
                return itemInfo;
            }
        }
        return null;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.f42384I = Math.min(measuredWidth / 10, this.f42392a);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f42410n) {
                int i9 = layoutParams2.rl;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z3 = i11 == 48 || i11 == 80;
                if (i10 != 3 && i10 != 5) {
                    z2 = false;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i5 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i5 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i13 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i13 != -2) {
                    if (i13 == -1) {
                        i13 = paddingLeft;
                    }
                    i12 = 1073741824;
                } else {
                    i13 = paddingLeft;
                }
                int i14 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i14 == -2) {
                    i14 = measuredHeight;
                    i8 = i5;
                } else if (i14 == -1) {
                    i14 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i12), View.MeasureSpec.makeMeasureSpec(i14, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
        }
        this.p5 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.eF = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f42380E = true;
        E2();
        this.f42380E = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f42410n)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f42411t), 1073741824), this.eF);
            }
        }
    }

    public void rV9(int i2, boolean z2) {
        this.f42381FX = false;
        bzg(i2, z2, false);
    }

    public void setCurrentItem(int i2) {
        this.f42381FX = false;
        bzg(i2, !this.f42382G7, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f42377B) {
            this.f42377B = i2;
            E2();
        }
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.Xw = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    static class ItemInfo {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        float f42406O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f42407n;
        float nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f42408t;

        ItemInfo() {
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f42409O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f42410n;
        boolean nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f42411t;

        public LayoutParams() {
            super(-1, -1);
            this.f42411t = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f42411t = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.hRu);
            this.rl = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class ViewPositionComparator implements Comparator<View> {
        ViewPositionComparator() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z2 = layoutParams.f42410n;
            if (z2 != layoutParams2.f42410n) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.f42409O - layoutParams2.f42409O;
        }
    }

    private Rect Ik(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void O(ItemInfo itemInfo, int i2, ItemInfo itemInfo2) {
        int i3;
        int i5;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int iO = this.f42399r.O();
        int clientWidth = getClientWidth();
        float f3 = clientWidth > 0 ? this.f42401v / clientWidth : 0.0f;
        if (itemInfo2 != null) {
            int i7 = itemInfo2.rl;
            int i8 = itemInfo.rl;
            if (i7 < i8) {
                float fKN = itemInfo2.f42406O + itemInfo2.nr + f3;
                int i9 = i7 + 1;
                int i10 = 0;
                while (i9 <= itemInfo.rl && i10 < this.f42400t.size()) {
                    Object obj = this.f42400t.get(i10);
                    while (true) {
                        itemInfo4 = (ItemInfo) obj;
                        if (i9 <= itemInfo4.rl || i10 >= this.f42400t.size() - 1) {
                            break;
                        }
                        i10++;
                        obj = this.f42400t.get(i10);
                    }
                    while (i9 < itemInfo4.rl) {
                        fKN += this.f42399r.KN(i9) + f3;
                        i9++;
                    }
                    itemInfo4.f42406O = fKN;
                    fKN += itemInfo4.nr + f3;
                    i9++;
                }
            } else if (i7 > i8) {
                int size = this.f42400t.size() - 1;
                float fKN2 = itemInfo2.f42406O;
                while (true) {
                    i7--;
                    if (i7 < itemInfo.rl || size < 0) {
                        break;
                    }
                    Object obj2 = this.f42400t.get(size);
                    while (true) {
                        itemInfo3 = (ItemInfo) obj2;
                        if (i7 >= itemInfo3.rl || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f42400t.get(size);
                    }
                    while (i7 > itemInfo3.rl) {
                        fKN2 -= this.f42399r.KN(i7) + f3;
                        i7--;
                    }
                    fKN2 -= itemInfo3.nr + f3;
                    itemInfo3.f42406O = fKN2;
                }
            }
        }
        int size2 = this.f42400t.size();
        float fKN3 = itemInfo.f42406O;
        int i11 = itemInfo.rl;
        int i12 = i11 - 1;
        this.P5 = i11 == 0 ? fKN3 : -3.4028235E38f;
        int i13 = iO - 1;
        this.M7 = i11 == i13 ? (itemInfo.nr + fKN3) - 1.0f : Float.MAX_VALUE;
        int i14 = i2 - 1;
        while (i14 >= 0) {
            ItemInfo itemInfo5 = (ItemInfo) this.f42400t.get(i14);
            while (true) {
                i5 = itemInfo5.rl;
                if (i12 <= i5) {
                    break;
                }
                fKN3 -= this.f42399r.KN(i12) + f3;
                i12--;
            }
            fKN3 -= itemInfo5.nr + f3;
            itemInfo5.f42406O = fKN3;
            if (i5 == 0) {
                this.P5 = fKN3;
            }
            i14--;
            i12--;
        }
        float fKN4 = itemInfo.f42406O + itemInfo.nr + f3;
        int i15 = itemInfo.rl + 1;
        int i16 = i2 + 1;
        while (i16 < size2) {
            ItemInfo itemInfo6 = (ItemInfo) this.f42400t.get(i16);
            while (true) {
                i3 = itemInfo6.rl;
                if (i15 >= i3) {
                    break;
                }
                fKN4 += this.f42399r.KN(i15) + f3;
                i15++;
            }
            if (i3 == i13) {
                this.M7 = (itemInfo6.nr + fKN4) - 1.0f;
            }
            itemInfo6.f42406O = fKN4;
            fKN4 += itemInfo6.nr + f3;
            i16++;
            i15++;
        }
        this.fcU = false;
    }

    private void P5() {
        if (this.HV != 0) {
            ArrayList arrayList = this.GD;
            if (arrayList == null) {
                this.GD = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.GD.add(getChildAt(i2));
            }
            Collections.sort(this.GD, f42375K);
        }
    }

    private void Uo(boolean z2) {
        boolean z3 = this.EWS == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f42393e.isFinished()) {
                this.f42393e.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f42393e.getCurrX();
                int currY = this.f42393e.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        iF(currX);
                    }
                }
            }
        }
        this.f42381FX = false;
        for (int i2 = 0; i2 < this.f42400t.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) this.f42400t.get(i2);
            if (itemInfo.f42408t) {
                itemInfo.f42408t = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                ViewCompat.Nxk(this, this.Po6);
            } else {
                this.Po6.run();
            }
        }
    }

    private void X(int i2, int i3, int i5, int i7) {
        if (i3 > 0 && !this.f42400t.isEmpty()) {
            if (!this.f42393e.isFinished()) {
                this.f42393e.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i7)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i5)), getScrollY());
                return;
            }
        }
        ItemInfo itemInfoXQ = XQ(this.f42398o);
        int iMin = (int) ((itemInfoXQ != null ? Math.min(itemInfoXQ.f42406O, this.M7) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            Uo(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private boolean aYN(float f3, float f4) {
        if (f3 >= this.f42384I || f4 <= 0.0f) {
            return f3 > ((float) (getWidth() - this.f42384I)) && f4 < 0.0f;
        }
        return true;
    }

    private boolean fD(float f3) {
        boolean z2;
        boolean z3;
        float f4 = this.Nxk - f3;
        this.Nxk = f3;
        float scrollX = getScrollX() + f4;
        float clientWidth = getClientWidth();
        float f5 = this.P5 * clientWidth;
        float f6 = this.M7 * clientWidth;
        boolean z4 = false;
        ItemInfo itemInfo = (ItemInfo) this.f42400t.get(0);
        ArrayList arrayList = this.f42400t;
        ItemInfo itemInfo2 = (ItemInfo) arrayList.get(arrayList.size() - 1);
        if (itemInfo.rl != 0) {
            f5 = itemInfo.f42406O * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (itemInfo2.rl != this.f42399r.O() - 1) {
            f6 = itemInfo2.f42406O * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f5) {
            if (z2) {
                this.f42378C.onPull(Math.abs(f5 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z3) {
                this.Mx.onPull(Math.abs(scrollX - f6) / clientWidth);
                z4 = true;
            }
            scrollX = f6;
        }
        int i2 = (int) scrollX;
        this.Nxk += scrollX - i2;
        scrollTo(i2, getScrollY());
        iF(i2);
        return z4;
    }

    private void gh(int i2) {
        OnPageChangeListener onPageChangeListener = this.Jk;
        if (onPageChangeListener != null) {
            onPageChangeListener.nr(i2);
        }
        List list = this.n1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.n1.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.nr(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.Rl;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.nr(i2);
        }
    }

    private boolean iF(int i2) {
        if (this.f42400t.size() == 0) {
            if (this.f42382G7) {
                return false;
            }
            this.eWT = false;
            ViF(0, 0.0f, 0);
            if (this.eWT) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo itemInfoZ = Z();
        int clientWidth = getClientWidth();
        int i3 = this.f42401v;
        int i5 = clientWidth + i3;
        float f3 = clientWidth;
        int i7 = itemInfoZ.rl;
        float f4 = ((i2 / f3) - itemInfoZ.f42406O) / (itemInfoZ.nr + (i3 / f3));
        this.eWT = false;
        ViF(i7, f4, (int) (i5 * f4));
        if (this.eWT) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void mUb(int i2, float f3, int i3) {
        OnPageChangeListener onPageChangeListener = this.Jk;
        if (onPageChangeListener != null) {
            onPageChangeListener.n(i2, f3, i3);
        }
        List list = this.n1;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.n1.get(i5);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.n(i2, f3, i3);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.Rl;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.n(i2, f3, i3);
        }
    }

    private void qie(int i2) {
        OnPageChangeListener onPageChangeListener = this.Jk;
        if (onPageChangeListener != null) {
            onPageChangeListener.t(i2);
        }
        List list = this.n1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.n1.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.t(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.Rl;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.t(i2);
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.f42386M != z2) {
            this.f42386M = z2;
        }
    }

    void E2() {
        e(this.f42398o);
    }

    protected boolean J2(View view, boolean z2, int i2, int i3, int i5) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i8 = i3 + scrollX;
                if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && (i7 = i5 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && J2(childAt, true, i2, i8 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    void KN() {
        int iO = this.f42399r.O();
        this.f42397n = iO;
        boolean z2 = this.f42400t.size() < (this.f42377B * 2) + 1 && this.f42400t.size() < iO;
        int iMax = this.f42398o;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f42400t.size()) {
            ItemInfo itemInfo = (ItemInfo) this.f42400t.get(i2);
            int iJ2 = this.f42399r.J2(itemInfo.f42407n);
            if (iJ2 != -1) {
                if (iJ2 == -2) {
                    this.f42400t.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f42399r.o(this);
                        z3 = true;
                    }
                    this.f42399r.rl(this, itemInfo.rl, itemInfo.f42407n);
                    int i3 = this.f42398o;
                    if (i3 == itemInfo.rl) {
                        iMax = Math.max(0, Math.min(i3, iO - 1));
                    }
                } else {
                    int i5 = itemInfo.rl;
                    if (i5 != iJ2) {
                        if (i5 == this.f42398o) {
                            iMax = iJ2;
                        }
                        itemInfo.rl = iJ2;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f42399r.nr(this);
        }
        Collections.sort(this.f42400t, UhV);
        if (z2) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                if (!layoutParams.f42410n) {
                    layoutParams.f42411t = 0.0f;
                }
            }
            bzg(iMax, false, true);
            requestLayout();
        }
    }

    public void N(OnAdapterChangeListener onAdapterChangeListener) {
        List list = this.qm;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void ViF(int i2, float f3, int i3) {
        int iMax;
        int width;
        int left;
        if (this.ul > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f42410n) {
                    int i7 = layoutParams.rl & 7;
                    if (i7 != 1) {
                        if (i7 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i7 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i8 = iMax;
                    width = paddingLeft;
                    paddingLeft = i8;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        mUb(i2, f3, i3);
        if (this.mYa != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(i9);
                if (!((LayoutParams) childAt2.getLayoutParams()).f42410n) {
                    this.mYa.n(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.eWT = true;
    }

    void Xw(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.f42399r;
        if (pagerAdapter == null || pagerAdapter.O() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z3 && this.f42398o == i2 && this.f42400t.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f42399r.O()) {
            i2 = this.f42399r.O() - 1;
        }
        int i5 = this.f42377B;
        int i7 = this.f42398o;
        if (i2 > i7 + i5 || i2 < i7 - i5) {
            for (int i8 = 0; i8 < this.f42400t.size(); i8++) {
                ((ItemInfo) this.f42400t.get(i8)).f42408t = true;
            }
        }
        boolean z4 = this.f42398o != i2;
        if (!this.f42382G7) {
            e(i2);
            v(i2, z2, i3, z4);
        } else {
            this.f42398o = i2;
            if (z4) {
                gh(i2);
            }
            requestLayout();
        }
    }

    float az(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f42399r == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.P5)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.M7));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void e(int i2) {
        ItemInfo itemInfoXQ;
        String hexString;
        ItemInfo itemInfoN;
        ItemInfo itemInfoO;
        ItemInfo itemInfo;
        int i3 = this.f42398o;
        if (i3 != i2) {
            itemInfoXQ = XQ(i3);
            this.f42398o = i2;
        } else {
            itemInfoXQ = null;
        }
        if (this.f42399r == null) {
            P5();
            return;
        }
        if (this.f42381FX) {
            P5();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f42399r.o(this);
        int i5 = this.f42377B;
        int iMax = Math.max(0, this.f42398o - i5);
        int iO = this.f42399r.O();
        int iMin = Math.min(iO - 1, this.f42398o + i5);
        if (iO != this.f42397n) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f42397n + ", found: " + iO + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f42399r.getClass());
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.f42400t.size()) {
                break;
            }
            itemInfoN = (ItemInfo) this.f42400t.get(i7);
            int i8 = itemInfoN.rl;
            int i9 = this.f42398o;
            if (i8 >= i9) {
                if (i8 != i9) {
                    break;
                }
            } else {
                i7++;
            }
        }
        if (itemInfoN == null && iO > 0) {
            itemInfoN = n(this.f42398o, i7);
        }
        if (itemInfoN != null) {
            int i10 = i7 - 1;
            ItemInfo itemInfo2 = i10 >= 0 ? (ItemInfo) this.f42400t.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - itemInfoN.nr) + (getPaddingLeft() / clientWidth);
            float f3 = 0.0f;
            for (int i11 = this.f42398o - 1; i11 >= 0; i11--) {
                if (f3 >= paddingLeft && i11 < iMax) {
                    if (itemInfo2 == null) {
                        break;
                    }
                    if (i11 == itemInfo2.rl && !itemInfo2.f42408t) {
                        this.f42400t.remove(i10);
                        this.f42399r.rl(this, i11, itemInfo2.f42407n);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            itemInfo = (ItemInfo) this.f42400t.get(i10);
                        }
                        itemInfo2 = itemInfo;
                    }
                } else if (itemInfo2 == null || i11 != itemInfo2.rl) {
                    f3 += n(i11, i10 + 1).nr;
                    i7++;
                    itemInfo = i10 >= 0 ? (ItemInfo) this.f42400t.get(i10) : null;
                    itemInfo2 = itemInfo;
                } else {
                    f3 += itemInfo2.nr;
                    i10--;
                    if (i10 >= 0) {
                        itemInfo = (ItemInfo) this.f42400t.get(i10);
                    }
                    itemInfo2 = itemInfo;
                }
            }
            float f4 = itemInfoN.nr;
            int i12 = i7 + 1;
            if (f4 < 2.0f) {
                ItemInfo itemInfo3 = i12 < this.f42400t.size() ? (ItemInfo) this.f42400t.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = this.f42398o;
                while (true) {
                    i13++;
                    if (i13 >= iO) {
                        break;
                    }
                    if (f4 >= paddingRight && i13 > iMin) {
                        if (itemInfo3 == null) {
                            break;
                        }
                        if (i13 == itemInfo3.rl && !itemInfo3.f42408t) {
                            this.f42400t.remove(i12);
                            this.f42399r.rl(this, i13, itemInfo3.f42407n);
                            if (i12 < this.f42400t.size()) {
                                itemInfo3 = (ItemInfo) this.f42400t.get(i12);
                            }
                        }
                    } else if (itemInfo3 == null || i13 != itemInfo3.rl) {
                        ItemInfo itemInfoN2 = n(i13, i12);
                        i12++;
                        f4 += itemInfoN2.nr;
                        itemInfo3 = i12 < this.f42400t.size() ? (ItemInfo) this.f42400t.get(i12) : null;
                    } else {
                        f4 += itemInfo3.nr;
                        i12++;
                        if (i12 < this.f42400t.size()) {
                            itemInfo3 = (ItemInfo) this.f42400t.get(i12);
                        }
                    }
                }
            }
            O(itemInfoN, i7, itemInfoXQ);
            this.f42399r.ck(this, this.f42398o, itemInfoN.f42407n);
        }
        this.f42399r.nr(this);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.J2 = i14;
            if (!layoutParams.f42410n && layoutParams.f42411t == 0.0f && (itemInfoO = o(childAt)) != null) {
                layoutParams.f42411t = itemInfoO.nr;
                layoutParams.f42409O = itemInfoO.rl;
            }
        }
        P5();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ItemInfo itemInfoR = viewFindFocus != null ? r(viewFindFocus) : null;
            if (itemInfoR == null || itemInfoR.rl != this.f42398o) {
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt2 = getChildAt(i15);
                    ItemInfo itemInfoO2 = o(childAt2);
                    if (itemInfoO2 != null && itemInfoO2.rl == this.f42398o && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    boolean g() {
        int i2 = this.f42398o;
        if (i2 <= 0) {
            return false;
        }
        rV9(i2 - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.f42399r;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.HV == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) ((View) this.GD.get(i3)).getLayoutParams()).J2;
    }

    public int getCurrentItem() {
        return this.f42398o;
    }

    public int getOffscreenPageLimit() {
        return this.f42377B;
    }

    public int getPageMargin() {
        return this.f42401v;
    }

    OnPageChangeListener jB(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.Rl;
        this.Rl = onPageChangeListener;
        return onPageChangeListener2;
    }

    ItemInfo n(int i2, int i3) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.rl = i2;
        itemInfo.f42407n = this.f42399r.mUb(this, i2);
        itemInfo.nr = this.f42399r.KN(i2);
        if (i3 < 0 || i3 >= this.f42400t.size()) {
            this.f42400t.add(itemInfo);
            return itemInfo;
        }
        this.f42400t.add(i3, itemInfo);
        return itemInfo;
    }

    public void nHg(OnPageChangeListener onPageChangeListener) {
        List list = this.n1;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.Po6);
        Scroller scroller = this.f42393e;
        if (scroller != null && !scroller.isFinished()) {
            this.f42393e.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f3;
        int i3;
        super.onDraw(canvas);
        if (this.f42401v <= 0 || this.Xw == null || this.f42400t.size() <= 0 || this.f42399r == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f42401v / width;
        int i5 = 0;
        ItemInfo itemInfo = (ItemInfo) this.f42400t.get(0);
        float f5 = itemInfo.f42406O;
        int size = this.f42400t.size();
        int i7 = itemInfo.rl;
        int i8 = ((ItemInfo) this.f42400t.get(size - 1)).rl;
        while (i7 < i8) {
            while (true) {
                i2 = itemInfo.rl;
                if (i7 <= i2 || i5 >= size) {
                    break;
                }
                i5++;
                itemInfo = (ItemInfo) this.f42400t.get(i5);
            }
            if (i7 == i2) {
                float f6 = itemInfo.f42406O;
                float f7 = itemInfo.nr;
                f3 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float fKN = this.f42399r.KN(i7);
                f3 = (f5 + fKN) * width;
                f5 += fKN + f4;
            }
            if (this.f42401v + f3 > scrollX) {
                i3 = scrollX;
                this.Xw.setBounds(Math.round(f3), this.jB, Math.round(this.f42401v + f3), this.f42391U);
                this.Xw.draw(canvas);
            } else {
                i3 = scrollX;
            }
            if (f3 > i3 + r2) {
                return;
            }
            i7++;
            scrollX = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        boolean z3;
        ItemInfo itemInfoO;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i8 = i5 - i2;
        int i9 = i7 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f42410n) {
                    int i12 = layoutParams.rl;
                    int i13 = i12 & 7;
                    int i14 = i12 & 112;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i8 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i14 == 16) {
                            if (i14 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i14 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i9 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i15 = paddingLeft + scrollX;
                            childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, paddingTop + childAt.getMeasuredHeight());
                            i10++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i9 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i16 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i16;
                        int i152 = paddingLeft + scrollX;
                        childAt.layout(i152, paddingTop, childAt.getMeasuredWidth() + i152, paddingTop + childAt.getMeasuredHeight());
                        i10++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i8 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i17 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i17;
                    if (i14 == 16) {
                    }
                    int i162 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i162;
                    int i1522 = paddingLeft + scrollX;
                    childAt.layout(i1522, paddingTop, childAt.getMeasuredWidth() + i1522, paddingTop + childAt.getMeasuredHeight());
                    i10++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i18 = (i8 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f42410n && (itemInfoO = o(childAt2)) != null) {
                    float f3 = i18;
                    int i20 = ((int) (itemInfoO.f42406O * f3)) + paddingLeft;
                    if (layoutParams2.nr) {
                        layoutParams2.nr = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f3 * layoutParams2.f42411t), 1073741824), View.MeasureSpec.makeMeasureSpec((i9 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.jB = paddingTop;
        this.f42391U = i9 - paddingBottom;
        this.ul = i10;
        if (this.f42382G7) {
            z3 = false;
            v(this.f42398o, false, 0, false);
        } else {
            z3 = false;
        }
        this.f42382G7 = z3;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        PagerAdapter pagerAdapter = this.f42399r;
        if (pagerAdapter != null) {
            pagerAdapter.az(savedState.J2, savedState.f42414r);
            bzg(savedState.f42413O, false, true);
        } else {
            this.f42389S = savedState.f42413O;
            this.f42394g = savedState.J2;
            this.E2 = savedState.f42414r;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        if (this.ofS) {
            return true;
        }
        boolean zWTp = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f42399r) == null || pagerAdapter.O() == 0) {
            return false;
        }
        if (this.ijL == null) {
            this.ijL = VelocityTracker.obtain();
        }
        this.ijL.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f42393e.abortAnimation();
            this.f42381FX = false;
            E2();
            float x2 = motionEvent.getX();
            this.dR0 = x2;
            this.Nxk = x2;
            float y2 = motionEvent.getY();
            this.f42402z = y2;
            this.f42395k = y2;
            this.piY = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.Nxk = motionEvent.getX(actionIndex);
                        this.piY = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        nY(motionEvent);
                        this.Nxk = motionEvent.getX(motionEvent.findPointerIndex(this.piY));
                    }
                } else if (this.f42385J) {
                    v(this.f42398o, true, 0, false);
                    zWTp = wTp();
                }
            } else if (!this.f42385J) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.piY);
                if (iFindPointerIndex == -1) {
                    zWTp = wTp();
                } else {
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x3 - this.Nxk);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y3 - this.f42395k);
                    if (fAbs > this.f42383GR && fAbs > fAbs2) {
                        this.f42385J = true;
                        s7N(true);
                        float f3 = this.dR0;
                        this.Nxk = x3 - f3 > 0.0f ? f3 + this.f42383GR : f3 - this.f42383GR;
                        this.f42395k = y3;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f42385J) {
                    }
                }
            } else if (this.f42385J) {
                zWTp = fD(motionEvent.getX(motionEvent.findPointerIndex(this.piY)));
            }
        } else if (this.f42385J) {
            VelocityTracker velocityTracker = this.ijL;
            velocityTracker.computeCurrentVelocity(1000, this.eTf);
            int xVelocity = (int) velocityTracker.getXVelocity(this.piY);
            this.f42381FX = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoZ = Z();
            float f4 = clientWidth;
            Xw(xMQ(itemInfoZ.rl, ((scrollX / f4) - itemInfoZ.f42406O) / (itemInfoZ.nr + (this.f42401v / f4)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.piY)) - this.dR0)), true, true, xVelocity);
            zWTp = wTp();
        }
        if (zWTp) {
            ViewCompat.GR(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f42380E) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void rl(OnAdapterChangeListener onAdapterChangeListener) {
        if (this.qm == null) {
            this.qm = new ArrayList();
        }
        this.qm.add(onAdapterChangeListener);
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f42399r;
        if (pagerAdapter2 != null) {
            pagerAdapter2.Ik(null);
            this.f42399r.o(this);
            for (int i2 = 0; i2 < this.f42400t.size(); i2++) {
                ItemInfo itemInfo = (ItemInfo) this.f42400t.get(i2);
                this.f42399r.rl(this, itemInfo.rl, itemInfo.f42407n);
            }
            this.f42399r.nr(this);
            this.f42400t.clear();
            T();
            this.f42398o = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f42399r;
        this.f42399r = pagerAdapter;
        this.f42397n = 0;
        if (pagerAdapter != null) {
            if (this.f42387N == null) {
                this.f42387N = new PagerObserver();
            }
            this.f42399r.Ik(this.f42387N);
            this.f42381FX = false;
            boolean z2 = this.f42382G7;
            this.f42382G7 = true;
            this.f42397n = this.f42399r.O();
            if (this.f42389S >= 0) {
                this.f42399r.az(this.f42394g, this.E2);
                bzg(this.f42389S, false, true);
                this.f42389S = -1;
                this.f42394g = null;
                this.E2 = null;
            } else if (z2) {
                requestLayout();
            } else {
                E2();
            }
        }
        List list = this.qm;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.qm.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((OnAdapterChangeListener) this.qm.get(i3)).rl(this, pagerAdapter3, pagerAdapter);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.Jk = onPageChangeListener;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f42401v;
        this.f42401v = i2;
        int width = getWidth();
        X(width, width, i2, i3);
        requestLayout();
    }

    void setScrollState(int i2) {
        if (this.EWS == i2) {
            return;
        }
        this.EWS = i2;
        if (this.mYa != null) {
            ty(i2 != 0);
        }
        qie(i2);
    }

    public void t(OnPageChangeListener onPageChangeListener) {
        if (this.n1 == null) {
            this.n1 = new ArrayList();
        }
        this.n1.add(onPageChangeListener);
    }

    boolean te() {
        PagerAdapter pagerAdapter = this.f42399r;
        if (pagerAdapter == null || this.f42398o >= pagerAdapter.O() - 1) {
            return false;
        }
        rV9(this.f42398o + 1, true);
        return true;
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42400t = new ArrayList();
        this.f42388O = new ItemInfo();
        this.J2 = new Rect();
        this.f42389S = -1;
        this.f42394g = null;
        this.E2 = null;
        this.P5 = -3.4028235E38f;
        this.M7 = Float.MAX_VALUE;
        this.f42377B = 1;
        this.piY = -1;
        this.f42382G7 = true;
        this.fcU = false;
        this.Po6 = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.E2();
            }
        };
        this.EWS = 0;
        S();
    }

    private static boolean WPU(View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    private ItemInfo Z() {
        float scrollX;
        float f3;
        int i2;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
        } else {
            scrollX = 0.0f;
        }
        if (clientWidth > 0) {
            f3 = this.f42401v / clientWidth;
        } else {
            f3 = 0.0f;
        }
        int i3 = 0;
        boolean z2 = true;
        ItemInfo itemInfo = null;
        int i5 = -1;
        float f5 = 0.0f;
        while (i3 < this.f42400t.size()) {
            ItemInfo itemInfo2 = (ItemInfo) this.f42400t.get(i3);
            if (!z2 && itemInfo2.rl != (i2 = i5 + 1)) {
                itemInfo2 = this.f42388O;
                itemInfo2.f42406O = f4 + f5 + f3;
                itemInfo2.rl = i2;
                itemInfo2.nr = this.f42399r.KN(i2);
                i3--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f4 = itemInfo3.f42406O;
            float f6 = itemInfo3.nr + f4 + f3;
            if (!z2 && scrollX < f4) {
                break;
            }
            if (scrollX >= f6 && i3 != this.f42400t.size() - 1) {
                int i7 = itemInfo3.rl;
                float f7 = itemInfo3.nr;
                i3++;
                i5 = i7;
                f5 = f7;
                itemInfo = itemInfo3;
                z2 = false;
            } else {
                return itemInfo3;
            }
        }
        return itemInfo;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void nY(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.piY) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.Nxk = motionEvent.getX(i2);
            this.piY = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.ijL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void s7N(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private void ty(boolean z2) {
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (z2) {
                i2 = this.Org;
            } else {
                i2 = 0;
            }
            getChildAt(i3).setLayerType(i2, null);
        }
    }

    private void v(int i2, boolean z2, int i3, boolean z3) {
        int clientWidth;
        ItemInfo itemInfoXQ = XQ(i2);
        if (itemInfoXQ != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.P5, Math.min(itemInfoXQ.f42406O, this.M7)));
        } else {
            clientWidth = 0;
        }
        if (z2) {
            U(clientWidth, 0, i3);
            if (z3) {
                gh(i2);
                return;
            }
            return;
        }
        if (z3) {
            gh(i2);
        }
        Uo(false);
        scrollTo(clientWidth, 0);
        iF(clientWidth);
    }

    private int xMQ(int i2, float f3, int i3, int i5) {
        float f4;
        if (Math.abs(i5) > this.xg && Math.abs(i3) > this.f42396m) {
            if (i3 <= 0) {
                i2++;
            }
        } else {
            if (i2 >= this.f42398o) {
                f4 = 0.4f;
            } else {
                f4 = 0.6f;
            }
            i2 += (int) (f3 + f4);
        }
        if (this.f42400t.size() > 0) {
            return Math.max(((ItemInfo) this.f42400t.get(0)).rl, Math.min(i2, ((ItemInfo) this.f42400t.get(r4.size() - 1)).rl));
        }
        return i2;
    }

    void U(int i2, int i3, int i5) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f42393e;
        if (scroller != null && !scroller.isFinished()) {
            if (this.f42390T) {
                scrollX = this.f42393e.getCurrX();
            } else {
                scrollX = this.f42393e.getStartX();
            }
            this.f42393e.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i7 = scrollX;
        int scrollY = getScrollY();
        int i8 = i2 - i7;
        int i9 = i3 - scrollY;
        if (i8 == 0 && i9 == 0) {
            Uo(false);
            E2();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f3 = clientWidth;
        float f4 = i10;
        float fAz = f4 + (az(Math.min(1.0f, (Math.abs(i8) * 1.0f) / f3)) * f4);
        int iAbs2 = Math.abs(i5);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fAz / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i8) / ((f3 * this.f42399r.KN(this.f42398o)) + this.f42401v)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
        this.f42390T = false;
        this.f42393e.startScroll(i7, scrollY, i8, i9, iMin);
        ViewCompat.GR(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        ItemInfo itemInfoO;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0 && (itemInfoO = o(childAt)) != null && itemInfoO.rl == this.f42398o) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zWPU = layoutParams2.f42410n | WPU(view);
        layoutParams2.f42410n = zWPU;
        if (this.f42380E) {
            if (!zWPU) {
                layoutParams2.nr = true;
                addViewInLayout(view, i2, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean ck(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return nr(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return nr(1);
                        }
                        return false;
                    }
                    return false;
                }
                if (keyEvent.hasModifiers(2)) {
                    return te();
                }
                return nr(66);
            }
            if (keyEvent.hasModifiers(2)) {
                return g();
            }
            return nr(17);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !ck(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoO;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (itemInfoO = o(childAt)) != null && itemInfoO.rl == this.f42398o && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.f42399r) == null || pagerAdapter.O() <= 1)) {
            this.f42378C.finish();
            this.Mx.finish();
        } else {
            if (!this.f42378C.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.P5 * width);
                this.f42378C.setSize(height, width);
                zDraw = this.f42378C.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Mx.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.M7 + 1.0f)) * width2);
                this.Mx.setSize(height2, width2);
                zDraw |= this.Mx.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            ViewCompat.GR(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.Xw;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean nr(int i2) {
        boolean zG;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i2 == 17) {
                int i3 = Ik(this.J2, viewFindNextFocus).left;
                int i5 = Ik(this.J2, viewFindFocus).left;
                if (viewFindFocus != null && i3 >= i5) {
                    zG = g();
                } else {
                    zG = viewFindNextFocus.requestFocus();
                }
            } else if (i2 == 66) {
                int i7 = Ik(this.J2, viewFindNextFocus).left;
                int i8 = Ik(this.J2, viewFindFocus).left;
                if (viewFindFocus != null && i7 <= i8) {
                    zG = te();
                } else {
                    zG = viewFindNextFocus.requestFocus();
                }
            }
        } else if (i2 != 17 && i2 != 1) {
            if (i2 != 66 && i2 != 2) {
                zG = false;
            } else {
                zG = te();
            }
        } else {
            zG = g();
        }
        if (zG) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zG;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42382G7 = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f3;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f42385J) {
                    return true;
                }
                if (this.f42379D) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        nY(motionEvent);
                    }
                } else {
                    int i2 = this.piY;
                    if (i2 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float f4 = x2 - this.Nxk;
                        float fAbs = Math.abs(f4);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y2 - this.f42402z);
                        if (f4 != 0.0f && !aYN(this.Nxk, f4) && J2(this, false, (int) f4, (int) x2, (int) y2)) {
                            this.Nxk = x2;
                            this.f42395k = y2;
                            this.f42379D = true;
                            return false;
                        }
                        int i3 = this.f42383GR;
                        if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                            this.f42385J = true;
                            s7N(true);
                            setScrollState(1);
                            float f5 = this.dR0;
                            float f6 = this.f42383GR;
                            if (f4 > 0.0f) {
                                f3 = f5 + f6;
                            } else {
                                f3 = f5 - f6;
                            }
                            this.Nxk = f3;
                            this.f42395k = y2;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i3) {
                            this.f42379D = true;
                        }
                        if (this.f42385J && fD(x2)) {
                            ViewCompat.GR(this);
                        }
                    }
                }
            } else {
                float x3 = motionEvent.getX();
                this.dR0 = x3;
                this.Nxk = x3;
                float y3 = motionEvent.getY();
                this.f42402z = y3;
                this.f42395k = y3;
                this.piY = motionEvent.getPointerId(0);
                this.f42379D = false;
                this.f42390T = true;
                this.f42393e.computeScrollOffset();
                if (this.EWS == 2 && Math.abs(this.f42393e.getFinalX() - this.f42393e.getCurrX()) > this.pJg) {
                    this.f42393e.abortAnimation();
                    this.f42381FX = false;
                    E2();
                    this.f42385J = true;
                    s7N(true);
                    setScrollState(1);
                } else {
                    Uo(false);
                    this.f42385J = false;
                }
            }
            if (this.ijL == null) {
                this.ijL = VelocityTracker.obtain();
            }
            this.ijL.addMovement(motionEvent);
            return this.f42385J;
        }
        wTp();
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i5;
        int i7;
        ItemInfo itemInfoO;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i7 = 1;
        } else {
            i3 = childCount - 1;
            i5 = -1;
            i7 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (itemInfoO = o(childAt)) != null && itemInfoO.rl == this.f42398o && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i7;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f42413O = this.f42398o;
        PagerAdapter pagerAdapter = this.f42399r;
        if (pagerAdapter != null) {
            savedState.J2 = pagerAdapter.ty();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        super.onSizeChanged(i2, i3, i5, i7);
        if (i2 != i5) {
            int i8 = this.f42401v;
            X(i2, i5, i8, i8);
        }
    }

    ItemInfo r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return o(view);
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.Xw) {
            return false;
        }
        return true;
    }

    public void setPageMarginDrawable(@DrawableRes int i2) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i2));
    }
}
