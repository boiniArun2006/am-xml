package ccT;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import hBy.n;
import hBy.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface j extends IInterface {

    /* JADX INFO: renamed from: ccT.j$j, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0594j extends n implements j {

        /* JADX INFO: renamed from: ccT.j$j$j, reason: collision with other inner class name */
        public static class C0595j extends hBy.j implements j {
            C0595j(IBinder iBinder) {
                super(iBinder);
            }

            @Override // ccT.j
            public final Bundle c(Bundle bundle) {
                Parcel parcelFcU = fcU();
                w6.rl(parcelFcU, bundle);
                Parcel parcelEWT = eWT(parcelFcU);
                Bundle bundle2 = (Bundle) w6.n(parcelEWT, Bundle.CREATOR);
                parcelEWT.recycle();
                return bundle2;
            }
        }

        public static j fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new C0595j(iBinder);
        }
    }

    Bundle c(Bundle bundle);
}
