package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class PreloadException extends Exception {
    public final MediaItem mediaItem;

    public boolean errorInfoEquals(@Nullable PreloadException preloadException) {
        if (this == preloadException) {
            return true;
        }
        if (preloadException != null) {
            Throwable cause = getCause();
            Throwable cause2 = preloadException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (Objects.equals(this.mediaItem, preloadException.mediaItem) && Objects.equals(getMessage(), preloadException.getMessage())) {
                return true;
            }
        }
        return false;
    }

    public PreloadException(MediaItem mediaItem, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.mediaItem = mediaItem;
    }
}
