package P;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface w6 extends IInterface {
    public static final String mUb = "android$support$customtabs$IEngagementSignalsCallback".replace(Typography.dollar, '.');

    public static abstract class j extends Binder implements w6 {

        /* JADX INFO: renamed from: P.w6$j$j, reason: collision with other inner class name */
        private static class C0262j implements w6 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f7557n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7557n;
            }

            C0262j(IBinder iBinder) {
                this.f7557n = iBinder;
            }

            @Override // P.w6
            public void nr(int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w6.mUb);
                    parcelObtain.writeInt(i2);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7557n.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.w6
            public void rl(boolean z2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w6.mUb);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7557n.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.w6
            public void t(boolean z2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(w6.mUb);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7557n.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static w6 fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(w6.mUb);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w6)) ? new C0262j(iBinder) : (w6) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = w6.mUb;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 2) {
                t(parcel.readInt() != 0, (Bundle) n.t(parcel, Bundle.CREATOR));
            } else if (i2 == 3) {
                nr(parcel.readInt(), (Bundle) n.t(parcel, Bundle.CREATOR));
            } else {
                if (i2 != 4) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                rl(parcel.readInt() != 0, (Bundle) n.t(parcel, Bundle.CREATOR));
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

    void nr(int i2, Bundle bundle);

    void rl(boolean z2, Bundle bundle);

    void t(boolean z2, Bundle bundle);
}
