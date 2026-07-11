package Du;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f1946t = new C();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public byte[] o() {
        return new byte[0];
    }

    private C() {
        super(WY.j.g(ByteCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, aC builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(decoder.T(getDescriptor(), i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public int J2(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void S(gi.Ml encoder, byte[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.e(getDescriptor(), i3, content[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public aC qie(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new aC(bArr);
    }
}
