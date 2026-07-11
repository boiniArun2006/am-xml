package Du;

import aT.dE.JLZo;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class t6 extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t6 f2051t = new t6();

    protected short[] aYN() {
        return UShortArray.m646constructorimpl(0);
    }

    private t6() {
        super(WY.j.aYN(UShort.INSTANCE));
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ int J2(Object obj) {
        return WPU(((UShortArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ void S(gi.Ml ml, Object obj, int i2) {
        g(ml, ((UShortArray) obj).getStorage(), i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, W builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(UShort.m594constructorimpl(decoder.ck(getDescriptor(), i2).r()));
    }

    protected int WPU(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m653getSizeimpl(collectionSize);
    }

    protected void g(gi.Ml encoder, short[] sArr, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(sArr, JLZo.nxZGwNtdDJ);
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.Z(getDescriptor(), i3).o(UShortArray.m652getMh2AYeg(sArr, i3));
        }
    }

    protected W nY(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new W(toBuilder, null);
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ Object qie(Object obj) {
        return nY(((UShortArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ Object o() {
        return UShortArray.m645boximpl(aYN());
    }
}
