package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.PreviewLogger;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u00020\b2\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "<init>", "()V", "", "Ljava/lang/Class;", "composableMethodTypes", "previewParameterTypes", "", c.f62177j, "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "Ljava/lang/reflect/Method;", "", JavetError.PARAMETER_METHOD_NAME, "args", "nr", "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "previewParamArgs", "O", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "J2", "(Ljava/lang/Class;)Ljava/lang/Object;", "instance", "Landroidx/compose/runtime/Composer;", "composer", "KN", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)Ljava/lang/Object;", "", "realValueParams", "thisParams", "rl", "(II)I", "t", "(I)I", "className", "", "Uo", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@SourceDebugExtension({"SMAP\nComposableInvoker.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n78#1:267\n11155#2:236\n11266#2,4:237\n1282#2,2:244\n11383#2,9:252\n13309#2:261\n13310#2:263\n11392#2:264\n1735#2,6:274\n1726#3,3:241\n1549#3:246\n1620#3,3:247\n1549#3:268\n1620#3,3:269\n37#4,2:250\n37#4,2:265\n37#4,2:272\n1#5:262\n1#5:280\n*S KotlinDebug\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n*L\n96#1:267\n44#1:236\n44#1:237,4\n70#1:244,2\n92#1:252,9\n92#1:261\n92#1:263\n92#1:264\n144#1:274,6\n56#1:241,3\n78#1:246\n78#1:247,3\n96#1:268\n96#1:269,3\n78#1:250,2\n92#1:265,2\n96#1:272,2\n92#1:262\n*E\n"})
public final class ComposableInvoker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableInvoker f33936n = new ComposableInvoker();

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean n(Class[] composableMethodTypes, Class[] previewParameterTypes) {
        if (composableMethodTypes.length == previewParameterTypes.length) {
            ArrayList arrayList = new ArrayList(composableMethodTypes.length);
            int length = composableMethodTypes.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 >= length) {
                    break;
                }
                Class cls = composableMethodTypes[i2];
                int i5 = i3 + 1;
                Class cls2 = previewParameterTypes[i3];
                if (!Intrinsics.areEqual(JvmClassMappingKt.getKotlinClass(cls), JvmClassMappingKt.getKotlinClass(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z2 = false;
                }
                arrayList.add(Boolean.valueOf(z2));
                i2++;
                i3 = i5;
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final Method nr(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methodArr[i2];
            if (!Intrinsics.areEqual(str, method2.getName())) {
                if (!StringsKt.startsWith$default(method2.getName(), str + '-', false, 2, (Object) null)) {
                    continue;
                }
                i2++;
            }
            if (f33936n.n(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i2++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final int t(int realValueParams) {
        return (int) Math.ceil(((double) realValueParams) / 31.0d);
    }

    private final Method O(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i2++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iRl = rl(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                IntRange intRangeUntil = RangesKt.until(0, iRl);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.addSpread(clsArr);
                spreadBuilder.add(Composer.class);
                spreadBuilder.addSpread(clsArr2);
                return nr(declaredMethods, str, (Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Intrinsics.areEqual(method.getName(), str)) {
                    if (!StringsKt.startsWith$default(method.getName(), str + '-', false, 2, (Object) null)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    private final int rl(int realValueParams, int thisParams) {
        if (realValueParams == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (realValueParams + thisParams)) / 10.0d);
    }

    public final void Uo(String className, String methodName, Composer composer, Object... args) {
        try {
            Class<?> cls = Class.forName(className);
            Method methodO = O(cls, methodName, Arrays.copyOf(args, args.length));
            if (methodO != null) {
                methodO.setAccessible(true);
                if (Modifier.isStatic(methodO.getModifiers())) {
                    KN(methodO, null, composer, Arrays.copyOf(args, args.length));
                    return;
                } else {
                    KN(methodO, cls.getConstructor(new Class[0]).newInstance(new Object[0]), composer, Arrays.copyOf(args, args.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + className + '.' + methodName + " not found");
        } catch (Exception e2) {
            PreviewLogger.Companion.t(PreviewLogger.INSTANCE, "Failed to invoke Composable Method '" + className + '.' + methodName + '\'', null, 2, null);
            throw e2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object J2(Class cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return null;
                }
                return Double.valueOf(0.0d);
            case 104431:
                if (name.equals(l.f62668w)) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }

    private final Object KN(Method method, Object obj, Composer composer, Object... objArr) {
        int i2;
        int iT;
        Object objJ2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i3 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], Composer.class)) {
                    i3 = length;
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        if (obj != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = i3 + 1;
        int iRl = rl(i3, i2) + i7;
        int length2 = method.getParameterTypes().length;
        if (length2 != iRl) {
            iT = t(i3);
        } else {
            iT = 0;
        }
        if (iT + iRl == length2) {
            Object[] objArr2 = new Object[length2];
            for (int i8 = 0; i8 < length2; i8++) {
                if (i8 >= 0 && i8 < i3) {
                    if (i8 >= 0 && i8 <= ArraysKt.getLastIndex(objArr)) {
                        objJ2 = objArr[i8];
                    } else {
                        objJ2 = f33936n.J2(method.getParameterTypes()[i8]);
                    }
                } else if (i8 == i3) {
                    objJ2 = composer;
                } else if (i7 <= i8 && i8 < iRl) {
                    objJ2 = 0;
                } else if (iRl <= i8 && i8 < length2) {
                    objJ2 = 2097151;
                } else {
                    throw new IllegalStateException("Unexpected index");
                }
                objArr2[i8] = objJ2;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("params don't add up to total params");
    }
}
