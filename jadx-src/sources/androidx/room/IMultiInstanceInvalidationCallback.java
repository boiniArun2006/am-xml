package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static final String rV9 = "androidx$room$IMultiInstanceInvalidationCallback".replace(Typography.dollar, '.');

    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void qie(String[] strArr) {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        private static class Proxy implements IMultiInstanceInvalidationCallback {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private IBinder f41304n;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41304n;
            }

            Proxy(IBinder iBinder) {
                this.f41304n = iBinder;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void qie(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.rV9);
                    parcelObtain.writeStringArray(strArr);
                    this.f41304n.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IMultiInstanceInvalidationCallback fcU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.rV9);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) ? new Proxy(iBinder) : (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IMultiInstanceInvalidationCallback.rV9;
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
            qie(parcel.createStringArray());
            return true;
        }

        public Stub() {
            attachInterface(this, IMultiInstanceInvalidationCallback.rV9);
        }
    }

    void qie(String[] strArr);
}
