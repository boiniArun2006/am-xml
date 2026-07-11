package a8o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface n extends IInterface {
    public static final String ty = "android$support$customtabs$trusted$ITrustedWebActivityService".replace(Typography.dollar, '.');

    public static abstract class j extends Binder implements n {

        /* JADX INFO: renamed from: a8o.n$j$j, reason: collision with other inner class name */
        private static class C0468j implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f12735n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12735n;
            }

            C0468j(IBinder iBinder) {
                this.f12735n = iBinder;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static n fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(n.ty);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new C0468j(iBinder) : (n) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = n.ty;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    Bundle bundleG = g((Bundle) C0469n.t(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0469n.nr(parcel2, bundleG, 1);
                    return true;
                case 3:
                    k((Bundle) C0469n.t(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int I2 = I();
                    parcel2.writeNoException();
                    parcel2.writeInt(I2);
                    return true;
                case 5:
                    Bundle bundleS7N = s7N();
                    parcel2.writeNoException();
                    C0469n.nr(parcel2, bundleS7N, 1);
                    return true;
                case 6:
                    Bundle bundleGR = GR((Bundle) C0469n.t(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0469n.nr(parcel2, bundleGR, 1);
                    return true;
                case 7:
                    Bundle bundleZ = Z();
                    parcel2.writeNoException();
                    C0469n.nr(parcel2, bundleZ, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
                case 9:
                    Bundle bundleR = r(parcel.readString(), (Bundle) C0469n.t(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    C0469n.nr(parcel2, bundleR, 1);
                    return true;
            }
        }
    }

    /* JADX INFO: renamed from: a8o.n$n, reason: collision with other inner class name */
    public static class C0469n {
        /* JADX INFO: Access modifiers changed from: private */
        public static void nr(Parcel parcel, Parcelable parcelable, int i2) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object t(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    Bundle GR(Bundle bundle);

    int I();

    Bundle Z();

    Bundle g(Bundle bundle);

    void k(Bundle bundle);

    Bundle r(String str, Bundle bundle, IBinder iBinder);

    Bundle s7N();
}
