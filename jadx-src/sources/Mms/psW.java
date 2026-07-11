package Mms;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class psW extends vd {
    private String KN;
    private boolean xMQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psW(kotlinx.serialization.json.n json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.xMQ = true;
    }

    @Override // Mms.vd, Mms.I28
    public kotlinx.serialization.json.Dsr Mx() {
        return new kotlinx.serialization.json.nKK(n1());
    }

    @Override // Mms.vd, Mms.I28
    public void ul(String key, kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.xMQ) {
            Map mapN1 = n1();
            String str = this.KN;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str = null;
            }
            mapN1.put(str, element);
            this.xMQ = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.qf) {
            this.KN = ((kotlinx.serialization.json.qf) element).t();
            this.xMQ = false;
        } else {
            if (element instanceof kotlinx.serialization.json.nKK) {
                throw Ew.nr(kotlinx.serialization.json.u.f70282n.getDescriptor());
            }
            if (!(element instanceof kotlinx.serialization.json.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            throw Ew.nr(kotlinx.serialization.json.Ml.f70264n.getDescriptor());
        }
    }
}
