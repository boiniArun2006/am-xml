package wR;

import QmE.j;
import QmE.yg;
import android.content.Context;
import android.os.Bundle;
import cKn.Wre;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n implements yg {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f74982n;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f74981t = new j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Function0 f74980O = new Function0() { // from class: wR.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(n.nr());
        }
    };

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            n.f74980O = function0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr() {
        return true;
    }

    public n(Context context, Wre theirs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theirs, "theirs");
        this.f74982n = context;
        this.rl = theirs;
    }

    private final void J2(String str, Bundle bundle) {
        Map mapEmptyMap;
        Set<String> setKeySet;
        List<String> listFilterNotNull;
        if (((Boolean) f74980O.invoke()).booleanValue()) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null || (listFilterNotNull = CollectionsKt.filterNotNull(setKeySet)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            } else {
                mapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10)), 16));
                for (String str2 : listFilterNotNull) {
                    Pair pair = TuplesKt.to(str2, String.valueOf(bundle.get(str2)));
                    mapEmptyMap.put(pair.getFirst(), pair.getSecond());
                }
            }
            jXF.j jVarN = this.rl.n();
            if (jVarN != null) {
                jVarN.trackEvent(str, mapEmptyMap);
            }
        }
    }

    private final void O(String str) {
        jXF.j jVarN;
        if (!((Boolean) f74980O.invoke()).booleanValue() || (jVarN = this.rl.n()) == null) {
            return;
        }
        jVarN.trackEvent(str);
    }

    @Override // QmE.yg
    public void n(QmE.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof j.S) {
            O("subscription_started");
        } else if (event instanceof j.fuX) {
            j.fuX fux = (j.fuX) event;
            J2(fux.rl(), fux.n());
        }
    }
}
