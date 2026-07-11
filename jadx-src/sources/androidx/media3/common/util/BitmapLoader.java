package androidx.media3.common.util;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public interface BitmapLoader {
    com.google.common.util.concurrent.Xo decodeBitmap(byte[] bArr);

    com.google.common.util.concurrent.Xo loadBitmap(Uri uri);

    boolean supportsMimeType(String str);

    @Nullable
    default com.google.common.util.concurrent.Xo loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }
}
