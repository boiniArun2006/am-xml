package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a0 implements MediaScannerConnection.MediaScannerConnectionClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaScannerConnection f57069b;

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.f57069b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f57068a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.f57069b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }

    public a0(String str) {
        this.f57068a = str;
    }
}
