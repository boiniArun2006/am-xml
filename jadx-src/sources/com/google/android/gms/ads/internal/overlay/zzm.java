package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.WindowCompat;
import com.google.android.exoplayer2.C;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzclj;
import com.google.android.gms.internal.ads.zzclv;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgrt;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class zzm extends zzbxr implements zzah {

    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzo = 0;
    protected final Activity zzb;

    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;

    @VisibleForTesting
    zzcjl zzd;

    @VisibleForTesting
    zzj zze;

    @VisibleForTesting
    zzu zzf;

    @VisibleForTesting
    FrameLayout zzh;

    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;

    @VisibleForTesting
    zzi zzl;
    private Runnable zzr;
    private boolean zzs;
    private boolean zzt;
    private Toolbar zzx;

    @VisibleForTesting
    boolean zzg = false;

    @VisibleForTesting
    boolean zzj = false;

    @VisibleForTesting
    boolean zzk = false;

    @VisibleForTesting
    boolean zzm = false;

    @VisibleForTesting
    int zzn = 1;
    private final Object zzp = new Object();
    private final View.OnClickListener zzq = new zzd(this);
    private boolean zzu = false;
    private boolean zzv = false;
    private boolean zzw = true;

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzae(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() {
        this.zzt = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzJ(Configuration configuration) {
        boolean z2;
        boolean z3;
        com.google.android.gms.ads.internal.zzl zzlVar;
        boolean z4;
        int i2;
        int i3;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z5 = (adOverlayInfoParcel == null || (zzlVar2 = adOverlayInfoParcel.zzo) == null || !zzlVar2.zzb) ? false : true;
        Activity activity = this.zzb;
        boolean zZzd = com.google.android.gms.ads.internal.zzt.zzf().zzd(activity, configuration);
        if (!this.zzk || z5) {
            if (zZzd) {
                if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzbl)).booleanValue()) {
                    z2 = false;
                }
                z3 = z2;
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 == null || (zzlVar = adOverlayInfoParcel2.zzo) == null || !zzlVar.zzg) {
                z2 = true;
                z3 = false;
            } else {
                z2 = true;
                z3 = z2;
            }
        } else if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbm)).booleanValue()) {
        }
        Window window = activity.getWindow();
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbL)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z2) {
                i3 = z3 ? 5894 : 5380;
                z4 = true;
            } else {
                i3 = 256;
                z4 = false;
            }
            decorView.setSystemUiVisibility(i3);
        } else if (z2) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z3) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
            z4 = true;
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
            z4 = false;
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzoS)).booleanValue() || (i2 = Build.VERSION.SDK_INT) > 34 || i2 < 28 || !z4) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        WindowCompat.rl(window, false);
    }

    private final void zzK(View view) {
        zzekb zzekbVarZzU;
        zzejz zzejzVarZzV;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzejzVarZzV = zzcjlVar.zzV()) != null) {
            zzejzVarZzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && (zzekbVarZzU = zzcjlVar.zzU()) != null && zzekbVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzekbVarZzU.zza(), view);
        }
    }

    private static final void zzL(@Nullable zzekb zzekbVar, @Nullable View view) {
        if (zzekbVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && zzekbVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzekbVar.zza(), view);
    }

    protected final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzu) {
            return;
        }
        this.zzu = true;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzH(this.zzn - 1);
            synchronized (this.zzp) {
                try {
                    if (!this.zzs && this.zzd.zzaa()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfX)).booleanValue() && !this.zzv && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdS();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzB();
                            }
                        };
                        this.zzr = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbd.zzc().zzd(zzbhe.zzbE)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzB();
    }

    @VisibleForTesting
    final void zzB() {
        zzcjl zzcjlVar;
        zzr zzrVar;
        if (this.zzv) {
            return;
        }
        this.zzv = true;
        zzcjl zzcjlVar2 = this.zzd;
        if (zzcjlVar2 != null) {
            this.zzl.removeView(zzcjlVar2.zzE());
            zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzof)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzj zzjVar2 = this.zze;
                viewGroup.addView(viewZzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdT(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcjlVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcjlVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.zzd.zzI();
    }

    public final void zzF() {
        synchronized (this.zzp) {
            try {
                this.zzs = true;
                Runnable runnable = this.zzr;
                if (runnable != null) {
                    zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzfynVar.removeCallbacks(runnable);
                    zzfynVar.post(this.zzr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzG(zzejh zzejhVar) throws RemoteException, zzh {
        zzbxl zzbxlVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbxlVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbxlVar.zzh(ObjectWrapper.wrap(zzejhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i2, String[] strArr, int[] iArr) {
        if (i2 == 12345) {
            Activity activity = this.zzb;
            zzejg zzejgVarZze = zzejh.zze();
            zzejgVarZze.zza(activity);
            zzejgVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzejgVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzt = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public void zzh(Bundle bundle) {
        zzr zzrVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzw = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z2 = zzlVar.zza;
                this.zzk = z2;
                if (z2) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzw) {
                    zzdbs zzdbsVar = this.zzc.zzt;
                    if (zzdbsVar != null) {
                        zzdbsVar.zza();
                    }
                    zzr zzrVar2 = this.zzc.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdjm zzdjmVar = this.zzc.zzu;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i2 = adOverlayInfoParcel5.zzk;
            if (i2 == 1) {
                zzy(false);
                return;
            }
            if (i2 == 2) {
                this.zze = new zzj(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i2 == 3) {
                zzy(true);
            } else {
                if (i2 != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzh e2) {
            String message = e2.getMessage();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            zzcjl zzcjlVar = this.zzd;
            if (zzcjlVar == null || zzcjlVar.zzX()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            return;
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null && !zzcjlVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i2, int i3, Intent intent) {
        zzdxz zzdxzVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i2 == 236) {
            zzbgv zzbgvVar = zzbhe.zzoD;
            if (((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                zzcjl zzcjlVar = this.zzd;
                if (zzcjlVar == null || zzcjlVar.zzP() == null || (zzdxzVarZzI = zzcjlVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    return;
                }
                zzdxy zzdxyVarZza = zzdxzVarZzI.zza();
                zzdxyVarZza.zzc(FileUploadManager.f61572j, "hilca");
                zzdxyVarZza.zzc("gqi", zzgrt.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length());
                sb2.append(i3);
                zzdxyVarZza.zzc("hilr", sb2.toString());
                if (i3 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdxyVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdxyVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdxyVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            try {
                this.zzl.removeView(zzcjlVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z2) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzgc)).intValue();
        boolean z3 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbH)).booleanValue() || z2;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z3 ? 0 : iIntValue;
        zztVar.zzb = true != z3 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z3 ? 9 : 11);
        zzt(z2, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    public final void zzt(boolean z2, boolean z3) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z4 = true;
        boolean z5 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbF)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z6 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbG)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z2 && z3 && z5 && !z6) {
            new zzbwx(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z6 && (!z3 || z5)) {
                z4 = false;
            }
            zzuVar.zza(z4);
        }
    }

    public final void zzu(boolean z2) {
        if (z2) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i2) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgU)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgV)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgW)).intValue()) {
                    if (i3 <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzt = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzy(boolean z2) throws zzh {
        boolean z3;
        Resources.Theme theme;
        ?? r2;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        Activity activity = this.zzb;
        Window window = activity.getWindow();
        if (window == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzcjl zzcjlVar = this.zzc.zzd;
        zzclj zzcljVarZzP = zzcjlVar != null ? zzcjlVar.zzP() : null;
        boolean z4 = zzcljVarZzP != null && zzcljVarZzP.zzk();
        this.zzm = false;
        if (z4) {
            int i2 = this.zzc.zzj;
            if (i2 == 6) {
                z3 = activity.getResources().getConfiguration().orientation == 1;
                this.zzm = z3;
            } else if (i2 == 7) {
                z3 = activity.getResources().getConfiguration().orientation == 2;
                this.zzm = z3;
            }
        } else {
            z3 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(z3).length() + 41);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        String string = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.zzl);
        this.zzt = true;
        if (z2) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcjl zzcjlVar2 = this.zzc.zzd;
                zzclv zzclvVarZzN = zzcjlVar2 != null ? zzcjlVar2.zzN() : null;
                zzcjl zzcjlVar3 = this.zzc.zzd;
                String strZzO = zzcjlVar3 != null ? zzcjlVar3.zzO() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                zzcjl zzcjlVar4 = adOverlayInfoParcel.zzd;
                String str = strZzO;
                theme = null;
                boolean z5 = false;
                zzcjl zzcjlVarZza = zzckb.zza(activity, zzclvVarZzN, str, true, z4, null, null, versionInfoParcel, null, null, zzcjlVar4 != null ? zzcjlVar4.zzk() : null, zzbgd.zza(), null, null, null, null, null);
                this.zzd = zzcjlVarZza;
                zzclj zzcljVarZzP2 = zzcjlVarZza.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbmx zzbmxVar = adOverlayInfoParcel2.zzp;
                zzbmz zzbmzVar = adOverlayInfoParcel2.zze;
                zzad zzadVar = adOverlayInfoParcel2.zzi;
                zzcjl zzcjlVar5 = adOverlayInfoParcel2.zzd;
                zzcljVarZzP2.zzab(null, zzbmxVar, null, zzbmzVar, zzadVar, true, null, zzcjlVar5 != null ? zzcjlVar5.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzP().zzG(new zzclh() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                    @Override // com.google.android.gms.internal.ads.zzclh
                    public final /* synthetic */ void zza(boolean z6, int i5, String str2, String str3) {
                        zzcjl zzcjlVar6 = this.zza.zzd;
                        if (zzcjlVar6 != null) {
                            zzcjlVar6.zzI();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str2 = adOverlayInfoParcel3.zzl;
                if (str2 != null) {
                    this.zzd.loadUrl(str2);
                } else {
                    String str3 = adOverlayInfoParcel3.zzh;
                    if (str3 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", C.UTF8_NAME, null);
                }
                zzcjl zzcjlVar6 = this.zzc.zzd;
                r2 = z5;
                if (zzcjlVar6 != null) {
                    zzcjlVar6.zzan(this);
                    r2 = z5;
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e2);
                throw new zzh("Could not obtain webview for the overlay.", e2);
            }
        } else {
            theme = null;
            r2 = 0;
            zzcjl zzcjlVar7 = this.zzc.zzd;
            this.zzd = zzcjlVar7;
            zzcjlVar7.zzai(this.zzb);
        }
        if (this.zzc.zzw) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), r2);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbw)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                this.zzd.zzD().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbx)).booleanValue()) {
                this.zzd.zzD().setDownloadListener(zze.zza);
            }
        }
        this.zzd.zzae(this);
        zzcjl zzcjlVar8 = this.zzc.zzd;
        if (zzcjlVar8 != null) {
            zzL(zzcjlVar8.zzU(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zzd.zzE());
            }
            if (this.zzk) {
                this.zzd.zzat();
            }
            if (this.zzc.zzw) {
                Toolbar toolbar = new Toolbar(this.zzb);
                this.zzx = toolbar;
                toolbar.setId(View.generateViewId());
                this.zzd.zzE().setId(View.generateViewId());
                this.zzx.setBackgroundColor(-12303292);
                this.zzx.setVisibility(r2);
                try {
                    this.zzx.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzf().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                } catch (Resources.NotFoundException | NullPointerException e3) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e3);
                }
                this.zzx.setNavigationOnClickListener(this.zzq);
                this.zzx.setTitleMarginStart(r2);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzx, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzx.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzE(), layoutParams2);
                zzK(this.zzx);
            } else {
                this.zzl.addView(this.zzd.zzE(), -1, -1);
            }
        }
        if (!z2 && !this.zzm) {
            zzD();
        }
        if (this.zzc.zzk != 5) {
            zzr(z4);
            if (this.zzd.zzR()) {
                zzt(z4, true);
                return;
            }
            return;
        }
        Activity activity2 = this.zzb;
        zzejg zzejgVarZze = zzejh.zze();
        zzejgVarZze.zza(activity2);
        zzejgVarZze.zzb(this);
        zzejgVarZze.zzc(this.zzc.zzq);
        zzejgVarZze.zzd(this.zzc.zzr);
        try {
            zzG(zzejgVarZze.zze());
        } catch (RemoteException | zzh e4) {
            throw new zzh(e4.getMessage(), e4);
        }
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzx;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
