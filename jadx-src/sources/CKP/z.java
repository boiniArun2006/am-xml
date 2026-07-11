package CKP;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z f913n = new z();
    private static final HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final HashMap f914t = new HashMap();
    private static final String nr = com.facebook.s4.qie().getPackageName();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final SharedPreferences f912O = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences J2 = com.facebook.s4.qie().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList Uo(Context context, Object obj) {
        z zVar;
        Class clsNr;
        if (VmF.j.nr(z.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, qUrazMnwDskFs.rHRosoztK);
            ArrayList arrayList = new ArrayList();
            if (obj != null && (clsNr = (zVar = f913n).nr(context, "com.android.vending.billing.IInAppBillingService")) != null && zVar.O(clsNr, qfEYuUHwj.OJVJK) != null) {
                return zVar.t(zVar.J2(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, z.class);
            return null;
        }
    }

    public static final Map gh(Context context, ArrayList skuList, Object obj, boolean z2) {
        if (VmF.j.nr(z.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            Map mapCk = f913n.ck(skuList);
            ArrayList arrayList = new ArrayList();
            Iterator it = skuList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!mapCk.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapCk.putAll(f913n.qie(context, arrayList, obj, z2));
            return mapCk;
        } catch (Throwable th) {
            VmF.j.rl(th, z.class);
            return null;
        }
    }

    public static final ArrayList mUb(Context context, Object obj) {
        if (VmF.j.nr(z.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            z zVar = f913n;
            return zVar.t(zVar.KN(context, obj, "subs"));
        } catch (Throwable th) {
            VmF.j.rl(th, z.class);
            return null;
        }
    }

    public static final Object n(Context context, IBinder iBinder) {
        if (VmF.j.nr(z.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return f913n.ty(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            VmF.j.rl(th, z.class);
            return null;
        }
    }

    public static final void rl() {
        if (VmF.j.nr(z.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f912O;
            long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j2 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j2 > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, z.class);
        }
    }

    public static final ArrayList xMQ(Context context, Object obj) {
        if (VmF.j.nr(z.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            z zVar = f913n;
            return zVar.t(zVar.KN(context, obj, "inapp"));
        } catch (Throwable th) {
            VmF.j.rl(th, z.class);
            return null;
        }
    }

    private z() {
    }

    private final boolean HI(Context context, Object obj, String str) {
        if (VmF.j.nr(this) || obj == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            Object objTy = ty(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, nr, str});
            if (objTy != null) {
                if (((Integer) objTy).intValue() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final void Ik(Map map) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f912O.edit();
            for (Map.Entry entry : map.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList J2(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (HI(context, obj, str)) {
                int i2 = 0;
                String string = null;
                boolean z2 = false;
                do {
                    Object objTy = ty(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, nr, str, string, new Bundle()});
                    if (objTy != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objTy;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (jCurrentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z2 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i2++;
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (i2 >= 30 || string == null) {
                            break;
                        }
                    }
                } while (!z2);
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList KN(Context context, Object obj, String str) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && HI(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objTy = ty(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, nr, str, string});
                        if (objTy != null) {
                            Bundle bundle = (Bundle) objTy;
                            if (bundle.getInt("RESPONSE_CODE") == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                if (stringArrayList == null) {
                                    break;
                                }
                                size += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            } else {
                                string = null;
                            }
                            if (size >= 30 || string == null) {
                                break;
                            }
                            context = context2;
                            obj = obj2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        VmF.j.rl(th, this);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Method O(Class cls, String str) {
        Class[] clsArr;
        Method methodT;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            HashMap map = rl;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            int iHashCode = str.hashCode();
            Class TYPE = Integer.TYPE;
            switch (iHashCode) {
                case -1801122596:
                    if (!str.equals("getPurchases")) {
                        clsArr = null;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class};
                    } else {
                        clsArr = null;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        clsArr = new Class[]{IBinder.class};
                    } else {
                        clsArr = null;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                    } else {
                        clsArr = null;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                    } else {
                        clsArr = null;
                    }
                    break;
            }
            if (clsArr == null) {
                methodT = s4.t(cls, str, null);
            } else {
                methodT = s4.t(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodT != null) {
                map.put(str, methodT);
            }
            return methodT;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Map ck(ArrayList arrayList) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f912O.getString(sku, null);
                if (string != null) {
                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, listSplit$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Class nr(Context context, String str) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            HashMap map = f914t;
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            Class clsRl = s4.rl(context, str);
            if (clsRl != null) {
                map.put(str, clsRl);
                return clsRl;
            }
            return clsRl;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final Map qie(Context context, ArrayList arrayList, Object obj, boolean z2) {
        String str;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                String str2 = nr;
                if (z2) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                try {
                    Object objTy = ty(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, str2, str, bundle});
                    if (objTy != null) {
                        Bundle bundle2 = (Bundle) objTy;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    Object obj2 = arrayList.get(i2);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                                    String str3 = stringArrayList.get(i2);
                                    Intrinsics.checkNotNullExpressionValue(str3, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str3);
                                }
                            }
                            Ik(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    VmF.j.rl(th, this);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final ArrayList t(ArrayList arrayList) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor editorEdit = J2.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j2 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j2 / 1000) <= 86400 && !Intrinsics.areEqual(J2.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Object ty(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodO;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Class clsNr = nr(context, str);
            if (clsNr == null || (methodO = O(clsNr, str2)) == null) {
                return null;
            }
            return s4.O(clsNr, methodO, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final boolean az(String skuDetail) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (strOptString != null) {
                    if (strOptString.length() > 0) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
