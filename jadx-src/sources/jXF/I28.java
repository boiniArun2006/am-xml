package jXF;

import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f69449n = LazyKt.lazy(new Function0() { // from class: jXF.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I28.J2();
        }
    });

    @Override // jXF.j
    public void trackEvent(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Uo().rl(id, new DK.n().n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseAnalytics J2() {
        return DK.j.n(com.google.firebase.w6.f60907n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(I28 i28, Function1 function1, boolean z2) {
        FirebaseAnalytics.j jVar = z2 ? FirebaseAnalytics.j.GRANTED : FirebaseAnalytics.j.DENIED;
        FirebaseAnalytics firebaseAnalyticsUo = i28.Uo();
        com.google.firebase.analytics.j jVar2 = new com.google.firebase.analytics.j();
        jVar2.O(jVar);
        firebaseAnalyticsUo.nr(jVar2.n());
        function1.invoke(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    private final FirebaseAnalytics Uo() {
        return (FirebaseAnalytics) this.f69449n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(I28 i28, Function1 function1, boolean z2) {
        FirebaseAnalytics.j jVar = z2 ? FirebaseAnalytics.j.GRANTED : FirebaseAnalytics.j.DENIED;
        FirebaseAnalytics firebaseAnalyticsUo = i28.Uo();
        com.google.firebase.analytics.j jVar2 = new com.google.firebase.analytics.j();
        jVar2.t(jVar);
        jVar2.nr(jVar);
        jVar2.rl(jVar);
        firebaseAnalyticsUo.nr(jVar2.n());
        function1.invoke(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    @Override // jXF.j
    public void n(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Uo().O(name, value);
    }

    @Override // jXF.j
    public List rl(Context context, final Function1 onConsentUpdated) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onConsentUpdated, "onConsentUpdated");
        return CollectionsKt.listOf((Object[]) new Tracker[]{new Tracker.FirebaseAnalytics(context, null, false, new Function1() { // from class: jXF.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.KN(this.f69452n, onConsentUpdated, ((Boolean) obj).booleanValue());
            }
        }, 6, null), new Tracker.FirebaseProfiling(context, null, false, new Function1() { // from class: jXF.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.xMQ(this.f69450n, onConsentUpdated, ((Boolean) obj).booleanValue());
            }
        }, 6, null)});
    }

    @Override // jXF.j
    public void trackEvent(String id, Map map) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(map, gUxOLwRQBPPLC.uDuYrccZDDTlJTj);
        FirebaseAnalytics firebaseAnalyticsUo = Uo();
        DK.n nVar = new DK.n();
        ArrayList<Pair> arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        for (Pair pair : arrayList) {
            nVar.rl((String) pair.getFirst(), (String) pair.getSecond());
        }
        firebaseAnalyticsUo.rl(id, nVar.n());
    }
}
