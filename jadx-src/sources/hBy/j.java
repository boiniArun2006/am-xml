package hBy;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j implements IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IBinder f67953n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f67954t = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f67953n;
    }

    protected j(IBinder iBinder) {
        this.f67953n = iBinder;
    }

    protected final Parcel eWT(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f67953n.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel fcU() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f67954t);
        return parcelObtain;
    }
}
