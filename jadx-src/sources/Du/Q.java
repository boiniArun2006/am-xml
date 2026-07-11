package Du;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Q extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XA.Ml f1981n;

    public /* synthetic */ Q(XA.Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
        this(ml);
    }

    protected abstract void HI(Object obj, int i2, Object obj2);

    @Override // XA.Ml, XA.eO, XA.w6
    public abstract EJn.Wre getDescriptor();

    private Q(XA.Ml ml) {
        super(null);
        this.f1981n = ml;
    }

    @Override // Du.j
    protected final void KN(gi.w6 decoder, Object obj, int i2, int i3) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i3 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            xMQ(decoder, i2 + i5, obj, false);
        }
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iJ2 = J2(obj);
        EJn.Wre descriptor = getDescriptor();
        gi.Ml mlMUb = encoder.mUb(descriptor, iJ2);
        Iterator itO = O(obj);
        for (int i2 = 0; i2 < iJ2; i2++) {
            mlMUb.S(getDescriptor(), i2, this.f1981n, itO.next());
        }
        mlMUb.t(descriptor);
    }

    @Override // Du.j
    protected void xMQ(gi.w6 decoder, int i2, Object obj, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        HI(obj, i2, gi.w6.O(decoder, getDescriptor(), i2, this.f1981n, null, 8, null));
    }
}
