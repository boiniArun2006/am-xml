package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static boolean f42448E = true;
    private Parcelable E2;
    int J2;
    private boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ScrollEventAdapter f42449N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CompositeOnPageChangeCallback f42450O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    LinearLayoutManager f42451S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private PagerSnapHelper f42452T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private RecyclerView.ItemAnimator f42453U;
    private FakeDrag Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    RecyclerView f42454e;
    AccessibilityProvider eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42455g;
    private PageTransformerAdapter jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f42456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f42457o;
    private int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f42458r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f42459t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CompositeOnPageChangeCallback f42460v;

    private abstract class AccessibilityProvider {
        private AccessibilityProvider() {
        }

        void Ik() {
        }

        void J2(RecyclerView.Adapter adapter) {
        }

        void KN(CompositeOnPageChangeCallback compositeOnPageChangeCallback, RecyclerView recyclerView) {
        }

        void O(RecyclerView.Adapter adapter) {
        }

        void Z() {
        }

        void ck(AccessibilityEvent accessibilityEvent) {
        }

        void gh(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        void mUb(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        boolean n() {
            return false;
        }

        boolean nr() {
            return false;
        }

        void o() {
        }

        void r() {
        }

        boolean rl(int i2) {
            return false;
        }

        boolean t(int i2, Bundle bundle) {
            return false;
        }

        void ty() {
        }

        void xMQ(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        CharSequence HI() {
            throw new IllegalStateException("Not implemented.");
        }

        String Uo() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean az(int i2, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean qie(int i2) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    class BasicAccessibilityProvider extends AccessibilityProvider {
        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean nr() {
            return true;
        }

        BasicAccessibilityProvider() {
            super();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void mUb(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (ViewPager2.this.O()) {
                return;
            }
            accessibilityNodeInfoCompat.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36858r);
            accessibilityNodeInfoCompat.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.Ik);
            accessibilityNodeInfoCompat.F(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean rl(int i2) {
            return (i2 == 8192 || i2 == 4096) && !ViewPager2.this.O();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public CharSequence HI() {
            if (nr()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean qie(int i2) {
            if (rl(i2)) {
                return false;
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i5) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }
    }

    private class LinearLayoutManagerImpl extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean NP(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            return false;
        }

        LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void HBN(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewPager2.this.eF.gh(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean Lp6(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, Bundle bundle) {
            return ViewPager2.this.eF.rl(i2) ? ViewPager2.this.eF.qie(i2) : super.Lp6(recycler, state, i2, bundle);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void iV(RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.iV(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void ub(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.ub(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.eF.mUb(accessibilityNodeInfoCompat);
        }
    }

    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void n(int i2) {
        }

        public void rl(int i2, float f3, int i3) {
        }

        public void t(int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    class PageAwareAccessibilityProvider extends AccessibilityProvider {
        private RecyclerView.AdapterDataObserver nr;
        private final AccessibilityViewCommand rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final AccessibilityViewCommand f42468t;

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void KN(CompositeOnPageChangeCallback compositeOnPageChangeCallback, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.nr = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    PageAwareAccessibilityProvider.this.ViF();
                }
            };
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean n() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean t(int i2, Bundle bundle) {
            return i2 == 8192 || i2 == 4096;
        }

        PageAwareAccessibilityProvider() {
            super();
            this.rl = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean n(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    PageAwareAccessibilityProvider.this.aYN(((ViewPager2) view).getCurrentItem() + 1);
                    return true;
                }
            };
            this.f42468t = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean n(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    PageAwareAccessibilityProvider.this.aYN(((ViewPager2) view).getCurrentItem() - 1);
                    return true;
                }
            };
        }

        private void S(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f42451S.fcU(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f42451S.fcU(view) : 0, 1, false, false));
        }

        private void WPU(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.O()) {
                return;
            }
            if (ViewPager2.this.J2 > 0) {
                accessibilityNodeInfoCompat.n(8192);
            }
            if (ViewPager2.this.J2 < itemCount - 1) {
                accessibilityNodeInfoCompat.n(4096);
            }
            accessibilityNodeInfoCompat.F(true);
        }

        private void XQ(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            accessibilityNodeInfoCompat.Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(itemCount2, itemCount, false, 0));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void J2(RecyclerView.Adapter adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.nr);
            }
        }

        void ViF() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = R.id.accessibilityActionPageLeft;
            ViewCompat.k(viewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.k(viewPager2, R.id.accessibilityActionPageRight);
            ViewCompat.k(viewPager2, R.id.accessibilityActionPageUp);
            ViewCompat.k(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.O()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.J2 < itemCount - 1) {
                    ViewCompat.z(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, null), null, this.rl);
                }
                if (ViewPager2.this.J2 > 0) {
                    ViewCompat.z(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, null), null, this.f42468t);
                    return;
                }
                return;
            }
            boolean zNr = ViewPager2.this.nr();
            int i3 = zNr ? 16908360 : 16908361;
            if (zNr) {
                i2 = 16908361;
            }
            if (ViewPager2.this.J2 < itemCount - 1) {
                ViewCompat.z(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i3, null), null, this.rl);
            }
            if (ViewPager2.this.J2 > 0) {
                ViewCompat.z(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, this.f42468t);
            }
        }

        void aYN(int i2) {
            if (ViewPager2.this.O()) {
                ViewPager2.this.gh(i2, true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void ck(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(Uo());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void Ik() {
            ViF();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void O(RecyclerView.Adapter adapter) {
            ViF();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.nr);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public String Uo() {
            if (n()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void Z() {
            ViF();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean az(int i2, Bundle bundle) {
            int currentItem;
            if (t(i2, bundle)) {
                if (i2 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                aYN(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        void gh(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            S(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void o() {
            ViF();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void r() {
            ViF();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void ty() {
            ViF();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void xMQ(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZmq = AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo);
            XQ(accessibilityNodeInfoCompatZmq);
            WPU(accessibilityNodeInfoCompatZmq);
        }
    }

    public interface PageTransformer {
        void n(View view, float f3);
    }

    private class PagerSnapHelperImpl extends PagerSnapHelper {
        PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View KN(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.t()) {
                return null;
            }
            return super.KN(layoutManager);
        }
    }

    private class RecyclerViewImpl extends RecyclerView {
        RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.eF.nr() ? ViewPager2.this.eF.HI() : super.getAccessibilityClassName();
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.O() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.O() && super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.J2);
            accessibilityEvent.setToIndex(ViewPager2.this.J2);
            ViewPager2.this.eF.ck(accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollState {
    }

    private static class SmoothScrollToPosition implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f42476n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final RecyclerView f42477t;

        @Override // java.lang.Runnable
        public void run() {
            this.f42477t.smoothScrollToPosition(this.f42476n);
        }

        SmoothScrollToPosition(int i2, RecyclerView recyclerView) {
            this.f42476n = i2;
            this.f42477t = recyclerView;
        }
    }

    public void setCurrentItem(int i2) {
        mUb(i2, true);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.p5 = i2;
        this.f42454e.requestLayout();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.P5) {
                this.f42453U = this.f42454e.getItemAnimator();
                this.P5 = true;
            }
            this.f42454e.setItemAnimator(null);
        } else if (this.P5) {
            this.f42454e.setItemAnimator(this.f42453U);
            this.f42453U = null;
            this.P5 = false;
        }
        if (pageTransformer == this.jB.nr()) {
            return;
        }
        this.jB.O(pageTransformer);
        KN();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
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

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Parcelable f42473O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42474n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f42475t;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            n(parcel, classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void n(Parcel parcel, ClassLoader classLoader) {
            this.f42474n = parcel.readInt();
            this.f42475t = parcel.readInt();
            this.f42473O = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f42474n);
            parcel.writeInt(this.f42475t);
            parcel.writeParcelable(this.f42473O, i2);
        }
    }

    private void J2(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f42457o);
        }
    }

    private void az(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f42457o);
        }
    }

    private RecyclerView.OnChildAttachStateChangeListener n() {
        return new RecyclerView.OnChildAttachStateChangeListener() { // from class: androidx.viewpager2.widget.ViewPager2.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void rl(View view) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void nr(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                } else {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        };
    }

    private void qie(Context context, AttributeSet attributeSet) {
        int[] iArr = androidx.viewpager2.R.styleable.f42415n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.ijL(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(androidx.viewpager2.R.styleable.rl, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void rl(Context context, AttributeSet attributeSet) {
        this.eF = f42448E ? new PageAwareAccessibilityProvider() : new BasicAccessibilityProvider();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f42454e = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.f42454e.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.f42451S = linearLayoutManagerImpl;
        this.f42454e.setLayoutManager(linearLayoutManagerImpl);
        this.f42454e.setScrollingTouchSlop(1);
        qie(context, attributeSet);
        this.f42454e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f42454e.addOnChildAttachStateChangeListener(n());
        ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
        this.f42449N = scrollEventAdapter;
        this.Xw = new FakeDrag(this, scrollEventAdapter, this.f42454e);
        PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
        this.f42452T = pagerSnapHelperImpl;
        pagerSnapHelperImpl.rl(this.f42454e);
        this.f42454e.addOnScrollListener(this.f42449N);
        CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(3);
        this.f42460v = compositeOnPageChangeCallback;
        this.f42449N.HI(compositeOnPageChangeCallback);
        OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void n(int i2) {
                if (i2 == 0) {
                    ViewPager2.this.HI();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void t(int i2) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.J2 != i2) {
                    viewPager2.J2 = i2;
                    viewPager2.eF.r();
                }
            }
        };
        OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void t(int i2) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.f42454e.requestFocus(2);
                }
            }
        };
        this.f42460v.nr(onPageChangeCallback);
        this.f42460v.nr(onPageChangeCallback2);
        this.eF.KN(this.f42460v, this.f42454e);
        this.f42460v.nr(this.f42450O);
        PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.f42451S);
        this.jB = pageTransformerAdapter;
        this.f42460v.nr(pageTransformerAdapter);
        RecyclerView recyclerView = this.f42454e;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void xMQ() {
        RecyclerView.Adapter adapter;
        if (this.f42455g == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.E2;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).xMQ(parcelable);
            }
            this.E2 = null;
        }
        int iMax = Math.max(0, Math.min(this.f42455g, adapter.getItemCount() - 1));
        this.J2 = iMax;
        this.f42455g = -1;
        this.f42454e.scrollToPosition(iMax);
        this.eF.ty();
    }

    void HI() {
        PagerSnapHelper pagerSnapHelper = this.f42452T;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewKN = pagerSnapHelper.KN(this.f42451S);
        if (viewKN == null) {
            return;
        }
        int iFcU = this.f42451S.fcU(viewKN);
        if (iFcU != this.J2 && getScrollState() == 0) {
            this.f42460v.t(iFcU);
        }
        this.f42458r = false;
    }

    public void KN() {
        if (this.jB.nr() == null) {
            return;
        }
        double dUo = this.f42449N.Uo();
        int i2 = (int) dUo;
        float f3 = (float) (dUo - ((double) i2));
        this.jB.rl(i2, f3, Math.round(getPageSize() * f3));
    }

    public boolean O() {
        return this.M7;
    }

    public void Uo(OnPageChangeCallback onPageChangeCallback) {
        this.f42450O.nr(onPageChangeCallback);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.f42454e.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.f42454e.canScrollVertically(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi
    public CharSequence getAccessibilityClassName() {
        return this.eF.n() ? this.eF.Uo() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.f42454e.getAdapter();
    }

    public int getCurrentItem() {
        return this.J2;
    }

    public int getItemDecorationCount() {
        return this.f42454e.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.p5;
    }

    public int getOrientation() {
        return this.f42451S.C7B() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f42454e;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f42449N.KN();
    }

    boolean nr() {
        return this.f42451S.m() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int measuredWidth = this.f42454e.getMeasuredWidth();
        int measuredHeight = this.f42454e.getMeasuredHeight();
        this.f42456n.left = getPaddingLeft();
        this.f42456n.right = (i5 - i2) - getPaddingRight();
        this.f42456n.top = getPaddingTop();
        this.f42456n.bottom = (i7 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f42456n, this.f42459t);
        RecyclerView recyclerView = this.f42454e;
        Rect rect = this.f42459t;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f42458r) {
            HI();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        measureChild(this.f42454e, i2, i3);
        int measuredWidth = this.f42454e.getMeasuredWidth();
        int measuredHeight = this.f42454e.getMeasuredHeight();
        int measuredState = this.f42454e.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f42455g = savedState.f42475t;
        this.E2 = savedState.f42473O;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.eF.t(i2, bundle) ? this.eF.az(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f42454e.getAdapter();
        this.eF.J2(adapter2);
        az(adapter2);
        this.f42454e.setAdapter(adapter);
        this.J2 = 0;
        xMQ();
        this.eF.O(adapter);
        J2(adapter);
    }

    public void setOrientation(int i2) {
        this.f42451S.V5F(i2);
        this.eF.o();
    }

    public void setUserInputEnabled(boolean z2) {
        this.M7 = z2;
        this.eF.Z();
    }

    public boolean t() {
        return this.Xw.n();
    }

    public void ty(OnPageChangeCallback onPageChangeCallback) {
        this.f42450O.O(onPageChangeCallback);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42456n = new Rect();
        this.f42459t = new Rect();
        this.f42450O = new CompositeOnPageChangeCallback(3);
        this.f42458r = false;
        this.f42457o = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.f42458r = true;
                viewPager2.f42449N.qie();
            }
        };
        this.f42455g = -1;
        this.f42453U = null;
        this.P5 = false;
        this.M7 = true;
        this.p5 = -1;
        rl(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).f42474n;
            sparseArray.put(this.f42454e.getId(), (Parcelable) sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        xMQ();
    }

    void gh(int i2, boolean z2) {
        int i3;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f42455g != -1) {
                this.f42455g = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() > 0) {
            int iMin = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
            if (iMin != this.J2 || !this.f42449N.mUb()) {
                int i5 = this.J2;
                if (iMin == i5 && z2) {
                    return;
                }
                double dUo = i5;
                this.J2 = iMin;
                this.eF.r();
                if (!this.f42449N.mUb()) {
                    dUo = this.f42449N.Uo();
                }
                this.f42449N.az(iMin, z2);
                if (!z2) {
                    this.f42454e.scrollToPosition(iMin);
                    return;
                }
                double d2 = iMin;
                if (Math.abs(d2 - dUo) > 3.0d) {
                    RecyclerView recyclerView = this.f42454e;
                    if (d2 > dUo) {
                        i3 = iMin - 3;
                    } else {
                        i3 = iMin + 3;
                    }
                    recyclerView.scrollToPosition(i3);
                    RecyclerView recyclerView2 = this.f42454e;
                    recyclerView2.post(new SmoothScrollToPosition(iMin, recyclerView2));
                    return;
                }
                this.f42454e.smoothScrollToPosition(iMin);
            }
        }
    }

    public void mUb(int i2, boolean z2) {
        if (!t()) {
            gh(i2, z2);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.eF.xMQ(accessibilityNodeInfo);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f42474n = this.f42454e.getId();
        int i2 = this.f42455g;
        if (i2 == -1) {
            i2 = this.J2;
        }
        savedState.f42475t = i2;
        Parcelable parcelable = this.E2;
        if (parcelable != null) {
            savedState.f42473O = parcelable;
            return savedState;
        }
        Object adapter = this.f42454e.getAdapter();
        if (adapter instanceof StatefulAdapter) {
            savedState.f42473O = ((StatefulAdapter) adapter).n();
        }
        return savedState;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.eF.Ik();
    }
}
