package HI0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rH.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class o7q {

    public static final class j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f3872n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f3873t;

        j(View view, Function0 function0) {
            this.f3872n = view;
            this.f3873t = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f3872n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f3873t.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qie(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void HI(View view, Context context, String msg, Integer num, float f3, int i2) {
        rH.Ml mlN;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (num == null) {
            Ml.j jVar = new Ml.j(context);
            jVar.nr(10);
            jVar.Z(i2);
            jVar.xMQ(Integer.MIN_VALUE);
            jVar.qie(8);
            jVar.t(f3);
            jVar.Uo(5.0f);
            jVar.o(true);
            jVar.O(2131099746);
            jVar.J2(rH.Wre.FADE);
            jVar.gh(jVar.f72939z);
            mlN = jVar.n();
        } else {
            Ml.j jVar2 = new Ml.j(context);
            jVar2.mUb(num.intValue());
            jVar2.nr(10);
            jVar2.Z(i2);
            jVar2.xMQ(Integer.MIN_VALUE);
            jVar2.qie(8);
            jVar2.t(f3);
            jVar2.Uo(5.0f);
            jVar2.Ik(msg);
            jVar2.r(2131099755);
            jVar2.o(true);
            jVar2.O(2131099746);
            jVar2.J2(rH.Wre.FADE);
            jVar2.gh(jVar2.f72939z);
            mlN = jVar2.n();
        }
        rH.Ml.ofS(mlN, view, 0, 0, 6, null);
    }

    public static final Pair J2(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Pair(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public static final boolean KN(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return afx.mUb(context).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    public static final void O(View view, Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        action.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    O(childAt, action);
                }
            }
        }
    }

    public static final View Uo(View view) {
        View view2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        do {
            Object parent = view.getParent();
            view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view = view2;
            }
        } while (view2 != null);
        return view;
    }

    public static final void az(View view, float f3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setElevation(afx.rl(context, f3));
    }

    public static final boolean ck(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return afx.mUb(context).showSoftInput(view, 1);
    }

    public static final void gh(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: HI0.Mf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return o7q.qie(view2, motionEvent);
            }
        });
    }

    public static final void mUb(View view, Function0 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new j(view, action));
    }

    public static final void nr(RecyclerView.LayoutManager layoutManager, Function1 action) {
        Intrinsics.checkNotNullParameter(layoutManager, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM = layoutManager.M();
        for (int i2 = 0; i2 < iM; i2++) {
            View viewE = layoutManager.E(i2);
            if (viewE != null) {
                O(viewE, action);
            }
        }
    }

    public static final boolean rl(View view, Function1 predicate) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (((Boolean) predicate.invoke(view)).booleanValue()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null && rl(childAt, predicate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void t(View view, Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    action.invoke(childAt);
                }
            }
        }
    }

    public static final void ty(View view, Context context, String msg) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Ml.j jVar = new Ml.j(context);
        jVar.nr(10);
        jVar.Z(285);
        jVar.xMQ(Integer.MIN_VALUE);
        jVar.qie(8);
        jVar.t(0.5f);
        jVar.Uo(5.0f);
        jVar.Ik(msg);
        jVar.r(2131099755);
        jVar.o(true);
        jVar.O(2131099746);
        jVar.J2(rH.Wre.FADE);
        jVar.gh(jVar.f72939z);
        rH.Ml.xg(jVar.n(), view, 0, 0, 6, null);
    }

    public static final View xMQ(ViewGroup viewGroup, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, z2);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
