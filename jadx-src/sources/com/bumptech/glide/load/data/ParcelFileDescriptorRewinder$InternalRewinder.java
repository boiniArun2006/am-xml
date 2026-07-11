package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ParcelFileDescriptor f51579n;

    ParcelFileDescriptor rewind() throws IOException {
        try {
            Os.lseek(this.f51579n.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return this.f51579n;
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }
}
