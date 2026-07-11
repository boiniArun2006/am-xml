package Du;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class h6y extends Q {
    private final EJn.Wre rl;

    protected abstract void S(gi.Ml ml, Object obj, int i2);

    protected abstract Object o();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6y(XA.Ml primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.rl = new U4(primitiveSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public final int t(oXP oxp) {
        Intrinsics.checkNotNullParameter(oxp, "<this>");
        return oxp.nr();
    }

    @Override // Du.j
    protected final Iterator O(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public final Object az(oXP oxp) {
        Intrinsics.checkNotNullParameter(oxp, "<this>");
        return oxp.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void HI(oXP oxp, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(oxp, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // Du.j, XA.w6
    public final Object deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Uo(decoder, null);
    }

    @Override // Du.Q, XA.Ml, XA.eO, XA.w6
    public final EJn.Wre getDescriptor() {
        return this.rl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void nr(oXP oxp, int i2) {
        Intrinsics.checkNotNullParameter(oxp, "<this>");
        oxp.rl(i2);
    }

    @Override // Du.Q, XA.eO
    public final void serialize(gi.Wre encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iJ2 = J2(obj);
        EJn.Wre wre = this.rl;
        gi.Ml mlMUb = encoder.mUb(wre, iJ2);
        S(mlMUb, obj, iJ2);
        mlMUb.t(wre);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public final oXP rl() {
        return (oXP) qie(o());
    }
}
