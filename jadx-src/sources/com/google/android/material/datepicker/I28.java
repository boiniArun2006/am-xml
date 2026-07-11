package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public final class I28<S> extends com.google.android.material.datepicker.o {
    private View E2;
    private Month J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CalendarConstraints f58896O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private RecyclerView f58897S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private View f58898X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private RecyclerView f58899Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f58900e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f58901g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.material.datepicker.n f58902o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private o f58903r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58904t;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    static final Object f58894T = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    static final Object f58893N = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Object f58895v = "NAVIGATION_NEXT_TAG";
    static final Object Xw = "SELECTOR_TOGGLE_TAG";

    class C implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.aC f58905n;

        C(com.google.android.material.datepicker.aC aCVar) {
            this.f58905n = aCVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iLu = I28.this.wTp().Lu() + 1;
            if (iLu < I28.this.f58897S.getAdapter().getItemCount()) {
                I28.this.bzg(this.f58905n.az(iLu));
            }
        }
    }

    class CN3 extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Calendar f58907n = Xo.xMQ();
        private final Calendar rl = Xo.xMQ();

        CN3() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void xMQ(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if ((recyclerView.getAdapter() instanceof eO) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                I28.g(I28.this);
                throw null;
            }
        }
    }

    class Dsr extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.aC f58909n;
        final /* synthetic */ MaterialButton rl;

        Dsr(com.google.android.material.datepicker.aC aCVar, MaterialButton materialButton) {
            this.f58909n = aCVar;
            this.rl = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void n(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                recyclerView.announceForAccessibility(this.rl.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void rl(RecyclerView recyclerView, int i2, int i3) {
            int iLu = i2 < 0 ? I28.this.wTp().Lu() : I28.this.wTp().fW();
            I28.this.J2 = this.f58909n.az(iLu);
            this.rl.setText(this.f58909n.ty(iLu));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.I28$I28, reason: collision with other inner class name */
    class C0785I28 implements qz {
        C0785I28() {
        }

        @Override // com.google.android.material.datepicker.I28.qz
        public void n(long j2) {
            if (I28.this.f58896O.J2().T(j2)) {
                I28.g(I28.this);
                throw null;
            }
        }
    }

    class Ml extends com.google.android.material.datepicker.qz {

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f58912N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Context context, int i2, boolean z2, int i3) {
            super(context, i2, z2);
            this.f58912N = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void iV(RecyclerView.State state, int[] iArr) {
            if (this.f58912N == 0) {
                iArr[0] = I28.this.f58897S.getWidth();
                iArr[1] = I28.this.f58897S.getWidth();
            } else {
                iArr[0] = I28.this.f58897S.getHeight();
                iArr[1] = I28.this.f58897S.getHeight();
            }
        }
    }

    class Wre extends AccessibilityDelegateCompat {
        Wre() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.F(false);
        }
    }

    class aC implements View.OnClickListener {
        aC() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I28.this.U();
        }
    }

    class fuX extends AccessibilityDelegateCompat {
        fuX() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            super.Uo(view, accessibilityNodeInfoCompat);
            if (I28.this.f58898X.getVisibility() == 0) {
                string = I28.this.getString(Rxk.aC.nY);
            } else {
                string = I28.this.getString(Rxk.aC.aYN);
            }
            accessibilityNodeInfoCompat.GD(string);
        }
    }

    class j implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.aC f58914n;

        j(com.google.android.material.datepicker.aC aCVar) {
            this.f58914n = aCVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFW = I28.this.wTp().fW() - 1;
            if (iFW >= 0) {
                I28.this.bzg(this.f58914n.az(iFW));
            }
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f58916n;

        n(int i2) {
            this.f58916n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            I28.this.f58897S.smoothScrollToPosition(this.f58916n);
        }
    }

    enum o {
        DAY,
        YEAR
    }

    interface qz {
        void n(long j2);
    }

    class w6 extends AccessibilityDelegateCompat {
        w6() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.Mx(null);
        }
    }

    public DateSelector N() {
        return null;
    }

    private RecyclerView.ItemDecoration E2() {
        return new CN3();
    }

    private void fD(View view, com.google.android.material.datepicker.aC aCVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(Rxk.Wre.f8772r);
        materialButton.setTag(Xw);
        ViewCompat.eTf(materialButton, new fuX());
        View viewFindViewById = view.findViewById(Rxk.Wre.f8767Z);
        this.f58901g = viewFindViewById;
        viewFindViewById.setTag(f58893N);
        View viewFindViewById2 = view.findViewById(Rxk.Wre.f8771o);
        this.E2 = viewFindViewById2;
        viewFindViewById2.setTag(f58895v);
        this.f58900e = view.findViewById(Rxk.Wre.te);
        this.f58898X = view.findViewById(Rxk.Wre.WPU);
        Xw(o.DAY);
        materialButton.setText(this.J2.xMQ());
        this.f58897S.addOnScrollListener(new Dsr(aCVar, materialButton));
        materialButton.setOnClickListener(new aC());
        this.E2.setOnClickListener(new C(aCVar));
        this.f58901g.setOnClickListener(new j(aCVar));
    }

    private void jB() {
        ViewCompat.eTf(this.f58897S, new Wre());
    }

    private void rV9(int i2) {
        this.f58897S.post(new n(i2));
    }

    public static I28 v(DateSelector dateSelector, int i2, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        I28 i28 = new I28();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.mUb());
        i28.setArguments(bundle);
        return i28;
    }

    Month T() {
        return this.J2;
    }

    void U() {
        o oVar = this.f58903r;
        o oVar2 = o.YEAR;
        if (oVar == oVar2) {
            Xw(o.DAY);
        } else if (oVar == o.DAY) {
            Xw(oVar2);
        }
    }

    com.google.android.material.datepicker.n X() {
        return this.f58902o;
    }

    void Xw(o oVar) {
        this.f58903r = oVar;
        if (oVar == o.YEAR) {
            this.f58899Z.getLayoutManager().LPV(((eO) this.f58899Z.getAdapter()).qie(this.J2.f58926O));
            this.f58900e.setVisibility(0);
            this.f58898X.setVisibility(8);
            this.f58901g.setVisibility(8);
            this.E2.setVisibility(8);
            return;
        }
        if (oVar == o.DAY) {
            this.f58900e.setVisibility(8);
            this.f58898X.setVisibility(0);
            this.f58901g.setVisibility(0);
            this.E2.setVisibility(0);
            bzg(this.J2);
        }
    }

    void bzg(Month month) {
        com.google.android.material.datepicker.aC aCVar = (com.google.android.material.datepicker.aC) this.f58897S.getAdapter();
        int iHI = aCVar.HI(month);
        int iHI2 = iHI - aCVar.HI(this.J2);
        boolean z2 = Math.abs(iHI2) > 3;
        boolean z3 = iHI2 > 0;
        this.J2 = month;
        if (z2 && z3) {
            this.f58897S.scrollToPosition(iHI - 3);
            rV9(iHI);
        } else if (!z2) {
            rV9(iHI);
        } else {
            this.f58897S.scrollToPosition(iHI + 3);
            rV9(iHI);
        }
    }

    CalendarConstraints e() {
        return this.f58896O;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f58904t);
        this.f58902o = new com.google.android.material.datepicker.n(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthGh = this.f58896O.gh();
        if (com.google.android.material.datepicker.CN3.N(contextThemeWrapper)) {
            i2 = Rxk.fuX.aYN;
            i3 = 1;
        } else {
            i2 = Rxk.fuX.f8784S;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        viewInflate.setMinimumHeight(s7N(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(Rxk.Wre.aYN);
        ViewCompat.eTf(gridView, new w6());
        int iKN = this.f58896O.KN();
        gridView.setAdapter((ListAdapter) (iKN > 0 ? new com.google.android.material.datepicker.Ml(iKN) : new com.google.android.material.datepicker.Ml()));
        gridView.setNumColumns(monthGh.J2);
        gridView.setEnabled(false);
        this.f58897S = (RecyclerView) viewInflate.findViewById(Rxk.Wre.f8769g);
        this.f58897S.setLayoutManager(new Ml(getContext(), i3, false, i3));
        this.f58897S.setTag(f58894T);
        com.google.android.material.datepicker.aC aCVar = new com.google.android.material.datepicker.aC(contextThemeWrapper, null, this.f58896O, null, new C0785I28());
        this.f58897S.setAdapter(aCVar);
        int integer = contextThemeWrapper.getResources().getInteger(Rxk.CN3.f8730n);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Rxk.Wre.te);
        this.f58899Z = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f58899Z.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f58899Z.setAdapter(new eO(this));
            this.f58899Z.addItemDecoration(E2());
        }
        if (viewInflate.findViewById(Rxk.Wre.f8772r) != null) {
            fD(viewInflate, aCVar);
        }
        if (!com.google.android.material.datepicker.CN3.N(contextThemeWrapper)) {
            new PagerSnapHelper().rl(this.f58897S);
        }
        this.f58897S.scrollToPosition(aCVar.HI(this.J2));
        jB();
        return viewInflate;
    }

    LinearLayoutManager wTp() {
        return (LinearLayoutManager) this.f58897S.getLayoutManager();
    }

    static /* synthetic */ DateSelector g(I28 i28) {
        i28.getClass();
        return null;
    }

    static int nHg(Context context) {
        return context.getResources().getDimensionPixelSize(Rxk.Ml.eF);
    }

    private static int s7N(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(Rxk.Ml.f8751a) + resources.getDimensionPixelOffset(Rxk.Ml.f8740I) + resources.getDimensionPixelOffset(Rxk.Ml.f8736D);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(Rxk.Ml.f8742M);
        int i2 = com.google.android.material.datepicker.Dsr.f58889r;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(Rxk.Ml.eF) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(Rxk.Ml.f8741J)) + resources.getDimensionPixelOffset(Rxk.Ml.M7);
    }

    @Override // com.google.android.material.datepicker.o
    public boolean WPU(com.google.android.material.datepicker.C c2) {
        return super.WPU(c2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f58904t = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.j.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f58896O = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.j.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.J2 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f58904t);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f58896O);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.J2);
    }
}
