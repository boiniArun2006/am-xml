package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {

    static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final MediaSessionManager.RemoteUserInfo f39202n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfoImplApi28) {
                return this.f39202n.equals(((RemoteUserInfoImplApi28) obj).f39202n);
            }
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.rl(this.f39202n);
        }

        RemoteUserInfoImplApi28(String str, int i2, int i3) {
            this.f39202n = n.n(str, i2, i3);
        }
    }
}
