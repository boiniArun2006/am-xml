package P;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface j extends IInterface {
    public static final String KN = "android$support$customtabs$ICustomTabsCallback".replace(Typography.dollar, '.');

    /* JADX INFO: renamed from: P.j$j, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0258j extends Binder implements j {

        /* JADX INFO: renamed from: P.j$j$j, reason: collision with other inner class name */
        private static class C0259j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f7555n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7555n;
            }

            C0259j(IBinder iBinder) {
                this.f7555n = iBinder;
            }

            @Override // P.j
            public void FX(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void M(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void a(int i2, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public Bundle ck(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeString(str);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) n.t(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void dR0(int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeInt(i2);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void gh(int i2, int i3, int i5, int i7, int i8, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i5);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(i8);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void m(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeString(str);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void nY(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeString(str);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void ofS(int i2, Uri uri, boolean z2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    parcelObtain.writeInt(i2);
                    n.nr(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void pJg(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.j
            public void te(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.KN);
                    n.nr(parcelObtain, bundle, 0);
                    this.f7555n.transact(9, parcelObtain, null, 1);
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
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(j.KN);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0259j(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = j.KN;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    dR0(parcel.readInt(), (Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    nY(parcel.readString(), (Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    pJg((Bundle) n.t(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    m(parcel.readString(), (Bundle) n.t(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    ofS(parcel.readInt(), (Uri) n.t(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleCk = ck(parcel.readString(), (Bundle) n.t(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    n.nr(parcel2, bundleCk, 1);
                    return true;
                case 8:
                    a(parcel.readInt(), parcel.readInt(), (Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    te((Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    gh(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    M((Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    FX((Bundle) n.t(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }

        public AbstractBinderC0258j() {
            attachInterface(this, j.KN);
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

    void FX(Bundle bundle);

    void M(Bundle bundle);

    void a(int i2, int i3, Bundle bundle);

    Bundle ck(String str, Bundle bundle);

    void dR0(int i2, Bundle bundle);

    void gh(int i2, int i3, int i5, int i7, int i8, Bundle bundle);

    void m(String str, Bundle bundle);

    void nY(String str, Bundle bundle);

    void ofS(int i2, Uri uri, boolean z2, Bundle bundle);

    void pJg(Bundle bundle);

    void te(Bundle bundle);
}
