package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RangedUri.class == obj.getClass()) {
            RangedUri rangedUri = (RangedUri) obj;
            if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((527 + ((int) this.start)) * 31) + ((int) this.length)) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.referenceUri + ", start=" + this.start + ", length=" + this.length + ")";
    }

    public RangedUri(@Nullable String str, long j2, long j3) {
        this.referenceUri = str == null ? "" : str;
        this.start = j2;
        this.length = j3;
    }

    @Nullable
    public RangedUri attemptMerge(@Nullable RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        RangedUri rangedUri2 = null;
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j2 = this.length;
            long j3 = -1;
            if (j2 != -1) {
                long j4 = this.start;
                if (j4 + j2 == rangedUri.start) {
                    long j5 = rangedUri.length;
                    if (j5 != -1) {
                        j3 = j2 + j5;
                    }
                    return new RangedUri(strResolveUriString, j4, j3);
                }
            }
            long j6 = rangedUri.length;
            if (j6 != -1) {
                long j7 = rangedUri.start;
                if (j7 + j6 == this.start) {
                    if (j2 != -1) {
                        j3 = j6 + j2;
                    }
                    rangedUri2 = new RangedUri(strResolveUriString, j7, j3);
                }
            }
        }
        return rangedUri2;
    }
}
