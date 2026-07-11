package Di;

import android.media.MediaCodec;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Lu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(MediaCodec mediaCodec, int i2, boolean z2) {
        try {
            mediaCodec.releaseOutputBuffer(i2, z2);
        } catch (IllegalStateException e2) {
            FirebaseCrashlytics.getInstance().recordException(e2);
        }
    }
}
