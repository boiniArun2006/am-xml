package com.bendingspoons.oracle.models;

import Du.Y5;
import Du.i;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import c8G.Fsz.qwlyMfUJj;
import com.bendingspoons.oracle.models.LegalNotifications;
import com.bendingspoons.oracle.models.Products;
import com.bendingspoons.oracle.models.Settings;
import com.bendingspoons.oracle.models.User;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010$\n\u0002\b\u0007\b\u0017\u0018\u0000 O2\u00020\u0001:\u0002PQB_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010+\u0012\u0004\b0\u0010*\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00101\u0012\u0004\b6\u0010*\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u00107\u0012\u0004\b<\u0010*\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00107\u0012\u0004\b?\u0010*\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R*\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00107\u0012\u0004\bB\u0010*\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010C\u0012\u0004\bH\u0010*\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R\u001f\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/bendingspoons/oracle/models/OracleResponse;", "", "Lcom/bendingspoons/oracle/models/Settings;", "settings", "Lcom/bendingspoons/oracle/models/User;", "me", "Lcom/bendingspoons/oracle/models/Products;", "products", "", "settingsHash", "defaultSettingsUrl", "overridesUrl", "Lcom/bendingspoons/oracle/models/LegalNotifications;", "legalNotifications", "rawBody", "<init>", "(Lcom/bendingspoons/oracle/models/Settings;Lcom/bendingspoons/oracle/models/User;Lcom/bendingspoons/oracle/models/Products;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bendingspoons/oracle/models/LegalNotifications;Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILcom/bendingspoons/oracle/models/Settings;Lcom/bendingspoons/oracle/models/User;Lcom/bendingspoons/oracle/models/Products;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bendingspoons/oracle/models/LegalNotifications;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self", "(Lcom/bendingspoons/oracle/models/OracleResponse;Lgi/Ml;LEJn/Wre;)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/bendingspoons/oracle/models/Settings;", "getSettings", "()Lcom/bendingspoons/oracle/models/Settings;", "setSettings", "(Lcom/bendingspoons/oracle/models/Settings;)V", "getSettings$annotations", "()V", "Lcom/bendingspoons/oracle/models/User;", "getMe", "()Lcom/bendingspoons/oracle/models/User;", "setMe", "(Lcom/bendingspoons/oracle/models/User;)V", "getMe$annotations", "Lcom/bendingspoons/oracle/models/Products;", "getProducts", "()Lcom/bendingspoons/oracle/models/Products;", "setProducts", "(Lcom/bendingspoons/oracle/models/Products;)V", "getProducts$annotations", "Ljava/lang/String;", "getSettingsHash", "()Ljava/lang/String;", "setSettingsHash", "(Ljava/lang/String;)V", "getSettingsHash$annotations", "getDefaultSettingsUrl", "setDefaultSettingsUrl", "getDefaultSettingsUrl$annotations", "getOverridesUrl", "setOverridesUrl", "getOverridesUrl$annotations", "Lcom/bendingspoons/oracle/models/LegalNotifications;", "getLegalNotifications", "()Lcom/bendingspoons/oracle/models/LegalNotifications;", "setLegalNotifications", "(Lcom/bendingspoons/oracle/models/LegalNotifications;)V", "getLegalNotifications$annotations", "getRawBody", "setRawBody", "", "getActivePlanIds", "()Ljava/util/Map;", "activePlanIds", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
@SourceDebugExtension({"SMAP\nOracleResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OracleResponse.kt\ncom/bendingspoons/oracle/models/OracleResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,583:1\n1187#2,2:584\n1261#2,4:586\n1187#2,2:590\n1261#2,2:592\n1264#2:595\n1279#2,2:596\n1293#2,4:598\n1#3:594\n*S KotlinDebug\n*F\n+ 1 OracleResponse.kt\ncom/bendingspoons/oracle/models/OracleResponse\n*L\n87#1:584,2\n87#1:586,4\n88#1:590,2\n88#1:592,2\n88#1:595\n91#1:596,2\n91#1:598,4\n*E\n"})
public class OracleResponse {
    private String defaultSettingsUrl;
    private LegalNotifications legalNotifications;
    private User me;
    private String overridesUrl;
    private Products products;
    private String rawBody;
    private Settings settings;
    private String settingsHash;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.OracleResponse$n, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51428n;
        }
    }

    public OracleResponse() {
        this((Settings) null, (User) null, (Products) null, (String) null, (String) null, (String) null, (LegalNotifications) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    @Json(name = "default_settings_url")
    public static /* synthetic */ void getDefaultSettingsUrl$annotations() {
    }

    @Json(name = "legal_notifications")
    public static /* synthetic */ void getLegalNotifications$annotations() {
    }

    @Json(name = "me")
    public static /* synthetic */ void getMe$annotations() {
    }

    @Json(name = "overrides_url")
    public static /* synthetic */ void getOverridesUrl$annotations() {
    }

    @Json(name = "products")
    public static /* synthetic */ void getProducts$annotations() {
    }

    @Json(name = "settings")
    public static /* synthetic */ void getSettings$annotations() {
    }

    @Json(name = "settings_hash")
    public static /* synthetic */ void getSettingsHash$annotations() {
    }

    public /* synthetic */ OracleResponse(int i2, Settings settings, User user, Products products, String str, String str2, String str3, LegalNotifications legalNotifications, String str4, i iVar) {
        LegalNotifications legalNotifications2;
        if ((i2 & 1) == 0) {
            this.settings = new Settings((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (Map) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, false, 0, 0, 16777215, (DefaultConstructorMarker) null);
        } else {
            this.settings = settings;
        }
        if ((i2 & 2) == 0) {
            this.me = new User((String) null, (List) null, (User.PrivacyNotice) null, (User.TermsOfService) null, (Map) null, (List) null, (List) null, (List) null, (User.AuthenticationResponse) null, 511, (DefaultConstructorMarker) null);
        } else {
            this.me = user;
        }
        if ((i2 & 4) == 0) {
            this.products = new Products((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.products = products;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((i2 & 8) == 0) {
            this.settingsHash = null;
        } else {
            this.settingsHash = str;
        }
        if ((i2 & 16) == 0) {
            this.defaultSettingsUrl = null;
        } else {
            this.defaultSettingsUrl = str2;
        }
        if ((i2 & 32) == 0) {
            this.overridesUrl = null;
        } else {
            this.overridesUrl = str3;
        }
        if ((i2 & 64) == 0) {
            boolean z2 = false;
            legalNotifications2 = new LegalNotifications(z2, z2, 3, defaultConstructorMarker);
        } else {
            legalNotifications2 = legalNotifications;
        }
        this.legalNotifications = legalNotifications2;
        if ((i2 & 128) == 0) {
            this.rawBody = null;
        } else {
            this.rawBody = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self(OracleResponse self, gi.Ml output, Wre serialDesc) {
        boolean z2 = false;
        if (output.r(serialDesc, 0)) {
            output.S(serialDesc, 0, Settings.j.f51431n, self.settings);
        } else {
            if (!Intrinsics.areEqual(self.settings, new Settings((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (Map) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, false, 0, 0, 16777215, (DefaultConstructorMarker) null))) {
            }
        }
        if (output.r(serialDesc, 1)) {
            output.S(serialDesc, 1, User.j.f51438n, self.me);
        } else {
            if (!Intrinsics.areEqual(self.me, new User((String) null, (List) null, (User.PrivacyNotice) null, (User.TermsOfService) null, (Map) null, (List) null, (List) null, (List) null, (User.AuthenticationResponse) null, 511, (DefaultConstructorMarker) null))) {
            }
        }
        if (output.r(serialDesc, 2)) {
            output.S(serialDesc, 2, Products.j.f51429n, self.products);
        } else {
            if (!Intrinsics.areEqual(self.products, new Products((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            }
        }
        int i2 = 3;
        if (output.r(serialDesc, 3) || self.settingsHash != null) {
            output.X(serialDesc, 3, Y5.f2000n, self.settingsHash);
        }
        if (output.r(serialDesc, 4) || self.defaultSettingsUrl != null) {
            output.X(serialDesc, 4, Y5.f2000n, self.defaultSettingsUrl);
        }
        if (output.r(serialDesc, 5) || self.overridesUrl != null) {
            output.X(serialDesc, 5, Y5.f2000n, self.overridesUrl);
        }
        if (output.r(serialDesc, 6) || !Intrinsics.areEqual(self.legalNotifications, new LegalNotifications(z2, z2, i2, (DefaultConstructorMarker) null))) {
            output.S(serialDesc, 6, LegalNotifications.j.f51426n, self.legalNotifications);
        }
        if (!output.r(serialDesc, 7) && self.rawBody == null) {
            return;
        }
        output.X(serialDesc, 7, Y5.f2000n, self.rawBody);
    }

    public boolean equals(Object other) {
        if (!(other instanceof OracleResponse)) {
            return false;
        }
        OracleResponse oracleResponse = (OracleResponse) other;
        return Intrinsics.areEqual(this.settings, oracleResponse.settings) && Intrinsics.areEqual(this.me, oracleResponse.me) && Intrinsics.areEqual(this.products, oracleResponse.products) && Intrinsics.areEqual(this.legalNotifications, oracleResponse.legalNotifications) && Intrinsics.areEqual(this.rawBody, oracleResponse.rawBody);
    }

    public final Map<String, String> getActivePlanIds() {
        Object next;
        Object next2;
        List<User.BundleSubscription> activeBundleSubscriptions = this.me.getActiveBundleSubscriptions();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(activeBundleSubscriptions, 10)), 16));
        for (User.BundleSubscription bundleSubscription : activeBundleSubscriptions) {
            Pair pair = TuplesKt.to(bundleSubscription.getProductId(), bundleSubscription.getPlanId());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        List<User.ActiveSubscription> activeSubscriptions = this.me.getActiveSubscriptions();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(activeSubscriptions, 10)), 16));
        Iterator<T> it = activeSubscriptions.iterator();
        while (true) {
            String planId = null;
            if (!it.hasNext()) {
                break;
            }
            User.ActiveSubscription activeSubscription = (User.ActiveSubscription) it.next();
            String id = activeSubscription.getId();
            Iterator<T> it2 = this.products.getSubscriptions().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.areEqual(((Subscription) next2).getId(), activeSubscription.getId())) {
                    break;
                }
            }
            Subscription subscription = (Subscription) next2;
            if (subscription != null) {
                planId = subscription.getPlanId();
            }
            Pair pair2 = TuplesKt.to(id, planId);
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        Map mapPlus = MapsKt.plus(linkedHashMap, linkedHashMap2);
        List<String> nonConsumablesIds = this.me.getNonConsumablesIds();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(nonConsumablesIds, 10)), 16));
        for (Object obj : nonConsumablesIds) {
            String str = (String) obj;
            Iterator<T> it3 = this.products.getNonConsumables().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (Intrinsics.areEqual(((NonConsumable) next).getId(), str)) {
                    break;
                }
            }
            NonConsumable nonConsumable = (NonConsumable) next;
            linkedHashMap3.put(obj, nonConsumable != null ? nonConsumable.getPlanId() : null);
        }
        return MapsKt.plus(mapPlus, linkedHashMap3);
    }

    public final String getDefaultSettingsUrl() {
        return this.defaultSettingsUrl;
    }

    public final LegalNotifications getLegalNotifications() {
        return this.legalNotifications;
    }

    public final User getMe() {
        return this.me;
    }

    public final String getOverridesUrl() {
        return this.overridesUrl;
    }

    public final Products getProducts() {
        return this.products;
    }

    public final String getRawBody() {
        return this.rawBody;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final String getSettingsHash() {
        return this.settingsHash;
    }

    public int hashCode() {
        return (((this.settings.hashCode() * 31) + this.me.hashCode()) * 31) + this.products.hashCode();
    }

    public final void setDefaultSettingsUrl(String str) {
        this.defaultSettingsUrl = str;
    }

    public final void setLegalNotifications(LegalNotifications legalNotifications) {
        Intrinsics.checkNotNullParameter(legalNotifications, "<set-?>");
        this.legalNotifications = legalNotifications;
    }

    public final void setMe(User user) {
        Intrinsics.checkNotNullParameter(user, "<set-?>");
        this.me = user;
    }

    public final void setOverridesUrl(String str) {
        this.overridesUrl = str;
    }

    public final void setProducts(Products products) {
        Intrinsics.checkNotNullParameter(products, "<set-?>");
        this.products = products;
    }

    public final void setRawBody(String str) {
        this.rawBody = str;
    }

    public final void setSettings(Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "<set-?>");
        this.settings = settings;
    }

    public final void setSettingsHash(String str) {
        this.settingsHash = str;
    }

    public OracleResponse(Settings settings, User me, Products products, String str, String str2, String str3, LegalNotifications legalNotifications, String str4) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(me, "me");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(legalNotifications, qwlyMfUJj.gUBLqkN);
        this.settings = settings;
        this.me = me;
        this.products = products;
        this.settingsHash = str;
        this.defaultSettingsUrl = str2;
        this.overridesUrl = str3;
        this.legalNotifications = legalNotifications;
        this.rawBody = str4;
    }

    public /* synthetic */ OracleResponse(Settings settings, User user, Products products, String str, String str2, String str3, LegalNotifications legalNotifications, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        LegalNotifications legalNotifications2;
        Settings settings2 = (i2 & 1) != 0 ? new Settings((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (Map) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, false, 0, 0, 16777215, (DefaultConstructorMarker) null) : settings;
        User user2 = (i2 & 2) != 0 ? new User((String) null, (List) null, (User.PrivacyNotice) null, (User.TermsOfService) null, (Map) null, (List) null, (List) null, (List) null, (User.AuthenticationResponse) null, 511, (DefaultConstructorMarker) null) : user;
        Products products2 = (i2 & 4) != 0 ? new Products((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : products;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str5 = (i2 & 8) != 0 ? null : str;
        String str6 = (i2 & 16) != 0 ? null : str2;
        String str7 = (i2 & 32) != 0 ? null : str3;
        if ((i2 & 64) != 0) {
            boolean z2 = false;
            legalNotifications2 = new LegalNotifications(z2, z2, 3, defaultConstructorMarker2);
        } else {
            legalNotifications2 = legalNotifications;
        }
        this(settings2, user2, products2, str5, str6, str7, legalNotifications2, (i2 & 128) != 0 ? null : str4);
    }
}
