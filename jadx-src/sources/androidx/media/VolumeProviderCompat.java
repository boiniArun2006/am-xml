package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompatApi21;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class VolumeProviderCompat {

    /* JADX INFO: renamed from: androidx.media.VolumeProviderCompat$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class AnonymousClass1 implements VolumeProviderCompatApi21.Delegate {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ VolumeProviderCompat f39209n;

        @Override // androidx.media.VolumeProviderCompatApi21.Delegate
        public void n(int i2) {
            this.f39209n.rl(i2);
        }

        @Override // androidx.media.VolumeProviderCompatApi21.Delegate
        public void rl(int i2) {
            this.f39209n.n(i2);
        }
    }

    public static abstract class Callback {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ControlType {
    }

    public void n(int i2) {
    }

    public void rl(int i2) {
    }
}
