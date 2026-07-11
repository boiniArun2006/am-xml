package Du;

import EJn.I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Du.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1339o implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1339o f2035n = new C1339o();
    private static final EJn.Wre rl = new lS("kotlin.Byte", I28.n.f2276n);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.N());
    }

    @Override // XA.eO
    public /* bridge */ /* synthetic */ void serialize(gi.Wre wre, Object obj) {
        t(wre, ((Number) obj).byteValue());
    }

    public void t(gi.Wre encoder, byte b2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.KN(b2);
    }

    private C1339o() {
    }
}
