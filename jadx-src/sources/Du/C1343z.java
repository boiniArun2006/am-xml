package Du;

import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Du.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1343z extends h6y implements XA.Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1343z f2056t = new C1343z();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public char[] o() {
        return new char[0];
    }

    private C1343z() {
        super(WY.j.te(CharCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q, Du.j
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void xMQ(gi.w6 decoder, int i2, eO builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.O(decoder.J2(getDescriptor(), i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public int J2(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.h6y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void S(gi.Ml encoder, char[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.xMQ(getDescriptor(), i3, content[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public eO qie(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new eO(cArr);
    }
}
