package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.security.SecureRandom;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49532b;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1804o f49533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f49534b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (C1804o.a()) {
                this.f49533a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f49534b.a((Object) illegalStateException);
        }

        public a(C1804o c1804o, s4 s4Var) {
            this.f49533a = c1804o;
            this.f49534b = s4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                C1802k.o().unbindService(this);
            } catch (Exception e2) {
                if (C1804o.a()) {
                    this.f49533a.d("LicenseVerificationManager", "Failed to unbind license service", e2);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (C1804o.a()) {
                this.f49533a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f49533a, this.f49534b, iNextInt, new Runnable() { // from class: com.applovin.impl.tpM
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50544n.a();
                }
            });
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                parcelObtain.writeLong(iNextInt);
                parcelObtain.writeString(C1802k.o().getPackageName());
                parcelObtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, parcelObtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e2) {
                if (C1804o.a()) {
                    this.f49533a.a("LicenseVerificationManager", "Failed to check license", e2);
                }
                a();
                this.f49534b.a((Object) e2);
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    private static final class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1804o f49535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f49536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f49537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f49538d;

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i5 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (C1804o.a()) {
                    this.f49535a.a("LicenseVerificationManager", "Verified with code " + i5);
                }
                this.f49536b.b(p2.a().b(string).a(string2).b(i5).a(this.f49537c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f49538d.run();
                return true;
            } catch (Throwable th) {
                try {
                    if (C1804o.a()) {
                        this.f49535a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.f49536b.a((Object) new Exception(th));
                    this.f49538d.run();
                    return false;
                } catch (Throwable th2) {
                    this.f49538d.run();
                    throw th2;
                }
            }
        }

        public b(C1804o c1804o, s4 s4Var, int i2, Runnable runnable) {
            this.f49535a = c1804o;
            this.f49536b = s4Var;
            this.f49537c = i2;
            this.f49538d = runnable;
        }
    }

    public s4 a(long j2) {
        s4 s4Var = new s4("verify_license");
        if (j2 > 0) {
            i6.a(j2, s4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f49531a);
        }
        try {
            if (!C1802k.o().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f49532b, s4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (C1804o.a()) {
                    this.f49532b.k("LicenseVerificationManager", exc.getMessage());
                }
                s4Var.a((Object) exc);
                return s4Var;
            }
        } catch (Exception e2) {
            if (C1804o.a()) {
                this.f49532b.a("LicenseVerificationManager", "Failed to verify license", e2);
            }
            s4Var.a((Object) e2);
        }
        return s4Var;
    }

    public o2(C1802k c1802k) {
        this.f49531a = c1802k;
        this.f49532b = c1802k.O();
    }
}
