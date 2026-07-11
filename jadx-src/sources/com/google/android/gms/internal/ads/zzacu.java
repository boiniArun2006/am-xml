package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
final class zzacu {
    public static void zza(Surface surface, float f3) {
        try {
            surface.setFrameRate(f3, f3 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            zzee.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
