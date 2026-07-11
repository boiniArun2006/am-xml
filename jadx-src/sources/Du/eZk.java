package Du;

import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eZk extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final eZk f2013t = new eZk();

    protected long[] aYN() {
        return ULongArray.m541constructorimpl(0);
    }

    private eZk() {
        super(WY.j.WPU(ULong.INSTANCE));
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ int J2(Object obj) {
        return WPU(((ULongArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ void S(gi.Ml ml, Object obj, int i2) {
        g(ml, ((ULongArray) obj).getStorage(), i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, yr builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(ULong.m487constructorimpl(decoder.ck(getDescriptor(), i2).ty()));
    }

    protected int WPU(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m548getSizeimpl(collectionSize);
    }

    protected void g(gi.Ml encoder, long[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.Z(getDescriptor(), i3).az(ULongArray.m547getsVKNKU(content, i3));
        }
    }

    protected yr nY(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new yr(toBuilder, null);
    }

    @Override // Du.j
    public /* bridge */ /* synthetic */ Object qie(Object obj) {
        return nY(((ULongArray) obj).getStorage());
    }

    @Override // Du.h6y
    public /* bridge */ /* synthetic */ Object o() {
        return ULongArray.m540boximpl(aYN());
    }
}
