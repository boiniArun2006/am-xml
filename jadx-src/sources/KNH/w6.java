package KNH;

import com.bendingspoons.monopoly.product.Offer;
import com.bendingspoons.monopoly.product.PricingPhase;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {
    public static final PricingPhase n(Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Object objFirst = CollectionsKt.first((List<? extends Object>) offer.getPricingPhases());
        if (((PricingPhase) objFirst).getPriceAmountMicros() != 0) {
            objFirst = null;
        }
        return (PricingPhase) objFirst;
    }

    public static final PricingPhase nr(Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        if (!t(offer)) {
            return null;
        }
        for (PricingPhase pricingPhase : offer.getPricingPhases()) {
            if (pricingPhase.getPriceAmountMicros() > 0) {
                return pricingPhase;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean rl(Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        return ((PricingPhase) CollectionsKt.first((List) offer.getPricingPhases())).getPriceAmountMicros() == 0;
    }

    public static final boolean t(Offer offer) {
        int i2;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        List<PricingPhase> pricingPhases = offer.getPricingPhases();
        if (pricingPhases == null || !pricingPhases.isEmpty()) {
            Iterator<T> it = pricingPhases.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((PricingPhase) it.next()).getPriceAmountMicros() > 0 && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i2 = 0;
        }
        return i2 > 1;
    }
}
