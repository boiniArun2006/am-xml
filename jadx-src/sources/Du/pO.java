package Du;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class pO implements KType {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KType f2041n;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.f2041n;
        pO pOVar = obj instanceof pO ? (pO) obj : null;
        if (!Intrinsics.areEqual(kType, pOVar != null ? pOVar.f2041n : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    public pO(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f2041n = origin;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return this.f2041n.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public List getArguments() {
        return this.f2041n.getArguments();
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f2041n.getClassifier();
    }

    public int hashCode() {
        return this.f2041n.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f2041n.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f2041n;
    }
}
