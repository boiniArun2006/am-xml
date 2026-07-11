package jkl;

import Ti.C;
import com.facebook.GraphRequest;
import com.facebook.g9s;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f69619n = new I28();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J2(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    public static final void Uo(String str) {
        try {
            new j(str).O();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(ArrayList validReports, g9s response) {
        JSONObject jSONObjectNr;
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.rl() == null && (jSONObjectNr = response.nr()) != null && jSONObjectNr.getBoolean("success")) {
                Iterator it = validReports.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).n();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(j jVar, j o2) {
        Intrinsics.checkNotNullExpressionValue(o2, "o2");
        return jVar.rl(o2);
    }

    private I28() {
    }

    public static final void KN() {
        if (vd.J()) {
            return;
        }
        File[] fileArrO = O();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrO) {
            j jVar = new j(file);
            if (jVar.nr()) {
                arrayList.add(jVar);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: jkl.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return I28.xMQ((j) obj, (j) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        C.o("error_reports", jSONArray, new GraphRequest.n() { // from class: jkl.w6
            @Override // com.facebook.GraphRequest.n
            public final void n(g9s g9sVar) {
                I28.mUb(arrayList, g9sVar);
            }
        });
    }

    public static final File[] O() {
        File fileJ2 = C.J2();
        if (fileJ2 == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileJ2.listFiles(new FilenameFilter() { // from class: jkl.Ml
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return I28.J2(file, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    public static final void nr() {
        if (s4.ck()) {
            KN();
        }
    }
}
