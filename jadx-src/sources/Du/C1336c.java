package Du;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: renamed from: Du.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C1336c implements Pp {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f2005n;
    private final UGc rl;

    /* JADX INFO: renamed from: Du.c$j */
    public static final class j implements Function0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ KClass f2007t;

        public j(KClass kClass) {
            this.f2007t = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new qz((XA.Ml) C1336c.this.rl().invoke(this.f2007t));
        }
    }

    public C1336c(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f2005n = compute;
        this.rl = new UGc();
    }

    @Override // Du.Pp
    public XA.Ml n(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.rl.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        M5 m5 = (M5) obj;
        Object objN = m5.f1970n.get();
        if (objN == null) {
            objN = m5.n(new j(key));
        }
        return ((qz) objN).f2047n;
    }

    public final Function1 rl() {
        return this.f2005n;
    }
}
