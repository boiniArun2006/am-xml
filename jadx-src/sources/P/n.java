package P;

import P.j;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface n extends IInterface {
    public static final String xMQ = "android$support$customtabs$ICustomTabsService".replace(Typography.dollar, '.');

    public static abstract class j extends Binder implements n {

        /* JADX INFO: renamed from: P.n$j$j, reason: collision with other inner class name */
        private static class C0260j implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f7556n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7556n;
            }

            C0260j(IBinder iBinder) {
                this.f7556n = iBinder;
            }

            @Override // P.n
            public boolean KN(P.j jVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    boolean z2 = false;
                    C0261n.J2(parcelObtain, uri, 0);
                    this.f7556n.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public boolean P5(P.j jVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    boolean z2 = false;
                    C0261n.J2(parcelObtain, bundle, 0);
                    this.f7556n.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public boolean Xw(P.j jVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    boolean z2 = false;
                    C0261n.J2(parcelObtain, uri, 0);
                    C0261n.J2(parcelObtain, bundle, 0);
                    this.f7556n.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public boolean aYN(P.j jVar, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    boolean z2 = false;
                    C0261n.J2(parcelObtain, uri, 0);
                    C0261n.J2(parcelObtain, bundle, 0);
                    C0261n.O(parcelObtain, list, 0);
                    this.f7556n.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public boolean eF(P.j jVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    boolean z2 = false;
                    this.f7556n.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public boolean ijL(P.j jVar, int i2, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    parcelObtain.writeInt(i2);
                    boolean z2 = false;
                    C0261n.J2(parcelObtain, uri, 0);
                    C0261n.J2(parcelObtain, bundle, 0);
                    this.f7556n.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public boolean p5(long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeLong(j2);
                    boolean z2 = false;
                    this.f7556n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // P.n
            public int v(P.j jVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n.xMQ);
                    parcelObtain.writeStrongInterface(jVar);
                    parcelObtain.writeString(str);
                    C0261n.J2(parcelObtain, bundle, 0);
                    this.f7556n.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
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

        public static n fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(n.xMQ);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new C0260j(iBinder) : (n) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = n.xMQ;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    boolean zP5 = p5(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zP5 ? 1 : 0);
                    return true;
                case 3:
                    boolean zEF = eF(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zEF ? 1 : 0);
                    return true;
                case 4:
                    P.j jVarFcU = j.AbstractBinderC0258j.fcU(parcel.readStrongBinder());
                    Uri uri = (Uri) C0261n.nr(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zAYN = aYN(jVarFcU, uri, (Bundle) C0261n.nr(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zAYN ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleIk = Ik(parcel.readString(), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    C0261n.J2(parcel2, bundleIk, 1);
                    return true;
                case 6:
                    boolean zFD = fD(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zFD ? 1 : 0);
                    return true;
                case 7:
                    boolean zKN = KN(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Uri) C0261n.nr(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zKN ? 1 : 0);
                    return true;
                case 8:
                    int iV = v(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iV);
                    return true;
                case 9:
                    boolean zIjL = ijL(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), parcel.readInt(), (Uri) C0261n.nr(parcel, Uri.CREATOR), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zIjL ? 1 : 0);
                    return true;
                case 10:
                    boolean zP52 = P5(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zP52 ? 1 : 0);
                    return true;
                case 11:
                    boolean zXw = Xw(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Uri) C0261n.nr(parcel, Uri.CREATOR), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zXw ? 1 : 0);
                    return true;
                case 12:
                    boolean zS = S(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Uri) C0261n.nr(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 13:
                    boolean zG7 = G7(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG7 ? 1 : 0);
                    return true;
                case 14:
                    boolean zRV9 = rV9(j.AbstractBinderC0258j.fcU(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) C0261n.nr(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRV9 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* JADX INFO: renamed from: P.n$n, reason: collision with other inner class name */
    public static class C0261n {
        /* JADX INFO: Access modifiers changed from: private */
        public static void J2(Parcel parcel, Parcelable parcelable, int i2) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void O(Parcel parcel, List list, int i2) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                J2(parcel, (Parcelable) list.get(i3), i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object nr(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    boolean G7(P.j jVar, Bundle bundle);

    Bundle Ik(String str, Bundle bundle);

    boolean KN(P.j jVar, Uri uri);

    boolean P5(P.j jVar, Bundle bundle);

    boolean S(P.j jVar, Uri uri, int i2, Bundle bundle);

    boolean Xw(P.j jVar, Uri uri, Bundle bundle);

    boolean aYN(P.j jVar, Uri uri, Bundle bundle, List list);

    boolean eF(P.j jVar);

    boolean fD(P.j jVar, Bundle bundle);

    boolean ijL(P.j jVar, int i2, Uri uri, Bundle bundle);

    boolean p5(long j2);

    boolean rV9(P.j jVar, IBinder iBinder, Bundle bundle);

    int v(P.j jVar, String str, Bundle bundle);
}
