package a8o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j extends IInterface {
    public static final String az = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace(Typography.dollar, '.');

    /* JADX INFO: renamed from: a8o.j$j, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0466j extends Binder implements j {

        /* JADX INFO: renamed from: a8o.j$j$j, reason: collision with other inner class name */
        private static class C0467j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f12734n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12734n;
            }

            C0467j(IBinder iBinder) {
                this.f12734n = iBinder;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static j fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(j.az);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0467j(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = j.az;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 2) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            xg(parcel.readString(), (Bundle) n.rl(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void xg(String str, Bundle bundle);

    public static class n {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object rl(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }
}
