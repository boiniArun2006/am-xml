package XoT;

import android.util.Log;
import com.alightcreative.gl.OpenGLOutOfMemoryException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class C {
    private static final boolean Uo = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final WeakHashMap f11829n = new WeakHashMap();
    private static final WeakHashMap rl = new WeakHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final WeakHashMap f11830t = new WeakHashMap();
    private static final WeakHashMap nr = new WeakHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final WeakHashMap f11828O = new WeakHashMap();
    private static final boolean J2 = false;
    private static final Set KN = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(String str) {
        return str;
    }

    public static final void HI(Object obj, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (nr.containsKey(obj)) {
            return;
        }
        String strJ2 = J2(obj.getClass());
        String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Log.w(strJ2 + "[" + StringsKt.take(string, 4) + "]", (String) lazyMessage.invoke());
    }

    public static final void Ik(String tag, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (nr.containsKey(tag)) {
            return;
        }
        Log.w(tag, (String) lazyMessage.invoke());
    }

    public static final void KN(String tag, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (Uo && !rl.containsKey(tag)) {
            if (J2) {
                Log.i(tag, (String) lazyMessage.invoke());
            } else {
                Log.d(tag, (String) lazyMessage.invoke());
            }
        }
    }

    public static final void Uo(Object obj, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (Uo && !rl.containsKey(obj)) {
            if (J2) {
                String strJ2 = J2(obj.getClass());
                String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Log.i(strJ2 + "[" + StringsKt.take(string, 4) + "]", (String) lazyMessage.invoke());
                return;
            }
            String strJ22 = J2(obj.getClass());
            String string2 = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Log.d(strJ22 + "[" + StringsKt.take(string2, 4) + "]", (String) lazyMessage.invoke());
        }
    }

    public static final void az(Object obj, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (Uo && !f11829n.containsKey(obj)) {
            if (J2) {
                String strJ2 = J2(obj.getClass());
                String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Log.i(strJ2 + "[" + StringsKt.take(string, 4) + "]", (String) lazyMessage.invoke());
                return;
            }
            String strJ22 = J2(obj.getClass());
            String string2 = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Log.v(strJ22 + "[" + StringsKt.take(string2, 4) + "]", (String) lazyMessage.invoke());
        }
    }

    public static final void ck(String tag, Throwable throwable, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (nr.containsKey(tag)) {
            return;
        }
        Log.w(tag, (String) lazyMessage.invoke(), throwable);
    }

    public static final void gh(String tag, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (f11828O.containsKey(tag)) {
            return;
        }
        Log.e(tag, (String) lazyMessage.invoke());
    }

    public static final void mUb(Object obj, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        String strJ2 = J2(obj.getClass());
        String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Log.e(strJ2 + "[" + StringsKt.take(string, 4) + "]", (String) lazyMessage.invoke());
    }

    public static final void nr(final String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        KN("Crashlytics", new Function0() { // from class: XoT.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.O(message);
            }
        });
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        firebaseCrashlytics.log(message);
    }

    public static final void qie(Object obj, Function0 lazyMessage) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (f11830t.containsKey(obj)) {
            return;
        }
        String strJ2 = J2(obj.getClass());
        String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Log.i(strJ2 + "[" + StringsKt.take(string, 4) + "]", (String) lazyMessage.invoke());
    }

    public static final Object r(Function0 block) throws Throwable {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(block.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            if (t(thM316exceptionOrNullimpl)) {
                throw thM316exceptionOrNullimpl;
            }
            Dsr dsrRl = rl(thM316exceptionOrNullimpl);
            Set set = KN;
            if (!set.contains(dsrRl)) {
                set.add(dsrRl);
                FirebaseCrashlytics.getInstance().recordException(thM316exceptionOrNullimpl);
            }
        }
        return objM313constructorimpl;
    }

    private static final boolean t(Throwable th) {
        return !(th instanceof Exception) || (th instanceof CancellationException) || (th instanceof InterruptedException) || (th instanceof OpenGLOutOfMemoryException);
    }

    public static final void ty(Object obj, String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String strJ2 = J2(obj.getClass());
        String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Log.w(strJ2 + "[" + StringsKt.take(string, 4) + "]", message, throwable);
    }

    public static final void xMQ(Object obj, String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String strJ2 = J2(obj.getClass());
        String string = Integer.toString(obj.hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Log.e(strJ2 + "[" + StringsKt.take(string, 4) + "]", message, throwable);
    }

    private static final String J2(Class cls) {
        String simpleName;
        String name;
        if (cls.isAnonymousClass() && cls.getEnclosingClass() != null) {
            Class<?> enclosingClass = cls.getEnclosingClass();
            Intrinsics.checkNotNull(enclosingClass);
            String strJ2 = J2(enclosingClass);
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod == null || (name = enclosingMethod.getName()) == null) {
                name = "?";
            }
            return strJ2 + ":" + name;
        }
        if (StringsKt.isBlank(cls.getSimpleName())) {
            simpleName = cls.getName();
        } else {
            simpleName = cls.getSimpleName();
        }
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }

    private static final Dsr rl(Throwable th) {
        String fileName;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
        Class<?> cls = th.getClass();
        Integer numValueOf = null;
        if (stackTraceElement != null) {
            fileName = stackTraceElement.getFileName();
        } else {
            fileName = null;
        }
        if (stackTraceElement != null) {
            numValueOf = Integer.valueOf(stackTraceElement.getLineNumber());
        }
        return new Dsr(cls, fileName, numValueOf);
    }
}
