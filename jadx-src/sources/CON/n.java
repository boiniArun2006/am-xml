package CON;

import Ba.n;
import Du.AbstractC1338n;
import XA.eO;
import XA.qz;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n extends AbstractC1338n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f931n = new n();
    private static final Lazy rl = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) j.f932n);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f932n = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final qz invoke() {
            return new qz("kotlinx.datetime.DateTimeUnit", Reflection.getOrCreateKotlinClass(Ba.n.class), new KClass[]{Reflection.getOrCreateKotlinClass(n.w6.class), Reflection.getOrCreateKotlinClass(n.Ml.class), Reflection.getOrCreateKotlinClass(n.I28.class)}, new XA.Ml[]{Ml.f921n, fuX.f926n, Dsr.f917n});
        }
    }

    @Override // Du.AbstractC1338n
    public KClass J2() {
        return Reflection.getOrCreateKotlinClass(Ba.n.class);
    }

    private final qz KN() {
        return (qz) rl.getValue();
    }

    @Override // Du.AbstractC1338n
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public eO O(gi.Wre encoder, Ba.n value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return KN().O(encoder, value);
    }

    @Override // Du.AbstractC1338n
    public XA.w6 nr(gi.w6 decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return KN().nr(decoder, str);
    }

    private n() {
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return KN().getDescriptor();
    }
}
