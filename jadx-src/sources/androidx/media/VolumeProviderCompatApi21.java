package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
class VolumeProviderCompatApi21 {

    /* JADX INFO: renamed from: androidx.media.VolumeProviderCompatApi21$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    final class AnonymousClass1 extends VolumeProvider {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Delegate f39210n;

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i2) {
            this.f39210n.rl(i2);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i2) {
            this.f39210n.n(i2);
        }
    }

    public interface Delegate {
        void n(int i2);

        void rl(int i2);
    }
}
