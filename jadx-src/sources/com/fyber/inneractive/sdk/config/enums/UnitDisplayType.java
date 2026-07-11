package com.fyber.inneractive.sdk.config.enums;

import com.vungle.ads.internal.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum UnitDisplayType {
    INTERSTITIAL(Constants.PLACEMENT_TYPE_INTERSTITIAL, false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED(Constants.PLACEMENT_TYPE_REWARDED, false),
    NATIVE("typenative", false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT("default", false);

    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = str != null ? CONSTANTS.get(str.toLowerCase(Locale.US)) : null;
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }

    UnitDisplayType(String str, boolean z2) {
        this.stringValue = str;
        this.deprecated = z2;
    }
}
