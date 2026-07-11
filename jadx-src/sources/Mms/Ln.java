package Mms;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Ln extends I28 {
    private kotlinx.serialization.json.Dsr Uo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ln(kotlinx.serialization.json.n json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        B("primitive");
    }

    @Override // Mms.I28
    public kotlinx.serialization.json.Dsr Mx() {
        kotlinx.serialization.json.Dsr dsr = this.Uo;
        if (dsr != null) {
            return dsr;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // Mms.I28
    public void ul(String key, kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.Uo != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.Uo = element;
        G7().invoke(element);
    }
}
