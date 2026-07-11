package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzald {
    public final boolean zza;

    @Nullable
    public final String zzb;
    public final zzagg zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzald(boolean z2, @Nullable String str, int i2, byte[] bArr, int i3, int i5, @Nullable byte[] bArr2) {
        boolean z3;
        boolean z4;
        byte b2 = 0;
        int i7 = 1;
        if (i2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bArr2 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        zzgrc.zza(z3 ^ z4);
        this.zza = z2;
        this.zzb = str;
        this.zzd = i2;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        b2 = 3;
                        break;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                    }
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        b2 = 1;
                        break;
                    }
                    break;
            }
            if (b2 != 0 && b2 != 1) {
                if (b2 != 2 && b2 != 3) {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzee.zzc("TrackEncryptionBox", sb.toString());
                } else {
                    i7 = 2;
                }
            }
        }
        this.zzc = new zzagg(i7, bArr, i3, i5);
    }
}
