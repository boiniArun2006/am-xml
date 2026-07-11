package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzagx implements zzagq {
    public final zzguf zza;
    private final int zzb;

    private zzagx(int i2, zzguf zzgufVar) {
        this.zzb = i2;
        this.zza = zzgufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzagx zzb(int i2, zzer zzerVar) {
        zzagq zzagyVar;
        String str;
        zzguc zzgucVar = new zzguc();
        int iZze = zzerVar.zze();
        int iZzc = -2;
        while (zzerVar.zzd() > 8) {
            int iZzC = zzerVar.zzC();
            int iZzg = zzerVar.zzg() + zzerVar.zzC();
            zzerVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzagy zzagyVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc != 2) {
                            if (iZzc == 1) {
                                int iZzu = zzerVar.zzu();
                                String str2 = iZzu != 1 ? iZzu != 85 ? iZzu != 255 ? iZzu != 8192 ? iZzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iZzu2 = zzerVar.zzu();
                                    int iZzC2 = zzerVar.zzC();
                                    zzerVar.zzk(6);
                                    int iZzz = zzfj.zzz(zzerVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                    int iZzu3 = zzerVar.zzd() > 0 ? zzerVar.zzu() : 0;
                                    zzt zztVar = new zzt();
                                    zztVar.zzm(str2);
                                    zztVar.zzE(iZzu2);
                                    zztVar.zzF(iZzC2);
                                    if (str2.equals("audio/raw") && iZzz != 0) {
                                        zztVar.zzG(iZzz);
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                        byte[] bArr = new byte[iZzu3];
                                        zzerVar.zzm(bArr, 0, iZzu3);
                                        zztVar.zzp(zzguf.zzj(bArr));
                                    }
                                    zzagyVar = new zzagy(zztVar.zzM());
                                } else {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZzu).length() + 43);
                                    sb.append("Ignoring track with unsupported format tag ");
                                    sb.append(iZzu);
                                    zzee.zzc("StreamFormatChunk", sb.toString());
                                }
                            } else {
                                zzee.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfj.zzP(iZzc)));
                            }
                            break;
                        } else {
                            zzerVar.zzk(4);
                            int iZzC3 = zzerVar.zzC();
                            int iZzC4 = zzerVar.zzC();
                            zzerVar.zzk(4);
                            int iZzC5 = zzerVar.zzC();
                            switch (iZzC5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC5).length() + 44);
                                sb2.append("Ignoring track with unsupported compression ");
                                sb2.append(iZzC5);
                                zzee.zzc("StreamFormatChunk", sb2.toString());
                            } else {
                                zzt zztVar2 = new zzt();
                                zztVar2.zzt(iZzC3);
                                zztVar2.zzu(iZzC4);
                                zztVar2.zzm(str);
                                zzagyVar2 = new zzagy(zztVar2.zzM());
                            }
                        }
                        zzagyVar = zzagyVar2;
                        break;
                    case 1751742049:
                        zzagyVar = zzagu.zzb(zzerVar);
                        break;
                    case 1752331379:
                        zzagyVar = zzagv.zzb(zzerVar);
                        break;
                    case 1852994675:
                        zzagyVar = zzagz.zzb(zzerVar);
                        break;
                    default:
                        zzagyVar = zzagyVar2;
                        break;
                }
            } else {
                zzagyVar = zzb(zzerVar.zzC(), zzerVar);
            }
            if (zzagyVar != null) {
                if (zzagyVar.zza() == 1752331379) {
                    iZzc = ((zzagv) zzagyVar).zzc();
                }
                zzgucVar.zzf(zzagyVar);
            }
            zzerVar.zzh(iZzg);
            zzerVar.zzf(iZze);
        }
        return new zzagx(i2, zzgucVar.zzi());
    }

    @Nullable
    public final zzagq zzc(Class cls) {
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        int i2 = 0;
        while (i2 < size) {
            zzagq zzagqVar = (zzagq) zzgufVar.get(i2);
            i2++;
            if (zzagqVar.getClass() == cls) {
                return zzagqVar;
            }
        }
        return null;
    }
}
