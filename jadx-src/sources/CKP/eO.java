package CKP;

import android.os.Bundle;
import com.facebook.appevents.Lu;
import com.facebook.appevents.vd;
import com.facebook.internal.UGc;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final eO f876n = new eO();
    private static final List rl = CollectionsKt.listOf("fb_currency");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f877t = CollectionsKt.listOf("_valueToSum");
    private static final long nr = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final List f875O = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("fb_iap_product_id", CollectionsKt.listOf("fb_iap_product_id")), TuplesKt.to("fb_iap_product_description", CollectionsKt.listOf("fb_iap_product_description")), TuplesKt.to("fb_iap_product_title", CollectionsKt.listOf("fb_iap_product_title")), TuplesKt.to("fb_iap_purchase_token", CollectionsKt.listOf("fb_iap_purchase_token"))});

    public final Double Uo(Double d2, Bundle bundle) {
        if (d2 != null) {
            return d2;
        }
        Iterator it = KN().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public final Pair n(Bundle bundle, Bundle bundle2, vd vdVar) {
        Bundle bundle3;
        vd vdVar2;
        if (bundle == null) {
            return new Pair(bundle2, vdVar);
        }
        try {
            bundle3 = bundle2;
            vdVar2 = vdVar;
            for (String key : bundle.keySet()) {
                try {
                    String string = bundle.getString(key);
                    if (string != null) {
                        vd.j jVar = vd.rl;
                        Lu lu = Lu.IAPParameters;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Pair pairRl = jVar.rl(lu, key, string, bundle3, vdVar2);
                        Bundle bundle4 = (Bundle) pairRl.component1();
                        vdVar2 = (vd) pairRl.component2();
                        bundle3 = bundle4;
                    }
                } catch (Exception unused) {
                    bundle2 = bundle3;
                    vdVar = vdVar2;
                    bundle3 = bundle2;
                    vdVar2 = vdVar;
                }
            }
        } catch (Exception unused2) {
        }
        return new Pair(bundle3, vdVar2);
    }

    private eO() {
    }

    public final List J2(boolean z2) {
        List listWPU;
        com.facebook.internal.QJ qjJ2 = UGc.J2(com.facebook.s4.az());
        if (qjJ2 == null || (listWPU = qjJ2.WPU()) == null || listWPU.isEmpty()) {
            return null;
        }
        if (!z2) {
            return qjJ2.WPU();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : qjJ2.WPU()) {
            Iterator it = ((List) pair.getSecond()).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    public final List KN() {
        List listAz;
        com.facebook.internal.QJ qjJ2 = UGc.J2(com.facebook.s4.az());
        if (qjJ2 != null) {
            listAz = qjJ2.az();
        } else {
            listAz = null;
        }
        if (listAz != null && !qjJ2.az().isEmpty()) {
            return qjJ2.az();
        }
        return f877t;
    }

    public final long O() {
        Long lJ2;
        Long lJ22;
        com.facebook.internal.QJ qjJ2 = UGc.J2(com.facebook.s4.az());
        if (qjJ2 != null) {
            lJ2 = qjJ2.J2();
        } else {
            lJ2 = null;
        }
        if (lJ2 != null && ((lJ22 = qjJ2.J2()) == null || lJ22.longValue() != 0)) {
            return qjJ2.J2().longValue();
        }
        return nr;
    }

    public final List nr(boolean z2) {
        List listGh;
        com.facebook.internal.QJ qjJ2 = UGc.J2(com.facebook.s4.az());
        if (qjJ2 != null) {
            listGh = qjJ2.gh();
        } else {
            listGh = null;
        }
        if (listGh != null && !qjJ2.gh().isEmpty()) {
            if (!z2) {
                return qjJ2.gh();
            }
            ArrayList arrayList = new ArrayList();
            for (Pair pair : qjJ2.gh()) {
                Iterator it = ((List) pair.getSecond()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair((String) it.next(), CollectionsKt.listOf(pair.getFirst())));
                }
            }
            return arrayList;
        }
        return f875O;
    }

    public final Currency rl(Bundle bundle) {
        Iterator it = t().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    string = bundle.getString(str);
                } catch (Exception unused) {
                    continue;
                }
            }
            if (string != null && string.length() != 0) {
                return Currency.getInstance(string);
            }
        }
    }

    public final List t() {
        List listO;
        com.facebook.internal.QJ qjJ2 = UGc.J2(com.facebook.s4.az());
        if (qjJ2 != null) {
            listO = qjJ2.O();
        } else {
            listO = null;
        }
        if (listO != null && !qjJ2.O().isEmpty()) {
            return qjJ2.O();
        }
        return rl;
    }
}
