package Mms;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class qf extends w6 {
    private final kotlinx.serialization.json.Dsr KN;

    public /* synthetic */ qf(kotlinx.serialization.json.n nVar, kotlinx.serialization.json.Dsr dsr, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, dsr, (i2 & 4) != 0 ? null : str);
    }

    @Override // gi.w6
    public int nY(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(kotlinx.serialization.json.n json, kotlinx.serialization.json.Dsr value, String str) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.KN = value;
        I("primitive");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mms.w6
    public kotlinx.serialization.json.Dsr m(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return qm();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // Mms.w6
    public kotlinx.serialization.json.Dsr qm() {
        return this.KN;
    }
}
