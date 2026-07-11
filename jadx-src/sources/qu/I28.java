package qu;

import android.content.Context;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import qE.s4;
import qu.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f72489n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: qu.I28$j$j, reason: collision with other inner class name */
        public static final class C1122j implements n {
            C1122j() {
            }

            @Override // qu.I28.n
            public boolean n() {
                return n.j.t(this);
            }

            @Override // qu.I28.n
            public long rl() {
                return n.j.n(this);
            }

            @Override // qu.I28.n
            public boolean t() {
                return n.j.rl(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final I28 O(Context context, rB.Ml ml, Dsr dsr, bH.CN3 cn3, n nVar) {
            s4 s4Var = new s4(dsr, qE.fuX.f72300n.nr(context, ml, dsr.getConfig().xMQ()), ml, cn3, nVar, null, null, 96, null);
            if (cn3 != null) {
                com.bendingspoons.oracle.secretmenu.n.rl(cn3, context, dsr, s4Var);
            }
            if (cn3 != null) {
                Wc.j.n(cn3, context, dsr, new xWk.n(s4Var, dsr), S3.w6.f8927n.t(context));
            }
            return s4Var;
        }

        public static /* synthetic */ I28 nr(j jVar, Context context, Dsr dsr, rB.Ml ml, bH.CN3 cn3, n nVar, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                nVar = new C1122j();
            }
            return jVar.t(context, dsr, ml, cn3, nVar);
        }

        public final I28 t(final Context context, final Dsr oracleService, final rB.Ml spiderSense, final bH.CN3 cn3, final n config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(oracleService, "oracleService");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(config, "config");
            return (I28) n(new Function0() { // from class: qu.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.O(context, spiderSense, oracleService, cn3, config);
                }
            });
        }

        private j() {
        }
    }

    public interface n {

        public static final class j {
            public static boolean rl(n nVar) {
                return true;
            }

            public static boolean t(n nVar) {
                return true;
            }

            public static long n(n nVar) {
                return Duration.INSTANCE.m1743getZEROUwyO8pc();
            }
        }

        boolean n();

        long rl();

        boolean t();
    }

    public static final class w6 {
        public static /* synthetic */ Object n(I28 i28, int i2, long j2, Integer num, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryRefresh-dWUq8MI");
            }
            if ((i3 & 4) != 0) {
                num = 0;
            }
            return i28.n(i2, j2, num, continuation);
        }
    }

    Object n(int i2, long j2, Integer num, Continuation continuation);

    TFv.Wre rl();
}
