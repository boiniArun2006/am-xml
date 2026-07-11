package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzanb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgup zze = zzgup.zzj(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final zzgup zzf = zzgup.zzk(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final zzgup zzg = zzgup.zzj(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final zzgup zzh = zzgup.zzk(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzanb(int i2, int i3, int i5) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzanb zza(@Nullable String str) {
        byte b2;
        if (str == null) {
            return null;
        }
        String strZza = zzgql.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgup zzgupVarZzp = zzgup.zzp(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgut.zzb(zzgwp.zza(zzh, zzgupVarZzp), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode = str2.hashCode();
        int i2 = -1;
        int i3 = 0;
        if (iHashCode != -1106037339) {
            b2 = (iHashCode == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) ? (byte) 0 : (byte) -1;
        } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
            b2 = 1;
        }
        int i5 = b2 != 0 ? b2 != 1 ? 1 : -2 : 2;
        zzgwo zzgwoVarZza = zzgwp.zza(zze, zzgupVarZzp);
        if (zzgwoVarZza.isEmpty()) {
            zzgwo zzgwoVarZza2 = zzgwp.zza(zzg, zzgupVarZzp);
            zzgwo zzgwoVarZza3 = zzgwp.zza(zzf, zzgupVarZzp);
            if (!zzgwoVarZza2.isEmpty() || !zzgwoVarZza3.isEmpty()) {
                String str3 = (String) zzgut.zzb(zzgwoVarZza2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
                int i7 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgut.zzb(zzgwoVarZza3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i2 = 0;
                    }
                } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i2 = 1;
                }
                if (i2 == 0) {
                    i2 = 2;
                } else if (i2 != 1) {
                    i3 = i7;
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                i3 = i7;
            }
        } else {
            String str5 = (String) zzgwoVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i2 = 0;
            }
        }
        return new zzanb(i2, i3, i5);
    }
}
