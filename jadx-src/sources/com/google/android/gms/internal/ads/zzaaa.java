package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(zzzg.zza);

    @Nullable
    public final Context zza;
    private final Object zzd;

    @GuardedBy
    private zzzl zze;

    @Nullable
    @GuardedBy
    private Thread zzf;

    @Nullable
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ int zzn(zzv zzvVar, zzguf zzgufVar) {
        int i2 = 0;
        while (i2 < zzgufVar.size()) {
            int i3 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i3 < list.size()) {
                    if (((zzx) list.get(i3)).zzb.equals(zzgufVar.get(i2))) {
                        return i2;
                    }
                    i3++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i2 = 0; i2 < zzynVar.zzb; i2++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i2))) != null) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    @Nullable
    public final zzmm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    protected final Pair zzh(zzaaf zzaafVar, int[][][] iArr, final int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        final zzzl zzzlVar;
        final boolean z2;
        final String str;
        final String languageTag;
        int i2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        int i3 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i5 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                z2 = false;
                break;
            }
            if (zzaafVar.zza(i8) == 2 && zzaafVar.zzb(i8).zzb > 0) {
                z2 = true;
                break;
            }
            i8++;
        }
        Pair pairZzw = zzw(1, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i9, zzbg zzbgVar, int[] iArr3) {
                final zzaaa zzaaaVar = this.zza;
                final zzzl zzzlVar2 = zzzlVar;
                zzgrd zzgrdVar = new zzgrd() { // from class: com.google.android.gms.internal.ads.zzzf
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzaaaVar.zzk(zzzlVar2, (zzv) obj);
                    }
                };
                int i10 = iArr2[i9];
                int i11 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i12 = 0; i12 < zzbgVar.zza; i12++) {
                    zzgucVar.zzf(new zzyx(i9, zzbgVar, i12, zzzlVar2, iArr3[i12], z2, zzgrdVar, i10));
                }
                return zzgucVar.zzi();
            }
        }, zzyy.zza);
        if (pairZzw != null) {
            zzaabVarArr[((Integer) pairZzw.second).intValue()] = (zzaab) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzaab) obj).zza.zza(((zzaab) obj).zzb[0]).zzd;
        }
        int i9 = zzzlVar.zzw.zzb;
        final Point pointZzO = (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair pairZzw2 = zzw(2, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzh
            /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
            @Override // com.google.android.gms.internal.ads.zzzr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ List zza(int i10, zzbg zzbgVar, int[] iArr3) {
                boolean z3;
                int i11;
                int i12;
                int i13;
                boolean z4;
                int i14;
                int i15;
                int i16;
                Point point;
                zzbg zzbgVar2 = zzbgVar;
                int i17 = zzaaa.zzb;
                Point point2 = pointZzO;
                int i18 = iArr2[i10];
                zzzl zzzlVar2 = zzzlVar;
                int i19 = point2 != null ? point2.x : zzzlVar2.zzi;
                int i20 = point2 != null ? point2.y : zzzlVar2.zzj;
                boolean z5 = zzzlVar2.zzl;
                if (i19 == Integer.MAX_VALUE) {
                    z3 = true;
                    i11 = -1;
                    i12 = Integer.MAX_VALUE;
                } else if (i20 == Integer.MAX_VALUE) {
                    i12 = Integer.MAX_VALUE;
                    z3 = true;
                    i11 = -1;
                } else {
                    int i21 = Integer.MAX_VALUE;
                    for (int i22 = 0; i22 < zzbgVar2.zza; i22++) {
                        zzv zzvVarZza = zzbgVar2.zza(i22);
                        int i23 = zzvVarZza.zzv;
                        if (i23 > 0 && (i14 = zzvVarZza.zzw) > 0) {
                            if (z5) {
                                if ((i23 > i14) != (i19 > i20)) {
                                    i16 = i20;
                                    i15 = i19;
                                }
                                if (i23 * i15 < i14 * i16) {
                                    String str2 = zzfj.zza;
                                    point = new Point(i16, ((r11 + i23) - 1) / i23);
                                } else {
                                    String str3 = zzfj.zza;
                                    point = new Point(((r12 + i14) - 1) / i14, i15);
                                }
                                int i24 = i23 * i14;
                                if (i23 < ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i24 < i21) {
                                    i21 = i24;
                                }
                            }
                            i15 = i20;
                            i16 = i19;
                            if (i23 * i15 < i14 * i16) {
                            }
                            int i242 = i23 * i14;
                            if (i23 < ((int) (point.x * 0.98f))) {
                            }
                        }
                    }
                    z3 = true;
                    i11 = -1;
                    i12 = i21;
                }
                int i25 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i26 = 0;
                while (i26 < zzbgVar2.zza) {
                    int iZzc = zzbgVar2.zza(i26).zzc();
                    if (i12 != Integer.MAX_VALUE) {
                        i13 = i11;
                        if (iZzc == i13 || iZzc > i12) {
                            z4 = false;
                        }
                        zzgucVar.zzf(new zzzz(i10, zzbgVar2, i26, zzzlVar2, iArr3[i26], str, i18, z4));
                        i26++;
                        zzbgVar2 = zzbgVar;
                        i11 = i13;
                    } else {
                        i13 = i11;
                    }
                    z4 = z3;
                    zzgucVar.zzf(new zzzz(i10, zzbgVar2, i26, zzzlVar2, iArr3[i26], str, i18, z4));
                    i26++;
                    zzbgVar2 = zzbgVar;
                    i11 = i13;
                }
                return zzgucVar.zzi();
            }
        }, zzzb.zza);
        int i10 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzze
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i11, zzbg zzbgVar, int[] iArr3) {
                int i12 = zzaaa.zzb;
                int i13 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i14 = 0; i14 < zzbgVar.zza; i14++) {
                    zzgucVar.zzf(new zzzi(i11, zzbgVar, i14, zzzlVar, iArr3[i14]));
                }
                return zzgucVar.zzi();
            }
        }, zzyz.zza) : null;
        if (pairZzw3 != null) {
            zzaabVarArr[((Integer) pairZzw3.second).intValue()] = (zzaab) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzaabVarArr[((Integer) pairZzw2.second).intValue()] = (zzaab) pairZzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzfj.zza;
            languageTag = locale.toLanguageTag();
        }
        int i11 = 3;
        Pair pairZzw4 = zzw(3, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzd
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i12, zzbg zzbgVar, int[] iArr3) {
                int i13 = zzaaa.zzb;
                int i14 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i15 = 0; i15 < zzbgVar.zza; i15++) {
                    zzgucVar.zzf(new zzzq(i12, zzbgVar, i15, zzzlVar, iArr3[i15], str, languageTag));
                }
                return zzgucVar.zzi();
            }
        }, zzza.zza);
        if (pairZzw4 != null) {
            zzaabVarArr[((Integer) pairZzw4.second).intValue()] = (zzaab) pairZzw4.first;
        }
        int i12 = 0;
        while (i12 < i5) {
            int iZza = zzaafVar.zza(i12);
            if (iZza == i5 || iZza == i3 || iZza == i11 || iZza == i10) {
                i2 = i3;
            } else {
                zzyn zzynVarZzb = zzaafVar.zzb(i12);
                int[][] iArr3 = iArr[i12];
                int i13 = i7;
                int i14 = i13;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i13 < zzynVarZzb.zzb) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i13);
                    int[] iArr4 = iArr3[i13];
                    zzzj zzzjVar2 = zzzjVar;
                    int i15 = i3;
                    for (int i16 = i7; i16 < zzbgVarZza.zza; i16++) {
                        if (zzmn.zzaa(iArr4[i16], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zzbgVarZza.zza(i16), iArr4[i16]);
                            if (zzzjVar2 == null || zzzjVar3.compareTo(zzzjVar2) > 0) {
                                zzzjVar2 = zzzjVar3;
                                zzbgVar = zzbgVarZza;
                                i14 = i16;
                            }
                        }
                    }
                    i13++;
                    i3 = i15;
                    i7 = 0;
                    zzzjVar = zzzjVar2;
                }
                i2 = i3;
                zzaabVarArr[i12] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i14}, 0);
            }
            i12++;
            i3 = i2;
            i5 = 2;
            i7 = 0;
            i11 = 3;
            i10 = 4;
        }
        int i17 = i3;
        HashMap map = new HashMap();
        int i18 = 2;
        for (int i19 = 0; i19 < 2; i19++) {
            zzv(zzaafVar.zzb(i19), zzzlVar, map);
        }
        zzv(zzaafVar.zze(), zzzlVar, map);
        for (int i20 = 0; i20 < 2; i20++) {
            if (((zzbh) map.get(Integer.valueOf(zzaafVar.zza(i20)))) != null) {
                throw null;
            }
        }
        int i21 = 0;
        while (i21 < i18) {
            zzyn zzynVarZzb2 = zzaafVar.zzb(i21);
            if (zzzlVar.zzb(i21, zzynVarZzb2)) {
                if (zzzlVar.zzc(i21, zzynVarZzb2) != null) {
                    throw null;
                }
                zzaabVarArr[i21] = null;
            }
            i21++;
            i18 = 2;
        }
        int i22 = 0;
        while (i22 < i18) {
            int iZza2 = zzaafVar.zza(i22);
            if (zzzlVar.zza(i22) || zzzlVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzaabVarArr[i22] = null;
            }
            i22++;
            i18 = 2;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzaasVarZzt = zzt();
        zzguf zzgufVarZzd = zzyu.zzd(zzaabVarArr);
        int i23 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i24 = 0;
        while (i24 < i23) {
            zzaab zzaabVar = zzaabVarArr[i24];
            if (zzaabVar != null) {
                int[] iArr5 = zzaabVar.zzb;
                int length = iArr5.length;
                if (length != 0) {
                    zzaacVarArr[i24] = length == i17 ? new zzaad(zzaabVar.zza, iArr5[0], 0, 0, null) : zzytVar.zza(zzaabVar.zza, iArr5, 0, zzaasVarZzt, (zzguf) zzgufVarZzd.get(i24));
                } else {
                    i24++;
                    i23 = 2;
                    i17 = 1;
                }
            }
            i24++;
            i23 = 2;
            i17 = 1;
        }
        zzmo[] zzmoVarArr = new zzmo[i23];
        for (int i25 = 0; i25 < i23; i25++) {
            zzmoVarArr[i25] = (zzzlVar.zza(i25) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i25))) || (zzaafVar.zza(i25) != -2 && zzaacVarArr[i25] == null)) ? null : zzmo.zza;
        }
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (zzzlVar != null) {
            this.zze = zzzlVar;
        } else {
            zzzk zzzkVar = new zzzk(zzzlVar, bArr);
            zzzkVar.zzx((zzbl) zzzlVar);
            this.zze = new zzzl(zzzkVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* synthetic */ int zzm(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z2;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                z2 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            zzs();
        }
    }

    @Nullable
    private static final Pair zzw(int i2, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i2 == zzaafVar2.zza(i3)) {
                zzyn zzynVarZzb = zzaafVar2.zzb(i3);
                for (int i5 = 0; i5 < zzynVarZzb.zzb; i5++) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i5);
                    List listZza = zzzrVar.zza(i3, zzbgVarZza, iArr[i3][i5]);
                    int i7 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 + 1;
                        zzzs zzzsVar = (zzzs) listZza.get(i8);
                        int iZza = zzzsVar.zza();
                        if (!zArr[i8] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzguf.zzj(zzzsVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i10 = i9; i10 < i7; i10++) {
                                    zzzs zzzsVar2 = (zzzs) listZza.get(i10);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        zArr[i10] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i8 = i9;
                    }
                }
            }
            i3++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((zzzs) list.get(i11)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z2 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean zEquals;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (zEquals) {
            return;
        }
        if (zzzlVar.zzU && this.zza == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzk(zzzl zzzlVar, zzv zzvVar) {
        Boolean bool;
        zzzp zzzpVar;
        zzzp zzzpVar2;
        if (!zzzlVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i2 = zzvVar.zzG;
        byte b2 = -1;
        if (i2 != -1 && i2 > 2) {
            String str = zzvVar.zzo;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            b2 = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            b2 = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            b2 = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            b2 = 1;
                        }
                        break;
                }
                if ((b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3) && (Build.VERSION.SDK_INT < 32 || (zzzpVar2 = this.zzg) == null || !zzzpVar2.zza())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza() && zzzpVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzvVar);
        }
        return true;
    }

    @Nullable
    protected static String zzi(@Nullable String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    protected static int zzj(zzv zzvVar, @Nullable String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 != null && strZzi != null) {
            if (!strZzi2.startsWith(strZzi) && !strZzi.startsWith(strZzi2)) {
                String str2 = zzfj.zza;
                if (!strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z2 || strZzi2 != null) {
            return 0;
        }
        return 1;
    }
}
