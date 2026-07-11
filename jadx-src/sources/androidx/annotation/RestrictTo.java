package androidx.annotation;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.FILE})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "", "Landroidx/annotation/RestrictTo$Scope;", "value", "<init>", "(Lkotlin/Array;)V", "Scope", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Documented
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "o", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scope {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f13404S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ Scope[] f13405Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Scope f13406n = new Scope("LIBRARY", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Scope f13409t = new Scope("LIBRARY_GROUP", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Scope f13403O = new Scope("LIBRARY_GROUP_PREFIX", 2);
        public static final Scope J2 = new Scope("GROUP_ID", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Scope f13408r = new Scope("TESTS", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Scope f13407o = new Scope("SUBCLASSES", 5);

        private static final /* synthetic */ Scope[] n() {
            return new Scope[]{f13406n, f13409t, f13403O, J2, f13408r, f13407o};
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) f13405Z.clone();
        }

        static {
            Scope[] scopeArrN = n();
            f13405Z = scopeArrN;
            f13404S = EnumEntriesKt.enumEntries(scopeArrN);
        }

        private Scope(String str, int i2) {
        }
    }
}
