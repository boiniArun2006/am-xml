package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public final class AudioAttributesImplBaseParcelizer {
    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.aYN(false, false);
        versionedParcel.e(audioAttributesImplBase.f39125n, 1);
        versionedParcel.e(audioAttributesImplBase.rl, 2);
        versionedParcel.e(audioAttributesImplBase.f39126t, 3);
        versionedParcel.e(audioAttributesImplBase.nr, 4);
    }

    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f39125n = versionedParcel.ck(audioAttributesImplBase.f39125n, 1);
        audioAttributesImplBase.rl = versionedParcel.ck(audioAttributesImplBase.rl, 2);
        audioAttributesImplBase.f39126t = versionedParcel.ck(audioAttributesImplBase.f39126t, 3);
        audioAttributesImplBase.nr = versionedParcel.ck(audioAttributesImplBase.nr, 4);
        return audioAttributesImplBase;
    }
}
