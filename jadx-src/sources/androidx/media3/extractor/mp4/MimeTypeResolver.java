package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class MimeTypeResolver {
    public static String getContainerMimeType(Format format) {
        String str = format.sampleMimeType;
        return MimeTypes.isVideo(str) ? "video/mp4" : MimeTypes.isAudio(str) ? "audio/mp4" : MimeTypes.isImage(str) ? Objects.equals(str, MimeTypes.IMAGE_HEIC) ? MimeTypes.IMAGE_HEIF : Objects.equals(str, MimeTypes.IMAGE_AVIF) ? MimeTypes.IMAGE_AVIF : "application/mp4" : "application/mp4";
    }

    private MimeTypeResolver() {
    }

    public static String getContainerMimeType(List<TrackSampleTable> list) {
        Iterator<TrackSampleTable> it = list.iterator();
        boolean z2 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().track.format.sampleMimeType;
            if (MimeTypes.isVideo(str2)) {
                return "video/mp4";
            }
            if (MimeTypes.isAudio(str2)) {
                z2 = true;
            } else if (MimeTypes.isImage(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        if (z2) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
