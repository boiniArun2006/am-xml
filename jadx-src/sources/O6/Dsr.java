package O6;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.safedk.android.analytics.brandsafety.creatives.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import oW.InterfaceC2314n;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Dsr {
    public static String rl(InterfaceC2436n interfaceC2436n) {
        if (interfaceC2436n == null) {
            return null;
        }
        try {
            Dh.Ml ml = (Dh.Ml) Tasks.await(interfaceC2436n.n(false), 30000L, TimeUnit.MILLISECONDS);
            if (ml.n() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + ml.n());
            }
            return ml.rl();
        } catch (InterruptedException e2) {
            e = e2;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e4) {
            e = e4;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    public static String t(InterfaceC2314n interfaceC2314n) {
        String strT;
        if (interfaceC2314n != null) {
            try {
                strT = ((com.google.firebase.auth.Dsr) Tasks.await(interfaceC2314n.rl(false), 30000L, TimeUnit.MILLISECONDS)).t();
            } catch (InterruptedException e2) {
                e = e2;
                Log.e("StorageUtil", "error getting token " + e);
            } catch (ExecutionException e3) {
                e = e3;
                Log.e("StorageUtil", "error getting token " + e);
            } catch (TimeoutException e4) {
                e = e4;
                Log.e("StorageUtil", "error getting token " + e);
            }
        } else {
            strT = null;
        }
        if (!TextUtils.isEmpty(strT)) {
            return strT;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    public static boolean n(Object obj, Object obj2) {
        return Objects.equal(obj, obj2);
    }

    public static Uri nr(com.google.firebase.Wre wre, String str) {
        String strSubstring;
        String strSubstring2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = X3O.I28.gh;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + Ml.rl(Ml.n(str.substring(5))));
        }
        Uri uri2 = Uri.parse(str);
        String scheme = uri2.getScheme();
        if (scheme != null && (n(scheme.toLowerCase(), g.f62375e) || n(scheme.toLowerCase(), "https"))) {
            int iIndexOf = uri2.getAuthority().toLowerCase().indexOf(uri.getAuthority());
            String strT = Ml.t(uri2.getEncodedPath());
            if (iIndexOf == 0 && strT.startsWith("/")) {
                int iIndexOf2 = strT.indexOf("/b/", 0);
                int i2 = iIndexOf2 + 3;
                int iIndexOf3 = strT.indexOf("/", i2);
                int iIndexOf4 = strT.indexOf("/o/", 0);
                if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                    strSubstring = strT.substring(i2, iIndexOf3);
                    if (iIndexOf4 != -1) {
                        strSubstring2 = strT.substring(iIndexOf4 + 3);
                    } else {
                        strSubstring2 = "";
                    }
                    strT = strSubstring2;
                } else {
                    Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                    throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                }
            } else if (iIndexOf > 1) {
                strSubstring = uri2.getAuthority().substring(0, iIndexOf - 1);
            } else {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            Preconditions.checkNotEmpty(strSubstring, "No bucket specified");
            return new Uri.Builder().scheme("gs").authority(strSubstring).encodedPath(strT).build();
        }
        Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
        throw new IllegalArgumentException("Uri scheme");
    }
}
