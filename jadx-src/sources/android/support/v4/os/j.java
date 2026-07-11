package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j extends IInterface {
    public static final String HI = "android$support$v4$os$IResultReceiver".replace(Typography.dollar, '.');

    /* JADX INFO: renamed from: android.support.v4.os.j$j, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0487j extends Binder implements j {

        /* JADX INFO: renamed from: android.support.v4.os.j$j$j, reason: collision with other inner class name */
        private static class C0488j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f13172n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13172n;
            }

            C0488j(IBinder iBinder) {
                this.f13172n = iBinder;
            }

            @Override // android.support.v4.os.j
            public void T(int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.HI);
                    parcelObtain.writeInt(i2);
                    n.nr(parcelObtain, bundle, 0);
                    this.f13172n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
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
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(j.HI);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0488j(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = j.HI;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            T(parcel.readInt(), (Bundle) n.t(parcel, Bundle.CREATOR));
            return true;
        }

        public AbstractBinderC0487j() {
            attachInterface(this, j.HI);
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

    void T(int i2, Bundle bundle);
}
