package ui;

import Ti.C;
import Ti.w6;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.g9s;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ui.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements Thread.UncaughtExceptionHandler {
    private static w6 nr;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f74557t = w6.class.getCanonicalName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f74558n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized void t() {
            try {
                if (s4.ck()) {
                    nr();
                }
                if (w6.nr != null) {
                    Log.w(w6.f74557t, "Already enabled!");
                } else {
                    w6.nr = new w6(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(w6.nr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(List validReports, g9s response) {
            JSONObject jSONObjectNr;
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
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int O(Ti.w6 w6Var, Ti.w6 o2) {
            Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return w6Var.rl(o2);
        }

        private final void nr() {
            if (vd.J()) {
                return;
            }
            File[] fileArrCk = C.ck();
            ArrayList arrayList = new ArrayList(fileArrCk.length);
            for (File file : fileArrCk) {
                arrayList.add(w6.j.nr(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Ti.w6) obj).J2()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: ui.j
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return w6.j.O((Ti.w6) obj2, (Ti.w6) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            C.o("crash_reports", jSONArray, new GraphRequest.n() { // from class: ui.n
                @Override // com.facebook.GraphRequest.n
                public final void n(g9s g9sVar) {
                    w6.j.J2(listSortedWith, g9sVar);
                }
            });
        }
    }

    public /* synthetic */ w6(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    private w6(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f74558n = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t3, Throwable e2) {
        Intrinsics.checkNotNullParameter(t3, "t");
        Intrinsics.checkNotNullParameter(e2, "e");
        if (C.mUb(e2)) {
            Ti.n.t(e2);
            w6.j.rl(e2, w6.EnumC0373w6.CrashReport).Uo();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f74558n;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t3, e2);
        }
    }
}
