package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {
    public static j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f52794O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f52795n;
    private String nr;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f52796t;
    public static final C0756j J2 = new C0756j(null);
    private static final String Uo = j.class.getCanonicalName();

    /* JADX INFO: renamed from: com.facebook.internal.j$j, reason: collision with other inner class name */
    public static final class C0756j {
        public /* synthetic */ C0756j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final j t(Context context) {
            Method methodV;
            Object objP5;
            try {
                if (!Uo(context) || (methodV = vd.v("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objP5 = vd.p5(null, methodV, context)) == null) {
                    return null;
                }
                Method methodWTp = vd.wTp(objP5.getClass(), "getId", new Class[0]);
                Method methodWTp2 = vd.wTp(objP5.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodWTp != null && methodWTp2 != null) {
                    j jVar = new j();
                    jVar.f52795n = (String) vd.p5(objP5, methodWTp, new Object[0]);
                    Boolean bool = (Boolean) vd.p5(objP5, methodWTp2, new Object[0]);
                    jVar.f52794O = bool != null ? bool.booleanValue() : false;
                    return jVar;
                }
                return null;
            } catch (Exception e2) {
                vd.z("android_id", e2);
                return null;
            }
        }

        private C0756j() {
        }

        private final boolean Uo(Context context) {
            Method methodV = vd.v("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodV == null) {
                return false;
            }
            Object objP5 = vd.p5(null, methodV, context);
            return (objP5 instanceof Integer) && Intrinsics.areEqual(objP5, (Object) 0);
        }

        public final boolean KN(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            j jVarO = O(context);
            return jVarO != null && jVarO.gh();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x0033, Exception -> 0x0037, TRY_LEAVE, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final j O(Context context) throws Throwable {
            Exception exc;
            Cursor cursor;
            Throwable th;
            Uri uri;
            Uri uri2;
            String strJ2;
            Intrinsics.checkNotNullParameter(context, "context");
            j jVarRl = rl(context);
            Cursor cursor2 = null;
            try {
            } catch (Exception e2) {
                exc = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
            }
            j jVar = j.KN;
            if (jVar != null && System.currentTimeMillis() - jVar.rl < 3600000) {
                return jVar;
            }
            String[] strArr = {"aid", "androidid", "limit_tracking"};
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider != null) {
                String str = providerInfoResolveContentProvider.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "contentProviderInfo.packageName");
                if (!C.n(context, str)) {
                    if (providerInfoResolveContentProvider2 != null) {
                        String str2 = providerInfoResolveContentProvider2.packageName;
                        Intrinsics.checkNotNullExpressionValue(str2, "wakizashiProviderInfo.packageName");
                        if (C.n(context, str2)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        }
                    }
                    uri = null;
                    strJ2 = J2(context);
                    if (strJ2 != null) {
                        jVarRl.nr = strJ2;
                    }
                    if (uri != null) {
                        return n(jVarRl);
                    }
                    Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("aid");
                                int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                                int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                                jVarRl.f52796t = cursorQuery.getString(columnIndex);
                                if (columnIndex2 > 0 && columnIndex3 > 0 && jVarRl.KN() == null) {
                                    jVarRl.f52795n = cursorQuery.getString(columnIndex2);
                                    jVarRl.f52794O = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                                }
                                cursorQuery.close();
                                return n(jVarRl);
                            }
                        } catch (Exception e3) {
                            cursor = cursorQuery;
                            exc = e3;
                            try {
                                vd.piY(j.Uo, "Caught unexpected exception in getAttributionId(): " + exc);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return null;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursor;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = cursorQuery;
                            th = th;
                            if (cursor2 != null) {
                            }
                        }
                    }
                    j jVarN = n(jVarRl);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return jVarN;
                }
                uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                uri = uri2;
                strJ2 = J2(context);
                if (strJ2 != null) {
                }
                if (uri != null) {
                }
            }
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }

        private final String J2(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final j n(j jVar) {
            jVar.rl = System.currentTimeMillis();
            j.KN = jVar;
            return jVar;
        }

        private final j nr(Context context) {
            if (!Uo(context)) {
                return null;
            }
            w6 w6Var = new w6();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, w6Var, 1)) {
                        n nVar = new n(w6Var.nr());
                        j jVar = new j();
                        jVar.f52795n = nVar.fcU();
                        jVar.f52794O = nVar.eWT();
                        return jVar;
                    }
                } catch (Exception e2) {
                    vd.z("android_id", e2);
                } finally {
                    context.unbindService(w6Var);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final j rl(Context context) {
            j jVarT = t(context);
            if (jVarT == null) {
                j jVarNr = nr(context);
                if (jVarNr == null) {
                    return new j();
                }
                return jVarNr;
            }
            return jVarT;
        }
    }

    private static final class n implements IInterface {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0757j f52797t = new C0757j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final IBinder f52798n;

        /* JADX INFO: renamed from: com.facebook.internal.j$n$j, reason: collision with other inner class name */
        public static final class C0757j {
            public /* synthetic */ C0757j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0757j() {
            }
        }

        public n(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f52798n = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f52798n;
        }

        public final boolean eWT() {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                parcelObtain.writeInt(1);
                this.f52798n.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final String fcU() {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f52798n.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    private static final class w6 implements ServiceConnection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicBoolean f52799n = new AtomicBoolean(false);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final BlockingQueue f52800t = new LinkedBlockingDeque();

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public final IBinder nr() throws InterruptedException {
            if (this.f52799n.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object objTake = this.f52800t.take();
            Intrinsics.checkNotNullExpressionValue(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f52800t.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final boolean gh() {
        return this.f52794O;
    }

    public final String mUb() {
        return this.f52796t;
    }

    public final String xMQ() {
        return this.nr;
    }

    public final String KN() {
        if (com.facebook.s4.e() && com.facebook.s4.gh()) {
            return this.f52795n;
        }
        return null;
    }
}
