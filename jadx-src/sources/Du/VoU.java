package Du;

import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class VoU extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final VoU f1997t = new VoU();

    protected int[] aYN() {
        return UIntArray.m462constructorimpl(0);
    }

    private VoU() {
        super(WY.j.S(UInt.INSTANCE));
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ int J2(Object obj) {
        return WPU(((UIntArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ void S(gi.Ml ml, Object obj, int i2) {
        g(ml, ((UIntArray) obj).getStorage(), i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, HcS builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(UInt.m408constructorimpl(decoder.ck(getDescriptor(), i2).xMQ()));
    }

    protected int WPU(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m469getSizeimpl(collectionSize);
    }

    protected void g(gi.Ml encoder, int[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.Z(getDescriptor(), i3).E2(UIntArray.m468getpVg5ArA(content, i3));
        }
    }

    protected HcS nY(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new HcS(toBuilder, null);
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ Object qie(Object obj) {
        return nY(((UIntArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ Object o() {
        return UIntArray.m461boximpl(aYN());
    }
}
