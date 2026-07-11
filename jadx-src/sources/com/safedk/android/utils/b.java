package com.safedk.android.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.squareup.moshi.Json;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f63132a = Arrays.asList(n.f63225f, "java.util.List", "java.util.ArrayList", "java.util.Map", "java.util.HashMap", "org.json.JSONObject", "com.five_corp.ad.internal.cache", "com.five_corp.ad.internal.context", com.safedk.android.analytics.brandsafety.l.f62668w, "long");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63133b = "DebugUtils";

    private static void a(String str, String str2, ViewGroup viewGroup, String str3) {
        try {
            int childCount = viewGroup.getChildCount();
            int length = (childCount + "").length();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = viewGroup.getChildAt(i2);
                float z2 = 0.0f;
                if (Build.VERSION.SDK_INT >= 21) {
                    z2 = childAt.getZ();
                }
                String str4 = "type : " + childAt.getClass().getName() + ", viewId :" + Integer.toHexString(childAt.getId()) + ", address : " + BrandSafetyUtils.a(childAt) + ", top/left/width/height : " + childAt.getTop() + "," + childAt.getLeft() + "," + childAt.getWidth() + "," + childAt.getHeight() + ",z-order : " + z2;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                i2++;
                sb.append(String.format(str2 + " " + ("|— %0" + length + "d/%0" + length + "d %s"), Integer.valueOf(i2), Integer.valueOf(childCount), str4));
                String string = sb.toString();
                if (childAt instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) childAt;
                    string = string + ", surfaceView Holder : " + surfaceView.getHolder();
                    if (surfaceView.getHolder() != null) {
                        string = string + ", surfaceView Holder Surface object : " + surfaceView.getHolder().getSurface();
                    }
                }
                Logger.d(str, string);
                if (childAt instanceof ViewGroup) {
                    a(str, str2, (ViewGroup) childAt, str3 + "  ");
                }
            }
        } catch (Throwable th) {
            Logger.e(f63133b, "Exception in printViewHierarchy", th);
        }
    }

    private static void a(View view, String str, String str2) {
        try {
            Logger.d(str, str2, " getViewDetails started, View type is ", view.getClass().getName(), ", Id=", Integer.toHexString(view.getId()));
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    a((View) view.getParent(), str, str2);
                } else {
                    Log.d(str, str2 + " getViewDetails parent is ViewParent, view : " + view.getId() + dpcnwfoVOnrtRA.wRlWd + view.getClass().getName());
                }
            }
        } catch (Throwable th) {
            Logger.e(str, str2, " Exception in getViewDetails", th);
        }
    }

    private static void a(Context context, String str) {
        File file = new File(context.getFilesDir() + "/" + str);
        if (file.exists()) {
            a(file);
        } else {
            Logger.d(f63133b, "listFiles directory does not exist : ", file);
        }
    }

    private static void a(Context context) {
        Logger.d(f63133b, "listFilesInFilesDir started, dir : ", context.getFilesDir().getPath());
        a(context.getFilesDir());
    }

    private static void b(Context context) {
        a(context.getCacheDir());
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                Logger.d(f63133b, "listFilesInDir file ", a(file.length()), " ", file.getPath());
                return;
            }
            if (file.isDirectory()) {
                Logger.d(f63133b, "listFilesInDir dir  ", file.getPath());
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    private static String a(long j2) {
        if (j2 <= 0) {
            return "0 Bytes";
        }
        String[] strArr = {"Bt", "kB", "MB", inFlMLxL.nXww, "TB"};
        double d2 = j2;
        int iLog10 = (int) (Math.log10(d2) / Math.log10(1024.0d));
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.#");
        double dPow = Math.pow(1024.0d, iLog10);
        Double.isNaN(d2);
        sb.append(decimalFormat.format(d2 / dPow));
        sb.append(" ");
        sb.append(strArr[iLog10]);
        return sb.toString();
    }

    private static void a(String str, String str2, Object obj, int i2, int i3) {
        if (obj == null) {
            return;
        }
        try {
            if (obj.getClass() == null) {
                return;
            }
            if (i2 > i3) {
                Log.d(str, str2 + " reflectRecursively cannot go beyond level " + i3 + " current level is " + i2);
                return;
            }
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                String string = null;
                if (c(field.getType().getName())) {
                    string = obj2 != null ? obj2.toString() : V8ValueNull.NULL;
                }
                String strReplace = new String(new char[i2 * 2]).replace(Json.UNSET_NAME, "-");
                if (f63132a.contains(field.getType().getName())) {
                    Logger.d(str, str2, " reflectRecursively level ", Integer.valueOf(i2), strReplace, ", name : ", field.getName(), ", type : ", field.getType().getName(), ", value : ", string);
                } else {
                    Logger.d(str, str2, " reflectRecursively level ", Integer.valueOf(i2), strReplace, ", name : ", field.getName(), ", type : ", field.getType().getName());
                }
                if (!field.getType().isPrimitive() && obj2 != null) {
                    a(str, str2, obj2, i2 + 1, i3);
                }
            }
        } catch (Throwable th) {
            Logger.e(str, str2, " reflectRecursively Exception, stopping", th);
        }
    }

    private static boolean c(String str) {
        Iterator<String> it = f63132a.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().startsWith(it.next().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, String str2) {
        String str3;
        Logger.d(f63133b, "Copy File To External Storage: src is: ", str, " directory: ", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        if (str2 != null) {
            str3 = str2 + File.separator;
        } else {
            str3 = "";
        }
        sb.append(str3);
        String string = sb.toString();
        Logger.d(f63133b, "Copy File To External Storage: destination: ", string);
        String[] strArrSplit = str.split("/");
        String str4 = string + strArrSplit[strArrSplit.length - 1];
        Logger.d(f63133b, "Copy File To External Storage: target = ", str4);
        Logger.d(f63133b, "Copy File To External Storage: result = ", Boolean.valueOf(b(str, str4)));
    }

    private static boolean b(String str, String str2) {
        int i2;
        try {
            if (!new File(str).exists()) {
                i2 = 0;
            } else {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                i2 = 0;
                while (true) {
                    int i3 = fileInputStream.read(bArr);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                    fileOutputStream.write(bArr, 0, i3);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            if (new File(str2).exists()) {
                Logger.d(f63133b, "copyFile finished creating file ", str2, ", ", Integer.valueOf(i2), " bytes written");
            } else {
                Logger.d(f63133b, "copyFile failed to create file ", str2);
            }
            return true;
        } catch (Throwable th) {
            Logger.d(f63133b, "Exception in copyFile : ", th.getMessage(), th);
            return false;
        }
    }

    public static List<String> a(String str) {
        File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: com.safedk.android.utils.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<String> f63134a = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif");

            @Override // java.io.FileFilter
            public boolean accept(File pathname) {
                String path = pathname.getPath();
                return this.f63134a.contains(path.substring(path.lastIndexOf(".") + 1));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    private static void a(File file, File file2) throws IOException {
        FileChannel channel;
        FileChannel channel2 = null;
        try {
            channel = new FileInputStream(file).getChannel();
            try {
                channel2 = new FileOutputStream(file2).getChannel();
            } catch (FileNotFoundException e2) {
                e = e2;
                Logger.d(f63133b, "Exception copying file :", e.getMessage(), e);
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            channel = null;
        }
        try {
            channel.transferTo(0L, channel.size(), channel2);
        } catch (Throwable th) {
            try {
                Logger.d(f63133b, "Exception copying file :", th.getMessage(), th);
                if (channel != null) {
                    channel.close();
                }
                if (channel2 == null) {
                }
            } finally {
                if (channel != null) {
                    channel.close();
                }
                if (channel2 != null) {
                    channel2.close();
                }
            }
        }
    }

    public static String b(String str) {
        SafeDK.getInstance().m();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (FileNotFoundException e2) {
            Logger.e(f63133b, "Exception reading file ", str, e2);
        } catch (IOException e3) {
            Logger.e(f63133b, "Exception reading file ", str, e3);
        }
        return sb.toString();
    }
}
