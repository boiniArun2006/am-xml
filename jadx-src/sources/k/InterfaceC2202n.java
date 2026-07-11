package k;

import TFv.Z;
import fb.AbstractC2109j;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: k.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface InterfaceC2202n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f69649n = j.rl;

    /* JADX INFO: renamed from: k.n$Ml */
    public interface Ml {
        long O();

        int n();

        long nr();

        boolean rl();

        long t();
    }

    /* JADX INFO: renamed from: k.n$n, reason: collision with other inner class name */
    public interface InterfaceC1003n {

        /* JADX INFO: renamed from: k.n$n$j */
        public static final class j {

            /* JADX INFO: renamed from: k.n$n$j$j, reason: collision with other inner class name */
            public static final class C1004j implements Ml {
                @Override // k.InterfaceC2202n.Ml
                public int n() {
                    return 3;
                }

                @Override // k.InterfaceC2202n.Ml
                public boolean rl() {
                    return true;
                }

                @Override // k.InterfaceC2202n.Ml
                public long nr() {
                    return 100L;
                }

                @Override // k.InterfaceC2202n.Ml
                public long t() {
                    return 10000L;
                }

                C1004j() {
                }

                @Override // k.InterfaceC2202n.Ml
                public long O() {
                    return 60000L;
                }
            }

            public static Ml n(InterfaceC1003n interfaceC1003n) {
                return new C1004j();
            }
        }

        boolean isEnabled();

        Ml n();

        boolean rl();
    }

    InterfaceC1003n getConfig();

    Object n(Set set, Continuation continuation);

    Z nr();

    Object rl(InterfaceC2201j[] interfaceC2201jArr, Continuation continuation);

    Object t(boolean z2, boolean z3, Continuation continuation);

    /* JADX INFO: renamed from: k.n$j */
    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: k.n$w6 */
    public static final class w6 {
        public static Object n(InterfaceC2202n interfaceC2202n, InterfaceC2201j[] interfaceC2201jArr, Continuation continuation) {
            Object objN = interfaceC2202n.n(ArraysKt.toSet(interfaceC2201jArr), continuation);
            if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objN;
            }
            return Unit.INSTANCE;
        }
    }
}
