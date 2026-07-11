package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public final class AudioAttributesImplApi21Parcelizer {
    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.aYN(false, false);
        versionedParcel.T(audioAttributesImplApi21.f39124n, 1);
        versionedParcel.e(audioAttributesImplApi21.rl, 2);
    }

    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f39124n = (AudioAttributes) versionedParcel.r(audioAttributesImplApi21.f39124n, 1);
        audioAttributesImplApi21.rl = versionedParcel.ck(audioAttributesImplApi21.rl, 2);
        return audioAttributesImplApi21;
    }
}
