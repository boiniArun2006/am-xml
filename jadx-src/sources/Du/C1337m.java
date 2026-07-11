package Du;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Du.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1337m extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1337m f2025t = new C1337m();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public int[] o() {
        return new int[0];
    }

    private C1337m() {
        super(WY.j.E2(IntCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, P builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(decoder.XQ(getDescriptor(), i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public int J2(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void S(gi.Ml encoder, int[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.fD(getDescriptor(), i3, content[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public P qie(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new P(iArr);
    }
}
