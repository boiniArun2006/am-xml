package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.caoccao.javet.values.primitive.V8ValueBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class z6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f51027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f51028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f51029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f51030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f51031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f51033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f51034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f51035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f51036j;

    public Boolean a(int i2) {
        return c7.a(i2, this.f51033g);
    }

    public boolean b() {
        return c7.a(this.f51033g);
    }

    public String c() {
        return this.f51033g;
    }

    public String d() {
        return x6.a(this.f51029c);
    }

    private Integer a(String str) {
        if (this.f51028b.contains(str)) {
            Integer num = (Integer) a5.a(str, null, Integer.class, this.f51028b, false);
            if (num != null) {
                return num;
            }
            Long l2 = (Long) a5.a(str, null, Long.class, this.f51028b, false);
            if (l2 != null && l2.longValue() >= -2147483648L && l2.longValue() <= 2147483647L) {
                return Integer.valueOf(l2.intValue());
            }
            String str2 = (String) a5.a(str, null, String.class, this.f51028b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f51027a.O();
                if (C1804o.a()) {
                    this.f51027a.O().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    private Integer h() {
        String strA = z4.f51020w.a();
        if (this.f51028b.contains(strA)) {
            Integer num = (Integer) a5.a(strA, null, Integer.class, this.f51028b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f51027a.O();
                if (C1804o.a()) {
                    this.f51027a.O().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l2 = (Long) a5.a(strA, null, Long.class, this.f51028b, false);
            if (l2 != null) {
                if (l2.longValue() == 1 || l2.longValue() == 0) {
                    return Integer.valueOf(l2.intValue());
                }
                this.f51027a.O();
                if (C1804o.a()) {
                    this.f51027a.O().b("TcfManager", "Long value (" + l2 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) a5.a(strA, null, Boolean.class, this.f51028b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) a5.a(strA, null, String.class, this.f51028b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || V8ValueBoolean.FALSE.equals(str)) {
                    return 0;
                }
                this.f51027a.O();
                if (C1804o.a()) {
                    this.f51027a.O().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean b(int i2) {
        String str = this.f51035i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i2 - 1));
    }

    public Boolean c(int i2) {
        String str = this.f51036j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i2 - 1));
    }

    public Boolean d(int i2) {
        String str = this.f51034h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(c7.a(str, i2 - 1));
    }

    public Integer e() {
        return this.f51029c;
    }

    public Integer f() {
        return this.f51030d;
    }

    public Integer g() {
        return this.f51031e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f51029c) + a("CMP SDK Version", this.f51030d) + a(z4.f51020w.a(), this.f51031e) + a(z4.f51021x.a(), this.f51032f) + a(z4.f51022y.a(), this.f51033g);
    }

    public String j() {
        return this.f51032f;
    }

    public String k() {
        return this.f51034h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(z4.f51018u.a())) {
            this.f51029c = a(str);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51029c);
            }
            this.f51027a.Q0();
            return;
        }
        if (str.equals(z4.f51019v.a())) {
            this.f51030d = a(str);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51030d);
                return;
            }
            return;
        }
        if (str.equals(z4.f51020w.a())) {
            this.f51031e = h();
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51031e);
                return;
            }
            return;
        }
        if (str.equals(z4.f51021x.a())) {
            this.f51032f = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51032f);
            }
            this.f51027a.Q0();
            return;
        }
        if (str.equals(z4.f51022y.a())) {
            this.f51033g = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51033g);
            }
            b(this.f51033g);
            return;
        }
        if (str.equals(z4.f51023z.a())) {
            this.f51034h = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51034h);
                return;
            }
            return;
        }
        if (str.equals(z4.f50980A.a())) {
            String str2 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(z4.f50981B.a())) {
            this.f51035i = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51035i);
                return;
            }
            return;
        }
        if (str.equals(z4.f50982C.a())) {
            String str3 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(z4.f50983D.a())) {
            this.f51036j = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f51036j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) a5.a(str, (Object) null, String.class, sharedPreferences);
            this.f51027a.O();
            if (C1804o.a()) {
                this.f51027a.O().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    public z6(C1802k c1802k) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1802k.o());
        this.f51028b = defaultSharedPreferences;
        this.f51027a = c1802k;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f51029c = a(z4.f51018u.a());
        this.f51030d = a(z4.f51019v.a());
        this.f51031e = h();
        this.f51032f = (String) a5.a(z4.f51021x, (Object) null, defaultSharedPreferences, false);
        this.f51033g = (String) a5.a(z4.f51022y, (Object) null, defaultSharedPreferences, false);
        this.f51034h = (String) a5.a(z4.f51023z, (Object) null, defaultSharedPreferences, false);
        this.f51035i = (String) a5.a(z4.f50981B, (Object) null, defaultSharedPreferences, false);
        this.f51036j = (String) a5.a(z4.f50983D, (Object) null, defaultSharedPreferences, false);
        b(this.f51033g);
    }

    private void b(String str) {
        this.f51027a.O();
        if (C1804o.a()) {
            this.f51027a.O().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = c7.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f51027a.O();
                if (C1804o.a()) {
                    this.f51027a.O().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                p0.b(true, C1802k.o());
            } else {
                this.f51027a.O();
                if (C1804o.a()) {
                    this.f51027a.O().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                p0.b(false, C1802k.o());
            }
            this.f51027a.Q0();
            return;
        }
        this.f51027a.O();
        if (C1804o.a()) {
            this.f51027a.O().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f51029c = null;
        this.f51031e = null;
        this.f51032f = null;
        this.f51033g = null;
        this.f51034h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(str);
        sb.append(" - ");
        sb.append(obj != null ? obj.toString() : "No value set");
        return sb.toString();
    }
}
