package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.safedk.android.analytics.AppLovinBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final int zzb;

    @SafeParcelable.Field(id = 4)
    public final int zzc;

    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Field(id = 6)
    public final int zze;

    @SafeParcelable.Field(id = 7)
    public final int zzf;

    @SafeParcelable.Field(id = 8)
    public final zzr[] zzg;

    @SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(id = 11)
    public boolean zzj;

    @SafeParcelable.Field(id = 12)
    public boolean zzk;

    @SafeParcelable.Field(id = 13)
    public boolean zzl;

    @SafeParcelable.Field(id = 14)
    public boolean zzm;

    @SafeParcelable.Field(id = 15)
    public boolean zzn;

    @SafeParcelable.Field(id = 16)
    public boolean zzo;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public static zzr zzb() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzr zzc() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(Context context, AdSize[] adSizeArr) {
        int height;
        int i2;
        int iZze;
        String string;
        int dimensionPixelSize;
        double d2;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        boolean zZzd = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzo = zZzd;
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (zZzd) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z2 = this.zze == -1;
        boolean z3 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z2) {
            zzbb.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r7.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzbb.zza();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i3 = displayMetrics2.heightPixels;
                        int i5 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i7 = displayMetrics2.heightPixels;
                        int i8 = displayMetrics2.widthPixels;
                        if (i7 == i3 && i8 == i5) {
                            int i9 = displayMetrics.widthPixels;
                            zzbb.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", AppLovinBridge.f61290h);
                            dimensionPixelSize = i9 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        }
                        d2 = dimensionPixelSize / displayMetrics.density;
                        i2 = (int) d2;
                        if (d2 - ((double) i2) >= 0.01d) {
                        }
                    }
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
                d2 = dimensionPixelSize / displayMetrics.density;
                i2 = (int) d2;
                if (d2 - ((double) i2) >= 0.01d) {
                    i2++;
                }
            }
        } else {
            i2 = this.zze;
            zzbb.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzu(displayMetrics, this.zze);
        }
        if (z3) {
            iZze = zze(displayMetrics);
        } else {
            iZze = this.zzb;
        }
        zzbb.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzu(displayMetrics, iZze);
        if (!z2 && !z3) {
            if (this.zzn || this.zzo) {
                int i10 = this.zze;
                int i11 = this.zzb;
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length() + 3);
                sb.append(i10);
                sb.append("x");
                sb.append(i11);
                sb.append("_as");
                string = sb.toString();
            } else if (zIsFluid) {
                string = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = string;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(iZze).length() + 3);
            sb2.append(i2);
            sb2.append("x");
            sb2.append(iZze);
            sb2.append("_as");
            this.zza = sb2.toString();
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzr[length];
            for (int i12 = 0; i12 < adSizeArr.length; i12++) {
                this.zzg[i12] = new zzr(context, adSizeArr[i12]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) int i7, @SafeParcelable.Param(id = 8) zzr[] zzrVarArr, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) boolean z4, @SafeParcelable.Param(id = 11) boolean z5, @SafeParcelable.Param(id = 12) boolean z6, @SafeParcelable.Param(id = 13) boolean z7, @SafeParcelable.Param(id = 14) boolean z9, @SafeParcelable.Param(id = 15) boolean z10, @SafeParcelable.Param(id = 16) boolean z11) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z2;
        this.zze = i5;
        this.zzf = i7;
        this.zzg = zzrVarArr;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = z6;
        this.zzl = z7;
        this.zzm = z9;
        this.zzn = z10;
        this.zzo = z11;
    }
}
