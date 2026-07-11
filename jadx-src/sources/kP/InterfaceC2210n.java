package kP;

import android.content.Context;
import fb.AbstractC2109j;
import java.util.List;
import kP.InterfaceC2210n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import sP.Pl;
import sP.n;

/* JADX INFO: renamed from: kP.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface InterfaceC2210n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f69859n = j.rl;

    /* JADX INFO: renamed from: kP.n$j */
    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: kP.n$j$j, reason: collision with other inner class name */
        /* synthetic */ class C1020j extends FunctionReferenceImpl implements Function0 {
            C1020j(Object obj) {
                super(0, obj, C2211w6.class, "presentWebApp", "presentWebApp$injet_release()V", 0);
            }

            public final void n() {
                ((C2211w6) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: kP.n$j$n, reason: collision with other inner class name */
        /* synthetic */ class C1021n extends FunctionReferenceImpl implements Function1, SuspendFunction {
            C1021n(Object obj) {
                super(1, obj, n.InterfaceC1169n.class, "getAssetUrl", "getAssetUrl(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((n.InterfaceC1169n) this.receiver).rl(continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC2210n nr(Context context, InterfaceC1022n interfaceC1022n, rB.Ml ml, int i2, OkHttpClient okHttpClient, bH.CN3 cn3) {
            sP.j fux;
            sP.w6 w6Var = new sP.w6(context);
            KW9.Wre wreT = KW9.Wre.rl.t(context);
            sP.n nVarO = interfaceC1022n.O();
            if (nVarO instanceof n.InterfaceC1169n) {
                Pl pl = new Pl(i2, new C1021n(nVarO), w6Var, okHttpClient, new sP.fuX(context, ((n.InterfaceC1169n) nVarO).n().t(), w6Var), ml);
                w6Var = w6Var;
                fux = pl;
            } else {
                if (!(nVarO instanceof n.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                fux = new sP.fuX(context, ((n.j) nVarO).t(), w6Var);
            }
            KW9.j.f5464n.rl(interfaceC1022n.n());
            C2211w6 c2211w6 = new C2211w6(context, w6Var, interfaceC1022n.t(), fux, ml, interfaceC1022n.J2(), interfaceC1022n.rl(), interfaceC1022n.nr(), interfaceC1022n.Uo());
            if (cn3 != null) {
                KW9.fuX.n(cn3, wreT, new C1020j(c2211w6));
            }
            return c2211w6;
        }

        public final InterfaceC2210n t(final int i2, final InterfaceC1022n config, final Context context, final bH.CN3 cn3, final rB.Ml spiderSense, final OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return (InterfaceC2210n) n(new Function0() { // from class: kP.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InterfaceC2210n.j.nr(context, config, spiderSense, i2, okHttpClient, cn3);
                }
            });
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: kP.n$n, reason: collision with other inner class name */
    public interface InterfaceC1022n {

        /* JADX INFO: renamed from: kP.n$n$j */
        public static final class j {

            /* JADX INFO: renamed from: kP.n$n$j$j, reason: collision with other inner class name */
            static final class C1023j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final C1023j f69860n = new C1023j();

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Void invoke() {
                    return null;
                }

                C1023j() {
                }
            }

            public static Function0 n(InterfaceC1022n interfaceC1022n) {
                return C1023j.f69860n;
            }

            public static EnumC2205I28 rl(InterfaceC1022n interfaceC1022n) {
                return EnumC2205I28.f69847n;
            }
        }

        Function1 J2();

        sP.n O();

        Function0 Uo();

        boolean n();

        EnumC2205I28 nr();

        Function1 rl();

        List t();
    }

    /* JADX INFO: renamed from: kP.n$w6 */
    public static final class w6 {
        public static /* synthetic */ Object n(InterfaceC2210n interfaceC2210n, String str, EnumC2205I28 enumC2205I28, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evaluateTrigger");
            }
            if ((i2 & 2) != 0) {
                enumC2205I28 = null;
            }
            return interfaceC2210n.rl(str, enumC2205I28, continuation);
        }
    }

    Object n(Continuation continuation);

    Object rl(String str, EnumC2205I28 enumC2205I28, Continuation continuation);
}
