package yc;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import yc.fhj;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fhj {
    private final GestureDetector HI;
    private float J2;
    private final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f75967O;
    private final float Uo;
    private Function0 az;
    private Function2 gh;
    private Runnable mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RecyclerView f75968n;
    private int nr;
    private Function1 qie;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f75969t;
    private n ty;
    private final float xMQ;

    public static final class j implements RecyclerView.OnItemTouchListener {

        /* JADX INFO: renamed from: yc.fhj$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C1285j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.J2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(boolean z2) {
            return "onRequestDisallowInterceptTouchEvent:" + z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void O(final boolean z2) {
            XoT.C.Uo(this, new Function0() { // from class: yc.Mje
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fhj.j.Uo(z2);
                }
            });
            if (fhj.this.ty == n.J2) {
                fhj.this.ck();
            }
            fhj.this.ty = n.f75976r;
            nCS.j.f71005n.t(4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void n(RecyclerView rv, MotionEvent e2) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(e2, "e");
            int actionMasked = e2.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    return;
                }
                if (C1285j.$EnumSwitchMapping$0[fhj.this.ty.ordinal()] == 1) {
                    fhj.this.r(e2);
                    return;
                }
                return;
            }
            if (fhj.this.ty == n.J2) {
                fhj.this.Ik();
            }
            fhj.this.ty = n.f75974n;
            nCS.j.f71005n.t(0);
            Function0 function0AYN = fhj.this.aYN();
            if (function0AYN != null) {
                function0AYN.invoke();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean t(RecyclerView rv, final MotionEvent e2) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(e2, "e");
            fhj.this.HI.onTouchEvent(e2);
            int actionMasked = e2.getActionMasked();
            if (actionMasked == 0) {
                fhj.this.ty = n.f75977t;
                nCS.j.f71005n.t(1);
            } else if (actionMasked == 1) {
                if (fhj.this.ty == n.J2) {
                    fhj.this.Ik();
                }
                fhj.this.ty = n.f75974n;
                nCS.j.f71005n.t(0);
                Function0 function0AYN = fhj.this.aYN();
                if (function0AYN != null) {
                    function0AYN.invoke();
                }
            }
            final fhj fhjVar = fhj.this;
            XoT.C.Uo(this, new Function0() { // from class: yc.bwY
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fhj.j.J2(fhjVar, e2);
                }
            });
            return fhj.this.ty == n.J2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String J2(fhj fhjVar, MotionEvent motionEvent) {
            return "onInterceptTouchEvent:(" + fhjVar.ty + ") e=" + motionEvent;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class n {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f75972S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ n[] f75973Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f75974n = new n("NONE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f75977t = new n("PENDING", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f75971O = new n("SCROLL", 2);
        public static final n J2 = new n("DRAG", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f75976r = new n("CANCELLED", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f75975o = new n("DONE", 5);

        static {
            n[] nVarArrN = n();
            f75973Z = nVarArrN;
            f75972S = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f75974n, f75977t, f75971O, J2, f75976r, f75975o};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f75973Z.clone();
        }

        private n(String str, int i2) {
        }
    }

    public static final class w6 extends GestureDetector.SimpleOnGestureListener {
        w6() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            if (fhj.this.ty == n.f75977t) {
                fhj.this.ty(e2);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f3, float f4) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            fhj.this.ty = n.f75971O;
            nCS.j.f71005n.t(2);
            return true;
        }
    }

    public fhj(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f75968n = recyclerView;
        this.nr = -1;
        this.f75967O = -1;
        this.J2 = 1.0f;
        this.Uo = recyclerView.getResources().getDimension(2131166396);
        this.KN = recyclerView.getResources().getDimension(2131166389);
        this.xMQ = recyclerView.getResources().getDimension(2131166390);
        this.ty = n.f75974n;
        this.HI = new GestureDetector(recyclerView.getContext(), new w6());
        recyclerView.addOnItemTouchListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(fhj fhjVar, int i2, View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.ViewHolder childViewHolder = fhjVar.f75968n.getChildViewHolder(child);
        if (childViewHolder != null) {
            Z5b z5b = childViewHolder instanceof Z5b ? (Z5b) childViewHolder : null;
            if (z5b != null && z5b.J2() == i2) {
                childViewHolder.itemView.setBackgroundColor(-12039333);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ik() {
        if (this.ty != n.J2) {
            throw new IllegalStateException("Check failed.");
        }
        this.ty = n.f75975o;
        nCS.j.f71005n.t(5);
        ViF();
        Function2 function2 = this.gh;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(this.nr), Integer.valueOf(this.f75967O));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(fhj fhjVar, float f3, View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = fhjVar.f75968n.findContainingViewHolder(child);
        AbstractC2448d abstractC2448d = viewHolderFindContainingViewHolder instanceof AbstractC2448d ? (AbstractC2448d) viewHolderFindContainingViewHolder : null;
        if (abstractC2448d != null) {
            int iJ2 = abstractC2448d.J2();
            int i2 = fhjVar.nr;
            if (iJ2 == i2) {
                child.setTranslationY(f3);
                child.setTranslationZ(1.0f);
            } else {
                int i3 = fhjVar.f75967O;
                int iJ22 = abstractC2448d.J2();
                if (i3 > iJ22 || iJ22 >= i2) {
                    int i5 = fhjVar.nr + 1;
                    int i7 = fhjVar.f75967O;
                    int iJ23 = abstractC2448d.J2();
                    if (i5 > iJ23 || iJ23 > i7) {
                        child.setTranslationY(0.0f);
                        child.setTranslationZ(0.0f);
                    } else {
                        child.setTranslationY(-fhjVar.WPU().getRowHeight());
                        child.setTranslationZ(0.0f);
                    }
                } else {
                    child.setTranslationY(fhjVar.WPU().getRowHeight());
                    child.setTranslationZ(0.0f);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void ViF() {
        Runnable runnable = this.mUb;
        if (runnable != null) {
            this.f75968n.removeCallbacks(runnable);
            this.mUb = null;
        }
        WPU().b(CollectionsKt.emptyList());
        WPU().Vd(0.0f);
        HI0.o7q.t(this.f75968n, new Function1() { // from class: yc.Su
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fhj.nY(this.f75850n, (View) obj);
            }
        });
        this.f75968n.invalidate();
        HI0.o7q.t(this.f75968n, new Function1() { // from class: yc.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fhj.g(this.f75745n, (View) obj);
            }
        });
    }

    private final TimelineLayoutManager WPU() {
        RecyclerView.LayoutManager layoutManager = this.f75968n.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager");
        return (TimelineLayoutManager) layoutManager;
    }

    private static final void XQ(float f3, final fhj fhjVar) {
        final float f4 = f3 - fhjVar.f75969t;
        fhjVar.WPU().Vd(f4);
        fhjVar.f75967O = MathKt.roundToInt(fhjVar.nr + (f4 / fhjVar.WPU().getRowHeight()));
        HI0.o7q.t(fhjVar.f75968n, new Function1() { // from class: yc.afV
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fhj.S(this.f75915n, f4, (View) obj);
            }
        });
        fhjVar.f75968n.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ck() {
        if (this.ty != n.J2) {
            throw new IllegalStateException("Check failed.");
        }
        this.ty = n.f75976r;
        nCS.j.f71005n.t(4);
        ViF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(fhj fhjVar, View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (fhjVar.f75968n.findContainingViewHolder(child) instanceof AbstractC2448d) {
            child.setTranslationY(0.0f);
            child.setTranslationZ(0.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(fhj fhjVar, View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.ViewHolder childViewHolder = fhjVar.f75968n.getChildViewHolder(child);
        if (childViewHolder != null && (childViewHolder instanceof Z5b)) {
            childViewHolder.itemView.setBackgroundColor(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(MotionEvent motionEvent) {
        if (this.ty != n.J2) {
            throw new IllegalStateException("Check failed.");
        }
        final float y2 = motionEvent.getY();
        float y3 = motionEvent.getY();
        float f3 = this.Uo;
        float f4 = this.KN;
        if (y3 < (f4 / 2.0f) + f3) {
            this.J2 = RangesKt.coerceAtLeast(((f3 + (f4 / 2.0f)) - motionEvent.getY()) / (this.KN / 3.0f), 1.0f);
            if (this.mUb == null) {
                Runnable runnable = new Runnable() { // from class: yc.dd
                    @Override // java.lang.Runnable
                    public final void run() {
                        fhj.o(this.f75953n, y2);
                    }
                };
                this.mUb = runnable;
                runnable.run();
                return;
            }
            return;
        }
        if (motionEvent.getY() <= this.f75968n.getHeight() - this.KN) {
            Runnable runnable2 = this.mUb;
            if (runnable2 != null) {
                this.f75968n.removeCallbacks(runnable2);
                this.mUb = null;
            }
            XQ(y2, this);
            return;
        }
        this.J2 = RangesKt.coerceAtLeast((motionEvent.getY() - this.f75968n.getHeight()) / (this.KN / 5.0f), 1.0f);
        if (this.mUb == null) {
            Runnable runnable3 = new Runnable() { // from class: yc.din
                @Override // java.lang.Runnable
                public final void run() {
                    fhj.Z(this.f75955n, y2);
                }
            };
            this.mUb = runnable3;
            runnable3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ty(MotionEvent motionEvent) {
        if (this.ty != n.f75977t) {
            throw new IllegalStateException("Check failed.");
        }
        View viewFindChildViewUnder = this.f75968n.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = viewFindChildViewUnder != null ? this.f75968n.findContainingViewHolder(viewFindChildViewUnder) : null;
        final int iJ2 = viewHolderFindContainingViewHolder instanceof AbstractC2448d ? ((AbstractC2448d) viewHolderFindContainingViewHolder).J2() : WPU().Of6(motionEvent.getY());
        HI0.o7q.t(this.f75968n, new Function1() { // from class: yc.qfL
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fhj.HI(this.f76094n, iJ2, (View) obj);
            }
        });
        Function1 function1 = this.qie;
        if (function1 == null || !((Boolean) function1.invoke(Integer.valueOf(iJ2))).booleanValue()) {
            this.ty = n.f75976r;
            nCS.j.f71005n.t(4);
            return;
        }
        this.ty = n.J2;
        nCS.j.f71005n.t(3);
        this.rl = motionEvent.getX();
        this.f75969t = motionEvent.getY();
        this.nr = iJ2;
        this.f75967O = iJ2;
        WPU().b(CollectionsKt.listOf(Integer.valueOf(this.nr)));
        WPU().jE(null);
        this.f75968n.invalidate();
    }

    public final Function0 aYN() {
        return this.az;
    }

    public final void fD(Function1 function1) {
        this.qie = function1;
    }

    public final void iF(Function0 function0) {
        this.az = function0;
    }

    public final void te(Function2 function2) {
        this.gh = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(fhj fhjVar, float f3) {
        int internalScrollY = fhjVar.WPU().getInternalScrollY();
        fhjVar.f75968n.scrollBy(0, (int) ((fhjVar.xMQ * fhjVar.J2) / 60));
        fhjVar.f75969t -= fhjVar.WPU().getInternalScrollY() - internalScrollY;
        XQ(f3, fhjVar);
        fhjVar.f75968n.postOnAnimationDelayed(fhjVar.mUb, 16L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(fhj fhjVar, float f3) {
        int internalScrollY = fhjVar.WPU().getInternalScrollY();
        fhjVar.f75968n.scrollBy(0, -((int) ((fhjVar.xMQ * fhjVar.J2) / 60)));
        fhjVar.f75969t -= fhjVar.WPU().getInternalScrollY() - internalScrollY;
        XQ(f3, fhjVar);
        fhjVar.f75968n.postOnAnimationDelayed(fhjVar.mUb, 16L);
    }
}
