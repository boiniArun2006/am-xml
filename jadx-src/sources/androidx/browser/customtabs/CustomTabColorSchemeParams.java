package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CustomTabColorSchemeParams {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f14530n;
    public final Integer nr;
    public final Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f14531t;

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f14532n;
        private Integer nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f14533t;

        public CustomTabColorSchemeParams n() {
            return new CustomTabColorSchemeParams(this.f14532n, this.rl, this.f14533t, this.nr);
        }

        public Builder rl(int i2) {
            this.f14532n = Integer.valueOf(i2 | (-16777216));
            return this;
        }
    }

    static CustomTabColorSchemeParams n(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new CustomTabColorSchemeParams((Integer) bundle.get(CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    Bundle rl() {
        Bundle bundle = new Bundle();
        Integer num = this.f14530n;
        if (num != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        Integer num2 = this.rl;
        if (num2 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR, num2.intValue());
        }
        Integer num3 = this.f14531t;
        if (num3 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num3.intValue());
        }
        Integer num4 = this.nr;
        if (num4 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num4.intValue());
        }
        return bundle;
    }

    CustomTabColorSchemeParams t(CustomTabColorSchemeParams customTabColorSchemeParams) {
        Integer num = this.f14530n;
        if (num == null) {
            num = customTabColorSchemeParams.f14530n;
        }
        Integer num2 = this.rl;
        if (num2 == null) {
            num2 = customTabColorSchemeParams.rl;
        }
        Integer num3 = this.f14531t;
        if (num3 == null) {
            num3 = customTabColorSchemeParams.f14531t;
        }
        Integer num4 = this.nr;
        if (num4 == null) {
            num4 = customTabColorSchemeParams.nr;
        }
        return new CustomTabColorSchemeParams(num, num2, num3, num4);
    }

    CustomTabColorSchemeParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f14530n = num;
        this.rl = num2;
        this.f14531t = num3;
        this.nr = num4;
    }
}
