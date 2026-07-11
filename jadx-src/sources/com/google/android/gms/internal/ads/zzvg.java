package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzvg {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzun zza() throws zzuy {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzun) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z2, boolean z3) throws zzuy {
        try {
            zzux zzuxVar = new zzux(str, z2, z3);
            HashMap map = zzb;
            List list = (List) map.get(zzuxVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zzuxVar, new zzvb(z2, z3, str.equals(MimeTypes.VIDEO_MV_HEVC)));
            if (z2) {
                arrayListZzh.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzun) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzh.add(zzun.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(arrayListZzh, zzvc.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzun) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzun) arrayListZzh.remove(0));
            }
            zzguf zzgufVarZzq = zzguf.zzq(arrayListZzh);
            map.put(zzuxVar, zzgufVarZzq);
            return zzgufVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zzc(zzuw zzuwVar, zzv zzvVar, boolean z2, boolean z3) throws zzuy {
        List listZza = zzuwVar.zza(zzvVar.zzo, z2, z3);
        List listZzd = zzd(zzuwVar, zzvVar, z2, z3);
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgucVar.zzh(listZza);
        zzgucVar.zzh(listZzd);
        return zzgucVar.zzi();
    }

    @CheckResult
    public static List zze(List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvf() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzvf
            public final /* synthetic */ int zza(Object obj) {
                int i2 = zzvg.zza;
                return ((zzun) obj).zzd(zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i2, int i3) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i2;
        codecProfileLevel.level = i3;
        return codecProfileLevel;
    }

    @Nullable
    public static String zzg(zzv zzvVar) {
        Pair pairZzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            int iIntValue = ((Integer) pairZzd.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if (MimeTypes.VIDEO_MV_HEVC.equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183 A[PHI: r3
      0x0183: PHI (r3v7 boolean) = (r3v6 boolean), (r3v8 boolean) binds: [B:98:0x017d, B:100:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzux zzuxVar, zzuz zzuzVar) throws zzuy {
        String str;
        String str2;
        int i2;
        int i3;
        String str3;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zZzd;
        boolean zZze;
        boolean z2;
        int i5;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        zzux zzuxVar2 = zzuxVar;
        zzuz zzuzVar2 = zzuzVar;
        String str6 = "secure-playback";
        String str7 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str8 = zzuxVar2.zza;
            int iZza = zzuzVar2.zza();
            boolean zZzc = zzuzVar2.zzc();
            int i7 = 0;
            while (i7 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzuzVar2.zzb(i7);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i8 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str6;
                        str2 = str7;
                        i2 = i7;
                        i3 = i8;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                int i10 = i9;
                                str3 = supportedTypes[i10];
                                if (str3.equalsIgnoreCase(str8)) {
                                    break;
                                }
                                i9 = i10 + 1;
                            } else if (str8.equals("video/dolby-vision")) {
                                str3 = "OMX.MS.HEVCDV.Decoder".equals(name) ? "video/hevcdv" : ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) ? "video/dv_hevc" : null;
                            } else if (str8.equals(MimeTypes.VIDEO_MV_HEVC)) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str3 = "video/x-mvhevc";
                                }
                            } else if (str8.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str3 = "audio/x-lg-alac";
                            } else if (str8.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str3 = "audio/x-lg-flac";
                            } else if (str8.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                str3 = "audio/lg-ac3";
                            }
                        }
                        if (str3 != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str3);
                                zZzd = zzuzVar2.zzd(str7, str3, capabilitiesForType);
                                zZze = zzuzVar2.zze(str7, str3, capabilitiesForType);
                                str2 = str7;
                            } catch (Exception e2) {
                                e = e2;
                                str4 = str3;
                            }
                            if (zzuxVar2.zzc) {
                                if (zZzd) {
                                    boolean zZzd2 = zzuzVar2.zzd(str6, str3, capabilitiesForType);
                                    boolean zZze2 = zzuzVar2.zze(str6, str3, capabilitiesForType);
                                    z2 = zzuxVar2.zzb;
                                    if (!z2) {
                                        if (z2) {
                                        }
                                        i5 = Build.VERSION.SDK_INT;
                                        str = str6;
                                        if (i5 < 29) {
                                        }
                                        boolean zZzi = zzi(mediaCodecInfoZzb, str8);
                                        boolean z3 = zIsHardwareAccelerated;
                                        if (i5 < 29) {
                                        }
                                        if (zZzc) {
                                        }
                                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                        sb.append("Failed to query codec ");
                                        sb.append(str5);
                                        sb.append(" (");
                                        sb.append(str4);
                                        sb.append(")");
                                        zzee.zze("MediaCodecUtil", sb.toString());
                                        throw e;
                                    }
                                }
                                str = str6;
                            } else {
                                if (!zZze) {
                                    boolean zZzd22 = zzuzVar2.zzd(str6, str3, capabilitiesForType);
                                    boolean zZze22 = zzuzVar2.zze(str6, str3, capabilitiesForType);
                                    z2 = zzuxVar2.zzb;
                                    if (!z2 || !zZze22) {
                                        if (z2) {
                                            if (zZzd22) {
                                                zZzd22 = true;
                                            }
                                        }
                                        i5 = Build.VERSION.SDK_INT;
                                        str = str6;
                                        if (i5 < 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            zIsHardwareAccelerated = !zzi(mediaCodecInfoZzb, str8);
                                        }
                                        boolean zZzi2 = zzi(mediaCodecInfoZzb, str8);
                                        boolean z32 = zIsHardwareAccelerated;
                                        if (i5 < 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            String strZza = zzgql.zza(mediaCodecInfoZzb.getName());
                                            zIsVendor = (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) ? false : true;
                                        }
                                        if (zZzc) {
                                            if (z2 != zZzd22) {
                                                zZzd22 = true;
                                                if (zZzc) {
                                                }
                                                boolean z4 = zIsVendor;
                                                i2 = i7;
                                                i3 = i8;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
                                                str4 = str3;
                                                str5 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z5 = zIsVendor;
                                            i2 = i7;
                                            i3 = i8;
                                            str4 = str3;
                                            str5 = name;
                                            arrayList.add(zzun.zza(name, str8, str4, codecCapabilities, z32, zZzi2, z5, false, false));
                                        } else if (!zZzc || z2) {
                                            boolean z42 = zIsVendor;
                                            i2 = i7;
                                            i3 = i8;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities22 = codecCapabilities;
                                            str4 = str3;
                                            str5 = name;
                                            if (!zZzc && zZzd22) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 7);
                                                sb2.append(str5);
                                                sb2.append(".secure");
                                                arrayList.add(zzun.zza(sb2.toString(), str8, str4, codecCapabilities22, z32, zZzi2, z42, false, true));
                                                return arrayList;
                                            }
                                        } else {
                                            boolean z52 = zIsVendor;
                                            i2 = i7;
                                            i3 = i8;
                                            str4 = str3;
                                            try {
                                                str5 = name;
                                                try {
                                                    arrayList.add(zzun.zza(name, str8, str4, codecCapabilities, z32, zZzi2, z52, false, false));
                                                } catch (Exception e3) {
                                                    e = e3;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                str5 = name;
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                                sb3.append("Failed to query codec ");
                                                sb3.append(str5);
                                                sb3.append(" (");
                                                sb3.append(str4);
                                                sb3.append(")");
                                                zzee.zze("MediaCodecUtil", sb3.toString());
                                                throw e;
                                            }
                                        }
                                        StringBuilder sb32 = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                        sb32.append("Failed to query codec ");
                                        sb32.append(str5);
                                        sb32.append(" (");
                                        sb32.append(str4);
                                        sb32.append(")");
                                        zzee.zze("MediaCodecUtil", sb32.toString());
                                        throw e;
                                    }
                                }
                                str = str6;
                            }
                        }
                        i2 = i7;
                        i3 = i8;
                    }
                } else {
                    str = str6;
                    str2 = str7;
                    i3 = iZza;
                    i2 = i7;
                }
                i7 = i2 + 1;
                zzuzVar2 = zzuzVar;
                iZza = i3;
                str6 = str;
                str7 = str2;
                zzuxVar2 = zzuxVar;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new zzuy(e5, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgql.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvf zzvfVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i2 = zzvg.zza;
                zzvf zzvfVar2 = zzvfVar;
                return zzvfVar2.zza(obj2) - zzvfVar2.zza(obj);
            }
        });
    }

    public static List zzd(zzuw zzuwVar, zzv zzvVar, boolean z2, boolean z3) throws zzuy {
        String strZzg = zzg(zzvVar);
        if (strZzg == null) {
            return zzguf.zzi();
        }
        return zzuwVar.zza(strZzg, z2, z3);
    }
}
