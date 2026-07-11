package C6;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class UGc {
    public static final s4 n(int i2, int i3, int i5, int i7, int i8, int i9, int i10) {
        return new s4(i2, i3, (int) Math.max(1000000L, (Math.max(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, ((long) (i2 * i3)) * 9) * ((long) i5)) / 3000), i8, i5, "video/avc", i7, i9 * i8, ((((i9 * i7) * i8) + (i10 * i8)) * i5) / 100);
    }

    public static /* synthetic */ s4 rl(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i8 = 1;
        }
        if ((i11 & 32) != 0) {
            i9 = 1;
        }
        if ((i11 & 64) != 0) {
            i10 = 1;
        }
        return n(i2, i3, i5, i7, i8, i9, i10);
    }
}
