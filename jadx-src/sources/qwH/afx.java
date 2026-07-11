package qwH;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qwH.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f72564n = LazyKt.lazy(j.f72565n);
    private static final Q rl = new Q(null, null, null, null, null, null, 63, null);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f72565n = new j();

        /* JADX INFO: renamed from: qwH.afx$j$j, reason: collision with other inner class name */
        static final class C1130j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C1130j f72566n = new C1130j();

            /* JADX INFO: renamed from: qwH.afx$j$j$j, reason: collision with other inner class name */
            static final class C1131j extends Lambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final C1131j f72567n = new C1131j();

                C1131j() {
                    super(1);
                }

                public final void n(Xo.w6 alternativeParsing) {
                    Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((Xo.w6) obj);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: qwH.afx$j$j$n */
            static final class n extends Lambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final n f72568n = new n();

                /* JADX INFO: renamed from: qwH.afx$j$j$n$j, reason: collision with other inner class name */
                static final class C1132j extends Lambda implements Function1 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public static final C1132j f72569n = new C1132j();

                    C1132j() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        n((Xo.w6) obj);
                        return Unit.INSTANCE;
                    }

                    public final void n(Xo.w6 optional) {
                        Intrinsics.checkNotNullParameter(optional, "$this$optional");
                        eO.rl(optional, '.');
                        optional.Z(1, 9);
                    }
                }

                n() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((Xo.w6) obj);
                    return Unit.INSTANCE;
                }

                public final void n(Xo.w6 alternativeParsing) {
                    Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                    eO.rl(alternativeParsing, ':');
                    Xo.w6.j.t(alternativeParsing, null, 1, null);
                    eO.nr(alternativeParsing, null, C1132j.f72569n, 1, null);
                }
            }

            C1130j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Xo.w6) obj);
                return Unit.INSTANCE;
            }

            public final void n(Xo.w6 build) {
                Intrinsics.checkNotNullParameter(build, "$this$build");
                Xo.w6.j.n(build, null, 1, null);
                eO.rl(build, ':');
                Xo.w6.j.rl(build, null, 1, null);
                eO.n(build, new Function1[]{C1131j.f72567n}, n.f72568n);
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final g9s invoke() {
            return g9s.rl.n(C1130j.f72566n);
        }
    }

    public static final g9s rl() {
        return (g9s) f72564n.getValue();
    }
}
