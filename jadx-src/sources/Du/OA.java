package Du;

import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class OA extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final OA f1977t = new OA();

    protected byte[] aYN() {
        return UByteArray.m383constructorimpl(0);
    }

    private OA() {
        super(WY.j.XQ(UByte.INSTANCE));
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ int J2(Object obj) {
        return WPU(((UByteArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ void S(gi.Ml ml, Object obj, int i2) {
        g(ml, ((UByteArray) obj).getStorage(), i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, z3w builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(UByte.m331constructorimpl(decoder.ck(getDescriptor(), i2).N()));
    }

    protected int WPU(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m390getSizeimpl(collectionSize);
    }

    protected void g(gi.Ml encoder, byte[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.Z(getDescriptor(), i3).KN(UByteArray.m389getw2LRezQ(content, i3));
        }
    }

    protected z3w nY(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new z3w(toBuilder, null);
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ Object qie(Object obj) {
        return nY(((UByteArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ Object o() {
        return UByteArray.m382boximpl(aYN());
    }
}
