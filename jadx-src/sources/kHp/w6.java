package kHp;

import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f69839n;
    private final boolean rl;

    public w6(Function2 trackEvent, boolean z2) {
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        this.f69839n = trackEvent;
        this.rl = z2;
    }

    private final void rl(String str) {
        this.f69839n.invoke(str, new pq.Ml());
    }

    public final void J2() {
        rl(wDgKoYAES.hOgpgTKUTeztDm);
    }

    public final void KN() {
        rl("privacy_settings_accept_all");
    }

    public final void O() {
        rl("privacy_banner_closed");
    }

    public final void Uo() {
        rl("privacy_banner_displayed");
    }

    public final void gh() {
        rl("privacy_settings_displayed");
    }

    public final void mUb() {
        rl("privacy_settings_deny");
    }

    public final void n(Map privacySettings, List trackers, String ppVersion, String str, n consentType, boolean z2) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(ppVersion, "ppVersion");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        if (!this.rl) {
            Function2 function2 = this.f69839n;
            pq.Ml ml = new pq.Ml();
            pq.Ml ml2 = new pq.Ml();
            for (Map.Entry entry : privacySettings.entrySet()) {
                ml2.KN((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
            Unit unit = Unit.INSTANCE;
            ml.Uo("privacy_settings", ml2);
            function2.invoke("privacy_settings_updated", ml);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(trackers, 10)), 16));
        Iterator it = trackers.iterator();
        while (it.hasNext()) {
            Tracker tracker = (Tracker) it.next();
            Pair pair = TuplesKt.to(tracker.getName(), tracker.getAnalyticsName());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : privacySettings.entrySet()) {
            if (((Boolean) entry2.getValue()).booleanValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Set<String> setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        for (String str2 : setKeySet) {
            String str3 = (String) linkedHashMap.get(str2);
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(str2);
        }
        Function2 function22 = this.f69839n;
        pq.Ml ml3 = new pq.Ml();
        ml3.O("pp_version", ppVersion);
        if (str != null) {
            ml3.O("tos_version", str);
        }
        ml3.O("consent_type", consentType.rl());
        ml3.KN("is_intro_consent", z2);
        ml3.J2("enabled_technologies", pq.I28.rl(arrayList));
        Unit unit2 = Unit.INSTANCE;
        function22.invoke("legal_tracking_consent_update", ml3);
    }

    public final void nr() {
        rl("privacy_banner_accept_all");
    }

    public final void qie() {
        rl("privacy_settings_done");
    }

    public final void t() {
        rl("first_party_analytics_disabled");
    }

    public final void xMQ() {
        rl("privacy_settings_cancel");
    }

    public /* synthetic */ w6(Function2 function2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? false : z2);
    }
}
