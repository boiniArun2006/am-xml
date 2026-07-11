package Mn;

import Ti.C;
import Ti.w6;
import com.facebook.GraphRequest;
import com.facebook.g9s;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f6741n = new I28();
    private static final AtomicBoolean rl = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(List validReports, g9s response) {
        JSONObject jSONObjectNr;
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.rl() == null && (jSONObjectNr = response.nr()) != null && jSONObjectNr.getBoolean("success")) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((Ti.w6) it.next()).n();
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(Ti.w6 w6Var, Ti.w6 o2) {
        if (VmF.j.nr(I28.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return w6Var.rl(o2);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return 0;
        }
    }

    public static final void nr() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            if (vd.J()) {
                return;
            }
            File[] fileArrQie = C.qie();
            ArrayList arrayList = new ArrayList(fileArrQie.length);
            for (File file : fileArrQie) {
                arrayList.add(w6.j.nr(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Ti.w6) obj).J2()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: Mn.w6
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return I28.O((Ti.w6) obj2, (Ti.w6) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            C.o("anr_reports", jSONArray, new GraphRequest.n() { // from class: Mn.Ml
                @Override // com.facebook.GraphRequest.n
                public final void n(g9s g9sVar) {
                    I28.J2(listSortedWith, g9sVar);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final synchronized void t() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            if (rl.getAndSet(true)) {
                return;
            }
            if (s4.ck()) {
                nr();
            }
            n.nr();
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    private I28() {
    }
}
