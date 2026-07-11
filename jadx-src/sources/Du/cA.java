package Du;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class cA {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final EJn.Wre[] f2008n = new EJn.Wre[0];

    public static final Void J2(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new SerializationException(O(kClass));
    }

    public static final String O(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return nr(simpleName);
    }

    public static final KType Uo(KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
        KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }

    public static final Set n(EJn.Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        if (wre instanceof Pl) {
            return ((Pl) wre).n();
        }
        HashSet hashSet = new HashSet(wre.nr());
        int iNr = wre.nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            hashSet.add(wre.O(i2));
        }
        return hashSet;
    }

    public static final String nr(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final EJn.Wre[] rl(List list) {
        EJn.Wre[] wreArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (wreArr = (EJn.Wre[]) list.toArray(new EJn.Wre[0])) == null) ? f2008n : wreArr;
    }

    public static final KClass t(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }
}
