package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.container.MdtaMetadataEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfs implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfs.class == obj.getClass()) {
            zzfs zzfsVar = (zzfs) obj;
            if (this.zza.equals(zzfsVar.zza) && Arrays.equals(this.zzb, zzfsVar.zzb) && this.zzc == zzfsVar.zzc && this.zzd == zzfsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String string;
        int i2 = this.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                string = zzfj.zzi(this.zzb);
            } else if (i2 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgxz.zzd(this.zzb)));
            } else if (i2 == 67) {
                string = String.valueOf(zzgxz.zzd(this.zzb));
            } else if (i2 == 75) {
                string = String.valueOf(androidx.media3.container.j.n(this.zzb[0]));
            } else if (i2 != 78) {
                byte[] bArr = this.zzb;
                String str = zzfj.zza;
                int length = bArr.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i3] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new zzer(this.zzb).zzJ());
            }
        } else if (this.zza.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP)) {
            List listZzb = zzb();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzgqw.zzb(sb2, listZzb, ",");
            string = sb2.toString();
        }
        String str2 = this.zza;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 18 + String.valueOf(string).length());
        sb3.append("mdta: key=");
        sb3.append(str2);
        sb3.append(", value=");
        sb3.append(string);
        return sb3.toString();
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final List zzb() {
        zzgrc.zzj(this.zza.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b2 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList.add(Integer.valueOf(bArr[i2 + 2]));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfs(String str, byte[] bArr, int i2, int i3) {
        byte b2;
        byte b4;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                break;
            case -269399509:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_INTERLEAVED)) {
                    b2 = 4;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_LENGTH)) {
                    b2 = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_OFFSET)) {
                    b2 = 1;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP)) {
                    b2 = 3;
                    break;
                }
                break;
        }
        if (b2 != 0) {
            if (b2 != 1 && b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        if (i3 == 75) {
                            if (bArr.length == 1 && ((b4 = bArr[0]) == 0 || b4 == 1)) {
                                i3 = 75;
                                zzgrc.zza(z);
                            } else {
                                i3 = 75;
                                z = false;
                                zzgrc.zza(z);
                            }
                        } else {
                            z = false;
                            zzgrc.zza(z);
                        }
                    }
                } else {
                    zzgrc.zza(i3 == 0);
                }
            } else if (i3 == 78) {
                if (bArr.length == 8) {
                    i3 = 78;
                    zzgrc.zza(z);
                } else {
                    i3 = 78;
                    z = false;
                    zzgrc.zza(z);
                }
            } else {
                z = false;
                zzgrc.zza(z);
            }
        } else if (i3 == 23) {
            if (bArr.length == 4) {
                i3 = 23;
                zzgrc.zza(z);
            } else {
                i3 = 23;
                z = false;
                zzgrc.zza(z);
            }
        } else {
            z = false;
            zzgrc.zza(z);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }
}
