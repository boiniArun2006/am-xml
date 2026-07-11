package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzchg implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcge zzcgeVar = (zzcge) obj;
        zzckr zzckrVarZzh = zzcgeVar.zzh();
        if (zzckrVarZzh == null) {
            try {
                zzckr zzckrVar = new zzckr(zzcgeVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcgeVar.zzw(zzckrVar);
                zzckrVarZzh = zzckrVar;
            } catch (NullPointerException e2) {
                e = e2;
                Throwable th = e;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e3) {
                e = e3;
                Throwable th2 = e;
                int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f3 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f4 = Float.parseFloat((String) map.get("currentTime"));
        int i3 = Integer.parseInt((String) map.get("playbackState"));
        if (i3 < 0 || i3 > 3) {
            i3 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f5 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(f4).length() + 45 + String.valueOf(f3).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i3).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f4);
            sb.append(" , duration : ");
            sb.append(f3);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        zzckrVarZzh.zzs(f4, f3, i3, zEquals, f5);
    }
}
