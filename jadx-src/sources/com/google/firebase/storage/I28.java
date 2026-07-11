package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.io.UnsupportedEncodingException;
import oW.InterfaceC2314n;
import yJ.InterfaceC2435j;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f60845n;
    private final String nr;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final oSp.n f60846t;
    private E8.j xMQ;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f60844O = 600000;
    private long J2 = 60000;
    private long Uo = 600000;
    private long KN = 120000;

    class j implements InterfaceC2435j {
        @Override // yJ.InterfaceC2435j
        public void n(Dh.Ml ml) {
        }

        j() {
        }
    }

    public static I28 KN(com.google.firebase.Wre wre, String str) {
        Preconditions.checkArgument(wre != null, "Null is not a valid value for the FirebaseApp.");
        Preconditions.checkArgument(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return xMQ(wre, O6.Dsr.nr(wre, str));
        } catch (UnsupportedEncodingException e2) {
            Log.e("FirebaseStorage", "Unable to parse url:" + str, e2);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    private o HI(Uri uri) {
        Preconditions.checkNotNull(uri, "uri must not be null");
        String strNr = nr();
        Preconditions.checkArgument(TextUtils.isEmpty(strNr) || uri.getAuthority().equalsIgnoreCase(strNr), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new o(uri, this);
    }

    public static I28 Uo(com.google.firebase.Wre wre) {
        Preconditions.checkArgument(wre != null, "Null is not a valid value for the FirebaseApp.");
        String strJ2 = wre.ck().J2();
        if (strJ2 == null) {
            return xMQ(wre, null);
        }
        try {
            return xMQ(wre, O6.Dsr.nr(wre, "gs://" + wre.ck().J2()));
        } catch (UnsupportedEncodingException e2) {
            Log.e("FirebaseStorage", "Unable to parse bucket:" + strJ2, e2);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    private String nr() {
        return this.nr;
    }

    private static I28 xMQ(com.google.firebase.Wre wre, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        Preconditions.checkNotNull(wre, "Provided FirebaseApp must not be null.");
        Wre wre2 = (Wre) wre.mUb(Wre.class);
        Preconditions.checkNotNull(wre2, "Firebase Storage component is not present.");
        return wre2.n(host);
    }

    public void Ik(String str, int i2) {
        this.xMQ = new E8.j(str, i2);
    }

    E8.j O() {
        return this.xMQ;
    }

    public long az() {
        return this.f60844O;
    }

    public long gh() {
        return this.Uo;
    }

    public long mUb() {
        return this.J2;
    }

    public com.google.firebase.Wre n() {
        return this.f60845n;
    }

    public long qie() {
        return this.KN;
    }

    InterfaceC2436n rl() {
        oSp.n nVar = this.f60846t;
        if (nVar != null) {
            return (InterfaceC2436n) nVar.get();
        }
        return null;
    }

    InterfaceC2314n t() {
        oSp.n nVar = this.rl;
        if (nVar != null) {
            return (InterfaceC2314n) nVar.get();
        }
        return null;
    }

    I28(String str, com.google.firebase.Wre wre, oSp.n nVar, oSp.n nVar2) {
        this.nr = str;
        this.f60845n = wre;
        this.rl = nVar;
        this.f60846t = nVar2;
        if (nVar2 != null && nVar2.get() != null) {
            ((InterfaceC2436n) nVar2.get()).rl(new j());
        }
    }

    public static I28 J2() {
        boolean z2;
        com.google.firebase.Wre wreAz = com.google.firebase.Wre.az();
        if (wreAz != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "You must call FirebaseApp.initialize() first.");
        return Uo(wreAz);
    }

    public o ck(String str) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith(d.f62220u) && !lowerCase.startsWith(d.f62221v)) {
            return ty().rl(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    public o ty() {
        if (!TextUtils.isEmpty(nr())) {
            return HI(new Uri.Builder().scheme("gs").authority(nr()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }
}
