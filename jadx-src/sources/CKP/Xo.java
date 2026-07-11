package CKP;

import CKP.s4;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Xo implements Dsr {
    private static Xo jB;
    private final Method E2;
    private final Class HI;
    private final Class Ik;
    private final Class J2;
    private final Class KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Method f854N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Class f855O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Method f856S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Method f857T;
    private final Class Uo;
    private final Method ViF;
    private final Method WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Method f858X;
    private final Method XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Method f859Z;
    private final Method aYN;
    private final Class az;
    private final Class ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f860e;
    private final Method fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Method f861g;
    private final Class gh;
    private final Method iF;
    private final Class mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f862n;
    private final Method nHg;
    private final Method nY;
    private final Class nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Method f863o;
    private final Class qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Class f864r;
    private final Class rl;
    private final Method s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f865t;
    private final Method te;
    private final Class ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Method f866v;
    private final Method wTp;
    private final Class xMQ;
    public static final j rV9 = new j(null);
    private static final String bzg = Xo.class.getCanonicalName();
    private static final AtomicBoolean Xw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final Map f853U = new ConcurrentHashMap();
    private static final Map P5 = new ConcurrentHashMap();
    private static final Map M7 = new ConcurrentHashMap();

    public static final class j implements InvocationHandler {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m2, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m2, "m");
            return null;
        }

        public final synchronized Xo nr(Context context) {
            Xo xoO;
            Intrinsics.checkNotNullParameter(context, "context");
            xoO = Xo.O();
            if (xoO == null) {
                xoO = rl(context);
            }
            return xoO;
        }

        private j() {
        }

        private final Object n(Context context, Class cls, Class cls2, Class cls3) {
            Object objO;
            Method methodNr = s4.nr(cls, "newBuilder", Context.class);
            Method methodNr2 = s4.nr(cls2, "setListener", cls3);
            Method methodNr3 = s4.nr(cls2, "enablePendingPurchases", new Class[0]);
            Method methodNr4 = s4.nr(cls2, "build", new Class[0]);
            if (methodNr4 == null || methodNr2 == null || methodNr == null || methodNr3 == null || (objO = s4.O(cls2, methodNr2, s4.O(cls, methodNr, null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return s4.O(cls2, methodNr4, s4.O(cls2, methodNr3, objO, new Object[0]), new Object[0]);
        }

        private final Xo rl(Context context) {
            Class clsN = s4.n("com.android.billingclient.api.BillingClient");
            Class clsN2 = s4.n("com.android.billingclient.api.Purchase");
            Class clsN3 = s4.n("com.android.billingclient.api.ProductDetails");
            Class clsN4 = s4.n("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsN5 = s4.n("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class clsN6 = s4.n("com.android.billingclient.api.BillingResult");
            Class clsN7 = s4.n("com.android.billingclient.api.QueryProductDetailsParams");
            Class clsN8 = s4.n("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class clsN9 = s4.n("com.android.billingclient.api.QueryPurchasesParams");
            Class clsN10 = s4.n("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class clsN11 = s4.n("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class clsN12 = s4.n("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class clsN13 = s4.n("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class clsN14 = s4.n("com.android.billingclient.api.BillingClient$Builder");
            Class clsN15 = s4.n("com.android.billingclient.api.PurchasesUpdatedListener");
            Class clsN16 = s4.n("com.android.billingclient.api.BillingClientStateListener");
            Class clsN17 = s4.n("com.android.billingclient.api.ProductDetailsResponseListener");
            Class clsN18 = s4.n("com.android.billingclient.api.PurchasesResponseListener");
            Class clsN19 = s4.n("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsN == null || clsN2 == null || clsN3 == null || clsN4 == null || clsN5 == null || clsN6 == null || clsN7 == null || clsN8 == null || clsN9 == null || clsN10 == null || clsN11 == null || clsN12 == null || clsN13 == null || clsN14 == null || clsN15 == null || clsN16 == null || clsN17 == null || clsN18 == null || clsN19 == null) {
                Log.w(Xo.KN(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodNr = s4.nr(clsN, "queryPurchasesAsync", clsN9, clsN18);
            Method methodNr2 = s4.nr(clsN9, "newBuilder", new Class[0]);
            Method methodNr3 = s4.nr(clsN12, "build", new Class[0]);
            Method methodNr4 = s4.nr(clsN12, "setProductType", String.class);
            Method methodNr5 = s4.nr(clsN2, "getOriginalJson", new Class[0]);
            Method methodNr6 = s4.nr(clsN, "queryPurchaseHistoryAsync", clsN8, clsN19);
            Method methodNr7 = s4.nr(clsN8, "newBuilder", new Class[0]);
            Method methodNr8 = s4.nr(clsN11, "build", new Class[0]);
            Method methodNr9 = s4.nr(clsN11, "setProductType", String.class);
            Method methodNr10 = s4.nr(clsN4, "getOriginalJson", new Class[0]);
            Method methodNr11 = s4.nr(clsN, "queryProductDetailsAsync", clsN7, clsN17);
            Method methodNr12 = s4.nr(clsN7, "newBuilder", new Class[0]);
            Method methodNr13 = s4.nr(clsN10, "build", new Class[0]);
            Method methodNr14 = s4.nr(clsN10, "setProductList", List.class);
            Method methodNr15 = s4.nr(clsN5, "newBuilder", new Class[0]);
            Method methodNr16 = s4.nr(clsN13, "build", new Class[0]);
            Method methodNr17 = s4.nr(clsN13, "setProductId", String.class);
            Method methodNr18 = s4.nr(clsN13, "setProductType", String.class);
            Method methodNr19 = s4.nr(clsN3, "toString", new Class[0]);
            Method methodNr20 = s4.nr(clsN, "startConnection", clsN16);
            Method methodNr21 = s4.nr(clsN6, "getResponseCode", new Class[0]);
            if (methodNr == null || methodNr2 == null || methodNr3 == null || methodNr4 == null || methodNr5 == null || methodNr6 == null || methodNr7 == null || methodNr8 == null || methodNr9 == null || methodNr10 == null || methodNr11 == null || methodNr12 == null || methodNr13 == null || methodNr14 == null || methodNr15 == null || methodNr16 == null || methodNr17 == null || methodNr18 == null || methodNr19 == null || methodNr20 == null || methodNr21 == null) {
                Log.w(Xo.KN(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objN = n(context, clsN, clsN14, clsN15);
            if (objN == null) {
                Log.w(Xo.KN(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Xo.ty(new Xo(objN, clsN, clsN2, clsN3, clsN4, clsN5, clsN6, clsN7, clsN8, clsN9, clsN10, clsN11, clsN12, clsN13, clsN16, clsN17, clsN18, clsN19, methodNr, methodNr2, methodNr3, methodNr4, methodNr5, methodNr6, methodNr7, methodNr8, methodNr9, methodNr10, methodNr11, methodNr12, methodNr13, methodNr14, methodNr15, methodNr16, methodNr17, methodNr18, methodNr19, methodNr20, methodNr21, null));
            return Xo.O();
        }

        public final Map J2() {
            return Xo.Uo();
        }

        public final Map O() {
            return Xo.J2();
        }

        public final Map t() {
            return Xo.nr();
        }
    }

    public final class n implements InvocationHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object[] f867n;

        public n(Object[] objArr) {
            this.f867n = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m2, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m2, "m");
            String name = m2.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (name.equals("onPurchaseHistoryResponse")) {
                        Xo.qie(Xo.this, this.f867n, objArr);
                        break;
                    }
                    break;
                case -1599362358:
                    if (name.equals("onQueryPurchasesResponse")) {
                        Xo.az(Xo.this, this.f867n, objArr);
                        break;
                    }
                    break;
                case -79406125:
                    if (name.equals("onBillingSetupFinished")) {
                        Xo.mUb(Xo.this, this.f867n, objArr);
                        break;
                    }
                    break;
                case 1227540564:
                    if (name.equals("onBillingServiceDisconnected")) {
                        Xo.xMQ(Xo.this, this.f867n, objArr);
                        break;
                    }
                    break;
                case 1940131955:
                    if (name.equals("onProductDetailsResponse")) {
                        Xo.gh(Xo.this, this.f867n, objArr);
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    public /* synthetic */ Xo(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    private Xo(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.f862n = obj;
        this.rl = cls;
        this.f865t = cls2;
        this.nr = cls3;
        this.f855O = cls4;
        this.J2 = cls5;
        this.Uo = cls6;
        this.KN = cls7;
        this.xMQ = cls8;
        this.mUb = cls9;
        this.gh = cls10;
        this.qie = cls11;
        this.az = cls12;
        this.ty = cls13;
        this.HI = cls14;
        this.ck = cls15;
        this.Ik = cls16;
        this.f864r = cls17;
        this.f863o = method;
        this.f859Z = method2;
        this.XQ = method3;
        this.f856S = method4;
        this.WPU = method5;
        this.aYN = method6;
        this.ViF = method7;
        this.nY = method8;
        this.f861g = method9;
        this.te = method10;
        this.iF = method11;
        this.fD = method12;
        this.E2 = method13;
        this.f860e = method14;
        this.f858X = method15;
        this.f857T = method16;
        this.f854N = method17;
        this.nHg = method18;
        this.s7N = method19;
        this.wTp = method20;
        this.f866v = method21;
    }

    public static final /* synthetic */ Map J2() {
        if (VmF.j.nr(Xo.class)) {
            return null;
        }
        try {
            return M7;
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
            return null;
        }
    }

    public static final /* synthetic */ String KN() {
        if (VmF.j.nr(Xo.class)) {
            return null;
        }
        try {
            return bzg;
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
            return null;
        }
    }

    public static final /* synthetic */ Xo O() {
        if (VmF.j.nr(Xo.class)) {
            return null;
        }
        try {
            return jB;
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
            return null;
        }
    }

    private final void S(Object[] objArr, Object[] objArr2) {
        Object orNull;
        String strIk;
        if (VmF.j.nr(this)) {
            return;
        }
        if (objArr != null) {
            try {
                orNull = ArraysKt.getOrNull(objArr, 0);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return;
            }
        } else {
            orNull = null;
        }
        Object orNull2 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
        if (orNull2 != null && (orNull2 instanceof List)) {
            Iterator it = ((List) orNull2).iterator();
            while (it.hasNext()) {
                try {
                    Object objO = s4.O(this.nr, this.s7N, it.next(), new Object[0]);
                    String str = objO instanceof String ? (String) objO : null;
                    if (str != null && (strIk = Ik(str)) != null) {
                        JSONObject jSONObject = new JSONObject(strIk);
                        if (jSONObject.has("productId")) {
                            String productId = jSONObject.getString("productId");
                            Map map = M7;
                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                            map.put(productId, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (orNull == null || !(orNull instanceof Runnable)) {
                return;
            }
            ((Runnable) orNull).run();
        }
    }

    public static final /* synthetic */ Map Uo() {
        if (VmF.j.nr(Xo.class)) {
            return null;
        }
        try {
            return P5;
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
            return null;
        }
    }

    private final void WPU(Object[] objArr, Object[] objArr2) {
        Object orNull;
        if (VmF.j.nr(this)) {
            return;
        }
        if (objArr != null) {
            try {
                orNull = ArraysKt.getOrNull(objArr, 0);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return;
            }
        } else {
            orNull = null;
        }
        if (orNull != null && (orNull instanceof s4.n)) {
            Object orNull2 = ArraysKt.getOrNull(objArr, 1);
            if (orNull2 instanceof Runnable) {
                Object orNull3 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
                if (orNull3 != null && (orNull3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) orNull3).iterator();
                    while (it.hasNext()) {
                        try {
                            Object objO = s4.O(this.f855O, this.te, it.next(), new Object[0]);
                            String str = objO instanceof String ? (String) objO : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String productId = jSONObject.getString("productId");
                                    if (!M7.containsKey(productId)) {
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        arrayList.add(productId);
                                    }
                                    if (orNull == s4.n.INAPP) {
                                        Map map = f853U;
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        map.put(productId, jSONObject);
                                    } else {
                                        Map map2 = P5;
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        map2.put(productId, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) orNull2).run();
                    } else {
                        ViF((s4.n) orNull, arrayList, (Runnable) orNull2);
                    }
                }
            }
        }
    }

    private final void aYN(Object[] objArr, Object[] objArr2) {
        Object orNull;
        if (VmF.j.nr(this)) {
            return;
        }
        if (objArr != null) {
            try {
                orNull = ArraysKt.getOrNull(objArr, 0);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return;
            }
        } else {
            orNull = null;
        }
        if (orNull != null && (orNull instanceof s4.n)) {
            Object orNull2 = ArraysKt.getOrNull(objArr, 1);
            if (orNull2 instanceof Runnable) {
                Object orNull3 = objArr2 != null ? ArraysKt.getOrNull(objArr2, 1) : null;
                if (orNull3 != null && (orNull3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) orNull3).iterator();
                    while (it.hasNext()) {
                        Object objO = s4.O(this.f865t, this.WPU, it.next(), new Object[0]);
                        String str = objO instanceof String ? (String) objO : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String productId = jSONObject.getString("productId");
                                if (!M7.containsKey(productId)) {
                                    Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                    arrayList.add(productId);
                                }
                                if (orNull == s4.n.INAPP) {
                                    Map map = f853U;
                                    Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                    map.put(productId, jSONObject);
                                } else {
                                    Map map2 = P5;
                                    Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                    map2.put(productId, jSONObject);
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) orNull2).run();
                    } else {
                        ViF((s4.n) orNull, arrayList, (Runnable) orNull2);
                    }
                }
            }
        }
    }

    public static final /* synthetic */ void az(Xo xo, Object[] objArr, Object[] objArr2) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            xo.aYN(objArr, objArr2);
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Xo this$0, s4.n productType, Runnable completionHandler) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            s4.O(this$0.rl, this$0.aYN, this$0.ck(), this$0.o(productType), Proxy.newProxyInstance(this$0.f864r.getClassLoader(), new Class[]{this$0.f864r}, this$0.new n(new Object[]{productType, completionHandler})));
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    public static final /* synthetic */ void gh(Xo xo, Object[] objArr, Object[] objArr2) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            xo.S(objArr, objArr2);
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    public static final /* synthetic */ void mUb(Xo xo, Object[] objArr, Object[] objArr2) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            xo.XQ(objArr, objArr2);
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(Xo this$0, Runnable completionHandler, s4.n productType, List productIds) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(productIds, "$productIds");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.ck.getClassLoader(), new Class[]{this$0.ck}, this$0.new n(new Object[]{completionHandler}));
            Object objR = this$0.r(productType, productIds);
            if (objR != null) {
                s4.O(this$0.rl, this$0.iF, this$0.ck(), objR, objNewProxyInstance);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    public static final /* synthetic */ Map nr() {
        if (VmF.j.nr(Xo.class)) {
            return null;
        }
        try {
            return f853U;
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
            return null;
        }
    }

    public static final /* synthetic */ void qie(Xo xo, Object[] objArr, Object[] objArr2) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            xo.WPU(objArr, objArr2);
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    public static final /* synthetic */ void ty(Xo xo) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            jB = xo;
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    public static final /* synthetic */ void xMQ(Xo xo, Object[] objArr, Object[] objArr2) {
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            xo.Z(objArr, objArr2);
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    private final void HI(Runnable runnable) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (Xw.get()) {
                runnable.run();
            } else {
                te(runnable);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void ViF(final s4.n nVar, final List list, final Runnable runnable) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            HI(new Runnable() { // from class: CKP.Pl
                @Override // java.lang.Runnable
                public final void run() {
                    Xo.nY(this.f848n, runnable, nVar, list);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void XQ(Object[] objArr, Object[] objArr2) {
        Runnable runnable;
        if (!VmF.j.nr(this) && objArr2 != null) {
            try {
                if (objArr2.length != 0) {
                    if (Intrinsics.areEqual(s4.O(this.Uo, this.f866v, objArr2[0], new Object[0]), (Object) 0)) {
                        Xw.set(true);
                        if (objArr != null && objArr.length != 0) {
                            Object obj = objArr[0];
                            if ((obj instanceof Runnable) && (runnable = (Runnable) obj) != null) {
                                runnable.run();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void Z(Object[] objArr, Object[] objArr2) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Xw.set(false);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final Object o(s4.n nVar) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return s4.O(this.qie, this.nY, s4.O(this.qie, this.f861g, s4.O(this.xMQ, this.ViF, null, new Object[0]), nVar.rl()), new Object[0]);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final Object r(s4.n nVar, List list) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Object objO = s4.O(this.ty, this.f857T, s4.O(this.ty, this.nHg, s4.O(this.ty, this.f854N, s4.O(this.J2, this.f858X, null, new Object[0]), str), nVar.rl()), new Object[0]);
                if (objO != null) {
                    arrayList.add(objO);
                }
            }
            return s4.O(this.gh, this.E2, s4.O(this.gh, this.f860e, s4.O(this.KN, this.fD, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final void te(Runnable runnable) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            s4.O(this.rl, this.wTp, ck(), Proxy.newProxyInstance(this.HI.getClassLoader(), new Class[]{this.HI}, new n(new Object[]{runnable})));
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final String Ik(String productDetailsString) {
        List<String> groupValues;
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(productDetailsString, "productDetailsString");
            MatchResult matchResultFind$default = Regex.find$default(new Regex("jsonString='(.*?)'"), productDetailsString, 0, 2, null);
            if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(groupValues, 1);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public Object ck() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return this.f862n;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    @Override // CKP.Dsr
    public void n(final s4.n productType, final Runnable completionHandler) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            HI(new Runnable() { // from class: CKP.qz
                @Override // java.lang.Runnable
                public final void run() {
                    Xo.g(this.f901n, productType, completionHandler);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
