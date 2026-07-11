package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class TypeMappingMode {

    @JvmField
    public static final TypeMappingMode CLASS_DECLARATION;
    public static final Companion Companion = new Companion(null);

    @JvmField
    public static final TypeMappingMode DEFAULT;

    @JvmField
    public static final TypeMappingMode DEFAULT_UAST;

    @JvmField
    public static final TypeMappingMode GENERIC_ARGUMENT;

    @JvmField
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;

    @JvmField
    public static final TypeMappingMode RETURN_TYPE_BOXED;

    @JvmField
    public static final TypeMappingMode SUPER_TYPE;

    @JvmField
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;

    @JvmField
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;
    private final TypeMappingMode genericArgumentMode;
    private final TypeMappingMode genericContravariantArgumentMode;
    private final TypeMappingMode genericInvariantArgumentMode;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean mapTypeAliases;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    static {
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z2, z3, z4, z5, z6, null, false, null, null, z7, 1023, null);
        GENERIC_ARGUMENT = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z7, false, false, null, false, null, null, true, 511, null);
        GENERIC_ARGUMENT_UAST = typeMappingMode2;
        RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        DEFAULT = new TypeMappingMode(z2, z3, z4, z5, z6, typeMappingMode, false, null, null, z7, 988, null);
        DEFAULT_UAST = new TypeMappingMode(false, false, z7, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z9 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        CLASS_DECLARATION = new TypeMappingMode(z2, true, z4, z5, z6, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z7, 988, defaultConstructorMarker);
        boolean z10 = false;
        boolean z11 = true;
        SUPER_TYPE = new TypeMappingMode(z2, z10, z4, z11, z6, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z7, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z2, z10, z4, z11, z6, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z7, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z2, z10, true, false, z6, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z7, 984, defaultConstructorMarker);
    }

    public TypeMappingMode(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, TypeMappingMode typeMappingMode, boolean z7, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z9) {
        this.needPrimitiveBoxing = z2;
        this.needInlineClassWrapping = z3;
        this.isForAnnotationParameter = z4;
        this.skipDeclarationSiteWildcards = z5;
        this.skipDeclarationSiteWildcardsIfPossible = z6;
        this.genericArgumentMode = typeMappingMode;
        this.kotlinCollectionsToJavaCollections = z7;
        this.genericContravariantArgumentMode = typeMappingMode2;
        this.genericInvariantArgumentMode = typeMappingMode3;
        this.mapTypeAliases = z9;
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    public final boolean getMapTypeAliases() {
        return this.mapTypeAliases;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final TypeMappingMode toGenericArgumentMode(Variance effectiveVariance, boolean z2) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z2 || !this.isForAnnotationParameter) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i2 == 1) {
                TypeMappingMode typeMappingMode = this.genericContravariantArgumentMode;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i2 != 2) {
                TypeMappingMode typeMappingMode2 = this.genericArgumentMode;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.genericInvariantArgumentMode;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, TypeMappingMode typeMappingMode, boolean z7, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        z2 = (i2 & 1) != 0 ? true : z2;
        z3 = (i2 & 2) != 0 ? true : z3;
        z4 = (i2 & 4) != 0 ? false : z4;
        z5 = (i2 & 8) != 0 ? false : z5;
        z6 = (i2 & 16) != 0 ? false : z6;
        typeMappingMode = (i2 & 32) != 0 ? null : typeMappingMode;
        this(z2, z3, z4, z5, z6, typeMappingMode, (i2 & 64) != 0 ? true : z7, (i2 & 128) != 0 ? typeMappingMode : typeMappingMode2, (i2 & 256) != 0 ? typeMappingMode : typeMappingMode3, (i2 & 512) != 0 ? false : z9);
    }
}
