package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public interface SpeedProvider {
    long getNextSpeedChangeTimeUs(long j2);

    float getSpeed(long j2);
}
