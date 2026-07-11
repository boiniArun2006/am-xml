package HI0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO implements Function0 {
    final /* synthetic */ Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AsyncTaskC1374z f3853O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function0 f3854n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ KClass f3855t;

    public static final class j implements Function0 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Throwable f3856O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AsyncTaskC1374z f3857n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f3858t;

        /* JADX INFO: renamed from: HI0.eO$j$j, reason: collision with other inner class name */
        public static final class C0132j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0132j f3859n = new C0132j();

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "In AsyncHandledThrowable";
            }
        }

        public j(AsyncTaskC1374z asyncTaskC1374z, Function1 function1, Throwable th) {
            this.f3857n = asyncTaskC1374z;
            this.f3858t = function1;
            this.f3856O = th;
        }

        public final void n() {
            XoT.C.Uo(this.f3857n, C0132j.f3859n);
            Function1 function1 = this.f3858t;
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Throwable, kotlin.Unit>");
            ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(this.f3856O);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public eO(Function0 function0, KClass kClass, AsyncTaskC1374z asyncTaskC1374z, Function1 function1) {
        this.f3854n = function0;
        this.f3855t = kClass;
        this.f3853O = asyncTaskC1374z;
        this.J2 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Dsr {
        try {
            return this.f3854n.invoke();
        } catch (Throwable th) {
            if (!this.f3855t.isInstance(th)) {
                XoT.C.ty(this.f3853O, "Unhandled exception", th);
                throw th;
            }
            XoT.C.ty(this.f3853O, "Delivering Exception", th);
            Dsr dsr = new Dsr(new j(this.f3853O, this.J2, th));
            XoT.C.ty(this.f3853O, "Prepared Exception", dsr);
            throw dsr;
        }
    }
}
