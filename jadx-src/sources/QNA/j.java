package QNA;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j {
    public final String J2;
    public final h1M.Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f8122O;
    public final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8123n;
    public final String nr;
    public final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f8124t;

    private static String rl(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public j(String str, String str2, List list, String str3, String str4, String str5, String str6, h1M.Wre wre) {
        this.f8123n = str;
        this.rl = str2;
        this.f8124t = list;
        this.nr = str3;
        this.f8122O = str4;
        this.J2 = str5;
        this.Uo = str6;
        this.KN = wre;
    }

    public static j n(Context context, iwV iwv, String str, String str2, List list, h1M.Wre wre) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strUo = iwv.Uo();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strRl = rl(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new j(str, str2, list, strUo, packageName, strRl, str3, wre);
    }
}
