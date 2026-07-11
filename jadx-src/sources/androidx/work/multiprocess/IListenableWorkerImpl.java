package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface IListenableWorkerImpl extends IInterface {

    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        private static class Proxy implements IListenableWorkerImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f43080n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f43080n;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                o(parcel.createByteArray(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                Nxk(parcel.createByteArray(), IWorkManagerImplCallback.Stub.fcU(parcel.readStrongBinder()));
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
            return true;
        }
    }

    void Nxk(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void o(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);
}
