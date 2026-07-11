package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public final class AudioAttributesCompatParcelizer {
    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.aYN(false, false);
        versionedParcel.v(audioAttributesCompat.f39123n, 1);
    }

    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f39123n = (AudioAttributesImpl) versionedParcel.S(audioAttributesCompat.f39123n, 1);
        return audioAttributesCompat;
    }
}
