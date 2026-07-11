package androidx.media3.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j2, long j3) {
            this.mime = str;
            this.semantic = str2;
            this.length = j2;
            this.padding = j3;
        }
    }

    @Nullable
    public MotionPhotoMetadata getMotionPhotoMetadata(long j2) {
        long j3;
        if (this.items.size() < 2) {
            return null;
        }
        long j4 = j2;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        long j9 = -1;
        boolean z2 = false;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean zEquals = "video/mp4".equals(containerItem.mime) | z2;
            if (size == 0) {
                j4 -= containerItem.padding;
                j3 = 0;
            } else {
                j3 = j4 - containerItem.length;
            }
            long j10 = j3;
            long j11 = j4;
            j4 = j10;
            if (!zEquals || j4 == j11) {
                z2 = zEquals;
            } else {
                j9 = j11 - j4;
                j7 = j4;
                z2 = false;
            }
            if (size == 0) {
                j5 = j4;
                j6 = j11;
            }
        }
        if (j7 == -1 || j9 == -1 || j5 == -1 || j6 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j5, j6, this.photoPresentationTimestampUs, j7, j9);
    }

    public MotionPhotoDescription(long j2, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j2;
        this.items = list;
    }
}
