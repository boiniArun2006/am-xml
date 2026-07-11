package aui;

import ScC.n;
import ScC.w6;
import android.content.Context;
import k.C2203w6;
import k.InterfaceC2202n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class fuX {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ScC.w6 HI(Context context, InterfaceC2202n interfaceC2202n, rB.Ml ml, final Function2 function2, final Function2 function22) {
        return new NQ.fuX(context, interfaceC2202n, new Function1() { // from class: aui.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.ck(function2, (k.Ml) obj);
            }
        }, new Function1() { // from class: aui.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.Ik(function22, (C2203w6) obj);
            }
        }, ml != null ? d3.j.nr(ml, "adorable") : null, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Function2 function2, C2203w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(it.n(), it.rl());
        return Unit.INSTANCE;
    }

    public static final ScC.n KN(n.j jVar, final Context context, final InterfaceC2202n adOrable, final Function2 trackEvent, final Function2 trackAdRevenueEvent, final rB.Ml ml) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adOrable, "adOrable");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(trackAdRevenueEvent, "trackAdRevenueEvent");
        return (ScC.n) jVar.n(new Function0() { // from class: aui.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.qie(context, adOrable, ml, trackEvent, trackAdRevenueEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(Function2 function2, k.Ml it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(it.n(), it.rl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Function2 function2, k.Ml it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(it.n(), it.rl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2202n gh(InterfaceC2202n.InterfaceC1003n interfaceC1003n, Context context, K0.n nVar, rB.Ml ml, bH.CN3 cn3) {
        Ak.w6 w6Var = new Ak.w6(interfaceC1003n, context, nVar, ml != null ? d3.j.nr(ml, "adorable") : null, null, null, null, 112, null);
        ee.I28.n(cn3, context);
        return w6Var;
    }

    public static final InterfaceC2202n mUb(InterfaceC2202n.j jVar, final InterfaceC2202n.InterfaceC1003n config, final Context context, final K0.n legal, final bH.CN3 secretMenu, final rB.Ml ml) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
        return (InterfaceC2202n) jVar.n(new Function0() { // from class: aui.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.gh(config, context, legal, ml, secretMenu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScC.n qie(Context context, InterfaceC2202n interfaceC2202n, rB.Ml ml, final Function2 function2, final Function2 function22) {
        return new NQ.Ml(context, interfaceC2202n, new Function1() { // from class: aui.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.az(function2, (k.Ml) obj);
            }
        }, new Function1() { // from class: aui.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.ty(function22, (C2203w6) obj);
            }
        }, ml != null ? d3.j.nr(ml, "adorable") : null, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(Function2 function2, C2203w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(it.n(), it.rl());
        return Unit.INSTANCE;
    }

    public static final ScC.w6 xMQ(w6.j jVar, final Context context, final InterfaceC2202n adOrable, final Function2 trackEvent, final Function2 trackAdRevenueEvent, final rB.Ml ml) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adOrable, "adOrable");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(trackAdRevenueEvent, "trackAdRevenueEvent");
        return (ScC.w6) jVar.n(new Function0() { // from class: aui.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.HI(context, adOrable, ml, trackEvent, trackAdRevenueEvent);
            }
        });
    }
}
