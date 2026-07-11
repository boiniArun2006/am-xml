package com.alightcreative.app.motion.activities.main;

import HI0.gnv;
import Sa.AbstractC1468n;
import Sa.C1467j;
import com.alightcreative.app.motion.activities.main.w6;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f45403n = new ArrayList();
    public static com.alightcreative.app.motion.activities.main.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f45404t;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.Ml$Ml, reason: collision with other inner class name */
    static final class C0638Ml implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0638Ml f45405n = new C0638Ml();

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((com.alightcreative.app.motion.activities.main.w6) obj);
            return Unit.INSTANCE;
        }

        public final void n(com.alightcreative.app.motion.activities.main.w6 elementLibrary) {
            Intrinsics.checkNotNullParameter(elementLibrary, "elementLibrary");
            Ml.f45404t = false;
            Ml.rl = elementLibrary;
            Iterator it = Ml.f45403n.iterator();
            while (it.hasNext()) {
                Function1 function1 = (Function1) ((WeakReference) it.next()).get();
                if (function1 != null) {
                    function1.invoke(elementLibrary);
                }
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class n implements Response.ErrorListener {
        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(volleyError);
            HI0.qz.nr(null, new w6(Result.m313constructorimpl(ResultKt.createFailure(volleyError))), 1, null).Uo(C0638Ml.f45405n);
        }
    }

    static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f45406n;

        public w6(Object obj) {
            this.f45406n = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.alightcreative.app.motion.activities.main.w6 invoke() {
            Object objEmptyList = this.f45406n;
            if (Result.m316exceptionOrNullimpl(objEmptyList) != null) {
                objEmptyList = CollectionsKt.emptyList();
            }
            List list = (List) objEmptyList;
            if (!list.isEmpty()) {
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                if (jVar.getSeenElementDownloads().isEmpty()) {
                    Map<String, Long> seenElementDownloads = jVar.getSeenElementDownloads();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Ml.Uo((KC.afx) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Pair pair = TuplesKt.to((String) it2.next(), -1L);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    seenElementDownloads.putAll(linkedHashMap);
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        String strUo = Ml.Uo((KC.afx) it3.next());
                        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                        if (!jVar2.getSeenElementDownloads().containsKey(strUo)) {
                            jVar2.getSeenElementDownloads().put(strUo, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                KC.afx afxVar = (KC.afx) it4.next();
                String strUo2 = Ml.Uo(afxVar);
                Long l2 = com.alightcreative.app.motion.persist.j.INSTANCE.getSeenElementDownloads().get(strUo2);
                String title = afxVar.getTitle();
                String thumbnail = afxVar.getThumbnail();
                String download = afxVar.getDownload();
                boolean z2 = l2 == null || l2.longValue() != -1;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                arrayList2.add(new w6.j(title, thumbnail, download, strUo2, z2, jLongValue));
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                arrayList3.add(Long.valueOf(((w6.j) it5.next()).rl()));
            }
            Long l5 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList3);
            return new com.alightcreative.app.motion.activities.main.w6(arrayList2, l5 != null ? l5.longValue() : 0L);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class j implements Response.Listener {
        @Override // com.android.volley.Response.Listener
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final void onResponse(List list) {
            HI0.qz.nr(null, new w6(Result.m313constructorimpl(list)), 1, null).Uo(C0638Ml.f45405n);
        }
    }

    public static final String J2() {
        return com.alightcreative.app.motion.persist.j.INSTANCE.getStagingFeed() ? "https://alight-creative-staging.firebaseapp.com/appdata/am/elements/recommendations.json" : "https://alightcreative.com/appdata/am/elements/recommendations.json";
    }

    public static final boolean KN(com.alightcreative.app.motion.activities.main.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return w6Var.n() > 0 && com.alightcreative.app.motion.persist.j.INSTANCE.getElementTabVisitTimestamp() < w6Var.n();
    }

    public static final void gh(Function1 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        List list = f45403n;
        CollectionsKt.removeAll(list, new Function1() { // from class: KC.Z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(com.alightcreative.app.motion.activities.main.Ml.qie((WeakReference) obj));
            }
        });
        list.add(new WeakReference(observer));
        com.alightcreative.app.motion.activities.main.w6 w6Var = rl;
        if (w6Var != null) {
            observer.invoke(w6Var);
        }
    }

    public static final void mUb() {
        if (f45404t) {
            return;
        }
        rl = null;
        AbstractC1468n.n().getCache().remove(J2());
        xMQ();
    }

    public static final boolean qie(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    public static final void xMQ() {
        if (f45404t) {
            return;
        }
        f45404t = true;
        AbstractC1468n.n().add(new C1467j(J2(), KC.afx.class, new j(), new n()));
    }

    public static final String Uo(KC.afx afxVar) {
        byte[] bArrAz = gnv.az(afxVar.getDownload());
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        return gnv.o(bArrAz);
    }
}
