package LQ;

import LQ.CN3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6078n;

    public static final class j extends Throwable {
        private static final boolean J2 = false;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final C0207j f6079O = new C0207j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f6080n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final fuX f6081t;

        /* JADX INFO: renamed from: LQ.fuX$j$j, reason: collision with other inner class name */
        private static final class C0207j {
            public /* synthetic */ C0207j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0207j() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, fuX owner) {
            super("Either control throwable. You should never see this message. If you do, it means that you caught this throwable and you shouldn't, or that this throwable leaked on an escaping lambda, which you should fix. Read the documentation of the either function for more info.", null, false, J2);
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f6080n = obj;
            this.f6081t = owner;
        }

        public final Object n() {
            return this.f6080n;
        }

        public final fuX rl() {
            return this.f6081t;
        }
    }

    @Override // LQ.CN3
    public Void n(Object obj) throws j {
        if (this.f6078n) {
            throw new IllegalStateException("The either scope can fail only once. A failure was already reported.");
        }
        this.f6078n = true;
        throw new j(obj, this);
    }

    @Override // LQ.CN3
    public TFv.Wre J2(n nVar) {
        return CN3.j.n(this, nVar);
    }

    @Override // LQ.CN3
    public Object O(LQ.j jVar) {
        return CN3.j.rl(this, jVar);
    }
}
