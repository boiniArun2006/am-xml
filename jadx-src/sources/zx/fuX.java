package zx;

import android.os.Bundle;
import com.alightcreative.time.Kw.znsSxz;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX {
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f76727n = new fuX();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map f76728t = new HashMap();
    private static Map nr = new HashMap();

    public static final void Uo(Bundle bundle) {
        if (VmF.j.nr(fuX.class)) {
            return;
        }
        try {
            if (rl && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(key));
                    boolean z2 = f76728t.get(key) != null;
                    boolean z3 = nr.get(key) != null;
                    if (z2 || z3) {
                        fuX fux = f76727n;
                        boolean zNr = fux.nr(strValueOf, (Set) f76728t.get(key));
                        boolean zT2 = fux.t(strValueOf, (Set) nr.get(key));
                        if (!zNr && !zT2) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
        }
    }

    private final void n(JSONArray jSONArray) {
        if (VmF.j.nr(this) || jSONArray == null) {
            return;
        }
        try {
            if (rl) {
                return;
            }
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String key = jSONObject.getString("key");
                if (key != null && key.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(znsSxz.ACGqqgKq);
                        int length2 = jSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            boolean z2 = jSONArray2.getJSONObject(i3).getBoolean("require_exact_match");
                            HashSet hashSetJ2 = J2(jSONArray2.getJSONObject(i3).getJSONArray("potential_matches"));
                            if (z2) {
                                Map map = nr;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet hashSet = (HashSet) nr.get(key);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetJ2);
                                    hashSetJ2 = hashSet;
                                }
                                map.put(key, hashSetJ2);
                            } else {
                                Map map2 = f76728t;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet hashSet2 = (HashSet) f76728t.get(key);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetJ2);
                                    hashSetJ2 = hashSet2;
                                }
                                map2.put(key, hashSetJ2);
                            }
                        }
                    } catch (Exception unused) {
                        nr.remove(key);
                        f76728t.remove(key);
                    }
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final void rl() {
        if (VmF.j.nr(fuX.class)) {
            return;
        }
        try {
            if (rl) {
                return;
            }
            f76727n.O();
            rl = (f76728t.isEmpty() && nr.isEmpty()) ? false : true;
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
        }
    }

    private final boolean t(String str, Set set) {
        if (!VmF.j.nr(this) && set != null) {
            try {
                Set<String> set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                for (String str2 : set2) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
        return false;
    }

    private fuX() {
    }

    private final HashSet J2(JSONArray jSONArray) {
        try {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                HashSet hashSetAz = vd.az(jSONArray);
                if (hashSetAz == null) {
                    return new HashSet();
                }
                return hashSetAz;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final void O() {
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ == null) {
                    return;
                }
                n(qjXQ.Ik());
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final boolean nr(String str, Set set) {
        if (!VmF.j.nr(this) && set != null) {
            try {
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (new Regex((String) it.next()).matches(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
        return false;
    }
}
