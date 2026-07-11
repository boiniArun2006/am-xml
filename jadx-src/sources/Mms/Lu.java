package Mms;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Lu extends w6 {
    private final kotlinx.serialization.json.w6 KN;
    private int mUb;
    private final int xMQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lu(kotlinx.serialization.json.n json, kotlinx.serialization.json.w6 value) {
        super(json, value, null, 4, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.KN = value;
        this.xMQ = qm().size();
        this.mUb = -1;
    }

    @Override // Mms.w6
    /* JADX INFO: renamed from: HV, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.w6 qm() {
        return this.KN;
    }

    @Override // Du.QaP
    protected String Y(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mms.w6
    public kotlinx.serialization.json.Dsr m(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return qm().get(Integer.parseInt(tag));
    }

    @Override // gi.w6
    public int nY(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = this.mUb;
        if (i2 >= this.xMQ - 1) {
            return -1;
        }
        int i3 = i2 + 1;
        this.mUb = i3;
        return i3;
    }
}
