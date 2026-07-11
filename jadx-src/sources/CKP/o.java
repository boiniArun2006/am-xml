package CKP;

import CKP.s4;
import android.content.Context;
import android.util.Log;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class o implements Dsr {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static o f889o;
    private final Method HI;
    private final Class J2;
    private final Class KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Class f891O;
    private final Class Uo;
    private final Method az;
    private final C1318c ck;
    private final Method gh;
    private final Method mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f892n;
    private final Class nr;
    private final Method qie;
    private final Class rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f893t;
    private final Method ty;
    private final Method xMQ;
    public static final n Ik = new n(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f890r = o.class.getCanonicalName();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final AtomicBoolean f888Z = new AtomicBoolean(false);
    private static final Map XQ = new ConcurrentHashMap();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Map f887S = new ConcurrentHashMap();
    private static final Map WPU = new ConcurrentHashMap();

    public final class I28 implements InvocationHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Runnable f894n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ o f895t;

        public I28(o oVar, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.f895t = oVar;
            this.f894n = completionHandler;
        }

        public void n(Object proxy, Method m2, Object[] objArr) {
            if (VmF.j.nr(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m2, "m");
                if (Intrinsics.areEqual(m2.getName(), "onSkuDetailsResponse")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objO = s4.O(o.xMQ(this.f895t), o.O(this.f895t), it.next(), new Object[0]);
                                String str = objO instanceof String ? (String) objO : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String skuID = jSONObject.getString("productId");
                                        Map mapO = o.Ik.O();
                                        Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                        mapO.put(skuID, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.f894n.run();
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                n(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized o nr(Context context) {
            o oVarUo;
            Intrinsics.checkNotNullParameter(context, "context");
            oVarUo = o.Uo();
            if (oVarUo == null) {
                oVarUo = rl(context);
            }
            return oVarUo;
        }

        private n() {
        }

        private final Object n(Context context, Class cls) {
            Object objO;
            Object objO2;
            Object objO3;
            Class clsN = s4.n("com.android.billingclient.api.BillingClient$Builder");
            Class clsN2 = s4.n("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsN != null && clsN2 != null) {
                Method methodNr = s4.nr(cls, "newBuilder", Context.class);
                Method methodNr2 = s4.nr(clsN, "enablePendingPurchases", new Class[0]);
                Method methodNr3 = s4.nr(clsN, "setListener", clsN2);
                Method methodNr4 = s4.nr(clsN, "build", new Class[0]);
                if (methodNr == null || methodNr2 == null || methodNr3 == null || methodNr4 == null || (objO = s4.O(cls, methodNr, null, context)) == null || (objO2 = s4.O(clsN, methodNr3, objO, Proxy.newProxyInstance(clsN2.getClassLoader(), new Class[]{clsN2}, new Ml()))) == null || (objO3 = s4.O(clsN, methodNr2, objO2, new Object[0])) == null) {
                    return null;
                }
                return s4.O(clsN, methodNr4, objO3, new Object[0]);
            }
            return null;
        }

        private final o rl(Context context) {
            C1318c c1318cRl = C1318c.Uo.rl();
            if (c1318cRl == null) {
                return null;
            }
            Class clsN = s4.n(PtsLKY.iUwzo);
            Class clsN2 = s4.n("com.android.billingclient.api.Purchase");
            Class clsN3 = s4.n(HrvQKfmFZJudBc.AIp);
            Class clsN4 = s4.n("com.android.billingclient.api.SkuDetails");
            Class clsN5 = s4.n("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsN6 = s4.n("com.android.billingclient.api.SkuDetailsResponseListener");
            Class clsN7 = s4.n("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsN == null || clsN3 == null || clsN2 == null || clsN4 == null || clsN6 == null || clsN5 == null || clsN7 == null) {
                Log.w(o.qie(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodNr = s4.nr(clsN, "queryPurchases", String.class);
            Method methodNr2 = s4.nr(clsN3, "getPurchasesList", new Class[0]);
            Method methodNr3 = s4.nr(clsN2, "getOriginalJson", new Class[0]);
            Method methodNr4 = s4.nr(clsN4, "getOriginalJson", new Class[0]);
            Method methodNr5 = s4.nr(clsN5, "getOriginalJson", new Class[0]);
            Method methodNr6 = s4.nr(clsN, "querySkuDetailsAsync", c1318cRl.nr(), clsN6);
            Method methodNr7 = s4.nr(clsN, "queryPurchaseHistoryAsync", String.class, clsN7);
            if (methodNr == null || methodNr2 == null || methodNr3 == null || methodNr4 == null || methodNr5 == null || methodNr6 == null || methodNr7 == null) {
                Log.w(o.qie(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objN = n(context, clsN);
            if (objN == null) {
                Log.w(o.qie(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            o.HI(new o(objN, clsN, clsN3, clsN2, clsN4, clsN5, clsN6, clsN7, methodNr, methodNr2, methodNr3, methodNr4, methodNr5, methodNr6, methodNr7, c1318cRl, null));
            return o.Uo();
        }

        public final Map J2() {
            return o.gh();
        }

        public final Map O() {
            return o.mUb();
        }

        public final AtomicBoolean Uo() {
            return o.az();
        }

        public final Map t() {
            return o.J2();
        }
    }

    public final class w6 implements InvocationHandler {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ o f897O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private s4.n f898n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Runnable f899t;

        public w6(o oVar, s4.n skuType, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.f897O = oVar;
            this.f898n = skuType;
            this.f899t = completionHandler;
        }

        public void n(Object proxy, Method method, Object[] objArr) {
            if (VmF.j.nr(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                    Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objO = s4.O(o.KN(this.f897O), o.nr(this.f897O), it.next(), new Object[0]);
                                String str = objO instanceof String ? (String) objO : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String skuID = jSONObject.getString("productId");
                                        Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                        arrayList.add(skuID);
                                        if (this.f898n == s4.n.INAPP) {
                                            o.Ik.t().put(skuID, jSONObject);
                                        } else {
                                            o.Ik.J2().put(skuID, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            this.f899t.run();
                        } else {
                            o.ty(this.f897O, this.f898n, arrayList, this.f899t);
                        }
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                n(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return null;
            }
        }
    }

    public /* synthetic */ o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C1318c c1318c, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, c1318c);
    }

    public static final class Ml implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m2, Object[] objArr) {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m2, "m");
                return null;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return null;
            }
        }
    }

    public static final class j implements InvocationHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Runnable f896n;

        public j(Runnable runnable) {
            this.f896n = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m2, Object[] objArr) {
            Object orNull;
            Method methodNr;
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m2, "m");
                if (Intrinsics.areEqual(m2.getName(), "onBillingSetupFinished")) {
                    if (objArr != null) {
                        orNull = ArraysKt.getOrNull(objArr, 0);
                    } else {
                        orNull = null;
                    }
                    Class clsN = s4.n("com.android.billingclient.api.BillingResult");
                    if (clsN != null && (methodNr = s4.nr(clsN, "getResponseCode", new Class[0])) != null && Intrinsics.areEqual(s4.O(clsN, methodNr, orNull, new Object[0]), (Object) 0)) {
                        o.Ik.Uo().set(true);
                        Runnable runnable = this.f896n;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (StringsKt.endsWith$default(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                        o.Ik.Uo().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return null;
            }
        }
    }

    private o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C1318c c1318c) {
        this.f892n = obj;
        this.rl = cls;
        this.f893t = cls2;
        this.nr = cls3;
        this.f891O = cls4;
        this.J2 = cls5;
        this.Uo = cls6;
        this.KN = cls7;
        this.xMQ = method;
        this.mUb = method2;
        this.gh = method3;
        this.qie = method4;
        this.az = method5;
        this.ty = method6;
        this.HI = method7;
        this.ck = c1318c;
    }

    public static final /* synthetic */ void HI(o oVar) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            f889o = oVar;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public static final /* synthetic */ Map J2() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return XQ;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Class KN(o oVar) {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return oVar.J2;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Method O(o oVar) {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return oVar.qie;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ o Uo() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return f889o;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(o this$0, Runnable completionHandler, s4.n skuType, List skuIDs) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            Intrinsics.checkNotNullParameter(skuType, "$skuType");
            Intrinsics.checkNotNullParameter(skuIDs, "$skuIDs");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.Uo.getClassLoader(), new Class[]{this$0.Uo}, new I28(this$0, completionHandler));
            s4.O(this$0.rl, this$0.ty, this$0.Ik(), this$0.ck.t(skuType, skuIDs), objNewProxyInstance);
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public static final /* synthetic */ AtomicBoolean az() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return f888Z;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Map gh() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return f887S;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Map mUb() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return WPU;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Method nr(o oVar) {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return oVar.az;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ String qie() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return f890r;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(o this$0, s4.n productType, Runnable completionHandler) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            s4.O(this$0.rl, this$0.HI, this$0.Ik(), productType.rl(), Proxy.newProxyInstance(this$0.KN.getClassLoader(), new Class[]{this$0.KN}, new w6(this$0, productType, completionHandler)));
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public static final /* synthetic */ void ty(o oVar, s4.n nVar, List list, Runnable runnable) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            oVar.o(nVar, list, runnable);
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public static final /* synthetic */ Class xMQ(o oVar) {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return oVar.f891O;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    private final void XQ(Runnable runnable) {
        Method methodNr;
        if (!VmF.j.nr(this)) {
            try {
                Class clsN = s4.n("com.android.billingclient.api.BillingClientStateListener");
                if (clsN == null || (methodNr = s4.nr(this.rl, "startConnection", clsN)) == null) {
                    return;
                }
                s4.O(this.rl, methodNr, Ik(), Proxy.newProxyInstance(clsN.getClassLoader(), new Class[]{clsN}, new j(runnable)));
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void ck(Runnable runnable) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (f888Z.get()) {
                runnable.run();
            } else {
                XQ(runnable);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void o(final s4.n nVar, final List list, final Runnable runnable) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            ck(new Runnable() { // from class: CKP.C
                @Override // java.lang.Runnable
                public final void run() {
                    o.Z(this.f840n, runnable, nVar, list);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public Object Ik() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return this.f892n;
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
            ck(new Runnable() { // from class: CKP.aC
                @Override // java.lang.Runnable
                public final void run() {
                    o.r(this.f870n, productType, completionHandler);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
