package qu;

import Dk.InterfaceC1335n;
import android.content.Context;
import fb.AbstractC2109j;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import qE.Q;
import qE.QJ;
import qE.SPz;
import qE.ci;
import qE.eO;
import qE.u;
import qu.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f72485n = j.rl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Ml {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Ml[] f72486O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f72487n = new Ml("DEVELOPMENT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Ml f72488t = new Ml("PRODUCTION", 1);

        static {
            Ml[] mlArrN = n();
            f72486O = mlArrN;
            J2 = EnumEntriesKt.enumEntries(mlArrN);
        }

        private static final /* synthetic */ Ml[] n() {
            return new Ml[]{f72487n, f72488t};
        }

        public static Ml valueOf(String str) {
            return (Ml) Enum.valueOf(Ml.class, str);
        }

        public static Ml[] values() {
            return (Ml[]) f72486O.clone();
        }

        private Ml(String str, int i2) {
        }
    }

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(kotlinx.serialization.json.I28 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.J2(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Dsr O(n nVar, OkHttpClient okHttpClient, Context context, rB.Ml ml, InterfaceC1335n interfaceC1335n, Fyf.w6 w6Var) {
            v8.Ml ml2 = new v8.Ml(nVar.n(), "Oracle");
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient okHttpClientBuild = builderNewBuilder.addInterceptor(httpLoggingInterceptor).build();
            qE.fuX fuxNr = qE.fuX.f72300n.nr(context, ml, nVar.xMQ());
            oh.I28 i28T = nVar.Uo() ? oh.I28.f71526n.t(context, ml) : oh.I28.f71526n.O();
            Q qJ2 = SPz.J2(context, nVar, interfaceC1335n, w6Var, fuxNr, i28T, new qE.n(context), (128 & 128) != 0 ? WYs.j.f11519n.n() : null);
            kotlinx.serialization.json.n nVarRl = kotlinx.serialization.json.Q.rl(null, new Function1() { // from class: qu.fuX
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Dsr.j.J2((kotlinx.serialization.json.I28) obj);
                }
            }, 1, null);
            return new ci(nVar, new qu.w6(nVar, qu.j.f72495O.n(context)), qJ2, okHttpClientBuild, ml, new QJ(fuxNr, i28T, new eO(new u(okHttpClientBuild), ml2, ml, nVar.xMQ(), nVarRl), new qE.I28(ml, nVar.xMQ(), nVarRl), ml2), ml2);
        }

        public final Dsr nr(final n config, final Context context, final Fyf.w6 installManager, final InterfaceC1335n concierge, final rB.Ml spiderSense, final OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(installManager, "installManager");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return (Dsr) n(new Function0() { // from class: qu.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Dsr.j.O(config, okHttpClient, context, spiderSense, concierge, installManager);
                }
            });
        }

        private j() {
        }
    }

    public interface n {

        public static final class j {
            public static Object n(n nVar, Continuation continuation) {
                return null;
            }

            public static boolean nr(n nVar) {
                return false;
            }

            /* JADX INFO: renamed from: qu.Dsr$n$j$j, reason: collision with other inner class name */
            public static final class C1120j implements InterfaceC1121n {
                C1120j() {
                }

                @Override // qu.Dsr.n.InterfaceC1121n
                public Map J2() {
                    return InterfaceC1121n.j.n(this);
                }

                @Override // qu.Dsr.n.InterfaceC1121n
                public boolean O() {
                    return InterfaceC1121n.j.O(this);
                }

                @Override // qu.Dsr.n.InterfaceC1121n
                public boolean n() {
                    return InterfaceC1121n.j.rl(this);
                }

                @Override // qu.Dsr.n.InterfaceC1121n
                public boolean nr() {
                    return InterfaceC1121n.j.J2(this);
                }

                @Override // qu.Dsr.n.InterfaceC1121n
                public boolean rl() {
                    return InterfaceC1121n.j.t(this);
                }

                @Override // qu.Dsr.n.InterfaceC1121n
                public boolean t() {
                    return InterfaceC1121n.j.nr(this);
                }
            }

            public static InterfaceC1121n t(n nVar) {
                return new C1120j();
            }

            public static Object rl(n nVar, Continuation continuation) {
                return MapsKt.emptyMap();
            }
        }

        /* JADX INFO: renamed from: qu.Dsr$n$n, reason: collision with other inner class name */
        public interface InterfaceC1121n {
            Map J2();

            boolean O();

            boolean n();

            boolean nr();

            boolean rl();

            boolean t();

            /* JADX INFO: renamed from: qu.Dsr$n$n$j */
            public static final class j {
                public static boolean J2(InterfaceC1121n interfaceC1121n) {
                    return true;
                }

                public static boolean O(InterfaceC1121n interfaceC1121n) {
                    return true;
                }

                public static boolean nr(InterfaceC1121n interfaceC1121n) {
                    return true;
                }

                public static boolean rl(InterfaceC1121n interfaceC1121n) {
                    return true;
                }

                public static boolean t(InterfaceC1121n interfaceC1121n) {
                    return true;
                }

                public static Map n(InterfaceC1121n interfaceC1121n) {
                    return MapsKt.emptyMap();
                }
            }
        }

        Object J2(Continuation continuation);

        InterfaceC1121n KN();

        String O();

        boolean Uo();

        Object mUb(Continuation continuation);

        boolean n();

        Ml nr();

        String rl();

        String t();

        boolean xMQ();
    }

    public static final class w6 {
        public static /* synthetic */ Object n(Dsr dsr, KPz.j jVar, et.n nVar, et.n nVar2, et.n nVar3, Integer num, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeCall");
            }
            if ((i2 & 16) != 0) {
                num = null;
            }
            return dsr.n(jVar, nVar, nVar2, nVar3, num, continuation);
        }
    }

    n getConfig();

    Object n(KPz.j jVar, et.n nVar, et.n nVar2, et.n nVar3, Integer num, Continuation continuation);
}
