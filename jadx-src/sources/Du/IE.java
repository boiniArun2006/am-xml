package Du;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class IE implements XA.Ml {
    public static final IE rl = new IE();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ qYU f1961n = new qYU("kotlin.Unit", Unit.INSTANCE);

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.f1961n.getDescriptor();
    }

    public void rl(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f1961n.deserialize(decoder);
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f1961n.serialize(encoder, value);
    }

    private IE() {
    }

    @Override // XA.w6
    public /* bridge */ /* synthetic */ Object deserialize(gi.I28 i28) {
        rl(i28);
        return Unit.INSTANCE;
    }
}
