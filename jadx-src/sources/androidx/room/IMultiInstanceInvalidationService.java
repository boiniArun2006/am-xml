package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.room.IMultiInstanceInvalidationCallback;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String bzg = "androidx$room$IMultiInstanceInvalidationService".replace(Typography.dollar, '.');

    public static class Default implements IMultiInstanceInvalidationService {
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void C(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void e(int i2, String[] strArr) {
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int jB(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {

        private static class Proxy implements IMultiInstanceInvalidationService {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f41305n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41305n;
            }

            Proxy(IBinder iBinder) {
                this.f41305n = iBinder;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void C(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.bzg);
                    parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    parcelObtain.writeInt(i2);
                    this.f41305n.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void e(int i2, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.bzg);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStringArray(strArr);
                    this.f41305n.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int jB(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.bzg);
                    parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    parcelObtain.writeString(str);
                    this.f41305n.transact(1, parcelObtain, parcelObtain2, 0);
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

        public static IMultiInstanceInvalidationService fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationService.bzg);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) ? new Proxy(iBinder) : (IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IMultiInstanceInvalidationService.bzg;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 1) {
                int iJB = jB(IMultiInstanceInvalidationCallback.Stub.fcU(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iJB);
            } else if (i2 == 2) {
                C(IMultiInstanceInvalidationCallback.Stub.fcU(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                e(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        public Stub() {
            attachInterface(this, IMultiInstanceInvalidationService.bzg);
        }
    }

    void C(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2);

    void e(int i2, String[] strArr);

    int jB(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);
}
