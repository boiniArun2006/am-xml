package zz;

import com.bendingspoons.spidersense.domain.network.entities.sampling.SamplingRuleEntity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PolymorphicJsonAdapterFactory f76735n = PolymorphicJsonAdapterFactory.of(SamplingRuleEntity.class, AppMeasurementSdk.ConditionalUserProperty.NAME).withSubtype(SamplingRuleEntity.Spooners.class, "spooners").withSubtype(SamplingRuleEntity.PremiumUsers.class, "premium_users").withSubtype(SamplingRuleEntity.Categories.class, "categories").withSubtype(SamplingRuleEntity.Experiments.class, "experiments").withSubtype(SamplingRuleEntity.Severity.class, "severity").withSubtype(SamplingRuleEntity.Standard.class, "standard").withSubtype(SamplingRuleEntity.AndRule.class, "and");

    public static final PolymorphicJsonAdapterFactory n() {
        return f76735n;
    }
}
