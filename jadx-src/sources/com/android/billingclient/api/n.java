package com.android.billingclient.api;

import OS.InterfaceC1422c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.CN3;
import com.android.billingclient.api.Wre;
import com.android.billingclient.api.w6;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zzcx;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfn;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class n extends j {
    private volatile zzev E2;
    private boolean HI;
    private boolean Ik;
    private Context J2;
    private volatile zzan KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile psW f47620O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f47621S;
    private qf Uo;
    private boolean ViF;
    private boolean WPU;
    private boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f47622Z;
    private boolean aYN;
    private boolean az;
    private boolean ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f47623e;
    private ExecutorService fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47624g;
    private boolean gh;
    private boolean iF;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f47625n;
    private boolean nY;
    private final Handler nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47626o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f47627r;
    private volatile int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f47628t;
    private I28 te;
    private boolean ty;
    private volatile ServiceConnectionC1767c xMQ;

    n(String str, Context context, qf qfVar, ExecutorService executorService) {
        this.f47625n = new Object();
        this.rl = 0;
        this.nr = new Handler(Looper.getMainLooper());
        this.qie = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f47623e = lValueOf;
        String strNHg = nHg();
        this.f47628t = strNHg;
        this.J2 = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(strNHg);
        zzksVarZzc.zzn(this.J2.getPackageName());
        zzksVarZzc.zzm(lValueOf.longValue());
        this.Uo = new lej(this.J2, (zzku) zzksVarZzc.zzf());
        this.J2.getPackageName();
    }

    private static final String M7(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private final String N(CN3 cn3) {
        if (TextUtils.isEmpty(null)) {
            return this.J2.getPackageName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ml T() {
        int[] iArr = {0, 3};
        synchronized (this.f47625n) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (this.rl == iArr[i2]) {
                    return Ln.az;
                }
            }
            return Ln.gh;
        }
    }

    private final synchronized ExecutorService s7N() {
        try {
            if (this.fD == null) {
                this.fD = Executors.newFixedThreadPool(zze.zza, new Xo(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.fD;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.android.billingclient");
        p0.startActivity(p1);
    }

    final synchronized zzev EWS() {
        try {
            if (this.E2 == null) {
                this.E2 = zzfb.zza(s7N());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.E2;
    }

    final qf Org() {
        return this.Uo;
    }

    final /* synthetic */ Bundle eWT(int i2, String str, String str2, w6 w6Var, Bundle bundle) {
        zzan zzanVar;
        try {
            synchronized (this.f47625n) {
                zzanVar = this.KN;
            }
            return zzanVar == null ? zze.zzn(Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : zzanVar.zzg(i2, this.J2.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e2) {
            return zze.zzo(Ln.az, 5, u.n(e2));
        } catch (Exception e3) {
            return zze.zzo(Ln.gh, 5, u.n(e3));
        }
    }

    final /* synthetic */ Bundle ul(String str, String str2) {
        zzan zzanVar;
        try {
            synchronized (this.f47625n) {
                zzanVar = this.KN;
            }
            return zzanVar == null ? zze.zzn(Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : zzanVar.zzf(3, this.J2.getPackageName(), str, str2, null);
        } catch (DeadObjectException e2) {
            return zze.zzo(Ln.az, 5, u.n(e2));
        } catch (Exception e3) {
            return zze.zzo(Ln.gh, 5, u.n(e3));
        }
    }

    private final void B(OS.C c2, String str, Ml ml, int i2, String str2, Exception exc) {
        zze.zzm("BillingClient", str2, exc);
        Mx(i2, 4, ml, u.n(exc));
        c2.n(ml, str);
    }

    private final OS.vd E(int i2, Ml ml, int i3, String str, Exception exc) {
        Mx(i3, 9, ml, u.n(exc));
        zze.zzm("BillingClient", str, exc);
        return new OS.vd(ml, null);
    }

    private final void FX(OS.n nVar, Ml ml, int i2, Exception exc) {
        zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        Mx(i2, 3, ml, u.n(exc));
        nVar.n(ml);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OS.vd M(String str, int i2) {
        zzan zzanVar;
        n nVar = this;
        zze.zzk("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzd = zze.zzd(nVar.HI, nVar.WPU, nVar.te.n(), nVar.te.rl(), nVar.f47628t, nVar.f47623e.longValue());
        String string = null;
        do {
            try {
                synchronized (nVar.f47625n) {
                    zzanVar = nVar.KN;
                }
                if (zzanVar == null) {
                    return nVar.E(9, Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service has been reset to null", null);
                }
                Bundle bundleZzj = nVar.HI ? zzanVar.zzj(true != nVar.WPU ? 9 : 19, nVar.J2.getPackageName(), str, string, bundleZzd) : zzanVar.zzi(3, nVar.J2.getPackageName(), str, string);
                Lu luN = h.n(bundleZzj, "BillingClient", "getPurchase()");
                Ml mlN = luN.n();
                if (mlN != Ln.qie) {
                    return nVar.E(9, mlN, luN.rl(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = false;
                for (int i3 = 0; i3 < stringArrayList2.size(); i3++) {
                    String str2 = stringArrayList2.get(i3);
                    String str3 = stringArrayList3.get(i3);
                    zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.Uo())) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z2 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        return E(9, Ln.gh, 51, "Got an exception trying to decode the purchase!", e2);
                    }
                }
                nVar = this;
                if (z2) {
                    nVar.C(26, 9, Ln.gh);
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e3) {
                return E(9, Ln.az, 52, "Got exception trying to get purchases try to reconnect", e3);
            } catch (Exception e4) {
                return nVar.E(9, Ln.gh, 52, "Got exception trying to get purchases try to reconnect", e4);
            }
        } while (!TextUtils.isEmpty(string));
        return new OS.vd(Ln.qie, arrayList);
    }

    private final boolean P5() {
        return this.WPU && this.te.rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void U() {
        synchronized (this.f47625n) {
            if (this.xMQ != null) {
                try {
                    this.J2.unbindService(this.xMQ);
                } catch (Throwable th) {
                    try {
                        zze.zzm("BillingClient", "There was an exception while unbinding service!", th);
                        this.KN = null;
                        this.xMQ = null;
                    } finally {
                        this.KN = null;
                        this.xMQ = null;
                    }
                }
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean dR0(n nVar) {
        boolean z2;
        synchronized (nVar.f47625n) {
            z2 = true;
            if (nVar.rl != 1) {
                z2 = false;
            }
        }
        return z2;
    }

    private final UGc eF(Ml ml, int i2, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        Mx(i2, 11, ml, u.n(exc));
        return new UGc(ml, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jB(int i2) {
        synchronized (this.f47625n) {
            try {
                if (this.rl == 3) {
                    return;
                }
                zze.zzk("BillingClient", "Setting clientState from " + M7(this.rl) + " to " + M7(i2));
                this.rl = i2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String nHg() {
        try {
            return (String) l4.j.class.getField(t.f62339e).get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    private final s4 p5(Ml ml, int i2, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        Mx(i2, 7, ml, u.n(exc));
        return new s4(ml.rl(), ml.n(), new ArrayList());
    }

    private final Ml pJg() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzkbVarZzc = zzkd.zzc();
        zzkbVarZzc.zzn(6);
        zzlv zzlvVarZzc = zzlx.zzc();
        zzlvVarZzc.zza(true);
        zzkbVarZzc.zzm(zzlvVarZzc);
        rV9((zzkd) zzkbVarZzc.zzf());
        return Ln.qie;
    }

    private final void rV9(zzkd zzkdVar) {
        try {
            this.Uo.Uo(zzkdVar, this.qie);
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    private final void v(zzjz zzjzVar) {
        try {
            this.Uo.t(zzjzVar, this.qie);
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UGc xg(String str) {
        zzan zzanVar;
        zze.zzk("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzd = zze.zzd(this.HI, this.WPU, this.te.n(), this.te.rl(), this.f47628t, this.f47623e.longValue());
        String string = null;
        while (this.az) {
            try {
                synchronized (this.f47625n) {
                    zzanVar = this.KN;
                }
                if (zzanVar == null) {
                    return eF(Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service reset to null", null);
                }
                Bundle bundleZzh = zzanVar.zzh(6, this.J2.getPackageName(), str, string, bundleZzd);
                Lu luN = h.n(bundleZzh, "BillingClient", "getPurchaseHistory()");
                Ml mlN = luN.n();
                if (mlN != Ln.qie) {
                    C(luN.rl(), 11, mlN);
                    return new UGc(mlN, null);
                }
                ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    zze.zzk("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.nr())) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z2 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e2) {
                        return eF(Ln.gh, 51, "Got an exception trying to decode the purchase!", e2);
                    }
                }
                if (z2) {
                    C(26, 11, Ln.gh);
                }
                string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new UGc(Ln.qie, arrayList);
                }
            } catch (DeadObjectException e3) {
                return eF(Ln.az, 59, "Got exception trying to get purchase history", e3);
            } catch (Exception e4) {
                return eF(Ln.gh, 59, "Got exception trying to get purchase history", e4);
            }
        }
        zze.zzl("BillingClient", "getPurchaseHistory is not supported on current device");
        return new UGc(Ln.Ik, null);
    }

    final /* synthetic */ void D(OS.n nVar) {
        Ml ml = Ln.ty;
        C(24, 3, ml);
        nVar.n(ml);
    }

    final /* synthetic */ void GR(OS.Pl pl) {
        Ml ml = Ln.ty;
        C(24, 7, ml);
        pl.n(ml, new ArrayList());
    }

    final /* synthetic */ void I(OS.C c2, OS.aC aCVar) {
        Ml ml = Ln.ty;
        C(24, 4, ml);
        c2.n(ml, aCVar.n());
    }

    @Override // com.android.billingclient.api.j
    public void KN(OS.Dsr dsr) {
        Ml mlPJg;
        synchronized (this.f47625n) {
            try {
                if (mUb()) {
                    mlPJg = pJg();
                } else if (this.rl == 1) {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    mlPJg = Ln.f47540O;
                    C(37, 6, mlPJg);
                } else if (this.rl == 3) {
                    zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    mlPJg = Ln.az;
                    C(38, 6, mlPJg);
                } else {
                    jB(1);
                    U();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.xMQ = new ServiceConnectionC1767c(this, dsr, null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.J2.getPackageManager().queryIntentServices(intent, 0);
                    int i2 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        jB(0);
                        zze.zzk("BillingClient", "Billing service unavailable on device.");
                        mlPJg = Ln.f47549t;
                        C(i2, 6, mlPJg);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i2 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f47628t);
                                synchronized (this.f47625n) {
                                    try {
                                        if (this.rl == 2) {
                                            mlPJg = pJg();
                                        } else if (this.rl != 1) {
                                            zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            mlPJg = Ln.az;
                                            C(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 6, mlPJg);
                                        } else {
                                            ServiceConnectionC1767c serviceConnectionC1767c = this.xMQ;
                                            if (this.J2.bindService(intent2, serviceConnectionC1767c, 1)) {
                                                zze.zzk("BillingClient", "Service was bonded successfully.");
                                                mlPJg = null;
                                            } else {
                                                zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i2 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        jB(0);
                        zze.zzk("BillingClient", "Billing service unavailable on device.");
                        mlPJg = Ln.f47549t;
                        C(i2, 6, mlPJg);
                    }
                }
            } finally {
            }
        }
        if (mlPJg != null) {
            dsr.n(mlPJg);
        }
    }

    final /* synthetic */ void Nxk(OS.eO eOVar) {
        Ml ml = Ln.ty;
        C(24, 11, ml);
        eOVar.n(ml, null);
    }

    final s4 Rl(CN3 cn3) {
        zzan zzanVar;
        ArrayList arrayList = new ArrayList();
        String strT = cn3.t();
        zzco zzcoVarRl = cn3.rl();
        int size = zzcoVarRl.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(zzcoVarRl.subList(i2, i3 > size ? size : i3));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(((CN3.n) arrayList2.get(i5)).rl());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f47628t);
            try {
                synchronized (this.f47625n) {
                    zzanVar = this.KN;
                }
                if (zzanVar == null) {
                    return p5(Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service has been reset to null.", null);
                }
                boolean z2 = true;
                int i7 = true != this.aYN ? 17 : 20;
                String packageName = this.J2.getPackageName();
                boolean zP5 = P5();
                String str = this.f47628t;
                N(cn3);
                N(cn3);
                N(cn3);
                N(cn3);
                long jLongValue = this.f47623e.longValue();
                Bundle bundle2 = new Bundle();
                zze.zzc(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zP5) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i8 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (i8 < size3) {
                    CN3.n nVar = (CN3.n) arrayList2.get(i8);
                    boolean z5 = z2;
                    arrayList4.add(null);
                    z3 |= !TextUtils.isEmpty(null);
                    String strT2 = nVar.t();
                    zzan zzanVar2 = zzanVar;
                    if (strT2.equals("first_party")) {
                        zzbe.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z4 = z5;
                    }
                    i8++;
                    zzanVar = zzanVar2;
                    z2 = z5;
                }
                zzan zzanVar3 = zzanVar;
                if (z3) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z4 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleZzl = zzanVar3.zzl(i7, packageName, strT, bundle, bundle2);
                if (bundleZzl == null) {
                    return p5(Ln.iF, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzl.containsKey("DETAILS_LIST")) {
                    int iZzb = zze.zzb(bundleZzl, "BillingClient");
                    String strZzh = zze.zzh(bundleZzl, "BillingClient");
                    if (iZzb == 0) {
                        return p5(Ln.n(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return p5(Ln.n(iZzb, strZzh), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb, null);
                }
                ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return p5(Ln.iF, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                    try {
                        Wre wre = new Wre(stringArrayList.get(i9));
                        zze.zzk("BillingClient", "Got product details: ".concat(wre.toString()));
                        arrayList.add(wre);
                    } catch (JSONException e2) {
                        return p5(Ln.n(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e2);
                    }
                }
                i2 = i3;
            } catch (DeadObjectException e3) {
                return p5(Ln.az, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            } catch (Exception e4) {
                return p5(Ln.gh, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
            }
        }
        return new s4(0, "", arrayList);
    }

    final /* synthetic */ void Y(OS.QJ qj) {
        Ml ml = Ln.ty;
        C(24, 9, ml);
        qj.n(ml, zzco.zzl());
    }

    final /* synthetic */ void a(Ml ml) {
        if (this.f47620O.nr() != null) {
            this.f47620O.nr().HI(ml, null);
        } else {
            zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ Object i(OS.n nVar, OS.j jVar) {
        zzan zzanVar;
        try {
            synchronized (this.f47625n) {
                zzanVar = this.KN;
            }
            if (zzanVar == null) {
                FX(nVar, Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                return null;
            }
            String packageName = this.J2.getPackageName();
            String strN = jVar.n();
            String str = this.f47628t;
            long jLongValue = this.f47623e.longValue();
            Bundle bundle = new Bundle();
            zze.zzc(bundle, str, jLongValue);
            Bundle bundleZzd = zzanVar.zzd(9, packageName, strN, bundle);
            nVar.n(Ln.n(zze.zzb(bundleZzd, "BillingClient"), zze.zzh(bundleZzd, "BillingClient")));
            return null;
        } catch (DeadObjectException e2) {
            FX(nVar, Ln.az, 28, e2);
            return null;
        } catch (Exception e3) {
            FX(nVar, Ln.gh, 28, e3);
            return null;
        }
    }

    public final boolean mUb() {
        boolean z2;
        synchronized (this.f47625n) {
            try {
                z2 = false;
                if (this.rl == 2 && this.KN != null && this.xMQ != null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // com.android.billingclient.api.j
    public Ml t(Activity activity, final w6 w6Var) {
        String str;
        String str2;
        Future futureQie;
        int iZza;
        String string;
        String str3;
        boolean z2;
        String str4;
        w6.n nVar;
        boolean z3;
        String str5;
        int i2;
        final int i3;
        if (this.f47620O == null || this.f47620O.nr() == null) {
            Ml ml = Ln.f47544e;
            C(12, 2, ml);
            return ml;
        }
        if (!mUb()) {
            Ml ml2 = Ln.az;
            C(2, 2, ml2);
            GD(ml2);
            return ml2;
        }
        ArrayList arrayListKN = w6Var.KN();
        List listXMQ = w6Var.xMQ();
        android.support.v4.media.j.n(zzcx.zza(arrayListKN, null));
        w6.n nVar2 = (w6.n) zzcx.zza(listXMQ, null);
        final String strNr = nVar2.rl().nr();
        final String strO = nVar2.rl().O();
        if (strO.equals("subs") && !this.mUb) {
            zze.zzl("BillingClient", "Current client doesn't support subscriptions.");
            Ml ml3 = Ln.HI;
            C(9, 2, ml3);
            GD(ml3);
            return ml3;
        }
        if (w6Var.r() && !this.az) {
            zze.zzl("BillingClient", "Current client doesn't support extra params for buy intent.");
            Ml ml4 = Ln.xMQ;
            C(18, 2, ml4);
            GD(ml4);
            return ml4;
        }
        if (arrayListKN.size() > 1 && !this.f47622Z) {
            zze.zzl("BillingClient", "Current client doesn't support multi-item purchases.");
            Ml ml5 = Ln.f47543Z;
            C(19, 2, ml5);
            GD(ml5);
            return ml5;
        }
        if (!listXMQ.isEmpty() && !this.XQ) {
            zze.zzl("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            Ml ml6 = Ln.f47541S;
            C(20, 2, ml6);
            GD(ml6);
            return ml6;
        }
        Ml mlT = w6Var.t();
        if (mlT != Ln.qie) {
            C(b.f61769v, 2, mlT);
            GD(mlT);
            return mlT;
        }
        if (this.az) {
            boolean z4 = this.HI;
            boolean z5 = this.WPU;
            boolean zN = this.te.n();
            boolean zRl = this.te.rl();
            boolean z6 = this.iF;
            String str6 = this.f47628t;
            long jLongValue = this.f47623e.longValue();
            final String packageName = this.J2.getPackageName();
            final Bundle bundle = new Bundle();
            zze.zzc(bundle, str6, jLongValue);
            if (w6Var.rl() != 0) {
                bundle.putInt("prorationMode", w6Var.rl());
            }
            if (!TextUtils.isEmpty(w6Var.nr())) {
                bundle.putString("accountId", w6Var.nr());
            }
            if (!TextUtils.isEmpty(w6Var.O())) {
                bundle.putString("obfuscatedProfileId", w6Var.O());
            }
            if (w6Var.Ik()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(w6Var.J2())) {
                bundle.putString("oldSkuPurchaseToken", w6Var.J2());
            }
            if (TextUtils.isEmpty(null)) {
                str3 = null;
            } else {
                str3 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(w6Var.Uo())) {
                bundle.putString("originalExternalTransactionId", w6Var.Uo());
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("paymentsPurchaseParams", str3);
            }
            if (z4 && zN) {
                z2 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z2 = true;
            }
            if (z5 && zRl) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z2);
            }
            if (z6) {
                bundle.putBoolean("enableAlternativeBilling", z2);
            }
            if (w6Var.xMQ().stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zza
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i5 = zze.zza;
                    return false;
                }
            })) {
                zzfm zzfmVarZza = zzfn.zza();
                zzfmVarZza.zza((Iterable) w6Var.xMQ().stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.zzb
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i5 = zze.zza;
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.zzc
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i5 = zze.zza;
                        String strNr2 = ((w6.n) obj).rl().nr();
                        zzfk zzfkVarZza = zzfl.zza();
                        zzfp zzfpVarZza = zzfq.zza();
                        zzfpVarZza.zza("subs:" + packageName + ":" + strNr2);
                        zzfkVarZza.zza(zzfpVarZza);
                        zzfq.zza();
                        throw null;
                    }
                }).collect(zzco.zzo()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzfn) zzfmVarZza.zzf()).zzh());
            }
            if (arrayListKN.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listXMQ.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listXMQ.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                str4 = "proxyPackageVersion";
                for (int i5 = 0; i5 < listXMQ.size(); i5++) {
                    w6.n nVar3 = (w6.n) listXMQ.get(i5);
                    Wre wreRl = nVar3.rl();
                    if (wreRl.xMQ().isEmpty()) {
                        nVar = nVar3;
                    } else {
                        nVar = nVar3;
                        arrayList3.add(wreRl.xMQ());
                    }
                    arrayList4.add(nVar.t());
                    String strMUb = wreRl.mUb();
                    if (wreRl.gh() != null && !wreRl.gh().isEmpty()) {
                        Iterator it = wreRl.gh().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Wre.n nVar4 = (Wre.n) it.next();
                            if (!TextUtils.isEmpty(nVar4.t())) {
                                strMUb = nVar4.t();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strMUb)) {
                        arrayList5.add(strMUb);
                    }
                    if (i5 > 0) {
                        arrayList.add(((w6.n) listXMQ.get(i5)).rl().nr());
                        arrayList2.add(((w6.n) listXMQ.get(i5)).rl().O());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListKN.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.j.n(it2.next());
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (arrayListKN.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListKN.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListKN.size() - 1);
                    if (1 < arrayListKN.size()) {
                        android.support.v4.media.j.n(arrayListKN.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList8);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList9);
                }
                str4 = "proxyPackageVersion";
                str = "BUY_INTENT";
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f47627r) {
                Ml ml7 = Ln.XQ;
                C(21, 2, ml7);
                GD(ml7);
                return ml7;
            }
            if (nVar2 == null || TextUtils.isEmpty(nVar2.rl().KN())) {
                z3 = false;
            } else {
                bundle.putString("skuPackageName", nVar2.rl().KN());
                z3 = true;
            }
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                zze.zzl("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    str5 = str4;
                    try {
                        bundle.putString(str5, this.J2.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        bundle.putString(str5, "package not found");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    str5 = str4;
                }
            }
            if (this.XQ && !listXMQ.isEmpty()) {
                i2 = 17;
            } else if (this.f47626o && z3) {
                i2 = 15;
            } else if (this.HI) {
                i3 = 9;
                futureQie = qie(new Callable() { // from class: com.android.billingclient.api.Pl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f47558n.eWT(i3, strNr, strO, w6Var, bundle);
                    }
                }, 5000L, null, this.nr, s7N());
            } else {
                i2 = 6;
            }
            i3 = i2;
            futureQie = qie(new Callable() { // from class: com.android.billingclient.api.Pl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f47558n.eWT(i3, strNr, strO, w6Var, bundle);
                }
            }, 5000L, null, this.nr, s7N());
        } else {
            str = "BUY_INTENT";
            str2 = null;
            futureQie = qie(new Callable() { // from class: com.android.billingclient.api.Zs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f47596n.ul(strNr, strO);
                }
            }, 5000L, null, this.nr, s7N());
        }
        try {
            if (futureQie == null) {
                Ml ml8 = Ln.nr;
                C(25, 2, ml8);
                GD(ml8);
                return ml8;
            }
            Bundle bundle2 = (Bundle) futureQie.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = zze.zzb(bundle2, "BillingClient");
            String strZzh = zze.zzh(bundle2, "BillingClient");
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str7 = str;
                intent2.putExtra(str7, (PendingIntent) bundle2.getParcelable(str7));
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent2);
                return Ln.qie;
            }
            zze.zzl("BillingClient", "Unable to buy item, Error response code: " + iZzb);
            Ml mlN = Ln.n(iZzb, strZzh);
            if (bundle2 == null) {
                iZza = 1;
            } else {
                try {
                    Object obj = bundle2.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iZza = zzkg.zza(((Integer) obj).intValue());
                        } else {
                            zze.zzl("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (Throwable th) {
                    zze.zzl("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                iZza = 1;
            }
            if (iZza == 1) {
                iZza = 23;
            }
            if (bundle2 == null) {
                string = str2;
            } else {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    zze.zzl("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                    string = str2;
                }
            }
            Mx(iZza, 2, mlN, string);
            GD(mlN);
            return mlN;
        } catch (CancellationException e2) {
            e = e2;
            zze.zzm("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            Ml ml9 = Ln.ty;
            Mx(4, 2, ml9, u.n(e));
            GD(ml9);
            return ml9;
        } catch (TimeoutException e3) {
            e = e3;
            zze.zzm("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            Ml ml92 = Ln.ty;
            Mx(4, 2, ml92, u.n(e));
            GD(ml92);
            return ml92;
        } catch (Exception e4) {
            zze.zzm("BillingClient", "Exception while launching billing flow. Try to reconnect", e4);
            Ml ml10 = Ln.az;
            Mx(5, 2, ml10, u.n(e4));
            GD(ml10);
            return ml10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i2, int i3, Ml ml) {
        try {
            v(u.rl(i2, i3, ml));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G7(int i2) {
        try {
            rV9(u.nr(i2));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mx(int i2, int i3, Ml ml, String str) {
        try {
            v(u.t(i2, i3, ml, str));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    private final void Xw(String str, final OS.QJ qj) {
        if (!mUb()) {
            Ml ml = Ln.az;
            C(2, 9, ml);
            qj.n(ml, zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                zze.zzl("BillingClient", "Please provide a valid product type.");
                Ml ml2 = Ln.KN;
                C(50, 9, ml2);
                qj.n(ml2, zzco.zzl());
                return;
            }
            if (qie(new eO(this, str, qj), 30000L, new Runnable() { // from class: com.android.billingclient.api.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47607n.Y(qj);
                }
            }, eTf(), s7N()) == null) {
                Ml mlT = T();
                C(25, 9, mlT);
                qj.n(mlT, zzco.zzl());
            }
        }
    }

    private final void bzg(String str, final OS.eO eOVar) {
        if (!mUb()) {
            Ml ml = Ln.az;
            C(2, 11, ml);
            eOVar.n(ml, null);
        } else if (qie(new CallableC1769z(this, str, eOVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f47524n.Nxk(eOVar);
            }
        }, eTf(), s7N()) == null) {
            Ml mlT = T();
            C(25, 11, mlT);
            eOVar.n(mlT, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler eTf() {
        if (Looper.myLooper() == null) {
            return this.nr;
        }
        return new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Future qie(Callable callable, long j2, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: OS.SPz
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j2 * 0.95d));
            return futureSubmit;
        } catch (Exception e2) {
            zze.zzm("BillingClient", "Async task throws exception!", e2);
            return null;
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void wTp(OS.aC aCVar, OS.C c2) throws Throwable {
        zzan zzanVar;
        int iZza;
        String strZzh;
        String strN = aCVar.n();
        try {
            zze.zzk("BillingClient", "Consuming purchase with token: " + strN);
            synchronized (this.f47625n) {
                try {
                    try {
                        zzanVar = this.KN;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (DeadObjectException e2) {
                    e = e2;
                    B(c2, strN, Ln.az, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e3) {
                    e = e3;
                    B(c2, strN, Ln.gh, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (zzanVar == null) {
                try {
                    B(c2, strN, Ln.az, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e4) {
                    e = e4;
                    B(c2, strN, Ln.az, 29, "Error consuming purchase!", e);
                    return;
                } catch (Exception e5) {
                    e = e5;
                    B(c2, strN, Ln.gh, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.HI) {
                String packageName = this.J2.getPackageName();
                boolean z2 = this.HI;
                String str = this.f47628t;
                long jLongValue = this.f47623e.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    zze.zzc(bundle, str, jLongValue);
                }
                Bundle bundleZze = zzanVar.zze(9, packageName, strN, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzh = zze.zzh(bundleZze, "BillingClient");
            } else {
                iZza = zzanVar.zza(3, this.J2.getPackageName(), strN);
                strZzh = "";
            }
            Ml mlN = Ln.n(iZza, strZzh);
            if (iZza == 0) {
                zze.zzk("BillingClient", "Successfully consumed purchase.");
                c2.n(mlN, strN);
            } else {
                B(c2, strN, mlN, 23, "Error consuming purchase with token. Response code: " + iZza, null);
            }
        } catch (DeadObjectException e6) {
            e = e6;
        } catch (Exception e7) {
            e = e7;
        }
    }

    private void xMQ(Context context, InterfaceC1422c interfaceC1422c, I28 i28, OS.ci ciVar, String str, qf qfVar) {
        boolean z2;
        this.J2 = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(str);
        zzksVarZzc.zzn(this.J2.getPackageName());
        zzksVarZzc.zzm(this.f47623e.longValue());
        if (qfVar != null) {
            this.Uo = qfVar;
        } else {
            this.Uo = new lej(this.J2, (zzku) zzksVarZzc.zzf());
        }
        if (interfaceC1422c == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f47620O = new psW(this.J2, interfaceC1422c, null, ciVar, null, this.Uo);
        this.te = i28;
        if (ciVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.iF = z2;
        this.J2.getPackageName();
    }

    final Ml GD(final Ml ml) {
        if (Thread.interrupted()) {
            return ml;
        }
        this.nr.post(new Runnable() { // from class: com.android.billingclient.api.Md
            @Override // java.lang.Runnable
            public final void run() {
                this.f47551n.a(ml);
            }
        });
        return ml;
    }

    @Override // com.android.billingclient.api.j
    public final void J2(OS.s4 s4Var, OS.eO eOVar) {
        bzg(s4Var.rl(), eOVar);
    }

    final /* synthetic */ Object K(OS.aC aCVar, OS.C c2) throws Throwable {
        wTp(aCVar, c2);
        return null;
    }

    @Override // com.android.billingclient.api.j
    public void O(final CN3 cn3, final OS.Pl pl) {
        if (!mUb()) {
            Ml ml = Ln.az;
            C(2, 7, ml);
            pl.n(ml, new ArrayList());
        } else {
            if (!this.XQ) {
                zze.zzl("BillingClient", "Querying product details is not supported.");
                Ml ml2 = Ln.f47541S;
                C(20, 7, ml2);
                pl.n(ml2, new ArrayList());
                return;
            }
            if (qie(new Callable() { // from class: com.android.billingclient.api.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    s4 s4VarRl = this.f47630n.Rl(cn3);
                    pl.n(Ln.n(s4VarRl.n(), s4VarRl.rl()), s4VarRl.t());
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.qz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47636n.GR(pl);
                }
            }, eTf(), s7N()) == null) {
                Ml mlT = T();
                C(25, 7, mlT);
                pl.n(mlT, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.j
    public final void Uo(OS.UGc uGc, OS.QJ qj) {
        Xw(uGc.rl(), qj);
    }

    @Override // com.android.billingclient.api.j
    public void n(final OS.j jVar, final OS.n nVar) {
        if (!mUb()) {
            Ml ml = Ln.az;
            C(2, 3, ml);
            nVar.n(ml);
            return;
        }
        if (TextUtils.isEmpty(jVar.n())) {
            zze.zzl("BillingClient", "Please provide a valid purchase token.");
            Ml ml2 = Ln.mUb;
            C(26, 3, ml2);
            nVar.n(ml2);
            return;
        }
        if (!this.HI) {
            Ml ml3 = Ln.rl;
            C(27, 3, ml3);
            nVar.n(ml3);
        } else if (qie(new Callable() { // from class: com.android.billingclient.api.P
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f47555n.i(nVar, jVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f47618n.D(nVar);
            }
        }, eTf(), s7N()) == null) {
            Ml mlT = T();
            C(25, 3, mlT);
            nVar.n(mlT);
        }
    }

    @Override // com.android.billingclient.api.j
    public void rl(final OS.aC aCVar, final OS.C c2) {
        if (!mUb()) {
            Ml ml = Ln.az;
            C(2, 4, ml);
            c2.n(ml, aCVar.n());
        } else if (qie(new Callable() { // from class: com.android.billingclient.api.Dsr
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                this.f47533n.K(aCVar, c2);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.aC
            @Override // java.lang.Runnable
            public final void run() {
                this.f47599n.I(c2, aCVar);
            }
        }, eTf(), s7N()) == null) {
            Ml mlT = T();
            C(25, 4, mlT);
            c2.n(mlT, aCVar.n());
        }
    }

    n(String str, I28 i28, Context context, OS.M m2, qf qfVar, ExecutorService executorService) {
        this.f47625n = new Object();
        this.rl = 0;
        this.nr = new Handler(Looper.getMainLooper());
        this.qie = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f47623e = lValueOf;
        this.f47628t = nHg();
        this.J2 = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(nHg());
        zzksVarZzc.zzn(this.J2.getPackageName());
        zzksVarZzc.zzm(lValueOf.longValue());
        this.Uo = new lej(this.J2, (zzku) zzksVarZzc.zzf());
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f47620O = new psW(this.J2, null, null, null, null, this.Uo);
        this.te = i28;
        this.J2.getPackageName();
    }

    n(String str, I28 i28, Context context, InterfaceC1422c interfaceC1422c, OS.ci ciVar, qf qfVar, ExecutorService executorService) {
        String strNHg = nHg();
        this.f47625n = new Object();
        this.rl = 0;
        this.nr = new Handler(Looper.getMainLooper());
        this.qie = 0;
        this.f47623e = Long.valueOf(new Random().nextLong());
        this.f47628t = strNHg;
        xMQ(context, interfaceC1422c, i28, null, strNHg, null);
    }
}
