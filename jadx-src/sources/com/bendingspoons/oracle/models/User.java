package com.bendingspoons.oracle.models;

import Du.DC;
import Du.Y5;
import Du.fg;
import Du.g9;
import Du.i;
import Du.iF;
import Du.lej;
import Du.mz;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.oracle.models.User;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import gi.I28;
import gi.w6;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0007VWXYZ[\\B\u008b\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\u0018\b\u0003\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J \u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u0094\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\u0018\b\u0003\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010%J\u0010\u00106\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010%R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010)R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010F\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010+R0\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010I\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010-R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010'R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bO\u0010?\u001a\u0004\bN\u0010'R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010@\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010'R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010R\u0012\u0004\bT\u0010?\u001a\u0004\bS\u00102¨\u0006]"}, d2 = {"Lcom/bendingspoons/oracle/models/User;", "", "", "id", "", "activeSubscriptionsIds", "Lcom/bendingspoons/oracle/models/User$PrivacyNotice;", "privacyNotice", "Lcom/bendingspoons/oracle/models/User$TermsOfService;", "termsOfService", "", "", "Lcom/bendingspoons/oracle/models/ConsumableCredits;", "availableConsumableCredits", "nonConsumablesIds", "Lcom/bendingspoons/oracle/models/User$BundleSubscription;", "activeBundleSubscriptions", "Lcom/bendingspoons/oracle/models/User$ActiveSubscription;", "activeSubscriptions", "Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;", "authentication", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/bendingspoons/oracle/models/User$PrivacyNotice;Lcom/bendingspoons/oracle/models/User$TermsOfService;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;)V", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/bendingspoons/oracle/models/User$PrivacyNotice;Lcom/bendingspoons/oracle/models/User$TermsOfService;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/User;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/bendingspoons/oracle/models/User$PrivacyNotice;", "component4", "()Lcom/bendingspoons/oracle/models/User$TermsOfService;", "component5", "()Ljava/util/Map;", "component6", "component7", "component8", "component9", "()Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/bendingspoons/oracle/models/User$PrivacyNotice;Lcom/bendingspoons/oracle/models/User$TermsOfService;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;)Lcom/bendingspoons/oracle/models/User;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Ljava/util/List;", "getActiveSubscriptionsIds", "getActiveSubscriptionsIds$annotations", "Lcom/bendingspoons/oracle/models/User$PrivacyNotice;", "getPrivacyNotice", "getPrivacyNotice$annotations", "Lcom/bendingspoons/oracle/models/User$TermsOfService;", "getTermsOfService", "getTermsOfService$annotations", "Ljava/util/Map;", "getAvailableConsumableCredits", "getAvailableConsumableCredits$annotations", "getNonConsumablesIds", "getNonConsumablesIds$annotations", "getActiveBundleSubscriptions", "getActiveBundleSubscriptions$annotations", "getActiveSubscriptions", "getActiveSubscriptions$annotations", "Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;", "getAuthentication", "getAuthentication$annotations", "Companion", "PrivacyNotice", "TermsOfService", "BundleSubscription", "ActiveSubscription", "AuthenticationResponse", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
public final /* data */ class User {

    @JvmField
    private static final Ml[] $childSerializers;
    private final List<BundleSubscription> activeBundleSubscriptions;
    private final List<ActiveSubscription> activeSubscriptions;
    private final List<String> activeSubscriptionsIds;
    private final AuthenticationResponse authentication;
    private final Map<String, Integer> availableConsumableCredits;
    private final String id;
    private final List<String> nonConsumablesIds;
    private final PrivacyNotice privacyNotice;
    private final TermsOfService termsOfService;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00061"}, d2 = {"Lcom/bendingspoons/oracle/models/User$ActiveSubscription;", "", "", "id", "vendor", "", StatsEvent.f62824A, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/User$ActiveSubscription;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/bendingspoons/oracle/models/User$ActiveSubscription;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getVendor", "getVendor$annotations", "Ljava/lang/Long;", "getTimestamp", "getTimestamp$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Xo
    public static final /* data */ class ActiveSubscription {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final Long timestamp;
        private final String vendor;

        public /* synthetic */ class j implements vd {
            private static final Wre descriptor;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f51433n;
            public static final int rl;

            private j() {
            }

            static {
                j jVar = new j();
                f51433n = jVar;
                rl = 8;
                DC dc = new DC("com.bendingspoons.oracle.models.User.ActiveSubscription", jVar, 3);
                dc.HI("id", false);
                dc.HI("vendor", false);
                dc.HI(StatsEvent.f62824A, true);
                descriptor = dc;
            }

            @Override // Du.vd
            public final Ml[] childSerializers() {
                Ml mlZ = WY.j.Z(fg.f2014n);
                Y5 y5 = Y5.f2000n;
                return new Ml[]{y5, y5, mlZ};
            }

            @Override // XA.Ml, XA.eO, XA.w6
            public final Wre getDescriptor() {
                return descriptor;
            }

            @Override // XA.w6
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final ActiveSubscription deserialize(I28 decoder) {
                int i2;
                String str;
                String str2;
                Long l2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Wre wre = descriptor;
                w6 w6VarRl = decoder.rl(wre);
                String strIk = null;
                if (w6VarRl.HI()) {
                    String strIk2 = w6VarRl.Ik(wre, 0);
                    String strIk3 = w6VarRl.Ik(wre, 1);
                    str = strIk2;
                    l2 = (Long) w6VarRl.e(wre, 2, fg.f2014n, null);
                    str2 = strIk3;
                    i2 = 7;
                } else {
                    boolean z2 = true;
                    int i3 = 0;
                    String strIk4 = null;
                    Long l5 = null;
                    while (z2) {
                        int iNY = w6VarRl.nY(wre);
                        if (iNY == -1) {
                            z2 = false;
                        } else if (iNY == 0) {
                            strIk = w6VarRl.Ik(wre, 0);
                            i3 |= 1;
                        } else if (iNY == 1) {
                            strIk4 = w6VarRl.Ik(wre, 1);
                            i3 |= 2;
                        } else {
                            if (iNY != 2) {
                                throw new UnknownFieldException(iNY);
                            }
                            l5 = (Long) w6VarRl.e(wre, 2, fg.f2014n, l5);
                            i3 |= 4;
                        }
                    }
                    i2 = i3;
                    str = strIk;
                    str2 = strIk4;
                    l2 = l5;
                }
                w6VarRl.t(wre);
                return new ActiveSubscription(i2, str, str2, l2, (i) null);
            }

            @Override // XA.eO
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final void serialize(gi.Wre encoder, ActiveSubscription value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                Wre wre = descriptor;
                gi.Ml mlRl = encoder.rl(wre);
                ActiveSubscription.write$Self$oracle_release(value, mlRl, wre);
                mlRl.t(wre);
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$ActiveSubscription$n, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Ml serializer() {
                return j.f51433n;
            }
        }

        public /* synthetic */ ActiveSubscription(int i2, String str, String str2, Long l2, i iVar) {
            if (3 != (i2 & 3)) {
                g9.n(i2, 3, j.f51433n.getDescriptor());
            }
            this.id = str;
            this.vendor = str2;
            if ((i2 & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = l2;
            }
        }

        public static /* synthetic */ ActiveSubscription copy$default(ActiveSubscription activeSubscription, String str, String str2, Long l2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = activeSubscription.id;
            }
            if ((i2 & 2) != 0) {
                str2 = activeSubscription.vendor;
            }
            if ((i2 & 4) != 0) {
                l2 = activeSubscription.timestamp;
            }
            return activeSubscription.copy(str, str2, l2);
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static /* synthetic */ void getVendor$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVendor() {
            return this.vendor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        public final ActiveSubscription copy(@Json(name = "id") String id, @Json(name = "vendor") String vendor, @Json(name = StatsEvent.f62824A) Long timestamp) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(vendor, "vendor");
            return new ActiveSubscription(id, vendor, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveSubscription)) {
                return false;
            }
            ActiveSubscription activeSubscription = (ActiveSubscription) other;
            return Intrinsics.areEqual(this.id, activeSubscription.id) && Intrinsics.areEqual(this.vendor, activeSubscription.vendor) && Intrinsics.areEqual(this.timestamp, activeSubscription.timestamp);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.vendor.hashCode()) * 31;
            Long l2 = this.timestamp;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        public String toString() {
            return "ActiveSubscription(id=" + this.id + ", vendor=" + this.vendor + ", timestamp=" + this.timestamp + ")";
        }

        public ActiveSubscription(@Json(name = "id") String id, @Json(name = "vendor") String vendor, @Json(name = StatsEvent.f62824A) Long l2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(vendor, "vendor");
            this.id = id;
            this.vendor = vendor;
            this.timestamp = l2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$oracle_release(ActiveSubscription self, gi.Ml output, Wre serialDesc) {
            output.O(serialDesc, 0, self.id);
            output.O(serialDesc, 1, self.vendor);
            if (!output.r(serialDesc, 2) && self.timestamp == null) {
                return;
            }
            output.X(serialDesc, 2, fg.f2014n, self.timestamp);
        }

        public final String getId() {
            return this.id;
        }

        public final Long getTimestamp() {
            return this.timestamp;
        }

        public final String getVendor() {
            return this.vendor;
        }

        public /* synthetic */ ActiveSubscription(String str, String str2, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : l2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00061"}, d2 = {"Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;", "", "Lcom/bendingspoons/oracle/models/IdentityToken;", "identityToken", "", "authUrl", "refreshToken", "<init>", "(Lcom/bendingspoons/oracle/models/IdentityToken;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILcom/bendingspoons/oracle/models/IdentityToken;Ljava/lang/String;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Lcom/bendingspoons/oracle/models/IdentityToken;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/bendingspoons/oracle/models/IdentityToken;Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/bendingspoons/oracle/models/IdentityToken;", "getIdentityToken", "getIdentityToken$annotations", "()V", "Ljava/lang/String;", "getAuthUrl", "getAuthUrl$annotations", "getRefreshToken", "getRefreshToken$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Xo
    public static final /* data */ class AuthenticationResponse {
        private final String authUrl;
        private final IdentityToken identityToken;
        private final String refreshToken;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ class j implements vd {
            private static final Wre descriptor;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f51434n;
            public static final int rl;

            private j() {
            }

            static {
                j jVar = new j();
                f51434n = jVar;
                rl = 8;
                DC dc = new DC("com.bendingspoons.oracle.models.User.AuthenticationResponse", jVar, 3);
                dc.HI("identity_token", false);
                dc.HI("auth_url", false);
                dc.HI("refresh_token", true);
                descriptor = dc;
            }

            @Override // Du.vd
            public final Ml[] childSerializers() {
                Y5 y5 = Y5.f2000n;
                return new Ml[]{com.bendingspoons.oracle.models.j.f51439n, y5, WY.j.Z(y5)};
            }

            @Override // XA.Ml, XA.eO, XA.w6
            public final Wre getDescriptor() {
                return descriptor;
            }

            @Override // XA.w6
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final AuthenticationResponse deserialize(I28 decoder) {
                int i2;
                IdentityToken identityToken;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Wre wre = descriptor;
                w6 w6VarRl = decoder.rl(wre);
                IdentityToken identityToken2 = null;
                if (w6VarRl.HI()) {
                    IdentityToken identityToken3 = (IdentityToken) w6VarRl.fD(wre, 0, com.bendingspoons.oracle.models.j.f51439n, null);
                    String strIk = w6VarRl.Ik(wre, 1);
                    identityToken = identityToken3;
                    str2 = (String) w6VarRl.e(wre, 2, Y5.f2000n, null);
                    str = strIk;
                    i2 = 7;
                } else {
                    boolean z2 = true;
                    int i3 = 0;
                    String strIk2 = null;
                    String str3 = null;
                    while (z2) {
                        int iNY = w6VarRl.nY(wre);
                        if (iNY == -1) {
                            z2 = false;
                        } else if (iNY == 0) {
                            identityToken2 = (IdentityToken) w6VarRl.fD(wre, 0, com.bendingspoons.oracle.models.j.f51439n, identityToken2);
                            i3 |= 1;
                        } else if (iNY == 1) {
                            strIk2 = w6VarRl.Ik(wre, 1);
                            i3 |= 2;
                        } else {
                            if (iNY != 2) {
                                throw new UnknownFieldException(iNY);
                            }
                            str3 = (String) w6VarRl.e(wre, 2, Y5.f2000n, str3);
                            i3 |= 4;
                        }
                    }
                    i2 = i3;
                    identityToken = identityToken2;
                    str = strIk2;
                    str2 = str3;
                }
                w6VarRl.t(wre);
                return new AuthenticationResponse(i2, identityToken, str, str2, (i) null);
            }

            @Override // XA.eO
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final void serialize(gi.Wre encoder, AuthenticationResponse value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                Wre wre = descriptor;
                gi.Ml mlRl = encoder.rl(wre);
                AuthenticationResponse.write$Self$oracle_release(value, mlRl, wre);
                mlRl.t(wre);
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$AuthenticationResponse$n, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Ml serializer() {
                return j.f51434n;
            }
        }

        public /* synthetic */ AuthenticationResponse(int i2, IdentityToken identityToken, String str, String str2, i iVar) {
            if (3 != (i2 & 3)) {
                g9.n(i2, 3, j.f51434n.getDescriptor());
            }
            this.identityToken = identityToken;
            this.authUrl = str;
            if ((i2 & 4) == 0) {
                this.refreshToken = null;
            } else {
                this.refreshToken = str2;
            }
        }

        public static /* synthetic */ AuthenticationResponse copy$default(AuthenticationResponse authenticationResponse, IdentityToken identityToken, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                identityToken = authenticationResponse.identityToken;
            }
            if ((i2 & 2) != 0) {
                str = authenticationResponse.authUrl;
            }
            if ((i2 & 4) != 0) {
                str2 = authenticationResponse.refreshToken;
            }
            return authenticationResponse.copy(identityToken, str, str2);
        }

        public static /* synthetic */ void getAuthUrl$annotations() {
        }

        public static /* synthetic */ void getIdentityToken$annotations() {
        }

        public static /* synthetic */ void getRefreshToken$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IdentityToken getIdentityToken() {
            return this.identityToken;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAuthUrl() {
            return this.authUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final AuthenticationResponse copy(@Json(name = "identity_token") IdentityToken identityToken, @Json(name = "auth_url") String authUrl, @Json(name = "refresh_token") String refreshToken) {
            Intrinsics.checkNotNullParameter(identityToken, "identityToken");
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            return new AuthenticationResponse(identityToken, authUrl, refreshToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthenticationResponse)) {
                return false;
            }
            AuthenticationResponse authenticationResponse = (AuthenticationResponse) other;
            return Intrinsics.areEqual(this.identityToken, authenticationResponse.identityToken) && Intrinsics.areEqual(this.authUrl, authenticationResponse.authUrl) && Intrinsics.areEqual(this.refreshToken, authenticationResponse.refreshToken);
        }

        public int hashCode() {
            int iHashCode = ((this.identityToken.hashCode() * 31) + this.authUrl.hashCode()) * 31;
            String str = this.refreshToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AuthenticationResponse(identityToken=" + this.identityToken + ", authUrl=" + this.authUrl + ", refreshToken=" + this.refreshToken + ")";
        }

        public AuthenticationResponse(@Json(name = "identity_token") IdentityToken identityToken, @Json(name = "auth_url") String authUrl, @Json(name = "refresh_token") String str) {
            Intrinsics.checkNotNullParameter(identityToken, "identityToken");
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            this.identityToken = identityToken;
            this.authUrl = authUrl;
            this.refreshToken = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$oracle_release(AuthenticationResponse self, gi.Ml output, Wre serialDesc) {
            output.S(serialDesc, 0, com.bendingspoons.oracle.models.j.f51439n, self.identityToken);
            output.O(serialDesc, 1, self.authUrl);
            if (!output.r(serialDesc, 2) && self.refreshToken == null) {
                return;
            }
            output.X(serialDesc, 2, Y5.f2000n, self.refreshToken);
        }

        public final String getAuthUrl() {
            return this.authUrl;
        }

        public final IdentityToken getIdentityToken() {
            return this.identityToken;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public /* synthetic */ AuthenticationResponse(IdentityToken identityToken, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(identityToken, str, (i2 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001b¨\u00065"}, d2 = {"Lcom/bendingspoons/oracle/models/User$BundleSubscription;", "", "", "", "features", "expiry", "productId", "planId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/User$BundleSubscription;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/oracle/models/User$BundleSubscription;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFeatures", "getFeatures$annotations", "()V", "Ljava/lang/String;", "getExpiry", "getExpiry$annotations", "getProductId", "getProductId$annotations", "getPlanId", "getPlanId$annotations", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Xo
    public static final /* data */ class BundleSubscription {
        private final String expiry;
        private final List<String> features;
        private final String planId;
        private final String productId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @JvmField
        private static final Ml[] $childSerializers = {new Du.Wre(Y5.f2000n), null, null, null};

        public /* synthetic */ class j implements vd {
            private static final Wre descriptor;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f51435n;
            public static final int rl;

            private j() {
            }

            static {
                j jVar = new j();
                f51435n = jVar;
                rl = 8;
                DC dc = new DC("com.bendingspoons.oracle.models.User.BundleSubscription", jVar, 4);
                dc.HI("features", true);
                dc.HI("expiry", true);
                dc.HI("product_id", true);
                dc.HI("plan_id", true);
                descriptor = dc;
            }

            @Override // XA.Ml, XA.eO, XA.w6
            public final Wre getDescriptor() {
                return descriptor;
            }

            @Override // XA.w6
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final BundleSubscription deserialize(I28 decoder) {
                int i2;
                List list;
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Wre wre = descriptor;
                w6 w6VarRl = decoder.rl(wre);
                Ml[] mlArr = BundleSubscription.$childSerializers;
                List list2 = null;
                if (w6VarRl.HI()) {
                    List list3 = (List) w6VarRl.fD(wre, 0, mlArr[0], null);
                    String strIk = w6VarRl.Ik(wre, 1);
                    String strIk2 = w6VarRl.Ik(wre, 2);
                    list = list3;
                    str = strIk;
                    str3 = (String) w6VarRl.e(wre, 3, Y5.f2000n, null);
                    str2 = strIk2;
                    i2 = 15;
                } else {
                    boolean z2 = true;
                    int i3 = 0;
                    String strIk3 = null;
                    String strIk4 = null;
                    String str4 = null;
                    while (z2) {
                        int iNY = w6VarRl.nY(wre);
                        if (iNY == -1) {
                            z2 = false;
                        } else if (iNY == 0) {
                            list2 = (List) w6VarRl.fD(wre, 0, mlArr[0], list2);
                            i3 |= 1;
                        } else if (iNY == 1) {
                            strIk3 = w6VarRl.Ik(wre, 1);
                            i3 |= 2;
                        } else if (iNY == 2) {
                            strIk4 = w6VarRl.Ik(wre, 2);
                            i3 |= 4;
                        } else {
                            if (iNY != 3) {
                                throw new UnknownFieldException(iNY);
                            }
                            str4 = (String) w6VarRl.e(wre, 3, Y5.f2000n, str4);
                            i3 |= 8;
                        }
                    }
                    i2 = i3;
                    list = list2;
                    str = strIk3;
                    str2 = strIk4;
                    str3 = str4;
                }
                w6VarRl.t(wre);
                return new BundleSubscription(i2, list, str, str2, str3, (i) null);
            }

            @Override // XA.eO
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final void serialize(gi.Wre encoder, BundleSubscription value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                Wre wre = descriptor;
                gi.Ml mlRl = encoder.rl(wre);
                BundleSubscription.write$Self$oracle_release(value, mlRl, wre);
                mlRl.t(wre);
            }

            @Override // Du.vd
            public final Ml[] childSerializers() {
                Ml ml = BundleSubscription.$childSerializers[0];
                Y5 y5 = Y5.f2000n;
                return new Ml[]{ml, y5, y5, WY.j.Z(y5)};
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$BundleSubscription$n, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Ml serializer() {
                return j.f51435n;
            }
        }

        public BundleSubscription() {
            this((List) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BundleSubscription copy$default(BundleSubscription bundleSubscription, List list, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = bundleSubscription.features;
            }
            if ((i2 & 2) != 0) {
                str = bundleSubscription.expiry;
            }
            if ((i2 & 4) != 0) {
                str2 = bundleSubscription.productId;
            }
            if ((i2 & 8) != 0) {
                str3 = bundleSubscription.planId;
            }
            return bundleSubscription.copy(list, str, str2, str3);
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getFeatures$annotations() {
        }

        public static /* synthetic */ void getPlanId$annotations() {
        }

        public static /* synthetic */ void getProductId$annotations() {
        }

        public final List<String> component1() {
            return this.features;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExpiry() {
            return this.expiry;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public final BundleSubscription copy(@Json(name = "features") List<String> features, @Json(name = "expiry") String expiry, @Json(name = "product_id") String productId, @Json(name = "plan_id") String planId) {
            Intrinsics.checkNotNullParameter(features, "features");
            Intrinsics.checkNotNullParameter(expiry, "expiry");
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new BundleSubscription(features, expiry, productId, planId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BundleSubscription)) {
                return false;
            }
            BundleSubscription bundleSubscription = (BundleSubscription) other;
            return Intrinsics.areEqual(this.features, bundleSubscription.features) && Intrinsics.areEqual(this.expiry, bundleSubscription.expiry) && Intrinsics.areEqual(this.productId, bundleSubscription.productId) && Intrinsics.areEqual(this.planId, bundleSubscription.planId);
        }

        public int hashCode() {
            int iHashCode = ((((this.features.hashCode() * 31) + this.expiry.hashCode()) * 31) + this.productId.hashCode()) * 31;
            String str = this.planId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "BundleSubscription(features=" + this.features + ", expiry=" + this.expiry + ", productId=" + this.productId + ", planId=" + this.planId + ")";
        }

        public /* synthetic */ BundleSubscription(int i2, List list, String str, String str2, String str3, i iVar) {
            this.features = (i2 & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i2 & 2) == 0) {
                this.expiry = "";
            } else {
                this.expiry = str;
            }
            if ((i2 & 4) == 0) {
                this.productId = "";
            } else {
                this.productId = str2;
            }
            if ((i2 & 8) == 0) {
                this.planId = null;
            } else {
                this.planId = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$oracle_release(BundleSubscription self, gi.Ml output, Wre serialDesc) {
            Ml[] mlArr = $childSerializers;
            if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.features, CollectionsKt.emptyList())) {
                output.S(serialDesc, 0, mlArr[0], self.features);
            }
            if (output.r(serialDesc, 1) || !Intrinsics.areEqual(self.expiry, "")) {
                output.O(serialDesc, 1, self.expiry);
            }
            if (output.r(serialDesc, 2) || !Intrinsics.areEqual(self.productId, "")) {
                output.O(serialDesc, 2, self.productId);
            }
            if (!output.r(serialDesc, 3) && self.planId == null) {
                return;
            }
            output.X(serialDesc, 3, Y5.f2000n, self.planId);
        }

        public final String getExpiry() {
            return this.expiry;
        }

        public final List<String> getFeatures() {
            return this.features;
        }

        public final String getPlanId() {
            return this.planId;
        }

        public final String getProductId() {
            return this.productId;
        }

        public BundleSubscription(@Json(name = "features") List<String> features, @Json(name = "expiry") String expiry, @Json(name = "product_id") String productId, @Json(name = "plan_id") String str) {
            Intrinsics.checkNotNullParameter(features, "features");
            Intrinsics.checkNotNullParameter(expiry, "expiry");
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.features = features;
            this.expiry = expiry;
            this.productId = productId;
            this.planId = str;
        }

        public /* synthetic */ BundleSubscription(List list, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00042345B-\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b-\u0010+\u001a\u0004\b\u0005\u0010\u001cR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001e¨\u00066"}, d2 = {"Lcom/bendingspoons/oracle/models/User$PrivacyNotice;", "", "", "lastAcknowledgedVersion", "Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;", "isAtLeast16", "", "Lcom/bendingspoons/oracle/models/User$PrivacyNotice$Consent;", "requiredConsents", "<init>", "(Ljava/lang/String;Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;Ljava/util/List;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;Ljava/util/List;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/User$PrivacyNotice;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;Ljava/util/List;)Lcom/bendingspoons/oracle/models/User$PrivacyNotice;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLastAcknowledgedVersion", "getLastAcknowledgedVersion$annotations", "()V", "Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;", "isAtLeast16$annotations", "Ljava/util/List;", "getRequiredConsents", "getRequiredConsents$annotations", "Companion", "IsAtLeast16", "Consent", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Xo
    public static final /* data */ class PrivacyNotice {
        private final IsAtLeast16 isAtLeast16;
        private final String lastAcknowledgedVersion;
        private final List<Consent> requiredConsents;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @JvmField
        private static final Ml[] $childSerializers = {null, IsAtLeast16.INSTANCE.serializer(), new Du.Wre(Consent.INSTANCE.serializer())};

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bendingspoons/oracle/models/User$PrivacyNotice$Consent;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "j", "BSP_MARKETING", "THIRD_PARTY_MARKETING", "PROFILING", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Xo
        public static final class Consent {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Consent[] $VALUES;
            private static final Lazy<Ml> $cachedSerializer$delegate;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;

            @Json(name = "bsp_marketing")
            public static final Consent BSP_MARKETING = new Consent("BSP_MARKETING", 0);

            @Json(name = "third_party_marketing")
            public static final Consent THIRD_PARTY_MARKETING = new Consent("THIRD_PARTY_MARKETING", 1);

            @Json(name = "profiling")
            public static final Consent PROFILING = new Consent("PROFILING", 2);

            /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$PrivacyNotice$Consent$j, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ Ml n() {
                    return (Ml) Consent.$cachedSerializer$delegate.getValue();
                }

                public final Ml serializer() {
                    return n();
                }
            }

            private static final /* synthetic */ Consent[] $values() {
                return new Consent[]{BSP_MARKETING, THIRD_PARTY_MARKETING, PROFILING};
            }

            public static EnumEntries<Consent> getEntries() {
                return $ENTRIES;
            }

            static {
                Consent[] consentArr$values = $values();
                $VALUES = consentArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(consentArr$values);
                INSTANCE = new Companion(null);
                $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: KPz.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return User.PrivacyNotice.Consent._init_$_anonymous_();
                    }
                });
            }

            public static Consent valueOf(String str) {
                return (Consent) Enum.valueOf(Consent.class, str);
            }

            public static Consent[] values() {
                return (Consent[]) $VALUES.clone();
            }

            private Consent(String str, int i2) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Ml _init_$_anonymous_() {
                return lej.n("com.bendingspoons.oracle.models.User.PrivacyNotice.Consent", values(), new String[]{"bsp_marketing", "third_party_marketing", "profiling"}, new Annotation[][]{null, null, null}, null);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bendingspoons/oracle/models/User$PrivacyNotice$IsAtLeast16;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "j", "YES", "NO", "UNKNOWN", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Xo
        public static final class IsAtLeast16 {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IsAtLeast16[] $VALUES;
            private static final Lazy<Ml> $cachedSerializer$delegate;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;

            @Json(name = "yes")
            public static final IsAtLeast16 YES = new IsAtLeast16("YES", 0);

            @Json(name = "no")
            public static final IsAtLeast16 NO = new IsAtLeast16("NO", 1);

            @Json(name = "unknown")
            public static final IsAtLeast16 UNKNOWN = new IsAtLeast16("UNKNOWN", 2);

            /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$PrivacyNotice$IsAtLeast16$j, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ Ml n() {
                    return (Ml) IsAtLeast16.$cachedSerializer$delegate.getValue();
                }

                public final Ml serializer() {
                    return n();
                }
            }

            private static final /* synthetic */ IsAtLeast16[] $values() {
                return new IsAtLeast16[]{YES, NO, UNKNOWN};
            }

            public static EnumEntries<IsAtLeast16> getEntries() {
                return $ENTRIES;
            }

            static {
                IsAtLeast16[] isAtLeast16Arr$values = $values();
                $VALUES = isAtLeast16Arr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(isAtLeast16Arr$values);
                INSTANCE = new Companion(null);
                $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: KPz.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return User.PrivacyNotice.IsAtLeast16._init_$_anonymous_();
                    }
                });
            }

            public static IsAtLeast16 valueOf(String str) {
                return (IsAtLeast16) Enum.valueOf(IsAtLeast16.class, str);
            }

            public static IsAtLeast16[] values() {
                return (IsAtLeast16[]) $VALUES.clone();
            }

            private IsAtLeast16(String str, int i2) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Ml _init_$_anonymous_() {
                return lej.n("com.bendingspoons.oracle.models.User.PrivacyNotice.IsAtLeast16", values(), new String[]{"yes", "no", "unknown"}, new Annotation[][]{null, null, null}, null);
            }
        }

        public /* synthetic */ class j implements vd {
            private static final Wre descriptor;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f51436n;
            public static final int rl;

            private j() {
            }

            static {
                j jVar = new j();
                f51436n = jVar;
                rl = 8;
                DC dc = new DC("com.bendingspoons.oracle.models.User.PrivacyNotice", jVar, 3);
                dc.HI("last_acknowledged_version", true);
                dc.HI("is_at_least_16", true);
                dc.HI("required_consents", true);
                descriptor = dc;
            }

            @Override // XA.Ml, XA.eO, XA.w6
            public final Wre getDescriptor() {
                return descriptor;
            }

            @Override // XA.w6
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final PrivacyNotice deserialize(I28 decoder) {
                int i2;
                String str;
                IsAtLeast16 isAtLeast16;
                List list;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Wre wre = descriptor;
                w6 w6VarRl = decoder.rl(wre);
                Ml[] mlArr = PrivacyNotice.$childSerializers;
                String str2 = null;
                if (w6VarRl.HI()) {
                    String str3 = (String) w6VarRl.e(wre, 0, Y5.f2000n, null);
                    IsAtLeast16 isAtLeast162 = (IsAtLeast16) w6VarRl.fD(wre, 1, mlArr[1], null);
                    list = (List) w6VarRl.fD(wre, 2, mlArr[2], null);
                    str = str3;
                    i2 = 7;
                    isAtLeast16 = isAtLeast162;
                } else {
                    boolean z2 = true;
                    int i3 = 0;
                    IsAtLeast16 isAtLeast163 = null;
                    List list2 = null;
                    while (z2) {
                        int iNY = w6VarRl.nY(wre);
                        if (iNY == -1) {
                            z2 = false;
                        } else if (iNY == 0) {
                            str2 = (String) w6VarRl.e(wre, 0, Y5.f2000n, str2);
                            i3 |= 1;
                        } else if (iNY == 1) {
                            isAtLeast163 = (IsAtLeast16) w6VarRl.fD(wre, 1, mlArr[1], isAtLeast163);
                            i3 |= 2;
                        } else {
                            if (iNY != 2) {
                                throw new UnknownFieldException(iNY);
                            }
                            list2 = (List) w6VarRl.fD(wre, 2, mlArr[2], list2);
                            i3 |= 4;
                        }
                    }
                    i2 = i3;
                    str = str2;
                    isAtLeast16 = isAtLeast163;
                    list = list2;
                }
                w6VarRl.t(wre);
                return new PrivacyNotice(i2, str, isAtLeast16, list, (i) null);
            }

            @Override // XA.eO
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final void serialize(gi.Wre encoder, PrivacyNotice value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                Wre wre = descriptor;
                gi.Ml mlRl = encoder.rl(wre);
                PrivacyNotice.write$Self$oracle_release(value, mlRl, wre);
                mlRl.t(wre);
            }

            @Override // Du.vd
            public final Ml[] childSerializers() {
                Ml[] mlArr = PrivacyNotice.$childSerializers;
                return new Ml[]{WY.j.Z(Y5.f2000n), mlArr[1], mlArr[2]};
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$PrivacyNotice$n, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Ml serializer() {
                return j.f51436n;
            }
        }

        public PrivacyNotice() {
            this((String) null, (IsAtLeast16) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PrivacyNotice copy$default(PrivacyNotice privacyNotice, String str, IsAtLeast16 isAtLeast16, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = privacyNotice.lastAcknowledgedVersion;
            }
            if ((i2 & 2) != 0) {
                isAtLeast16 = privacyNotice.isAtLeast16;
            }
            if ((i2 & 4) != 0) {
                list = privacyNotice.requiredConsents;
            }
            return privacyNotice.copy(str, isAtLeast16, list);
        }

        public static /* synthetic */ void getLastAcknowledgedVersion$annotations() {
        }

        public static /* synthetic */ void getRequiredConsents$annotations() {
        }

        public static /* synthetic */ void isAtLeast16$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLastAcknowledgedVersion() {
            return this.lastAcknowledgedVersion;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IsAtLeast16 getIsAtLeast16() {
            return this.isAtLeast16;
        }

        public final List<Consent> component3() {
            return this.requiredConsents;
        }

        public final PrivacyNotice copy(@Json(name = "last_acknowledged_version") String lastAcknowledgedVersion, @Json(name = "is_at_least_16") IsAtLeast16 isAtLeast16, @Json(name = "required_consents") List<? extends Consent> requiredConsents) {
            Intrinsics.checkNotNullParameter(isAtLeast16, "isAtLeast16");
            Intrinsics.checkNotNullParameter(requiredConsents, "requiredConsents");
            return new PrivacyNotice(lastAcknowledgedVersion, isAtLeast16, requiredConsents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrivacyNotice)) {
                return false;
            }
            PrivacyNotice privacyNotice = (PrivacyNotice) other;
            return Intrinsics.areEqual(this.lastAcknowledgedVersion, privacyNotice.lastAcknowledgedVersion) && this.isAtLeast16 == privacyNotice.isAtLeast16 && Intrinsics.areEqual(this.requiredConsents, privacyNotice.requiredConsents);
        }

        public int hashCode() {
            String str = this.lastAcknowledgedVersion;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.isAtLeast16.hashCode()) * 31) + this.requiredConsents.hashCode();
        }

        public String toString() {
            return "PrivacyNotice(lastAcknowledgedVersion=" + this.lastAcknowledgedVersion + ", isAtLeast16=" + this.isAtLeast16 + ", requiredConsents=" + this.requiredConsents + ")";
        }

        public /* synthetic */ PrivacyNotice(int i2, String str, IsAtLeast16 isAtLeast16, List list, i iVar) {
            this.lastAcknowledgedVersion = (i2 & 1) == 0 ? null : str;
            if ((i2 & 2) == 0) {
                this.isAtLeast16 = IsAtLeast16.UNKNOWN;
            } else {
                this.isAtLeast16 = isAtLeast16;
            }
            if ((i2 & 4) == 0) {
                this.requiredConsents = CollectionsKt.emptyList();
            } else {
                this.requiredConsents = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$oracle_release(PrivacyNotice self, gi.Ml output, Wre serialDesc) {
            Ml[] mlArr = $childSerializers;
            if (output.r(serialDesc, 0) || self.lastAcknowledgedVersion != null) {
                output.X(serialDesc, 0, Y5.f2000n, self.lastAcknowledgedVersion);
            }
            if (output.r(serialDesc, 1) || self.isAtLeast16 != IsAtLeast16.UNKNOWN) {
                output.S(serialDesc, 1, mlArr[1], self.isAtLeast16);
            }
            if (!output.r(serialDesc, 2) && Intrinsics.areEqual(self.requiredConsents, CollectionsKt.emptyList())) {
                return;
            }
            output.S(serialDesc, 2, mlArr[2], self.requiredConsents);
        }

        public final String getLastAcknowledgedVersion() {
            return this.lastAcknowledgedVersion;
        }

        public final List<Consent> getRequiredConsents() {
            return this.requiredConsents;
        }

        public final IsAtLeast16 isAtLeast16() {
            return this.isAtLeast16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrivacyNotice(@Json(name = "last_acknowledged_version") String str, @Json(name = "is_at_least_16") IsAtLeast16 isAtLeast16, @Json(name = "required_consents") List<? extends Consent> requiredConsents) {
            Intrinsics.checkNotNullParameter(isAtLeast16, "isAtLeast16");
            Intrinsics.checkNotNullParameter(requiredConsents, "requiredConsents");
            this.lastAcknowledgedVersion = str;
            this.isAtLeast16 = isAtLeast16;
            this.requiredConsents = requiredConsents;
        }

        public /* synthetic */ PrivacyNotice(String str, IsAtLeast16 isAtLeast16, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? IsAtLeast16.UNKNOWN : isAtLeast16, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/bendingspoons/oracle/models/User$TermsOfService;", "", "", "lastAcceptedVersion", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/lang/String;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "write$Self$oracle_release", "(Lcom/bendingspoons/oracle/models/User$TermsOfService;Lgi/Ml;LEJn/Wre;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bendingspoons/oracle/models/User$TermsOfService;", "toString", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLastAcceptedVersion", "getLastAcceptedVersion$annotations", "()V", "Companion", "j", c.f62177j, "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Xo
    public static final /* data */ class TermsOfService {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String lastAcceptedVersion;

        public /* synthetic */ class j implements vd {
            private static final Wre descriptor;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f51437n;
            public static final int rl;

            private j() {
            }

            static {
                j jVar = new j();
                f51437n = jVar;
                rl = 8;
                DC dc = new DC("com.bendingspoons.oracle.models.User.TermsOfService", jVar, 1);
                dc.HI("last_accepted_version", true);
                descriptor = dc;
            }

            @Override // Du.vd
            public final Ml[] childSerializers() {
                return new Ml[]{WY.j.Z(Y5.f2000n)};
            }

            @Override // XA.Ml, XA.eO, XA.w6
            public final Wre getDescriptor() {
                return descriptor;
            }

            @Override // XA.w6
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final TermsOfService deserialize(I28 decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                Wre wre = descriptor;
                w6 w6VarRl = decoder.rl(wre);
                int i2 = 1;
                i iVar = null;
                if (w6VarRl.HI()) {
                    str = (String) w6VarRl.e(wre, 0, Y5.f2000n, null);
                } else {
                    boolean z2 = true;
                    int i3 = 0;
                    str = null;
                    while (z2) {
                        int iNY = w6VarRl.nY(wre);
                        if (iNY == -1) {
                            z2 = false;
                        } else {
                            if (iNY != 0) {
                                throw new UnknownFieldException(iNY);
                            }
                            str = (String) w6VarRl.e(wre, 0, Y5.f2000n, str);
                            i3 = 1;
                        }
                    }
                    i2 = i3;
                }
                w6VarRl.t(wre);
                return new TermsOfService(i2, str, iVar);
            }

            @Override // XA.eO
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final void serialize(gi.Wre encoder, TermsOfService value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                Wre wre = descriptor;
                gi.Ml mlRl = encoder.rl(wre);
                TermsOfService.write$Self$oracle_release(value, mlRl, wre);
                mlRl.t(wre);
            }
        }

        /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$TermsOfService$n, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Ml serializer() {
                return j.f51437n;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TermsOfService() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ TermsOfService copy$default(TermsOfService termsOfService, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = termsOfService.lastAcceptedVersion;
            }
            return termsOfService.copy(str);
        }

        public static /* synthetic */ void getLastAcceptedVersion$annotations() {
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$oracle_release(TermsOfService self, gi.Ml output, Wre serialDesc) {
            if (!output.r(serialDesc, 0) && self.lastAcceptedVersion == null) {
                return;
            }
            output.X(serialDesc, 0, Y5.f2000n, self.lastAcceptedVersion);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLastAcceptedVersion() {
            return this.lastAcceptedVersion;
        }

        public final TermsOfService copy(@Json(name = "last_accepted_version") String lastAcceptedVersion) {
            return new TermsOfService(lastAcceptedVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TermsOfService) && Intrinsics.areEqual(this.lastAcceptedVersion, ((TermsOfService) other).lastAcceptedVersion);
        }

        public int hashCode() {
            String str = this.lastAcceptedVersion;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TermsOfService(lastAcceptedVersion=" + this.lastAcceptedVersion + ")";
        }

        public /* synthetic */ TermsOfService(int i2, String str, i iVar) {
            if ((i2 & 1) == 0) {
                this.lastAcceptedVersion = null;
            } else {
                this.lastAcceptedVersion = str;
            }
        }

        public final String getLastAcceptedVersion() {
            return this.lastAcceptedVersion;
        }

        public TermsOfService(@Json(name = "last_accepted_version") String str) {
            this.lastAcceptedVersion = str;
        }

        public /* synthetic */ TermsOfService(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class j implements vd {
        private static final Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f51438n;
        public static final int rl;

        private j() {
        }

        static {
            j jVar = new j();
            f51438n = jVar;
            rl = 8;
            DC dc = new DC("com.bendingspoons.oracle.models.User", jVar, 9);
            dc.HI("unique_id", true);
            dc.HI("active_subscriptions_ids", true);
            dc.HI("privacy_notice", true);
            dc.HI("terms_of_service", true);
            dc.HI("available_consumable_credits", true);
            dc.HI("non_consumables_ids", true);
            dc.HI("active_bundle_subscriptions", true);
            dc.HI("active_subscriptions", true);
            dc.HI("authentication", true);
            descriptor = dc;
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final User deserialize(I28 decoder) {
            int i2;
            List list;
            List list2;
            AuthenticationResponse authenticationResponse;
            List list3;
            Map map;
            TermsOfService termsOfService;
            String str;
            List list4;
            PrivacyNotice privacyNotice;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Wre wre = descriptor;
            w6 w6VarRl = decoder.rl(wre);
            Ml[] mlArr = User.$childSerializers;
            int i3 = 8;
            int i5 = 6;
            String strIk = null;
            if (w6VarRl.HI()) {
                String strIk2 = w6VarRl.Ik(wre, 0);
                List list5 = (List) w6VarRl.fD(wre, 1, mlArr[1], null);
                PrivacyNotice privacyNotice2 = (PrivacyNotice) w6VarRl.fD(wre, 2, PrivacyNotice.j.f51436n, null);
                TermsOfService termsOfService2 = (TermsOfService) w6VarRl.fD(wre, 3, TermsOfService.j.f51437n, null);
                Map map2 = (Map) w6VarRl.fD(wre, 4, mlArr[4], null);
                List list6 = (List) w6VarRl.fD(wre, 5, mlArr[5], null);
                List list7 = (List) w6VarRl.fD(wre, 6, mlArr[6], null);
                list3 = (List) w6VarRl.fD(wre, 7, mlArr[7], null);
                str = strIk2;
                termsOfService = termsOfService2;
                authenticationResponse = (AuthenticationResponse) w6VarRl.e(wre, 8, AuthenticationResponse.j.f51434n, null);
                privacyNotice = privacyNotice2;
                i2 = 511;
                list = list7;
                list2 = list6;
                map = map2;
                list4 = list5;
            } else {
                int i7 = 5;
                int i8 = 4;
                boolean z2 = true;
                int i9 = 0;
                List list8 = null;
                List list9 = null;
                AuthenticationResponse authenticationResponse2 = null;
                List list10 = null;
                Map map3 = null;
                TermsOfService termsOfService3 = null;
                List list11 = null;
                PrivacyNotice privacyNotice3 = null;
                while (z2) {
                    int i10 = i5;
                    int iNY = w6VarRl.nY(wre);
                    switch (iNY) {
                        case -1:
                            z2 = false;
                            i5 = 6;
                            i8 = 4;
                            i7 = 5;
                            break;
                        case 0:
                            strIk = w6VarRl.Ik(wre, 0);
                            i9 |= 1;
                            i3 = 8;
                            i5 = 6;
                            i8 = 4;
                            i7 = 5;
                            break;
                        case 1:
                            list11 = (List) w6VarRl.fD(wre, 1, mlArr[1], list11);
                            i9 |= 2;
                            i3 = 8;
                            i5 = 6;
                            i8 = 4;
                            i7 = 5;
                            break;
                        case 2:
                            privacyNotice3 = (PrivacyNotice) w6VarRl.fD(wre, 2, PrivacyNotice.j.f51436n, privacyNotice3);
                            i9 |= 4;
                            i3 = 8;
                            i5 = 6;
                            i8 = 4;
                            i7 = 5;
                            break;
                        case 3:
                            termsOfService3 = (TermsOfService) w6VarRl.fD(wre, 3, TermsOfService.j.f51437n, termsOfService3);
                            i9 |= 8;
                            i3 = 8;
                            i5 = 6;
                            i8 = 4;
                            i7 = 5;
                            break;
                        case 4:
                            map3 = (Map) w6VarRl.fD(wre, i8, mlArr[i8], map3);
                            i9 |= 16;
                            i3 = 8;
                            i5 = 6;
                            i7 = 5;
                            break;
                        case 5:
                            list9 = (List) w6VarRl.fD(wre, i7, mlArr[i7], list9);
                            i9 |= 32;
                            i3 = 8;
                            i5 = 6;
                            break;
                        case 6:
                            list8 = (List) w6VarRl.fD(wre, i10, mlArr[i10], list8);
                            i9 |= 64;
                            i5 = i10;
                            i3 = 8;
                            break;
                        case 7:
                            list10 = (List) w6VarRl.fD(wre, 7, mlArr[7], list10);
                            i9 |= 128;
                            i5 = i10;
                            break;
                        case 8:
                            authenticationResponse2 = (AuthenticationResponse) w6VarRl.e(wre, i3, AuthenticationResponse.j.f51434n, authenticationResponse2);
                            i9 |= 256;
                            i5 = i10;
                            break;
                        default:
                            throw new UnknownFieldException(iNY);
                    }
                }
                i2 = i9;
                list = list8;
                list2 = list9;
                authenticationResponse = authenticationResponse2;
                list3 = list10;
                map = map3;
                termsOfService = termsOfService3;
                str = strIk;
                list4 = list11;
                privacyNotice = privacyNotice3;
            }
            w6VarRl.t(wre);
            return new User(i2, str, list4, privacyNotice, termsOfService, map, list2, list, list3, authenticationResponse, (i) null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, User value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            User.write$Self$oracle_release(value, mlRl, wre);
            mlRl.t(wre);
        }

        @Override // Du.vd
        public final Ml[] childSerializers() {
            Ml[] mlArr = User.$childSerializers;
            return new Ml[]{Y5.f2000n, mlArr[1], PrivacyNotice.j.f51436n, TermsOfService.j.f51437n, mlArr[4], mlArr[5], mlArr[6], mlArr[7], WY.j.Z(AuthenticationResponse.j.f51434n)};
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.oracle.models.User$n, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ml serializer() {
            return j.f51438n;
        }
    }

    public User() {
        this((String) null, (List) null, (PrivacyNotice) null, (TermsOfService) null, (Map) null, (List) null, (List) null, (List) null, (AuthenticationResponse) null, 511, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ User copy$default(User user, String str, List list, PrivacyNotice privacyNotice, TermsOfService termsOfService, Map map, List list2, List list3, List list4, AuthenticationResponse authenticationResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = user.id;
        }
        if ((i2 & 2) != 0) {
            list = user.activeSubscriptionsIds;
        }
        if ((i2 & 4) != 0) {
            privacyNotice = user.privacyNotice;
        }
        if ((i2 & 8) != 0) {
            termsOfService = user.termsOfService;
        }
        if ((i2 & 16) != 0) {
            map = user.availableConsumableCredits;
        }
        if ((i2 & 32) != 0) {
            list2 = user.nonConsumablesIds;
        }
        if ((i2 & 64) != 0) {
            list3 = user.activeBundleSubscriptions;
        }
        if ((i2 & 128) != 0) {
            list4 = user.activeSubscriptions;
        }
        if ((i2 & 256) != 0) {
            authenticationResponse = user.authentication;
        }
        List list5 = list4;
        AuthenticationResponse authenticationResponse2 = authenticationResponse;
        List list6 = list2;
        List list7 = list3;
        Map map2 = map;
        PrivacyNotice privacyNotice2 = privacyNotice;
        return user.copy(str, list, privacyNotice2, termsOfService, map2, list6, list7, list5, authenticationResponse2);
    }

    public static /* synthetic */ void getActiveBundleSubscriptions$annotations() {
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    @Deprecated(message = "Use activeSubscriptions instead. This field will be removed in the future.", replaceWith = @ReplaceWith(expression = "activeSubscriptions", imports = {}))
    public static /* synthetic */ void getActiveSubscriptionsIds$annotations() {
    }

    public static /* synthetic */ void getAuthentication$annotations() {
    }

    public static /* synthetic */ void getAvailableConsumableCredits$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getNonConsumablesIds$annotations() {
    }

    public static /* synthetic */ void getPrivacyNotice$annotations() {
    }

    public static /* synthetic */ void getTermsOfService$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component2() {
        return this.activeSubscriptionsIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TermsOfService getTermsOfService() {
        return this.termsOfService;
    }

    public final Map<String, Integer> component5() {
        return this.availableConsumableCredits;
    }

    public final List<String> component6() {
        return this.nonConsumablesIds;
    }

    public final List<BundleSubscription> component7() {
        return this.activeBundleSubscriptions;
    }

    public final List<ActiveSubscription> component8() {
        return this.activeSubscriptions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AuthenticationResponse getAuthentication() {
        return this.authentication;
    }

    public final User copy(@Json(name = "unique_id") String id, @Json(name = "active_subscriptions_ids") List<String> activeSubscriptionsIds, @Json(name = "privacy_notice") PrivacyNotice privacyNotice, @Json(name = "terms_of_service") TermsOfService termsOfService, @Json(name = "available_consumable_credits") Map<String, Integer> availableConsumableCredits, @Json(name = "non_consumables_ids") List<String> nonConsumablesIds, @Json(name = "active_bundle_subscriptions") List<BundleSubscription> activeBundleSubscriptions, @Json(name = "active_subscriptions") List<ActiveSubscription> activeSubscriptions, @Json(name = "authentication") AuthenticationResponse authentication) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(activeSubscriptionsIds, "activeSubscriptionsIds");
        Intrinsics.checkNotNullParameter(privacyNotice, "privacyNotice");
        Intrinsics.checkNotNullParameter(termsOfService, "termsOfService");
        Intrinsics.checkNotNullParameter(availableConsumableCredits, "availableConsumableCredits");
        Intrinsics.checkNotNullParameter(nonConsumablesIds, HrvQKfmFZJudBc.JUYifjqUjxikNTS);
        Intrinsics.checkNotNullParameter(activeBundleSubscriptions, "activeBundleSubscriptions");
        Intrinsics.checkNotNullParameter(activeSubscriptions, "activeSubscriptions");
        return new User(id, activeSubscriptionsIds, privacyNotice, termsOfService, availableConsumableCredits, nonConsumablesIds, activeBundleSubscriptions, activeSubscriptions, authentication);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.activeSubscriptionsIds, user.activeSubscriptionsIds) && Intrinsics.areEqual(this.privacyNotice, user.privacyNotice) && Intrinsics.areEqual(this.termsOfService, user.termsOfService) && Intrinsics.areEqual(this.availableConsumableCredits, user.availableConsumableCredits) && Intrinsics.areEqual(this.nonConsumablesIds, user.nonConsumablesIds) && Intrinsics.areEqual(this.activeBundleSubscriptions, user.activeBundleSubscriptions) && Intrinsics.areEqual(this.activeSubscriptions, user.activeSubscriptions) && Intrinsics.areEqual(this.authentication, user.authentication);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.activeSubscriptionsIds.hashCode()) * 31) + this.privacyNotice.hashCode()) * 31) + this.termsOfService.hashCode()) * 31) + this.availableConsumableCredits.hashCode()) * 31) + this.nonConsumablesIds.hashCode()) * 31) + this.activeBundleSubscriptions.hashCode()) * 31) + this.activeSubscriptions.hashCode()) * 31;
        AuthenticationResponse authenticationResponse = this.authentication;
        return iHashCode + (authenticationResponse == null ? 0 : authenticationResponse.hashCode());
    }

    public String toString() {
        return "User(id=" + this.id + ", activeSubscriptionsIds=" + this.activeSubscriptionsIds + ", privacyNotice=" + this.privacyNotice + ", termsOfService=" + this.termsOfService + ", availableConsumableCredits=" + this.availableConsumableCredits + ", nonConsumablesIds=" + this.nonConsumablesIds + ", activeBundleSubscriptions=" + this.activeBundleSubscriptions + ", activeSubscriptions=" + this.activeSubscriptions + ", authentication=" + this.authentication + ")";
    }

    static {
        Y5 y5 = Y5.f2000n;
        $childSerializers = new Ml[]{null, new Du.Wre(y5), null, null, new mz(y5, iF.f2020n), new Du.Wre(y5), new Du.Wre(BundleSubscription.j.f51435n), new Du.Wre(ActiveSubscription.j.f51433n), null};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ User(int i2, String str, List list, PrivacyNotice privacyNotice, TermsOfService termsOfService, Map map, List list2, List list3, List list4, AuthenticationResponse authenticationResponse, i iVar) {
        this.id = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.activeSubscriptionsIds = CollectionsKt.emptyList();
        } else {
            this.activeSubscriptionsIds = list;
        }
        if ((i2 & 4) == 0) {
            this.privacyNotice = new PrivacyNotice((String) null, (PrivacyNotice.IsAtLeast16) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.privacyNotice = privacyNotice;
        }
        String str2 = null;
        Object[] objArr = 0;
        if ((i2 & 8) == 0) {
            this.termsOfService = new TermsOfService(str2, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.termsOfService = termsOfService;
        }
        if ((i2 & 16) == 0) {
            this.availableConsumableCredits = MapsKt.emptyMap();
        } else {
            this.availableConsumableCredits = map;
        }
        if ((i2 & 32) == 0) {
            this.nonConsumablesIds = CollectionsKt.emptyList();
        } else {
            this.nonConsumablesIds = list2;
        }
        if ((i2 & 64) == 0) {
            this.activeBundleSubscriptions = CollectionsKt.emptyList();
        } else {
            this.activeBundleSubscriptions = list3;
        }
        if ((i2 & 128) == 0) {
            this.activeSubscriptions = CollectionsKt.emptyList();
        } else {
            this.activeSubscriptions = list4;
        }
        if ((i2 & 256) == 0) {
            this.authentication = null;
        } else {
            this.authentication = authenticationResponse;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$oracle_release(User self, gi.Ml output, Wre serialDesc) {
        Ml[] mlArr = $childSerializers;
        if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.id, "")) {
            output.O(serialDesc, 0, self.id);
        }
        int i2 = 1;
        if (output.r(serialDesc, 1) || !Intrinsics.areEqual(self.activeSubscriptionsIds, CollectionsKt.emptyList())) {
            output.S(serialDesc, 1, mlArr[1], self.activeSubscriptionsIds);
        }
        if (output.r(serialDesc, 2)) {
            output.S(serialDesc, 2, PrivacyNotice.j.f51436n, self.privacyNotice);
        } else {
            if (!Intrinsics.areEqual(self.privacyNotice, new PrivacyNotice((String) null, (PrivacyNotice.IsAtLeast16) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            }
        }
        if (output.r(serialDesc, 3) || !Intrinsics.areEqual(self.termsOfService, new TermsOfService((String) null, i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            output.S(serialDesc, 3, TermsOfService.j.f51437n, self.termsOfService);
        }
        if (output.r(serialDesc, 4) || !Intrinsics.areEqual(self.availableConsumableCredits, MapsKt.emptyMap())) {
            output.S(serialDesc, 4, mlArr[4], self.availableConsumableCredits);
        }
        if (output.r(serialDesc, 5) || !Intrinsics.areEqual(self.nonConsumablesIds, CollectionsKt.emptyList())) {
            output.S(serialDesc, 5, mlArr[5], self.nonConsumablesIds);
        }
        if (output.r(serialDesc, 6) || !Intrinsics.areEqual(self.activeBundleSubscriptions, CollectionsKt.emptyList())) {
            output.S(serialDesc, 6, mlArr[6], self.activeBundleSubscriptions);
        }
        if (output.r(serialDesc, 7) || !Intrinsics.areEqual(self.activeSubscriptions, CollectionsKt.emptyList())) {
            output.S(serialDesc, 7, mlArr[7], self.activeSubscriptions);
        }
        if (!output.r(serialDesc, 8) && self.authentication == null) {
            return;
        }
        output.X(serialDesc, 8, AuthenticationResponse.j.f51434n, self.authentication);
    }

    public final List<BundleSubscription> getActiveBundleSubscriptions() {
        return this.activeBundleSubscriptions;
    }

    public final List<ActiveSubscription> getActiveSubscriptions() {
        return this.activeSubscriptions;
    }

    public final List<String> getActiveSubscriptionsIds() {
        return this.activeSubscriptionsIds;
    }

    public final AuthenticationResponse getAuthentication() {
        return this.authentication;
    }

    public final Map<String, Integer> getAvailableConsumableCredits() {
        return this.availableConsumableCredits;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getNonConsumablesIds() {
        return this.nonConsumablesIds;
    }

    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    public final TermsOfService getTermsOfService() {
        return this.termsOfService;
    }

    public User(@Json(name = "unique_id") String id, @Json(name = "active_subscriptions_ids") List<String> activeSubscriptionsIds, @Json(name = "privacy_notice") PrivacyNotice privacyNotice, @Json(name = "terms_of_service") TermsOfService termsOfService, @Json(name = "available_consumable_credits") Map<String, Integer> availableConsumableCredits, @Json(name = "non_consumables_ids") List<String> nonConsumablesIds, @Json(name = "active_bundle_subscriptions") List<BundleSubscription> activeBundleSubscriptions, @Json(name = "active_subscriptions") List<ActiveSubscription> activeSubscriptions, @Json(name = "authentication") AuthenticationResponse authenticationResponse) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(activeSubscriptionsIds, "activeSubscriptionsIds");
        Intrinsics.checkNotNullParameter(privacyNotice, "privacyNotice");
        Intrinsics.checkNotNullParameter(termsOfService, "termsOfService");
        Intrinsics.checkNotNullParameter(availableConsumableCredits, "availableConsumableCredits");
        Intrinsics.checkNotNullParameter(nonConsumablesIds, "nonConsumablesIds");
        Intrinsics.checkNotNullParameter(activeBundleSubscriptions, "activeBundleSubscriptions");
        Intrinsics.checkNotNullParameter(activeSubscriptions, "activeSubscriptions");
        this.id = id;
        this.activeSubscriptionsIds = activeSubscriptionsIds;
        this.privacyNotice = privacyNotice;
        this.termsOfService = termsOfService;
        this.availableConsumableCredits = availableConsumableCredits;
        this.nonConsumablesIds = nonConsumablesIds;
        this.activeBundleSubscriptions = activeBundleSubscriptions;
        this.activeSubscriptions = activeSubscriptions;
        this.authentication = authenticationResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ User(String str, List list, PrivacyNotice privacyNotice, TermsOfService termsOfService, Map map, List list2, List list3, List list4, AuthenticationResponse authenticationResponse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? new PrivacyNotice((String) null, (PrivacyNotice.IsAtLeast16) null, (List) null, 7, (DefaultConstructorMarker) null) : privacyNotice, (i2 & 8) != 0 ? new TermsOfService((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : termsOfService, (i2 & 16) != 0 ? MapsKt.emptyMap() : map, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list4, (i2 & 256) != 0 ? null : authenticationResponse);
    }
}
