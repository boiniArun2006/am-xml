package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.j;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    android.support.v4.os.j f13165O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f13166n = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Handler f13167t = null;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }

        j() {
        }
    }

    class n extends j.AbstractBinderC0487j {
        n() {
        }

        @Override // android.support.v4.os.j
        public void T(int i2, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f13167t;
            if (handler != null) {
                handler.post(resultReceiver.new w6(i2, bundle));
            } else {
                resultReceiver.n(i2, bundle);
            }
        }
    }

    class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f13170n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Bundle f13171t;

        w6(int i2, Bundle bundle) {
            this.f13170n = i2;
            this.f13171t = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.n(this.f13170n, this.f13171t);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void n(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            try {
                if (this.f13165O == null) {
                    this.f13165O = new n();
                }
                parcel.writeStrongBinder(this.f13165O.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void rl(int i2, Bundle bundle) {
        if (this.f13166n) {
            Handler handler = this.f13167t;
            if (handler != null) {
                handler.post(new w6(i2, bundle));
                return;
            } else {
                n(i2, bundle);
                return;
            }
        }
        android.support.v4.os.j jVar = this.f13165O;
        if (jVar != null) {
            try {
                jVar.T(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f13165O = j.AbstractBinderC0487j.fcU(parcel.readStrongBinder());
    }
}
