package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    int HI;
    private int Ik;
    private float J2;
    float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f41079O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private List f41080S;
    private float Uo;
    private List XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    VelocityTracker f41081Z;
    Callback az;
    private long fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ItemTouchHelperGestureListener f41082g;
    private float gh;
    private Rect iF;
    private float mUb;
    GestureDetector nY;
    float nr;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    RecyclerView f41085r;
    float xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f41083n = new ArrayList();
    private final float[] rl = new float[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    RecyclerView.ViewHolder f41086t = null;
    int qie = -1;
    private int ty = 0;
    List ck = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Runnable f41084o = new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.1
        @Override // java.lang.Runnable
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.f41086t == null || !itemTouchHelper.E2()) {
                return;
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper2.f41086t;
            if (viewHolder != null) {
                itemTouchHelper2.nY(viewHolder);
            }
            ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
            itemTouchHelper3.f41085r.removeCallbacks(itemTouchHelper3.f41084o);
            ViewCompat.Nxk(ItemTouchHelper.this.f41085r, this);
        }
    };
    private RecyclerView.ChildDrawingOrderCallback WPU = null;
    View aYN = null;
    int ViF = -1;
    private final RecyclerView.OnItemTouchListener te = new RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void O(boolean z2) {
            if (z2) {
                ItemTouchHelper.this.e(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void n(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.nY.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.f41081Z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.qie == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.qie);
            if (iFindPointerIndex >= 0) {
                ItemTouchHelper.this.HI(actionMasked, motionEvent, iFindPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.f41086t;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        itemTouchHelper.s7N(motionEvent, itemTouchHelper.HI, iFindPointerIndex);
                        ItemTouchHelper.this.nY(viewHolder);
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.f41085r.removeCallbacks(itemTouchHelper2.f41084o);
                        ItemTouchHelper.this.f41084o.run();
                        ItemTouchHelper.this.f41085r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                    if (pointerId == itemTouchHelper3.qie) {
                        itemTouchHelper3.qie = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                        itemTouchHelper4.s7N(motionEvent, itemTouchHelper4.HI, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.f41081Z;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            ItemTouchHelper.this.e(null, 0);
            ItemTouchHelper.this.qie = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean t(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            RecoverAnimation recoverAnimationO;
            ItemTouchHelper.this.nY.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.qie = motionEvent.getPointerId(0);
                ItemTouchHelper.this.nr = motionEvent.getX();
                ItemTouchHelper.this.f41079O = motionEvent.getY();
                ItemTouchHelper.this.g();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.f41086t == null && (recoverAnimationO = itemTouchHelper.o(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.nr -= recoverAnimationO.mUb;
                    itemTouchHelper2.f41079O -= recoverAnimationO.gh;
                    itemTouchHelper2.r(recoverAnimationO.f41097O, true);
                    if (ItemTouchHelper.this.f41083n.remove(recoverAnimationO.f41097O.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.az.t(itemTouchHelper3.f41085r, recoverAnimationO.f41097O);
                    }
                    ItemTouchHelper.this.e(recoverAnimationO.f41097O, recoverAnimationO.J2);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.s7N(motionEvent, itemTouchHelper4.HI, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.qie = -1;
                itemTouchHelper5.e(null, 0);
            } else {
                int i2 = ItemTouchHelper.this.qie;
                if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    ItemTouchHelper.this.HI(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.f41081Z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.f41086t != null;
        }
    };

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ItemTouchHelper f41092n;

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int n(int i2, int i3) {
            ItemTouchHelper itemTouchHelper = this.f41092n;
            View view = itemTouchHelper.aYN;
            if (view != null) {
                int iIndexOfChild = itemTouchHelper.ViF;
                if (iIndexOfChild == -1) {
                    iIndexOfChild = itemTouchHelper.f41085r.indexOfChild(view);
                    this.f41092n.ViF = iIndexOfChild;
                }
                if (i3 == i2 - 1) {
                    return iIndexOfChild;
                }
                if (i3 >= iIndexOfChild) {
                    return i3 + 1;
                }
            }
            return i3;
        }
    }

    public static abstract class Callback {
        private static final Interpolator rl = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f3) {
                return f3 * f3 * f3 * f3 * f3;
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Interpolator f41093t = new Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f3) {
                float f4 = f3 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f41094n = -1;

        public static int O(int i2, int i3) {
            int i5;
            int i7 = i2 & 789516;
            if (i7 == 0) {
                return i2;
            }
            int i8 = i2 & (~i7);
            if (i3 == 0) {
                i5 = i7 << 2;
            } else {
                int i9 = i7 << 1;
                i8 |= (-789517) & i9;
                i5 = (i9 & 789516) << 2;
            }
            return i8 | i5;
        }

        public static int Z(int i2, int i3) {
            return o(2, i2) | o(1, i3) | o(0, i3 | i2);
        }

        public static int o(int i2, int i3) {
            return i3 << (i2 * 8);
        }

        public boolean Ik() {
            return true;
        }

        public int KN() {
            return 0;
        }

        public abstract boolean ViF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        public float az(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int gh(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float mUb(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public boolean n(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public int nr(int i2, int i3) {
            int i5;
            int i7 = i2 & 3158064;
            if (i7 == 0) {
                return i2;
            }
            int i8 = i2 & (~i7);
            if (i3 == 0) {
                i5 = i7 >> 2;
            } else {
                int i9 = i7 >> 1;
                i8 |= (-3158065) & i9;
                i5 = (i9 & 3158064) >> 2;
            }
            return i8 | i5;
        }

        public float qie(float f3) {
            return f3;
        }

        public boolean r() {
            return true;
        }

        public abstract void te(RecyclerView.ViewHolder viewHolder, int i2);

        public float ty(float f3) {
            return f3;
        }

        private int xMQ(RecyclerView recyclerView) {
            if (this.f41094n == -1) {
                this.f41094n = recyclerView.getResources().getDimensionPixelSize(R.dimen.nr);
            }
            return this.f41094n;
        }

        public void S(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f3, float f4, int i2, boolean z2) {
            ItemTouchUIUtilImpl.f41102n.nr(canvas, recyclerView, viewHolder.itemView, f3, f4, i2, z2);
        }

        public void XQ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f3, float f4, int i2, boolean z2) {
            ItemTouchUIUtilImpl.f41102n.t(canvas, recyclerView, viewHolder.itemView, f3, f4, i2, z2);
        }

        void aYN(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List list, int i2, float f3, float f4) {
            int size = list.size();
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                RecoverAnimation recoverAnimation = (RecoverAnimation) list.get(i3);
                int iSave = canvas.save();
                S(canvas, recyclerView, recoverAnimation.f41097O, recoverAnimation.mUb, recoverAnimation.gh, recoverAnimation.J2, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                S(canvas, recyclerView, viewHolder, f3, f4, i2, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i5 = size - 1; i5 >= 0; i5--) {
                RecoverAnimation recoverAnimation2 = (RecoverAnimation) list.get(i5);
                boolean z3 = recoverAnimation2.az;
                if (z3 && !recoverAnimation2.xMQ) {
                    list.remove(i5);
                } else if (!z3) {
                    z2 = true;
                }
            }
            if (z2) {
                recyclerView.invalidate();
            }
        }

        public void g(RecyclerView.ViewHolder viewHolder, int i2) {
            if (viewHolder != null) {
                ItemTouchUIUtilImpl.f41102n.rl(viewHolder.itemView);
            }
        }

        public RecyclerView.ViewHolder rl(RecyclerView.ViewHolder viewHolder, List list, int i2, int i3) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = viewHolder.itemView.getWidth() + i2;
            int height = i3 + viewHolder.itemView.getHeight();
            int left2 = i2 - viewHolder.itemView.getLeft();
            int top2 = i3 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i5 = -1;
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) list.get(i7);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i5) {
                    viewHolder2 = viewHolder3;
                    i5 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i2) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i5) {
                    viewHolder2 = viewHolder3;
                    i5 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i3) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i5) {
                    viewHolder2 = viewHolder3;
                    i5 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i5) {
                    viewHolder2 = viewHolder3;
                    i5 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void t(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            ItemTouchUIUtilImpl.f41102n.n(viewHolder.itemView);
        }

        boolean HI(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((J2(recyclerView, viewHolder) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        final int J2(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return nr(gh(recyclerView, viewHolder), recyclerView.getLayoutDirection());
        }

        public long Uo(RecyclerView recyclerView, int i2, float f3, float f4) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i2 == 8) {
                    return 200L;
                }
                return 250L;
            }
            if (i2 == 8) {
                return itemAnimator.ty();
            }
            return itemAnimator.HI();
        }

        void WPU(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List list, int i2, float f3, float f4) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                RecoverAnimation recoverAnimation = (RecoverAnimation) list.get(i3);
                recoverAnimation.O();
                int iSave = canvas.save();
                XQ(canvas, recyclerView, recoverAnimation.f41097O, recoverAnimation.mUb, recoverAnimation.gh, recoverAnimation.J2, false);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                XQ(canvas, recyclerView, viewHolder, f3, f4, i2, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public int ck(RecyclerView recyclerView, int i2, int i3, int i5, long j2) {
            int iXMQ = xMQ(recyclerView);
            float f3 = 1.0f;
            int iSignum = (int) (((int) Math.signum(i3)) * iXMQ * f41093t.getInterpolation(Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2)));
            if (j2 <= 2000) {
                f3 = j2 / 2000.0f;
            }
            int interpolation = (int) (iSignum * rl.getInterpolation(f3));
            if (interpolation == 0) {
                if (i3 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void nY(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i2, RecyclerView.ViewHolder viewHolder2, int i3, int i5, int i7) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).mUb(viewHolder.itemView, viewHolder2.itemView, i5, i7);
                return;
            }
            if (layoutManager.ViF()) {
                if (layoutManager.GR(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.k(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
            if (layoutManager.nY()) {
                if (layoutManager.dR0(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.a(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
        }
    }

    private class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f41095n = true;

        void n() {
            this.f41095n = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        ItemTouchHelperGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewZ;
            RecyclerView.ViewHolder childViewHolder;
            if (!this.f41095n || (viewZ = ItemTouchHelper.this.Z(motionEvent)) == null || (childViewHolder = ItemTouchHelper.this.f41085r.getChildViewHolder(viewZ)) == null) {
                return;
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.az.HI(itemTouchHelper.f41085r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i2 = ItemTouchHelper.this.qie;
                if (pointerId == i2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.nr = x2;
                    itemTouchHelper2.f41079O = y2;
                    itemTouchHelper2.xMQ = 0.0f;
                    itemTouchHelper2.KN = 0.0f;
                    if (itemTouchHelper2.az.r()) {
                        ItemTouchHelper.this.e(childViewHolder, 2);
                    }
                }
            }
        }
    }

    @VisibleForTesting
    static class RecoverAnimation implements Animator.AnimatorListener {
        final int J2;
        final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final RecyclerView.ViewHolder f41097O;
        final ValueAnimator Uo;
        float gh;
        float mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final float f41098n;
        final float nr;
        final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final float f41099t;
        private float ty;
        boolean xMQ;
        boolean qie = false;
        boolean az = false;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public void O() {
            float f3 = this.f41098n;
            float f4 = this.f41099t;
            if (f3 == f4) {
                this.mUb = this.f41097O.itemView.getTranslationX();
            } else {
                this.mUb = f3 + (this.ty * (f4 - f3));
            }
            float f5 = this.rl;
            float f6 = this.nr;
            if (f5 == f6) {
                this.gh = this.f41097O.itemView.getTranslationY();
            } else {
                this.gh = f5 + (this.ty * (f6 - f5));
            }
        }

        public void n() {
            this.Uo.cancel();
        }

        public void nr() {
            this.f41097O.setIsRecyclable(false);
            this.Uo.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            t(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.az) {
                this.f41097O.setIsRecyclable(true);
            }
            this.az = true;
        }

        public void rl(long j2) {
            this.Uo.setDuration(j2);
        }

        public void t(float f3) {
            this.ty = f3;
        }

        RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i2, int i3, float f3, float f4, float f5, float f6) {
            this.J2 = i3;
            this.KN = i2;
            this.f41097O = viewHolder;
            this.f41098n = f3;
            this.rl = f4;
            this.f41099t = f5;
            this.nr = f6;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.Uo = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.t(valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            t(0.0f);
        }
    }

    public static abstract class SimpleCallback extends Callback {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f41101O;
        private int nr;

        public int fD(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.nr;
        }

        public int iF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.f41101O;
        }

        public SimpleCallback(int i2, int i3) {
            this.nr = i3;
            this.f41101O = i2;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int gh(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return Callback.Z(iF(recyclerView, viewHolder), fD(recyclerView, viewHolder));
        }
    }

    public interface ViewDropHandler {
        void mUb(View view, View view2, int i2, int i3);
    }

    private void qie() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void nr(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void xMQ(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f3;
        float f4;
        this.ViF = -1;
        if (this.f41086t != null) {
            WPU(this.rl);
            float[] fArr = this.rl;
            float f5 = fArr[0];
            f4 = fArr[1];
            f3 = f5;
        } else {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.az.WPU(canvas, recyclerView, this.f41086t, this.ck, this.ty, f3, f4);
    }

    private void Ik() {
        this.f41085r.removeItemDecoration(this);
        this.f41085r.removeOnItemTouchListener(this.te);
        this.f41085r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.ck.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.ck.get(0);
            recoverAnimation.n();
            this.az.t(this.f41085r, recoverAnimation.f41097O);
        }
        this.ck.clear();
        this.aYN = null;
        this.ViF = -1;
        iF();
        N();
    }

    private void N() {
        ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.f41082g;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.n();
            this.f41082g = null;
        }
        if (this.nY != null) {
            this.nY = null;
        }
    }

    private RecyclerView.ViewHolder S(MotionEvent motionEvent) {
        View viewZ;
        RecyclerView.LayoutManager layoutManager = this.f41085r.getLayoutManager();
        int i2 = this.qie;
        if (i2 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        float x2 = motionEvent.getX(iFindPointerIndex) - this.nr;
        float y2 = motionEvent.getY(iFindPointerIndex) - this.f41079O;
        float fAbs = Math.abs(x2);
        float fAbs2 = Math.abs(y2);
        int i3 = this.Ik;
        if (fAbs < i3 && fAbs2 < i3) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.ViF()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.nY()) && (viewZ = Z(motionEvent)) != null) {
            return this.f41085r.getChildViewHolder(viewZ);
        }
        return null;
    }

    private void T() {
        this.f41082g = new ItemTouchHelperGestureListener();
        this.nY = new GestureDetector(this.f41085r.getContext(), this.f41082g);
    }

    private static boolean ViF(View view, float f3, float f4, float f5, float f6) {
        return f3 >= f5 && f3 <= f5 + ((float) view.getWidth()) && f4 >= f6 && f4 <= f6 + ((float) view.getHeight());
    }

    private void WPU(float[] fArr) {
        if ((this.HI & 12) != 0) {
            fArr[0] = (this.mUb + this.KN) - this.f41086t.itemView.getLeft();
        } else {
            fArr[0] = this.f41086t.itemView.getTranslationX();
        }
        if ((this.HI & 3) != 0) {
            fArr[1] = (this.gh + this.xMQ) - this.f41086t.itemView.getTop();
        } else {
            fArr[1] = this.f41086t.itemView.getTranslationY();
        }
    }

    private void X() {
        this.Ik = ViewConfiguration.get(this.f41085r.getContext()).getScaledTouchSlop();
        this.f41085r.addItemDecoration(this);
        this.f41085r.addOnItemTouchListener(this.te);
        this.f41085r.addOnChildAttachStateChangeListener(this);
        T();
    }

    private List XQ(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list = this.XQ;
        if (list == null) {
            this.XQ = new ArrayList();
            this.f41080S = new ArrayList();
        } else {
            list.clear();
            this.f41080S.clear();
        }
        int iKN = this.az.KN();
        int iRound = Math.round(this.mUb + this.KN) - iKN;
        int iRound2 = Math.round(this.gh + this.xMQ) - iKN;
        int i2 = iKN * 2;
        int width = viewHolder2.itemView.getWidth() + iRound + i2;
        int height = viewHolder2.itemView.getHeight() + iRound2 + i2;
        int i3 = (iRound + width) / 2;
        int i5 = (iRound2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.f41085r.getLayoutManager();
        int iM = layoutManager.M();
        int i7 = 0;
        while (i7 < iM) {
            View viewE = layoutManager.E(i7);
            if (viewE != viewHolder2.itemView && viewE.getBottom() >= iRound2 && viewE.getTop() <= height && viewE.getRight() >= iRound && viewE.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.f41085r.getChildViewHolder(viewE);
                if (this.az.n(this.f41085r, this.f41086t, childViewHolder)) {
                    int iAbs = Math.abs(i3 - ((viewE.getLeft() + viewE.getRight()) / 2));
                    int iAbs2 = Math.abs(i5 - ((viewE.getTop() + viewE.getBottom()) / 2));
                    int i8 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.XQ.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size && i8 > ((Integer) this.f41080S.get(i10)).intValue(); i10++) {
                        i9++;
                    }
                    this.XQ.add(i9, childViewHolder);
                    this.f41080S.add(i9, Integer.valueOf(i8));
                }
            }
            i7++;
            viewHolder2 = viewHolder;
        }
        return this.XQ;
    }

    private int ck(RecyclerView.ViewHolder viewHolder, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.xMQ > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f41081Z;
        if (velocityTracker != null && this.qie > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.az.ty(this.Uo));
            float xVelocity = this.f41081Z.getXVelocity(this.qie);
            float yVelocity = this.f41081Z.getYVelocity(this.qie);
            int i5 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i5 & i2) != 0 && i5 == i3 && fAbs >= this.az.qie(this.J2) && fAbs > Math.abs(xVelocity)) {
                return i5;
            }
        }
        float height = this.f41085r.getHeight() * this.az.az(viewHolder);
        if ((i2 & i3) == 0 || Math.abs(this.xMQ) <= height) {
            return 0;
        }
        return i3;
    }

    private void iF() {
        VelocityTracker velocityTracker = this.f41081Z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f41081Z = null;
        }
    }

    private int nHg(RecyclerView.ViewHolder viewHolder) {
        if (this.ty == 2) {
            return 0;
        }
        int iGh = this.az.gh(this.f41085r, viewHolder);
        int iNr = (this.az.nr(iGh, this.f41085r.getLayoutDirection()) & 65280) >> 8;
        if (iNr == 0) {
            return 0;
        }
        int i2 = (iGh & 65280) >> 8;
        if (Math.abs(this.KN) > Math.abs(this.xMQ)) {
            int iTy = ty(viewHolder, iNr);
            if (iTy > 0) {
                return (i2 & iTy) == 0 ? Callback.O(iTy, this.f41085r.getLayoutDirection()) : iTy;
            }
            int iCk = ck(viewHolder, iNr);
            if (iCk > 0) {
                return iCk;
            }
        } else {
            int iCk2 = ck(viewHolder, iNr);
            if (iCk2 > 0) {
                return iCk2;
            }
            int iTy2 = ty(viewHolder, iNr);
            if (iTy2 > 0) {
                return (i2 & iTy2) == 0 ? Callback.O(iTy2, this.f41085r.getLayoutDirection()) : iTy2;
            }
        }
        return 0;
    }

    private int ty(RecyclerView.ViewHolder viewHolder, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.KN > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f41081Z;
        if (velocityTracker != null && this.qie > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.az.ty(this.Uo));
            float xVelocity = this.f41081Z.getXVelocity(this.qie);
            float yVelocity = this.f41081Z.getYVelocity(this.qie);
            int i5 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i5 & i2) != 0 && i3 == i5 && fAbs >= this.az.qie(this.J2) && fAbs > Math.abs(yVelocity)) {
                return i5;
            }
        }
        float width = this.f41085r.getWidth() * this.az.az(viewHolder);
        if ((i2 & i3) == 0 || Math.abs(this.KN) <= width) {
            return 0;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean E2() {
        int iCk;
        int iCk2;
        if (this.f41086t == null) {
            this.fD = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.fD;
        long j3 = j2 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j2;
        RecyclerView.LayoutManager layoutManager = this.f41085r.getLayoutManager();
        if (this.iF == null) {
            this.iF = new Rect();
        }
        layoutManager.aYN(this.f41086t.itemView, this.iF);
        if (layoutManager.ViF()) {
            int i2 = (int) (this.mUb + this.KN);
            int paddingLeft = (i2 - this.iF.left) - this.f41085r.getPaddingLeft();
            float f3 = this.KN;
            iCk = ((f3 >= 0.0f || paddingLeft >= 0) && (f3 <= 0.0f || (paddingLeft = ((i2 + this.f41086t.itemView.getWidth()) + this.iF.right) - (this.f41085r.getWidth() - this.f41085r.getPaddingRight())) <= 0)) ? 0 : paddingLeft;
        }
        if (layoutManager.nY()) {
            int i3 = (int) (this.gh + this.xMQ);
            iCk2 = (i3 - this.iF.top) - this.f41085r.getPaddingTop();
            float f4 = this.xMQ;
            if ((f4 >= 0.0f || iCk2 >= 0) && (f4 <= 0.0f || (iCk2 = ((i3 + this.f41086t.itemView.getHeight()) + this.iF.bottom) - (this.f41085r.getHeight() - this.f41085r.getPaddingBottom())) <= 0)) {
                iCk2 = 0;
            }
        }
        if (iCk != 0) {
            iCk = this.az.ck(this.f41085r, this.f41086t.itemView.getWidth(), iCk, this.f41085r.getWidth(), j3);
        }
        int i5 = iCk;
        if (iCk2 != 0) {
            iCk2 = this.az.ck(this.f41085r, this.f41086t.itemView.getHeight(), iCk2, this.f41085r.getHeight(), j3);
        }
        if (i5 == 0 && iCk2 == 0) {
            this.fD = Long.MIN_VALUE;
            return false;
        }
        if (this.fD == Long.MIN_VALUE) {
            this.fD = jCurrentTimeMillis;
        }
        this.f41085r.scrollBy(i5, iCk2);
        return true;
    }

    void HI(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.ViewHolder viewHolderS;
        int iJ2;
        if (this.f41086t != null || i2 != 2 || this.ty == 2 || !this.az.Ik() || this.f41085r.getScrollState() == 1 || (viewHolderS = S(motionEvent)) == null || (iJ2 = (this.az.J2(this.f41085r, viewHolderS) & 65280) >> 8) == 0) {
            return;
        }
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f3 = x2 - this.nr;
        float f4 = y2 - this.f41079O;
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        int i5 = this.Ik;
        if (fAbs >= i5 || fAbs2 >= i5) {
            if (fAbs > fAbs2) {
                if (f3 < 0.0f && (iJ2 & 4) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iJ2 & 8) == 0) {
                    return;
                }
            } else {
                if (f4 < 0.0f && (iJ2 & 1) == 0) {
                    return;
                }
                if (f4 > 0.0f && (iJ2 & 2) == 0) {
                    return;
                }
            }
            this.xMQ = 0.0f;
            this.KN = 0.0f;
            this.qie = motionEvent.getPointerId(0);
            e(viewHolderS, 1);
        }
    }

    boolean aYN() {
        int size = this.ck.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((RecoverAnimation) this.ck.get(i2)).az) {
                return true;
            }
        }
        return false;
    }

    public void az(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f41085r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            Ik();
        }
        this.f41085r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.J2 = resources.getDimension(R.dimen.J2);
            this.Uo = resources.getDimension(R.dimen.f40958O);
            X();
        }
    }

    void e(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z2;
        float fSignum;
        float fSignum2;
        if (viewHolder == this.f41086t && i2 == this.ty) {
            return;
        }
        this.fD = Long.MIN_VALUE;
        int i3 = this.ty;
        r(viewHolder, true);
        this.ty = i2;
        if (i2 == 2) {
            if (viewHolder == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.aYN = viewHolder.itemView;
            qie();
        }
        int i5 = (1 << ((i2 * 8) + 8)) - 1;
        final RecyclerView.ViewHolder viewHolder2 = this.f41086t;
        boolean z3 = false;
        if (viewHolder2 != null) {
            if (viewHolder2.itemView.getParent() != null) {
                final int iNHg = i3 == 2 ? 0 : nHg(viewHolder2);
                iF();
                int i7 = 4;
                if (iNHg == 1 || iNHg == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.xMQ) * this.f41085r.getHeight();
                } else if (iNHg == 4 || iNHg == 8 || iNHg == 16 || iNHg == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.KN) * this.f41085r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i3 == 2) {
                    i7 = 8;
                } else if (iNHg > 0) {
                    i7 = 2;
                }
                WPU(this.rl);
                float[] fArr = this.rl;
                float f3 = fArr[0];
                float f4 = fArr[1];
                z2 = false;
                RecoverAnimation recoverAnimation = new RecoverAnimation(viewHolder2, i7, i3, f3, f4, fSignum, fSignum2) { // from class: androidx.recyclerview.widget.ItemTouchHelper.3
                    @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!this.qie) {
                            if (iNHg <= 0) {
                                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                                itemTouchHelper.az.t(itemTouchHelper.f41085r, viewHolder2);
                            } else {
                                ItemTouchHelper.this.f41083n.add(viewHolder2.itemView);
                                this.xMQ = true;
                                int i8 = iNHg;
                                if (i8 > 0) {
                                    ItemTouchHelper.this.te(this, i8);
                                }
                            }
                            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                            View view = itemTouchHelper2.aYN;
                            View view2 = viewHolder2.itemView;
                            if (view == view2) {
                                itemTouchHelper2.fD(view2);
                            }
                        }
                    }
                };
                recoverAnimation.rl(this.az.Uo(this.f41085r, i7, fSignum - f3, fSignum2 - f4));
                this.ck.add(recoverAnimation);
                recoverAnimation.nr();
                z3 = true;
            } else {
                z2 = false;
                fD(viewHolder2.itemView);
                this.az.t(this.f41085r, viewHolder2);
                z3 = false;
            }
            this.f41086t = null;
        } else {
            z2 = false;
        }
        if (viewHolder != null) {
            this.HI = (this.az.J2(this.f41085r, viewHolder) & i5) >> (this.ty * 8);
            this.mUb = viewHolder.itemView.getLeft();
            this.gh = viewHolder.itemView.getTop();
            this.f41086t = viewHolder;
            if (i2 == 2) {
                viewHolder.itemView.performHapticFeedback(z2 ? 1 : 0);
            }
        }
        ViewParent parent = this.f41085r.getParent();
        if (parent != null) {
            if (this.f41086t != null) {
                z2 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z2);
        }
        if (!z3) {
            this.f41085r.getLayoutManager().j();
        }
        this.az.g(this.f41086t, this.ty);
        this.f41085r.invalidate();
    }

    void fD(View view) {
        if (view == this.aYN) {
            this.aYN = null;
            if (this.WPU != null) {
                this.f41085r.setChildDrawingOrderCallback(null);
            }
        }
    }

    void g() {
        VelocityTracker velocityTracker = this.f41081Z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f41081Z = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void gh(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f3;
        float f4;
        if (this.f41086t != null) {
            WPU(this.rl);
            float[] fArr = this.rl;
            float f5 = fArr[0];
            f4 = fArr[1];
            f3 = f5;
        } else {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.az.aYN(canvas, recyclerView, this.f41086t, this.ck, this.ty, f3, f4);
    }

    void nY(RecyclerView.ViewHolder viewHolder) {
        if (!this.f41085r.isLayoutRequested() && this.ty == 2) {
            float fMUb = this.az.mUb(viewHolder);
            int i2 = (int) (this.mUb + this.KN);
            int i3 = (int) (this.gh + this.xMQ);
            if (Math.abs(i3 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * fMUb || Math.abs(i2 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * fMUb) {
                List listXQ = XQ(viewHolder);
                if (listXQ.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder viewHolderRl = this.az.rl(viewHolder, listXQ, i2, i3);
                if (viewHolderRl == null) {
                    this.XQ.clear();
                    this.f41080S.clear();
                    return;
                }
                int absoluteAdapterPosition = viewHolderRl.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (this.az.ViF(this.f41085r, viewHolder, viewHolderRl)) {
                    this.az.nY(this.f41085r, viewHolder, absoluteAdapterPosition2, viewHolderRl, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    RecoverAnimation o(MotionEvent motionEvent) {
        if (this.ck.isEmpty()) {
            return null;
        }
        View viewZ = Z(motionEvent);
        for (int size = this.ck.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.ck.get(size);
            if (recoverAnimation.f41097O.itemView == viewZ) {
                return recoverAnimation;
            }
        }
        return null;
    }

    void r(RecyclerView.ViewHolder viewHolder, boolean z2) {
        for (int size = this.ck.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.ck.get(size);
            if (recoverAnimation.f41097O == viewHolder) {
                recoverAnimation.qie |= z2;
                if (!recoverAnimation.az) {
                    recoverAnimation.n();
                }
                this.ck.remove(size);
                return;
            }
        }
    }

    void te(final RecoverAnimation recoverAnimation, final int i2) {
        this.f41085r.post(new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.4
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = ItemTouchHelper.this.f41085r;
                if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecoverAnimation recoverAnimation2 = recoverAnimation;
                if (recoverAnimation2.qie || recoverAnimation2.f41097O.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.f41085r.getItemAnimator();
                if ((itemAnimator == null || !itemAnimator.Ik(null)) && !ItemTouchHelper.this.aYN()) {
                    ItemTouchHelper.this.az.te(recoverAnimation.f41097O, i2);
                } else {
                    ItemTouchHelper.this.f41085r.post(this);
                }
            }
        });
    }

    public ItemTouchHelper(Callback callback) {
        this.az = callback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void Uo(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    View Z(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f41086t;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (ViF(view, x2, y2, this.mUb + this.KN, this.gh + this.xMQ)) {
                return view;
            }
        }
        for (int size = this.ck.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = (RecoverAnimation) this.ck.get(size);
            View view2 = recoverAnimation.f41097O.itemView;
            if (ViF(view2, x2, y2, recoverAnimation.mUb, recoverAnimation.gh)) {
                return view2;
            }
        }
        return this.f41085r.findChildViewUnder(x2, y2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void rl(View view) {
        fD(view);
        RecyclerView.ViewHolder childViewHolder = this.f41085r.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.ViewHolder viewHolder = this.f41086t;
            if (viewHolder != null && childViewHolder == viewHolder) {
                e(null, 0);
                return;
            }
            r(childViewHolder, false);
            if (this.f41083n.remove(childViewHolder.itemView)) {
                this.az.t(this.f41085r, childViewHolder);
            }
        }
    }

    void s7N(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f3 = x2 - this.nr;
        this.KN = f3;
        this.xMQ = y2 - this.f41079O;
        if ((i2 & 4) == 0) {
            this.KN = Math.max(0.0f, f3);
        }
        if ((i2 & 8) == 0) {
            this.KN = Math.min(0.0f, this.KN);
        }
        if ((i2 & 1) == 0) {
            this.xMQ = Math.max(0.0f, this.xMQ);
        }
        if ((i2 & 2) == 0) {
            this.xMQ = Math.min(0.0f, this.xMQ);
        }
    }
}
