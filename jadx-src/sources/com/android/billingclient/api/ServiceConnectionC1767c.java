package com.android.billingclient.api;

import aT.dE.JLZo;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlo;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.android.billingclient.api.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class ServiceConnectionC1767c implements ServiceConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OS.Dsr f47602n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ n f47603t;

    /* synthetic */ ServiceConnectionC1767c(n nVar, OS.Dsr dsr, OS.g9s g9sVar) {
        this.f47603t = nVar;
        this.f47602n = dsr;
    }

    private final void J2(Ml ml) {
        synchronized (this.f47603t.f47625n) {
            try {
                if (this.f47603t.rl == 3) {
                    return;
                }
                this.f47602n.n(ml);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void O() {
        this.f47603t.jB(0);
        Ml ml = Ln.ty;
        this.f47603t.C(24, 6, ml);
        J2(ml);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ Object nr() {
        Bundle bundle;
        boolean z2;
        int i2;
        int i3;
        String strN;
        int iZzy;
        zzan zzanVar;
        synchronized (this.f47603t.f47625n) {
            try {
                if (this.f47603t.rl != 3) {
                    int i5 = this.f47603t.rl;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        n nVar = this.f47603t;
                        zze.zzc(bundle, nVar.f47628t, nVar.f47623e.longValue());
                    }
                    try {
                        synchronized (this.f47603t.f47625n) {
                            zzanVar = this.f47603t.KN;
                        }
                    } catch (Exception e2) {
                        z2 = i5 != 1;
                        zze.zzm("BillingClient", "Exception while checking if billing is supported; try to reconnect", e2);
                        if (e2 instanceof DeadObjectException) {
                            i3 = 101;
                        } else if (e2 instanceof RemoteException) {
                            i3 = 100;
                        } else if (e2 instanceof SecurityException) {
                            i3 = 102;
                        } else {
                            i2 = 42;
                            strN = i2 != 42 ? u.n(e2) : null;
                            this.f47603t.jB(0);
                            iZzy = 6;
                        }
                        i2 = i3;
                        if (i2 != 42) {
                        }
                        this.f47603t.jB(0);
                        iZzy = 6;
                    }
                    if (zzanVar == null) {
                        this.f47603t.jB(0);
                        n nVar2 = this.f47603t;
                        Ml ml = Ln.az;
                        nVar2.C(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 6, ml);
                        J2(ml);
                    } else {
                        String packageName = this.f47603t.J2.getPackageName();
                        iZzy = 3;
                        int i7 = 23;
                        while (true) {
                            if (i7 < 3) {
                                i7 = 0;
                                break;
                            }
                            iZzy = bundle == null ? zzanVar.zzy(i7, packageName, "subs") : zzanVar.zzc(i7, packageName, "subs", bundle);
                            if (iZzy == 0) {
                                zze.zzk("BillingClient", "highestLevelSupportedForSubs: " + i7);
                                break;
                            }
                            i7--;
                        }
                        this.f47603t.gh = i7 >= 5;
                        this.f47603t.mUb = i7 >= 3;
                        if (i7 < 3) {
                            zze.zzk(JLZo.KITgLKQHDpkTbRW, "In-app billing API does not support subscription on this device.");
                            i2 = 9;
                        } else {
                            i2 = 1;
                        }
                        int i8 = 23;
                        while (true) {
                            if (i8 < 3) {
                                break;
                            }
                            iZzy = bundle == null ? zzanVar.zzy(i8, packageName, "inapp") : zzanVar.zzc(i8, packageName, "inapp", bundle);
                            if (iZzy == 0) {
                                this.f47603t.qie = i8;
                                zze.zzk("BillingClient", "mHighestLevelSupportedForInApp: " + this.f47603t.qie);
                                break;
                            }
                            i8--;
                        }
                        n nVar3 = this.f47603t;
                        nVar3.f47624g = nVar3.qie >= 23;
                        n nVar4 = this.f47603t;
                        nVar4.nY = nVar4.qie >= 22;
                        n nVar5 = this.f47603t;
                        nVar5.ViF = nVar5.qie >= 21;
                        n nVar6 = this.f47603t;
                        nVar6.aYN = nVar6.qie >= 20;
                        n nVar7 = this.f47603t;
                        nVar7.WPU = nVar7.qie >= 19;
                        n nVar8 = this.f47603t;
                        nVar8.f47621S = nVar8.qie >= 18;
                        n nVar9 = this.f47603t;
                        nVar9.XQ = nVar9.qie >= 17;
                        n nVar10 = this.f47603t;
                        nVar10.f47622Z = nVar10.qie >= 16;
                        n nVar11 = this.f47603t;
                        nVar11.f47626o = nVar11.qie >= 15;
                        n nVar12 = this.f47603t;
                        nVar12.f47627r = nVar12.qie >= 14;
                        n nVar13 = this.f47603t;
                        nVar13.Ik = nVar13.qie >= 12;
                        n nVar14 = this.f47603t;
                        nVar14.ck = nVar14.qie >= 10;
                        n nVar15 = this.f47603t;
                        nVar15.HI = nVar15.qie >= 9;
                        n nVar16 = this.f47603t;
                        nVar16.ty = nVar16.qie >= 8;
                        n nVar17 = this.f47603t;
                        nVar17.az = nVar17.qie >= 6;
                        if (this.f47603t.qie < 3) {
                            zze.zzl("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i2 = 36;
                        }
                        if (iZzy == 0) {
                            synchronized (this.f47603t.f47625n) {
                                try {
                                    if (this.f47603t.rl != 3) {
                                        z2 = i5 != 1;
                                        this.f47603t.jB(2);
                                        psW psw = this.f47603t.f47620O != null ? this.f47603t.f47620O : null;
                                        if (psw != null) {
                                            psw.J2(this.f47603t.ViF);
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            z2 = i5 != 1;
                            this.f47603t.jB(0);
                        }
                        strN = null;
                        if (iZzy == 0) {
                            try {
                                if (true != z2) {
                                    this.f47603t.G7(6);
                                } else {
                                    qf qfVar = this.f47603t.Uo;
                                    zzlo zzloVarZzc = zzlq.zzc();
                                    zzke zzkeVarZzc = zzki.zzc();
                                    zzkeVarZzc.zzn(0);
                                    zzloVarZzc.zza(zzkeVarZzc);
                                    qfVar.rl((zzlq) zzloVarZzc.zzf());
                                }
                            } catch (Throwable th) {
                                zze.zzm("BillingClient", "Unable to log.", th);
                            }
                            J2(Ln.qie);
                        } else {
                            Ml ml2 = Ln.f47546n;
                            try {
                                if (true != z2) {
                                    this.f47603t.Mx(i2, 6, ml2, strN);
                                } else {
                                    zzke zzkeVarZzc2 = zzki.zzc();
                                    zzkeVarZzc2.zzn(ml2.rl());
                                    zzkeVarZzc2.zzm(ml2.n());
                                    zzkeVarZzc2.zzo(i2);
                                    if (strN != null) {
                                        zzkeVarZzc2.zza(strN);
                                    }
                                    qf qfVar2 = this.f47603t.Uo;
                                    zzlo zzloVarZzc2 = zzlq.zzc();
                                    zzloVarZzc2.zzm((zzki) zzkeVarZzc2.zzf());
                                    qfVar2.rl((zzlq) zzloVarZzc2.zzf());
                                }
                            } catch (Throwable th2) {
                                zze.zzm("BillingClient", "Unable to log.", th2);
                            }
                            J2(Ln.f47546n);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service died.");
        try {
            if (n.dR0(this.f47603t)) {
                qf qfVar = this.f47603t.Uo;
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                zzjxVarZzc.zza(zzkeVarZzc);
                qfVar.J2((zzjz) zzjxVarZzc.zzf());
            } else {
                this.f47603t.Uo.n(zzkl.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f47603t.f47625n) {
            if (this.f47603t.rl != 3 && this.f47603t.rl != 0) {
                this.f47603t.jB(0);
                this.f47603t.U();
                this.f47602n.rl();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClient", "Billing service connected.");
        synchronized (this.f47603t.f47625n) {
            try {
                if (this.f47603t.rl == 3) {
                    return;
                }
                this.f47603t.KN = zzam.zzu(iBinder);
                n nVar = this.f47603t;
                if (n.qie(new Callable() { // from class: com.android.billingclient.api.QJ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.f47573n.nr();
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.l3D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47616n.O();
                    }
                }, nVar.eTf(), nVar.s7N()) == null) {
                    n nVar2 = this.f47603t;
                    Ml mlT = nVar2.T();
                    nVar2.C(25, 6, mlT);
                    J2(mlT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if (n.dR0(this.f47603t)) {
                qf qfVar = this.f47603t.Uo;
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                zzjxVarZzc.zza(zzkeVarZzc);
                qfVar.J2((zzjz) zzjxVarZzc.zzf());
            } else {
                this.f47603t.Uo.O(zzlu.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f47603t.f47625n) {
            try {
                if (this.f47603t.rl == 3) {
                    return;
                }
                this.f47603t.jB(0);
                this.f47602n.rl();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
