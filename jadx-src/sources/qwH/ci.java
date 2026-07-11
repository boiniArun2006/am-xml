package qwH;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.datetime.DateTimeFormatException;
import qwH.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f72571n = LazyKt.lazy(j.f72573n);
    private static final Lazy rl = LazyKt.lazy(n.f72575n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final UGc f72572t = new UGc(null, null, null, null, null, 31, null);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f72573n = new j();

        /* JADX INFO: renamed from: qwH.ci$j$j, reason: collision with other inner class name */
        static final class C1133j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C1133j f72574n = new C1133j();

            C1133j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Xo.j) obj);
                return Unit.INSTANCE;
            }

            public final void n(Xo.j build) {
                Intrinsics.checkNotNullParameter(build, "$this$build");
                Xo.j.C1124j.t(build, null, 1, null);
                eO.rl(build, '-');
                Xo.j.C1124j.rl(build, null, 1, null);
                eO.rl(build, '-');
                Xo.j.C1124j.n(build, null, 1, null);
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Pl invoke() {
            return SPz.rl.n(C1133j.f72574n);
        }
    }

    static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f72575n = new n();

        static final class j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f72576n = new j();

            j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Xo.j) obj);
                return Unit.INSTANCE;
            }

            public final void n(Xo.j build) {
                Intrinsics.checkNotNullParameter(build, "$this$build");
                Xo.j.C1124j.t(build, null, 1, null);
                Xo.j.C1124j.rl(build, null, 1, null);
                Xo.j.C1124j.n(build, null, 1, null);
            }
        }

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Pl invoke() {
            return SPz.rl.n(j.f72576n);
        }
    }

    public static final Object nr(Object obj, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            return obj;
        }
        throw new DateTimeFormatException("Can not create a " + name + " from the given input: the field " + name + " is missing");
    }

    public static final Pl rl() {
        return (Pl) f72571n.getValue();
    }

    public static final Pl t() {
        return (Pl) rl.getValue();
    }
}
