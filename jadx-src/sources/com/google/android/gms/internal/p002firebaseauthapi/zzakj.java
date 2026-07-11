package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzakj implements zzaof {
    private final zzakg zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i2, List<Double> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzaki)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).doubleValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZza = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZza += zzakg.zza(list.get(i5).doubleValue());
            }
            this.zza.zzn(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        zzaki zzakiVar = (zzaki) list;
        if (!z2) {
            while (i3 < zzakiVar.size()) {
                this.zza.zzb(i2, zzakiVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZza2 = 0;
        for (int i7 = 0; i7 < zzakiVar.size(); i7++) {
            iZza2 += zzakg.zza(zzakiVar.zzb(i7));
        }
        this.zza.zzn(iZza2);
        while (i3 < zzakiVar.size()) {
            this.zza.zzb(zzakiVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzi(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzc = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzc += zzakg.zzc(list.get(i5).intValue());
            }
            this.zza.zzn(iZzc);
            while (i3 < list.size()) {
                this.zza.zzl(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z2) {
            while (i3 < zzakzVar.size()) {
                this.zza.zzi(i2, zzakzVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzc2 = 0;
        for (int i7 = 0; i7 < zzakzVar.size(); i7++) {
            iZzc2 += zzakg.zzc(zzakzVar.zzb(i7));
        }
        this.zza.zzn(iZzc2);
        while (i3 < zzakzVar.size()) {
            this.zza.zzl(zzakzVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzd = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzd += zzakg.zzd(list.get(i5).intValue());
            }
            this.zza.zzn(iZzd);
            while (i3 < list.size()) {
                this.zza.zzk(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z2) {
            while (i3 < zzakzVar.size()) {
                this.zza.zzh(i2, zzakzVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzd2 = 0;
        for (int i7 = 0; i7 < zzakzVar.size(); i7++) {
            iZzd2 += zzakg.zzd(zzakzVar.zzb(i7));
        }
        this.zza.zzn(iZzd2);
        while (i3 < zzakzVar.size()) {
            this.zza.zzk(zzakzVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzalr)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzc = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzc += zzakg.zzc(list.get(i5).longValue());
            }
            this.zza.zzn(iZzc);
            while (i3 < list.size()) {
                this.zza.zzh(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z2) {
            while (i3 < zzalrVar.size()) {
                this.zza.zzf(i2, zzalrVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzc2 = 0;
        for (int i7 = 0; i7 < zzalrVar.size(); i7++) {
            iZzc2 += zzakg.zzc(zzalrVar.zzb(i7));
        }
        this.zza.zzn(iZzc2);
        while (i3 < zzalrVar.size()) {
            this.zza.zzh(zzalrVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzf(int i2, List<Float> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakx)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).floatValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZza = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZza += zzakg.zza(list.get(i5).floatValue());
            }
            this.zza.zzn(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        if (!z2) {
            while (i3 < zzakxVar.size()) {
                this.zza.zzb(i2, zzakxVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZza2 = 0;
        for (int i7 = 0; i7 < zzakxVar.size(); i7++) {
            iZza2 += zzakg.zza(zzakxVar.zzb(i7));
        }
        this.zza.zzn(iZza2);
        while (i3 < zzakxVar.size()) {
            this.zza.zzb(zzakxVar.zzb(i3));
            i3++;
        }
    }

    public static zzakj zza(zzakg zzakgVar) {
        zzakj zzakjVar = zzakgVar.zze;
        return zzakjVar != null ? zzakjVar : new zzakj(zzakgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzg(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzi(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZze = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZze += zzakg.zze(list.get(i5).intValue());
            }
            this.zza.zzn(iZze);
            while (i3 < list.size()) {
                this.zza.zzl(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z2) {
            while (i3 < zzakzVar.size()) {
                this.zza.zzi(i2, zzakzVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZze2 = 0;
        for (int i7 = 0; i7 < zzakzVar.size(); i7++) {
            iZze2 += zzakg.zze(zzakzVar.zzb(i7));
        }
        this.zza.zzn(iZze2);
        while (i3 < zzakzVar.size()) {
            this.zza.zzl(zzakzVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzh(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzalr)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzd = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzd += zzakg.zzd(list.get(i5).longValue());
            }
            this.zza.zzn(iZzd);
            while (i3 < list.size()) {
                this.zza.zzj(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z2) {
            while (i3 < zzalrVar.size()) {
                this.zza.zzh(i2, zzalrVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzd2 = 0;
        for (int i7 = 0; i7 < zzalrVar.size(); i7++) {
            iZzd2 += zzakg.zzd(zzalrVar.zzb(i7));
        }
        this.zza.zzn(iZzd2);
        while (i3 < zzalrVar.size()) {
            this.zza.zzj(zzalrVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzi(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzg = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzg += zzakg.zzg(list.get(i5).intValue());
            }
            this.zza.zzn(iZzg);
            while (i3 < list.size()) {
                this.zza.zzk(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z2) {
            while (i3 < zzakzVar.size()) {
                this.zza.zzh(i2, zzakzVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzg2 = 0;
        for (int i7 = 0; i7 < zzakzVar.size(); i7++) {
            iZzg2 += zzakg.zzg(zzakzVar.zzb(i7));
        }
        this.zza.zzn(iZzg2);
        while (i3 < zzakzVar.size()) {
            this.zza.zzk(zzakzVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzj(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzalr)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZze = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZze += zzakg.zze(list.get(i5).longValue());
            }
            this.zza.zzn(iZze);
            while (i3 < list.size()) {
                this.zza.zzh(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z2) {
            while (i3 < zzalrVar.size()) {
                this.zza.zzf(i2, zzalrVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZze2 = 0;
        for (int i7 = 0; i7 < zzalrVar.size(); i7++) {
            iZze2 += zzakg.zze(zzalrVar.zzb(i7));
        }
        this.zza.zzn(iZze2);
        while (i3 < zzalrVar.size()) {
            this.zza.zzh(zzalrVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzk(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzh = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzh += zzakg.zzh(list.get(i5).intValue());
            }
            this.zza.zzn(iZzh);
            while (i3 < list.size()) {
                this.zza.zzm(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z2) {
            while (i3 < zzakzVar.size()) {
                this.zza.zzj(i2, zzakzVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzh2 = 0;
        for (int i7 = 0; i7 < zzakzVar.size(); i7++) {
            iZzh2 += zzakg.zzh(zzakzVar.zzb(i7));
        }
        this.zza.zzn(iZzh2);
        while (i3 < zzakzVar.size()) {
            this.zza.zzm(zzakzVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzl(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzalr)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzg(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzf = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzf += zzakg.zzf(list.get(i5).longValue());
            }
            this.zza.zzn(iZzf);
            while (i3 < list.size()) {
                this.zza.zzi(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z2) {
            while (i3 < zzalrVar.size()) {
                this.zza.zzg(i2, zzalrVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzf2 = 0;
        for (int i7 = 0; i7 < zzalrVar.size(); i7++) {
            iZzf2 += zzakg.zzf(zzalrVar.zzb(i7));
        }
        this.zza.zzn(iZzf2);
        while (i3 < zzalrVar.size()) {
            this.zza.zzi(zzalrVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzm(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzakz)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzl(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzj = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzj += zzakg.zzj(list.get(i5).intValue());
            }
            this.zza.zzn(iZzj);
            while (i3 < list.size()) {
                this.zza.zzn(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z2) {
            while (i3 < zzakzVar.size()) {
                this.zza.zzl(i2, zzakzVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzj2 = 0;
        for (int i7 = 0; i7 < zzakzVar.size(); i7++) {
            iZzj2 += zzakg.zzj(zzakzVar.zzb(i7));
        }
        this.zza.zzn(iZzj2);
        while (i3 < zzakzVar.size()) {
            this.zza.zzn(zzakzVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzn(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzalr)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzk(i2, 2);
            int iZzg = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzg += zzakg.zzg(list.get(i5).longValue());
            }
            this.zza.zzn(iZzg);
            while (i3 < list.size()) {
                this.zza.zzj(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z2) {
            while (i3 < zzalrVar.size()) {
                this.zza.zzh(i2, zzalrVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzk(i2, 2);
        int iZzg2 = 0;
        for (int i7 = 0; i7 < zzalrVar.size(); i7++) {
            iZzg2 += zzakg.zzg(zzalrVar.zzb(i7));
        }
        this.zza.zzn(iZzg2);
        while (i3 < zzalrVar.size()) {
            this.zza.zzj(zzalrVar.zzb(i3));
            i3++;
        }
    }

    private zzakj(zzakg zzakgVar) {
        zzakg zzakgVar2 = (zzakg) zzalb.zza(zzakgVar, "output");
        this.zza = zzakgVar2;
        zzakgVar2.zze = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, boolean z2) throws IOException {
        this.zza.zzb(i2, z2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, List<Boolean> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzajn)) {
            if (z2) {
                this.zza.zzk(i2, 2);
                int iZza = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    iZza += zzakg.zza(list.get(i5).booleanValue());
                }
                this.zza.zzn(iZza);
                while (i3 < list.size()) {
                    this.zza.zzb(list.get(i3).booleanValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        zzajn zzajnVar = (zzajn) list;
        if (z2) {
            this.zza.zzk(i2, 2);
            int iZza2 = 0;
            for (int i7 = 0; i7 < zzajnVar.size(); i7++) {
                iZza2 += zzakg.zza(zzajnVar.zzb(i7));
            }
            this.zza.zzn(iZza2);
            while (i3 < zzajnVar.size()) {
                this.zza.zzb(zzajnVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zzajnVar.size()) {
            this.zza.zzb(i2, zzajnVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzf(int i2, int i3) throws IOException {
        this.zza.zzl(i2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzg(i2, j2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i2, Object obj, zzamv zzamvVar) throws IOException {
        this.zza.zzc(i2, (zzamc) obj, zzamvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, zzajp zzajpVar) throws IOException {
        this.zza.zzc(i2, zzajpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i2, List<?> list, zzamv zzamvVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzb(i2, list.get(i3), zzamvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i2, int i3) throws IOException {
        this.zza.zzi(i2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, List<zzajp> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzc(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zzf(i2, j2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    @Deprecated
    public final void zzb(int i2) throws IOException {
        this.zza.zzk(i2, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, double d2) throws IOException {
        this.zza.zzb(i2, d2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (list instanceof zzaln) {
            zzaln zzalnVar = (zzaln) list;
            while (i3 < list.size()) {
                Object objZza = zzalnVar.zza(i3);
                if (objZza instanceof String) {
                    this.zza.zzb(i2, (String) objZza);
                } else {
                    this.zza.zzc(i2, (zzajp) objZza);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzb(i2, list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    @Deprecated
    public final void zza(int i2) throws IOException {
        this.zza.zzk(i2, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, int i3) throws IOException {
        this.zza.zzi(i2, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, long j2) throws IOException {
        this.zza.zzf(i2, j2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, float f3) throws IOException {
        this.zza.zzb(i2, f3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, Object obj, zzamv zzamvVar) throws IOException {
        zzakg zzakgVar = this.zza;
        zzakgVar.zzk(i2, 3);
        zzamvVar.zza((zzamc) obj, zzakgVar.zze);
        zzakgVar.zzk(i2, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, List<?> list, zzamv zzamvVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zza(i2, list.get(i3), zzamvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final <K, V> void zza(int i2, zzalx<K, V> zzalxVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i2, 2);
            this.zza.zzn(zzalu.zza(zzalxVar, entry.getKey(), entry.getValue()));
            zzalu.zza(this.zza, zzalxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, Object obj) throws IOException {
        if (obj instanceof zzajp) {
            this.zza.zzd(i2, (zzajp) obj);
        } else {
            this.zza.zzb(i2, (zzamc) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i2, String str) throws IOException {
        this.zza.zzb(i2, str);
    }
}
