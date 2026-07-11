package com.android.billingclient.api;

import OS.InterfaceC1422c;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzv;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class DAz extends n {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private volatile zzav f47530N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private volatile int f47531T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Context f47532X;
    private volatile nKK nHg;
    private volatile zzew s7N;

    DAz(String str, Context context, qf qfVar, ExecutorService executorService) {
        super(null, context, null, null);
        this.f47531T = 0;
        this.f47532X = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Bu(int i2) {
        return i2 > 0;
    }

    private final synchronized void T3L() {
        if (RQ()) {
            zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            ub(26);
            return;
        }
        int i2 = 1;
        if (this.f47531T == 1) {
            zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f47531T == 3) {
            zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            f(38, 26, Ln.n(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f47531T = 1;
        zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
        this.nHg = new nKK(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        List<ResolveInfo> listQueryIntentServices = this.f47532X.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i2 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f47532X.bindService(intent2, this.nHg, 1)) {
                        zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i2 = 39;
            }
        }
        this.f47531T = 0;
        zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
        f(i2, 26, Ln.n(2, "Billing Override Service unavailable on device."));
    }

    private final synchronized zzew mI() {
        try {
            if (this.s7N == null) {
                this.s7N = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.s7N;
    }

    public final synchronized boolean RQ() {
        if (this.f47531T == 2 && this.f47530N != null) {
            if (this.nHg != null) {
                return true;
            }
        }
        return false;
    }

    DAz(String str, I28 i28, Context context, OS.M m2, qf qfVar, ExecutorService executorService) {
        super(null, i28, context, null, null, null);
        this.f47531T = 0;
        this.f47532X = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int VwL(zzeu zzeuVar) {
        try {
            return ((Integer) zzeuVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e2) {
            f(114, 28, Ln.f47542X);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e2);
            return 0;
        } catch (Exception e3) {
            if (e3 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            f(107, 28, Ln.f47542X);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e3);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ml p0N(int i2, int i3) {
        Ml mlN = Ln.n(i3, "Billing override value was set by a license tester.");
        f(105, i2, mlN);
        return mlN;
    }

    final /* synthetic */ Object F(int i2, zzr zzrVar) {
        String str;
        try {
            if (this.f47530N == null) {
                throw null;
            }
            zzav zzavVar = this.f47530N;
            String packageName = this.f47532X.getPackageName();
            switch (i2) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            zzavVar.zza(packageName, str, new Ew(zzrVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e2) {
            f(107, 28, Ln.f47542X);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            zzrVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // com.android.billingclient.api.n, com.android.billingclient.api.j
    public final void O(final CN3 cn3, final OS.Pl pl) {
        Qu(7, new Consumer() { // from class: OS.afx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                pl.n((com.android.billingclient.api.Ml) obj, arrayList);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f47639n.kSg(cn3, pl);
            }
        });
    }

    @Override // com.android.billingclient.api.n, com.android.billingclient.api.j
    public final void rl(final OS.aC aCVar, final OS.C c2) {
        Qu(4, new Consumer() { // from class: OS.Z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c2.n((com.android.billingclient.api.Ml) obj, aCVar.n());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.SPz
            @Override // java.lang.Runnable
            public final void run() {
                this.f47575n.ER(aCVar, c2);
            }
        });
    }

    @Override // com.android.billingclient.api.n, com.android.billingclient.api.j
    public final Ml t(final Activity activity, final w6 w6Var) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.afx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f47601n.lLA((Ml) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.Q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f47571n.HBN(activity, w6Var);
            }
        };
        int iVwL = VwL(Uf(2));
        if (Bu(iVwL)) {
            Ml mlP0N = p0N(2, iVwL);
            consumer.accept(mlP0N);
            return mlP0N;
        }
        try {
            return (Ml) callable.call();
        } catch (Exception e2) {
            Ml ml = Ln.gh;
            f(115, 2, ml);
            zze.zzm("BillingClientTesting", "An internal error occurred.", e2);
            return ml;
        }
    }

    DAz(String str, I28 i28, Context context, InterfaceC1422c interfaceC1422c, OS.ci ciVar, qf qfVar, ExecutorService executorService) {
        super(null, i28, context, interfaceC1422c, null, null, null);
        this.f47531T = 0;
        this.f47532X = context;
    }

    private final void Qu(int i2, Consumer consumer, Runnable runnable) {
        zzel.zzc(zzel.zzb(Uf(i2), 28500L, TimeUnit.MILLISECONDS, mI()), new Z(this, i2, consumer, runnable), EWS());
    }

    private final zzeu Uf(int i2) {
        if (!RQ()) {
            zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
            f(106, 28, Ln.n(-1, "Billing Override Service connection is disconnected."));
            return zzel.zza(0);
        }
        return zzv.zza(new ci(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i2, int i3, Ml ml) {
        zzjz zzjzVarRl = u.rl(i2, i3, ml);
        Objects.requireNonNull(zzjzVarRl, "ApiFailure should not be null");
        Org().J2(zzjzVarRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ub(int i2) {
        zzkd zzkdVarNr = u.nr(i2);
        Objects.requireNonNull(zzkdVarNr, "ApiSuccess should not be null");
        Org().nr(zzkdVarNr);
    }

    final /* synthetic */ void ER(OS.aC aCVar, OS.C c2) {
        super.rl(aCVar, c2);
    }

    final /* synthetic */ Ml HBN(Activity activity, w6 w6Var) {
        return super.t(activity, w6Var);
    }

    @Override // com.android.billingclient.api.n, com.android.billingclient.api.j
    public final void KN(OS.Dsr dsr) {
        T3L();
        super.KN(dsr);
    }

    final /* synthetic */ void kSg(CN3 cn3, OS.Pl pl) {
        super.O(cn3, pl);
    }

    final /* synthetic */ void lLA(Ml ml) {
        super.GD(ml);
    }

    @Override // com.android.billingclient.api.n, com.android.billingclient.api.j
    public final void n(final OS.j jVar, final OS.n nVar) {
        Objects.requireNonNull(nVar);
        Qu(3, new Consumer() { // from class: OS.Ew
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                nVar.n((com.android.billingclient.api.Ml) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.g9s
            @Override // java.lang.Runnable
            public final void run() {
                this.f47610n.tUK(jVar, nVar);
            }
        });
    }

    final /* synthetic */ void tUK(OS.j jVar, OS.n nVar) {
        super.n(jVar, nVar);
    }
}
