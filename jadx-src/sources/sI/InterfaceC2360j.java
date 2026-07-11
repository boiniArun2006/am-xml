package sI;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: sI.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface InterfaceC2360j extends IInterface {

    /* JADX INFO: renamed from: sI.j$j, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1162j extends Binder implements InterfaceC2360j {

        /* JADX INFO: renamed from: sI.j$j$j, reason: collision with other inner class name */
        private static class C1163j implements InterfaceC2360j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f73192n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f73192n;
            }

            C1163j(IBinder iBinder) {
                this.f73192n = iBinder;
            }

            @Override // sI.InterfaceC2360j
            public int xMQ(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    n.rl(parcelObtain, bundle, 0);
                    this.f73192n.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC2360j fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2360j)) ? new C1163j(iBinder) : (InterfaceC2360j) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: sI.j$n */
    public static class n {
        /* JADX INFO: Access modifiers changed from: private */
        public static void rl(Parcel parcel, Parcelable parcelable, int i2) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i2);
            }
        }
    }

    int xMQ(Bundle bundle);
}
