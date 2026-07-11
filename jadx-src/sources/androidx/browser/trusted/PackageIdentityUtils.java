package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class PackageIdentityUtils {

    @RequiresApi
    static class Api28Implementation implements SignaturesCompat {
        public List rl(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (!signingInfo.hasMultipleSigners()) {
                arrayList.add(PackageIdentityUtils.n(signingInfo.getSigningCertificateHistory()[0]));
                return arrayList;
            }
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(PackageIdentityUtils.n(signature));
            }
            return arrayList;
        }

        Api28Implementation() {
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean n(String str, PackageManager packageManager, TokenContents tokenContents) {
            List listRl;
            if (!tokenContents.J2().equals(str) || (listRl = rl(str, packageManager)) == null) {
                return false;
            }
            if (listRl.size() == 1) {
                return packageManager.hasSigningCertificate(str, tokenContents.O(0), 1);
            }
            return tokenContents.equals(TokenContents.t(str, listRl));
        }
    }

    static class Pre28Implementation implements SignaturesCompat {
        public List rl(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] bArrN = PackageIdentityUtils.n(signature);
                if (bArrN == null) {
                    return null;
                }
                arrayList.add(bArrN);
            }
            return arrayList;
        }

        Pre28Implementation() {
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean n(String str, PackageManager packageManager, TokenContents tokenContents) {
            List listRl;
            if (!str.equals(tokenContents.J2()) || (listRl = rl(str, packageManager)) == null) {
                return false;
            }
            return tokenContents.equals(TokenContents.t(str, listRl));
        }
    }

    interface SignaturesCompat {
        boolean n(String str, PackageManager packageManager, TokenContents tokenContents);
    }

    static byte[] n(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static SignaturesCompat rl() {
        return Build.VERSION.SDK_INT >= 28 ? new Api28Implementation() : new Pre28Implementation();
    }

    static boolean t(String str, PackageManager packageManager, TokenContents tokenContents) {
        try {
            return rl().n(str, packageManager, tokenContents);
        } catch (PackageManager.NameNotFoundException | IOException e2) {
            Log.e("PackageIdentity", "Could not check if package matches token.", e2);
            return false;
        }
    }
}
