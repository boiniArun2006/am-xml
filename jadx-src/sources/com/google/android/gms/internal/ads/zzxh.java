package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxh implements zzabb, zzvz {
    final /* synthetic */ zzxq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzxd zze;
    private final zzaex zzf;
    private final zzdq zzg;
    private final zzafv zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;

    @Nullable
    private zzagh zzm;
    private boolean zzn;

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        this.zzi = true;
    }

    final /* synthetic */ void zzd(long j2, long j3) {
        this.zzh.zza = j2;
        this.zzk = j3;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzer zzerVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzerVar.zzd();
        zzagh zzaghVar = this.zzm;
        zzaghVar.getClass();
        zzaghVar.zzc(zzerVar, iZzd);
        zzaghVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e A[EDGE_INSN: B:140:0x020e->B:99:0x020e BREAK  A[LOOP:1: B:86:0x01d5->B:143:0x01d5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws Throwable {
        int i2;
        long j2;
        int i3;
        long j3;
        zzhy zzhyVar;
        long jZzb;
        int i5;
        int i7;
        boolean z2;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i8;
        zzhy zzhyVar2;
        zzxq zzxqVar;
        zzj zzjVar;
        int iZzf;
        int i9;
        int i10 = 0;
        String str4 = null;
        for (int i11 = 0; i11 == 0 && !this.zzi; i11 = iZzf) {
            try {
                j3 = this.zzh.zza;
                zzhf zzhfVarZzi = zzi(j3, str4);
                this.zzl = zzhfVarZzi;
                zzhyVar = this.zzd;
                jZzb = zzhyVar.zzb(zzhfVarZzi);
            } catch (Throwable th) {
                th = th;
                i2 = i10;
                j2 = -1;
            }
            if (this.zzi) {
                zzxd zzxdVar = this.zze;
                if (zzxdVar.zzd() != -1) {
                    this.zzh.zza = zzxdVar.zzd();
                }
                zzhd.zza(this.zzd);
                return;
            }
            List list6 = (List) zzhyVar.zzj().get("ETag");
            str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i10);
            if (jZzb != -1) {
                jZzb += j3;
                this.zza.zzH();
            }
            long j4 = jZzb;
            zzxq zzxqVar2 = this.zza;
            Map mapZzj = zzhyVar.zzj();
            List list7 = (List) mapZzj.get("icy-br");
            j2 = -1;
            if (list7 != null) {
                try {
                    String str5 = (String) list7.get(i10);
                    try {
                        i5 = Integer.parseInt(str5) * 1000;
                    } catch (NumberFormatException unused) {
                        i5 = -1;
                    }
                    if (i5 > 0) {
                        i7 = i5;
                        z2 = true;
                        list = (List) mapZzj.get("icy-genre");
                        if (list != null) {
                            str = (String) list.get(0);
                            z2 = true;
                        } else {
                            str = null;
                        }
                        list2 = (List) mapZzj.get("icy-name");
                        if (list2 != null) {
                            str2 = (String) list2.get(0);
                            z2 = true;
                        } else {
                            str2 = null;
                        }
                        list3 = (List) mapZzj.get("icy-url");
                        if (list3 != null) {
                            str3 = (String) list3.get(0);
                            z2 = true;
                        } else {
                            str3 = null;
                        }
                        list4 = (List) mapZzj.get("icy-pub");
                        if (list4 != null) {
                            zEquals = ((String) list4.get(0)).equals("1");
                            z2 = true;
                        } else {
                            zEquals = false;
                        }
                        list5 = (List) mapZzj.get("icy-metaint");
                        if (list5 != null) {
                            String str6 = (String) list5.get(0);
                            try {
                                i9 = Integer.parseInt(str6);
                            } catch (NumberFormatException unused2) {
                                i9 = -1;
                            }
                            if (i9 > 0) {
                                i8 = i9;
                                z2 = true;
                                zzxqVar2.zzP(z2 ? new zzaic(i7, str, str2, str3, zEquals, i8) : null);
                                zzhyVar2 = this.zzd;
                                zzxqVar = this.zza;
                                if (zzxqVar.zzO() == null || zzxqVar.zzO().zzf == -1) {
                                    zzjVar = zzhyVar2;
                                } else {
                                    zzwa zzwaVar = new zzwa(zzhyVar2, zzxqVar.zzO().zzf, this);
                                    zzagh zzaghVarZzx = zzxqVar.zzx();
                                    this.zzm = zzaghVarZzx;
                                    zzaghVarZzx.zzz(zzxq.zzc);
                                    zzjVar = zzwaVar;
                                }
                                zzxd zzxdVar2 = this.zze;
                                zzxdVar2.zza(zzjVar, this.zzc, zzhyVar2.zzj(), j3, j4, this.zzf);
                                if (zzxqVar.zzO() != null) {
                                    zzxdVar2.zzc();
                                }
                                if (this.zzj) {
                                    i2 = 0;
                                } else {
                                    zzxdVar2.zze(j3, this.zzk);
                                    i2 = 0;
                                    try {
                                        this.zzj = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i3 = i2;
                                    }
                                }
                                iZzf = i2;
                                while (true) {
                                    if (iZzf == 0) {
                                        break;
                                    }
                                    try {
                                        if (this.zzi) {
                                            iZzf = i2;
                                            break;
                                        }
                                        try {
                                            zzdq zzdqVar = this.zzg;
                                            zzdqVar.zzc();
                                            iZzf = zzxdVar2.zzf(this.zzh);
                                            long jZzd = zzxdVar2.zzd();
                                            if (jZzd > zzxqVar.zzL() + j3) {
                                                zzdqVar.zzb();
                                                zzxqVar.zzN().post(zzxqVar.zzM());
                                                j3 = jZzd;
                                            }
                                        } catch (InterruptedException unused3) {
                                            throw new InterruptedIOException();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i3 = iZzf;
                                    }
                                }
                                if (iZzf != 1) {
                                    iZzf = i2;
                                } else if (zzxdVar2.zzd() != -1) {
                                    this.zzh.zza = zzxdVar2.zzd();
                                }
                                zzhd.zza(zzhyVar2);
                                i10 = i2;
                            } else {
                                try {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                    sb.append("Invalid metadata interval: ");
                                    sb.append(str6);
                                    zzee.zzc("IcyHeaders", sb.toString());
                                    i8 = -1;
                                } catch (NumberFormatException unused4) {
                                    zzee.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                    i8 = i9;
                                }
                                zzxqVar2.zzP(z2 ? new zzaic(i7, str, str2, str3, zEquals, i8) : null);
                                zzhyVar2 = this.zzd;
                                zzxqVar = this.zza;
                                if (zzxqVar.zzO() == null) {
                                    zzjVar = zzhyVar2;
                                    zzxd zzxdVar22 = this.zze;
                                    zzxdVar22.zza(zzjVar, this.zzc, zzhyVar2.zzj(), j3, j4, this.zzf);
                                    if (zzxqVar.zzO() != null) {
                                    }
                                    if (this.zzj) {
                                    }
                                    iZzf = i2;
                                    while (true) {
                                        if (iZzf == 0) {
                                        }
                                    }
                                    if (iZzf != 1) {
                                    }
                                    zzhd.zza(zzhyVar2);
                                    i10 = i2;
                                }
                            }
                        } else {
                            i8 = -1;
                            zzxqVar2.zzP(z2 ? new zzaic(i7, str, str2, str3, zEquals, i8) : null);
                            zzhyVar2 = this.zzd;
                            zzxqVar = this.zza;
                            if (zzxqVar.zzO() == null) {
                            }
                        }
                    } else {
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                            sb2.append("Invalid bitrate: ");
                            sb2.append(str5);
                            zzee.zzc("IcyHeaders", sb2.toString());
                            z2 = false;
                            i7 = -1;
                        } catch (NumberFormatException unused5) {
                            zzee.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                            i7 = i5;
                            z2 = false;
                        }
                        list = (List) mapZzj.get("icy-genre");
                        if (list != null) {
                        }
                        list2 = (List) mapZzj.get("icy-name");
                        if (list2 != null) {
                        }
                        list3 = (List) mapZzj.get("icy-url");
                        if (list3 != null) {
                        }
                        list4 = (List) mapZzj.get("icy-pub");
                        if (list4 != null) {
                        }
                        list5 = (List) mapZzj.get("icy-metaint");
                        if (list5 != null) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i2 = 0;
                    i3 = i2;
                    if (i3 != 1) {
                    }
                    zzhd.zza(this.zzd);
                    throw th;
                }
            } else {
                z2 = false;
                i7 = -1;
                list = (List) mapZzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) mapZzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) mapZzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) mapZzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) mapZzj.get("icy-metaint");
                if (list5 != null) {
                }
            }
            if (i3 != 1) {
                zzxd zzxdVar3 = this.zze;
                if (zzxdVar3.zzd() != j2) {
                    this.zzh.zza = zzxdVar3.zzd();
                }
            }
            zzhd.zza(this.zzd);
            throw th;
        }
    }

    public zzxh(zzxq zzxqVar, Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzaex zzaexVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzxdVar;
        this.zzf = zzaexVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafv();
        this.zzj = true;
        this.zzb = zzwb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j2, @Nullable String str) {
        Map mapZzd = zzxq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzguh zzguhVar = new zzguh();
            zzguhVar.zzb(mapZzd.entrySet());
            zzguhVar.zza("If-Range", str);
            mapZzd = zzguhVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j2);
        zzheVar.zzd(6);
        zzheVar.zzb(mapZzd);
        return zzheVar.zze();
    }
}
