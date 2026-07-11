package wa;

import com.bendingspoons.injet.module.MonetizationModule;
import com.bendingspoons.monopoly.Period;
import com.bendingspoons.monopoly.PeriodTimeUnit;
import com.bendingspoons.monopoly.product.BasePlan;
import com.bendingspoons.monopoly.product.Offer;
import com.bendingspoons.monopoly.product.PricingPhase;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class I28 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeriodTimeUnit.values().length];
            try {
                iArr[PeriodTimeUnit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeriodTimeUnit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PeriodTimeUnit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PeriodTimeUnit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final MonetizationModule.ProductPeriod nr(Period period) {
        MonetizationModule.ProductPeriodicityUnit productPeriodicityUnit;
        MonetizationModule.ProductPeriodicity productPeriodicity;
        PeriodTimeUnit timeUnit = period.getTimeUnit();
        int[] iArr = j.$EnumSwitchMapping$0;
        int i2 = iArr[timeUnit.ordinal()];
        if (i2 == 1) {
            productPeriodicityUnit = MonetizationModule.ProductPeriodicityUnit.DAY;
        } else if (i2 == 2) {
            productPeriodicityUnit = MonetizationModule.ProductPeriodicityUnit.WEEK;
        } else if (i2 == 3) {
            productPeriodicityUnit = MonetizationModule.ProductPeriodicityUnit.MONTH;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            productPeriodicityUnit = MonetizationModule.ProductPeriodicityUnit.YEAR;
        }
        int value = period.getValue();
        int i3 = iArr[period.getTimeUnit().ordinal()];
        if (i3 == 1) {
            productPeriodicity = MonetizationModule.ProductPeriodicity.DAILY;
        } else if (i3 == 2) {
            productPeriodicity = MonetizationModule.ProductPeriodicity.WEEKLY;
        } else if (i3 == 3) {
            productPeriodicity = MonetizationModule.ProductPeriodicity.MONTHLY;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            productPeriodicity = MonetizationModule.ProductPeriodicity.YEARLY;
        }
        return new MonetizationModule.ProductPeriod(productPeriodicityUnit, value, productPeriodicity);
    }

    private static final double rl(long j2) {
        if (j2 == 0) {
            return 0.0d;
        }
        return j2 / 1000000.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MonetizationModule.Product t(SubscriptionProduct subscriptionProduct) {
        MonetizationModule.ProductIntroductoryOffer productIntroductoryOffer;
        Offer offer = (Offer) CollectionsKt.firstOrNull((List) subscriptionProduct.getFreeTrialOffers());
        if (offer != null) {
            PricingPhase pricingPhase = (PricingPhase) CollectionsKt.first((List) offer.getPricingPhases());
            productIntroductoryOffer = new MonetizationModule.ProductIntroductoryOffer(new MonetizationModule.ProductPrice(rl(pricingPhase.getPriceAmountMicros()), pricingPhase.getPriceCurrencyCode()), nr(pricingPhase.getPeriod()), MonetizationModule.PaymentMode.FREE_TRIAL);
        } else {
            productIntroductoryOffer = null;
        }
        BasePlan basePlan = (BasePlan) CollectionsKt.first((List) subscriptionProduct.getBasePlans());
        return new MonetizationModule.Product(subscriptionProduct.getProductId(), new MonetizationModule.ProductPrice(rl(basePlan.getPriceAmountMicros()), basePlan.getPriceCurrencyCode()), nr(basePlan.getPeriod()), productIntroductoryOffer);
    }
}
