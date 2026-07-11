package rB;

import GjB.n;
import android.content.Context;
import cA.fuX;
import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import com.safedk.android.analytics.brandsafety.b;
import fb.AbstractC2109j;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import okhttp3.OkHttpClient;
import rB.Ml;
import sJa.Wre;
import yZ.C2442j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f72876n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: rB.Ml$j$j, reason: collision with other inner class name */
        /* synthetic */ class C1154j extends FunctionReferenceImpl implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C1154j f72877n = new C1154j();

            C1154j() {
                super(1, tDS.w6.class, "<init>", "<init>(Ljava/util/List;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final tDS.w6 invoke(List p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new tDS.w6(p0);
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {
            n(Object obj) {
                super(2, obj, CompleteDebugEvent.Companion.class, "convert", "convert(Lcom/bendingspoons/spidersense/logger/DebugEvent;Lcom/bendingspoons/spidersense/domain/entities/DebugEventMetadata;)Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final CompleteDebugEvent invoke(ajd.j p0, com.bendingspoons.spidersense.domain.entities.j p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                return ((CompleteDebugEvent.Companion) this.receiver).n(p0, p1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ml J2(n nVar, Context context, OkHttpClient okHttpClient) {
            v8.Ml ml = new v8.Ml(nVar.n(), "SpiderSense");
            Function0 function0 = new Function0() { // from class: rB.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Double.valueOf(Ml.j.Uo());
                }
            };
            cA.Ml mlNr = cA.Ml.f43547n.nr(context);
            lA5.j jVarN = lA5.j.f70388n.n(nVar.t(), nVar.nr(), okHttpClient);
            hrZ.j jVarN2 = hrZ.j.f67998n.n(context, function0);
            guf.j jVar = new guf.j(new Function0() { // from class: rB.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.j.KN();
                }
            }, function0, new n(CompleteDebugEvent.INSTANCE), mlNr, ml);
            Wre.j jVar2 = sJa.Wre.f73205n;
            sJa.w6 w6Var = sJa.w6.rl;
            r72.j jVar3 = new r72.j(function0, jVar2.n(w6Var), jVarN, 0, 0L, 0.0d, 0L, ml, b.f61769v, null);
            AE.I28 i28Nr = AE.I28.f34n.nr(context);
            return new fuX(function0, ml, jVarN2, new C2442j(i28Nr, mlNr, jVarN, Kre.I28.f5866n.nr(context), nVar.rl(), nVar.O(), 0L, 0L, 0, 448, null), jVar, jVar3, C1154j.f72877n, sJa.n.f73207n.n(w6Var), w6Var, i28Nr);
        }

        public final Ml O(final n config, final Context context, final OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return (Ml) n(new Function0() { // from class: rB.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.j.J2(config, context, okHttpClient);
                }
            });
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String KN() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double Uo() {
            return q3M.j.n();
        }
    }

    public interface n {

        public static final class j {
            public static long n(n nVar) {
                return Duration.INSTANCE.m1743getZEROUwyO8pc();
            }

            public static GjB.n rl(n nVar) {
                return n.j.f3734n;
            }
        }

        long O();

        boolean n();

        GjB.n nr();

        Function1 rl();

        String t();
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72878n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f72878n, w6Var.f72878n) && this.rl == w6Var.rl;
        }

        public w6(String name, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f72878n = name;
            this.rl = i2;
        }

        public int hashCode() {
            return (this.f72878n.hashCode() * 31) + Integer.hashCode(this.rl);
        }

        public final String n() {
            return this.f72878n;
        }

        public final int rl() {
            return this.rl;
        }

        public String toString() {
            return "Experiment(name=" + this.f72878n + ", segment=" + this.rl + ")";
        }
    }

    void J2(boolean z2);

    void KN(List list);

    K6D.Ml O();

    boolean Uo();

    boolean mUb();

    void n(Function1 function1);

    List nr();

    Object rl(Context context, Continuation continuation);

    void t(ajd.j jVar);

    void xMQ(boolean z2);
}
