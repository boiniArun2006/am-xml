package iWe;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import oK9.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class I28 {
    public abstract boolean t();

    public static String J2(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (O2.w6 w6Var : O2.w6.values()) {
            if (w6Var.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public static String O(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (O2.n nVar : O2.n.values()) {
            if (nVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    private static List n(Dsr dsr, Context context) {
        ArrayList arrayList = new ArrayList();
        if (dsr.nr()) {
            arrayList.add(new Ml(dsr.O()));
        }
        if (dsr.rl()) {
            arrayList.add(new w6(dsr.t(), context));
        }
        if (dsr.ty()) {
            arrayList.add(new j(dsr.az()));
        }
        if (dsr.n()) {
            arrayList.add(new n(dsr.J2()));
        }
        return arrayList;
    }

    public static void nr(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static boolean rl(Dsr dsr, Context context) {
        List listN = n(dsr, context);
        if (listN.isEmpty()) {
            yMa.j.O().n("No validators found for PerfMetric.");
            return false;
        }
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            if (!((I28) it.next()).t()) {
                return false;
            }
        }
        return true;
    }
}
