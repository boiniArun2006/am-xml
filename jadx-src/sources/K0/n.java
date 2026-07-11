package K0;

import K0.n;
import android.content.Context;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f4828n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        public final n t(final Context context, final qu.I28 oracleResponseStore, final qu.Dsr oracleService, final rB.Ml spiderSense, final bH.CN3 cn3, final Function2 trackEvent, final fuX fux, final nKt.n nVar, final boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(oracleService, "oracleService");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            return (n) n(new Function0(context, oracleResponseStore, oracleService, spiderSense, cn3, trackEvent, fux, nVar, z2) { // from class: K0.j
                public final /* synthetic */ rB.Ml J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public final /* synthetic */ qu.Dsr f4821O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                public final /* synthetic */ boolean f4822S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                public final /* synthetic */ nKt.n f4823Z;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ Context f4824n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Function2 f4825o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ bH.CN3 f4826r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ qu.I28 f4827t;

                {
                    this.f4823Z = nVar;
                    this.f4822S = z2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.O(this.f4824n, this.f4827t, this.f4821O, this.J2, this.f4826r, this.f4825o, null, this.f4823Z, this.f4822S);
                }
            });
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n O(Context context, qu.I28 i28, qu.Dsr dsr, rB.Ml ml, bH.CN3 cn3, Function2 function2, fuX fux, nKt.n nVar, boolean z2) {
            return Ml.nr(context, i28, dsr, ml, cn3, function2, fux, nVar, z2);
        }
    }

    boolean J2();

    Object O(Continuation continuation);

    Pr.w6 Uo();

    Object n(Continuation continuation);

    Object nr(Continuation continuation);

    Object rl(Continuation continuation);

    Object t(Continuation continuation);
}
