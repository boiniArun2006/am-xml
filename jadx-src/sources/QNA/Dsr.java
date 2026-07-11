package QNA;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.safedk.android.analytics.AppLovinBridge;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char[] f8055n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 QNA.Dsr$j, still in use, count: 1, list:
      (r0v0 QNA.Dsr$j) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 QNA.Dsr$j) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:135)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class j {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f8060e;

        static {
            HashMap map = new HashMap(4);
            f8060e = map;
            map.put("armeabi-v7a", new j());
            map.put("armeabi", new j());
            map.put("arm64-v8a", new j());
            map.put("x86", new j());
        }

        static j rl() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                h1M.CN3.J2().xMQ("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            j jVar = (j) f8060e.get(str.toLowerCase(Locale.US));
            return jVar == null ? UNKNOWN : jVar;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f8058X.clone();
        }

        private j() {
        }
    }

    public static String KN(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            String string = sb.toString();
            if (string.length() > 0) {
                return g(string);
            }
        }
        return null;
    }

    public static String XQ(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = b2 & UByte.MAX_VALUE;
            int i5 = i2 * 2;
            char[] cArr2 = f8055n;
            cArr[i5] = cArr2[i3 >>> 4];
            cArr[i5 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static SharedPreferences Ik(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static void J2(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                h1M.CN3.J2().O(str, e2);
            }
        }
    }

    public static void Uo(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean aYN() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static String az(Context context) {
        int iCk = ck(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iCk == 0) {
            iCk = ck(context, "com.crashlytics.android.build_id", "string");
        }
        if (iCk != 0) {
            return context.getResources().getString(iCk);
        }
        return null;
    }

    public static String g(String str) {
        return o(str, "SHA-1");
    }

    public static List mUb(Context context) {
        ArrayList arrayList = new ArrayList();
        int iCk = ck(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iCk2 = ck(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iCk3 = ck(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iCk == 0 || iCk2 == 0 || iCk3 == 0) {
            h1M.CN3.J2().rl(String.format("Could not find resources: %d %d %d", Integer.valueOf(iCk), Integer.valueOf(iCk2), Integer.valueOf(iCk3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iCk);
        String[] stringArray2 = context.getResources().getStringArray(iCk2);
        String[] stringArray3 = context.getResources().getStringArray(iCk3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            h1M.CN3.J2().rl(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i2 = 0; i2 < stringArray3.length; i2++) {
            arrayList.add(new Wre(stringArray[i2], stringArray2[i2], stringArray3[i2]));
        }
        return arrayList;
    }

    public static long n(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static boolean nY(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static boolean nr(Context context) {
        if (!O(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static String r(Context context) {
        int iCk = ck(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (iCk == 0) {
            return null;
        }
        return context.getResources().getString(iCk);
    }

    public static synchronized long rl(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long t(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static String te(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean xMQ(Context context, String str, boolean z2) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iCk = ck(context, str, "bool");
            if (iCk > 0) {
                return resources.getBoolean(iCk);
            }
            int iCk2 = ck(context, str, "string");
            if (iCk2 > 0) {
                return Boolean.parseBoolean(context.getString(iCk2));
            }
        }
        return z2;
    }

    public static String HI(Context context) {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i2);
                if (AppLovinBridge.f61290h.equals(resourcePackageName)) {
                    return context.getPackageName();
                }
                return resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static boolean O(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean S(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean ViF() {
        boolean zAYN = aYN();
        String str = Build.TAGS;
        if ((!zAYN && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!zAYN && file.exists()) {
            return true;
        }
        return false;
    }

    public static boolean WPU() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }

    private static String Z(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return XQ(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            h1M.CN3.J2().O("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static int ck(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, HI(context));
    }

    public static int gh() {
        return j.rl().ordinal();
    }

    private static String o(String str, String str2) {
        return Z(str.getBytes(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int qie() {
        boolean zAYN = aYN();
        ?? r02 = zAYN;
        if (ViF()) {
            r02 = (zAYN ? 1 : 0) | 2;
        }
        if (WPU()) {
            return r02 | 4;
        }
        return r02;
    }

    public static boolean ty(Context context) {
        if (aYN() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            return false;
        }
        return true;
    }
}
