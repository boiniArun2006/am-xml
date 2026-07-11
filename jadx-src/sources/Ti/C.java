package Ti;

import com.facebook.GraphRequest;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f10527n = new C();

    public static final String KN(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean gh(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (xMQ(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (!StringsKt.startsWith$default(className, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        if (!StringsKt.startsWith$default(className2, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (StringsKt.startsWith$default(methodName, "onClick", false, 2, (Object) null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (StringsKt.startsWith$default(methodName2, "onItemClick", false, 2, (Object) null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!StringsKt.startsWith$default(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean mUb(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (xMQ(element)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HI(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ik(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    public static final String O(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final String Uo(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean az(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    public static final void o(String str, JSONArray reports, GraphRequest.n nVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject jSONObjectFD = vd.fD();
            if (jSONObjectFD != null) {
                Iterator<String> itKeys = jSONObjectFD.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectFD.get(next));
                }
            }
            GraphRequest.w6 w6Var = GraphRequest.ty;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{s4.az()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            w6Var.g(null, str2, jSONObject, nVar).qie();
        } catch (JSONException unused) {
        }
    }

    public static final boolean xMQ(StackTraceElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        if (StringsKt.startsWith$default(className, "com.facebook", false, 2, (Object) null)) {
            return true;
        }
        String className2 = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
        return StringsKt.startsWith$default(className2, "com.meta", false, 2, (Object) null);
    }

    private C() {
    }

    public static final File J2() {
        File file = new File(s4.qie().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final void Z(String str, String str2) {
        File fileJ2 = J2();
        if (fileJ2 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileJ2, str));
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static final File[] ck() {
        File fileJ2 = J2();
        if (fileJ2 == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileJ2.listFiles(new FilenameFilter() { // from class: Ti.fuX
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C.Ik(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    public static final boolean nr(String str) {
        File fileJ2 = J2();
        if (fileJ2 != null && str != null) {
            return new File(fileJ2, str).delete();
        }
        return false;
    }

    public static final File[] qie() {
        File fileJ2 = J2();
        if (fileJ2 == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileJ2.listFiles(new FilenameFilter() { // from class: Ti.Dsr
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C.az(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    public static final JSONObject r(String str, boolean z2) {
        File fileJ2 = J2();
        if (fileJ2 != null && str != null) {
            try {
                return new JSONObject(vd.G7(new FileInputStream(new File(fileJ2, str))));
            } catch (Exception unused) {
                if (z2) {
                    nr(str);
                }
            }
        }
        return null;
    }

    public static final File[] ty() {
        File fileJ2 = J2();
        if (fileJ2 == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileJ2.listFiles(new FilenameFilter() { // from class: Ti.aC
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C.HI(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }
}
