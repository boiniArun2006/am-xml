package Du;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class M extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final M f1969t = new M();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public float[] o() {
        return new float[0];
    }

    private M() {
        super(WY.j.fD(FloatCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, iwV builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(decoder.Uo(getDescriptor(), i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public int J2(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void S(gi.Ml encoder, float[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.te(getDescriptor(), i3, content[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public iwV qie(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new iwV(fArr);
    }
}
