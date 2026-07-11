package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.ViewBoundsCheck;
import androidx.recyclerview.widget.ViewInfoStore;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mfo.CLVG.aNrWBQYwFf;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;

    @VisibleForTesting
    DifferentialMotionFlingController mDifferentialMotionFlingController;
    private final DifferentialMotionFlingTarget mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;

    @VisibleForTesting
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;

    @VisibleForTesting
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i2) {
            if (adapter == this) {
                return i2;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1L;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.nr(i2, 1);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.nr(i2, i3);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i2);

        public void onBindViewHolder(@NonNull VH vh, int i2, @NonNull List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i2) {
            boolean z2 = vh.mBindingAdapter == null;
            if (z2) {
                vh.mPosition = i2;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i2);
                }
                vh.setFlags(1, 519);
                if (TraceCompat.t()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh.mItemViewType)));
                }
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow() != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                }
                if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            if (z2) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f41170t = true;
                }
                Trace.endSection();
            }
        }

        boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.n();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.rl();
        }

        public final void notifyItemChanged(int i2, @Nullable Object obj) {
            this.mObservable.O(i2, 1, obj);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.J2(i2, 1);
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.t(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3, @Nullable Object obj) {
            this.mObservable.O(i2, i3, obj);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.J2(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.Uo(i2, i3);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.Uo(i2, 1);
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.KN();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i2) {
            try {
                if (TraceCompat.t()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i2)));
                }
                VH vh = (VH) onCreateViewHolder(viewGroup, i2);
                if (vh.itemView.getParent() == null) {
                    vh.mItemViewType = i2;
                    Trace.endSection();
                    return vh;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public void setHasStableIds(boolean z2) {
            if (!hasObservers()) {
                this.mHasStableIds = z2;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public void nr(int i2, int i3) {
            O(i2, i3, null);
        }

        public void J2(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i2, i3);
            }
        }

        public void KN() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public void O(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i2, i3, obj);
            }
        }

        public void Uo(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i2, i3);
            }
        }

        public boolean n() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void rl() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void t(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i2, i3, 1);
            }
        }

        AdapterDataObservable() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i2, int i3) {
        }

        public void onItemRangeInserted(int i2, int i3) {
        }

        public void onItemRangeMoved(int i2, int i3, int i5) {
        }

        public void onItemRangeRemoved(int i2, int i3) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
            onItemRangeChanged(i2, i3);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface ChildDrawingOrderCallback {
        int n(int i2, int i3);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        protected EdgeEffect n(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class ItemAnimator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ItemAnimatorListener f41156n = null;
        private ArrayList rl = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f41157t = 120;
        private long nr = 120;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f41155O = 250;
        private long J2 = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void n();
        }

        interface ItemAnimatorListener {
            void n(ViewHolder viewHolder);
        }

        public static class ItemHolderInfo {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f41158n;
            public int nr;
            public int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f41159t;

            public ItemHolderInfo n(ViewHolder viewHolder) {
                return rl(viewHolder, 0);
            }

            public ItemHolderInfo rl(ViewHolder viewHolder, int i2) {
                View view = viewHolder.itemView;
                this.f41158n = view.getLeft();
                this.rl = view.getTop();
                this.f41159t = view.getRight();
                this.nr = view.getBottom();
                return this;
            }
        }

        public boolean J2(ViewHolder viewHolder) {
            return true;
        }

        public abstract void S();

        public abstract boolean ck();

        public abstract void gh();

        public abstract void mUb(ViewHolder viewHolder);

        public abstract boolean n(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean nr(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public void o(ViewHolder viewHolder) {
        }

        public abstract boolean rl(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean t(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        static int O(ViewHolder viewHolder) {
            int i2 = viewHolder.mFlags;
            int i3 = i2 & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i3 | 2048;
                }
            }
            return i3;
        }

        public long HI() {
            return this.nr;
        }

        void WPU(ItemAnimatorListener itemAnimatorListener) {
            this.f41156n = itemAnimatorListener;
        }

        public long az() {
            return this.J2;
        }

        public long qie() {
            return this.f41157t;
        }

        public ItemHolderInfo r() {
            return new ItemHolderInfo();
        }

        public long ty() {
            return this.f41155O;
        }

        public final void xMQ() {
            int size = this.rl.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ItemAnimatorFinishedListener) this.rl.get(i2)).n();
            }
            this.rl.clear();
        }

        public final boolean Ik(ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean zCk = ck();
            if (itemAnimatorFinishedListener != null) {
                if (!zCk) {
                    itemAnimatorFinishedListener.n();
                    return zCk;
                }
                this.rl.add(itemAnimatorFinishedListener);
            }
            return zCk;
        }

        public final void KN(ViewHolder viewHolder) {
            o(viewHolder);
            ItemAnimatorListener itemAnimatorListener = this.f41156n;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.n(viewHolder);
            }
        }

        public boolean Uo(ViewHolder viewHolder, List list) {
            return J2(viewHolder);
        }

        public ItemHolderInfo XQ(State state, ViewHolder viewHolder, int i2, List list) {
            return r().n(viewHolder);
        }

        public ItemHolderInfo Z(State state, ViewHolder viewHolder) {
            return r().n(viewHolder);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void n(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(viewHolder.itemView) || !viewHolder.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
        }

        ItemAnimatorRestoreListener() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static abstract class LayoutManager {
        private int HI;
        private int Ik;
        ViewBoundsCheck J2;
        boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        ViewBoundsCheck f41161O;
        SmoothScroller Uo;
        int az;
        private int ck;
        private boolean gh;
        boolean mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ChildHelper f41162n;
        private final ViewBoundsCheck.Callback nr;
        private boolean qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f41163r;
        RecyclerView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ViewBoundsCheck.Callback f41164t;
        boolean ty;
        boolean xMQ;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public interface LayoutPrefetchRegistry {
            void n(int i2, int i3);
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static class Properties {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f41167n;
            public boolean nr;
            public int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public boolean f41168t;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int FX(int i2, int i3, int i5, int i7, boolean z2) {
            int iMax = Math.max(0, i2 - i5);
            if (z2) {
                if (i7 < 0) {
                    if (i7 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                        i3 = 0;
                        i7 = 0;
                    } else {
                        i7 = iMax;
                    }
                }
                i3 = 1073741824;
            } else if (i7 >= 0) {
                i3 = 1073741824;
            } else if (i7 != -1) {
                if (i7 == -2) {
                    if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                        i7 = iMax;
                        i3 = Integer.MIN_VALUE;
                    } else {
                        i7 = iMax;
                        i3 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i7, i3);
        }

        public View Bu(View view, int i2, Recycler recycler, State state) {
            return null;
        }

        public boolean D76(RecyclerView recyclerView, View view, Rect rect, boolean z2) {
            return NP(recyclerView, view, rect, z2, false);
        }

        public int E2(State state) {
            return 0;
        }

        public void EF(RecyclerView recyclerView, int i2, int i3) {
        }

        public void Ik(View view, int i2) {
            Z(view, i2, true);
        }

        public void JVN(RecyclerView recyclerView, int i2, int i3, int i5) {
        }

        public int Jk(Recycler recycler, State state) {
            return 0;
        }

        public boolean Mh(Recycler recycler, State state, View view, int i2, Bundle bundle) {
            return false;
        }

        public int N(State state) {
            return 0;
        }

        public void QZ6(Adapter adapter, Adapter adapter2) {
        }

        public int T(State state) {
            return 0;
        }

        public abstract LayoutParams U();

        public View UF(View view, int i2) {
            return null;
        }

        public boolean UhV(Recycler recycler, State state) {
            return false;
        }

        public boolean ViF() {
            return false;
        }

        public void VwL(RecyclerView recyclerView) {
        }

        public int X(State state) {
            return 0;
        }

        public void X4T(RecyclerView recyclerView, int i2, int i3) {
        }

        public void Zmq(RecyclerView recyclerView) {
        }

        void bzg(RecyclerView recyclerView, Recycler recycler) {
            this.xMQ = false;
            T3L(recyclerView, recycler);
        }

        public void ck(View view) {
            Ik(view, -1);
        }

        public int e(State state) {
            return 0;
        }

        public void fD(int i2, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public boolean g(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public boolean i() {
            return false;
        }

        public void iF(int i2, int i3, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void j() {
            this.KN = true;
        }

        boolean l() {
            return false;
        }

        public boolean lS() {
            return false;
        }

        public void mI(RecyclerView recyclerView) {
        }

        public void n7b(int i2) {
        }

        public int nHg(State state) {
            return 0;
        }

        public boolean nY() {
            return false;
        }

        public void o(View view, int i2) {
            Z(view, i2, false);
        }

        public Parcelable o9() {
            return null;
        }

        public int p5() {
            return -1;
        }

        public void r(View view) {
            o(view, -1);
        }

        void rV9(RecyclerView recyclerView) {
            this.xMQ = true;
            VwL(recyclerView);
        }

        public int rxp(int i2, Recycler recycler, State state) {
            return 0;
        }

        public boolean tFV(RecyclerView recyclerView, ArrayList arrayList, int i2, int i3) {
            return false;
        }

        public void v0j(Parcelable parcelable) {
        }

        public int waP(int i2, Recycler recycler, State state) {
            return 0;
        }

        public void xVH(RecyclerView recyclerView, int i2, int i3) {
        }

        public void y(State state) {
        }

        public static Properties eWT(Context context, AttributeSet attributeSet, int i2, int i3) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.f40963n, i2, i3);
            properties.f41167n = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.rl, 1);
            properties.rl = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.qie, 1);
            properties.f41168t = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.gh, false);
            properties.nr = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.az, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        private void v(int i2, View view) {
            this.f41162n.nr(i2);
        }

        void Aum(SmoothScroller smoothScroller) {
            if (this.Uo == smoothScroller) {
                this.Uo = null;
            }
        }

        public int C() {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int D(Recycler recycler, State state) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView == null || recyclerView.mAdapter == null || !ViF()) {
                return 1;
            }
            return this.rl.mAdapter.getItemCount();
        }

        public View E(int i2) {
            ChildHelper childHelper = this.f41162n;
            if (childHelper != null) {
                return childHelper.J2(i2);
            }
            return null;
        }

        public void EN(int i2, int i3) {
            this.rl.setMeasuredDimension(i2, i3);
        }

        public void F(int i2) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        public int G7() {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean GD() {
            return this.xMQ;
        }

        public boolean How() {
            SmoothScroller smoothScroller = this.Uo;
            return smoothScroller != null && smoothScroller.KN();
        }

        public boolean J() {
            RecyclerView recyclerView = this.rl;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public void LPV(int i2) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean Lp6(Recycler recycler, State state, int i2, Bundle bundle) {
            int iG7;
            int iC;
            float f3;
            if (this.rl == null) {
                return false;
            }
            int iPiY = piY();
            int iMYa = mYa();
            Rect rect = new Rect();
            if (this.rl.getMatrix().isIdentity() && this.rl.getGlobalVisibleRect(rect)) {
                iPiY = rect.height();
                iMYa = rect.width();
            }
            if (i2 == 4096) {
                iG7 = this.rl.canScrollVertically(1) ? (iPiY - G7()) - ofS() : 0;
                if (this.rl.canScrollHorizontally(1)) {
                    iC = (iMYa - C()) - Mx();
                }
            } else if (i2 != 8192) {
                iG7 = 0;
                iC = 0;
            } else {
                iG7 = this.rl.canScrollVertically(-1) ? -((iPiY - G7()) - ofS()) : 0;
                iC = this.rl.canScrollHorizontally(-1) ? -((iMYa - C()) - Mx()) : 0;
            }
            if (iG7 == 0 && iC == 0) {
                return false;
            }
            if (bundle != null) {
                f3 = bundle.getFloat(aNrWBQYwFf.qMlOLZPi, 1.0f);
                if (f3 < 0.0f) {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f3 + ")");
                }
            } else {
                f3 = 1.0f;
            }
            if (Float.compare(f3, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f3) != 0 && Float.compare(0.0f, f3) != 0) {
                    iC = (int) (iC * f3);
                    iG7 = (int) (iG7 * f3);
                }
                this.rl.smoothScrollBy(iC, iG7, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.rl;
            Adapter adapter = recyclerView.mAdapter;
            if (adapter == null) {
                return false;
            }
            if (i2 == 4096) {
                recyclerView.smoothScrollToPosition(adapter.getItemCount() - 1);
            } else if (i2 == 8192) {
                recyclerView.smoothScrollToPosition(0);
            }
            return true;
        }

        public int M() {
            ChildHelper childHelper = this.f41162n;
            if (childHelper != null) {
                return childHelper.Uo();
            }
            return 0;
        }

        public LayoutParams M7(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int Mx() {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int Org() {
            return this.HI;
        }

        public LayoutParams P5(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public boolean Po6() {
            return this.mUb;
        }

        public void QgZ() {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final void Ro(boolean z2) {
            if (z2 != this.qie) {
                this.qie = z2;
                this.az = 0;
                RecyclerView recyclerView = this.rl;
                if (recyclerView != null) {
                    recyclerView.mRecycler.Xw();
                }
            }
        }

        public void Uf(Recycler recycler, State state, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.rl.canScrollVertically(-1) && !this.rl.canScrollHorizontally(-1) && !this.rl.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            Adapter adapter = this.rl.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void Vvq(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void XNZ(View view) {
            this.rl.removeDetachedView(view, false);
        }

        public void XQ(String str) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public View Xw(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.rl;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f41162n.ty(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public void Zn(Recycler recycler, State state, int i2, int i3) {
            this.rl.defaultOnMeasure(i2, i3);
        }

        public void a63(int i2) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void aYN(View view, Rect rect) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        boolean eo(View view, int i2, int i3, LayoutParams layoutParams) {
            return (this.gh && K(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).width) && K(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        void f(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.rl;
            ub(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        boolean g6(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.rl;
            return Mh(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public final boolean hRu() {
            return this.qie;
        }

        public int ijL() {
            return this.ck;
        }

        public void lNy(View view) {
            this.f41162n.ck(view);
        }

        public int m() {
            return this.rl.getLayoutDirection();
        }

        public int mYa() {
            return this.Ik;
        }

        void mx() {
            SmoothScroller smoothScroller = this.Uo;
            if (smoothScroller != null) {
                smoothScroller.r();
            }
        }

        public int n() {
            RecyclerView recyclerView = this.rl;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int n1(Recycler recycler, State state) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView == null || recyclerView.mAdapter == null || !nY()) {
                return 1;
            }
            return this.rl.mAdapter.getItemCount();
        }

        public int ofS() {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void p0N(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.rl;
            Uf(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public int pJg() {
            return ViewCompat.te(this.rl);
        }

        public int piY() {
            return this.f41163r;
        }

        public void qm(View view, boolean z2, Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).rl;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.rl != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.rl.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        boolean s(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.rl;
            return Lp6(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        public boolean tUK(View view, boolean z2, boolean z3) {
            boolean z4 = this.f41161O.rl(view, 24579) && this.J2.rl(view, 24579);
            return z2 ? z4 : !z4;
        }

        public void uQ(RecyclerView recyclerView, State state, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void ub(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.rl.canScrollVertically(-1) || this.rl.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.n(8192);
                accessibilityNodeInfoCompat.F(true);
                accessibilityNodeInfoCompat.Org(true);
            }
            if (this.rl.canScrollVertically(1) || this.rl.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.n(4096);
                accessibilityNodeInfoCompat.F(true);
                accessibilityNodeInfoCompat.Org(true);
            }
            accessibilityNodeInfoCompat.Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(n1(recycler, state), D(recycler, state), UhV(recycler, state), Jk(recycler, state)));
        }

        public void wKY(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.Uo;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.KN()) {
                this.Uo.r();
            }
            this.Uo = smoothScroller;
            smoothScroller.Ik(this.rl, this);
        }

        public int xg() {
            return ViewCompat.g(this.rl);
        }

        public boolean xzo(Runnable runnable) {
            RecyclerView recyclerView = this.rl;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        void yAc(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.rl = null;
                this.f41162n = null;
                this.Ik = 0;
                this.f41163r = 0;
            } else {
                this.rl = recyclerView;
                this.f41162n = recyclerView.mChildHelper;
                this.Ik = recyclerView.getWidth();
                this.f41163r = recyclerView.getHeight();
            }
            this.HI = 1073741824;
            this.ck = 1073741824;
        }

        public View z() {
            View focusedChild;
            RecyclerView recyclerView = this.rl;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f41162n.ty(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public LayoutManager() {
            ViewBoundsCheck.Callback callback = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public View n(int i2) {
                    return LayoutManager.this.E(i2);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int nr() {
                    return LayoutManager.this.mYa() - LayoutManager.this.Mx();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int t() {
                    return LayoutManager.this.C();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int O(View view) {
                    return LayoutManager.this.k(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int rl(View view) {
                    return LayoutManager.this.GR(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }
            };
            this.f41164t = callback;
            ViewBoundsCheck.Callback callback2 = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public View n(int i2) {
                    return LayoutManager.this.E(i2);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int nr() {
                    return LayoutManager.this.piY() - LayoutManager.this.ofS();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int t() {
                    return LayoutManager.this.G7();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int O(View view) {
                    return LayoutManager.this.a(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int rl(View view) {
                    return LayoutManager.this.dR0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }
            };
            this.nr = callback2;
            this.f41161O = new ViewBoundsCheck(callback);
            this.J2 = new ViewBoundsCheck(callback2);
            this.KN = false;
            this.xMQ = false;
            this.mUb = false;
            this.gh = true;
            this.qie = true;
        }

        private int[] B(View view, Rect rect) {
            int iC = C();
            int iG7 = G7();
            int iMYa = mYa() - Mx();
            int iPiY = piY() - ofS();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i2 = left - iC;
            int iMin = Math.min(0, i2);
            int i3 = top - iG7;
            int iMin2 = Math.min(0, i3);
            int i5 = iWidth - iMYa;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, iHeight - iPiY);
            if (m() == 1) {
                if (iMax == 0) {
                    iMax = Math.max(iMin, i5);
                }
            } else {
                if (iMin == 0) {
                    iMin = Math.min(i2, iMax);
                }
                iMax = iMin;
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i3, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private boolean EWS(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iC = C();
            int iG7 = G7();
            int iMYa = mYa() - Mx();
            int iPiY = piY() - ofS();
            Rect rect = this.rl.mTempRect;
            I(focusedChild, rect);
            if (rect.left - i2 >= iMYa || rect.right - i2 <= iC || rect.top - i3 >= iPiY || rect.bottom - i3 <= iG7) {
                return false;
            }
            return true;
        }

        private void H(Recycler recycler, int i2, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.rl.mAdapter.hasStableIds()) {
                I9f(i2);
                recycler.T(childViewHolderInt);
            } else {
                wTp(i2);
                recycler.N(view);
                this.rl.mViewInfoStore.gh(childViewHolderInt);
            }
        }

        private static boolean K(int i2, int i3, int i5) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i5 > 0 && i2 != i5) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i2) {
                    return false;
                }
                return true;
            }
            if (size < i2) {
                return false;
            }
            return true;
        }

        private void Z(View view, int i2, boolean z2) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z2 && !childViewHolderInt.isRemoved()) {
                this.rl.mViewInfoStore.ck(childViewHolderInt);
            } else {
                this.rl.mViewInfoStore.rl(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.rl) {
                    int iAz = this.f41162n.az(view);
                    if (i2 == -1) {
                        i2 = this.f41162n.Uo();
                    }
                    if (iAz != -1) {
                        if (iAz != i2) {
                            this.rl.mLayout.RQ(iAz, i2);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.rl.indexOfChild(view) + this.rl.exceptionLabel());
                    }
                } else {
                    this.f41162n.n(view, i2, false);
                    layoutParams.f41170t = true;
                    SmoothScroller smoothScroller = this.Uo;
                    if (smoothScroller != null && smoothScroller.KN()) {
                        this.Uo.gh(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f41162n.t(view, i2, view.getLayoutParams(), false);
            }
            if (layoutParams.nr) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + layoutParams.f41169n);
                }
                childViewHolderInt.itemView.invalidate();
                layoutParams.nr = false;
            }
        }

        public static int te(int i2, int i3, int i5) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i3, i5);
                }
                return size;
            }
            return Math.min(size, Math.max(i3, i5));
        }

        public void ER(View view, int i2, int i3, int i5, int i7) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).rl;
            view.layout(i2 + rect.left, i3 + rect.top, i5 - rect.right, i7 - rect.bottom);
        }

        void Fp(RecyclerView recyclerView) {
            SR(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int GR(View view) {
            return view.getLeft() - eTf(view);
        }

        public void HBN(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int iFcU;
            int iFcU2 = 0;
            if (nY()) {
                iFcU = fcU(view);
            } else {
                iFcU = 0;
            }
            if (ViF()) {
                iFcU2 = fcU(view);
            }
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(iFcU, 1, iFcU2, 1, false, false));
        }

        boolean HV() {
            int iM = M();
            for (int i2 = 0; i2 < iM; i2++) {
                ViewGroup.LayoutParams layoutParams = E(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void I(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void I9f(int i2) {
            if (E(i2) != null) {
                this.f41162n.Ik(i2);
            }
        }

        public boolean NP(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            int[] iArrB = B(view, rect);
            int i2 = iArrB[0];
            int i3 = iArrB[1];
            if ((z3 && !EWS(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z2) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        public int Nxk(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).rl;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        void Qu(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f41162n.ty(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.rl;
                HBN(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
            }
        }

        public void RQ(int i2, int i3) {
            View viewE = E(i2);
            if (viewE != null) {
                wTp(i2);
                S(viewE, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.rl.toString());
            }
        }

        public int Rl(View view) {
            return ((LayoutParams) view.getLayoutParams()).rl.top;
        }

        public void S(View view, int i2) {
            WPU(view, i2, (LayoutParams) view.getLayoutParams());
        }

        void SR(int i2, int i3) {
            this.Ik = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.HI = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.Ik = 0;
            }
            this.f41163r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.ck = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f41163r = 0;
            }
        }

        public void T3L(RecyclerView recyclerView, Recycler recycler) {
            mI(recyclerView);
        }

        public void Th(int i2, Recycler recycler) {
            View viewE = E(i2);
            I9f(i2);
            recycler.X(viewE);
        }

        void Toy(Recycler recycler) {
            int iMUb = recycler.mUb();
            for (int i2 = iMUb - 1; i2 >= 0; i2--) {
                View viewTy = recycler.ty(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewTy);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.rl.removeDetachedView(viewTy, false);
                    }
                    ItemAnimator itemAnimator = this.rl.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.mUb(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    recycler.fD(viewTy);
                }
            }
            recycler.O();
            if (iMUb > 0) {
                this.rl.invalidate();
            }
        }

        public void W(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.rl.getItemDecorInsetsForChild(view);
            int i5 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i7 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int iFX = FX(mYa(), Org(), C() + Mx() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, ViF());
            int iFX2 = FX(piY(), ijL(), G7() + ofS() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, nY());
            if (h(view, iFX, iFX2, layoutParams)) {
                view.measure(iFX, iFX2);
            }
        }

        public void WPU(View view, int i2, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.rl.mViewInfoStore.rl(childViewHolderInt);
            } else {
                this.rl.mViewInfoStore.ck(childViewHolderInt);
            }
            this.f41162n.t(view, i2, layoutParams, childViewHolderInt.isRemoved());
        }

        public int Y(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).rl;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int a(View view) {
            return view.getBottom() + eF(view);
        }

        public int dR0(View view) {
            return view.getTop() - Rl(view);
        }

        public int eF(View view) {
            return ((LayoutParams) view.getLayoutParams()).rl.bottom;
        }

        public int eTf(View view) {
            return ((LayoutParams) view.getLayoutParams()).rl.left;
        }

        public int fcU(View view) {
            return ((LayoutParams) view.getLayoutParams()).n();
        }

        boolean h(View view, int i2, int i3, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.gh && K(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).width) && K(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        public View jB(int i2) {
            int iM = M();
            for (int i3 = 0; i3 < iM; i3++) {
                View viewE = E(i3);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewE);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i2 && !childViewHolderInt.shouldIgnore() && (this.rl.mState.O() || !childViewHolderInt.isRemoved())) {
                    return viewE;
                }
            }
            return null;
        }

        public void jO(Recycler recycler) {
            for (int iM = M() - 1; iM >= 0; iM--) {
                if (!RecyclerView.getChildViewHolderInt(E(iM)).shouldIgnore()) {
                    Th(iM, recycler);
                }
            }
        }

        public int k(View view) {
            return view.getRight() + ul(view);
        }

        public void kSg(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.rl.getItemDecorInsetsForChild(view);
            int i5 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i7 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int iFX = FX(mYa(), Org(), C() + Mx() + i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, ViF());
            int iFX2 = FX(piY(), ijL(), G7() + ofS() + i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, nY());
            if (h(view, iFX, iFX2, layoutParams)) {
                view.measure(iFX, iFX2);
            }
        }

        public void lLA(View view, int i2, int i3, int i5, int i7) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.rl;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public boolean nO(RecyclerView recyclerView, View view, View view2) {
            if (!How() && !recyclerView.isComputingLayout()) {
                return false;
            }
            return true;
        }

        public void pS(Rect rect, int i2, int i3) {
            EN(te(i2, rect.width() + C() + Mx(), pJg()), te(i3, rect.height() + G7() + ofS(), xg()));
        }

        public void s7N(Recycler recycler) {
            for (int iM = M() - 1; iM >= 0; iM--) {
                H(recycler, iM, E(iM));
            }
        }

        void tEO(int i2, int i3) {
            int iM = M();
            if (iM == 0) {
                this.rl.defaultOnMeasure(i2, i3);
                return;
            }
            int i5 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < iM; i10++) {
                View viewE = E(i10);
                Rect rect = this.rl.mTempRect;
                I(viewE, rect);
                int i11 = rect.left;
                if (i11 < i9) {
                    i9 = i11;
                }
                int i12 = rect.right;
                if (i12 > i5) {
                    i5 = i12;
                }
                int i13 = rect.top;
                if (i13 < i7) {
                    i7 = i13;
                }
                int i14 = rect.bottom;
                if (i14 > i8) {
                    i8 = i14;
                }
            }
            this.rl.mTempRect.set(i9, i7, i5, i8);
            pS(this.rl.mTempRect, i2, i3);
        }

        public void uG(RecyclerView recyclerView, int i2, int i3, Object obj) {
            EF(recyclerView, i2, i3);
        }

        public int ul(View view) {
            return ((LayoutParams) view.getLayoutParams()).rl.right;
        }

        public boolean vl(RecyclerView recyclerView, State state, View view, View view2) {
            return nO(recyclerView, view, view2);
        }

        public void wKp(View view, Recycler recycler) {
            lNy(view);
            recycler.X(view);
        }

        public void wTp(int i2) {
            v(i2, E(i2));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ViewHolder f41169n;
        boolean nr;
        final Rect rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f41170t;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rl = new Rect();
            this.f41170t = true;
            this.nr = false;
        }

        public int n() {
            return this.f41169n.getLayoutPosition();
        }

        public boolean nr() {
            return this.f41169n.isInvalid();
        }

        public boolean rl() {
            return this.f41169n.isUpdated();
        }

        public boolean t() {
            return this.f41169n.isRemoved();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.rl = new Rect();
            this.f41170t = true;
            this.nr = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rl = new Rect();
            this.f41170t = true;
            this.nr = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rl = new Rect();
            this.f41170t = true;
            this.nr = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.rl = new Rect();
            this.f41170t = true;
            this.nr = false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface OnChildAttachStateChangeListener {
        void nr(View view);

        void rl(View view);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class OnFlingListener {
        public abstract boolean n(int i2, int i3);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface OnItemTouchListener {
        void O(boolean z2);

        void n(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean t(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class OnScrollListener {
        public void n(RecyclerView recyclerView, int i2) {
        }

        public void rl(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class RecycledViewPool {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SparseArray f41171n = new SparseArray();
        int rl = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Set f41172t = Collections.newSetFromMap(new IdentityHashMap());

        public void t() {
            for (int i2 = 0; i2 < this.f41171n.size(); i2++) {
                ScrapData scrapData = (ScrapData) this.f41171n.valueAt(i2);
                Iterator it = scrapData.f41173n.iterator();
                while (it.hasNext()) {
                    PoolingContainer.rl(((ViewHolder) it.next()).itemView);
                }
                scrapData.f41173n.clear();
            }
        }

        static class ScrapData {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final ArrayList f41173n = new ArrayList();
            int rl = 5;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            long f41174t = 0;
            long nr = 0;

            ScrapData() {
            }
        }

        private ScrapData xMQ(int i2) {
            ScrapData scrapData = (ScrapData) this.f41171n.get(i2);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.f41171n.put(i2, scrapData2);
            return scrapData2;
        }

        public ViewHolder KN(int i2) {
            ScrapData scrapData = (ScrapData) this.f41171n.get(i2);
            if (scrapData == null || scrapData.f41173n.isEmpty()) {
                return null;
            }
            ArrayList arrayList = scrapData.f41173n;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((ViewHolder) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (ViewHolder) arrayList.remove(size);
                }
            }
            return null;
        }

        void O(Adapter adapter, boolean z2) {
            this.f41172t.remove(adapter);
            if (this.f41172t.size() != 0 || z2) {
                return;
            }
            for (int i2 = 0; i2 < this.f41171n.size(); i2++) {
                SparseArray sparseArray = this.f41171n;
                ArrayList arrayList = ((ScrapData) sparseArray.get(sparseArray.keyAt(i2))).f41173n;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    PoolingContainer.rl(((ViewHolder) arrayList.get(i3)).itemView);
                }
            }
        }

        void mUb(Adapter adapter, Adapter adapter2, boolean z2) {
            if (adapter != null) {
                nr();
            }
            if (!z2 && this.rl == 0) {
                t();
            }
            if (adapter2 != null) {
                n();
            }
        }

        void n() {
            this.rl++;
        }

        void nr() {
            this.rl--;
        }

        long qie(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        void rl(Adapter adapter) {
            this.f41172t.add(adapter);
        }

        void J2(int i2, long j2) {
            ScrapData scrapDataXMQ = xMQ(i2);
            scrapDataXMQ.nr = qie(scrapDataXMQ.nr, j2);
        }

        void Uo(int i2, long j2) {
            ScrapData scrapDataXMQ = xMQ(i2);
            scrapDataXMQ.f41174t = qie(scrapDataXMQ.f41174t, j2);
        }

        boolean az(int i2, long j2, long j3) {
            long j4 = xMQ(i2).nr;
            if (j4 != 0 && j2 + j4 >= j3) {
                return false;
            }
            return true;
        }

        public void gh(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList = xMQ(itemViewType).f41173n;
            if (((ScrapData) this.f41171n.get(itemViewType)).rl <= arrayList.size()) {
                PoolingContainer.rl(viewHolder.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(viewHolder)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        boolean ty(int i2, long j2, long j3) {
            long j4 = xMQ(i2).f41174t;
            if (j4 != 0 && j2 + j4 >= j3) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public final class Recycler {
        int J2;
        private ViewCacheExtension KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f41175O;
        RecycledViewPool Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ArrayList f41176n;
        private final List nr;
        ArrayList rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final ArrayList f41177t;

        private void te(Adapter adapter) {
            iF(adapter, false);
        }

        private boolean v(ViewHolder viewHolder, int i2, int i3, long j2) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z2 = false;
            if (j2 != Long.MAX_VALUE && !this.Uo.az(itemViewType, nanoTime, j2)) {
                return false;
            }
            if (viewHolder.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(viewHolder.itemView, recyclerView.getChildCount(), viewHolder.itemView.getLayoutParams());
                z2 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i2);
            if (z2) {
                RecyclerView.this.detachViewFromParent(viewHolder.itemView);
            }
            this.Uo.J2(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            rl(viewHolder);
            if (RecyclerView.this.mState.O()) {
                viewHolder.mPreLayoutPosition = i3;
            }
            return true;
        }

        public View HI(int i2) {
            return ck(i2, false);
        }

        void U(int i2, int i3) {
            int i5;
            int i7 = i3 + i2;
            for (int size = this.f41177t.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.f41177t.get(size);
                if (viewHolder != null && (i5 = viewHolder.mPosition) >= i2 && i5 < i7) {
                    viewHolder.addFlags(2);
                    e(size);
                }
            }
        }

        void g() {
            for (int i2 = 0; i2 < this.f41177t.size(); i2++) {
                PoolingContainer.rl(((ViewHolder) this.f41177t.get(i2)).itemView);
            }
            te(RecyclerView.this.mAdapter);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0272 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        ViewHolder rV9(int i2, boolean z2, long j2) {
            ViewHolder viewHolderCreateViewHolder;
            boolean z3;
            ViewHolder viewHolder;
            boolean z4;
            boolean zV2;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewCacheExtension viewCacheExtension;
            View viewN;
            if (i2 < 0 || i2 >= RecyclerView.this.mState.rl()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + RecyclerView.this.mState.rl() + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.O()) {
                viewHolderCreateViewHolder = KN(i2);
                if (viewHolderCreateViewHolder != null) {
                    z3 = true;
                }
                if (viewHolderCreateViewHolder == null && (viewHolderCreateViewHolder = az(i2, z2)) != null) {
                    if (jB(viewHolderCreateViewHolder)) {
                        if (!z2) {
                            viewHolderCreateViewHolder.addFlags(4);
                            if (viewHolderCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                                viewHolderCreateViewHolder.unScrap();
                            } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            T(viewHolderCreateViewHolder);
                        }
                        viewHolderCreateViewHolder = null;
                    } else {
                        z3 = true;
                    }
                }
                if (viewHolderCreateViewHolder == null) {
                    int iAz = RecyclerView.this.mAdapterHelper.az(i2);
                    if (iAz < 0 || iAz >= RecyclerView.this.mAdapter.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + iAz + ").state:" + RecyclerView.this.mState.rl() + RecyclerView.this.exceptionLabel());
                    }
                    int itemViewType = RecyclerView.this.mAdapter.getItemViewType(iAz);
                    if (RecyclerView.this.mAdapter.hasStableIds() && (viewHolderCreateViewHolder = qie(RecyclerView.this.mAdapter.getItemId(iAz), itemViewType, z2)) != null) {
                        viewHolderCreateViewHolder.mPosition = iAz;
                        z3 = true;
                    }
                    if (viewHolderCreateViewHolder == null && (viewCacheExtension = this.KN) != null && (viewN = viewCacheExtension.n(this, i2, itemViewType)) != null) {
                        viewHolderCreateViewHolder = RecyclerView.this.getChildViewHolder(viewN);
                        if (viewHolderCreateViewHolder == null) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.exceptionLabel());
                        }
                        if (viewHolderCreateViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.exceptionLabel());
                        }
                    }
                    if (viewHolderCreateViewHolder == null) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "tryGetViewHolderForPositionByDeadline(" + i2 + ") fetching from shared pool");
                        }
                        viewHolderCreateViewHolder = xMQ().KN(itemViewType);
                        if (viewHolderCreateViewHolder != null) {
                            viewHolderCreateViewHolder.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                r(viewHolderCreateViewHolder);
                            }
                        }
                    }
                    if (viewHolderCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j2 != Long.MAX_VALUE && !this.Uo.ty(itemViewType, nanoTime, j2)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        viewHolderCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                            viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.Uo.Uo(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
                viewHolder = viewHolderCreateViewHolder;
                z4 = z3;
                if (z4 && !RecyclerView.this.mState.O() && viewHolder.hasAnyOfTheFlags(8192)) {
                    viewHolder.setFlags(0, 8192);
                    if (RecyclerView.this.mState.gh) {
                        int iO = ItemAnimator.O(viewHolder) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, recyclerView2.mItemAnimator.XQ(recyclerView2.mState, viewHolder, iO, viewHolder.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.mState.O() || !viewHolder.isBound()) {
                    if (viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && viewHolder.isRemoved()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + viewHolder + RecyclerView.this.exceptionLabel());
                        }
                        zV2 = v(viewHolder, RecyclerView.this.mAdapterHelper.az(i2), i2, j2);
                    }
                    layoutParams = viewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.f41169n = viewHolder;
                    layoutParams2.nr = z4 && zV2;
                    return viewHolder;
                }
                viewHolder.mPreLayoutPosition = i2;
                zV2 = false;
                layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                }
                layoutParams2.f41169n = viewHolder;
                layoutParams2.nr = z4 && zV2;
                return viewHolder;
            }
            viewHolderCreateViewHolder = null;
            z3 = false;
            if (viewHolderCreateViewHolder == null) {
                if (jB(viewHolderCreateViewHolder)) {
                }
            }
            if (viewHolderCreateViewHolder == null) {
            }
            viewHolder = viewHolderCreateViewHolder;
            z4 = z3;
            if (z4) {
                viewHolder.setFlags(0, 8192);
                if (RecyclerView.this.mState.gh) {
                }
            }
            if (RecyclerView.this.mState.O()) {
                if (viewHolder.isBound()) {
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                zV2 = v(viewHolder, RecyclerView.this.mAdapterHelper.az(i2), i2, j2);
            }
            layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            layoutParams2.f41169n = viewHolder;
            layoutParams2.nr = z4 && zV2;
            return viewHolder;
        }

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.f41176n = arrayList;
            this.rl = null;
            this.f41177t = new ArrayList();
            this.nr = Collections.unmodifiableList(arrayList);
            this.f41175O = 2;
            this.J2 = 2;
        }

        private void XQ() {
            if (this.Uo != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.Uo.rl(RecyclerView.this.mAdapter);
            }
        }

        private void iF(Adapter adapter, boolean z2) {
            RecycledViewPool recycledViewPool = this.Uo;
            if (recycledViewPool != null) {
                recycledViewPool.O(adapter, z2);
            }
        }

        private void r(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                Ik((ViewGroup) view, false);
            }
        }

        private void rl(ViewHolder viewHolder) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = viewHolder.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
                if (recyclerViewAccessibilityDelegate == null) {
                    return;
                }
                AccessibilityDelegateCompat accessibilityDelegateCompatTy = recyclerViewAccessibilityDelegate.ty();
                if (accessibilityDelegateCompatTy instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    ((RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatTy).HI(view);
                }
                ViewCompat.eTf(view, accessibilityDelegateCompatTy);
            }
        }

        void E2() {
            for (int size = this.f41177t.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.f41177t.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.rl();
            }
        }

        public int J2(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.mState.rl()) {
                return !RecyclerView.this.mState.O() ? i2 : RecyclerView.this.mAdapterHelper.az(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.mState.rl() + RecyclerView.this.exceptionLabel());
        }

        ViewHolder KN(int i2) {
            int size;
            int iAz;
            ArrayList arrayList = this.rl;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ViewHolder viewHolder = (ViewHolder) this.rl.get(i3);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i2) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iAz = RecyclerView.this.mAdapterHelper.az(i2)) > 0 && iAz < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iAz);
                    for (int i5 = 0; i5 < size; i5++) {
                        ViewHolder viewHolder2 = (ViewHolder) this.rl.get(i5);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        void O() {
            this.f41176n.clear();
            ArrayList arrayList = this.rl;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        void S(int i2, int i3) {
            int size = this.f41177t.size();
            for (int i5 = 0; i5 < size; i5++) {
                ViewHolder viewHolder = (ViewHolder) this.f41177t.get(i5);
                if (viewHolder != null && viewHolder.mPosition >= i2) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForInsert cached " + i5 + " holder " + viewHolder + " now at position " + (viewHolder.mPosition + i3));
                    }
                    viewHolder.offsetPosition(i3, false);
                }
            }
        }

        void Uo(ViewHolder viewHolder) {
            RecyclerListener recyclerListener = RecyclerView.this.mRecyclerListener;
            if (recyclerListener != null) {
                recyclerListener.n(viewHolder);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.this.mRecyclerListeners.get(i2).n(viewHolder);
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.Ik(viewHolder);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + viewHolder);
            }
        }

        void WPU(int i2, int i3) {
            int i5;
            int i7;
            int i8;
            int i9;
            if (i2 < i3) {
                i5 = -1;
                i8 = i2;
                i7 = i3;
            } else {
                i5 = 1;
                i7 = i2;
                i8 = i3;
            }
            int size = this.f41177t.size();
            for (int i10 = 0; i10 < size; i10++) {
                ViewHolder viewHolder = (ViewHolder) this.f41177t.get(i10);
                if (viewHolder != null && (i9 = viewHolder.mPosition) >= i8 && i9 <= i7) {
                    if (i9 == i2) {
                        viewHolder.offsetPosition(i3 - i2, false);
                    } else {
                        viewHolder.offsetPosition(i5, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForMove cached child " + i10 + " holder " + viewHolder);
                    }
                }
            }
        }

        void Xw() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.J2 = this.f41175O + (layoutManager != null ? layoutManager.az : 0);
            for (int size = this.f41177t.size() - 1; size >= 0 && this.f41177t.size() > this.J2; size--) {
                e(size);
            }
        }

        void Z() {
            int size = this.f41177t.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = (ViewHolder) this.f41177t.get(i2);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter == null || !adapter.hasStableIds()) {
                E2();
            }
        }

        void aYN(int i2, int i3, boolean z2) {
            int i5 = i2 + i3;
            for (int size = this.f41177t.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.f41177t.get(size);
                if (viewHolder != null) {
                    int i7 = viewHolder.mPosition;
                    if (i7 >= i5) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + viewHolder + " now at position " + (viewHolder.mPosition - i3));
                        }
                        viewHolder.offsetPosition(-i3, z2);
                    } else if (i7 >= i2) {
                        viewHolder.addFlags(8);
                        e(size);
                    }
                }
            }
        }

        ViewHolder az(int i2, boolean z2) {
            View viewO;
            int size = this.f41176n.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewHolder viewHolder = (ViewHolder) this.f41176n.get(i3);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i2 && !viewHolder.isInvalid() && (RecyclerView.this.mState.KN || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z2 && (viewO = RecyclerView.this.mChildHelper.O(i2)) != null) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewO);
                RecyclerView.this.mChildHelper.o(viewO);
                int iAz = RecyclerView.this.mChildHelper.az(viewO);
                if (iAz != -1) {
                    RecyclerView.this.mChildHelper.nr(iAz);
                    N(viewO);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f41177t.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ViewHolder viewHolder2 = (ViewHolder) this.f41177t.get(i5);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i2 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z2) {
                        this.f41177t.remove(i5);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + i2 + ") found match in cache: " + viewHolder2);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        void bzg(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.rl.remove(viewHolder);
            } else {
                this.f41176n.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        void e(int i2) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "Recycling cached view at index " + i2);
            }
            ViewHolder viewHolder = (ViewHolder) this.f41177t.get(i2);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + viewHolder);
            }
            n(viewHolder, true);
            this.f41177t.remove(i2);
        }

        public List gh() {
            return this.nr;
        }

        int mUb() {
            return this.f41176n.size();
        }

        void nHg(RecycledViewPool recycledViewPool) {
            te(RecyclerView.this.mAdapter);
            RecycledViewPool recycledViewPool2 = this.Uo;
            if (recycledViewPool2 != null) {
                recycledViewPool2.nr();
            }
            this.Uo = recycledViewPool;
            if (recycledViewPool != null && RecyclerView.this.getAdapter() != null) {
                this.Uo.n();
            }
            XQ();
        }

        void nr() {
            int size = this.f41177t.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ViewHolder) this.f41177t.get(i2)).clearOldPosition();
            }
            int size2 = this.f41176n.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ViewHolder) this.f41176n.get(i3)).clearOldPosition();
            }
            ArrayList arrayList = this.rl;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((ViewHolder) this.rl.get(i5)).clearOldPosition();
                }
            }
        }

        void o() {
            int size = this.f41177t.size();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutParams layoutParams = (LayoutParams) ((ViewHolder) this.f41177t.get(i2)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f41170t = true;
                }
            }
        }

        ViewHolder qie(long j2, int i2, boolean z2) {
            for (int size = this.f41176n.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.f41176n.get(size);
                if (viewHolder.getItemId() == j2 && !viewHolder.wasReturnedFromScrap()) {
                    if (i2 == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.mState.O()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    }
                    if (!z2) {
                        this.f41176n.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        fD(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.f41177t.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = (ViewHolder) this.f41177t.get(size2);
                if (viewHolder2.getItemId() == j2 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i2 == viewHolder2.getItemViewType()) {
                        if (!z2) {
                            this.f41177t.remove(size2);
                        }
                        return viewHolder2;
                    }
                    if (!z2) {
                        e(size2);
                        return null;
                    }
                }
            }
        }

        void s7N(ViewCacheExtension viewCacheExtension) {
            this.KN = viewCacheExtension;
        }

        public void t() {
            this.f41176n.clear();
            E2();
        }

        View ty(int i2) {
            return ((ViewHolder) this.f41176n.get(i2)).itemView;
        }

        public void wTp(int i2) {
            this.f41175O = i2;
            Xw();
        }

        RecycledViewPool xMQ() {
            if (this.Uo == null) {
                this.Uo = new RecycledViewPool();
                XQ();
            }
            return this.Uo;
        }

        private void Ik(ViewGroup viewGroup, boolean z2) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    Ik((ViewGroup) childAt, true);
                }
            }
            if (!z2) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        void N(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.rl == null) {
                    this.rl = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.rl.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f41176n.add(childViewHolderInt);
        }

        void T(ViewHolder viewHolder) {
            boolean z2;
            boolean z3;
            boolean z4 = false;
            boolean z5 = true;
            if (!viewHolder.isScrap() && viewHolder.itemView.getParent() == null) {
                if (!viewHolder.isTmpDetached()) {
                    if (!viewHolder.shouldIgnore()) {
                        boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                        Adapter adapter = RecyclerView.this.mAdapter;
                        if (adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (RecyclerView.sDebugAssertionsEnabled && this.f41177t.contains(viewHolder)) {
                            throw new IllegalArgumentException("cached view received recycle internal? " + viewHolder + RecyclerView.this.exceptionLabel());
                        }
                        if (!z2 && !viewHolder.isRecyclable()) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d(RecyclerView.TAG, HrvQKfmFZJudBc.VSmJVrDh + RecyclerView.this.exceptionLabel());
                            }
                            z5 = false;
                        } else {
                            if (this.J2 > 0 && !viewHolder.hasAnyOfTheFlags(526)) {
                                int size = this.f41177t.size();
                                if (size >= this.J2 && size > 0) {
                                    e(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.nr(viewHolder.mPosition)) {
                                    int i2 = size - 1;
                                    while (i2 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.nr(((ViewHolder) this.f41177t.get(i2)).mPosition)) {
                                            break;
                                        } else {
                                            i2--;
                                        }
                                    }
                                    size = i2 + 1;
                                }
                                this.f41177t.add(size, viewHolder);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                n(viewHolder, true);
                            } else {
                                z5 = false;
                            }
                            z4 = z3;
                        }
                        RecyclerView.this.mViewInfoStore.Ik(viewHolder);
                        if (!z4 && !z5 && zDoesTransientStatePreventRecycling) {
                            PoolingContainer.rl(viewHolder.itemView);
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(viewHolder.isScrap());
            sb.append(" isAttached:");
            if (viewHolder.itemView.getParent() != null) {
                z4 = true;
            }
            sb.append(z4);
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }

        void ViF(Adapter adapter, Adapter adapter2, boolean z2) {
            t();
            iF(adapter, true);
            xMQ().mUb(adapter, adapter2, z2);
            XQ();
        }

        public void X(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            T(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.mUb(childViewHolderInt);
            }
        }

        void fD(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            T(childViewHolderInt);
        }

        boolean jB(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                if (RecyclerView.sDebugAssertionsEnabled && !RecyclerView.this.mState.O()) {
                    throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
                }
                return RecyclerView.this.mState.O();
            }
            int i2 = viewHolder.mPosition;
            if (i2 >= 0 && i2 < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.O() && RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && viewHolder.getItemId() != RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.exceptionLabel());
        }

        void n(ViewHolder viewHolder, boolean z2) {
            AccessibilityDelegateCompat accessibilityDelegateCompatTy;
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompatTy2 = recyclerViewAccessibilityDelegate.ty();
                if (accessibilityDelegateCompatTy2 instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    accessibilityDelegateCompatTy = ((RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatTy2).ty(view);
                } else {
                    accessibilityDelegateCompatTy = null;
                }
                ViewCompat.eTf(view, accessibilityDelegateCompatTy);
            }
            if (z2) {
                Uo(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            xMQ().gh(viewHolder);
        }

        void nY() {
            XQ();
        }

        View ck(int i2, boolean z2) {
            return rV9(i2, z2, Long.MAX_VALUE).itemView;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface RecyclerListener {
        void n(ViewHolder viewHolder);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class RecyclerViewDataObserver extends AdapterDataObserver {
        RecyclerViewDataObserver() {
        }

        void n() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                ViewCompat.Nxk(recyclerView, recyclerView.mUpdateChildViewsRunnable);
            } else {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.Uo = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.ck()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i2, i3, obj)) {
                n();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.o(i2, i3)) {
                n();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.Z(i2, i3, i5)) {
                n();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.XQ(i2, i3)) {
                n();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RestrictTo
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
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

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Parcelable f41179O;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f41179O = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        void rl(SavedState savedState) {
            this.f41179O = savedState.f41179O;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f41179O, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void O(boolean z2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void n(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean t(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class SmoothScroller {
        private View J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f41180O;
        private boolean nr;
        private RecyclerView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private LayoutManager f41182t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f41181n = -1;
        private final Action Uo = new Action(0, 0);

        public static class Action {
            private boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private Interpolator f41183O;
            private int Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f41184n;
            private int nr;
            private int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f41185t;

            public Action(int i2, int i3) {
                this(i2, i3, Integer.MIN_VALUE, null);
            }

            public Action(int i2, int i3, int i5, Interpolator interpolator) {
                this.nr = -1;
                this.J2 = false;
                this.Uo = 0;
                this.f41184n = i2;
                this.rl = i3;
                this.f41185t = i5;
                this.f41183O = interpolator;
            }

            private void O() {
                if (this.f41183O != null && this.f41185t < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f41185t < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean n() {
                return this.nr >= 0;
            }

            public void nr(int i2, int i3, int i5, Interpolator interpolator) {
                this.f41184n = i2;
                this.rl = i3;
                this.f41185t = i5;
                this.f41183O = interpolator;
                this.J2 = true;
            }

            public void rl(int i2) {
                this.nr = i2;
            }

            void t(RecyclerView recyclerView) {
                int i2 = this.nr;
                if (i2 >= 0) {
                    this.nr = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i2);
                    this.J2 = false;
                } else {
                    if (!this.J2) {
                        this.Uo = 0;
                        return;
                    }
                    O();
                    recyclerView.mViewFlinger.O(this.f41184n, this.rl, this.f41185t, this.f41183O);
                    int i3 = this.Uo + 1;
                    this.Uo = i3;
                    if (i3 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.J2 = false;
                }
            }
        }

        public interface ScrollVectorProvider {
            PointF KN(int i2);
        }

        protected abstract void HI(View view, State state, Action action);

        protected abstract void az();

        protected abstract void qie(int i2, int i3, State state, Action action);

        protected abstract void ty();

        void Ik(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.mViewFlinger.J2();
            if (this.KN) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.rl = recyclerView;
            this.f41182t = layoutManager;
            int i2 = this.f41181n;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f41187n = i2;
            this.f41180O = true;
            this.nr = true;
            this.J2 = rl(J2());
            az();
            this.rl.mViewFlinger.nr();
            this.KN = true;
        }

        public int J2() {
            return this.f41181n;
        }

        public boolean KN() {
            return this.f41180O;
        }

        public LayoutManager O() {
            return this.f41182t;
        }

        public boolean Uo() {
            return this.nr;
        }

        public void ck(int i2) {
            this.f41181n = i2;
        }

        void mUb(int i2, int i3) {
            PointF pointFN;
            RecyclerView recyclerView = this.rl;
            if (this.f41181n == -1 || recyclerView == null) {
                r();
            }
            if (this.nr && this.J2 == null && this.f41182t != null && (pointFN = n(this.f41181n)) != null) {
                float f3 = pointFN.x;
                if (f3 != 0.0f || pointFN.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f3), (int) Math.signum(pointFN.y), null);
                }
            }
            this.nr = false;
            View view = this.J2;
            if (view != null) {
                if (nr(view) == this.f41181n) {
                    HI(this.J2, recyclerView.mState, this.Uo);
                    this.Uo.t(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.J2 = null;
                }
            }
            if (this.f41180O) {
                qie(i2, i3, recyclerView.mState, this.Uo);
                boolean zN = this.Uo.n();
                this.Uo.t(recyclerView);
                if (zN && this.f41180O) {
                    this.nr = true;
                    recyclerView.mViewFlinger.nr();
                }
            }
        }

        public int nr(View view) {
            return this.rl.getChildLayoutPosition(view);
        }

        protected final void r() {
            if (this.f41180O) {
                this.f41180O = false;
                ty();
                this.rl.mState.f41187n = -1;
                this.J2 = null;
                this.f41181n = -1;
                this.nr = false;
                this.f41182t.Aum(this);
                this.f41182t = null;
                this.rl = null;
            }
        }

        public View rl(int i2) {
            return this.rl.mLayout.jB(i2);
        }

        public int t() {
            return this.rl.mLayout.M();
        }

        protected void xMQ(PointF pointF) {
            float f3 = pointF.x;
            float f4 = pointF.y;
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        protected void gh(View view) {
            if (nr(view) == J2()) {
                this.J2 = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }

        public PointF n(int i2) {
            Object objO = O();
            if (objO instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) objO).KN(i2);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class State {
        int HI;
        int Ik;
        int az;
        int ck;
        private SparseArray rl;
        long ty;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41187n = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41188t = 0;
        int nr = 0;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f41186O = 1;
        int J2 = 0;
        boolean Uo = false;
        boolean KN = false;
        boolean xMQ = false;
        boolean mUb = false;
        boolean gh = false;
        boolean qie = false;

        void J2(Adapter adapter) {
            this.f41186O = 1;
            this.J2 = adapter.getItemCount();
            this.KN = false;
            this.xMQ = false;
            this.mUb = false;
        }

        public boolean O() {
            return this.KN;
        }

        public boolean Uo() {
            return this.qie;
        }

        void n(int i2) {
            if ((this.f41186O & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f41186O));
        }

        public boolean nr() {
            return this.f41187n != -1;
        }

        public int rl() {
            return this.KN ? this.f41188t - this.nr : this.J2;
        }

        public int t() {
            return this.f41187n;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f41187n + ", mData=" + this.rl + ", mItemCount=" + this.J2 + ", mIsMeasuring=" + this.mUb + ", mPreviousLayoutItemCount=" + this.f41188t + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.nr + ", mStructureChanged=" + this.Uo + ", mInPreLayout=" + this.KN + ", mRunSimpleAnimations=" + this.gh + ", mRunPredictiveAnimations=" + this.qie + '}';
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        protected EdgeEffect n(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }

        StretchEdgeEffectFactory() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class ViewCacheExtension {
        public abstract View n(Recycler recycler, int i2, int i3);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class ViewFlinger implements Runnable {
        Interpolator J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        OverScroller f41189O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f41191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f41192o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f41193r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f41194t;

        ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.J2 = interpolator;
            this.f41193r = false;
            this.f41192o = false;
            this.f41189O = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private void t() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.Nxk(RecyclerView.this, this);
        }

        public void J2() {
            RecyclerView.this.removeCallbacks(this);
            this.f41189O.abortAnimation();
        }

        public void O(int i2, int i3, int i5, Interpolator interpolator) {
            if (i5 == Integer.MIN_VALUE) {
                i5 = n(i2, i3);
            }
            int i7 = i5;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.J2 != interpolator) {
                this.J2 = interpolator;
                this.f41189O = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f41194t = 0;
            this.f41191n = 0;
            RecyclerView.this.setScrollState(2);
            this.f41189O.startScroll(0, 0, i2, i3, i7);
            nr();
        }

        void nr() {
            if (this.f41193r) {
                this.f41192o = true;
            } else {
                t();
            }
        }

        public void rl(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f41194t = 0;
            this.f41191n = 0;
            Interpolator interpolator = this.J2;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.J2 = interpolator2;
                this.f41189O = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f41189O.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            nr();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                J2();
                return;
            }
            this.f41192o = false;
            this.f41193r = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f41189O;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f41191n;
                int i7 = currY - this.f41194t;
                this.f41191n = currX;
                this.f41194t = currY;
                int iConsumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i5);
                int iConsumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i7);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    iConsumeFlingInHorizontalStretch -= i8;
                    iConsumeFlingInVerticalStretch -= i9;
                    SmoothScroller smoothScroller = recyclerView4.mLayout.Uo;
                    if (smoothScroller != null && !smoothScroller.Uo() && smoothScroller.KN()) {
                        int iRl = RecyclerView.this.mState.rl();
                        if (iRl == 0) {
                            smoothScroller.r();
                        } else if (smoothScroller.J2() >= iRl) {
                            smoothScroller.ck(iRl - 1);
                            smoothScroller.mUb(i8, i9);
                        } else {
                            smoothScroller.mUb(i8, i9);
                        }
                    }
                    i3 = i9;
                    i2 = i8;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                int i10 = iConsumeFlingInHorizontalStretch;
                int i11 = iConsumeFlingInVerticalStretch;
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i3, i10, i11, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i12 = i10 - iArr6[0];
                int i13 = i11 - iArr6[1];
                if (i2 != 0 || i3 != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                SmoothScroller smoothScroller2 = RecyclerView.this.mLayout.Uo;
                if ((smoothScroller2 == null || !smoothScroller2.Uo()) && z2) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i14, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.rl();
                    }
                } else {
                    nr();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView7.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.J2(recyclerView7, i2, i3);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    Api35Impl.n(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.mLayout.Uo;
            if (smoothScroller3 != null && smoothScroller3.Uo()) {
                smoothScroller3.mUb(0, 0);
            }
            this.f41193r = false;
            if (this.f41192o) {
                t();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        private int n(int i2, int i3) {
            boolean z2;
            int height;
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            if (iAbs > iAbs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z2) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z2) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), 2000);
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public final void setIsRecyclable(boolean z2) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z2 ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z2 && i3 == 1) {
                this.mFlags |= 16;
            } else if (z2 && i3 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z2 + ":" + this);
            }
        }

        private void t() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                t();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.Xw(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i2, int i3, boolean z2) {
            addFlags(8);
            offsetPosition(i3, z2);
            this.mPosition = i2;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.Xw(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i2, boolean z2) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z2) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f41170t = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (~i3));
        }

        void setScrapContainer(Recycler recycler, boolean z2) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z2;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        void unScrap() {
            this.mScrapContainer.bzg(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(Apsps.HJBZwlMxNQz);
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z2, boolean z3) {
        viewHolder.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z3) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.bzg(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.rl(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b2 = -1;
        int i5 = this.mLayout.m() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i7 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            i3 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            b2 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                b2 = 0;
            }
        }
        if (i2 == 1) {
            return b2 < 0 || (b2 == 0 && i3 * i5 < 0);
        }
        if (i2 == 2) {
            return b2 > 0 || (b2 == 0 && i3 * i5 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return b2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return b2 > 0;
        }
        throw new IllegalArgumentException(PtsLKY.IhnetNSaPeRQ + i2 + exceptionLabel());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f3, float f4, float f5, float f6) {
        boolean z2;
        boolean z3 = true;
        if (f4 < 0.0f) {
            ensureLeftGlow();
            EdgeEffectCompat.nr(this.mLeftGlow, (-f4) / getWidth(), 1.0f - (f5 / getHeight()));
        } else {
            if (f4 <= 0.0f) {
                z2 = false;
                if (f6 >= 0.0f) {
                    ensureTopGlow();
                    EdgeEffectCompat.nr(this.mTopGlow, (-f6) / getHeight(), f3 / getWidth());
                } else if (f6 > 0.0f) {
                    ensureBottomGlow();
                    EdgeEffectCompat.nr(this.mBottomGlow, f6 / getHeight(), 1.0f - (f3 / getWidth()));
                } else {
                    z3 = z2;
                }
                if (z3 && f4 == 0.0f && f6 == 0.0f) {
                    return;
                }
                postInvalidateOnAnimation();
            }
            ensureRightGlow();
            EdgeEffectCompat.nr(this.mRightGlow, f4 / getWidth(), f5 / getHeight());
        }
        z2 = true;
        if (f6 >= 0.0f) {
        }
        if (z3) {
        }
        postInvalidateOnAnimation();
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i2) < EdgeEffectCompat.rl(edgeEffect) * ((float) i3);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.XQ("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i2, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.n(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().t(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i5, int i7, int[] iArr) {
        return getScrollingChildHelper().J2(i2, i3, i5, i7, iArr);
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public boolean fling(int i2, int i3) {
        return fling(i2, i3, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    boolean flingNoThresholdCheck(int i2, int i3) {
        return fling(i2, i3, 0, Integer.MAX_VALUE);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.P5(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().gh();
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, null, 1);
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(@Px int i2, @Px int i3) {
    }

    void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.xMQ && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.t(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.O(viewHolder, itemHolderInfo);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void smoothScrollBy(@Px int i2, @Px int i3) {
        smoothScrollBy(i2, i3, null);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().ck(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @RequiresApi
    private static final class Api35Impl {
        @DoNotInline
        public static void n(View view, float f3) {
            try {
                view.setFrameContentVelocity(f3);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class ItemDecoration {
        public void J2(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void KN(Canvas canvas, RecyclerView recyclerView) {
        }

        public void mUb(Canvas canvas, RecyclerView recyclerView) {
        }

        public void Uo(Rect rect, View view, RecyclerView recyclerView, State state) {
            J2(rect, ((LayoutParams) view.getLayoutParams()).n(), recyclerView);
        }

        public void gh(Canvas canvas, RecyclerView recyclerView, State state) {
            mUb(canvas, recyclerView);
        }

        public void xMQ(Canvas canvas, RecyclerView recyclerView, State state) {
            KN(canvas, recyclerView);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.f40957n);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.bzg(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.t(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.mChildHelper.gh(view);
        } else {
            this.mChildHelper.rl(view, true);
        }
    }

    static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && EdgeEffectCompat.rl(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i3) / FLING_DESTRETCH_FACTOR) * EdgeEffectCompat.nr(edgeEffect, ((-i2) * FLING_DESTRETCH_FACTOR) / i3, 0.5f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || EdgeEffectCompat.rl(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f3 = i3;
        int iRound2 = Math.round((f3 / FLING_DESTRETCH_FACTOR) * EdgeEffectCompat.nr(edgeEffect2, (i2 * FLING_DESTRETCH_FACTOR) / f3, 0.5f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AccessibilityEventCompat.rl(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.n(1);
        fillRemainingScrollValues(this.mState);
        this.mState.mUb = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.J2();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        state.xMQ = state.gh && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.KN = state.qie;
        state.J2 = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.gh) {
            int iUo = this.mChildHelper.Uo();
            for (int i2 = 0; i2 < iUo; i2++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.J2(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.O(childViewHolderInt, this.mItemAnimator.XQ(this.mState, childViewHolderInt, ItemAnimator.O(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.xMQ && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.t(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.qie) {
            saveOldPositions();
            State state2 = this.mState;
            boolean z2 = state2.Uo;
            state2.Uo = false;
            this.mLayout.Vvq(this.mRecycler, state2);
            this.mState.Uo = z2;
            for (int i3 = 0; i3 < this.mChildHelper.Uo(); i3++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.J2(i3));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.xMQ(childViewHolderInt2)) {
                    int iO = ItemAnimator.O(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iO |= 4096;
                    }
                    ItemAnimator.ItemHolderInfo itemHolderInfoXQ = this.mItemAnimator.XQ(this.mState, childViewHolderInt2, iO, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfoXQ);
                    } else {
                        this.mViewInfoStore.n(childViewHolderInt2, itemHolderInfoXQ);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f41186O = 2;
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.n(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.f41186O = 1;
        if (state.gh) {
            for (int iUo = this.mChildHelper.Uo() - 1; iUo >= 0; iUo--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.J2(iUo));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.ItemHolderInfo itemHolderInfoZ = this.mItemAnimator.Z(this.mState, childViewHolderInt);
                    ViewHolder viewHolderUo = this.mViewInfoStore.Uo(changedHolderKey);
                    if (viewHolderUo == null || viewHolderUo.shouldIgnore()) {
                        this.mViewInfoStore.nr(childViewHolderInt, itemHolderInfoZ);
                    } else {
                        boolean zKN = this.mViewInfoStore.KN(viewHolderUo);
                        boolean zKN2 = this.mViewInfoStore.KN(childViewHolderInt);
                        if (zKN && viewHolderUo == childViewHolderInt) {
                            this.mViewInfoStore.nr(childViewHolderInt, itemHolderInfoZ);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoTy = this.mViewInfoStore.ty(viewHolderUo);
                            this.mViewInfoStore.nr(childViewHolderInt, itemHolderInfoZ);
                            ItemAnimator.ItemHolderInfo itemHolderInfoAz = this.mViewInfoStore.az(childViewHolderInt);
                            if (itemHolderInfoTy == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, viewHolderUo);
                            } else {
                                animateChange(viewHolderUo, childViewHolderInt, itemHolderInfoTy, itemHolderInfoAz, zKN, zKN2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.mViewInfoStore.HI(recyclerView.mViewInfoProcessCallback);
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.Toy(recyclerView.mRecycler);
        State state2 = recyclerView.mState;
        state2.f41188t = state2.J2;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        state2.gh = false;
        state2.qie = false;
        recyclerView.mLayout.KN = false;
        ArrayList arrayList = recyclerView.mRecycler.rl;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = recyclerView.mLayout;
        if (layoutManager.ty) {
            layoutManager.az = 0;
            layoutManager.ty = false;
            recyclerView.mRecycler.Xw();
        }
        recyclerView.mLayout.y(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        recyclerView.mViewInfoStore.J2();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.n(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iUo = this.mChildHelper.Uo();
        if (iUo == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < iUo; i5++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.J2(i5));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    @Nullable
    static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        State state = this.mState;
        int i2 = state.az;
        if (i2 == -1) {
            i2 = 0;
        }
        int iRl = state.rl();
        for (int i3 = i2; i3 < iRl; i3++) {
            ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iRl, i2);
        do {
            iMin--;
            if (iMin < 0 || (viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }

    private boolean fling(int i2, int i3, int i5, int i7) {
        int iMax;
        int i8;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean zViF = layoutManager.ViF();
        boolean zNY = this.mLayout.nY();
        if (!zViF || Math.abs(i2) < i5) {
            i2 = 0;
        }
        if (!zNY || Math.abs(i3) < i5) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        if (i2 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || EdgeEffectCompat.rl(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && EdgeEffectCompat.rl(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i2, getWidth())) {
                        this.mRightGlow.onAbsorb(i2);
                        i2 = 0;
                    }
                    iMax = i2;
                    i2 = 0;
                }
                iMax = 0;
            } else {
                int i9 = -i2;
                if (shouldAbsorb(this.mLeftGlow, i9, getWidth())) {
                    this.mLeftGlow.onAbsorb(i9);
                    i2 = 0;
                }
                iMax = i2;
                i2 = 0;
            }
        }
        if (i3 == 0) {
            i8 = i3;
            i3 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || EdgeEffectCompat.rl(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && EdgeEffectCompat.rl(edgeEffect4) != 0.0f) {
                    if (shouldAbsorb(this.mBottomGlow, i3, getHeight())) {
                        this.mBottomGlow.onAbsorb(i3);
                        i3 = 0;
                    }
                    i8 = 0;
                }
                i8 = i3;
                i3 = 0;
            } else {
                int i10 = -i3;
                if (shouldAbsorb(this.mTopGlow, i10, getHeight())) {
                    this.mTopGlow.onAbsorb(i10);
                    i3 = 0;
                }
                i8 = 0;
            }
        }
        if (iMax != 0 || i3 != 0) {
            int i11 = -i7;
            iMax = Math.max(i11, Math.min(iMax, i7));
            i3 = Math.max(i11, Math.min(i3, i7));
            startNestedScrollForType(1);
            this.mViewFlinger.rl(iMax, i3);
        }
        if (i2 == 0 && i8 == 0) {
            return (iMax == 0 && i3 == 0) ? false : true;
        }
        float f3 = i2;
        float f4 = i8;
        if (!dispatchNestedPreFling(f3, f4)) {
            boolean z2 = zViF || zNY;
            dispatchNestedFling(f3, f4, z2);
            OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.n(i2, i8)) {
                return true;
            }
            if (z2) {
                startNestedScrollForType(1);
                int i12 = -i7;
                this.mViewFlinger.rl(Math.max(i12, Math.min(i2, i7)), Math.max(i12, Math.min(i8, i7)));
                return true;
            }
        }
        return false;
    }

    static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f41169n;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int iUo = this.mChildHelper.Uo();
        for (int i2 = 0; i2 < iUo; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.J2(i2));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j2) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iUo = this.mChildHelper.Uo();
        for (int i2 = 0; i2 < iUo; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.J2(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new ChildHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.6
            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int Uo(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void addView(View view, int i2) {
                RecyclerView.this.addView(view, i2);
                RecyclerView.this.dispatchChildAttached(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public View n(int i2) {
                return RecyclerView.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int t() {
                return RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void xMQ(int i2) {
                View childAt = RecyclerView.this.getChildAt(i2);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i2);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void J2() {
                int iT = t();
                for (int i2 = 0; i2 < iT; i2++) {
                    View viewN = n(i2);
                    RecyclerView.this.dispatchChildDetached(viewN);
                    viewN.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void KN(View view) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void O(int i2) {
                View viewN = n(i2);
                if (viewN != null) {
                    ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewN);
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                            throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                        }
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "tmpDetach " + childViewHolderInt);
                        }
                        childViewHolderInt.addFlags(256);
                    }
                } else if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new IllegalArgumentException("No view at offset " + i2 + RecyclerView.this.exceptionLabel());
                }
                RecyclerView.this.detachViewFromParent(i2);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void mUb(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "reAttach " + childViewHolderInt);
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                } else if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i2 + RecyclerView.this.exceptionLabel());
                }
                RecyclerView.this.attachViewToParent(view, i2, layoutParams);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public ViewHolder nr(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void rl(View view) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }
        });
    }

    private void nestedScrollByInternal(int i2, int i3, @Nullable MotionEvent motionEvent, int i5) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, gUxOLwRQBPPLC.eImOCAq);
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zViF = layoutManager.ViF();
        boolean zNY = this.mLayout.nY();
        int i7 = zNY ? (zViF ? 1 : 0) | 2 : zViF ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i2 - releaseHorizontalGlow(i2, height);
        int iReleaseVerticalGlow = i3 - releaseVerticalGlow(i3, width);
        startNestedScroll(i7, i5);
        if (dispatchNestedPreScroll(zViF ? iReleaseHorizontalGlow : 0, zNY ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i5)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zViF ? iReleaseHorizontalGlow : 0, zNY ? iReleaseVerticalGlow : 0, motionEvent, i5);
        GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            gapWorker.J2(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i5);
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.lS();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.ViF();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.Zmq(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.WPU();
        } else {
            this.mAdapterHelper.mUb();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.gh = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.KN) && (!z2 || this.mAdapter.hasStableIds());
        State state = this.mState;
        state.qie = state.gh && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.mChildHelper.ty(getFocusedChild())) {
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        ViewHolder viewHolderFindViewHolderForItemId = (this.mState.ty == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.ty);
        if (viewHolderFindViewHolderForItemId != null && !this.mChildHelper.ty(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = viewHolderFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.Uo() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i2 = this.mState.HI;
            if (i2 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f41170t) {
                Rect rect = layoutParams2.rl;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.NP(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.ty = -1L;
        state.az = -1;
        state.HI = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.ty = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
        this.mState.az = this.mDataSetHasChangedAfterLayout ? -1 : viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.HI = getDeepestFocusedViewWithId(viewHolderFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z2, boolean z3) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.ViF();
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.QZ6(adapter3, this.mAdapter);
        }
        this.mRecycler.ViF(adapter3, this.mAdapter, z2);
        this.mState.Uo = true;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        sDebugAssertionsEnabled = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        sVerboseLoggingEnabled = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startNestedScrollForType(int i2) {
        boolean zViF = this.mLayout.ViF();
        int i3 = zViF;
        if (this.mLayout.nY()) {
            i3 = (zViF ? 1 : 0) | 2;
        }
        startNestedScroll(i3, i2);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || EdgeEffectCompat.rl(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z2 = false;
        } else {
            EdgeEffectCompat.nr(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z2 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && EdgeEffectCompat.rl(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            EdgeEffectCompat.nr(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z2 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && EdgeEffectCompat.rl(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            EdgeEffectCompat.nr(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || EdgeEffectCompat.rl(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z2;
        }
        EdgeEffectCompat.nr(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.J2();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mx();
        }
    }

    void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.tFV(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        Preconditions.rl(recyclerListener != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.Uo(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.g((LayoutParams) layoutParams);
    }

    void clearOldPositions() {
        int iMUb = this.mChildHelper.mUb();
        for (int i2 = 0; i2 < iMUb; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.nr();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.ViF()) {
            return this.mLayout.E2(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.ViF()) {
            return this.mLayout.e(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.ViF()) {
            return this.mLayout.X(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.nY()) {
            return this.mLayout.T(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.nY()) {
            return this.mLayout.N(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.nY()) {
            return this.mLayout.nHg(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    int consumeFlingInHorizontalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.ck()) {
            if (!this.mAdapterHelper.HI(4) || this.mAdapterHelper.HI(11)) {
                if (this.mAdapterHelper.ck()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.WPU();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.xMQ();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.mUb = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f41186O == 1) {
            dispatchLayoutStep1();
            this.mLayout.Fp(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.Ik() || z2 || this.mLayout.mYa() != getWidth() || this.mLayout.piY() != getHeight()) {
            this.mLayout.Fp(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.Fp(this);
        }
        dispatchLayoutStep3();
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().nr(i2, i3, iArr, iArr2, i5);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i5, int i7, int[] iArr, int i8) {
        return getScrollingChildHelper().Uo(i2, i3, i5, i7, iArr, i8);
    }

    void dispatchOnScrollStateChanged(int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.n7b(i2);
        }
        onScrollStateChanged(i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.n(this, i2);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).n(this, i2);
            }
        }
    }

    void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.rl(this, i2, i3);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).rl(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i2 = viewHolder.mPendingAccessibilityState) != -1) {
                viewHolder.itemView.setImportantForAccessibility(i2);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectN = this.mEdgeEffectFactory.n(this, 3);
        this.mBottomGlow = edgeEffectN;
        if (this.mClipToPadding) {
            edgeEffectN.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectN.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectN = this.mEdgeEffectFactory.n(this, 0);
        this.mLeftGlow = edgeEffectN;
        if (this.mClipToPadding) {
            edgeEffectN.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectN.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectN = this.mEdgeEffectFactory.n(this, 2);
        this.mRightGlow = edgeEffectN;
        if (this.mClipToPadding) {
            edgeEffectN.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectN.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectN = this.mEdgeEffectFactory.n(this, 1);
        this.mTopGlow = edgeEffectN;
        if (this.mClipToPadding) {
            edgeEffectN.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectN.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    @Nullable
    public View findChildViewUnder(float f3, float f4) {
        for (int iUo = this.mChildHelper.Uo() - 1; iUo >= 0; iUo--) {
            View viewJ2 = this.mChildHelper.J2(iUo);
            float translationX = viewJ2.getTranslationX();
            float translationY = viewJ2.getTranslationY();
            if (f3 >= viewJ2.getLeft() + translationX && f3 <= viewJ2.getRight() + translationX && f4 >= viewJ2.getTop() + translationY && f4 <= viewJ2.getBottom() + translationY) {
                return viewJ2;
            }
        }
        return null;
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i2) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iMUb = this.mChildHelper.mUb();
        for (int i3 = 0; i3 < iMUb; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                if (!this.mChildHelper.ty(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j2) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iMUb = this.mChildHelper.mUb();
            for (int i2 = 0; i2 < iMUb; i2++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    if (!this.mChildHelper.ty(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    ViewHolder findViewHolderForPosition(int i2, boolean z2) {
        int iMUb = this.mChildHelper.mUb();
        ViewHolder viewHolder = null;
        for (int i3 = 0; i3 < iMUb; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z2) {
                    if (childViewHolderInt.mPosition != i2) {
                        continue;
                    } else {
                        if (!this.mChildHelper.ty(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i2) {
                    continue;
                }
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i2) {
        View viewBu;
        boolean z2;
        View viewUF = this.mLayout.UF(view, i2);
        if (viewUF != null) {
            return viewUF;
        }
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z3 || (i2 != 2 && i2 != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewBu = this.mLayout.Bu(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewBu = viewFindNextFocus;
            }
        } else if (this.mLayout.nY()) {
            if (focusFinder.findNextFocus(this, view, i2 == 2 ? 130 : 33) == null) {
                z2 = true;
            }
            if (!z2) {
                z2 = focusFinder.findNextFocus(this, view, !((this.mLayout.m() != 1) ^ (i2 != 2)) ? 66 : 17) == null;
            }
            if (z2) {
            }
            viewBu = focusFinder.findNextFocus(this, view, i2);
        } else {
            z2 = false;
            if (!z2 && this.mLayout.ViF()) {
                z2 = focusFinder.findNextFocus(this, view, !((this.mLayout.m() != 1) ^ (i2 != 2)) ? 66 : 17) == null;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.Bu(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewBu = focusFinder.findNextFocus(this, view, i2);
        }
        if (viewBu == null || viewBu.hasFocusable()) {
            return isPreferredNextFocus(view, viewBu, i2) ? viewBu : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(viewBu, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.U();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.O(viewHolder.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.p5() : super.getBaseline();
    }

    long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i2, i3) : childDrawingOrderCallback.n(i2, i3);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.xMQ();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().qie(i2);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.ck();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new AdapterHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.7
            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public ViewHolder J2(int i2) {
                ViewHolder viewHolderFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
                if (viewHolderFindViewHolderForPosition == null) {
                    return null;
                }
                if (!RecyclerView.this.mChildHelper.ty(viewHolderFindViewHolderForPosition.itemView)) {
                    return viewHolderFindViewHolderForPosition;
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
                }
                return null;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void KN(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.nr += i3;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void O(int i2, int i3, Object obj) {
                RecyclerView.this.viewRangeUpdate(i2, i3, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void Uo(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForInsert(i2, i3);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void n(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForMove(i2, i3);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void nr(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            void xMQ(AdapterHelper.UpdateOp updateOp) {
                int i2 = updateOp.f40968n;
                if (i2 == 1) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.X4T(recyclerView, updateOp.rl, updateOp.nr);
                    return;
                }
                if (i2 == 2) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.xVH(recyclerView2, updateOp.rl, updateOp.nr);
                } else if (i2 == 4) {
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.mLayout.uG(recyclerView3, updateOp.rl, updateOp.nr, updateOp.f40969t);
                } else {
                    if (i2 != 8) {
                        return;
                    }
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.mLayout.JVN(recyclerView4, updateOp.rl, updateOp.nr, 1);
                }
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void rl(AdapterHelper.UpdateOp updateOp) {
                xMQ(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void t(AdapterHelper.UpdateOp updateOp) {
                xMQ(updateOp);
            }
        });
    }

    @VisibleForTesting
    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.f40959n), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.f40960t), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.rl));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.XQ("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.ck();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.LPV(i2);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int iMUb = this.mChildHelper.mUb();
        for (int i2 = 0; i2 < iMUb; i2++) {
            ((LayoutParams) this.mChildHelper.xMQ(i2).getLayoutParams()).f41170t = true;
        }
        this.mRecycler.o();
    }

    void markKnownViewsInvalid() {
        int iMUb = this.mChildHelper.mUb();
        for (int i2 = 0; i2 < iMUb; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.Z();
    }

    public void offsetChildrenHorizontal(@Px int i2) {
        int iUo = this.mChildHelper.Uo();
        for (int i3 = 0; i3 < iUo; i3++) {
            this.mChildHelper.J2(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(@Px int i2) {
        int iUo = this.mChildHelper.Uo();
        for (int i3 = 0; i3 < iUo; i3++) {
            this.mChildHelper.J2(i3).offsetTopAndBottom(i2);
        }
    }

    void offsetPositionRecordsForInsert(int i2, int i3) {
        int iMUb = this.mChildHelper.mUb();
        for (int i5 = 0; i5 < iMUb; i5++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i5 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i3));
                }
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.Uo = true;
            }
        }
        this.mRecycler.S(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i2, int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int iMUb = this.mChildHelper.mUb();
        if (i2 < i3) {
            i8 = -1;
            i7 = i2;
            i5 = i3;
        } else {
            i5 = i2;
            i7 = i3;
            i8 = 1;
        }
        for (int i10 = 0; i10 < iMUb; i10++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i10));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i7 && i9 <= i5) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i10 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i8, false);
                }
                this.mState.Uo = true;
            }
        }
        this.mRecycler.WPU(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i5 = i2 + i3;
        int iMUb = this.mChildHelper.mUb();
        for (int i7 = 0; i7 < iMUb; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i8 = childViewHolderInt.mPosition;
                if (i8 >= i5) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i7 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i3));
                    }
                    childViewHolderInt.offsetPosition(-i3, z2);
                    this.mState.Uo = true;
                } else if (i8 >= i2) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i7 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.mState.Uo = true;
                }
            }
        }
        this.mRecycler.aYN(i2, i3, z2);
        requestLayout();
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            if (sDebugAssertionsEnabled && i2 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        boolean z2;
        float axisValue;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f3 = this.mLayout.nY() ? -motionEvent.getAxisValue(9) : 0.0f;
                z2 = false;
                axisValue = this.mLayout.ViF() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f3;
                i2 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i2 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.nY()) {
                    float f4 = -axisValue;
                    axisValue = 0.0f;
                    f = f4;
                } else if (!this.mLayout.ViF()) {
                    axisValue = 0.0f;
                }
                z2 = this.mLowResRotaryEncoderFeature;
            } else {
                i2 = 0;
                z2 = false;
                axisValue = 0.0f;
            }
            int i3 = (int) (f * this.mScaledVerticalScrollFactor);
            int i5 = (int) (axisValue * this.mScaledHorizontalScrollFactor);
            if (z2) {
                OverScroller overScroller = this.mViewFlinger.f41189O;
                recyclerView = this;
                recyclerView.smoothScrollBy(i5 + (overScroller.getFinalX() - overScroller.getCurrX()), i3 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                nestedScrollByInternal(i5, i3, motionEvent, 1);
            }
            if (i2 != 0 && !z2) {
                recyclerView.mDifferentialMotionFlingController.Uo(motionEvent, i2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zViF = layoutManager.ViF();
        boolean zNY = this.mLayout.nY();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            startNestedScrollForType(0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x3 - this.mInitialTouchX;
                int i3 = y3 - this.mInitialTouchY;
                if (!zViF || Math.abs(i2) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (zNY && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (layoutManager.Po6()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.Zn(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f41186O == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.SR(i2, i3);
            this.mState.mUb = true;
            dispatchLayoutStep2();
            this.mLayout.tEO(i2, i3);
            if (this.mLayout.l()) {
                this.mLayout.SR(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.mUb = true;
                dispatchLayoutStep2();
                this.mLayout.tEO(i2, i3);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.Zn(this.mRecycler, this.mState, i2, i3);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            State state = this.mState;
            if (state.qie) {
                state.KN = true;
            } else {
                this.mAdapterHelper.mUb();
                this.mState.KN = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.qie) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.J2 = adapter.getItemCount();
        } else {
            this.mState.J2 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.Zn(this.mRecycler, this.mState, i2, i3);
        stopInterceptRequestLayout(false);
        this.mState.KN = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.n());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.rl(savedState2);
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.f41179O = layoutManager.o9();
            return savedState;
        }
        savedState.f41179O = null;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zViF = layoutManager.ViF();
        boolean zNY = this.mLayout.nY();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            startNestedScrollForType(0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f3 = zViF ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f4 = zNY ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f3 == 0.0f && f4 == 0.0f) || !fling((int) f3, (int) f4)) {
                    setScrollState(0);
                }
                resetScroll();
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x3;
                int iMax2 = this.mLastTouchY - y3;
                if (this.mScrollState != 1) {
                    if (zViF) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                        if (iMax != 0) {
                            z2 = true;
                        }
                        if (zNY) {
                        }
                        if (z2) {
                        }
                    } else {
                        z2 = false;
                        if (zNY) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                            if (iMax2 != 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zViF ? iReleaseHorizontalGlow : 0, zNY ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i2 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i2 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x3 - iArr7[0];
                    this.mLastTouchY = y3 - iArr7[1];
                    if (scrollByInternal(zViF ? iReleaseHorizontalGlow : 0, zNY ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    GapWorker gapWorker = this.mGapWorker;
                    if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        gapWorker.J2(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x4;
                this.mInitialTouchX = x4;
                int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y4;
                this.mInitialTouchY = y4;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        ViewCompat.Nxk(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.gh();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.jO(this.mRecycler);
            this.mLayout.Toy(this.mRecycler);
        }
        this.mRecycler.t();
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.XQ("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    void repositionShadowingViews() {
        ViewHolder viewHolder;
        int iUo = this.mChildHelper.Uo();
        for (int i2 = 0; i2 < iUo; i2++) {
            View viewJ2 = this.mChildHelper.J2(i2);
            ViewHolder childViewHolder = getChildViewHolder(viewJ2);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = viewJ2.getLeft();
                int top = viewJ2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.vl(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.D76(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).O(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int iMUb = this.mChildHelper.mUb();
        for (int i2 = 0; i2 < iMUb; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.xMQ(i2));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zViF = layoutManager.ViF();
        boolean zNY = this.mLayout.nY();
        if (zViF || zNY) {
            if (!zViF) {
                i2 = 0;
            }
            if (!zNY) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null, 0);
        }
    }

    boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            i9 = i2 - i11;
            i10 = i3 - i12;
            i8 = i12;
            i7 = i11;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i7, i8, i9, i10, this.mScrollOffset, i5, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i13 = iArr4[0];
        int i14 = i9 - i13;
        int i15 = iArr4[1];
        int i16 = i10 - i15;
        boolean z2 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i18 = iArr5[0];
        this.mLastTouchX = i17 - i18;
        int i19 = this.mLastTouchY;
        int i20 = iArr5[1];
        this.mLastTouchY = i19 - i20;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i18;
        iArr6[1] = iArr6[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.n(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i14, motionEvent.getY(), i16);
                if (Build.VERSION.SDK_INT >= 31 && MotionEventCompat.n(motionEvent, 4194304)) {
                    releaseGlows();
                }
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i7 != 0 || i8 != 0) {
            dispatchOnScrolled(i7, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i7 == 0 && i8 == 0) ? false : true;
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.LPV(i2);
            awakenScrollBars();
        }
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.eTf(this, recyclerViewAccessibilityDelegate);
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.gh();
            this.mItemAnimator.WPU(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.WPU(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.wTp(i2);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.gh();
            }
            this.mLayout.jO(this.mRecycler);
            this.mLayout.Toy(this.mRecycler);
            this.mRecycler.t();
            if (this.mIsAttached) {
                this.mLayout.bzg(this, this.mRecycler);
            }
            this.mLayout.yAc(null);
            this.mLayout = null;
        } else {
            this.mRecycler.t();
        }
        this.mChildHelper.HI();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.rl != null) {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.rl.exceptionLabel());
            }
            layoutManager.yAc(this);
            if (this.mIsAttached) {
                this.mLayout.rV9(this);
            }
        }
        this.mRecycler.Xw();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        this.mRecycler.nHg(recycledViewPool);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            Log.d(TAG, "setting scroll state to " + i2 + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.mRecycler.s7N(viewCacheExtension);
    }

    public void smoothScrollBy(@Px int i2, @Px int i3, @Nullable Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.uQ(this, this.mState, i2);
        }
    }

    void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().Ik(i2, i3);
    }

    void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().o(i2);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    void viewRangeUpdate(int i2, int i3, Object obj) {
        int i5;
        int iMUb = this.mChildHelper.mUb();
        int i7 = i2 + i3;
        for (int i8 = 0; i8 < iMUb; i8++) {
            View viewXMQ = this.mChildHelper.xMQ(i8);
            ViewHolder childViewHolderInt = getChildViewHolderInt(viewXMQ);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i5 = childViewHolderInt.mPosition) >= i2 && i5 < i7) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) viewXMQ.getLayoutParams()).f41170t = true;
            }
        }
        this.mRecycler.U(i2, i3);
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f3) {
                float f4 = f3 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            }
        };
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                    return;
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public void run() {
                ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
                if (itemAnimator != null) {
                    itemAnimator.S();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void nr(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mDataSetHasChangedAfterLayout) {
                    if (recyclerView.mItemAnimator.rl(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (recyclerView.mItemAnimator.nr(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void n(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void rl(ViewHolder viewHolder) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.wKp(viewHolder.itemView, recyclerView.mRecycler);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void t(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.mRecycler.bzg(viewHolder);
                RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }
        };
        DifferentialMotionFlingTarget differentialMotionFlingTarget = new DifferentialMotionFlingTarget() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.core.view.DifferentialMotionFlingTarget
            public boolean n(float f3) {
                int i3;
                int i5;
                if (RecyclerView.this.mLayout.nY()) {
                    i5 = (int) f3;
                    i3 = 0;
                } else if (RecyclerView.this.mLayout.ViF()) {
                    i3 = (int) f3;
                    i5 = 0;
                } else {
                    i3 = 0;
                    i5 = 0;
                }
                if (i3 == 0 && i5 == 0) {
                    return false;
                }
                RecyclerView.this.stopScroll();
                return RecyclerView.this.flingNoThresholdCheck(i3, i5);
            }

            @Override // androidx.core.view.DifferentialMotionFlingTarget
            public float rl() {
                float f3;
                if (RecyclerView.this.mLayout.nY()) {
                    f3 = RecyclerView.this.mScaledVerticalScrollFactor;
                } else {
                    if (!RecyclerView.this.mLayout.ViF()) {
                        return 0.0f;
                    }
                    f3 = RecyclerView.this.mScaledHorizontalScrollFactor;
                }
                return -f3;
            }

            @Override // androidx.core.view.DifferentialMotionFlingTarget
            public void t() {
                RecyclerView.this.stopScroll();
            }
        };
        this.mDifferentialMotionFlingTarget = differentialMotionFlingTarget;
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(getContext(), differentialMotionFlingTarget);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.J2(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.mUb(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.WPU(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = androidx.recyclerview.R.styleable.f40963n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        ViewCompat.ijL(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.mUb);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.nr, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.f40964t, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.f40962O, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.KN), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.xMQ), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.J2), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.Uo));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        createLayoutManager(context, string, attributeSet, i2, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        ViewCompat.ijL(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        PoolingContainer.KN(this, true);
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void dispatchLayoutStep2() {
        boolean z2;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.n(6);
        this.mAdapterHelper.mUb();
        this.mState.J2 = this.mAdapter.getItemCount();
        this.mState.nr = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f41179O;
            if (parcelable != null) {
                this.mLayout.v0j(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.KN = false;
        this.mLayout.Vvq(this.mRecycler, state);
        State state2 = this.mState;
        state2.Uo = false;
        if (state2.gh && this.mItemAnimator != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        state2.gh = z2;
        state2.f41186O = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i2);
            if (onItemTouchListener.t(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.rl;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private float getSplineFlingDistance(int i2) {
        double dLog = Math.log((Math.abs(i2) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f3 = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoef * SCROLL_FRICTION)) * Math.exp((((double) f3) / (((double) f3) - 1.0d)) * dLog));
    }

    private void initAutofill() {
        if (ViewCompat.ViF(this) == 0) {
            ViewCompat.Jk(this, 8);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private int releaseHorizontalGlow(int i2, float f3) {
        float height = f3 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f4 = 0.0f;
        if (edgeEffect != null && EdgeEffectCompat.rl(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f5 = -EdgeEffectCompat.nr(this.mLeftGlow, -width, 1.0f - height);
                if (EdgeEffectCompat.rl(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f4 = f5;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.rl(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fNr = EdgeEffectCompat.nr(this.mRightGlow, width, height);
                    if (EdgeEffectCompat.rl(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f4 = fNr;
                }
                invalidate();
            }
        }
        return Math.round(f4 * getWidth());
    }

    private int releaseVerticalGlow(int i2, float f3) {
        float width = f3 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f4 = 0.0f;
        if (edgeEffect != null && EdgeEffectCompat.rl(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f5 = -EdgeEffectCompat.nr(this.mTopGlow, -height, width);
                if (EdgeEffectCompat.rl(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f4 = f5;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.rl(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fNr = EdgeEffectCompat.nr(this.mBottomGlow, height, 1.0f - width);
                    if (EdgeEffectCompat.rl(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f4 = fNr;
                }
                invalidate();
            }
        }
        return Math.round(f4 * getHeight());
    }

    void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.t(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(LayoutManager.te(i2, getPaddingLeft() + getPaddingRight(), ViewCompat.te(this)), LayoutManager.te(i3, getPaddingTop() + getPaddingBottom(), ViewCompat.g(this)));
    }

    void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).nr(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).rl(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        LayoutManager layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.nY()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 92 && keyCode != 93) {
                if (keyCode == 122 || keyCode == 123) {
                    boolean zI = layoutManager.i();
                    if (keyCode == 122) {
                        if (zI) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zI) {
                        itemCount = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(itemCount);
                    return true;
                }
            } else {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    smoothScrollBy(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
        } else if (layoutManager.ViF()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 92 && keyCode2 != 93) {
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zI2 = layoutManager.i();
                    if (keyCode2 == 122) {
                        if (zI2) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zI2) {
                        itemCount = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(itemCount);
                    return true;
                }
            } else {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    smoothScrollBy(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    smoothScrollBy(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return getScrollingChildHelper().n(f3, f4, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().rl(f3, f4);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i5, int i7, int[] iArr, int i8, @NonNull int[] iArr2) {
        getScrollingChildHelper().O(i2, i3, i5, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        boolean z2;
        int paddingTop;
        boolean z3;
        boolean z4;
        int paddingBottom;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).gh(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z6 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int iSave = canvas.save();
            if (this.mClipToPadding) {
                paddingBottom = getPaddingBottom();
            } else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            canvas.restoreToCount(iSave);
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z2 |= z4;
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z2 |= z5;
            canvas.restoreToCount(iSave4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.ck()) {
            z6 = z2;
        }
        if (z6) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    final void fillRemainingScrollValues(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f41189O;
            state.ck = overScroller.getFinalX() - overScroller.getCurrX();
            state.Ik = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            state.ck = 0;
            state.Ik = 0;
        }
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f41170t) {
            return layoutParams.rl;
        }
        if (this.mState.O() && (layoutParams.rl() || layoutParams.nr())) {
            return layoutParams.rl;
        }
        Rect rect = layoutParams.rl;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).Uo(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f41170t = false;
        return rect;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().az();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z2 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        this.mRecycler.nY();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.rV9(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = GapWorker.f41064r;
            GapWorker gapWorker = (GapWorker) threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new GapWorker();
                Display displayZ = ViewCompat.Z(this);
                if (!isInEditMode() && displayZ != null) {
                    refreshRate = displayZ.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    GapWorker gapWorker2 = this.mGapWorker;
                    gapWorker2.f41065O = (long) (1.0E9f / refreshRate);
                    threadLocal.set(gapWorker2);
                } else {
                    refreshRate = 60.0f;
                    GapWorker gapWorker22 = this.mGapWorker;
                    gapWorker22.f41065O = (long) (1.0E9f / refreshRate);
                    threadLocal.set(gapWorker22);
                }
            }
            this.mGapWorker.n(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.gh();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.bzg(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mUb();
        this.mRecycler.g();
        PoolingContainer.t(this);
        if (ALLOW_THREAD_GAP_WORK && (gapWorker = this.mGapWorker) != null) {
            gapWorker.mUb(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).xMQ(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        super.onSizeChanged(i2, i3, i5, i7);
        if (i2 == i5 && i3 == i7) {
            return;
        }
        invalidateGlows();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zR = this.mChildHelper.r(view);
        if (zR) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.bzg(childViewHolderInt);
            this.mRecycler.T(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!zR);
        return zR;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    void scrollStep(int i2, int i3, @Nullable int[] iArr) {
        int iWaP;
        int iRxp;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i2 != 0) {
            iWaP = this.mLayout.waP(i2, this.mRecycler, this.mState);
        } else {
            iWaP = 0;
        }
        if (i3 != 0) {
            iRxp = this.mLayout.rxp(i3, this.mRecycler, this.mState);
        } else {
            iRxp = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iWaP;
            iArr[1] = iRxp;
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @VisibleForTesting
    boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i2) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i2;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        viewHolder.itemView.setImportantForAccessibility(i2);
        return true;
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        Preconditions.Uo(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().ty(z2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int iN;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            iN = AccessibilityEventCompat.n(accessibilityEvent);
        } else {
            iN = 0;
        }
        if (iN != 0) {
            i2 = iN;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(@Px int i2, @Px int i3, @Nullable Interpolator interpolator, int i5) {
        smoothScrollBy(i2, i3, interpolator, i5, false);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.M7(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(@Px int i2, @Px int i3, @Nullable Interpolator interpolator, int i5, boolean z2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.ViF()) {
            i2 = 0;
        }
        if (!this.mLayout.nY()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i5 != Integer.MIN_VALUE && i5 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i7 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i7 |= 2;
            }
            startNestedScroll(i7, 1);
        }
        this.mViewFlinger.O(i2, i3, i5, interpolator);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }
}
