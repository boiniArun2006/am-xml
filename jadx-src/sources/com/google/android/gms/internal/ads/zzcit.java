package com.google.android.gms.internal.ads;

import ScC.FuwU.XIvb;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzcit extends zzcfv implements zzhz, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcid zzc;
    private final zzaaa zzd;
    private final zzcgd zze;
    private final WeakReference zzf;
    private final zzxt zzg;

    @Nullable
    private zzjh zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcfu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzcig zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzO() {
        return this.zzl;
    }

    final /* synthetic */ zzhb zzS(String str, boolean z2) {
        zzcit zzcitVar = true != z2 ? null : this;
        zzcgd zzcgdVar = this.zze;
        return new zzciw(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzm, zzcgdVar.zzn);
    }

    final /* synthetic */ zzhb zzU(String str, boolean z2) {
        zzcit zzcitVar = true != z2 ? null : this;
        zzcgd zzcgdVar = this.zze;
        zzcic zzcicVar = new zzcic(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzh);
        this.zzu.add(new WeakReference(zzcicVar));
        return zzcicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z2, int i2) {
        this.zzl += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    @Nullable
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzm(zzmy zzmyVar, int i2, long j2) {
        this.zzm += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzn(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzs(zzcfu zzcfuVar) {
        this.zzk = zzcfuVar;
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzA(int i2) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcic zzcicVar = (zzcic) ((WeakReference) it.next()).get();
            if (zzcicVar != null) {
                zzcicVar.zzk(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzE(boolean z2) {
        this.zzh.zzj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzF(int i2) {
        this.zzc.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzG(int i2) {
        this.zzc.zzl(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzM(boolean z2) {
        if (this.zzh == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            this.zzh.zzF();
            if (i2 >= 2) {
                return;
            }
            zzaaa zzaaaVar = this.zzd;
            zzzk zzzkVarZzd = zzaaaVar.zzc().zzd();
            zzzkVarZzd.zzy(i2, !z2);
            zzaaaVar.zzf(zzzkVarZzd);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzN() {
        return this.zzh.zzv();
    }

    @VisibleForTesting
    final zzwm zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzakVarZzc = zzzVar.zzc();
        zzxt zzxtVar = this.zzg;
        zzxtVar.zza(this.zze.zzf);
        return zzxtVar.zzb(zzakVarZzc);
    }

    final /* synthetic */ zzhb zzT(String str, boolean z2) {
        zzhi zzhiVar = new zzhi();
        zzhiVar.zzb(str);
        zzhiVar.zzf(true != z2 ? null : this);
        zzcgd zzcgdVar = this.zze;
        zzhiVar.zzc(zzcgdVar.zzd);
        zzhiVar.zzd(zzcgdVar.zze);
        zzhiVar.zze(true);
        return zzhiVar.zza();
    }

    final /* synthetic */ zzhb zzV(zzha zzhaVar) {
        zzhb zzhbVarZza = zzhaVar.zza();
        zzcie zzcieVar = new zzcie() { // from class: com.google.android.gms.internal.ads.zzcir
            @Override // com.google.android.gms.internal.ads.zzcie
            public final /* synthetic */ void zza(boolean z2, long j2) {
                this.zza.zzX(z2, j2);
            }
        };
        return new zzcig(this.zzb, zzhbVarZza, this.zzo, this.zzp, this, zzcieVar);
    }

    final /* synthetic */ zzml[] zzW(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
        zzuw zzuwVar = zzuw.zzb;
        Context context = this.zzb;
        zzta zztaVar = new zzta(context, new zzuc(context, null, null), zzuwVar, false, handler, zzrcVar, new zzsp(context).zza());
        zzaca zzacaVar = new zzaca(context);
        zzacaVar.zza(zzuwVar);
        zzacaVar.zzb(handler);
        zzacaVar.zzc(zzadmVar);
        return new zzml[]{zztaVar, zzacaVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z2, long j2) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzr(z2, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
        if (zzhbVar instanceof zzhu) {
            synchronized (this.zzq) {
                this.zzs.add((zzhu) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcig) {
            this.zzt = (zzcig) zzhbVar;
            final zzcge zzcgeVar = (zzcge) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && zzcgeVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcis
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i2 = zzcit.zza;
                        zzcgeVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zze(zzmy zzmyVar, int i2) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzu(XIvb.rPZVNLwrH, zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z2) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            if (this.zze.zzj) {
                zzcfuVar.zzv("onLoadException", iOException);
            } else {
                zzcfuVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzk(zzmy zzmyVar, zzv zzvVar, @Nullable zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzv zzvVar, @Nullable zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.zzz));
        map.put("bitRate", String.valueOf(zzvVar.zzj));
        int i2 = zzvVar.zzv;
        int i3 = zzvVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        map.put("resolution", sb.toString());
        String str = zzvVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(zzmy zzmyVar, Object obj, long j2) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z2) {
        zzwm zzxbVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z2;
            int length = uriArr.length;
            if (length == 1) {
                zzxbVar = zzR(uriArr[0]);
            } else {
                zzwm[] zzwmVarArr = new zzwm[length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    zzwmVarArr[i2] = zzR(uriArr[i2]);
                }
                zzxbVar = new zzxb(false, false, new zzvv(), zzwmVarArr);
            }
            this.zzh.zzG(zzxbVar);
            this.zzh.zzg();
            zzcfv.zzi().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzt() {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzcfv.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzu(Surface surface, boolean z2) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzv(float f3, boolean z2) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzB(f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzx(long j2) {
        this.zzh.zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzy(int i2) {
        this.zzc.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzz(int i2) {
        this.zzc.zzn(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcit(Context context, zzcgd zzcgdVar, zzcge zzcgeVar, @Nullable Integer num) {
        int iZzp;
        final zzha zzhaVar;
        final zzha zzhaVar2;
        zzafa zzafaVar;
        this.zzb = context;
        this.zze = zzcgdVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcgeVar);
        zzcid zzcidVar = new zzcid();
        this.zzc = zzcidVar;
        zzaaa zzaaaVar = new zzaaa(context);
        this.zzd = zzaaaVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcfv.zzf().incrementAndGet();
        zzmu zzmuVar = new zzmu(context, new zzmq() { // from class: com.google.android.gms.internal.ads.zzcio
            @Override // com.google.android.gms.internal.ads.zzmq
            public final /* synthetic */ zzml[] zza(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
                return this.zza.zzW(handler, zzadmVar, zzrcVar, zzyqVar, zzviVar);
            }
        });
        zzmuVar.zza(zzaaaVar);
        zzmuVar.zzb(zzcidVar);
        zzmv zzmvVarZzc = zzmuVar.zzc();
        this.zzh = zzmvVarZzc;
        zzmvVarZzc.zzD(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgra.zzd(zzcgeVar != null ? zzcgeVar.zzn() : null).zza("");
        if (zzcgeVar != null) {
            iZzp = zzcgeVar.zzp();
        } else {
            iZzp = 0;
        }
        this.zzp = iZzp;
        final String strZze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcgeVar.zzs().afmaVersion);
        if (this.zzj && this.zzi.limit() > 0) {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzhaVar2 = new zzha() { // from class: com.google.android.gms.internal.ads.zzcii
                @Override // com.google.android.gms.internal.ads.zzha
                public final /* synthetic */ zzhb zza() {
                    int i2 = zzcit.zza;
                    return new zzgw(bArr);
                }
            };
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcE)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
                    final boolean z2 = zzcgdVar.zzi ? false : true;
                    if (zzcgdVar.zzl) {
                        zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcij
                            @Override // com.google.android.gms.internal.ads.zzha
                            public final /* synthetic */ zzhb zza() {
                                return this.zza.zzS(strZze, z2);
                            }
                        };
                    } else if (zzcgdVar.zzh > 0) {
                        zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcil
                            @Override // com.google.android.gms.internal.ads.zzha
                            public final /* synthetic */ zzhb zza() {
                                return this.zza.zzU(strZze, z2);
                            }
                        };
                    } else {
                        zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcik
                            @Override // com.google.android.gms.internal.ads.zzha
                            public final /* synthetic */ zzhb zza() {
                                return this.zza.zzT(strZze, z2);
                            }
                        };
                    }
                    if (zzcgdVar.zzi) {
                        zzhaVar2 = new zzha() { // from class: com.google.android.gms.internal.ads.zzcim
                            @Override // com.google.android.gms.internal.ads.zzha
                            public final /* synthetic */ zzhb zza() {
                                return this.zza.zzV(zzhaVar);
                            }
                        };
                    } else {
                        zzhaVar2 = zzhaVar;
                    }
                    ByteBuffer byteBuffer = this.zzi;
                    if (byteBuffer != null && byteBuffer.limit() > 0) {
                        final byte[] bArr2 = new byte[this.zzi.limit()];
                        this.zzi.get(bArr2);
                        zzhaVar2 = new zzha() { // from class: com.google.android.gms.internal.ads.zzcin
                            @Override // com.google.android.gms.internal.ads.zzha
                            public final /* synthetic */ zzhb zza() {
                                int i2 = zzcit.zza;
                                zzhb zzhbVarZza = zzhaVar2.zza();
                                byte[] bArr3 = bArr2;
                                return new zzcih(new zzgw(bArr3), bArr3.length, zzhbVarZza);
                            }
                        };
                    }
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzp)).booleanValue()) {
            zzafaVar = zzciq.zza;
        } else {
            zzafaVar = zzcip.zza;
        }
        this.zzg = new zzxt(zzhaVar2, zzafaVar);
    }

    public final void finalize() {
        zzcfv.zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzI() {
        if (!zzY()) {
            return this.zzl;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final long zzK() {
        if (!zzY()) {
            synchronized (this.zzq) {
                while (true) {
                    ArrayList arrayList = this.zzs;
                    if (!arrayList.isEmpty()) {
                        long j2 = this.zzn;
                        Map mapZzj = ((zzhu) arrayList.remove(0)).zzj();
                        long j3 = 0;
                        if (mapZzj != null) {
                            Iterator it = mapZzj.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (entry != null) {
                                    try {
                                        if (entry.getKey() != null && zzgql.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                            j3 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                            break;
                                        }
                                    } catch (NumberFormatException unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                        this.zzn = j2 + j3;
                    }
                }
            }
            return this.zzn;
        }
        return this.zzt.zzp();
    }
}
