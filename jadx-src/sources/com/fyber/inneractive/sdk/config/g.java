package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vungle.ads.internal.model.Cookie;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f53343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f53344l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f53333a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f53334b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f53335c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f53336d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53337e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InneractiveAdManager.GdprConsentSource f53338f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f53339g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f53340h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f53341i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f53342j = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f53345m = null;

    public final boolean a(boolean z2, String str) {
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            return false;
        }
        g();
        SharedPreferences sharedPreferences = this.f53343k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z2).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        g();
        this.f53341i = null;
        SharedPreferences sharedPreferences = this.f53343k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        g();
        this.f53340h = null;
        SharedPreferences sharedPreferences = this.f53343k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final Boolean d() {
        if (this.f53333a == null) {
            this.f53334b = h();
        }
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            return null;
        }
        Boolean bool = this.f53333a;
        return bool == null ? this.f53334b : bool;
    }

    public final boolean e() {
        int i2;
        Boolean bool = this.f53345m;
        if (bool != null) {
            return bool.booleanValue();
        }
        SharedPreferences sharedPreferences = this.f53344l;
        if (sharedPreferences == null) {
            return true;
        }
        this.f53345m = Boolean.TRUE;
        try {
            i2 = sharedPreferences.getInt(Cookie.IABTCF_GDPR_APPLIES, -1);
        } catch (Exception unused) {
            IAlog.a("%sException caught when trying to read INT isGdprApplies from prefs", IAlog.a(this));
            i2 = -1;
        }
        if (i2 != -1) {
            this.f53345m = Boolean.valueOf(i2 == 1);
        } else {
            try {
                this.f53345m = Boolean.valueOf(this.f53344l.getBoolean(Cookie.IABTCF_GDPR_APPLIES, true));
            } catch (Exception unused2) {
                IAlog.a("%sException caught when trying to read BOOLEAN isGdprApplies from prefs", IAlog.a(this));
            }
        }
        return this.f53345m.booleanValue();
    }

    public final boolean f() {
        o oVar;
        SharedPreferences sharedPreferences;
        if (this.f53335c == null) {
            boolean z2 = false;
            if (e()) {
                s sVar = IAConfigManager.f53260M.f53294t;
                if (sVar != null && (oVar = sVar.f53466b) != null && oVar.a("TcfPurpose1", 1, Integer.MIN_VALUE) == 1 && (sharedPreferences = this.f53344l) != null) {
                    try {
                        String string = sharedPreferences.getString("IABTCF_PurposeConsents", null);
                        if (string != null && !string.isEmpty() && string.charAt(0) == '0') {
                            z2 = true;
                        }
                    } catch (Exception unused) {
                        IAlog.b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", IAlog.a(this));
                    }
                }
            } else {
                IAlog.a("%sGDPR does not apply - returning false for GDPR Purpose1Disabled", IAlog.a(this));
            }
            this.f53335c = Boolean.valueOf(z2);
        }
        return this.f53335c.booleanValue();
    }

    public final void g() {
        Application application = com.fyber.inneractive.sdk.util.o.f57018a;
        if (application != null) {
            if (this.f53344l == null) {
                this.f53344l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            if (this.f53343k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.f53343k = sharedPreferences;
                if (sharedPreferences != null) {
                    this.f53345m = Boolean.valueOf(e());
                    if (sharedPreferences.contains("IAGDPRBool")) {
                        this.f53333a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                    } else {
                        this.f53334b = h();
                    }
                    if (sharedPreferences.contains("IAGdprConsentData")) {
                        this.f53336d = sharedPreferences.getString("IAGdprConsentData", null);
                    } else {
                        this.f53337e = i();
                    }
                    if (sharedPreferences.contains("IACCPAConsentData")) {
                        this.f53340h = sharedPreferences.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences.contains("IAGdprSource")) {
                        try {
                            this.f53338f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f53338f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences.contains("IALgpdConsentStatus")) {
                        this.f53341i = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences.contains("keyUserID")) {
                        this.f53339g = sharedPreferences.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final Boolean h() {
        o oVar;
        SharedPreferences sharedPreferences;
        if (!e()) {
            IAlog.a("%sGDPR does not apply - returning null for GDPR consent status", IAlog.a(this));
            return null;
        }
        s sVar = IAConfigManager.f53260M.f53294t;
        if (sVar != null && (oVar = sVar.f53466b) != null) {
            int i2 = 262;
            int iA = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (iA != 0 && (sharedPreferences = this.f53344l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    if (iA >= 0) {
                        i2 = iA;
                    }
                    boolean z2 = true;
                    int i3 = i2 - 1;
                    if (string.length() <= i3 || string.charAt(i3) != '1') {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final String i() {
        SharedPreferences sharedPreferences;
        if (!e()) {
            IAlog.a("%sGDPR does not apply - returning null for GDPR consent string", IAlog.a(this));
            return null;
        }
        if (IAConfigManager.f53260M.f53294t.f53466b.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.f53344l) != null && sharedPreferences.contains(Cookie.IABTCF_TC_STRING)) {
            try {
                return this.f53344l.getString(Cookie.IABTCF_TC_STRING, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            return false;
        }
        g();
        if (this.f53343k == null) {
            return false;
        }
        IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f53343k.edit().putString(str, str2).apply();
        return true;
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.f57018a != null) {
            g();
            if (TextUtils.isEmpty(str)) {
                this.f53339g = str;
                SharedPreferences sharedPreferences = this.f53343k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.f53343k;
            if (sharedPreferences2 != null) {
                this.f53339g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        g();
        this.f53333a = null;
        this.f53336d = null;
        SharedPreferences sharedPreferences = this.f53343k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }
}
