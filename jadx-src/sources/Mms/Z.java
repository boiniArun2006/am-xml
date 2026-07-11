package Mms;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Du.nKK f6718n;
    private boolean rl;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {
        j(Object obj) {
            super(2, obj, Z.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n((EJn.Wre) obj, ((Number) obj2).intValue());
        }

        public final Boolean n(EJn.Wre p0, int i2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((Z) this.receiver).O(p0, i2));
        }
    }

    public Z(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f6718n = new Du.nKK(descriptor, new j(this));
    }

    public final int nr() {
        return this.f6718n.nr();
    }

    public final boolean rl() {
        return this.rl;
    }

    public final void t(int i2) {
        this.f6718n.n(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(EJn.Wre wre, int i2) {
        boolean z2;
        if (!wre.xMQ(i2) && wre.Uo(i2).rl()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.rl = z2;
        return z2;
    }
}
