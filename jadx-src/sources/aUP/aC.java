package aUP;

import android.media.MediaMuxer;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract /* synthetic */ class aC {
    public static /* synthetic */ MediaMuxer n(FileDescriptor fileDescriptor, int i2) {
        return new MediaMuxer(fileDescriptor, i2);
    }
}
