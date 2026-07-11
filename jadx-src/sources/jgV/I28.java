package jgV;

import com.bendingspoons.pico.domain.entities.PicoEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class I28 {
    public static final PicoEvent n(PicoEvent.Companion companion, String productId, String purchaseToken, long j2, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("product_id", productId);
        ml.O("purchase_token", purchaseToken);
        ml.nr("purchase_time", Long.valueOf(j2));
        Unit unit = Unit.INSTANCE;
        return companion.n("PurchaseIdentifiers", ml.rl(additionalInfo));
    }
}
