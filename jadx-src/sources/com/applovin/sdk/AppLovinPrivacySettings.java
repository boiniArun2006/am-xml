package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.n7;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class AppLovinPrivacySettings {
    public static boolean hasUserConsent() {
        return hasUserConsent(C1802k.o());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(C1802k.o());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(C1802k.o());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(C1802k.o());
    }

    public static void setDoNotSell(boolean z2) {
        setDoNotSell(z2, C1802k.o());
    }

    public static void setHasUserConsent(boolean z2) {
        setHasUserConsent(z2, C1802k.o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = p0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = p0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return p0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return p0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z2, Context context) {
        C1804o.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (p0.a(z2, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z2));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z2, Context context) {
        C1804o.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (p0.b(z2, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z2), null);
        }
    }

    @Nullable
    public static Boolean getAdditionalConsentStatus(int i2) {
        C1802k c1802kF = n7.f();
        if (c1802kF == null) {
            C1804o.h(aNrWBQYwFf.plrdJGiXnGlp, "Unable to retrieve additional consent status");
            return null;
        }
        return c1802kF.r0().a(i2);
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i2) {
        C1802k c1802kF = n7.f();
        if (c1802kF == null) {
            C1804o.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
            return null;
        }
        return c1802kF.r0().b(i2);
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i2) {
        C1802k c1802kF = n7.f();
        if (c1802kF == null) {
            C1804o.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
            return null;
        }
        return c1802kF.r0().c(i2);
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i2) {
        C1802k c1802kF = n7.f();
        if (c1802kF == null) {
            C1804o.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
            return null;
        }
        return c1802kF.r0().d(i2);
    }
}
