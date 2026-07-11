package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzami implements zzagh {
    private final zzagh zza;
    private final zzamd zzb;

    @Nullable
    private zzamf zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfj.zzb;
    private final zzer zzc = new zzer();

    public final void zzf(boolean z2) {
        this.zzi = true;
    }

    private final void zzi(int i2) {
        int length = this.zzf.length;
        int i3 = this.zze;
        if (length - i3 >= i2) {
            return;
        }
        int i5 = i3 - this.zzd;
        int iMax = Math.max(i5 + i5, i2 + i5);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i5);
        this.zzd = 0;
        this.zze = i5;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i2, z2, 0);
        }
        zzi(i2);
        int iZza = zzjVar.zza(this.zzf, this.zze, i2);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i2, int i3) {
        if (this.zzg == null) {
            this.zza.zzd(zzerVar, i2, i3);
            return;
        }
        zzi(i2);
        zzerVar.zzm(this.zzf, this.zze, i2);
        this.zze += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(final long j2, final int i2, int i3, int i5, @Nullable zzagg zzaggVar) {
        if (this.zzg == null) {
            this.zza.zze(j2, i2, i3, i5, zzaggVar);
            return;
        }
        zzgrc.zzb(zzaggVar == null, "DRM on subtitles is not supported");
        int i7 = (this.zze - i5) - i3;
        try {
            this.zzg.zza(this.zzf, i7, i3, zzame.zza(), new zzdr() { // from class: com.google.android.gms.internal.ads.zzamh
                @Override // com.google.android.gms.internal.ads.zzdr
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j2, i2, (zzalx) obj);
                }
            });
        } catch (RuntimeException e2) {
            if (!this.zzi) {
                throw e2;
            }
            zzee.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e2);
        }
        int i8 = i7 + i3;
        this.zzd = i8;
        if (i8 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    final /* synthetic */ void zzh(long j2, int i2, zzalx zzalxVar) {
        this.zzh.getClass();
        zzguf zzgufVar = zzalxVar.zza;
        long j3 = zzalxVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgufVar.size());
        Iterator<E> it = zzgufVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(KfLR.xxZFjdQYNdW, j3);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzer zzerVar = this.zzc;
        int length = bArrMarshall.length;
        zzerVar.zzb(bArrMarshall, length);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzc(zzerVar, length);
        long j4 = zzalxVar.zzb;
        if (j4 == -9223372036854775807L) {
            zzgrc.zzi(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j5 = this.zzh.zzt;
            j2 = j5 == Long.MAX_VALUE ? j2 + j4 : j4 + j5;
        }
        zzaghVar.zze(j2, i2 | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        String str = zzvVar.zzo;
        str.getClass();
        zzgrc.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzamd zzamdVar = this.zzb;
            this.zzg = zzamdVar.zza(zzvVar) ? zzamdVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzz(zzvVar);
            return;
        }
        zzagh zzaghVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzm(MimeTypes.APPLICATION_MEDIA3_CUES);
        zztVarZza.zzj(str);
        zztVarZza.zzr(Long.MAX_VALUE);
        zztVarZza.zzK(this.zzb.zzb(zzvVar));
        zzaghVar.zzz(zztVarZza.zzM());
    }

    public zzami(zzagh zzaghVar, zzamd zzamdVar) {
        this.zza = zzaghVar;
        this.zzb = zzamdVar;
    }
}
