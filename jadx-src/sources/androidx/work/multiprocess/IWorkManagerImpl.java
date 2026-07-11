package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface IWorkManagerImpl extends IInterface {

    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void E(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void Uo(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void ViF(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void X(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void az(IWorkManagerImplCallback iWorkManagerImplCallback);

    void eTf(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void mUb(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void nHg(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        private static class Proxy implements IWorkManagerImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f43081n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f43081n;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1598968902) {
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        mUb(parcel.createByteArray(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        nHg(parcel.createByteArray(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        ViF(parcel.readString(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 4:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        eTf(parcel.readString(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 5:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        Uo(parcel.readString(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 6:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        az(IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 7:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        E(parcel.createByteArray(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    case 8:
                        parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                        X(parcel.createByteArray(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            }
            parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
            return true;
        }
    }
}
