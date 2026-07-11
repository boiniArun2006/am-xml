package Du;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class afx extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final afx f2004t = new afx();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public double[] o() {
        return new double[0];
    }

    private afx() {
        super(WY.j.iF(DoubleCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, g9s builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(decoder.iF(getDescriptor(), i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public int J2(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void S(gi.Ml encoder, double[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.ck(getDescriptor(), i3, content[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public g9s qie(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new g9s(dArr);
    }
}
