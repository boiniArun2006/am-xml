package Du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class pq implements XA.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XA.Ml f2042n;
    private final EJn.Wre rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && pq.class == obj.getClass() && Intrinsics.areEqual(this.f2042n, ((pq) obj).f2042n);
    }

    public pq(XA.Ml serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f2042n = serializer;
        this.rl = new mrQ(serializer.getDescriptor());
    }

    @Override // XA.w6
    public Object deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.E2() ? decoder.qie(this.f2042n) : decoder.gh();
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.rl;
    }

    public int hashCode() {
        return this.f2042n.hashCode();
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.Ik();
        } else {
            encoder.g();
            encoder.ViF(this.f2042n, obj);
        }
    }
}
