package P;

import P.j;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Ml extends IInterface {
    public static final String gh = "android$support$customtabs$IPostMessageService".replace(Typography.dollar, '.');

    public static abstract class j extends Binder implements Ml {

        /* JADX INFO: renamed from: P.Ml$j$j, reason: collision with other inner class name */
        private static class C0257j implements Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f7554n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7554n;
            }

            C0257j(IBinder iBinder) {
                this.f7554n = iBinder;
            }

            @Override // P.Ml
            public void wTp(P.j jVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Ml.gh);
                    parcelObtain.writeStrongInterface(jVar);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7554n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static Ml fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Ml.gh);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Ml)) ? new C0257j(iBinder) : (Ml) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = Ml.gh;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 2) {
                wTp(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Bundle) n.t(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                piY(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), parcel.readString(), (Bundle) n.t(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class n {
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

    void piY(P.j jVar, String str, Bundle bundle);

    void wTp(P.j jVar, Bundle bundle);
}
