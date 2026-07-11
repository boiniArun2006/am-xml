package com.google.android.gms.measurement.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgh extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    final long zzn() {
        return this.zzh;
    }

    @WorkerThread
    final List zzp() {
        return this.zzi;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(17:79|6|(1:10)(2:11|(1:13))|83|14|(4:16|(1:18)(1:20)|77|21)|26|(2:28|(2:30|(2:32|(2:34|(2:36|(2:38|(1:40)(1:41))(1:42))(1:43))(1:44))(1:45))(1:46))(1:47)|48|81|49|(1:51)(1:52)|53|(1:55)|59|(2:62|(1:64)(4:65|(3:68|(1:86)(1:87)|66)|85|71))(1:71)|(2:73|74)(2:75|76))|5|26|(0)(0)|48|81|49|(0)(0)|53|(0)|59|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        r11.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:49:0x016d, B:53:0x0183, B:55:0x0187), top: B:81:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzf() {
        String str;
        String string;
        int iZzC;
        List listZzs;
        String strZza;
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzibVar.zzaY().getPackageName();
        PackageManager packageManager = zzibVar.zzaY().getPackageManager();
        String str2 = "";
        int i2 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        if (packageManager != null) {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgt.zzl(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                        i2 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string;
                        this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgt.zzl(packageName), str3);
                        string = str3;
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
            this.zza = packageName;
            this.zzd = installerPackageName;
            this.zzb = str3;
            this.zzc = i2;
            this.zze = string;
            this.zzf = 0L;
            zzib zzibVar2 = this.zzu;
            iZzC = zzibVar2.zzC();
            if (iZzC != 0) {
                this.zzu.zzaV().zzk().zza("App measurement collection enabled");
            } else if (iZzC == 1) {
                this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
            } else if (iZzC == 3) {
                this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
            } else if (iZzC == 4) {
                this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
            } else if (iZzC == 6) {
                this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
            } else if (iZzC == 7) {
                this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
            } else if (iZzC != 8) {
                zzib zzibVar3 = this.zzu;
                zzibVar3.zzaV().zzi().zza("App measurement disabled");
                zzibVar3.zzaV().zzc().zza("Invalid scion state in identity");
            } else {
                this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
            }
            this.zzl = "";
            zzib zzibVar4 = this.zzu;
            zzibVar4.zzaU();
            strZza = zzls.zza(zzibVar4.zzaY(), "google_app_id", zzibVar2.zzq());
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzl = str2;
            if (iZzC == 0) {
                zzibVar4.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
            }
            this.zzi = null;
            zzib zzibVar5 = this.zzu;
            zzibVar5.zzaU();
            listZzs = zzibVar5.zzc().zzs("analytics.safelisted_events");
            if (listZzs == null) {
                this.zzi = listZzs;
            } else if (listZzs.isEmpty()) {
                zzibVar5.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
            } else {
                Iterator it = listZzs.iterator();
                while (it.hasNext()) {
                    if (!zzibVar5.zzk().zzk("safelisted event", (String) it.next())) {
                        break;
                    }
                }
                this.zzi = listZzs;
            }
            if (packageManager == null) {
                this.zzk = InstantApps.isInstantApp(zzibVar5.zzaY()) ? 1 : 0;
                return;
            } else {
                this.zzk = 0;
                return;
            }
        }
        zzibVar.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgt.zzl(packageName));
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i2;
        this.zze = string;
        this.zzf = 0L;
        zzib zzibVar22 = this.zzu;
        iZzC = zzibVar22.zzC();
        if (iZzC != 0) {
        }
        this.zzl = "";
        zzib zzibVar42 = this.zzu;
        zzibVar42.zzaU();
        strZza = zzls.zza(zzibVar42.zzaY(), "google_app_id", zzibVar22.zzq());
        if (TextUtils.isEmpty(strZza)) {
        }
        this.zzl = str2;
        if (iZzC == 0) {
        }
        this.zzi = null;
        zzib zzibVar52 = this.zzu;
        zzibVar52.zzaU();
        listZzs = zzibVar52.zzc().zzs("analytics.safelisted_events");
        if (listZzs == null) {
        }
        if (packageManager == null) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0184: MOVE (r21v0 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:390)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0172: MOVE (r21v2 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:372)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x014d: MOVE (r21v3 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:335)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x00f9: MOVE (r21v6 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr) (LINE:251)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @androidx.annotation.WorkerThread
    final com.google.android.gms.measurement.internal.zzr zzh(java.lang.String r45) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgh.zzh(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z2 = false;
        if (str2 != null && !str2.equals(str)) {
            z2 = true;
        }
        this.zzo = str;
        return z2;
    }

    zzgh(zzib zzibVar, long j2, long j3) {
        super(zzibVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j2;
        this.zzh = j3;
    }

    @WorkerThread
    final void zzi() {
        String str;
        String str2;
        zzg();
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzd().zzl().zzo(zzjj.ANALYTICS_STORAGE)) {
            zzibVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            zzibVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzgr zzgrVarZzj = zzibVar.zzaV().zzj();
        if (str == null) {
            str2 = V8ValueNull.NULL;
        } else {
            str2 = "not null";
        }
        zzgrVarZzj.zza(String.format("Resetting session stitching token to %s", str2));
        this.zzm = str;
        this.zzn = zzibVar.zzaZ().currentTimeMillis();
    }

    @WorkerThread
    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    @WorkerThread
    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    @WorkerThread
    final int zzm() {
        zzb();
        return this.zzc;
    }

    @WorkerThread
    final int zzo() {
        zzb();
        return this.zzk;
    }
}
