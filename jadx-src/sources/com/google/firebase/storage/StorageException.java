package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class StorageException extends FirebaseException {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Throwable f60858O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f60859n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f60860t;

    private static boolean KN(int i2) {
        if (i2 != 0) {
            return i2 >= 200 && i2 < 300;
        }
        return true;
    }

    public static StorageException nr(Throwable th) {
        return O(th, 0);
    }

    private static int rl(Throwable th, int i2) {
        if (i2 == -2) {
            return -13030;
        }
        if (i2 == 401) {
            return -13020;
        }
        if (i2 == 409) {
            return -13031;
        }
        if (i2 != 403) {
            return i2 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th = this.f60858O;
        if (th == this) {
            return null;
        }
        return th;
    }

    public static StorageException O(Throwable th, int i2) {
        if (th instanceof StorageException) {
            return (StorageException) th;
        }
        if (KN(i2) && th == null) {
            return null;
        }
        return new StorageException(rl(th, i2), th, i2);
    }

    static String Uo(int i2) {
        if (i2 == -13040) {
            return "The operation was cancelled.";
        }
        if (i2 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i2 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i2 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i2 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i2) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    public int J2() {
        return this.f60859n;
    }

    StorageException(int i2, Throwable th, int i3) {
        super(Uo(i2));
        this.f60858O = th;
        this.f60859n = i2;
        this.f60860t = i3;
        Log.e("StorageException", "StorageException has occurred.\n" + Uo(i2) + "\n Code: " + i2 + " HttpResult: " + i3);
        Throwable th2 = this.f60858O;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.f60858O);
        }
    }

    private static int n(Status status) {
        if (status.isCanceled()) {
            return -13040;
        }
        if (status.equals(Status.RESULT_TIMEOUT)) {
            return -13030;
        }
        return -13000;
    }

    public static StorageException t(Status status) {
        Preconditions.checkNotNull(status);
        Preconditions.checkArgument(!status.isSuccess());
        return new StorageException(n(status), null, 0);
    }
}
