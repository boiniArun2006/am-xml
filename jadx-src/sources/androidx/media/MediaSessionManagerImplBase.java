package androidx.media;

import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f39203n = MediaSessionManager.f39200n;

    static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f39204n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f39205t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
            return TextUtils.equals(this.f39204n, remoteUserInfoImplBase.f39204n) && this.rl == remoteUserInfoImplBase.rl && this.f39205t == remoteUserInfoImplBase.f39205t;
        }

        public int hashCode() {
            return ObjectsCompat.rl(this.f39204n, Integer.valueOf(this.rl), Integer.valueOf(this.f39205t));
        }

        RemoteUserInfoImplBase(String str, int i2, int i3) {
            this.f39204n = str;
            this.rl = i2;
            this.f39205t = i3;
        }
    }
}
