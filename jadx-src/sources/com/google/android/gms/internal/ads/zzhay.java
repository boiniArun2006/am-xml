package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzhay implements zzhbl {
    private static final Charset zza = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);
    private final InputStream zzb;

    private zzhay(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhay zza(String str) {
        return new zzhay(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhyl zzhylVar) throws IOException {
        if (!(zzhylVar instanceof zzhyp)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhylVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhja.zzc(zzhylVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    @Override // com.google.android.gms.internal.ads.zzhbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhql zzb() throws IOException {
        byte b2;
        int i2;
        byte b4;
        zzhqy zzhqyVar;
        byte b5;
        zzhqb zzhqbVar;
        String str = "status";
        String str2 = "keyData";
        String str3 = QiDPjiOCZHDS.ORlm;
        try {
            try {
                InputStream inputStream = this.zzb;
                int i3 = zzhbw.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i5 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                    inputStream = inputStream2;
                }
                zzhyn zzhynVarZze = zzhja.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zzhynVarZze.zzc("key")) {
                    throw new zzhyo("invalid keyset: no key");
                }
                zzhyl zzhylVarZzh = zzhynVarZze.zzh("key");
                if (!(zzhylVarZzh instanceof zzhyk)) {
                    throw new zzhyo("invalid keyset: key must be an array");
                }
                zzhyk zzhykVarZzf = zzhylVarZzh.zzf();
                if (zzhykVarZzf.zzb() == 0) {
                    throw new zzhyo("invalid keyset: key is empty");
                }
                zzhqi zzhqiVarZzh = zzhql.zzh();
                if (zzhynVarZze.zzc(str3)) {
                    zzhqiVarZzh.zza(zzc(zzhynVarZze.zzh(str3)));
                }
                int i7 = 0;
                while (i7 < zzhykVarZzf.zzb()) {
                    zzhyn zzhynVarZze2 = zzhykVarZzf.zzc(i7).zze();
                    if (!zzhynVarZze2.zzc(str2) || !zzhynVarZze2.zzc(str) || !zzhynVarZze2.zzc("keyId") || !zzhynVarZze2.zzc("outputPrefixType")) {
                        throw new zzhyo("invalid key");
                    }
                    zzhyl zzhylVarZzh2 = zzhynVarZze2.zzh(str2);
                    if (!(zzhylVarZzh2 instanceof zzhyn)) {
                        throw new zzhyo("invalid key: keyData must be an object");
                    }
                    zzhqj zzhqjVarZze = zzhqk.zze();
                    String strZzd = zzhynVarZze2.zzh(str).zzd();
                    String str4 = str;
                    int iHashCode = strZzd.hashCode();
                    String str5 = str2;
                    int i8 = i7;
                    if (iHashCode != -891611359) {
                        if (iHashCode != 478389753) {
                            b2 = (iHashCode == 1053567612 && strZzd.equals("DISABLED")) ? (byte) 1 : (byte) -1;
                        } else if (strZzd.equals("DESTROYED")) {
                            b2 = 2;
                        }
                    } else if (strZzd.equals("ENABLED")) {
                        b2 = 0;
                    }
                    if (b2 == 0) {
                        i2 = 3;
                    } else if (b2 == 1) {
                        i2 = 4;
                    } else {
                        if (b2 != 2) {
                            throw new zzhyo("unknown status: ".concat(strZzd));
                        }
                        i2 = 5;
                    }
                    zzhqjVarZze.zze(i2);
                    zzhqjVarZze.zzc(zzc(zzhynVarZze2.zzh("keyId")));
                    String strZzd2 = zzhynVarZze2.zzh("outputPrefixType").zzd();
                    switch (strZzd2.hashCode()) {
                        case -2053249079:
                            b4 = !strZzd2.equals("LEGACY") ? (byte) -1 : (byte) 2;
                            break;
                        case 80904:
                            if (strZzd2.equals("RAW")) {
                                b4 = 1;
                                break;
                            }
                            break;
                        case 2575090:
                            if (strZzd2.equals("TINK")) {
                                b4 = 0;
                                break;
                            }
                            break;
                        case 1761684556:
                            if (strZzd2.equals("CRUNCHY")) {
                                b4 = 3;
                                break;
                            }
                            break;
                    }
                    if (b4 == 0) {
                        zzhqyVar = zzhqy.TINK;
                    } else if (b4 == 1) {
                        zzhqyVar = zzhqy.RAW;
                    } else if (b4 == 2) {
                        zzhqyVar = zzhqy.LEGACY;
                    } else {
                        if (b4 != 3) {
                            throw new zzhyo("unknown output prefix type: ".concat(strZzd2));
                        }
                        zzhqyVar = zzhqy.CRUNCHY;
                    }
                    zzhqjVarZze.zzd(zzhqyVar);
                    zzhyn zzhynVarZze3 = zzhylVarZzh2.zze();
                    if (!zzhynVarZze3.zzc("typeUrl") || !zzhynVarZze3.zzc("value") || !zzhynVarZze3.zzc("keyMaterialType")) {
                        throw new zzhyo("invalid keyData");
                    }
                    byte[] bArrZza = zzhwq.zza(zzhynVarZze3.zzh("value").zzd(), 2);
                    zzhqa zzhqaVarZzd = zzhqc.zzd();
                    zzhqaVarZzd.zza(zzhynVarZze3.zzh("typeUrl").zzd());
                    zzian zzianVar = zzian.zza;
                    zzhqaVarZzd.zzb(zzian.zzs(bArrZza, 0, bArrZza.length));
                    String strZzd3 = zzhynVarZze3.zzh("keyMaterialType").zzd();
                    switch (strZzd3.hashCode()) {
                        case -1881281466:
                            b5 = !strZzd3.equals("REMOTE") ? (byte) -1 : (byte) 3;
                            break;
                        case -1609477353:
                            if (strZzd3.equals("SYMMETRIC")) {
                                b5 = 0;
                                break;
                            }
                            break;
                        case 249237018:
                            if (strZzd3.equals("ASYMMETRIC_PRIVATE")) {
                                b5 = 1;
                                break;
                            }
                            break;
                        case 1534613202:
                            if (strZzd3.equals("ASYMMETRIC_PUBLIC")) {
                                b5 = 2;
                                break;
                            }
                            break;
                    }
                    if (b5 == 0) {
                        zzhqbVar = zzhqb.SYMMETRIC;
                    } else if (b5 == 1) {
                        zzhqbVar = zzhqb.ASYMMETRIC_PRIVATE;
                    } else if (b5 == 2) {
                        zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
                    } else {
                        if (b5 != 3) {
                            throw new zzhyo("unknown key material type: ".concat(strZzd3));
                        }
                        zzhqbVar = zzhqb.REMOTE;
                    }
                    zzhqaVarZzd.zzc(zzhqbVar);
                    zzhqjVarZze.zza((zzhqc) zzhqaVarZzd.zzbu());
                    zzhqiVarZzh.zzb((zzhqk) zzhqjVarZze.zzbu());
                    i7 = i8 + 1;
                    str = str4;
                    str2 = str5;
                }
                zzhql zzhqlVar = (zzhql) zzhqiVarZzh.zzbu();
                this.zzb.close();
                return zzhqlVar;
            } catch (Throwable th) {
                this.zzb.close();
                throw th;
            }
        } catch (zzhyo e2) {
            e = e2;
            throw new IOException(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new IOException(e);
        }
    }
}
