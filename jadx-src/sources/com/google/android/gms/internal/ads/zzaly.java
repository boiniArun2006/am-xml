package com.google.android.gms.internal.ads;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzaly implements zzamd {
    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean zza(zzv zzvVar) {
        String str = zzvVar.zzo;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, GDEJgAYrPQHfw.dcYNIlKFjETpZgy) || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzv zzvVar) {
        String str = zzvVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/vobsub":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzamf zzc(zzv zzvVar) {
        String str = zzvVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzamv(zzvVar.zzr);
                case "text/vtt":
                    return new zzanx();
                case "application/x-mp4-vtt":
                    return new zzann();
                case "application/x-subrip":
                    return new zzamz();
                case "application/x-quicktime-tx3g":
                    return new zzank(zzvVar.zzr);
                case "application/pgs":
                    return new zzamt();
                case "application/vobsub":
                    return new zzanm(zzvVar.zzr);
                case "application/dvbsubs":
                    return new zzamr(zzvVar.zzr);
                case "application/ttml+xml":
                    return new zzanf();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
