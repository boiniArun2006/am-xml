package com.applovin.mediation.adapter.parameters;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface MaxAdapterParameters {
    String getAdUnitId();

    @Nullable
    String getConsentString();

    Bundle getCustomParameters();

    Map<String, Object> getLocalExtraParameters();

    Bundle getServerParameters();

    @Nullable
    Boolean hasUserConsent();

    @Nullable
    @Deprecated
    Boolean isAgeRestrictedUser();

    @Nullable
    Boolean isDoNotSell();

    boolean isTesting();
}
