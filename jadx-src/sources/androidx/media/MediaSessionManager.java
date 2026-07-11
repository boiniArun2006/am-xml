package androidx.media;

import android.os.Build;
import android.util.Log;
import androidx.media.MediaSessionManagerImplApi28;
import androidx.media.MediaSessionManagerImplBase;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class MediaSessionManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final boolean f39200n = Log.isLoggable("MediaSessionManager", 3);
    private static final Object rl = new Object();

    interface MediaSessionManagerImpl {
    }

    public static final class RemoteUserInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        RemoteUserInfoImpl f39201n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfo) {
                return this.f39201n.equals(((RemoteUserInfo) obj).f39201n);
            }
            return false;
        }

        public int hashCode() {
            return this.f39201n.hashCode();
        }

        public RemoteUserInfo(String str, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f39201n = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i2, i3);
            } else {
                this.f39201n = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i2, i3);
            }
        }
    }

    interface RemoteUserInfoImpl {
    }
}
