package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzcx {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Nullable
    public final CharSequence zza;

    @Nullable
    public final Layout.Alignment zzb;

    @Nullable
    public final Layout.Alignment zzc;

    @Nullable
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;

    /* synthetic */ zzcx(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f3, int i2, int i3, float f4, int i5, int i7, float f5, float f6, float f7, boolean z2, int i8, int i9, float f8, int i10, byte[] bArr) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            zzgrc.zza(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f3;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = f4;
        this.zzi = i5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = i7;
        this.zzm = f5;
        this.zzn = i9;
        this.zzo = f8;
        this.zzp = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcx.class == obj.getClass()) {
            zzcx zzcxVar = (zzcx) obj;
            if (TextUtils.equals(this.zza, zzcxVar.zza) && this.zzb == zzcxVar.zzb && this.zzc == zzcxVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcxVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcxVar.zzd == null) && this.zze == zzcxVar.zze && this.zzf == zzcxVar.zzf && this.zzg == zzcxVar.zzg && this.zzh == zzcxVar.zzh && this.zzi == zzcxVar.zzi && this.zzj == zzcxVar.zzj && this.zzk == zzcxVar.zzk && this.zzl == zzcxVar.zzl && this.zzm == zzcxVar.zzm && this.zzn == zzcxVar.zzn && this.zzo == zzcxVar.zzo && this.zzp == zzcxVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final zzcw zza() {
        return new zzcw(this, null);
    }

    static {
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza("");
        zzcwVar.zzr();
        String str = zzfj.zza;
        zzq = Integer.toString(0, 36);
        zzr = Integer.toString(17, 36);
        zzs = Integer.toString(1, 36);
        zzt = Integer.toString(2, 36);
        Integer.toString(3, 36);
        zzu = Integer.toString(18, 36);
        zzv = Integer.toString(4, 36);
        zzw = Integer.toString(5, 36);
        zzx = Integer.toString(6, 36);
        zzy = Integer.toString(7, 36);
        zzz = Integer.toString(8, 36);
        zzA = Integer.toString(9, 36);
        zzB = Integer.toString(10, 36);
        zzC = Integer.toString(11, 36);
        zzD = Integer.toString(12, 36);
        zzE = Integer.toString(13, 36);
        zzF = Integer.toString(14, 36);
        zzG = Integer.toString(15, 36);
        zzH = Integer.toString(16, 36);
        zzI = Integer.toString(19, 36);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), Boolean.FALSE, -16777216, Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo), Integer.valueOf(this.zzp));
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzq, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListZza = zzda.zza((Spanned) charSequence);
                if (!arrayListZza.isEmpty()) {
                    bundle.putParcelableArrayList(zzr, arrayListZza);
                }
            }
        }
        bundle.putSerializable(zzs, this.zzb);
        bundle.putSerializable(zzt, this.zzc);
        bundle.putFloat(zzv, this.zze);
        bundle.putInt(zzw, this.zzf);
        bundle.putInt(zzx, this.zzg);
        bundle.putFloat(zzy, this.zzh);
        bundle.putInt(zzz, this.zzi);
        bundle.putInt(zzA, this.zzl);
        bundle.putFloat(zzB, this.zzm);
        bundle.putFloat(zzC, this.zzj);
        bundle.putFloat(zzD, this.zzk);
        bundle.putBoolean(zzF, false);
        bundle.putInt(zzE, -16777216);
        bundle.putInt(zzG, this.zzn);
        bundle.putFloat(zzH, this.zzo);
        bundle.putInt(zzI, this.zzp);
        Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzgrc.zzi(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzu, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }
}
