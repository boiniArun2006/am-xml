package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzadt {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int zzc(zzeq zzeqVar) {
        int iZzj = zzeqVar.zzj(5);
        return iZzj == 31 ? zzeqVar.zzj(6) + 32 : iZzj;
    }

    private static int zzd(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(4);
        if (iZzj == 15) {
            if (zzeqVar.zzc() >= 24) {
                return zzeqVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (iZzj < 13) {
            return zzb[iZzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }

    public static zzads zza(byte[] bArr) throws zzat {
        return zzb(new zzeq(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzads zzb(zzeq zzeqVar, boolean z2) throws zzat {
        int i2;
        int iZzc = zzc(zzeqVar);
        int iZzd = zzd(zzeqVar);
        int iZzj = zzeqVar.zzj(4);
        StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 8);
        sb.append("mp4a.40.");
        sb.append(iZzc);
        String string = sb.toString();
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzeqVar);
            iZzc = zzc(zzeqVar);
            if (iZzc == 22) {
                iZzj = zzeqVar.zzj(4);
            }
        }
        if (z2) {
            int i3 = 3;
            if (iZzc != 1 && iZzc != 2 && iZzc != 3 && iZzc != 4 && iZzc != 6 && iZzc != 7 && iZzc != 17) {
                switch (iZzc) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 31);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(iZzc);
                        throw zzat.zzc(sb2.toString());
                }
            }
            if (zzeqVar.zzi()) {
                zzee.zzc("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(14);
            }
            boolean zZzi = zzeqVar.zzi();
            if (iZzj != 0) {
                if (iZzc != 6) {
                    if (iZzc == 20) {
                        iZzc = 20;
                        zzeqVar.zzh(3);
                    }
                    if (zZzi) {
                    }
                    switch (iZzc) {
                    }
                } else {
                    zzeqVar.zzh(3);
                    if (zZzi) {
                        if (iZzc == 22) {
                            zzeqVar.zzh(16);
                            i2 = 22;
                        } else {
                            i2 = iZzc;
                        }
                        if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                            zzeqVar.zzh(3);
                        }
                        zzeqVar.zzh(1);
                    }
                    switch (iZzc) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int iZzj2 = zzeqVar.zzj(2);
                            if (iZzj2 == 2) {
                                i3 = iZzj2;
                            }
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 22);
                            sb3.append("Unsupported epConfig: ");
                            sb3.append(i3);
                            throw zzat.zzc(sb3.toString());
                    }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i5 = zzc[iZzj];
        if (i5 != -1) {
            return new zzads(iZzd, i5, string, null);
        }
        throw zzat.zzb(null, null);
    }
}
