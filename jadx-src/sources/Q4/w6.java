package Q4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum w6 {
    PCM_8BIT,
    PCM_16BIT,
    PCM_24BIT,
    PCM_32BIT,
    PCM_FLOAT;


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7912n = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w6 n(int i2) {
            if (i2 == 2) {
                return w6.PCM_16BIT;
            }
            if (i2 == 3) {
                return w6.PCM_8BIT;
            }
            if (i2 == 4) {
                return w6.PCM_FLOAT;
            }
            if (i2 == 536870912) {
                return w6.PCM_24BIT;
            }
            if (i2 == 805306368) {
                return w6.PCM_32BIT;
            }
            throw new IllegalArgumentException("Cannot convert ExoPlayer encoding (" + i2 + ") to supported FelliniAudioEncoding.");
        }

        private j() {
        }
    }
}
