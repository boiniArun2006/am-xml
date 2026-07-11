package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzu;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzcab;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzceo;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzejv;
import com.google.android.gms.internal.ads.zzejw;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbga zzA;
    private final zzccq zzB;
    private final zzcg zzC;
    private final zzchk zzD;
    private final zzcev zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzckb zze;
    private final zzced zzf;
    private final zzz zzg;
    private final zzbdz zzh;
    private final zzcdu zzi;
    private final zzaa zzj;
    private final zzbfl zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbhk zzn;
    private final zzbid zzo;
    private final zzax zzp;
    private final zzcab zzq;
    private final zzceo zzr;
    private final zzbsq zzs;
    private final com.google.android.gms.ads.internal.overlay.zzz zzt;
    private final zzbq zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbto zzx;
    private final zzbr zzy;
    private final zzejw zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzckb zzckbVar = new zzckb();
        zzced zzcedVar = new zzced();
        int i2 = Build.VERSION.SDK_INT;
        zzz zzyVar = i2 >= 30 ? new zzy() : i2 >= 28 ? new zzx() : i2 >= 26 ? new zzv() : new zzu();
        zzbdz zzbdzVar = new zzbdz();
        zzcdu zzcduVar = new zzcdu();
        zzaa zzaaVar = new zzaa();
        zzbfl zzbflVar = new zzbfl();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbhk zzbhkVar = new zzbhk();
        zzbid zzbidVar = new zzbid();
        zzax zzaxVar = new zzax();
        zzcab zzcabVar = new zzcab();
        zzceo zzceoVar = new zzceo();
        zzbsq zzbsqVar = new zzbsq();
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz();
        zzbq zzbqVar = new zzbq();
        zzae zzaeVar = new zzae();
        zzaf zzafVar = new zzaf();
        zzbto zzbtoVar = new zzbto();
        zzbr zzbrVar = new zzbr();
        zzejv zzejvVar = new zzejv();
        zzbga zzbgaVar = new zzbga();
        zzccq zzccqVar = new zzccq();
        zzcg zzcgVar = new zzcg();
        zzchk zzchkVar = new zzchk();
        zzcev zzcevVar = new zzcev();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzckbVar;
        this.zzf = zzcedVar;
        this.zzg = zzyVar;
        this.zzh = zzbdzVar;
        this.zzi = zzcduVar;
        this.zzj = zzaaVar;
        this.zzk = zzbflVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbhkVar;
        this.zzo = zzbidVar;
        this.zzp = zzaxVar;
        this.zzq = zzcabVar;
        this.zzr = zzceoVar;
        this.zzs = zzbsqVar;
        this.zzu = zzbqVar;
        this.zzt = zzzVar;
        this.zzv = zzaeVar;
        this.zzw = zzafVar;
        this.zzx = zzbtoVar;
        this.zzy = zzbrVar;
        this.zzz = zzejvVar;
        this.zzA = zzbgaVar;
        this.zzB = zzccqVar;
        this.zzC = zzcgVar;
        this.zzD = zzchkVar;
        this.zzE = zzcevVar;
    }

    public static zzcg zzA() {
        return zza.zzC;
    }

    public static zzchk zzB() {
        return zza.zzD;
    }

    public static zzcev zzC() {
        return zza.zzE;
    }

    public static zzccq zzD() {
        return zza.zzB;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzc() {
        return zza.zzd;
    }

    public static zzckb zzd() {
        return zza.zze;
    }

    public static zzced zze() {
        return zza.zzf;
    }

    public static zzz zzf() {
        return zza.zzg;
    }

    public static zzbdz zzg() {
        return zza.zzh;
    }

    public static zzcdu zzh() {
        return zza.zzi;
    }

    public static zzaa zzi() {
        return zza.zzj;
    }

    public static zzbfl zzj() {
        return zza.zzk;
    }

    public static Clock zzk() {
        return zza.zzl;
    }

    public static zzf zzl() {
        return zza.zzm;
    }

    public static zzbhk zzm() {
        return zza.zzn;
    }

    public static zzbid zzn() {
        return zza.zzo;
    }

    public static zzax zzo() {
        return zza.zzp;
    }

    public static zzcab zzp() {
        return zza.zzq;
    }

    public static zzceo zzq() {
        return zza.zzr;
    }

    public static zzbsq zzr() {
        return zza.zzs;
    }

    public static zzbq zzs() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzz zzt() {
        return zza.zzt;
    }

    public static zzejw zzu() {
        return zza.zzz;
    }

    public static zzae zzv() {
        return zza.zzv;
    }

    public static zzaf zzw() {
        return zza.zzw;
    }

    public static zzbto zzx() {
        return zza.zzx;
    }

    public static zzbr zzy() {
        return zza.zzy;
    }

    public static zzbga zzz() {
        return zza.zzA;
    }
}
