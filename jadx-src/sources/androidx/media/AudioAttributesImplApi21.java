package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AudioAttributes f39124n;
    int rl = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f39124n.equals(((AudioAttributesImplApi21) obj).f39124n);
        }
        return false;
    }

    public int hashCode() {
        return this.f39124n.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f39124n;
    }

    AudioAttributesImplApi21() {
    }
}
