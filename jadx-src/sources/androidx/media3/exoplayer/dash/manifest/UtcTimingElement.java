package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class UtcTimingElement {
    public final String schemeIdUri;
    public final String value;

    public String toString() {
        return this.schemeIdUri + ", " + this.value;
    }

    public UtcTimingElement(String str, String str2) {
        this.schemeIdUri = str;
        this.value = str2;
    }
}
