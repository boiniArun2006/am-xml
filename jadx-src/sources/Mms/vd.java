package Mms;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class vd extends I28 {
    private final Map Uo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(kotlinx.serialization.json.n json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.Uo = new LinkedHashMap();
    }

    @Override // Mms.I28
    public kotlinx.serialization.json.Dsr Mx() {
        return new kotlinx.serialization.json.nKK(this.Uo);
    }

    @Override // Du.AZy, gi.Ml
    public void X(EJn.Wre descriptor, int i2, XA.eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.nr.mUb()) {
            super.X(descriptor, i2, serializer, obj);
        }
    }

    protected final Map n1() {
        return this.Uo;
    }

    @Override // Mms.I28
    public void ul(String key, kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.Uo.put(key, element);
    }
}
