package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public interface RendererCapabilities {
    public static final int ADAPTIVE_NOT_SEAMLESS = 8;
    public static final int ADAPTIVE_NOT_SUPPORTED = 0;
    public static final int ADAPTIVE_SEAMLESS = 16;
    public static final int ADAPTIVE_SUPPORT_MASK = 24;
    public static final int AUDIO_OFFLOAD_GAPLESS_SUPPORTED = 1024;
    public static final int AUDIO_OFFLOAD_NOT_SUPPORTED = 0;
    public static final int AUDIO_OFFLOAD_SPEED_CHANGE_SUPPORTED = 2048;
    public static final int AUDIO_OFFLOAD_SUPPORTED = 512;
    public static final int AUDIO_OFFLOAD_SUPPORT_MASK = 3584;
    public static final int DECODER_SUPPORT_FALLBACK = 0;
    public static final int DECODER_SUPPORT_FALLBACK_MIMETYPE = 256;
    public static final int DECODER_SUPPORT_MASK = 384;
    public static final int DECODER_SUPPORT_PRIMARY = 128;
    public static final int FORMAT_SUPPORT_MASK = 7;
    public static final int HARDWARE_ACCELERATION_NOT_SUPPORTED = 0;
    public static final int HARDWARE_ACCELERATION_SUPPORTED = 64;
    public static final int HARDWARE_ACCELERATION_SUPPORT_MASK = 64;
    public static final int TUNNELING_NOT_SUPPORTED = 0;
    public static final int TUNNELING_SUPPORTED = 32;
    public static final int TUNNELING_SUPPORT_MASK = 32;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioOffloadSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HardwareAccelerationSupport {
    }

    public interface Listener {
        void onRendererCapabilitiesChanged(Renderer renderer);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    static int create(int i2, int i3, int i5, int i7, int i8, int i9) {
        return i2 | i3 | i5 | i7 | i8 | i9;
    }

    static int getAdaptiveSupport(int i2) {
        return i2 & 24;
    }

    static int getAudioOffloadSupport(int i2) {
        return i2 & AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    static int getDecoderSupport(int i2) {
        return i2 & DECODER_SUPPORT_MASK;
    }

    static int getFormatSupport(int i2) {
        return i2 & 7;
    }

    static int getHardwareAccelerationSupport(int i2) {
        return i2 & 64;
    }

    static int getTunnelingSupport(int i2) {
        return i2 & 32;
    }

    default void clearListener() {
    }

    String getName();

    int getTrackType();

    default void setListener(Listener listener) {
    }

    int supportsFormat(Format format) throws ExoPlaybackException;

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;

    static int create(int i2) {
        return create(i2, 0, 0, 0);
    }

    static int create(int i2, int i3, int i5) {
        return create(i2, i3, i5, 0, 128, 0);
    }

    static boolean isFormatSupported(int i2, boolean z2) {
        int formatSupport = getFormatSupport(i2);
        if (formatSupport != 4) {
            if (!z2 || formatSupport != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    static int create(int i2, int i3, int i5, int i7) {
        return create(i2, i3, i5, 0, 128, i7);
    }

    static int create(int i2, int i3, int i5, int i7, int i8) {
        return create(i2, i3, i5, i7, i8, 0);
    }
}
