package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n extends IInterface {

    public static abstract class j extends Binder implements n {

        /* JADX INFO: renamed from: android.support.v4.media.session.n$j$j, reason: collision with other inner class name */
        private static class C0486j implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f13164n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13164n;
            }

            C0486j(IBinder iBinder) {
                this.f13164n = iBinder;
            }
        }

        public static n fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new C0486j(iBinder) : (n) iInterfaceQueryLocalInterface;
        }
    }
}
