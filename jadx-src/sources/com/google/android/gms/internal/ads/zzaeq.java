package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaeq implements zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaep zzc = new zzaep(zzaen.zza);
    private static final zzaep zzd = new zzaep(zzaem.zza);

    @Nullable
    private zzguf zze;
    private final zzamd zzf = new zzaly();

    private final void zzc(int i2, List list) {
        switch (i2) {
            case 0:
                list.add(new zzaoc());
                break;
            case 1:
                list.add(new zzaof());
                break;
            case 2:
                list.add(new zzaoi(0));
                break;
            case 3:
                list.add(new zzagp(0));
                break;
            case 4:
                zzaeu zzaeuVarZza = zzc.zza(0);
                if (zzaeuVarZza == null) {
                    list.add(new zzahg(0));
                } else {
                    list.add(zzaeuVarZza);
                }
                break;
            case 5:
                list.add(new zzahj());
                break;
            case 6:
                list.add(new zzajh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzajp(0));
                break;
            case 8:
                zzamd zzamdVar = this.zzf;
                list.add(new zzako(zzamdVar, 0, null, null, zzguf.zzi(), null));
                list.add(new zzakw(zzamdVar, 0));
                break;
            case 9:
                list.add(new zzalm());
                break;
            case 10:
                list.add(new zzapm());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzguf.zzi();
                }
                list.add(new zzapx(1, 0, this.zzf, new zzfg(0L), new zzaok(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaqk());
                break;
            case 14:
                list.add(new zzahq(0));
                break;
            case 15:
                zzaeu zzaeuVarZza2 = zzd.zza(new Object[0]);
                if (zzaeuVarZza2 != null) {
                    list.add(zzaeuVarZza2);
                }
                break;
            case 16:
                list.add(new zzagt(0, this.zzf));
                break;
            case 17:
                list.add(new zzalw());
                break;
            case 18:
                list.add(new zzaqp());
                break;
            case 19:
                list.add(new zzahb());
                break;
            case 20:
                list.add(new zzahp(0));
                break;
            case 21:
                list.add(new zzaha());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final synchronized zzaeu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzafa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzaeu[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i2;
        int i3;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                switch (zzas.zzh(str)) {
                    case "audio/ac3":
                    case "audio/eac3":
                    case "audio/eac3-joc":
                        i2 = 0;
                        break;
                    case "audio/ac4":
                        i2 = 1;
                        break;
                    case "audio/amr":
                    case "audio/3gpp":
                    case "audio/amr-wb":
                        i2 = 3;
                        break;
                    case "audio/flac":
                        i2 = 4;
                        break;
                    case "video/x-flv":
                        i2 = 5;
                        break;
                    case "audio/midi":
                        i2 = 15;
                        break;
                    case "video/x-matroska":
                    case "audio/x-matroska":
                    case "video/webm":
                    case "audio/webm":
                    case "application/webm":
                        i2 = 6;
                        break;
                    case "audio/mpeg":
                        i2 = 7;
                        break;
                    case "video/mp4":
                    case "audio/mp4":
                    case "application/mp4":
                        i2 = 8;
                        break;
                    case "audio/ogg":
                        i2 = 9;
                        break;
                    case "video/mp2p":
                        i2 = 10;
                        break;
                    case "video/mp2t":
                        i2 = 11;
                        break;
                    case "audio/wav":
                        i2 = 12;
                        break;
                    case "text/vtt":
                        i2 = 13;
                        break;
                    case "image/jpeg":
                        i2 = 14;
                        break;
                    case "video/x-msvideo":
                        i2 = 16;
                        break;
                    case "image/png":
                        i2 = 17;
                        break;
                    case "image/webp":
                        i2 = 18;
                        break;
                    case "image/bmp":
                        i2 = 19;
                        break;
                    case "image/heif":
                    case "image/heic":
                        i2 = 20;
                        break;
                    case "image/avif":
                        i2 = 21;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            } else {
                i2 = -1;
            }
            if (i2 != -1) {
                zzc(i2, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                i3 = (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) ? 0 : lastPathSegment.endsWith(".ac4") ? 1 : (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) ? 2 : lastPathSegment.endsWith(".amr") ? 3 : lastPathSegment.endsWith(".flac") ? 4 : lastPathSegment.endsWith(".flv") ? 5 : (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) ? 15 : (lastPathSegment.startsWith(".mk", lastPathSegment.length() + (-4)) || lastPathSegment.endsWith(".webm")) ? 6 : lastPathSegment.endsWith(".mp3") ? 7 : (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() + (-4)) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + (-5)) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() + (-5))) ? 8 : (lastPathSegment.startsWith(".og", lastPathSegment.length() + (-4)) || lastPathSegment.endsWith(".opus")) ? 9 : (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) ? 10 : (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() + (-4))) ? 11 : (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) ? 12 : (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) ? 13 : (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : lastPathSegment.endsWith(".avi") ? 16 : lastPathSegment.endsWith(".png") ? 17 : lastPathSegment.endsWith(".webp") ? 18 : (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) ? 19 : (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) ? 20 : lastPathSegment.endsWith(".avif") ? 21 : -1;
            }
            if (i3 != -1 && i3 != i2) {
                zzc(i3, arrayList);
            }
            int[] iArr = zzb;
            for (int i5 = 0; i5 < 21; i5++) {
                int i7 = iArr[i5];
                if (i7 != i2 && i7 != i3) {
                    zzc(i7, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzaeu[]) arrayList.toArray(new zzaeu[0]);
    }
}
