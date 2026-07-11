package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.v0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.s1;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class b implements e, v0, com.fyber.inneractive.sdk.config.cellular.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f53124h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f53125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f53126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f53127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f53128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f53129e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f53130f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f53131g = new Object();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final byte[] a() {
        JSONArray jSONArrayA;
        int i2;
        int i3;
        t0 t0Var;
        n0 n0Var;
        String str;
        int i5 = 3;
        int i7 = 4;
        k kVar = this.f53125a;
        kVar.f56666b = (z0) kVar.f56666b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.f53125a;
        this.f53127c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA = h.a("1.2");
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.f56666b).setVersion(nullableStringA);
        if (this.f53129e.get() != null) {
            this.f53127c.a();
        }
        k kVar3 = this.f53125a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA2 = h.a(this.f53127c.f53146b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setUserAgent(nullableStringA2);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA3 = h.a(this.f53127c.f53147c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setSdkVersion(nullableStringA3);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA4 = h.a(this.f53127c.f53148d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setBundleID(nullableStringA4);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA5 = h.a(this.f53127c.f53149e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setDeviceModel(nullableStringA5);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA6 = h.a(this.f53127c.f53150f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setAppVersion(nullableStringA6);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA7 = h.a("Android");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setDeviceOS(nullableStringA7);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A = h.a(Build.VERSION.SDK_INT);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setDeviceApi(nullableUInt32A);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA8 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setOsVersion(nullableStringA8);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA9 = h.a(this.f53127c.f53151g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setDeviceLanguage(nullableStringA9);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA10 = h.a(this.f53127c.f53152h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setCountryCode(nullableStringA10);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA11 = h.a(this.f53127c.f53153i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setCarrierName(nullableStringA11);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA12 = h.a(this.f53127c.f53154j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setMobileCountryCode(nullableStringA12);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA13 = h.a(this.f53127c.f53155k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setMobileNetworkCode(nullableStringA13);
        Long l2 = this.f53127c.f53156l;
        x xVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l2 != null) {
            int iIntValue = l2.intValue();
            xVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.f56666b).setData(iIntValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA14 = h.a(iAConfigManager.f53265C.f53339g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setUserID(nullableStringA14);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A2 = h.a(this.f53127c.f53157m);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setDeviceWidth(nullableUInt32A2);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A3 = h.a(this.f53127c.f53158n);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setDeviceHeight(nullableUInt32A3);
        q qVar = this.f53127c.f53159o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA15 = h.a(this.f53127c.f53160p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setInputLanguages(nullableStringA15);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA16 = h.a(this.f53127c.f53140H);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setMediationType(nullableStringA16);
        this.f53127c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.f53266D.f54026p;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA17 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setOdt(nullableStringA17);
        Integer numA = com.fyber.inneractive.sdk.serverapi.b.a();
        z zVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (numA != null) {
            int iIntValue2 = numA.intValue();
            zVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.f56666b).setData(iIntValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f56666b).setAdServicesVersion(nullableUInt32);
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.f53265C;
        if (gVar != null) {
            k kVar4 = this.f53125a;
            if (gVar.f53336d == null) {
                gVar.f53337e = gVar.i();
            }
            if (com.fyber.inneractive.sdk.util.o.f57018a == null) {
                str = null;
            } else {
                str = gVar.f53336d;
                if (str == null) {
                    str = gVar.f53337e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA18 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f56666b).setGdprString(nullableStringA18);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA = h.a(gVar.d());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f56666b).setGdprConsent(nullableBoolA);
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA19 = h.a(com.fyber.inneractive.sdk.util.o.f57018a == null ? null : gVar.f53340h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f56666b).setCcpaString(nullableStringA19);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA2 = h.a(com.fyber.inneractive.sdk.util.o.f57018a == null ? null : gVar.f53341i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f56666b).setLgpdConsent(nullableBoolA2);
            Boolean bool = gVar.f53342j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.f53125a;
                TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA3 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.f56666b).setCoppaApplies(nullableBoolA3);
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar6 = this.f53125a;
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f53482a.f53490b;
            boolean z2 = vVar != null ? vVar.f53487b : false;
            kVar6.c();
            ((TokenParametersOuterClass$TokenParameters) kVar6.f56666b).setDnt(z2);
        }
        k kVar7 = this.f53125a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA20 = h.a(this.f53127c.f53161q);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setNetwork(nullableStringA20);
        f0 f0Var = this.f53127c.f53162r;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setSecureContent(f0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA4 = h.a(this.f53127c.f53134B);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setBatteryCharging(nullableBoolA4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA5 = h.a(this.f53127c.f53163s);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setHeadsetPlugged(nullableBoolA5);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA6 = h.a(this.f53127c.f53164t);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setBluetoothPlugged(nullableBoolA6);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA7 = h.a(this.f53127c.f53165u);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setLowPowerMode(nullableBoolA7);
        boolean z3 = this.f53127c.f53166v;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setDarkMode(z3);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA8 = h.a(this.f53127c.f53167w);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setAirplaneMode(nullableBoolA8);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA9 = h.a(this.f53127c.f53168x);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setDndMode(nullableBoolA9);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA10 = h.a(this.f53127c.f53169y);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setIsRingMuted(nullableBoolA10);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A4 = h.a(this.f53127c.f53170z);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setSessionDuration(nullableUInt32A4);
        String str2 = this.f53127c.f53135C;
        z zVarNewBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str2)) {
            int i8 = Integer.parseInt(str2);
            zVarNewBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.f56666b).setData(i8);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.a();
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setBatteryLevel(nullableUInt322);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA11 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f53297w.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setPriorSkip(nullableBoolA11);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A5 = h.a(this.f53127c.f53136D);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setUserAge(nullableUInt32A5);
        InneractiveUserConfig.Gender gender = this.f53127c.f53137E;
        p0 p0Var = gender == InneractiveUserConfig.Gender.FEMALE ? p0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? p0.MALE : p0.UNKNOWN;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setUserGender(p0Var);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA21 = h.a(this.f53127c.f53139G);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setZipCode(nullableStringA21);
        boolean z4 = this.f53127c.f53138F;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setMuteAudio(z4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA12 = h.a(this.f53127c.f53144L);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f56666b).setMediaMuted(nullableBoolA12);
        com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f53482a.f53490b;
        if (vVar2 != null ? vVar2.f53488c : false) {
            k kVar8 = this.f53125a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA22 = h.a(this.f53127c.f53133A);
            kVar8.c();
            ((TokenParametersOuterClass$TokenParameters) kVar8.f56666b).setAmazonId(nullableStringA22);
        } else {
            k kVar9 = this.f53125a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA23 = h.a(this.f53127c.f53133A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.f56666b).setAaid(nullableStringA23);
        }
        UnitDisplayType[] unitDisplayTypeArrValues = UnitDisplayType.values();
        int length = unitDisplayTypeArrValues.length;
        int i9 = 0;
        while (i9 < length) {
            UnitDisplayType unitDisplayType = unitDisplayTypeArrValues[i9];
            if (unitDisplayType.isDeprecated()) {
                i2 = i5;
                i3 = i7;
            } else {
                int[] iArr = g.f53172a;
                int i10 = iArr[unitDisplayType.ordinal()];
                n0 n0Var2 = i10 != 1 ? i10 != 2 ? i10 != i5 ? i10 != i7 ? i10 != 5 ? n0.UNITDISPLAYTYPEUNKNOWN : n0.TYPENATIVE : n0.MRECT : n0.REWARDED : n0.INTERSTITIAL : n0.BANNER;
                com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f56911a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f53260M;
                String strA = iAConfigManager2.f53297w.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(strA) && strA.contains(",")) {
                    strA = strA.split(",")[0];
                }
                if (!TextUtils.isEmpty(strA)) {
                    k kVar10 = this.f53125a;
                    r rVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f56666b).setAdomain(strA);
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f56666b).setType(n0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.a();
                    kVar10.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar10.f56666b).addLastAdomains(lastAdomain);
                }
                String strA2 = iAConfigManager2.f53297w.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(strA2)) {
                    k kVar11 = this.f53125a;
                    t tVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f56666b).setLastBundle(strA2);
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f56666b).setType(n0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.a();
                    kVar11.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar11.f56666b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.f53297w.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar12 = this.f53125a;
                    int i11 = iArr[unitDisplayType.ordinal()];
                    if (i11 == 1) {
                        i2 = 3;
                        i3 = 4;
                        n0Var = n0.BANNER;
                    } else if (i11 != 2) {
                        i2 = 3;
                        if (i11 != 3) {
                            i3 = 4;
                            n0Var = i11 != 4 ? i11 != 5 ? n0.UNITDISPLAYTYPEUNKNOWN : n0.TYPENATIVE : n0.MRECT;
                        } else {
                            i3 = 4;
                            n0Var = n0.REWARDED;
                        }
                    } else {
                        i2 = 3;
                        i3 = 4;
                        n0Var = n0.INTERSTITIAL;
                    }
                    kVar12.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar12.f56666b).addPriorClicks(n0Var);
                } else {
                    i2 = 3;
                    i3 = 4;
                }
                a("display", unitDisplayType, n0Var2);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, n0Var2);
                    String strA3 = iAConfigManager2.f53297w.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(strA3)) {
                        k kVar13 = this.f53125a;
                        a0 a0VarNewBuilder = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        strA3.getClass();
                        int i12 = -1;
                        switch (strA3.hashCode()) {
                            case 49:
                                if (strA3.equals("1")) {
                                    i12 = 0;
                                }
                                break;
                            case 50:
                                if (strA3.equals("2")) {
                                    i12 = 1;
                                }
                                break;
                            case 51:
                                if (strA3.equals("3")) {
                                    i12 = 2;
                                }
                                break;
                            case 52:
                                if (strA3.equals("4")) {
                                    i12 = i2;
                                }
                                break;
                            case 53:
                                if (strA3.equals("5")) {
                                    i12 = i3;
                                }
                                break;
                        }
                        switch (i12) {
                            case 0:
                                t0Var = t0.CTABUTTON;
                                break;
                            case 1:
                                t0Var = t0.COMPANION;
                                break;
                            case 2:
                                t0Var = t0.VIDEOVIEW;
                                break;
                            case 3:
                                t0Var = t0.APPINFO;
                                break;
                            case 4:
                                t0Var = t0.STOREPROMO;
                                break;
                            default:
                                t0Var = t0.NOCLICK;
                                break;
                        }
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f56666b).setClickType(t0Var);
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f56666b).setType(n0Var2);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.a();
                        kVar13.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar13.f56666b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i9++;
            i5 = i2;
            i7 = i3;
        }
        com.fyber.inneractive.sdk.serverapi.c cVar = this.f53126b;
        cVar.getClass();
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        cVar.f56915a = rVarA;
        rVarA.a(false, "");
        com.fyber.inneractive.sdk.config.global.r rVar = this.f53126b.f56915a;
        if (rVar != null) {
            jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f53380b, true);
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
        } else {
            jSONArrayA = null;
        }
        if (jSONArrayA != null) {
            for (int i13 = 0; i13 < jSONArrayA.length(); i13++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayA.optJSONObject(i13);
                if (jSONObjectOptJSONObject != null) {
                    n nVarNewBuilder = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    nVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f56666b).setIdentifier(strOptString);
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    nVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f56666b).setVariant(strOptString2);
                    k kVar14 = this.f53125a;
                    TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.a();
                    kVar14.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar14.f56666b).addAbExperiments(experiment);
                }
            }
        }
        k kVar15 = this.f53125a;
        int i14 = com.fyber.inneractive.sdk.config.k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.number");
        z zVarNewBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(property)) {
            int i15 = Integer.parseInt(property);
            zVarNewBuilder3.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.f56666b).setData(i15);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt323 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.a();
        kVar15.c();
        ((TokenParametersOuterClass$TokenParameters) kVar15.f56666b).setPortal(nullableUInt323);
        k kVar16 = this.f53125a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA24 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
        kVar16.c();
        ((TokenParametersOuterClass$TokenParameters) kVar16.f56666b).setMockResponseId(nullableStringA24);
        k kVar17 = this.f53125a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA25 = h.a(this.f53127c.f53141I);
        kVar17.c();
        ((TokenParametersOuterClass$TokenParameters) kVar17.f56666b).setIgniteVersion(nullableStringA25);
        k kVar18 = this.f53125a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA26 = h.a(this.f53127c.f53142J);
        kVar18.c();
        ((TokenParametersOuterClass$TokenParameters) kVar18.f56666b).setIgnitePackageName(nullableStringA26);
        if (this.f53127c.f53143K) {
            k kVar19 = this.f53125a;
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA13 = h.a(Boolean.TRUE);
            kVar19.c();
            ((TokenParametersOuterClass$TokenParameters) kVar19.f56666b).setChildMode(nullableBoolA13);
        }
        return ((TokenParametersOuterClass$TokenParameters) this.f53125a.a()).toByteArray();
    }

    public final void b() {
        byte[] byteArray;
        if (this.f53130f.compareAndSet(false, true)) {
            try {
                String strEncodeToString = Base64.encodeToString(a(), 2);
                IAConfigManager iAConfigManager = IAConfigManager.f53260M;
                String str = iAConfigManager.f53286l;
                com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.f53294t.f53466b;
                String str2 = "token_size_limit";
                int iA = oVar.a("token_size_limit", Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 1);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "token_size_limit_" + str.toLowerCase(Locale.US);
                }
                TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParametersA = iAConfigManager.f53270H.a(oVar.a(str2, iA, 1) - strEncodeToString.getBytes().length);
                if (tokenParametersOuterClass$TokenParametersA == null) {
                    byteArray = null;
                } else {
                    k kVar = this.f53125a;
                    kVar.c();
                    com.fyber.inneractive.sdk.protobuf.t0.a(kVar.f56666b, tokenParametersOuterClass$TokenParametersA);
                    byteArray = ((TokenParametersOuterClass$TokenParameters) kVar.a()).toByteArray();
                }
                AtomicReference atomicReference = this.f53129e;
                if (byteArray != null) {
                    strEncodeToString = Base64.encodeToString(byteArray, 2);
                }
                atomicReference.set(strEncodeToString);
            } catch (Throwable th) {
                IAlog.b("Failed to generate token with error: %s", th.getMessage());
            }
            this.f53130f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.f57018a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z2 = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.f53127c.f53168x;
        if (bool == null || bool.booleanValue() != z2) {
            this.f53127c.f53168x = Boolean.valueOf(z2);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f57025a.execute(new a(this));
    }

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.f53126b = cVar;
        d dVar = new d(cVar);
        this.f53127c = dVar;
        this.f53125a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        iAConfigManager.f53297w.f53496e = this;
        if (iAConfigManager.f53294t.f53466b.a(true, "bidding_token_wait_for_ua")) {
            s1 s1Var = iAConfigManager.f53298x;
            s1Var.b();
            if (!s1Var.f57036d.get()) {
                s1Var.c();
            }
            dVar.f53146b = iAConfigManager.f53298x.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.f53274L) != null) {
            try {
                aVar.f53309c.add(this);
            } catch (Throwable th) {
                IAlog.a("failed to add network observer", th, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.f53128d = fVar;
        fVar.a();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(a1 a1Var) {
        if (TextUtils.equals(this.f53127c.f53161q, a1Var.b())) {
            return;
        }
        this.f53127c.f53161q = a1Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, n0 n0Var) {
        ArrayList<com.fyber.inneractive.sdk.cache.session.g> arrayList;
        int i2;
        l0 l0Var;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.f53297w.f53492a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.f53202b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i2 = Integer.parseInt(iAConfigManager.f53294t.f53466b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i2 = 5;
            }
            int i3 = i2 >= 0 ? i2 : 5;
            if (i3 > 0 && arrayList != null && arrayList.size() >= i3) {
                if (str.equals("video")) {
                    l0Var = l0.VIDEO;
                } else if (!str.equals("display")) {
                    l0Var = l0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    l0Var = l0.DISPLAY;
                }
                q0 q0VarNewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                q0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) q0VarNewBuilder.f56666b).setSubType(l0Var);
                int i5 = 0;
                for (com.fyber.inneractive.sdk.cache.session.g gVar : arrayList) {
                    g0 g0VarNewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i7 = gVar.f53208b;
                    g0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) g0VarNewBuilder.f56666b).setClicks(i7);
                    int i8 = gVar.f53207a;
                    g0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) g0VarNewBuilder.f56666b).setImpressions(i8);
                    if (str.equals("video") || n0Var.equals(n0.REWARDED)) {
                        int i9 = gVar.f53209c;
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) g0VarNewBuilder.f56666b).setCompletions(i9);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) g0VarNewBuilder.a();
                    q0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) q0VarNewBuilder.f56666b).addSessionDataItems(sessionData);
                    i5++;
                    if (i5 >= i3) {
                        break;
                    }
                }
                q0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) q0VarNewBuilder.f56666b).setType(n0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) q0VarNewBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.f53125a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.f56666b).addUserSessions(userSession);
        }
    }
}
