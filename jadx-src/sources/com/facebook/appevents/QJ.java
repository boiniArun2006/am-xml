package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.appevents.QJ;
import com.facebook.appevents.Xo;
import com.facebook.appevents.vd;
import com.facebook.internal.C1869z;
import com.facebook.internal.Pl;
import com.facebook.internal.SPz;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class QJ {
    private static Xo.n J2;
    private static String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f52288O;
    private static final Object Uo;
    private static String mUb;
    private static final String nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52289t = new j(null);
    private static boolean xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f52290n;
    private com.facebook.appevents.j rl;

    public static final class j {

        /* JADX INFO: renamed from: com.facebook.appevents.QJ$j$j, reason: collision with other inner class name */
        public static final class C0740j implements SPz.j {
            @Override // com.facebook.internal.SPz.j
            public void n(String str) {
                QJ.f52289t.XQ(str);
            }

            C0740j() {
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void HI(Context context, QJ logger) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i2 = 0;
            for (int i3 = 0; i3 < 11; i3++) {
                String str = strArr[i3];
                String str2 = strArr2[i3];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i2 |= 1 << i3;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                logger.ck("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik() {
            HashSet hashSet = new HashSet();
            Iterator it = qz.ck().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.facebook.appevents.j) it.next()).rl());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                com.facebook.internal.UGc.XQ((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o(String str) {
            com.facebook.internal.Z.f52780O.rl(com.facebook.Ew.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void J2(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (!com.facebook.s4.e()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            w6.nr();
            Zs.O();
            if (str == null) {
                str = com.facebook.s4.az();
            }
            com.facebook.s4.s7N(application, str);
            UiE.CN3.nY(application, str);
            if (com.facebook.internal.Pl.Uo(Pl.n.GPSPACAProcessing)) {
                bLe.I28.f43264n.O(str, "fb_mobile_app_install");
            }
        }

        public final String mUb(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (QJ.n() == null) {
                synchronized (QJ.O()) {
                    try {
                        if (QJ.n() == null) {
                            QJ.KN(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (QJ.n() == null) {
                                QJ.KN("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", QJ.n()).apply();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String strN = QJ.n();
            if (strN != null) {
                return strN;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String qie() {
            com.facebook.internal.SPz.nr(new C0740j());
            return com.facebook.s4.qie().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final void ty(final Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (com.facebook.s4.ck()) {
                final QJ qj = new QJ(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorRl = QJ.rl();
                if (scheduledThreadPoolExecutorRl == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorRl.execute(new Runnable() { // from class: com.facebook.appevents.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        QJ.j.HI(context, qj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ck() {
            synchronized (QJ.O()) {
                if (QJ.rl() != null) {
                    return;
                }
                QJ.xMQ(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.INSTANCE;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.eO
                    @Override // java.lang.Runnable
                    public final void run() {
                        QJ.j.Ik();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorRl = QJ.rl();
                if (scheduledThreadPoolExecutorRl != null) {
                    scheduledThreadPoolExecutorRl.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(Ml ml, com.facebook.appevents.j jVar) {
            qz.Uo(jVar, ml);
            if (com.facebook.internal.Pl.Uo(Pl.n.OnDevicePostInstallEventProcessing) && w1x.w6.nr()) {
                w1x.w6.O(jVar.rl(), ml);
            }
            if (com.facebook.internal.Pl.Uo(Pl.n.GPSARATriggers)) {
                Ff.n.f2785n.xMQ(jVar.rl(), ml);
            }
            if (com.facebook.internal.Pl.Uo(Pl.n.GPSPACAProcessing)) {
                bLe.I28.f43264n.nr(jVar.rl(), ml);
            }
            if (!ml.rl() && !QJ.J2()) {
                if (Intrinsics.areEqual(ml.J2(), "fb_mobile_activate_app")) {
                    QJ.Uo(true);
                } else {
                    com.facebook.internal.Z.f52780O.rl(com.facebook.Ew.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        public final void KN() {
            if (gh() != Xo.n.EXPLICIT_ONLY) {
                qz.qie(lej.EAGER_FLUSHING_EVENT);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair Uo(Bundle bundle, vd vdVar, boolean z2) {
            String str;
            String str2;
            vd.j jVar;
            String str3;
            if (!UiE.C.Uo()) {
                str = "0";
            } else {
                str = "1";
            }
            vd.j jVar2 = vd.rl;
            Lu lu = Lu.IAPParameters;
            Pair pairRl = jVar2.rl(lu, "is_implicit_purchase_logging_enabled", str, bundle, vdVar);
            Object objT = jVar2.t(lu, "fb_iap_product_id", bundle, vdVar);
            String string = null;
            if (objT instanceof String) {
                str2 = (String) objT;
            } else {
                str2 = null;
            }
            if (!z2) {
                if (bundle != null) {
                    string = bundle.getString("fb_content_id");
                }
                if (string == null && str2 != null) {
                    jVar = jVar2;
                    Pair pairRl2 = jVar.rl(lu, "fb_content_id", str2, bundle, vdVar);
                    pairRl = jVar.rl(lu, "android_dynamic_ads_content_id", "client_manual", (Bundle) pairRl2.getFirst(), (vd) pairRl2.getSecond());
                }
            } else {
                jVar = jVar2;
            }
            Bundle bundle2 = (Bundle) pairRl.getFirst();
            vd vdVar2 = (vd) pairRl.getSecond();
            if (!com.facebook.M.J2()) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            Pair pairRl3 = jVar.rl(lu, "is_autolog_app_events_enabled", str3, bundle2, vdVar2);
            return new Pair((Bundle) pairRl3.getFirst(), (vd) pairRl3.getSecond());
        }

        public final void XQ(String str) {
            SharedPreferences sharedPreferences = com.facebook.s4.qie().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        public final void Z() {
            qz.o();
        }

        public final String az() {
            String strNr;
            synchronized (QJ.O()) {
                strNr = QJ.nr();
            }
            return strNr;
        }

        public final Xo.n gh() {
            Xo.n nVarT;
            synchronized (QJ.O()) {
                nVarT = QJ.t();
            }
            return nVarT;
        }

        public final Executor xMQ() {
            if (QJ.rl() == null) {
                ck();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorRl = QJ.rl();
            if (scheduledThreadPoolExecutorRl != null) {
                return scheduledThreadPoolExecutorRl;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public QJ(String activityName, String str, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        com.facebook.internal.Lu.qie();
        this.f52290n = activityName;
        accessToken = accessToken == null ? AccessToken.INSTANCE.O() : accessToken;
        if (accessToken == null || accessToken.ty() || !(str == null || Intrinsics.areEqual(str, accessToken.getApplicationId()))) {
            str = str == null ? com.facebook.internal.vd.s7N(com.facebook.s4.qie()) : str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.rl = new com.facebook.appevents.j(null, str);
        } else {
            this.rl = new com.facebook.appevents.j(accessToken);
        }
        f52289t.ck();
    }

    static {
        String canonicalName = QJ.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        nr = canonicalName;
        J2 = Xo.n.AUTO;
        Uo = new Object();
    }

    public static final /* synthetic */ boolean J2() {
        if (VmF.j.nr(QJ.class)) {
            return false;
        }
        try {
            return xMQ;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return false;
        }
    }

    public static final /* synthetic */ void KN(String str) {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            KN = str;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final /* synthetic */ Object O() {
        if (VmF.j.nr(QJ.class)) {
            return null;
        }
        try {
            return Uo;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return null;
        }
    }

    public static final /* synthetic */ void Uo(boolean z2) {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            xMQ = z2;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final /* synthetic */ String n() {
        if (VmF.j.nr(QJ.class)) {
            return null;
        }
        try {
            return KN;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return null;
        }
    }

    public static final /* synthetic */ String nr() {
        if (VmF.j.nr(QJ.class)) {
            return null;
        }
        try {
            return mUb;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor rl() {
        if (VmF.j.nr(QJ.class)) {
            return null;
        }
        try {
            return f52288O;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return null;
        }
    }

    public static final /* synthetic */ Xo.n t() {
        if (VmF.j.nr(QJ.class)) {
            return null;
        }
        try {
            return J2;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
            return null;
        }
    }

    public static /* synthetic */ void ty(QJ qj, String str, Double d2, Bundle bundle, boolean z2, UUID uuid, vd vdVar, int i2, Object obj) {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        if ((i2 & 32) != 0) {
            vdVar = null;
        }
        try {
            qj.az(str, d2, bundle, z2, uuid, vdVar);
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    public static final /* synthetic */ void xMQ(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (VmF.j.nr(QJ.class)) {
            return;
        }
        try {
            f52288O = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            VmF.j.rl(th, QJ.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void az(String str, Double d2, Bundle bundle, boolean z2, UUID uuid, vd vdVar) {
        Bundle bundle2;
        vd vdVar2 = vdVar;
        if (VmF.j.nr(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z2 && UiE.C.Uo() && (Intrinsics.areEqual(str, "fb_mobile_purchase") || Intrinsics.areEqual(str, "Subscribe") || Intrinsics.areEqual(str, "StartTrial"))) {
                Log.w(nr, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((com.facebook.internal.Pl.Uo(Pl.n.AndroidManualImplicitPurchaseDedupe) && Intrinsics.areEqual(str, "fb_mobile_purchase")) || (com.facebook.internal.Pl.Uo(Pl.n.AndroidManualImplicitSubsDedupe) && (Intrinsics.areEqual(str, "Subscribe") || Intrinsics.areEqual(str, "StartTrial")))) {
                    CKP.eO eOVar = CKP.eO.f876n;
                    Double dUo = eOVar.Uo(d2, bundle);
                    Currency currencyRl = eOVar.rl(bundle);
                    if (dUo != null && currencyRl != null) {
                        Pair pairN = eOVar.n(CKP.l3D.J2(CollectionsKt.listOf(new CKP.j(str, dUo.doubleValue(), currencyRl)), System.currentTimeMillis(), false, CollectionsKt.listOf(new Pair(bundle, vdVar2))), bundle, vdVar2);
                        Bundle bundle3 = (Bundle) pairN.component1();
                        vdVar2 = (vd) pairN.component2();
                        bundle2 = bundle3;
                    }
                }
            } else {
                bundle2 = bundle;
            }
            if (C1869z.nr("app_events_killswitch", com.facebook.s4.az(), false)) {
                com.facebook.internal.Z.f52780O.t(com.facebook.Ew.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            if (zx.n.rl(str)) {
                return;
            }
            j jVar = f52289t;
            Pair pairUo = jVar.Uo(bundle2, vdVar2, z2);
            Bundle bundle4 = (Bundle) pairUo.component1();
            vd vdVar3 = (vd) pairUo.component2();
            try {
                try {
                    if (!zx.I28.f76720n.Uo(bundle4)) {
                        zx.CN3.t(bundle4, str);
                    }
                    zx.j.nr(bundle4);
                    zx.Ml.KN(bundle4, str);
                    zx.fuX.Uo(bundle4);
                    zx.I28.J2(bundle4);
                    jVar.r(new Ml(this.f52290n, str, d2, bundle4, z2, UiE.CN3.ck(), uuid, vdVar3), this.rl);
                } catch (JSONException e2) {
                    com.facebook.internal.Z.f52780O.t(com.facebook.Ew.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
                }
            } catch (FacebookException e3) {
                com.facebook.internal.Z.f52780O.t(com.facebook.Ew.APP_EVENTS, "AppEvents", "Invalid app event: %s", e3.toString());
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void HI(String str, String str2) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            qie(str, bundle);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void Ik(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, vd vdVar) {
        Throwable th;
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (bigDecimal != null && currency != null) {
                if (bundle == null) {
                    try {
                        bundle = new Bundle();
                    } catch (Throwable th2) {
                        th = th2;
                        VmF.j.rl(th, this);
                        return;
                    }
                }
                Bundle bundle2 = bundle;
                try {
                    bundle2.putString("fb_currency", currency.getCurrencyCode());
                    az(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, UiE.CN3.ty(), vdVar);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    VmF.j.rl(th, this);
                    return;
                }
            }
            com.facebook.internal.vd.piY(nr, "purchaseAmount and currency cannot be null");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void ck(String str, Double d2, Bundle bundle) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            try {
                ty(this, str, d2, bundle, true, UiE.CN3.ty(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                VmF.j.rl(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void gh(String str, double d2, Bundle bundle) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            try {
                ty(this, str, Double.valueOf(d2), bundle, false, UiE.CN3.ty(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                VmF.j.rl(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void mUb() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            qz.qie(lej.EXPLICIT);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void o(BigDecimal bigDecimal, Currency currency, Bundle bundle, vd vdVar) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            r(bigDecimal, currency, bundle, true, vdVar);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void qie(String str, Bundle bundle) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            try {
                ty(this, str, null, bundle, false, UiE.CN3.ty(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                VmF.j.rl(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z2, vd vdVar) {
        Throwable th;
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f52289t.o("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f52289t.o("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                try {
                    az("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z2, UiE.CN3.ty(), vdVar);
                    f52289t.KN();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    VmF.j.rl(th, this);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public QJ(Context context, String str, AccessToken accessToken) {
        this(com.facebook.internal.vd.XQ(context), str, accessToken);
    }
}
