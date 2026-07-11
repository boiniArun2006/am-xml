package Mms;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class h extends I28 {
    private final ArrayList Uo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlinx.serialization.json.n json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.Uo = new ArrayList();
    }

    @Override // Mms.I28, Du.FKk
    protected String D(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i2);
    }

    @Override // Mms.I28
    public kotlinx.serialization.json.Dsr Mx() {
        return new kotlinx.serialization.json.w6(this.Uo);
    }

    @Override // Mms.I28
    public void ul(String key, kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.Uo.add(Integer.parseInt(key), element);
    }
}
